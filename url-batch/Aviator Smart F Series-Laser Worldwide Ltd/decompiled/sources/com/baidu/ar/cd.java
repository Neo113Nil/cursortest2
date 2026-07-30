package com.baidu.ar;

import com.baidu.ar.algo.FrameType;
import com.baidu.ar.marker.TrackerStatus;
import com.baidu.ar.marker.model.TranslationPrior;

/* loaded from: classes.dex */
public class cd {

    /* renamed from: a, reason: collision with root package name */
    public int f1962a;

    /* renamed from: b, reason: collision with root package name */
    public int f1963b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f1964c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1965d;

    /* renamed from: e, reason: collision with root package name */
    public double f1966e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1967f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1968g;

    /* renamed from: h, reason: collision with root package name */
    public double[] f1969h;

    /* renamed from: i, reason: collision with root package name */
    public TrackerStatus f1970i;

    /* renamed from: j, reason: collision with root package name */
    public int f1971j = 2;

    /* renamed from: k, reason: collision with root package name */
    public float[] f1972k;

    /* renamed from: l, reason: collision with root package name */
    public FrameType f1973l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f1974m;

    /* renamed from: n, reason: collision with root package name */
    public TranslationPrior f1975n;

    public void a() {
        if (this.f1974m != null) {
            this.f1974m = null;
        }
    }

    public void b(int i8) {
        this.f1971j = i8;
    }

    public FrameType c() {
        return this.f1973l;
    }

    public int d() {
        return this.f1963b;
    }

    public void e(float[] fArr) {
        this.f1968g = fArr;
    }

    public float[] f() {
        return this.f1967f;
    }

    public float[] g() {
        return this.f1964c;
    }

    public double[] h() {
        return this.f1969h;
    }

    public float[] i() {
        return this.f1972k;
    }

    public float[] j() {
        return this.f1968g;
    }

    public int k() {
        return this.f1971j;
    }

    public double l() {
        return this.f1966e;
    }

    public TrackerStatus m() {
        return this.f1970i;
    }

    public TranslationPrior n() {
        return this.f1975n;
    }

    public int o() {
        return this.f1962a;
    }

    public void a(double d8) {
        this.f1966e = d8;
    }

    public void b(float[] fArr) {
        this.f1967f = fArr;
    }

    public void c(int i8) {
        this.f1962a = i8;
    }

    public void d(float[] fArr) {
        this.f1972k = fArr;
    }

    public byte[] e() {
        return this.f1974m;
    }

    public void a(int i8) {
        this.f1963b = i8;
    }

    public float[] b() {
        return this.f1965d;
    }

    public void c(float[] fArr) {
        this.f1964c = fArr;
    }

    public void a(FrameType frameType) {
        this.f1973l = frameType;
    }

    public void a(TrackerStatus trackerStatus) {
        this.f1970i = trackerStatus;
    }

    public void a(TranslationPrior translationPrior) {
        this.f1975n = translationPrior;
    }

    public void a(byte[] bArr) {
        this.f1974m = bArr;
    }

    public void a(double[] dArr) {
        this.f1969h = dArr;
    }

    public void a(float[] fArr) {
        this.f1965d = fArr;
    }
}
