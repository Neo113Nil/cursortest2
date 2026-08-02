package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class Vibration3DRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double frequency;

    /* renamed from: x, reason: collision with root package name */
    private final VibrationRecognizer f2985x;

    /* renamed from: y, reason: collision with root package name */
    private final VibrationRecognizer f2986y;
    private final VibrationRecognizer z;

    public Vibration3DRecognizer(VibrationRecognizer vibrationRecognizer, VibrationRecognizer vibrationRecognizer2, VibrationRecognizer vibrationRecognizer3) {
        this.f2985x = vibrationRecognizer;
        this.f2986y = vibrationRecognizer2;
        this.z = vibrationRecognizer3;
    }

    public void add(long j3, double d3, double d4, double d5) {
        this.f2985x.add(j3, d3);
        this.f2986y.add(j3, d4);
        this.z.add(j3, d5);
        double amplitude = this.f2985x.getAmplitude();
        double amplitude2 = this.f2986y.getAmplitude();
        double amplitude3 = this.z.getAmplitude();
        double d6 = amplitude + amplitude2 + amplitude3;
        if (d6 <= 0.0d) {
            this.frequency = 0.0d;
            this.amplitude = 0.0d;
            return;
        }
        this.frequency = ((this.f2985x.getFrequency() * amplitude) / d6) + ((this.f2986y.getFrequency() * amplitude2) / d6) + ((this.z.getFrequency() * amplitude3) / d6);
        this.amplitude = d6 / 3.0d;
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
        this.f2985x.reset();
        this.f2986y.reset();
        this.z.reset();
        this.frequency = 0.0d;
        this.amplitude = 0.0d;
    }
}
