package io.appmetrica.analytics.impl;

import android.content.Context;
import b2.C0190d;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0586j5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0535h5 f7610a;

    /* renamed from: b, reason: collision with root package name */
    public final C0561i5 f7611b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f7612c;

    /* renamed from: d, reason: collision with root package name */
    public final X4 f7613d;

    /* renamed from: e, reason: collision with root package name */
    public final C0896v4 f7614e;
    public final AbstractC0406c5 f;

    /* renamed from: g, reason: collision with root package name */
    protected final C0603jm f7615g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0676mh f7616h;

    /* renamed from: i, reason: collision with root package name */
    public final M8 f7617i;

    /* renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f7618j;

    /* renamed from: k, reason: collision with root package name */
    public final Mb f7619k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1003z9 f7620l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7621m;

    public C0586j5(Context context, X4 x4, C0896v4 c0896v4, AbstractC0406c5 abstractC0406c5, C0603jm c0603jm, InterfaceC0676mh interfaceC0676mh, ICommonExecutor iCommonExecutor, int i3, Mb mb, InterfaceC1003z9 interfaceC1003z9) {
        this(context, x4, c0896v4, abstractC0406c5, c0603jm, interfaceC0676mh, iCommonExecutor, new M8(), i3, new C0535h5(c0896v4.f8477a), new C0561i5(context, x4), mb, interfaceC1003z9);
    }

    public static C0461e9 c(C0457e5 c0457e5) {
        return new C0461e9(c0457e5);
    }

    public final R8 a() {
        Context context = this.f7612c;
        X4 x4 = this.f7613d;
        return new R8(new W8(context, x4), this.f7621m);
    }

    public final S6 b(C0457e5 c0457e5) {
        return new S6(c0457e5, C0511g7.a(this.f7612c).c(this.f7613d), new O6(c0457e5.c()), new C0692n7());
    }

    public final C0535h5 d() {
        return this.f7610a;
    }

    public final C0561i5 e() {
        return this.f7611b;
    }

    public final zo f() {
        zo zoVar;
        Do c0566ia;
        Co D3 = C0876ua.f8420H.D();
        X4 x4 = this.f7613d;
        synchronized (D3) {
            try {
                String valueOf = String.valueOf(x4);
                LinkedHashMap linkedHashMap = D3.f5869b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    C0390bf c0390bf = new C0390bf(C0511g7.a(D3.f5868a).b(x4));
                    if (x4.d()) {
                        String str = "appmetrica_vital_" + x4.f6861b + ".dat";
                        c0566ia = new C0690n5(c2.f.L(new C0190d(str, new C0566ia(D3.f5868a, str)), new C0190d("appmetrica_vital_main.dat", new C0566ia(D3.f5868a, "appmetrica_vital_main.dat"))));
                    } else {
                        c0566ia = new C0566ia(D3.f5868a, "appmetrica_vital_" + x4.f6861b + ".dat");
                    }
                    obj = new zo(c0390bf, c0566ia, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                zoVar = (zo) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zoVar;
    }

    public C0586j5(Context context, X4 x4, C0896v4 c0896v4, AbstractC0406c5 abstractC0406c5, C0603jm c0603jm, InterfaceC0676mh interfaceC0676mh, ICommonExecutor iCommonExecutor, M8 m8, int i3, C0535h5 c0535h5, C0561i5 c0561i5, Mb mb, InterfaceC1003z9 interfaceC1003z9) {
        this.f7612c = context;
        this.f7613d = x4;
        this.f7614e = c0896v4;
        this.f = abstractC0406c5;
        this.f7615g = c0603jm;
        this.f7616h = interfaceC0676mh;
        this.f7618j = iCommonExecutor;
        this.f7617i = m8;
        this.f7621m = i3;
        this.f7610a = c0535h5;
        this.f7611b = c0561i5;
        this.f7619k = mb;
        this.f7620l = interfaceC1003z9;
    }

    public final Ok c() {
        return new Ok(this.f7612c, this.f7613d);
    }

    public final Ai d(C0457e5 c0457e5) {
        Ai ai = new Ai(c0457e5, this.f.a(), this.f7618j);
        Mb mb = this.f7619k;
        synchronized (mb) {
            mb.f6330c.add(ai);
        }
        return ai;
    }

    public final Vg a(C0457e5 c0457e5) {
        return new Vg(new C0702nh(c0457e5, this.f7616h, new K3()), this.f7615g, new C0624kh(this.f7614e));
    }

    public static Wk a(C0457e5 c0457e5, zo zoVar, C0432d5 c0432d5) {
        Vk vk = new Vk(zoVar);
        return new Wk(c0457e5, vk, c0432d5, new C0721oa(c0457e5, vk, new Zk(c0457e5.h(), C0721oa.f7999g), AbstractC0919w1.a(), new SystemTimeProvider()), new H2(c0457e5, vk, new Zk(c0457e5.h(), H2.f6060g), AbstractC0919w1.a(), new SystemTimeProvider()));
    }

    public static Z4 b() {
        return new Z4();
    }

    public final C0869u3 b(C0390bf c0390bf) {
        Context context = this.f7612c;
        return new C0869u3(context, c0390bf, context.getPackageName(), new SafePackageManager());
    }

    public final C0797r9 a(C0390bf c0390bf, zo zoVar, Wk wk, S6 s6, C0581j0 c0581j0, Ok ok, Ai ai) {
        return new C0797r9(c0390bf, zoVar, wk, s6, c0581j0, this.f7617i, ok, this.f7621m, new C0509g5(ai), new Y8(zoVar, new Z8(zoVar)), new SystemTimeProvider());
    }

    public static C0987yi a(C0457e5 c0457e5, C0461e9 c0461e9) {
        return new C0987yi(c0461e9, c0457e5);
    }

    public InterfaceC0953x9 a(C9 c9, S6 s6, Vg vg, C0896v4 c0896v4, X4 x4, C0390bf c0390bf) {
        return this.f7620l.a(c9, s6, vg, c0896v4, x4, c0390bf).a();
    }

    public final C0946x2 a(C0390bf c0390bf) {
        return new C0946x2(this.f7613d, c0390bf);
    }
}
