package com.baidu.mapapi.map;

import android.graphics.Color;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class TitleOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private int f6396a;

    /* renamed from: d, reason: collision with root package name */
    private float f6399d;

    /* renamed from: e, reason: collision with root package name */
    private String f6400e;

    /* renamed from: f, reason: collision with root package name */
    private int f6401f;

    /* renamed from: g, reason: collision with root package name */
    private int f6402g;

    /* renamed from: b, reason: collision with root package name */
    private int f6397b = -16777216;

    /* renamed from: c, reason: collision with root package name */
    private int f6398c = 48;

    /* renamed from: h, reason: collision with root package name */
    private float f6403h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    private float f6404i = 1.0f;

    Bundle a() {
        Bundle bundle = new Bundle();
        int i8 = this.f6397b;
        int i9 = (i8 >> 8) & 255;
        bundle.putInt("font_color", Color.argb(i8 >>> 24, i8 & 255, i9, (i8 >> 16) & 255));
        int i10 = this.f6396a;
        int i11 = (i10 >> 8) & 255;
        bundle.putInt("bg_color", Color.argb(i10 >>> 24, i10 & 255, i11, (i10 >> 16) & 255));
        bundle.putInt("font_size", this.f6398c);
        bundle.putFloat("align_x", this.f6403h);
        bundle.putFloat("align_y", this.f6404i);
        bundle.putFloat("title_rotate", this.f6399d);
        bundle.putInt("title_x_offset", this.f6402g);
        bundle.putInt("title_y_offset", this.f6401f);
        bundle.putString("text", this.f6400e);
        return bundle;
    }

    public String getText() {
        return this.f6400e;
    }

    public float getTitleAnchorX() {
        return this.f6403h;
    }

    public float getTitleAnchorY() {
        return this.f6404i;
    }

    public int getTitleBgColor() {
        return this.f6396a;
    }

    public int getTitleFontColor() {
        return this.f6397b;
    }

    public int getTitleFontSize() {
        return this.f6398c;
    }

    public float getTitleRotate() {
        return this.f6399d;
    }

    public int getTitleXOffset() {
        return this.f6402g;
    }

    public int getTitleYOffset() {
        return this.f6401f;
    }

    public TitleOptions text(String str) {
        this.f6400e = str;
        return this;
    }

    public TitleOptions titleAnchor(float f8, float f9) {
        this.f6403h = f8;
        this.f6404i = f9;
        return this;
    }

    public TitleOptions titleBgColor(int i8) {
        this.f6396a = i8;
        return this;
    }

    public TitleOptions titleFontColor(int i8) {
        this.f6397b = i8;
        return this;
    }

    public TitleOptions titleFontSize(int i8) {
        this.f6398c = i8;
        return this;
    }

    public TitleOptions titleOffset(int i8, int i9) {
        this.f6402g = i8;
        this.f6401f = i9;
        return this;
    }

    public TitleOptions titleRotate(float f8) {
        while (f8 < 0.0f) {
            f8 += 360.0f;
        }
        this.f6399d = f8 % 360.0f;
        return this;
    }
}
