package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0343x0;
import C2.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class ok1 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final double f30072a;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f30073a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f30074b;

        static {
            a aVar = new a();
            f30073a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationRevenue", aVar, 1);
            c0343x0.l("value", false);
            f30074b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{C2.C.f185a};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            double d4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f30074b;
            B2.c b4 = decoder.b(c0343x0);
            int i4 = 1;
            if (b4.v()) {
                d4 = b4.D(c0343x0, 0);
            } else {
                double d5 = 0.0d;
                boolean z4 = true;
                int i5 = 0;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else {
                        if (t4 != 0) {
                            throw new y2.o(t4);
                        }
                        d5 = b4.D(c0343x0, 0);
                        i5 = 1;
                    }
                }
                d4 = d5;
                i4 = i5;
            }
            b4.c(c0343x0);
            return new ok1(i4, d4);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f30074b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            ok1 value = (ok1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f30074b;
            B2.d b4 = encoder.b(c0343x0);
            ok1.a(value, b4, c0343x0);
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
            return a.f30073a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public ok1(double d4) {
        this.f30072a = d4;
    }

    public static final /* synthetic */ void a(ok1 ok1Var, B2.d dVar, C0343x0 c0343x0) {
        dVar.B(c0343x0, 0, ok1Var.f30072a);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok1) && Double.compare(this.f30072a, ((ok1) obj).f30072a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f30072a);
    }

    @NotNull
    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.f30072a + ")";
    }

    public /* synthetic */ ok1(int i4, double d4) {
        if (1 != (i4 & 1)) {
            AbstractC0341w0.a(i4, 1, a.f30073a.getDescriptor());
        }
        this.f30072a = d4;
    }
}
