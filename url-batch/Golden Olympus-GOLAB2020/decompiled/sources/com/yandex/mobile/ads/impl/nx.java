package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0313i;
import C2.C0343x0;
import C2.L;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class nx {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f29777d = {null, null, new C0307f(C2.M0.f224a)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29778a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29779b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f29780c;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29781a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f29782b;

        static {
            a aVar = new a();
            f29781a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", aVar, 3);
            c0343x0.l("version", false);
            c0343x0.l("is_integrated", false);
            c0343x0.l("integration_messages", false);
            f29782b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{C2.M0.f224a, C0313i.f292a, nx.f29777d[2]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            boolean z4;
            String str;
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f29782b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = nx.f29777d;
            if (b4.v()) {
                str = b4.h(c0343x0, 0);
                z4 = b4.x(c0343x0, 1);
                list = (List) b4.y(c0343x0, 2, interfaceC3527bArr[2], null);
                i4 = 7;
            } else {
                boolean z5 = true;
                int i5 = 0;
                String str2 = null;
                List list2 = null;
                boolean z6 = false;
                while (z5) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z5 = false;
                    } else if (t4 == 0) {
                        str2 = b4.h(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        z6 = b4.x(c0343x0, 1);
                        i5 |= 2;
                    } else {
                        if (t4 != 2) {
                            throw new y2.o(t4);
                        }
                        list2 = (List) b4.y(c0343x0, 2, interfaceC3527bArr[2], list2);
                        i5 |= 4;
                    }
                }
                i4 = i5;
                z4 = z6;
                str = str2;
                list = list2;
            }
            b4.c(c0343x0);
            return new nx(i4, str, z4, list);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f29782b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            nx value = (nx) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f29782b;
            B2.d b4 = encoder.b(c0343x0);
            nx.a(value, b4, c0343x0);
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
            return a.f29781a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ nx(int i4, String str, boolean z4, List list) {
        if (7 != (i4 & 7)) {
            AbstractC0341w0.a(i4, 7, a.f29781a.getDescriptor());
        }
        this.f29778a = str;
        this.f29779b = z4;
        this.f29780c = list;
    }

    public static final /* synthetic */ void a(nx nxVar, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f29777d;
        dVar.n(c0343x0, 0, nxVar.f29778a);
        dVar.k(c0343x0, 1, nxVar.f29779b);
        dVar.m(c0343x0, 2, interfaceC3527bArr[2], nxVar.f29780c);
    }

    @NotNull
    public final List<String> b() {
        return this.f29780c;
    }

    @NotNull
    public final String c() {
        return this.f29778a;
    }

    public final boolean d() {
        return this.f29779b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx)) {
            return false;
        }
        nx nxVar = (nx) obj;
        return Intrinsics.areEqual(this.f29778a, nxVar.f29778a) && this.f29779b == nxVar.f29779b && Intrinsics.areEqual(this.f29780c, nxVar.f29780c);
    }

    public final int hashCode() {
        return this.f29780c.hashCode() + C1965h6.a(this.f29779b, this.f29778a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelSdkData(version=" + this.f29778a + ", isIntegratedSuccess=" + this.f29779b + ", integrationMessages=" + this.f29780c + ")";
    }

    public nx(boolean z4, @NotNull List integrationMessages) {
        Intrinsics.checkNotNullParameter("7.15.0", "version");
        Intrinsics.checkNotNullParameter(integrationMessages, "integrationMessages");
        this.f29778a = "7.15.0";
        this.f29779b = z4;
        this.f29780c = integrationMessages;
    }
}
