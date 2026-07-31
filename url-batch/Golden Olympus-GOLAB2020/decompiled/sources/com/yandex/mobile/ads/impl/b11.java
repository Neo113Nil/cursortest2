package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0298a0;
import C2.C0310g0;
import C2.C0343x0;
import C2.L;
import com.ironsource.b9;
import com.ironsource.da;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class b11 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f23544f;

    /* renamed from: a, reason: collision with root package name */
    private final long f23545a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23546b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f23547c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f23548d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f23549e;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f23550a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f23551b;

        static {
            a aVar = new a();
            f23550a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", aVar, 5);
            c0343x0.l(da.a.f15878d, false);
            c0343x0.l("method", false);
            c0343x0.l("url", false);
            c0343x0.l("headers", false);
            c0343x0.l(b9.h.f15438E0, false);
            f23551b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b[] interfaceC3527bArr = b11.f23544f;
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{C0310g0.f284a, m02, m02, AbstractC3551a.t(interfaceC3527bArr[3]), AbstractC3551a.t(m02)};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            String str;
            String str2;
            Map map;
            String str3;
            long j4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f23551b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = b11.f23544f;
            String str4 = null;
            if (b4.v()) {
                long C4 = b4.C(c0343x0, 0);
                String h4 = b4.h(c0343x0, 1);
                String h5 = b4.h(c0343x0, 2);
                map = (Map) b4.B(c0343x0, 3, interfaceC3527bArr[3], null);
                str = h4;
                str3 = (String) b4.B(c0343x0, 4, C2.M0.f224a, null);
                str2 = h5;
                i4 = 31;
                j4 = C4;
            } else {
                boolean z4 = true;
                int i5 = 0;
                String str5 = null;
                long j5 = 0;
                String str6 = null;
                Map map2 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        j5 = b4.C(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        str4 = b4.h(c0343x0, 1);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        str6 = b4.h(c0343x0, 2);
                        i5 |= 4;
                    } else if (t4 == 3) {
                        map2 = (Map) b4.B(c0343x0, 3, interfaceC3527bArr[3], map2);
                        i5 |= 8;
                    } else {
                        if (t4 != 4) {
                            throw new y2.o(t4);
                        }
                        str5 = (String) b4.B(c0343x0, 4, C2.M0.f224a, str5);
                        i5 |= 16;
                    }
                }
                i4 = i5;
                str = str4;
                str2 = str6;
                map = map2;
                str3 = str5;
                j4 = j5;
            }
            b4.c(c0343x0);
            return new b11(i4, j4, str, str2, map, str3);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f23551b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            b11 value = (b11) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f23551b;
            B2.d b4 = encoder.b(c0343x0);
            b11.a(value, b4, c0343x0);
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
            return a.f23550a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    static {
        C2.M0 m02 = C2.M0.f224a;
        f23544f = new InterfaceC3527b[]{null, null, null, new C0298a0(m02, AbstractC3551a.t(m02)), null};
    }

    public /* synthetic */ b11(int i4, long j4, String str, String str2, Map map, String str3) {
        if (31 != (i4 & 31)) {
            AbstractC0341w0.a(i4, 31, a.f23550a.getDescriptor());
        }
        this.f23545a = j4;
        this.f23546b = str;
        this.f23547c = str2;
        this.f23548d = map;
        this.f23549e = str3;
    }

    public static final /* synthetic */ void a(b11 b11Var, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f23544f;
        dVar.F(c0343x0, 0, b11Var.f23545a);
        dVar.n(c0343x0, 1, b11Var.f23546b);
        dVar.n(c0343x0, 2, b11Var.f23547c);
        dVar.x(c0343x0, 3, interfaceC3527bArr[3], b11Var.f23548d);
        dVar.x(c0343x0, 4, C2.M0.f224a, b11Var.f23549e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b11)) {
            return false;
        }
        b11 b11Var = (b11) obj;
        return this.f23545a == b11Var.f23545a && Intrinsics.areEqual(this.f23546b, b11Var.f23546b) && Intrinsics.areEqual(this.f23547c, b11Var.f23547c) && Intrinsics.areEqual(this.f23548d, b11Var.f23548d) && Intrinsics.areEqual(this.f23549e, b11Var.f23549e);
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f23547c, C1842c3.a(this.f23546b, Long.hashCode(this.f23545a) * 31, 31), 31);
        Map<String, String> map = this.f23548d;
        int hashCode = (a4 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f23549e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MobileAdsNetworkRequestLog(timestamp=" + this.f23545a + ", method=" + this.f23546b + ", url=" + this.f23547c + ", headers=" + this.f23548d + ", body=" + this.f23549e + ")";
    }

    public b11(long j4, @NotNull String method, @NotNull String url, @Nullable Map<String, String> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f23545a = j4;
        this.f23546b = method;
        this.f23547c = url;
        this.f23548d = map;
        this.f23549e = str;
    }
}
