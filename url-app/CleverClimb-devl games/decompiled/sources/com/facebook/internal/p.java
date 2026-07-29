package com.facebook.internal;

import android.graphics.Bitmap;

/* compiled from: ImageResponse.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private o f6175a;

    /* renamed from: b, reason: collision with root package name */
    private Exception f6176b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6177c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f6178d;

    p(o oVar, Exception exc, boolean z, Bitmap bitmap) {
        this.f6175a = oVar;
        this.f6176b = exc;
        this.f6178d = bitmap;
        this.f6177c = z;
    }

    public o a() {
        return this.f6175a;
    }

    public Exception b() {
        return this.f6176b;
    }

    public Bitmap c() {
        return this.f6178d;
    }

    public boolean d() {
        return this.f6177c;
    }
}
