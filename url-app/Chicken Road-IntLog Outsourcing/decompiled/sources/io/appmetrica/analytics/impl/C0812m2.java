package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812m2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0848nc f8759a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f8760b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8761c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8762d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f8763e = new B2.b(14, this);

    public C0812m2(C0848nc c0848nc, IHandlerExecutor iHandlerExecutor, long j2) {
        this.f8759a = c0848nc;
        this.f8760b = iHandlerExecutor;
        this.f8761c = j2;
    }

    public static final void a(C0812m2 c0812m2) {
        C0874oc c0874oc = c0812m2.f8759a.f8863a;
        Bi bi = c0874oc.f7306h;
        bi.f6607c.a(c0874oc.f7300b.f7238a);
    }
}
