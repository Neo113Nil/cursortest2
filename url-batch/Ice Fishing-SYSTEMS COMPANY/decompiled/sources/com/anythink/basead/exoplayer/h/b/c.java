package com.anythink.basead.exoplayer.h.b;

import com.anythink.basead.exoplayer.j.k;
import com.anythink.basead.exoplayer.j.t;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public abstract class c implements t.c {

    /* renamed from: b, reason: collision with root package name */
    public final k f7683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7684c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final m f7685d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7686e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7687f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7688g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7689h;
    protected final com.anythink.basead.exoplayer.j.h i;

    public c(com.anythink.basead.exoplayer.j.h hVar, k kVar, m mVar, int i, Object obj, long j9, long j10) {
        this.i = (com.anythink.basead.exoplayer.j.h) C0544a.a(hVar);
        this.f7683b = (k) C0544a.a(kVar);
        this.f7685d = mVar;
        this.f7686e = i;
        this.f7687f = obj;
        this.f7688g = j9;
        this.f7689h = j10;
    }

    private long c() {
        return this.f7689h - this.f7688g;
    }

    public abstract long d();
}
