package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class w94 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f13776a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    private boolean f13777b;

    public final w94 a(int i7) {
        wu1.f(!this.f13777b);
        this.f13776a.append(i7, true);
        return this;
    }

    public final yb4 b() {
        wu1.f(!this.f13777b);
        this.f13777b = true;
        return new yb4(this.f13776a, null);
    }
}
