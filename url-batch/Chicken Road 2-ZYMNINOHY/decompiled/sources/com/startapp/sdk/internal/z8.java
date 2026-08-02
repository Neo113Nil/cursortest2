package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class z8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f8018a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8019b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a9 f8021d;

    public z8(a9 a9Var, int i4, String str, String str2) {
        this.f8021d = a9Var;
        this.f8018a = i4;
        this.f8019b = str;
        this.f8020c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f8020c;
        Bitmap b4 = str != null ? k2.b(str) : null;
        ((k8) this.f8021d.f6653b.a()).f7181a.post(new y8(this, b4));
    }
}
