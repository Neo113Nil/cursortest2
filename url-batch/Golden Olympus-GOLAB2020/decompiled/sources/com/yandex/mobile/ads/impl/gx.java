package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0343x0;
import C2.L;
import com.yandex.mobile.ads.impl.fx;
import com.yandex.mobile.ads.impl.jw;
import com.yandex.mobile.ads.impl.wv;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class gx {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f26344h = {null, null, null, null, new C0307f(jw.a.f27874a), new C0307f(wv.a.f34190a), new C0307f(fx.a.f25939a)};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f26345a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f26346b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f26347c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f26348d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final List<jw> f26349e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final List<wv> f26350f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<fx> f26351g;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f26352a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f26353b;

        static {
            a aVar = new a();
            f26352a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", aVar, 7);
            c0343x0.l("page_id", true);
            c0343x0.l("latest_sdk_version", true);
            c0343x0.l("app_ads_txt_url", true);
            c0343x0.l("app_status", true);
            c0343x0.l("alerts", true);
            c0343x0.l("ad_units", true);
            c0343x0.l("mediation_networks", false);
            f26353b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b[] interfaceC3527bArr = gx.f26344h;
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{AbstractC3551a.t(m02), AbstractC3551a.t(m02), AbstractC3551a.t(m02), AbstractC3551a.t(m02), AbstractC3551a.t(interfaceC3527bArr[4]), AbstractC3551a.t(interfaceC3527bArr[5]), interfaceC3527bArr[6]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            List list;
            List list2;
            String str;
            String str2;
            String str3;
            String str4;
            List list3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f26353b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = gx.f26344h;
            int i5 = 3;
            String str5 = null;
            if (b4.v()) {
                C2.M0 m02 = C2.M0.f224a;
                String str6 = (String) b4.B(c0343x0, 0, m02, null);
                String str7 = (String) b4.B(c0343x0, 1, m02, null);
                String str8 = (String) b4.B(c0343x0, 2, m02, null);
                String str9 = (String) b4.B(c0343x0, 3, m02, null);
                List list4 = (List) b4.B(c0343x0, 4, interfaceC3527bArr[4], null);
                List list5 = (List) b4.B(c0343x0, 5, interfaceC3527bArr[5], null);
                list = (List) b4.y(c0343x0, 6, interfaceC3527bArr[6], null);
                str4 = str9;
                list3 = list4;
                str3 = str8;
                i4 = 127;
                list2 = list5;
                str2 = str7;
                str = str6;
            } else {
                boolean z4 = true;
                int i6 = 0;
                List list6 = null;
                List list7 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                List list8 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    switch (t4) {
                        case -1:
                            z4 = false;
                            i5 = 3;
                        case 0:
                            str5 = (String) b4.B(c0343x0, 0, C2.M0.f224a, str5);
                            i6 |= 1;
                            i5 = 3;
                        case 1:
                            str10 = (String) b4.B(c0343x0, 1, C2.M0.f224a, str10);
                            i6 |= 2;
                            i5 = 3;
                        case 2:
                            str11 = (String) b4.B(c0343x0, 2, C2.M0.f224a, str11);
                            i6 |= 4;
                            i5 = 3;
                        case 3:
                            str12 = (String) b4.B(c0343x0, i5, C2.M0.f224a, str12);
                            i6 |= 8;
                        case 4:
                            list8 = (List) b4.B(c0343x0, 4, interfaceC3527bArr[4], list8);
                            i6 |= 16;
                        case 5:
                            list7 = (List) b4.B(c0343x0, 5, interfaceC3527bArr[5], list7);
                            i6 |= 32;
                        case 6:
                            list6 = (List) b4.y(c0343x0, 6, interfaceC3527bArr[6], list6);
                            i6 |= 64;
                        default:
                            throw new y2.o(t4);
                    }
                }
                i4 = i6;
                list = list6;
                list2 = list7;
                str = str5;
                str2 = str10;
                str3 = str11;
                str4 = str12;
                list3 = list8;
            }
            b4.c(c0343x0);
            return new gx(i4, str, str2, str3, str4, list3, list2, list);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f26353b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            gx value = (gx) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f26353b;
            B2.d b4 = encoder.b(c0343x0);
            gx.a(value, b4, c0343x0);
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
            return a.f26352a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ gx(int i4, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i4 & 64)) {
            AbstractC0341w0.a(i4, 64, a.f26352a.getDescriptor());
        }
        if ((i4 & 1) == 0) {
            this.f26345a = null;
        } else {
            this.f26345a = str;
        }
        if ((i4 & 2) == 0) {
            this.f26346b = null;
        } else {
            this.f26346b = str2;
        }
        if ((i4 & 4) == 0) {
            this.f26347c = null;
        } else {
            this.f26347c = str3;
        }
        if ((i4 & 8) == 0) {
            this.f26348d = null;
        } else {
            this.f26348d = str4;
        }
        if ((i4 & 16) == 0) {
            this.f26349e = null;
        } else {
            this.f26349e = list;
        }
        if ((i4 & 32) == 0) {
            this.f26350f = null;
        } else {
            this.f26350f = list2;
        }
        this.f26351g = list3;
    }

    public static final /* synthetic */ void a(gx gxVar, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f26344h;
        if (dVar.r(c0343x0, 0) || gxVar.f26345a != null) {
            dVar.x(c0343x0, 0, C2.M0.f224a, gxVar.f26345a);
        }
        if (dVar.r(c0343x0, 1) || gxVar.f26346b != null) {
            dVar.x(c0343x0, 1, C2.M0.f224a, gxVar.f26346b);
        }
        if (dVar.r(c0343x0, 2) || gxVar.f26347c != null) {
            dVar.x(c0343x0, 2, C2.M0.f224a, gxVar.f26347c);
        }
        if (dVar.r(c0343x0, 3) || gxVar.f26348d != null) {
            dVar.x(c0343x0, 3, C2.M0.f224a, gxVar.f26348d);
        }
        if (dVar.r(c0343x0, 4) || gxVar.f26349e != null) {
            dVar.x(c0343x0, 4, interfaceC3527bArr[4], gxVar.f26349e);
        }
        if (dVar.r(c0343x0, 5) || gxVar.f26350f != null) {
            dVar.x(c0343x0, 5, interfaceC3527bArr[5], gxVar.f26350f);
        }
        dVar.m(c0343x0, 6, interfaceC3527bArr[6], gxVar.f26351g);
    }

    @Nullable
    public final List<wv> b() {
        return this.f26350f;
    }

    @Nullable
    public final List<jw> c() {
        return this.f26349e;
    }

    @Nullable
    public final String d() {
        return this.f26347c;
    }

    @Nullable
    public final String e() {
        return this.f26348d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx)) {
            return false;
        }
        gx gxVar = (gx) obj;
        return Intrinsics.areEqual(this.f26345a, gxVar.f26345a) && Intrinsics.areEqual(this.f26346b, gxVar.f26346b) && Intrinsics.areEqual(this.f26347c, gxVar.f26347c) && Intrinsics.areEqual(this.f26348d, gxVar.f26348d) && Intrinsics.areEqual(this.f26349e, gxVar.f26349e) && Intrinsics.areEqual(this.f26350f, gxVar.f26350f) && Intrinsics.areEqual(this.f26351g, gxVar.f26351g);
    }

    @NotNull
    public final List<fx> f() {
        return this.f26351g;
    }

    @Nullable
    public final String g() {
        return this.f26345a;
    }

    public final int hashCode() {
        String str = this.f26345a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26346b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26347c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26348d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<jw> list = this.f26349e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<wv> list2 = this.f26350f;
        return this.f26351g.hashCode() + ((hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelRemoteData(pageId=" + this.f26345a + ", latestSdkVersion=" + this.f26346b + ", appAdsTxtUrl=" + this.f26347c + ", appStatus=" + this.f26348d + ", alerts=" + this.f26349e + ", adUnits=" + this.f26350f + ", mediationNetworks=" + this.f26351g + ")";
    }
}
