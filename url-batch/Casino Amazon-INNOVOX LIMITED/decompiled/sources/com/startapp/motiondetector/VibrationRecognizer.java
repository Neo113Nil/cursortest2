package com.startapp.motiondetector;

/* loaded from: classes3.dex */
public class VibrationRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double amplitudeSum;
    private final Valuable average;
    private final long decisionMakingIntervalNanos;
    private double frequency;
    private long localMaxTime;
    private double localMaxValue;
    private long localZeroTime;
    private final double minAmplitude;
    private Sample newest;
    private Sample oldest;
    private final SamplePool pool = new SamplePool();
    private long t1;
    private long t2;
    private double v0;
    private double v1;
    private double v2;
    private int zeros;

    public VibrationRecognizer(double d, double d2, Valuable valuable) {
        this.decisionMakingIntervalNanos = (long) (d * 1.0E9d);
        this.minAmplitude = d2;
        this.average = valuable;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample != null) {
                this.oldest = sample.next;
                this.pool.release(sample);
            } else {
                this.newest = null;
                this.v0 = 0.0d;
                this.v1 = 0.0d;
                this.v2 = 0.0d;
                this.t1 = 0L;
                this.t2 = 0L;
                this.localMaxValue = 0.0d;
                this.localMaxTime = 0L;
                this.localZeroTime = 0L;
                this.zeros = 0;
                this.frequency = 0.0d;
                this.amplitude = 0.0d;
                this.amplitudeSum = 0.0d;
                return;
            }
        }
    }

    public void add(long j, double d) {
        this.v0 = this.v1;
        this.v1 = this.v2;
        this.v2 = d;
        this.t1 = this.t2;
        this.t2 = j;
        purgeSamples(j);
        Sample acquire = this.pool.acquire();
        acquire.time = this.t2;
        acquire.timeZero = this.localZeroTime;
        double value = this.average.getValue();
        double d2 = this.v0;
        double d3 = this.v1;
        if (d2 < d3 && d3 > this.v2) {
            double d4 = d3 - value;
            if (d4 > this.minAmplitude) {
                this.localMaxValue = d4;
                this.localMaxTime = this.t1;
            }
        }
        if (d3 > value && value > this.v2 && this.localMaxTime > this.localZeroTime) {
            this.localZeroTime = this.t2;
            acquire.zero = 1;
            acquire.amplitude = this.localMaxValue;
        }
        addSample(acquire);
        Sample sample = this.newest;
        if (sample != null) {
            sample.next = acquire;
        }
        this.newest = acquire;
        if (this.oldest == null) {
            this.oldest = acquire;
        }
        long j2 = this.localZeroTime - this.oldest.timeZero;
        if (j2 > 0) {
            this.frequency = this.zeros / (j2 / 1.0E9d);
        }
        int i = this.zeros;
        if (i > 0) {
            this.amplitude = this.amplitudeSum / i;
        } else {
            this.amplitude = 0.0d;
        }
    }

    private void addSample(Sample sample) {
        this.zeros += sample.zero;
        this.amplitudeSum += sample.amplitude;
    }

    private void removeSample(Sample sample) {
        this.zeros -= sample.zero;
        this.amplitudeSum -= sample.amplitude;
    }

    void purgeSamples(long j) {
        long j2 = j - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample = this.oldest;
            if (sample == null || sample.time >= j2 || this.oldest.next == null || this.oldest.next.time >= j2) {
                return;
            }
            Sample sample2 = this.oldest;
            this.oldest = sample2.next;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    static class Sample {
        double amplitude;
        Sample next;
        long time;
        long timeZero;
        int zero;

        Sample() {
        }

        void reset() {
            this.next = null;
            this.time = 0L;
            this.timeZero = 0L;
            this.zero = 0;
            this.amplitude = 0.0d;
        }
    }

    static class SamplePool {
        private Sample head;

        SamplePool() {
        }

        Sample acquire() {
            Sample sample = this.head;
            if (sample == null) {
                return new Sample();
            }
            this.head = sample.next;
            sample.reset();
            return sample;
        }

        void release(Sample sample) {
            sample.next = this.head;
            this.head = sample;
        }
    }
}
