package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2554cn implements In {

    /* renamed from: a, reason: collision with root package name */
    public final In f38794a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38795b;

    public C2554cn(@NonNull In in, Object obj) {
        this.f38794a = in;
        this.f38795b = obj;
    }

    @Override // io.appmetrica.analytics.impl.In
    public final Object a(Object obj) {
        return obj != this.f38794a.a(obj) ? this.f38795b : obj;
    }
}
