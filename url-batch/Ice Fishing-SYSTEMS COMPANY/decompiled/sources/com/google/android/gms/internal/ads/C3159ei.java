package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ei, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3159ei {

    /* renamed from: a, reason: collision with root package name */
    public final G1.a f30454a;

    /* renamed from: b, reason: collision with root package name */
    public final C3214fi f30455b;

    /* renamed from: c, reason: collision with root package name */
    public final C3913si f30456c;

    /* renamed from: d, reason: collision with root package name */
    public final C2941ai f30457d;

    /* renamed from: e, reason: collision with root package name */
    public final C4184xj f30458e;

    /* renamed from: f, reason: collision with root package name */
    public final C2877Yh f30459f;

    /* renamed from: g, reason: collision with root package name */
    public final Is f30460g;

    /* renamed from: h, reason: collision with root package name */
    public final C4184xj f30461h;
    public final C4009uN i;

    /* renamed from: j, reason: collision with root package name */
    public final C4009uN f30462j;

    public C3159ei(C3214fi c3214fi, G1.a aVar) {
        this.f30455b = c3214fi;
        this.f30454a = aVar;
        C3115dt c3115dt = new C3115dt(aVar, 0);
        this.f30456c = new C3913si(25, c3115dt);
        C4009uN c4009uN = c3214fi.f30799d;
        C2860Xh c2860Xh = c3214fi.f30805g;
        this.f30457d = new C2941ai(c4009uN, c2860Xh, 8);
        C3115dt c3115dt2 = new C3115dt(aVar, 1);
        C3115dt c3115dt3 = new C3115dt(aVar, 2);
        C3115dt c3115dt4 = new C3115dt(aVar, 3);
        this.f30458e = new C4184xj(c2860Xh, c4009uN, c3115dt2, c3115dt3, c3115dt4, 14);
        this.f30459f = new C2877Yh(c2860Xh, 28);
        C4009uN c4009uN2 = c3214fi.f30766I;
        this.f30460g = new Is(c3115dt, c4009uN2, c4009uN, 3);
        this.f30461h = new C4184xj(c4009uN2, c3115dt4, c3115dt, c4009uN, new C3115dt(aVar, 5), 15);
        this.i = C4009uN.a(new Kt(c3214fi.f30751A, 6));
        C3115dt c3115dt5 = new C3115dt(aVar, 4);
        C4009uN a9 = C4009uN.a(AbstractC2720Pd.f26977B);
        C4009uN a10 = C4009uN.a(AbstractC3035cL.f29678A);
        C4009uN a11 = C4009uN.a(AbstractC2655Lg.f26172G);
        C4009uN a12 = C4009uN.a(AbstractC3217fl.f30863A);
        int i = C4171xN.f35143b;
        LinkedHashMap g9 = YD.g(4);
        Lu lu = Lu.GMS_SIGNALS;
        AbstractC3137eE.d(a9, "provider");
        g9.put(lu, a9);
        Lu lu2 = Lu.BUILD_URL;
        AbstractC3137eE.d(a10, "provider");
        g9.put(lu2, a10);
        Lu lu3 = Lu.HTTP;
        AbstractC3137eE.d(a11, "provider");
        g9.put(lu3, a11);
        Lu lu4 = Lu.PRE_PROCESS;
        AbstractC3137eE.d(a12, "provider");
        g9.put(lu4, a12);
        C4009uN a13 = C4009uN.a(new C2484Bf(c3115dt5, c3214fi.f30805g, new C4171xN(g9), 12));
        int i4 = AN.f23864c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a13);
        this.f30462j = C4009uN.a(new C4247ys(c3214fi.f30799d, new C3861rk(new AN(list, arrayList), 25), 16));
    }
}
