package com.anythink.core.common.r;

import com.anythink.core.api.ATAdRequest;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    h f16202a;

    /* renamed from: b, reason: collision with root package name */
    int f16203b;

    /* renamed from: c, reason: collision with root package name */
    boolean f16204c;

    /* renamed from: d, reason: collision with root package name */
    long f16205d;

    /* renamed from: e, reason: collision with root package name */
    d f16206e;

    /* renamed from: f, reason: collision with root package name */
    ATAdRequest f16207f;

    public b(h hVar, int i, ATAdRequest aTAdRequest) {
        this.f16202a = hVar;
        this.f16203b = i;
        this.f16207f = aTAdRequest;
    }

    private boolean c() {
        return this.f16204c;
    }

    private long d() {
        return this.f16205d;
    }

    public final ATAdRequest a() {
        return this.f16207f;
    }

    public final void b() {
        this.f16204c = true;
    }

    public final void a(long j9) {
        this.f16205d = j9;
    }

    public final void a(d dVar) {
        this.f16206e = dVar;
    }
}
