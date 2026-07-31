package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0343x0;
import C2.L;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.h11;
import com.yandex.mobile.ads.impl.mw;
import com.yandex.mobile.ads.impl.nx;
import com.yandex.mobile.ads.impl.pw;
import com.yandex.mobile.ads.impl.z01;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class hx {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f26965g = {null, null, new C0307f(cz0.a.f24365a), null, new C0307f(h11.a.f26523a), new C0307f(z01.a.f35417a)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mw f26966a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nx f26967b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<cz0> f26968c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final pw f26969d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<h11> f26970e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<z01> f26971f;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f26972a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f26973b;

        static {
            a aVar = new a();
            f26972a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", aVar, 6);
            c0343x0.l("app_data", false);
            c0343x0.l("sdk_data", false);
            c0343x0.l("adapters_data", false);
            c0343x0.l("consents_data", false);
            c0343x0.l("sdk_logs", false);
            c0343x0.l("network_logs", false);
            f26973b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b[] interfaceC3527bArr = hx.f26965g;
            return new InterfaceC3527b[]{mw.a.f29287a, nx.a.f29781a, interfaceC3527bArr[2], pw.a.f30592a, interfaceC3527bArr[4], interfaceC3527bArr[5]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            mw mwVar;
            nx nxVar;
            List list;
            pw pwVar;
            List list2;
            List list3;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f26973b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = hx.f26965g;
            int i5 = 3;
            mw mwVar2 = null;
            if (b4.v()) {
                mw mwVar3 = (mw) b4.y(c0343x0, 0, mw.a.f29287a, null);
                nx nxVar2 = (nx) b4.y(c0343x0, 1, nx.a.f29781a, null);
                List list4 = (List) b4.y(c0343x0, 2, interfaceC3527bArr[2], null);
                pw pwVar2 = (pw) b4.y(c0343x0, 3, pw.a.f30592a, null);
                List list5 = (List) b4.y(c0343x0, 4, interfaceC3527bArr[4], null);
                list3 = (List) b4.y(c0343x0, 5, interfaceC3527bArr[5], null);
                mwVar = mwVar3;
                pwVar = pwVar2;
                i4 = 63;
                list2 = list5;
                list = list4;
                nxVar = nxVar2;
            } else {
                boolean z4 = true;
                int i6 = 0;
                nx nxVar3 = null;
                List list6 = null;
                pw pwVar3 = null;
                List list7 = null;
                List list8 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    switch (t4) {
                        case -1:
                            z4 = false;
                            i5 = 3;
                        case 0:
                            mwVar2 = (mw) b4.y(c0343x0, 0, mw.a.f29287a, mwVar2);
                            i6 |= 1;
                            i5 = 3;
                        case 1:
                            nxVar3 = (nx) b4.y(c0343x0, 1, nx.a.f29781a, nxVar3);
                            i6 |= 2;
                        case 2:
                            list6 = (List) b4.y(c0343x0, 2, interfaceC3527bArr[2], list6);
                            i6 |= 4;
                        case 3:
                            pwVar3 = (pw) b4.y(c0343x0, i5, pw.a.f30592a, pwVar3);
                            i6 |= 8;
                        case 4:
                            list7 = (List) b4.y(c0343x0, 4, interfaceC3527bArr[4], list7);
                            i6 |= 16;
                        case 5:
                            list8 = (List) b4.y(c0343x0, 5, interfaceC3527bArr[5], list8);
                            i6 |= 32;
                        default:
                            throw new y2.o(t4);
                    }
                }
                i4 = i6;
                mwVar = mwVar2;
                nxVar = nxVar3;
                list = list6;
                pwVar = pwVar3;
                list2 = list7;
                list3 = list8;
            }
            b4.c(c0343x0);
            return new hx(i4, mwVar, nxVar, list, pwVar, list2, list3);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f26973b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            hx value = (hx) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f26973b;
            B2.d b4 = encoder.b(c0343x0);
            hx.a(value, b4, c0343x0);
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
            return a.f26972a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ hx(int i4, mw mwVar, nx nxVar, List list, pw pwVar, List list2, List list3) {
        if (63 != (i4 & 63)) {
            AbstractC0341w0.a(i4, 63, a.f26972a.getDescriptor());
        }
        this.f26966a = mwVar;
        this.f26967b = nxVar;
        this.f26968c = list;
        this.f26969d = pwVar;
        this.f26970e = list2;
        this.f26971f = list3;
    }

    public static final /* synthetic */ void a(hx hxVar, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f26965g;
        dVar.m(c0343x0, 0, mw.a.f29287a, hxVar.f26966a);
        dVar.m(c0343x0, 1, nx.a.f29781a, hxVar.f26967b);
        dVar.m(c0343x0, 2, interfaceC3527bArr[2], hxVar.f26968c);
        dVar.m(c0343x0, 3, pw.a.f30592a, hxVar.f26969d);
        dVar.m(c0343x0, 4, interfaceC3527bArr[4], hxVar.f26970e);
        dVar.m(c0343x0, 5, interfaceC3527bArr[5], hxVar.f26971f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx)) {
            return false;
        }
        hx hxVar = (hx) obj;
        return Intrinsics.areEqual(this.f26966a, hxVar.f26966a) && Intrinsics.areEqual(this.f26967b, hxVar.f26967b) && Intrinsics.areEqual(this.f26968c, hxVar.f26968c) && Intrinsics.areEqual(this.f26969d, hxVar.f26969d) && Intrinsics.areEqual(this.f26970e, hxVar.f26970e) && Intrinsics.areEqual(this.f26971f, hxVar.f26971f);
    }

    public final int hashCode() {
        return this.f26971f.hashCode() + C2039k9.a(this.f26970e, (this.f26969d.hashCode() + C2039k9.a(this.f26968c, (this.f26967b.hashCode() + (this.f26966a.hashCode() * 31)) * 31, 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelReportData(appData=" + this.f26966a + ", sdkData=" + this.f26967b + ", networksData=" + this.f26968c + ", consentsData=" + this.f26969d + ", sdkLogs=" + this.f26970e + ", networkLogs=" + this.f26971f + ")";
    }

    public hx(@NotNull mw appData, @NotNull nx sdkData, @NotNull List<cz0> networksData, @NotNull pw consentsData, @NotNull List<h11> sdkLogs, @NotNull List<z01> networkLogs) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
        Intrinsics.checkNotNullParameter(networksData, "networksData");
        Intrinsics.checkNotNullParameter(consentsData, "consentsData");
        Intrinsics.checkNotNullParameter(sdkLogs, "sdkLogs");
        Intrinsics.checkNotNullParameter(networkLogs, "networkLogs");
        this.f26966a = appData;
        this.f26967b = sdkData;
        this.f26968c = networksData;
        this.f26969d = consentsData;
        this.f26970e = sdkLogs;
        this.f26971f = networkLogs;
    }
}
