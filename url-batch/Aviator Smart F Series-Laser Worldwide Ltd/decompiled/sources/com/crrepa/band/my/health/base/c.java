package com.crrepa.band.my.health.base;

import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.model.db.BloodPressure;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.Step;

/* loaded from: classes2.dex */
public class c {
    private g2.a bloodOxygenUploadHelper;
    private j2.b bloodPressureUploadHelper;
    private q2.c heartRateUploadHelper;
    private z2.h sleepUploadHelper;
    private b3.d stepsUploadHelper;

    private static class b {
        private static final c INSTANCE = new c();

        private b() {
        }
    }

    public static c getInstance() {
        return b.INSTANCE;
    }

    public void uploadBandBloodOxygen(BloodOxygen bloodOxygen) {
    }

    public void uploadBandBloodPressure(BloodPressure bloodPressure) {
    }

    public void uploadBandHeartRate(int i8) {
    }

    public void uploadBandSleep(Sleep sleep) {
    }

    public void uploadBandSteps(Step step) {
    }

    private c() {
        this.stepsUploadHelper = new b3.d();
        this.sleepUploadHelper = new z2.h();
        this.heartRateUploadHelper = new q2.c();
        this.bloodPressureUploadHelper = new j2.b();
        this.bloodOxygenUploadHelper = new g2.a();
    }
}
