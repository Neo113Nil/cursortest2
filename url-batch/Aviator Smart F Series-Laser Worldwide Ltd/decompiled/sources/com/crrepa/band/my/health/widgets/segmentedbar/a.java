package com.crrepa.band.my.health.widgets.segmentedbar;

/* loaded from: classes2.dex */
public class a {
    private int color;
    private String customText;
    private String descriptionText;
    private float maxValue;
    private float minValue;
    private String topDescriptionText;

    public a(float f8, float f9, String str, int i8) {
        this.minValue = f8;
        this.maxValue = f9;
        this.descriptionText = str;
        this.color = i8;
    }

    public int getColor() {
        return this.color;
    }

    public String getCustomText() {
        return this.customText;
    }

    public String getDescriptionText() {
        return this.descriptionText;
    }

    public float getMaxValue() {
        return this.maxValue;
    }

    public float getMinValue() {
        return this.minValue;
    }

    public String getTopDescriptionText() {
        return this.topDescriptionText;
    }

    public void setColor(int i8) {
        this.color = i8;
    }

    public void setCustomText(String str) {
        this.customText = str;
    }

    public a setDescriptionText(String str) {
        this.descriptionText = str;
        return this;
    }

    public void setMaxValue(float f8) {
        this.maxValue = f8;
    }

    public void setMinValue(float f8) {
        this.minValue = f8;
    }

    public a setTopDescriptionText(String str) {
        this.topDescriptionText = str;
        return this;
    }

    public String toString() {
        return "Segment{descriptionText='" + this.descriptionText + "', color=" + this.color + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + '}';
    }

    public a(String str, String str2, int i8) {
        this.minValue = -1.0f;
        this.maxValue = -1.0f;
        this.customText = str;
        this.descriptionText = str2;
        this.color = i8;
    }

    public a(float f8, float f9, int i8) {
        this.minValue = f8;
        this.maxValue = f9;
        this.color = i8;
    }

    public a(float f8, float f9, String str, String str2, int i8) {
        this.minValue = f8;
        this.maxValue = f9;
        this.customText = str;
        this.descriptionText = str2;
        this.color = i8;
    }
}
