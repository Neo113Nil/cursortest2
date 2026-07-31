package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0343x0;
import C2.L;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class fx {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f25932g = {null, null, null, null, new C0307f(C2.M0.f224a), null};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f25933a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f25934b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f25935c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f25936d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<String> f25937e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f25938f;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f25939a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f25940b;

        static {
            a aVar = new a();
            f25939a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", aVar, 6);
            c0343x0.l("id", true);
            c0343x0.l("name", false);
            c0343x0.l("logo_url", true);
            c0343x0.l("adapter_status", true);
            c0343x0.l("adapters", false);
            c0343x0.l("latest_adapter_version", true);
            f25940b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b[] interfaceC3527bArr = fx.f25932g;
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{AbstractC3551a.t(m02), m02, AbstractC3551a.t(m02), AbstractC3551a.t(m02), interfaceC3527bArr[4], AbstractC3551a.t(m02)};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            String str2;
            String str3;
            String str4;
            List list;
            String str5;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f25940b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = fx.f25932g;
            int i5 = 5;
            String str6 = null;
            if (b4.v()) {
                C2.M0 m02 = C2.M0.f224a;
                String str7 = (String) b4.B(c0343x0, 0, m02, null);
                String h4 = b4.h(c0343x0, 1);
                String str8 = (String) b4.B(c0343x0, 2, m02, null);
                String str9 = (String) b4.B(c0343x0, 3, m02, null);
                list = (List) b4.y(c0343x0, 4, interfaceC3527bArr[4], null);
                str5 = (String) b4.B(c0343x0, 5, m02, null);
                i4 = 63;
                str4 = str9;
                str3 = str8;
                str2 = h4;
                str = str7;
            } else {
                boolean z4 = true;
                int i6 = 0;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                List list2 = null;
                String str13 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    switch (t4) {
                        case -1:
                            z4 = false;
                            i5 = 5;
                        case 0:
                            str6 = (String) b4.B(c0343x0, 0, C2.M0.f224a, str6);
                            i6 |= 1;
                            i5 = 5;
                        case 1:
                            str10 = b4.h(c0343x0, 1);
                            i6 |= 2;
                        case 2:
                            str11 = (String) b4.B(c0343x0, 2, C2.M0.f224a, str11);
                            i6 |= 4;
                        case 3:
                            str12 = (String) b4.B(c0343x0, 3, C2.M0.f224a, str12);
                            i6 |= 8;
                        case 4:
                            list2 = (List) b4.y(c0343x0, 4, interfaceC3527bArr[4], list2);
                            i6 |= 16;
                        case 5:
                            str13 = (String) b4.B(c0343x0, i5, C2.M0.f224a, str13);
                            i6 |= 32;
                        default:
                            throw new y2.o(t4);
                    }
                }
                i4 = i6;
                str = str6;
                str2 = str10;
                str3 = str11;
                str4 = str12;
                list = list2;
                str5 = str13;
            }
            b4.c(c0343x0);
            return new fx(i4, str, str2, str3, str4, list, str5);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f25940b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            fx value = (fx) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f25940b;
            B2.d b4 = encoder.b(c0343x0);
            fx.a(value, b4, c0343x0);
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
            return a.f25939a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ fx(int i4, String str, String str2, String str3, String str4, List list, String str5) {
        if (18 != (i4 & 18)) {
            AbstractC0341w0.a(i4, 18, a.f25939a.getDescriptor());
        }
        if ((i4 & 1) == 0) {
            this.f25933a = null;
        } else {
            this.f25933a = str;
        }
        this.f25934b = str2;
        if ((i4 & 4) == 0) {
            this.f25935c = null;
        } else {
            this.f25935c = str3;
        }
        if ((i4 & 8) == 0) {
            this.f25936d = null;
        } else {
            this.f25936d = str4;
        }
        this.f25937e = list;
        if ((i4 & 32) == 0) {
            this.f25938f = null;
        } else {
            this.f25938f = str5;
        }
    }

    public static final /* synthetic */ void a(fx fxVar, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f25932g;
        if (dVar.r(c0343x0, 0) || fxVar.f25933a != null) {
            dVar.x(c0343x0, 0, C2.M0.f224a, fxVar.f25933a);
        }
        dVar.n(c0343x0, 1, fxVar.f25934b);
        if (dVar.r(c0343x0, 2) || fxVar.f25935c != null) {
            dVar.x(c0343x0, 2, C2.M0.f224a, fxVar.f25935c);
        }
        if (dVar.r(c0343x0, 3) || fxVar.f25936d != null) {
            dVar.x(c0343x0, 3, C2.M0.f224a, fxVar.f25936d);
        }
        dVar.m(c0343x0, 4, interfaceC3527bArr[4], fxVar.f25937e);
        if (!dVar.r(c0343x0, 5) && fxVar.f25938f == null) {
            return;
        }
        dVar.x(c0343x0, 5, C2.M0.f224a, fxVar.f25938f);
    }

    @NotNull
    public final List<String> b() {
        return this.f25937e;
    }

    @Nullable
    public final String c() {
        return this.f25933a;
    }

    @Nullable
    public final String d() {
        return this.f25938f;
    }

    @Nullable
    public final String e() {
        return this.f25935c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        return Intrinsics.areEqual(this.f25933a, fxVar.f25933a) && Intrinsics.areEqual(this.f25934b, fxVar.f25934b) && Intrinsics.areEqual(this.f25935c, fxVar.f25935c) && Intrinsics.areEqual(this.f25936d, fxVar.f25936d) && Intrinsics.areEqual(this.f25937e, fxVar.f25937e) && Intrinsics.areEqual(this.f25938f, fxVar.f25938f);
    }

    @NotNull
    public final String f() {
        return this.f25934b;
    }

    public final int hashCode() {
        String str = this.f25933a;
        int a4 = C1842c3.a(this.f25934b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f25935c;
        int hashCode = (a4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25936d;
        int a5 = C2039k9.a(this.f25937e, (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f25938f;
        return a5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelMediationNetwork(id=" + this.f25933a + ", name=" + this.f25934b + ", logoUrl=" + this.f25935c + ", adapterStatus=" + this.f25936d + ", adapters=" + this.f25937e + ", latestAdapterVersion=" + this.f25938f + ")";
    }
}
