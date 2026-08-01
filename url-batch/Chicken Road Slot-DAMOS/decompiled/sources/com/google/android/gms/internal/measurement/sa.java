package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class sa {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReference f2783k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    public static volatile sa f2784l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final a8.m f2785m = z4.w.D(h1.f2359t);

    /* renamed from: a, reason: collision with root package name */
    public final a1.n f2786a = new a1.n(11);

    /* renamed from: b, reason: collision with root package name */
    public final Context f2787b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.m f2788c;

    /* renamed from: d, reason: collision with root package name */
    public final a8.m f2789d;

    /* renamed from: e, reason: collision with root package name */
    public final a8.m f2790e;

    /* renamed from: f, reason: collision with root package name */
    public final a8.m f2791f;
    public final rd g;

    /* renamed from: h, reason: collision with root package name */
    public final a8.m f2792h;

    /* renamed from: i, reason: collision with root package name */
    public final fd f2793i;

    public sa(Context context, a8.m mVar, a8.m mVar2, a8.m mVar3, a8.m mVar4, a8.m mVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        mVar.getClass();
        mVar2.getClass();
        mVar3.getClass();
        mVar4.getClass();
        mVar5.getClass();
        a8.m D = z4.w.D(mVar);
        a8.m D2 = z4.w.D(mVar2);
        a8.m D3 = z4.w.D(new va(mVar3, 0));
        a8.m D4 = z4.w.D(mVar4);
        a8.m D5 = z4.w.D(mVar5);
        this.f2787b = applicationContext;
        this.f2788c = D;
        this.f2789d = D2;
        this.f2790e = D3;
        this.f2791f = D4;
        this.g = new rd(applicationContext, D, D4, D2);
        this.f2792h = D5;
        this.f2793i = new fd(applicationContext, D, D3, D2);
    }

    public static void b() {
        synchronized (ia.f2399c) {
        }
        if (f2783k.get() == null && ia.f2400d == null) {
            ia.f2400d = new b1.j(5);
        }
    }

    public final f8.u0 a() {
        return (f8.u0) this.f2788c.get();
    }
}
