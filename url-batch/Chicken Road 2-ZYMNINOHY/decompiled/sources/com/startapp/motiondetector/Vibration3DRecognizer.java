package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class Vibration3DRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double frequency;

    /* renamed from: x, reason: collision with root package name */
    private final VibrationRecognizer f6061x;

    /* renamed from: y, reason: collision with root package name */
    private final VibrationRecognizer f6062y;
    private final VibrationRecognizer z;

    public Vibration3DRecognizer(VibrationRecognizer vibrationRecognizer, VibrationRecognizer vibrationRecognizer2, VibrationRecognizer vibrationRecognizer3) {
        this.f6061x = vibrationRecognizer;
        this.f6062y = vibrationRecognizer2;
        this.z = vibrationRecognizer3;
    }

    public void add(long j4, double d4, double d5, double d6) {
        this.f6061x.add(j4, d4);
        this.f6062y.add(j4, d5);
        this.z.add(j4, d6);
        double amplitude = this.f6061x.getAmplitude();
        double amplitude2 = this.f6062y.getAmplitude();
        double amplitude3 = this.z.getAmplitude();
        double d7 = amplitude + amplitude2 + amplitude3;
        if (d7 <= 0.0d) {
            this.frequency = 0.0d;
            this.amplitude = 0.0d;
            return;
        }
        this.frequency = ((this.f6061x.getFrequency() * amplitude) / d7) + ((this.f6062y.getFrequency() * amplitude2) / d7) + ((this.z.getFrequency() * amplitude3) / d7);
        this.amplitude = d7 / 3.0d;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f6061x.reset();
        this.f6062y.reset();
        this.z.reset();
        this.frequency = 0.0d;
        this.amplitude = 0.0d;
    }
}
