package com.baidu.ar.marker.model;

import java.util.Arrays;

/* loaded from: classes.dex */
public class TranslationPrior {

    /* renamed from: a, reason: collision with root package name */
    public String f2822a;

    /* renamed from: b, reason: collision with root package name */
    public int f2823b;

    /* renamed from: c, reason: collision with root package name */
    public String f2824c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2825d;

    /* renamed from: e, reason: collision with root package name */
    public float f2826e;

    /* renamed from: f, reason: collision with root package name */
    public float f2827f;

    /* renamed from: g, reason: collision with root package name */
    public long f2828g;

    public TranslationPrior() {
        this.f2826e = 1.0f;
        this.f2827f = 1.0f;
    }

    public String getBuildingId() {
        return this.f2824c;
    }

    public float getConfidence() {
        return this.f2827f;
    }

    public float[] getCoordinate() {
        return this.f2825d;
    }

    public String getFloorID() {
        return this.f2822a;
    }

    public float getPrecision() {
        return this.f2826e;
    }

    public long getTime() {
        return this.f2828g;
    }

    public int getType() {
        return this.f2823b;
    }

    public void setBuildingId(String str) {
        this.f2824c = str;
    }

    public void setConfidence(float f8) {
        this.f2827f = f8;
    }

    public void setCoordinate(float[] fArr) {
        this.f2825d = fArr;
    }

    public void setFloorID(String str) {
        this.f2822a = str;
    }

    public void setPrecision(float f8) {
        this.f2826e = f8;
    }

    public void setTime(long j8) {
        this.f2828g = j8;
    }

    public void setType(int i8) {
        this.f2823b = i8;
    }

    public String toString() {
        return "TranslationPrior{type=" + this.f2823b + ", floor_id='" + this.f2822a + "', building_id='" + this.f2824c + "', prior=" + Arrays.toString(this.f2825d) + ", prior_accuracy=" + this.f2826e + ", prior_confidence=" + this.f2827f + '}';
    }

    public TranslationPrior(TranslationPrior translationPrior) {
        this.f2826e = 1.0f;
        this.f2827f = 1.0f;
        if (translationPrior == null) {
            return;
        }
        this.f2822a = translationPrior.getFloorID();
        this.f2823b = translationPrior.getType();
        this.f2824c = translationPrior.getBuildingId();
        this.f2825d = Arrays.copyOf(translationPrior.getCoordinate(), translationPrior.getCoordinate().length);
        this.f2826e = translationPrior.getPrecision();
        this.f2827f = translationPrior.getConfidence();
        this.f2828g = translationPrior.getTime();
    }
}
