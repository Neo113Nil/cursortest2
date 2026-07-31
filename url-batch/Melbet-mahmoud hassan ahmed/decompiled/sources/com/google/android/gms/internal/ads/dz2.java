package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class dz2 {

    /* renamed from: a, reason: collision with root package name */
    private final l03 f4401a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4402b;

    /* renamed from: c, reason: collision with root package name */
    private final ry2 f4403c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4404d = "Ad overlay";

    public dz2(View view, ry2 ry2Var, String str) {
        this.f4401a = new l03(view);
        this.f4402b = view.getClass().getCanonicalName();
        this.f4403c = ry2Var;
    }

    public final ry2 a() {
        return this.f4403c;
    }

    public final l03 b() {
        return this.f4401a;
    }

    public final String c() {
        return this.f4404d;
    }

    public final String d() {
        return this.f4402b;
    }
}
