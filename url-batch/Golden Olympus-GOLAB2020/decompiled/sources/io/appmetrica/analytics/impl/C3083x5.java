package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3083x5 {

    /* renamed from: a, reason: collision with root package name */
    public final C3031v5 f40136a;

    /* renamed from: b, reason: collision with root package name */
    public final C3057w5 f40137b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    protected final Context f40138c;

    /* renamed from: d, reason: collision with root package name */
    public final C2772l5 f40139d;

    /* renamed from: e, reason: collision with root package name */
    public final J4 f40140e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2902q5 f40141f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    protected final C2633fm f40142g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3017uh f40143h;

    /* renamed from: i, reason: collision with root package name */
    public final C2486a9 f40144i;

    /* renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f40145j;

    /* renamed from: k, reason: collision with root package name */
    public final C2489ac f40146k;

    /* renamed from: l, reason: collision with root package name */
    public final N9 f40147l;

    /* renamed from: m, reason: collision with root package name */
    public final int f40148m;

    public C3083x5(Context context, C2772l5 c2772l5, J4 j4, AbstractC2902q5 abstractC2902q5, C2633fm c2633fm, InterfaceC3017uh interfaceC3017uh, ICommonExecutor iCommonExecutor, int i4, C2489ac c2489ac, N9 n9) {
        this(context, c2772l5, j4, abstractC2902q5, c2633fm, interfaceC3017uh, iCommonExecutor, new C2486a9(), i4, new C3031v5(j4.f37789a), new C3057w5(context, c2772l5), c2489ac, n9);
    }

    public static C2957s9 c(C2953s5 c2953s5) {
        return new C2957s9(c2953s5);
    }

    public final C2620f9 a() {
        Context context = this.f40138c;
        C2772l5 c2772l5 = this.f40139d;
        return new C2620f9(new C2750k9(context, c2772l5), this.f40148m);
    }

    public final C2645g7 b(C2953s5 c2953s5) {
        return new C2645g7(c2953s5, C3007u7.a(this.f40138c).c(this.f40139d), new C2538c7(c2953s5.c()), new B7());
    }

    public final C3031v5 d() {
        return this.f40136a;
    }

    public final C3057w5 e() {
        return this.f40137b;
    }

    public final C3024uo f() {
        C3024uo c3024uo;
        InterfaceC3128yo c3062wa;
        C3102xo B4 = Ia.f37730F.B();
        C2772l5 c2772l5 = this.f40139d;
        synchronized (B4) {
            try {
                String valueOf = String.valueOf(c2772l5);
                LinkedHashMap linkedHashMap = B4.f40239b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    C2756kf c2756kf = new C2756kf(C3007u7.a(B4.f40238a).b(c2772l5));
                    if (c2772l5.d()) {
                        String str = "appmetrica_vital_" + c2772l5.f39375b + ".dat";
                        c3062wa = new B5(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(str, new C3062wa(B4.f40238a, str)), TuplesKt.to("appmetrica_vital_main.dat", new C3062wa(B4.f40238a, "appmetrica_vital_main.dat"))}));
                    } else {
                        c3062wa = new C3062wa(B4.f40238a, "appmetrica_vital_" + c2772l5.f39375b + ".dat");
                    }
                    obj = new C3024uo(c2756kf, c3062wa, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                c3024uo = (C3024uo) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3024uo;
    }

    public C3083x5(Context context, C2772l5 c2772l5, J4 j4, AbstractC2902q5 abstractC2902q5, C2633fm c2633fm, InterfaceC3017uh interfaceC3017uh, ICommonExecutor iCommonExecutor, C2486a9 c2486a9, int i4, C3031v5 c3031v5, C3057w5 c3057w5, C2489ac c2489ac, N9 n9) {
        this.f40138c = context;
        this.f40139d = c2772l5;
        this.f40140e = j4;
        this.f40141f = abstractC2902q5;
        this.f40142g = c2633fm;
        this.f40143h = interfaceC3017uh;
        this.f40145j = iCommonExecutor;
        this.f40144i = c2486a9;
        this.f40148m = i4;
        this.f40136a = c3031v5;
        this.f40137b = c3057w5;
        this.f40146k = c2489ac;
        this.f40147l = n9;
    }

    public final Kk c() {
        return new Kk(this.f40138c, this.f40139d);
    }

    public final Ii d(C2953s5 c2953s5) {
        Ii ii = new Ii(c2953s5, this.f40141f.a(), this.f40145j);
        C2489ac c2489ac = this.f40146k;
        synchronized (c2489ac) {
            c2489ac.f38671c.add(ii);
        }
        return ii;
    }

    public final C2575dh a(C2953s5 c2953s5) {
        return new C2575dh(new C3043vh(c2953s5, this.f40143h, new Y3()), this.f40142g, new C2965sh(this.f40140e));
    }

    public static Sk a(C2953s5 c2953s5, C3024uo c3024uo, C2927r5 c2927r5) {
        Rk rk = new Rk(c3024uo);
        return new Sk(c2953s5, rk, c2927r5, new Ca(c2953s5, rk, new Vk(c2953s5.g(), Ca.f37288g), AbstractC2975t1.a(), new SystemTimeProvider()), new L2(c2953s5, rk, new Vk(c2953s5.g(), L2.f37912g), AbstractC2975t1.a(), new SystemTimeProvider()));
    }

    public static C2824n5 b() {
        return new C2824n5();
    }

    public final F9 a(C2756kf c2756kf, C3024uo c3024uo, Sk sk, C2645g7 c2645g7, C2664h0 c2664h0, Kk kk, Ii ii) {
        return new F9(c2756kf, c3024uo, sk, c2645g7, c2664h0, this.f40144i, kk, this.f40148m, new C3005u5(ii), new C2802m9(c3024uo, new C2828n9(c3024uo)), new SystemTimeProvider());
    }

    public static Gi a(C2953s5 c2953s5, C2957s9 c2957s9) {
        return new Gi(c2957s9, c2953s5);
    }

    public L9 a(Q9 q9, C2645g7 c2645g7, C2575dh c2575dh, J4 j4, C2772l5 c2772l5, C2756kf c2756kf) {
        return this.f40147l.a(q9, c2645g7, c2575dh, j4, c2772l5, c2756kf).a();
    }

    public final I3 a(C2756kf c2756kf) {
        Context context = this.f40138c;
        return new I3(context, c2756kf, context.getPackageName(), new SafePackageManager());
    }
}
