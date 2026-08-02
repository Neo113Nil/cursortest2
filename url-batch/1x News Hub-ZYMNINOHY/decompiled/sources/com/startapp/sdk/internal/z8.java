package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class z8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4868a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4869b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4870c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a9 f4871d;

    public z8(a9 a9Var, int i3, String str, String str2) {
        this.f4871d = a9Var;
        this.f4868a = i3;
        this.f4869b = str;
        this.f4870c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f4870c;
        Bitmap b3 = str != null ? k2.b(str) : null;
        ((k8) this.f4871d.f3552b.a()).f4053a.post(new y8(this, b3));
    }
}
