package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0343x0;
import C2.L;
import com.yandex.mobile.ads.impl.ay;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.zx;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class dw {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f24976g = {null, null, new C0307f(cy.a.f24354a), null, null, new C0307f(zx.a.f35813a)};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f24977a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f24978b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<cy> f24979c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f24980d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final ay f24981e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<zx> f24982f;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f24983a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f24984b;

        static {
            a aVar = new a();
            f24983a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", aVar, 6);
            c0343x0.l(com.ironsource.ge.f16389B1, true);
            c0343x0.l("network_name", false);
            c0343x0.l("waterfall_parameters", false);
            c0343x0.l("network_ad_unit_id_name", true);
            c0343x0.l("currency", false);
            c0343x0.l("cpm_floors", false);
            f24984b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b[] interfaceC3527bArr = dw.f24976g;
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{AbstractC3551a.t(m02), m02, interfaceC3527bArr[2], AbstractC3551a.t(m02), AbstractC3551a.t(ay.a.f23513a), interfaceC3527bArr[5]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            String str2;
            List list;
            String str3;
            ay ayVar;
            List list2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f24984b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = dw.f24976g;
            int i5 = 3;
            String str4 = null;
            if (b4.v()) {
                C2.M0 m02 = C2.M0.f224a;
                String str5 = (String) b4.B(c0343x0, 0, m02, null);
                String h4 = b4.h(c0343x0, 1);
                List list3 = (List) b4.y(c0343x0, 2, interfaceC3527bArr[2], null);
                String str6 = (String) b4.B(c0343x0, 3, m02, null);
                ay ayVar2 = (ay) b4.B(c0343x0, 4, ay.a.f23513a, null);
                list2 = (List) b4.y(c0343x0, 5, interfaceC3527bArr[5], null);
                str3 = str6;
                ayVar = ayVar2;
                i4 = 63;
                list = list3;
                str2 = h4;
                str = str5;
            } else {
                boolean z4 = true;
                int i6 = 0;
                String str7 = null;
                List list4 = null;
                String str8 = null;
                ay ayVar3 = null;
                List list5 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    switch (t4) {
                        case -1:
                            z4 = false;
                            i5 = 3;
                        case 0:
                            str4 = (String) b4.B(c0343x0, 0, C2.M0.f224a, str4);
                            i6 |= 1;
                            i5 = 3;
                        case 1:
                            str7 = b4.h(c0343x0, 1);
                            i6 |= 2;
                        case 2:
                            list4 = (List) b4.y(c0343x0, 2, interfaceC3527bArr[2], list4);
                            i6 |= 4;
                        case 3:
                            str8 = (String) b4.B(c0343x0, i5, C2.M0.f224a, str8);
                            i6 |= 8;
                        case 4:
                            ayVar3 = (ay) b4.B(c0343x0, 4, ay.a.f23513a, ayVar3);
                            i6 |= 16;
                        case 5:
                            list5 = (List) b4.y(c0343x0, 5, interfaceC3527bArr[5], list5);
                            i6 |= 32;
                        default:
                            throw new y2.o(t4);
                    }
                }
                i4 = i6;
                str = str4;
                str2 = str7;
                list = list4;
                str3 = str8;
                ayVar = ayVar3;
                list2 = list5;
            }
            b4.c(c0343x0);
            return new dw(i4, str, str2, list, str3, ayVar, list2);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f24984b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            dw value = (dw) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f24984b;
            B2.d b4 = encoder.b(c0343x0);
            dw.a(value, b4, c0343x0);
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
            return a.f24983a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ dw(int i4, String str, String str2, List list, String str3, ay ayVar, List list2) {
        if (54 != (i4 & 54)) {
            AbstractC0341w0.a(i4, 54, a.f24983a.getDescriptor());
        }
        if ((i4 & 1) == 0) {
            this.f24977a = null;
        } else {
            this.f24977a = str;
        }
        this.f24978b = str2;
        this.f24979c = list;
        if ((i4 & 8) == 0) {
            this.f24980d = null;
        } else {
            this.f24980d = str3;
        }
        this.f24981e = ayVar;
        this.f24982f = list2;
    }

    public static final /* synthetic */ void a(dw dwVar, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f24976g;
        if (dVar.r(c0343x0, 0) || dwVar.f24977a != null) {
            dVar.x(c0343x0, 0, C2.M0.f224a, dwVar.f24977a);
        }
        dVar.n(c0343x0, 1, dwVar.f24978b);
        dVar.m(c0343x0, 2, interfaceC3527bArr[2], dwVar.f24979c);
        if (dVar.r(c0343x0, 3) || dwVar.f24980d != null) {
            dVar.x(c0343x0, 3, C2.M0.f224a, dwVar.f24980d);
        }
        dVar.x(c0343x0, 4, ay.a.f23513a, dwVar.f24981e);
        dVar.m(c0343x0, 5, interfaceC3527bArr[5], dwVar.f24982f);
    }

    @NotNull
    public final List<zx> b() {
        return this.f24982f;
    }

    @Nullable
    public final ay c() {
        return this.f24981e;
    }

    @Nullable
    public final String d() {
        return this.f24980d;
    }

    @NotNull
    public final String e() {
        return this.f24978b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return Intrinsics.areEqual(this.f24977a, dwVar.f24977a) && Intrinsics.areEqual(this.f24978b, dwVar.f24978b) && Intrinsics.areEqual(this.f24979c, dwVar.f24979c) && Intrinsics.areEqual(this.f24980d, dwVar.f24980d) && Intrinsics.areEqual(this.f24981e, dwVar.f24981e) && Intrinsics.areEqual(this.f24982f, dwVar.f24982f);
    }

    @NotNull
    public final List<cy> f() {
        return this.f24979c;
    }

    public final int hashCode() {
        String str = this.f24977a;
        int a4 = C2039k9.a(this.f24979c, C1842c3.a(this.f24978b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f24980d;
        int hashCode = (a4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ay ayVar = this.f24981e;
        return this.f24982f.hashCode() + ((hashCode + (ayVar != null ? ayVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnitWaterfallMediation(adapter=" + this.f24977a + ", networkName=" + this.f24978b + ", waterfallParameters=" + this.f24979c + ", networkAdUnitIdName=" + this.f24980d + ", currency=" + this.f24981e + ", cpmFloors=" + this.f24982f + ")";
    }
}
