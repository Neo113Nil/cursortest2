package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0310g0;
import C2.C0343x0;
import C2.L;
import com.ironsource.b9;
import com.ironsource.da;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class h11 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final long f26519a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26520b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f26521c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f26522d;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f26523a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f26524b;

        static {
            a aVar = new a();
            f26523a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", aVar, 4);
            c0343x0.l(da.a.f15878d, false);
            c0343x0.l("type", false);
            c0343x0.l("tag", false);
            c0343x0.l(b9.h.f15450K0, false);
            f26524b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{C0310g0.f284a, m02, m02, m02};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            String str;
            String str2;
            String str3;
            int i4;
            long j4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f26524b;
            B2.c b4 = decoder.b(c0343x0);
            if (b4.v()) {
                long C4 = b4.C(c0343x0, 0);
                str = b4.h(c0343x0, 1);
                String h4 = b4.h(c0343x0, 2);
                str2 = b4.h(c0343x0, 3);
                str3 = h4;
                i4 = 15;
                j4 = C4;
            } else {
                str = null;
                boolean z4 = true;
                int i5 = 0;
                long j5 = 0;
                String str4 = null;
                String str5 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        j5 = b4.C(c0343x0, 0);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        str = b4.h(c0343x0, 1);
                        i5 |= 2;
                    } else if (t4 == 2) {
                        str5 = b4.h(c0343x0, 2);
                        i5 |= 4;
                    } else {
                        if (t4 != 3) {
                            throw new y2.o(t4);
                        }
                        str4 = b4.h(c0343x0, 3);
                        i5 |= 8;
                    }
                }
                str2 = str4;
                str3 = str5;
                i4 = i5;
                j4 = j5;
            }
            String str6 = str;
            b4.c(c0343x0);
            return new h11(i4, j4, str6, str3, str2);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f26524b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            h11 value = (h11) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f26524b;
            B2.d b4 = encoder.b(c0343x0);
            h11.a(value, b4, c0343x0);
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
            return a.f26523a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ h11(int i4, long j4, String str, String str2, String str3) {
        if (15 != (i4 & 15)) {
            AbstractC0341w0.a(i4, 15, a.f26523a.getDescriptor());
        }
        this.f26519a = j4;
        this.f26520b = str;
        this.f26521c = str2;
        this.f26522d = str3;
    }

    public static final /* synthetic */ void a(h11 h11Var, B2.d dVar, C0343x0 c0343x0) {
        dVar.F(c0343x0, 0, h11Var.f26519a);
        dVar.n(c0343x0, 1, h11Var.f26520b);
        dVar.n(c0343x0, 2, h11Var.f26521c);
        dVar.n(c0343x0, 3, h11Var.f26522d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h11)) {
            return false;
        }
        h11 h11Var = (h11) obj;
        return this.f26519a == h11Var.f26519a && Intrinsics.areEqual(this.f26520b, h11Var.f26520b) && Intrinsics.areEqual(this.f26521c, h11Var.f26521c) && Intrinsics.areEqual(this.f26522d, h11Var.f26522d);
    }

    public final int hashCode() {
        return this.f26522d.hashCode() + C1842c3.a(this.f26521c, C1842c3.a(this.f26520b, Long.hashCode(this.f26519a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "MobileAdsSdkLog(timestamp=" + this.f26519a + ", type=" + this.f26520b + ", tag=" + this.f26521c + ", text=" + this.f26522d + ")";
    }

    public h11(long j4, @NotNull String type, @NotNull String tag, @NotNull String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f26519a = j4;
        this.f26520b = type;
        this.f26521c = tag;
        this.f26522d = text;
    }
}
