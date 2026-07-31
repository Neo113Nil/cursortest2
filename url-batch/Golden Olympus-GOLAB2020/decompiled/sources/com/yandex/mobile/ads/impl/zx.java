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
public final class zx {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35811a;

    /* renamed from: b, reason: collision with root package name */
    private final double f35812b;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f35813a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f35814b;

        static {
            a aVar = new a();
            f35813a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCpmFloor", aVar, 2);
            c0343x0.l("network_ad_unit_id", false);
            c0343x0.l("min_cpm", false);
            f35814b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{C2.M0.f224a, C2.C.f185a};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            String str;
            double d4;
            int i4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f35814b;
            B2.c b4 = decoder.b(c0343x0);
            if (b4.v()) {
                str = b4.h(c0343x0, 0);
                d4 = b4.D(c0343x0, 1);
                i4 = 3;
            } else {
                str = null;
                double d5 = 0.0d;
                boolean z4 = true;
                int i5 = 0;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        str = b4.h(c0343x0, 0);
                        i5 |= 1;
                    } else {
                        if (t4 != 1) {
                            throw new y2.o(t4);
                        }
                        d5 = b4.D(c0343x0, 1);
                        i5 |= 2;
                    }
                }
                d4 = d5;
                i4 = i5;
            }
            b4.c(c0343x0);
            return new zx(i4, str, d4);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f35814b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            zx value = (zx) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f35814b;
            B2.d b4 = encoder.b(c0343x0);
            zx.a(value, b4, c0343x0);
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
            return a.f35813a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ zx(int i4, String str, double d4) {
        if (3 != (i4 & 3)) {
            AbstractC0341w0.a(i4, 3, a.f35813a.getDescriptor());
        }
        this.f35811a = str;
        this.f35812b = d4;
    }

    public final double a() {
        return this.f35812b;
    }

    @NotNull
    public final String b() {
        return this.f35811a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx)) {
            return false;
        }
        zx zxVar = (zx) obj;
        return Intrinsics.areEqual(this.f35811a, zxVar.f35811a) && Double.compare(this.f35812b, zxVar.f35812b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f35812b) + (this.f35811a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.f35811a + ", minCpm=" + this.f35812b + ")";
    }

    public static final /* synthetic */ void a(zx zxVar, B2.d dVar, C0343x0 c0343x0) {
        dVar.n(c0343x0, 0, zxVar.f35811a);
        dVar.B(c0343x0, 1, zxVar.f35812b);
    }
}
