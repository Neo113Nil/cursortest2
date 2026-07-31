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
public final class c11 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f24008e;

    /* renamed from: a, reason: collision with root package name */
    private final long f24009a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f24010b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f24011c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f24012d;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f24013a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f24014b;

        static {
            a aVar = new a();
            f24013a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", aVar, 4);
            c0343x0.l(da.a.f15878d, false);
            c0343x0.l("code", false);
            c0343x0.l("headers", false);
            c0343x0.l(b9.h.f15438E0, false);
            f24014b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{C0310g0.f284a, AbstractC3551a.t(C2.V.f255a), AbstractC3551a.t(c11.f24008e[2]), AbstractC3551a.t(C2.M0.f224a)};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            Integer num;
            Map map;
            String str;
            long j4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f24014b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = c11.f24008e;
            Integer num2 = null;
            if (b4.v()) {
                long C4 = b4.C(c0343x0, 0);
                Integer num3 = (Integer) b4.B(c0343x0, 1, C2.V.f255a, null);
                map = (Map) b4.B(c0343x0, 2, interfaceC3527bArr[2], null);
                num = num3;
                str = (String) b4.B(c0343x0, 3, C2.M0.f224a, null);
                i4 = 15;
                j4 = C4;
            } else {
                boolean z4 = true;
                int i5 = 0;
                long j5 = 0;
                Map map2 = null;
                String str2 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        j5 = b4.C(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        num2 = (Integer) b4.B(c0343x0, 1, C2.V.f255a, num2);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        map2 = (Map) b4.B(c0343x0, 2, interfaceC3527bArr[2], map2);
                        i5 |= 4;
                    } else {
                        if (t4 != 3) {
                            throw new y2.o(t4);
                        }
                        str2 = (String) b4.B(c0343x0, 3, C2.M0.f224a, str2);
                        i5 |= 8;
                    }
                }
                i4 = i5;
                num = num2;
                map = map2;
                str = str2;
                j4 = j5;
            }
            b4.c(c0343x0);
            return new c11(i4, j4, num, map, str);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f24014b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            c11 value = (c11) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f24014b;
            B2.d b4 = encoder.b(c0343x0);
            c11.a(value, b4, c0343x0);
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
            return a.f24013a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    static {
        C2.M0 m02 = C2.M0.f224a;
        f24008e = new InterfaceC3527b[]{null, null, new C0298a0(m02, AbstractC3551a.t(m02)), null};
    }

    public /* synthetic */ c11(int i4, long j4, Integer num, Map map, String str) {
        if (15 != (i4 & 15)) {
            AbstractC0341w0.a(i4, 15, a.f24013a.getDescriptor());
        }
        this.f24009a = j4;
        this.f24010b = num;
        this.f24011c = map;
        this.f24012d = str;
    }

    public static final /* synthetic */ void a(c11 c11Var, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f24008e;
        dVar.F(c0343x0, 0, c11Var.f24009a);
        dVar.x(c0343x0, 1, C2.V.f255a, c11Var.f24010b);
        dVar.x(c0343x0, 2, interfaceC3527bArr[2], c11Var.f24011c);
        dVar.x(c0343x0, 3, C2.M0.f224a, c11Var.f24012d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c11)) {
            return false;
        }
        c11 c11Var = (c11) obj;
        return this.f24009a == c11Var.f24009a && Intrinsics.areEqual(this.f24010b, c11Var.f24010b) && Intrinsics.areEqual(this.f24011c, c11Var.f24011c) && Intrinsics.areEqual(this.f24012d, c11Var.f24012d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f24009a) * 31;
        Integer num = this.f24010b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.f24011c;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f24012d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.f24009a + ", statusCode=" + this.f24010b + ", headers=" + this.f24011c + ", body=" + this.f24012d + ")";
    }

    public c11(long j4, @Nullable Integer num, @Nullable Map<String, String> map, @Nullable String str) {
        this.f24009a = j4;
        this.f24010b = num;
        this.f24011c = map;
        this.f24012d = str;
    }
}
