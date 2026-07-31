package com.startapp.motiondetector;

/* loaded from: classes3.dex */
public class TravelRecognizer implements SignalProcessor {
    private final AmortizedMaximum driverInstability;
    private final HighPassFilter3D gravity;
    private long lastTimestampNanos;
    private final HighPassFilter3D linear;
    private final HighPassFilter linearM;
    private final AmortizedMaximum passengerInstability;
    private final RestStateRecognizer restState;
    private long startTimestampNanos;
    private final AmortizedMaximum travel;
    private final VehicleDriverRecognizer vehicleDriver;
    private final VehiclePassengerRecognizer vehiclePassenger;
    private final HighPassFilter vehiclePassengerHpf;
    private final Vibration3DRecognizer vibration;

    public void setTravelProbabilityMaximum(double d, long j) {
        this.travel.setMaximumValue(Math.min(Math.max(0.0d, d), 1.0d));
        this.travel.setMaximumTime(j);
    }

    public TravelRecognizer() {
        this(10.0d, 15.0d, 25.0d, 1000.0d, 1.0d, 0.1d, 100.0d, 1.0d, 3600000.0d, 3.0d, -2.0d, 100.0d, 1.0d, 20000.0d, 0.0d, -4.0d);
    }

    public TravelRecognizer(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        HighPassFilter3D highPassFilter3D = new HighPassFilter3D(new HighPassFilter(d), new HighPassFilter(d), new HighPassFilter(d));
        this.gravity = highPassFilter3D;
        this.linear = new HighPassFilter3D(new HighPassFilter(d2), new HighPassFilter(d2), new HighPassFilter(d2));
        this.linearM = new HighPassFilter(d3);
        this.vibration = new Vibration3DRecognizer(new VibrationRecognizer(d5, d6, highPassFilter3D.getX()), new VibrationRecognizer(d5, d6, highPassFilter3D.getY()), new VibrationRecognizer(d5, d6, highPassFilter3D.getZ()));
        this.vehiclePassenger = new VehiclePassengerRecognizer();
        this.vehiclePassengerHpf = new HighPassFilter(d4);
        this.passengerInstability = new AmortizedMaximum(d12, d13, d14, d15, d16);
        this.vehicleDriver = new VehicleDriverRecognizer();
        this.driverInstability = new AmortizedMaximum(d12, d13, d14, d15, d16);
        this.restState = new RestStateRecognizer(5.0d, false);
        this.travel = new AmortizedMaximum(d7, d8, d9, d10, d11);
    }

    public double getVibrationAmplitude() {
        return this.vibration.getAmplitude();
    }

    public double getVibrationFrequency() {
        return this.vibration.getFrequency();
    }

    public double getLinearAcceleration() {
        return this.linearM.getValue();
    }

    public double getTravelProbability() {
        return this.travel.getValue();
    }

    public double getTravelProbabilityMaximumValue() {
        return this.travel.getMaximumValue();
    }

    public long getTravelProbabilityMaximumTime() {
        return this.travel.getMaximumTime();
    }

    public void add(long j, long j2, double d, double d2, double d3) {
        if (this.lastTimestampNanos >= j2) {
            return;
        }
        if (this.startTimestampNanos <= 0) {
            this.startTimestampNanos = j2;
        }
        double value = this.gravity.getX().getValue();
        double value2 = this.gravity.getY().getValue();
        double value3 = this.gravity.getZ().getValue();
        this.gravity.add(d, d2, d3);
        double smsq = Utils.smsq(this.gravity.getX().getValue() - value, this.gravity.getY().getValue() - value2, this.gravity.getZ().getValue() - value3);
        this.passengerInstability.add(j, Utils.logisticalFunction(smsq, 1.5d, 4.0d));
        double value4 = 1.0d - this.passengerInstability.getValue();
        this.driverInstability.add(j, Utils.logisticalFunction(smsq, 0.01d, 1000.0d));
        this.linear.add(d - this.gravity.getX().getValue(), d2 - this.gravity.getY().getValue(), d3 - this.gravity.getZ().getValue());
        this.linearM.add(this.linear.getValue());
        this.vibration.add(j2, d, d2, d3);
        double logisticalFunction = Utils.logisticalFunction((j2 - this.startTimestampNanos) / 1.0E9d, 10.0d, 1.0d);
        this.vehiclePassenger.add(this.vibration.getFrequency(), this.vibration.getAmplitude(), this.linearM.getValue());
        this.vehiclePassengerHpf.add(value4 * logisticalFunction * this.vehiclePassenger.getValue());
        double value5 = this.vehiclePassengerHpf.getValue();
        this.vehicleDriver.add(this.vibration.getFrequency(), this.vibration.getAmplitude(), this.restState.getAcceleration(), this.restState.getJerk());
        this.travel.add(j, (value5 * this.driverInstability.getValue()) + (logisticalFunction * this.vehicleDriver.getValue() * (1.0d - this.driverInstability.getValue())));
        this.lastTimestampNanos = j2;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.startTimestampNanos = 0L;
        this.lastTimestampNanos = 0L;
        this.gravity.reset();
        this.linear.reset();
        this.linearM.reset();
        this.vibration.reset();
        this.vehiclePassenger.reset();
        this.vehiclePassengerHpf.reset();
        this.travel.reset();
    }
}
