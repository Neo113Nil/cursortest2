package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3178f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30563a;

    /* renamed from: b, reason: collision with root package name */
    public final C3069d0 f30564b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f30565c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30566d;

    /* renamed from: e, reason: collision with root package name */
    public final P f30567e;

    /* renamed from: f, reason: collision with root package name */
    public final T2 f30568f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f30569g;

    /* renamed from: h, reason: collision with root package name */
    public final long f30570h;
    public final C3393j0 i;

    /* renamed from: j, reason: collision with root package name */
    public F3.q f30571j = new F3.q();

    /* renamed from: k, reason: collision with root package name */
    public C3709ot f30572k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f30573l;

    /* renamed from: m, reason: collision with root package name */
    public int f30574m;

    /* renamed from: n, reason: collision with root package name */
    public int f30575n;

    /* renamed from: o, reason: collision with root package name */
    public long f30576o;

    /* renamed from: p, reason: collision with root package name */
    public int f30577p;

    public C3178f0(C2905a0 c2905a0) {
        this.f30563a = c2905a0.f29145a;
        C3069d0 c3069d0 = c2905a0.f29147c;
        c3069d0.getClass();
        this.f30564b = c3069d0;
        this.f30565c = new SparseArray();
        SB sb = UB.f27942u;
        C3675oC c3675oC = C3675oC.f33115x;
        this.f30566d = c2905a0.f29148d;
        T2 t22 = c2905a0.f29149e;
        this.f30568f = t22;
        this.f30570h = -c2905a0.f29151g;
        C3393j0 c3393j0 = c2905a0.f29152h;
        this.i = c3393j0;
        this.f30567e = new P(c2905a0.f29146b, c3393j0, t22);
        this.f30569g = new CopyOnWriteArraySet();
        new TP(new C4065vP());
        this.f30576o = com.anythink.basead.exoplayer.b.f6539b;
        this.f30577p = -1;
        this.f30575n = 0;
    }
}
