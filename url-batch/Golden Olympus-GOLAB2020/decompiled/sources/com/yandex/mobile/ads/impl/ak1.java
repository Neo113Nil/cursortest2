package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0343x0;
import C2.L;
import com.yandex.mobile.ads.impl.fk1;
import com.yandex.mobile.ads.impl.mk1;
import com.yandex.mobile.ads.impl.ok1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class ak1 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23342a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final fk1 f23343b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final ok1 f23344c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mk1 f23345d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f23346e;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f23347a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f23348b;

        static {
            a aVar = new a();
            f23347a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", aVar, 5);
            c0343x0.l(com.ironsource.ge.f16389B1, false);
            c0343x0.l("network_winner", false);
            c0343x0.l("revenue", false);
            c0343x0.l("result", false);
            c0343x0.l("network_ad_info", false);
            f23348b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{m02, AbstractC3551a.t(fk1.a.f25829a), AbstractC3551a.t(ok1.a.f30073a), mk1.a.f29138a, AbstractC3551a.t(m02)};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            fk1 fk1Var;
            ok1 ok1Var;
            mk1 mk1Var;
            String str2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f23348b;
            B2.c b4 = decoder.b(c0343x0);
            String str3 = null;
            if (b4.v()) {
                String h4 = b4.h(c0343x0, 0);
                fk1 fk1Var2 = (fk1) b4.B(c0343x0, 1, fk1.a.f25829a, null);
                ok1 ok1Var2 = (ok1) b4.B(c0343x0, 2, ok1.a.f30073a, null);
                str = h4;
                mk1Var = (mk1) b4.y(c0343x0, 3, mk1.a.f29138a, null);
                str2 = (String) b4.B(c0343x0, 4, C2.M0.f224a, null);
                ok1Var = ok1Var2;
                fk1Var = fk1Var2;
                i4 = 31;
            } else {
                boolean z4 = true;
                int i5 = 0;
                fk1 fk1Var3 = null;
                ok1 ok1Var3 = null;
                mk1 mk1Var2 = null;
                String str4 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        str3 = b4.h(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        fk1Var3 = (fk1) b4.B(c0343x0, 1, fk1.a.f25829a, fk1Var3);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        ok1Var3 = (ok1) b4.B(c0343x0, 2, ok1.a.f30073a, ok1Var3);
                        i5 |= 4;
                    } else if (t4 == 3) {
                        mk1Var2 = (mk1) b4.y(c0343x0, 3, mk1.a.f29138a, mk1Var2);
                        i5 |= 8;
                    } else {
                        if (t4 != 4) {
                            throw new y2.o(t4);
                        }
                        str4 = (String) b4.B(c0343x0, 4, C2.M0.f224a, str4);
                        i5 |= 16;
                    }
                }
                i4 = i5;
                str = str3;
                fk1Var = fk1Var3;
                ok1Var = ok1Var3;
                mk1Var = mk1Var2;
                str2 = str4;
            }
            b4.c(c0343x0);
            return new ak1(i4, str, fk1Var, ok1Var, mk1Var, str2);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f23348b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            ak1 value = (ak1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f23348b;
            B2.d b4 = encoder.b(c0343x0);
            ak1.a(value, b4, c0343x0);
            b4.c(c0343x0);
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] typeParametersSerializers() {
            return L.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return a.f23347a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ ak1(int i4, String str, fk1 fk1Var, ok1 ok1Var, mk1 mk1Var, String str2) {
        if (31 != (i4 & 31)) {
            AbstractC0341w0.a(i4, 31, a.f23347a.getDescriptor());
        }
        this.f23342a = str;
        this.f23343b = fk1Var;
        this.f23344c = ok1Var;
        this.f23345d = mk1Var;
        this.f23346e = str2;
    }

    @NotNull
    public final String a() {
        return this.f23342a;
    }

    @Nullable
    public final fk1 b() {
        return this.f23343b;
    }

    @NotNull
    public final mk1 c() {
        return this.f23345d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        return Intrinsics.areEqual(this.f23342a, ak1Var.f23342a) && Intrinsics.areEqual(this.f23343b, ak1Var.f23343b) && Intrinsics.areEqual(this.f23344c, ak1Var.f23344c) && Intrinsics.areEqual(this.f23345d, ak1Var.f23345d) && Intrinsics.areEqual(this.f23346e, ak1Var.f23346e);
    }

    public final int hashCode() {
        int hashCode = this.f23342a.hashCode() * 31;
        fk1 fk1Var = this.f23343b;
        int hashCode2 = (hashCode + (fk1Var == null ? 0 : fk1Var.hashCode())) * 31;
        ok1 ok1Var = this.f23344c;
        int hashCode3 = (this.f23345d.hashCode() + ((hashCode2 + (ok1Var == null ? 0 : ok1Var.hashCode())) * 31)) * 31;
        String str = this.f23346e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PrefetchedMediationInfo(adapter=" + this.f23342a + ", networkWinner=" + this.f23343b + ", revenue=" + this.f23344c + ", result=" + this.f23345d + ", networkAdInfo=" + this.f23346e + ")";
    }

    public ak1(@NotNull String adapter, @Nullable fk1 fk1Var, @Nullable ok1 ok1Var, @NotNull mk1 result, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f23342a = adapter;
        this.f23343b = fk1Var;
        this.f23344c = ok1Var;
        this.f23345d = result;
        this.f23346e = str;
    }

    public static final /* synthetic */ void a(ak1 ak1Var, B2.d dVar, C0343x0 c0343x0) {
        dVar.n(c0343x0, 0, ak1Var.f23342a);
        dVar.x(c0343x0, 1, fk1.a.f25829a, ak1Var.f23343b);
        dVar.x(c0343x0, 2, ok1.a.f30073a, ak1Var.f23344c);
        dVar.m(c0343x0, 3, mk1.a.f29138a, ak1Var.f23345d);
        dVar.x(c0343x0, 4, C2.M0.f224a, ak1Var.f23346e);
    }
}
