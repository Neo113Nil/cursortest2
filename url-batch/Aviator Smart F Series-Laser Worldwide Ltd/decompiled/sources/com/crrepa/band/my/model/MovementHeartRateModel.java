package com.crrepa.band.my.model;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class MovementHeartRateModel {
    private Drawable icon;
    private long startTime;
    private int trainingTime;
    private int type;

    public Drawable getIcon() {
        return this.icon;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getTrainingTime() {
        return this.trainingTime;
    }

    public int getType() {
        return this.type;
    }

    public void setIcon(Drawable drawable) {
        this.icon = drawable;
    }

    public void setStartTime(long j8) {
        this.startTime = j8;
    }

    public void setTrainingTime(int i8) {
        this.trainingTime = i8;
    }

    public void setType(int i8) {
        this.type = i8;
    }
}
