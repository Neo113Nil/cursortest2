package io.appmetrica.analytics.impl;

import android.content.Context;
import c3.C0292d;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0528c5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0476a5 f11574a;

    /* renamed from: b, reason: collision with root package name */
    public final C0502b5 f11575b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f11576c;

    /* renamed from: d, reason: collision with root package name */
    public final Q4 f11577d;

    /* renamed from: e, reason: collision with root package name */
    public final C0837o4 f11578e;

    /* renamed from: f, reason: collision with root package name */
    public final V4 f11579f;

    /* renamed from: g, reason: collision with root package name */
    protected final C0622fm f11580g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0669hh f11581h;

    /* renamed from: i, reason: collision with root package name */
    public final H8 f11582i;

    /* renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f11583j;

    /* renamed from: k, reason: collision with root package name */
    public final Fb f11584k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0945s9 f11585l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11586m;

    public C0528c5(Context context, Q4 q4, C0837o4 c0837o4, V4 v4, C0622fm c0622fm, InterfaceC0669hh interfaceC0669hh, ICommonExecutor iCommonExecutor, int i4, Fb fb, InterfaceC0945s9 interfaceC0945s9) {
        this(context, q4, c0837o4, v4, c0622fm, interfaceC0669hh, iCommonExecutor, new H8(), i4, new C0476a5(c0837o4.f12484a), new C0502b5(context, q4), fb, interfaceC0945s9);
    }

    public static X8 c(X4 x4) {
        return new X8(x4);
    }

    public final M8 a() {
        Context context = this.f11576c;
        Q4 q4 = this.f11577d;
        return new M8(new R8(context, q4), this.f11586m);
    }

    public final L6 b(X4 x4) {
        return new L6(x4, C0817na.f12417I.B().c(this.f11576c, this.f11577d), new H6(x4.c()), new C0607f7());
    }

    public final C0476a5 d() {
        return this.f11574a;
    }

    public final C0502b5 e() {
        return this.f11575b;
    }

    public final C1090xo f() {
        C1090xo c1090xo;
        Bo c0507ba;
        Ao D3 = C0817na.f12417I.D();
        Q4 q4 = this.f11577d;
        synchronized (D3) {
            try {
                String valueOf = String.valueOf(q4);
                LinkedHashMap linkedHashMap = D3.f10064b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    We we = new We(C0817na.f12417I.B().b(D3.f10063a, q4));
                    if (q4.d()) {
                        String str = "appmetrica_vital_" + q4.f10837b + ".dat";
                        c0507ba = new C0631g5(d3.j.W(new C0292d(str, new C0507ba(D3.f10063a, str)), new C0292d("appmetrica_vital_main.dat", new C0507ba(D3.f10063a, "appmetrica_vital_main.dat"))));
                    } else {
                        c0507ba = new C0507ba(D3.f10063a, "appmetrica_vital_" + q4.f10837b + ".dat");
                    }
                    obj = new C1090xo(we, c0507ba, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                c1090xo = (C1090xo) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1090xo;
    }

    public C0528c5(Context context, Q4 q4, C0837o4 c0837o4, V4 v4, C0622fm c0622fm, InterfaceC0669hh interfaceC0669hh, ICommonExecutor iCommonExecutor, H8 h8, int i4, C0476a5 c0476a5, C0502b5 c0502b5, Fb fb, InterfaceC0945s9 interfaceC0945s9) {
        this.f11576c = context;
        this.f11577d = q4;
        this.f11578e = c0837o4;
        this.f11579f = v4;
        this.f11580g = c0622fm;
        this.f11581h = interfaceC0669hh;
        this.f11583j = iCommonExecutor;
        this.f11582i = h8;
        this.f11586m = i4;
        this.f11574a = c0476a5;
        this.f11575b = c0502b5;
        this.f11584k = fb;
        this.f11585l = interfaceC0945s9;
    }

    public final Jk c() {
        return new Jk(this.f11576c, this.f11577d);
    }

    public final C1032vi d(X4 x4) {
        C1032vi c1032vi = new C1032vi(x4, this.f11579f.a(), this.f11583j);
        Fb fb = this.f11584k;
        synchronized (fb) {
            fb.f10277c.add(c1032vi);
        }
        return c1032vi;
    }

    public final Qg a(X4 x4) {
        return new Qg(new C0694ih(x4, this.f11581h, new C3()), this.f11580g, new C0617fh(this.f11578e));
    }

    public static Rk a(X4 x4, C1090xo c1090xo, W4 w4) {
        Qk qk = new Qk(c1090xo);
        return new Rk(x4, qk, w4, new C0662ha(x4, qk, new Uk(x4.h(), C0662ha.f11991g), AbstractC1067x1.a(), new SystemTimeProvider()), new C1120z2(x4, qk, new Uk(x4.h(), C1120z2.f13092g), AbstractC1067x1.a(), new SystemTimeProvider()));
    }

    public static S4 b() {
        return new S4();
    }

    public final C0784m3 b(We we) {
        Context context = this.f11576c;
        return new C0784m3(context, we, context.getPackageName(), new SafePackageManager());
    }

    public final C0738k9 a(We we, C1090xo c1090xo, Rk rk, L6 l6, C0703j0 c0703j0, Jk jk, C1032vi c1032vi) {
        return new C0738k9(we, c1090xo, rk, l6, c0703j0, this.f11582i, jk, this.f11586m, new Z4(c1032vi), new SystemTimeProvider());
    }

    public static C0980ti a(X4 x4, X8 x8) {
        return new C0980ti(x8, x4);
    }

    public InterfaceC0894q9 a(InterfaceC1023v9 interfaceC1023v9, L6 l6, Qg qg, C0837o4 c0837o4, Q4 q4, We we) {
        return this.f11585l.a(interfaceC1023v9, l6, qg, c0837o4, q4, we).a();
    }

    public final C0861p2 a(We we) {
        return new C0861p2(this.f11577d, we);
    }
}
