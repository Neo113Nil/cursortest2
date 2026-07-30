package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;

/* loaded from: classes.dex */
public class DocumentData {
    public float baselineShift;

    @ColorInt
    public int color;
    public String fontName;
    public Justification justification;
    public float lineHeight;
    public float size;

    @ColorInt
    public int strokeColor;
    public boolean strokeOverFill;
    public float strokeWidth;
    public String text;
    public int tracking;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f8, Justification justification, int i8, float f9, float f10, @ColorInt int i9, @ColorInt int i10, float f11, boolean z7) {
        set(str, str2, f8, justification, i8, f9, f10, i9, i10, f11, z7);
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.text.hashCode() * 31) + this.fontName.hashCode()) * 31) + this.size)) * 31) + this.justification.ordinal()) * 31) + this.tracking;
        long floatToRawIntBits = Float.floatToRawIntBits(this.lineHeight);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.color;
    }

    public void set(String str, String str2, float f8, Justification justification, int i8, float f9, float f10, @ColorInt int i9, @ColorInt int i10, float f11, boolean z7) {
        this.text = str;
        this.fontName = str2;
        this.size = f8;
        this.justification = justification;
        this.tracking = i8;
        this.lineHeight = f9;
        this.baselineShift = f10;
        this.color = i9;
        this.strokeColor = i10;
        this.strokeWidth = f11;
        this.strokeOverFill = z7;
    }

    public DocumentData() {
    }
}
