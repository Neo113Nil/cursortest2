package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0343x0;
import C2.L;
import com.appsflyer.AdRevenueScheme;
import com.yandex.mobile.ads.impl.aw;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class wv {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34186a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34187b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f34188c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final aw f34189d;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f34190a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f34191b;

        static {
            a aVar = new a();
            f34190a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", aVar, 4);
            c0343x0.l("name", false);
            c0343x0.l(AdRevenueScheme.AD_TYPE, false);
            c0343x0.l("ad_unit_id", false);
            c0343x0.l("mediation", true);
            f34191b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b t4 = AbstractC3551a.t(aw.a.f23495a);
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{m02, m02, m02, t4};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            String str2;
            String str3;
            aw awVar;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f34191b;
            B2.c b4 = decoder.b(c0343x0);
            String str4 = null;
            if (b4.v()) {
                String h4 = b4.h(c0343x0, 0);
                String h5 = b4.h(c0343x0, 1);
                String h6 = b4.h(c0343x0, 2);
                str = h4;
                awVar = (aw) b4.B(c0343x0, 3, aw.a.f23495a, null);
                str3 = h6;
                str2 = h5;
                i4 = 15;
            } else {
                boolean z4 = true;
                int i5 = 0;
                String str5 = null;
                String str6 = null;
                aw awVar2 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        str4 = b4.h(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        str5 = b4.h(c0343x0, 1);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        str6 = b4.h(c0343x0, 2);
                        i5 |= 4;
                    } else {
                        if (t4 != 3) {
                            throw new y2.o(t4);
                        }
                        awVar2 = (aw) b4.B(c0343x0, 3, aw.a.f23495a, awVar2);
                        i5 |= 8;
                    }
                }
                i4 = i5;
                str = str4;
                str2 = str5;
                str3 = str6;
                awVar = awVar2;
            }
            b4.c(c0343x0);
            return new wv(i4, str, str2, str3, awVar);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f34191b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            wv value = (wv) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f34191b;
            B2.d b4 = encoder.b(c0343x0);
            wv.a(value, b4, c0343x0);
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
            return a.f34190a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ wv(int i4, String str, String str2, String str3, aw awVar) {
        if (7 != (i4 & 7)) {
            AbstractC0341w0.a(i4, 7, a.f34190a.getDescriptor());
        }
        this.f34186a = str;
        this.f34187b = str2;
        this.f34188c = str3;
        if ((i4 & 8) == 0) {
            this.f34189d = null;
        } else {
            this.f34189d = awVar;
        }
    }

    @NotNull
    public final String a() {
        return this.f34188c;
    }

    @NotNull
    public final String b() {
        return this.f34187b;
    }

    @Nullable
    public final aw c() {
        return this.f34189d;
    }

    @NotNull
    public final String d() {
        return this.f34186a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv)) {
            return false;
        }
        wv wvVar = (wv) obj;
        return Intrinsics.areEqual(this.f34186a, wvVar.f34186a) && Intrinsics.areEqual(this.f34187b, wvVar.f34187b) && Intrinsics.areEqual(this.f34188c, wvVar.f34188c) && Intrinsics.areEqual(this.f34189d, wvVar.f34189d);
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f34188c, C1842c3.a(this.f34187b, this.f34186a.hashCode() * 31, 31), 31);
        aw awVar = this.f34189d;
        return a4 + (awVar == null ? 0 : awVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnit(name=" + this.f34186a + ", format=" + this.f34187b + ", adUnitId=" + this.f34188c + ", mediation=" + this.f34189d + ")";
    }

    public static final /* synthetic */ void a(wv wvVar, B2.d dVar, C0343x0 c0343x0) {
        dVar.n(c0343x0, 0, wvVar.f34186a);
        dVar.n(c0343x0, 1, wvVar.f34187b);
        dVar.n(c0343x0, 2, wvVar.f34188c);
        if (!dVar.r(c0343x0, 3) && wvVar.f34189d == null) {
            return;
        }
        dVar.x(c0343x0, 3, aw.a.f23495a, wvVar.f34189d);
    }
}
