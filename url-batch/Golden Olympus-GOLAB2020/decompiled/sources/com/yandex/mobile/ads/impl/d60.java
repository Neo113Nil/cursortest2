package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Looper;
import com.yandex.mobile.ads.impl.C2088ma;
import com.yandex.mobile.ads.impl.d60;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.dz;
import com.yandex.mobile.ads.impl.h00;
import com.yandex.mobile.ads.impl.nz;
import com.yandex.mobile.ads.impl.qz;

/* loaded from: classes3.dex */
public interface d60 extends zh1 {

    public interface a {
        default void a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Context f24443a;

        /* renamed from: b, reason: collision with root package name */
        n32 f24444b;

        /* renamed from: c, reason: collision with root package name */
        i32<vo1> f24445c;

        /* renamed from: d, reason: collision with root package name */
        i32<dw0.a> f24446d;

        /* renamed from: e, reason: collision with root package name */
        i32<u52> f24447e;

        /* renamed from: f, reason: collision with root package name */
        i32<kr0> f24448f;

        /* renamed from: g, reason: collision with root package name */
        i32<InterfaceC1881di> f24449g;

        /* renamed from: h, reason: collision with root package name */
        ud0<wo, InterfaceC2296vc> f24450h;

        /* renamed from: i, reason: collision with root package name */
        Looper f24451i;

        /* renamed from: j, reason: collision with root package name */
        C1856ch f24452j;

        /* renamed from: k, reason: collision with root package name */
        int f24453k;

        /* renamed from: l, reason: collision with root package name */
        boolean f24454l;

        /* renamed from: m, reason: collision with root package name */
        uw1 f24455m;

        /* renamed from: n, reason: collision with root package name */
        qz f24456n;

        /* renamed from: o, reason: collision with root package name */
        long f24457o;

        /* renamed from: p, reason: collision with root package name */
        long f24458p;

        /* renamed from: q, reason: collision with root package name */
        boolean f24459q;

        /* renamed from: r, reason: collision with root package name */
        boolean f24460r;

        public b(final Context context) {
            this(context, new i32() { // from class: com.yandex.mobile.ads.impl.V0
                @Override // com.yandex.mobile.ads.impl.i32
                public final Object get() {
                    vo1 a4;
                    a4 = d60.b.a(context);
                    return a4;
                }
            }, new i32() { // from class: com.yandex.mobile.ads.impl.W0
                @Override // com.yandex.mobile.ads.impl.i32
                public final Object get() {
                    dw0.a b4;
                    b4 = d60.b.b(context);
                    return b4;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static dw0.a b(Context context) {
            return new vz(new dz.a(context, new nz.a()), new mz());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static u52 c(Context context) {
            return new h00(context, h00.c.a(context), new C2088ma.b(0));
        }

        public final d60 a() {
            if (this.f24460r) {
                throw new IllegalStateException();
            }
            this.f24460r = true;
            return new h60(this);
        }

        private b(final Context context, i32<vo1> i32Var, i32<dw0.a> i32Var2) {
            this(context, i32Var, i32Var2, new i32() { // from class: com.yandex.mobile.ads.impl.R0
                @Override // com.yandex.mobile.ads.impl.i32
                public final Object get() {
                    u52 c4;
                    c4 = d60.b.c(context);
                    return c4;
                }
            }, new i32() { // from class: com.yandex.mobile.ads.impl.S0
                @Override // com.yandex.mobile.ads.impl.i32
                public final Object get() {
                    return new rz();
                }
            }, new i32() { // from class: com.yandex.mobile.ads.impl.T0
                @Override // com.yandex.mobile.ads.impl.i32
                public final Object get() {
                    InterfaceC1881di a4;
                    a4 = yy.a(context);
                    return a4;
                }
            }, new ud0() { // from class: com.yandex.mobile.ads.impl.U0
                @Override // com.yandex.mobile.ads.impl.ud0
                public final Object apply(Object obj) {
                    return new ty((wo) obj);
                }
            });
        }

        private b(Context context, i32<vo1> i32Var, i32<dw0.a> i32Var2, i32<u52> i32Var3, i32<kr0> i32Var4, i32<InterfaceC1881di> i32Var5, ud0<wo, InterfaceC2296vc> ud0Var) {
            this.f24443a = context;
            this.f24445c = i32Var;
            this.f24446d = i32Var2;
            this.f24447e = i32Var3;
            this.f24448f = i32Var4;
            this.f24449g = i32Var5;
            this.f24450h = ud0Var;
            this.f24451i = u82.c();
            this.f24452j = C1856ch.f24207h;
            this.f24453k = 1;
            this.f24454l = true;
            this.f24455m = uw1.f33435c;
            this.f24456n = new qz.a().a();
            this.f24444b = wo.f34156a;
            this.f24457o = 500L;
            this.f24458p = 2000L;
            this.f24459q = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ vo1 a(Context context) {
            return new a00(context);
        }
    }

    void a(am1 am1Var);
}
