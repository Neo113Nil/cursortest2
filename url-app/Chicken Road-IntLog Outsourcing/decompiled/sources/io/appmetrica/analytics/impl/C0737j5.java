package io.appmetrica.analytics.impl;

import android.content.Context;
import f4.C0430g;
import g4.AbstractC0466k;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0737j5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0686h5 f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final C0712i5 f8503b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f8504c;

    /* renamed from: d, reason: collision with root package name */
    public final X4 f8505d;

    /* renamed from: e, reason: collision with root package name */
    public final C1047v4 f8506e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0557c5 f8507f;

    /* renamed from: g, reason: collision with root package name */
    protected final C0754jm f8508g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0827mh f8509h;

    /* renamed from: i, reason: collision with root package name */
    public final M8 f8510i;

    /* renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f8511j;

    /* renamed from: k, reason: collision with root package name */
    public final Mb f8512k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1154z9 f8513l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8514m;

    public C0737j5(Context context, X4 x42, C1047v4 c1047v4, AbstractC0557c5 abstractC0557c5, C0754jm c0754jm, InterfaceC0827mh interfaceC0827mh, ICommonExecutor iCommonExecutor, int i2, Mb mb, InterfaceC1154z9 interfaceC1154z9) {
        this(context, x42, c1047v4, abstractC0557c5, c0754jm, interfaceC0827mh, iCommonExecutor, new M8(), i2, new C0686h5(c1047v4.f9426a), new C0712i5(context, x42), mb, interfaceC1154z9);
    }

    public static C0612e9 c(C0608e5 c0608e5) {
        return new C0612e9(c0608e5);
    }

    public final R8 a() {
        Context context = this.f8504c;
        X4 x42 = this.f8505d;
        return new R8(new W8(context, x42), this.f8514m);
    }

    public final S6 b(C0608e5 c0608e5) {
        return new S6(c0608e5, C0662g7.a(this.f8504c).c(this.f8505d), new O6(c0608e5.c()), new C0843n7());
    }

    public final C0686h5 d() {
        return this.f8502a;
    }

    public final C0712i5 e() {
        return this.f8503b;
    }

    public final zo f() {
        zo zoVar;
        Do c0717ia;
        Co D5 = C1027ua.f9366H.D();
        X4 x42 = this.f8505d;
        synchronized (D5) {
            try {
                String valueOf = String.valueOf(x42);
                LinkedHashMap linkedHashMap = D5.f6653b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    C0541bf c0541bf = new C0541bf(C0662g7.a(D5.f6652a).b(x42));
                    if (x42.d()) {
                        String str = "appmetrica_vital_" + x42.f7698b + ".dat";
                        c0717ia = new C0841n5(AbstractC0466k.A0(new C0430g(str, new C0717ia(D5.f6652a, str)), new C0430g("appmetrica_vital_main.dat", new C0717ia(D5.f6652a, "appmetrica_vital_main.dat"))));
                    } else {
                        c0717ia = new C0717ia(D5.f6652a, "appmetrica_vital_" + x42.f7698b + ".dat");
                    }
                    obj = new zo(c0541bf, c0717ia, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                zoVar = (zo) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zoVar;
    }

    public C0737j5(Context context, X4 x42, C1047v4 c1047v4, AbstractC0557c5 abstractC0557c5, C0754jm c0754jm, InterfaceC0827mh interfaceC0827mh, ICommonExecutor iCommonExecutor, M8 m8, int i2, C0686h5 c0686h5, C0712i5 c0712i5, Mb mb, InterfaceC1154z9 interfaceC1154z9) {
        this.f8504c = context;
        this.f8505d = x42;
        this.f8506e = c1047v4;
        this.f8507f = abstractC0557c5;
        this.f8508g = c0754jm;
        this.f8509h = interfaceC0827mh;
        this.f8511j = iCommonExecutor;
        this.f8510i = m8;
        this.f8514m = i2;
        this.f8502a = c0686h5;
        this.f8503b = c0712i5;
        this.f8512k = mb;
        this.f8513l = interfaceC1154z9;
    }

    public final Ok c() {
        return new Ok(this.f8504c, this.f8505d);
    }

    public final Ai d(C0608e5 c0608e5) {
        Ai ai = new Ai(c0608e5, this.f8507f.a(), this.f8511j);
        Mb mb = this.f8512k;
        synchronized (mb) {
            mb.f7139c.add(ai);
        }
        return ai;
    }

    public final Vg a(C0608e5 c0608e5) {
        return new Vg(new C0853nh(c0608e5, this.f8509h, new K3()), this.f8508g, new C0775kh(this.f8506e));
    }

    public static Wk a(C0608e5 c0608e5, zo zoVar, C0583d5 c0583d5) {
        Vk vk = new Vk(zoVar);
        return new Wk(c0608e5, vk, c0583d5, new C0872oa(c0608e5, vk, new Zk(c0608e5.h(), C0872oa.f8919g), AbstractC1070w1.a(), new SystemTimeProvider()), new H2(c0608e5, vk, new Zk(c0608e5.h(), H2.f6853g), AbstractC1070w1.a(), new SystemTimeProvider()));
    }

    public static Z4 b() {
        return new Z4();
    }

    public final C1020u3 b(C0541bf c0541bf) {
        Context context = this.f8504c;
        return new C1020u3(context, c0541bf, context.getPackageName(), new SafePackageManager());
    }

    public final C0948r9 a(C0541bf c0541bf, zo zoVar, Wk wk, S6 s6, C0732j0 c0732j0, Ok ok, Ai ai) {
        return new C0948r9(c0541bf, zoVar, wk, s6, c0732j0, this.f8510i, ok, this.f8514m, new C0660g5(ai), new Y8(zoVar, new Z8(zoVar)), new SystemTimeProvider());
    }

    public static C1138yi a(C0608e5 c0608e5, C0612e9 c0612e9) {
        return new C1138yi(c0612e9, c0608e5);
    }

    public InterfaceC1104x9 a(C9 c9, S6 s6, Vg vg, C1047v4 c1047v4, X4 x42, C0541bf c0541bf) {
        return this.f8513l.a(c9, s6, vg, c1047v4, x42, c0541bf).a();
    }

    public final C1097x2 a(C0541bf c0541bf) {
        return new C1097x2(this.f8505d, c0541bf);
    }
}
