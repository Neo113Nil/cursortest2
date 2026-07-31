package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class k8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f301a;
    public final String b;
    public final String c;
    public final /* synthetic */ l8 d;

    public k8(l8 l8Var, int i, String str, String str2) {
        this.d = l8Var;
        this.f301a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.c;
        Bitmap b = str != null ? e2.b(str) : null;
        ((v7) this.d.b.a()).f464a.post(new j8(this, b));
    }
}
