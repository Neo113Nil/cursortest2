package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class dz extends IOException {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4399f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4400g;

    protected dz(String str, Throwable th, boolean z6, int i7) {
        super(str, th);
        this.f4399f = z6;
        this.f4400g = i7;
    }

    public static dz a(String str, Throwable th) {
        return new dz(str, th, true, 1);
    }

    public static dz b(String str, Throwable th) {
        return new dz(str, th, true, 0);
    }

    public static dz c(String str) {
        return new dz(str, null, false, 1);
    }
}
