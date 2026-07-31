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
public final class nw {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29767a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29768b;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29769a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f29770b;

        static {
            a aVar = new a();
            f29769a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelBiddingParameter", aVar, 2);
            c0343x0.l("name", false);
            c0343x0.l("value", false);
            f29770b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            C2.M0 m02 = C2.M0.f224a;
            return new InterfaceC3527b[]{m02, m02};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            String str;
            String str2;
            int i4;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f29770b;
            B2.c b4 = decoder.b(c0343x0);
            if (b4.v()) {
                str = b4.h(c0343x0, 0);
                str2 = b4.h(c0343x0, 1);
                i4 = 3;
            } else {
                str = null;
                String str3 = null;
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
                        str3 = b4.h(c0343x0, 1);
                        i5 |= 2;
                    }
                }
                str2 = str3;
                i4 = i5;
            }
            b4.c(c0343x0);
            return new nw(i4, str, str2);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f29770b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            nw value = (nw) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f29770b;
            B2.d b4 = encoder.b(c0343x0);
            nw.a(value, b4, c0343x0);
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
            return a.f29769a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ nw(int i4, String str, String str2) {
        if (3 != (i4 & 3)) {
            AbstractC0341w0.a(i4, 3, a.f29769a.getDescriptor());
        }
        this.f29767a = str;
        this.f29768b = str2;
    }

    @NotNull
    public final String a() {
        return this.f29767a;
    }

    @NotNull
    public final String b() {
        return this.f29768b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw)) {
            return false;
        }
        nw nwVar = (nw) obj;
        return Intrinsics.areEqual(this.f29767a, nwVar.f29767a) && Intrinsics.areEqual(this.f29768b, nwVar.f29768b);
    }

    public final int hashCode() {
        return this.f29768b.hashCode() + (this.f29767a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelBiddingParameter(name=" + this.f29767a + ", value=" + this.f29768b + ")";
    }

    public static final /* synthetic */ void a(nw nwVar, B2.d dVar, C0343x0 c0343x0) {
        dVar.n(c0343x0, 0, nwVar.f29767a);
        dVar.n(c0343x0, 1, nwVar.f29768b);
    }
}
