package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class fz1 extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private final int f5392f;

    public fz1(int i7) {
        this.f5392f = i7;
    }

    public fz1(int i7, String str) {
        super(str);
        this.f5392f = i7;
    }

    public fz1(int i7, String str, Throwable th) {
        super(str, th);
        this.f5392f = 1;
    }

    public final int a() {
        return this.f5392f;
    }
}
