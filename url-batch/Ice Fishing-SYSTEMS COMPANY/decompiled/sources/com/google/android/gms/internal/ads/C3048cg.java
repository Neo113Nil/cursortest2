package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3048cg {

    /* renamed from: a, reason: collision with root package name */
    public C3157eg f29720a;

    /* renamed from: b, reason: collision with root package name */
    public C3165eo f29721b;

    /* renamed from: c, reason: collision with root package name */
    public Context f29722c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f29723d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f29724e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public long f29725f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f29726g = -1;

    public final void a(C3157eg c3157eg, C3165eo c3165eo, Context context) {
        if (this.f29723d.getAndSet(true)) {
            return;
        }
        this.f29720a = c3157eg;
        this.f29721b = c3165eo;
        C3151ea c3151ea = AbstractC3368ia.lf;
        q2.r rVar = q2.r.f40116e;
        this.f29725f = ((Long) rVar.f40119c.a(c3151ea)).longValue();
        this.f29726g = ((Long) rVar.f40119c.a(AbstractC3368ia.mf)).longValue();
        this.f29722c = context;
    }
}
