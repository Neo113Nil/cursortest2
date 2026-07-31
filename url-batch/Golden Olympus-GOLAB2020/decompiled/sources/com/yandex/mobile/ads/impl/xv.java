package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0343x0;
import C2.L;
import com.yandex.mobile.ads.impl.nw;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class xv {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f34678f = {null, null, new C0307f(nw.a.f29769a), null, null};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f34679a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34680b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<nw> f34681c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f34682d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f34683e;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f34684a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f34685b;

        static {
            a aVar = new a();
            f34684a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", aVar, 5);
            c0343x0.l(com.ironsource.ge.f16389B1, true);
            c0343x0.l("network_name", false);
            c0343x0.l("bidding_parameters", false);
            c0343x0.l("network_ad_unit_id", true);
            c0343x0.l("network_ad_unit_id_name", true);
            f34685b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b[] interfaceC3527bArr = xv.f34678f;
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{AbstractC3551a.t(m02), m02, interfaceC3527bArr[2], AbstractC3551a.t(m02), AbstractC3551a.t(m02)};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            String str2;
            List list;
            String str3;
            String str4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f34685b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = xv.f34678f;
            String str5 = null;
            if (b4.v()) {
                C2.M0 m02 = C2.M0.f224a;
                String str6 = (String) b4.B(c0343x0, 0, m02, null);
                String h4 = b4.h(c0343x0, 1);
                List list2 = (List) b4.y(c0343x0, 2, interfaceC3527bArr[2], null);
                String str7 = (String) b4.B(c0343x0, 3, m02, null);
                list = list2;
                str4 = (String) b4.B(c0343x0, 4, m02, null);
                str3 = str7;
                i4 = 31;
                str2 = h4;
                str = str6;
            } else {
                boolean z4 = true;
                int i5 = 0;
                String str8 = null;
                List list3 = null;
                String str9 = null;
                String str10 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        str5 = (String) b4.B(c0343x0, 0, C2.M0.f224a, str5);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        str8 = b4.h(c0343x0, 1);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        list3 = (List) b4.y(c0343x0, 2, interfaceC3527bArr[2], list3);
                        i5 |= 4;
                    } else if (t4 == 3) {
                        str9 = (String) b4.B(c0343x0, 3, C2.M0.f224a, str9);
                        i5 |= 8;
                    } else {
                        if (t4 != 4) {
                            throw new y2.o(t4);
                        }
                        str10 = (String) b4.B(c0343x0, 4, C2.M0.f224a, str10);
                        i5 |= 16;
                    }
                }
                i4 = i5;
                str = str5;
                str2 = str8;
                list = list3;
                str3 = str9;
                str4 = str10;
            }
            b4.c(c0343x0);
            return new xv(i4, str, str2, list, str3, str4);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f34685b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            xv value = (xv) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f34685b;
            B2.d b4 = encoder.b(c0343x0);
            xv.a(value, b4, c0343x0);
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
            return a.f34684a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ xv(int i4, String str, String str2, List list, String str3, String str4) {
        if (6 != (i4 & 6)) {
            AbstractC0341w0.a(i4, 6, a.f34684a.getDescriptor());
        }
        if ((i4 & 1) == 0) {
            this.f34679a = null;
        } else {
            this.f34679a = str;
        }
        this.f34680b = str2;
        this.f34681c = list;
        if ((i4 & 8) == 0) {
            this.f34682d = null;
        } else {
            this.f34682d = str3;
        }
        if ((i4 & 16) == 0) {
            this.f34683e = null;
        } else {
            this.f34683e = str4;
        }
    }

    public static final /* synthetic */ void a(xv xvVar, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f34678f;
        if (dVar.r(c0343x0, 0) || xvVar.f34679a != null) {
            dVar.x(c0343x0, 0, C2.M0.f224a, xvVar.f34679a);
        }
        dVar.n(c0343x0, 1, xvVar.f34680b);
        dVar.m(c0343x0, 2, interfaceC3527bArr[2], xvVar.f34681c);
        if (dVar.r(c0343x0, 3) || xvVar.f34682d != null) {
            dVar.x(c0343x0, 3, C2.M0.f224a, xvVar.f34682d);
        }
        if (!dVar.r(c0343x0, 4) && xvVar.f34683e == null) {
            return;
        }
        dVar.x(c0343x0, 4, C2.M0.f224a, xvVar.f34683e);
    }

    @Nullable
    public final String b() {
        return this.f34682d;
    }

    @NotNull
    public final List<nw> c() {
        return this.f34681c;
    }

    @Nullable
    public final String d() {
        return this.f34683e;
    }

    @NotNull
    public final String e() {
        return this.f34680b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return Intrinsics.areEqual(this.f34679a, xvVar.f34679a) && Intrinsics.areEqual(this.f34680b, xvVar.f34680b) && Intrinsics.areEqual(this.f34681c, xvVar.f34681c) && Intrinsics.areEqual(this.f34682d, xvVar.f34682d) && Intrinsics.areEqual(this.f34683e, xvVar.f34683e);
    }

    public final int hashCode() {
        String str = this.f34679a;
        int a4 = C2039k9.a(this.f34681c, C1842c3.a(this.f34680b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f34682d;
        int hashCode = (a4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34683e;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnitBiddingMediation(adapter=" + this.f34679a + ", networkName=" + this.f34680b + ", biddingParameters=" + this.f34681c + ", adUnitId=" + this.f34682d + ", networkAdUnitIdName=" + this.f34683e + ")";
    }
}
