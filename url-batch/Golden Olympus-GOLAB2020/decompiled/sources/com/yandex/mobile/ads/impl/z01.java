package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0343x0;
import C2.L;
import com.yandex.mobile.ads.impl.b11;
import com.yandex.mobile.ads.impl.c11;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class z01 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b11 f35415a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final c11 f35416b;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f35417a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f35418b;

        static {
            a aVar = new a();
            f35417a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", aVar, 2);
            c0343x0.l("request", false);
            c0343x0.l(com.ironsource.ms.f18193n, false);
            f35418b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{b11.a.f23550a, AbstractC3551a.t(c11.a.f24013a)};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            b11 b11Var;
            c11 c11Var;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f35418b;
            B2.c b4 = decoder.b(c0343x0);
            b11 b11Var2 = null;
            if (b4.v()) {
                b11Var = (b11) b4.y(c0343x0, 0, b11.a.f23550a, null);
                c11Var = (c11) b4.B(c0343x0, 1, c11.a.f24013a, null);
                i4 = 3;
            } else {
                boolean z4 = true;
                int i5 = 0;
                c11 c11Var2 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        b11Var2 = (b11) b4.y(c0343x0, 0, b11.a.f23550a, b11Var2);
                        i5 |= 1;
                    } else {
                        if (t4 != 1) {
                            throw new y2.o(t4);
                        }
                        c11Var2 = (c11) b4.B(c0343x0, 1, c11.a.f24013a, c11Var2);
                        i5 |= 2;
                    }
                }
                i4 = i5;
                b11Var = b11Var2;
                c11Var = c11Var2;
            }
            b4.c(c0343x0);
            return new z01(i4, b11Var, c11Var);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f35418b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            z01 value = (z01) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f35418b;
            B2.d b4 = encoder.b(c0343x0);
            z01.a(value, b4, c0343x0);
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
            return a.f35417a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ z01(int i4, b11 b11Var, c11 c11Var) {
        if (3 != (i4 & 3)) {
            AbstractC0341w0.a(i4, 3, a.f35417a.getDescriptor());
        }
        this.f35415a = b11Var;
        this.f35416b = c11Var;
    }

    public static final /* synthetic */ void a(z01 z01Var, B2.d dVar, C0343x0 c0343x0) {
        dVar.m(c0343x0, 0, b11.a.f23550a, z01Var.f35415a);
        dVar.x(c0343x0, 1, c11.a.f24013a, z01Var.f35416b);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z01)) {
            return false;
        }
        z01 z01Var = (z01) obj;
        return Intrinsics.areEqual(this.f35415a, z01Var.f35415a) && Intrinsics.areEqual(this.f35416b, z01Var.f35416b);
    }

    public final int hashCode() {
        int hashCode = this.f35415a.hashCode() * 31;
        c11 c11Var = this.f35416b;
        return hashCode + (c11Var == null ? 0 : c11Var.hashCode());
    }

    @NotNull
    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.f35415a + ", response=" + this.f35416b + ")";
    }

    public z01(@NotNull b11 request, @Nullable c11 c11Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f35415a = request;
        this.f35416b = c11Var;
    }
}
