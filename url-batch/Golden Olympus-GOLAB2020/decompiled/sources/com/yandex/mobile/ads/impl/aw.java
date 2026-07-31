package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0343x0;
import C2.L;
import com.yandex.mobile.ads.impl.dw;
import com.yandex.mobile.ads.impl.xv;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class aw {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f23492c = {new C0307f(dw.a.f24983a), new C0307f(xv.a.f34684a)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<dw> f23493a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<xv> f23494b;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f23495a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f23496b;

        static {
            a aVar = new a();
            f23495a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", aVar, 2);
            c0343x0.l(com.ironsource.mediationsdk.d.f17319h, false);
            c0343x0.l("bidding", false);
            f23496b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            InterfaceC3527b[] interfaceC3527bArr = aw.f23492c;
            return new InterfaceC3527b[]{interfaceC3527bArr[0], interfaceC3527bArr[1]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            List list;
            List list2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f23496b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = aw.f23492c;
            List list3 = null;
            if (b4.v()) {
                list = (List) b4.y(c0343x0, 0, interfaceC3527bArr[0], null);
                list2 = (List) b4.y(c0343x0, 1, interfaceC3527bArr[1], null);
                i4 = 3;
            } else {
                boolean z4 = true;
                int i5 = 0;
                List list4 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        list3 = (List) b4.y(c0343x0, 0, interfaceC3527bArr[0], list3);
                        i5 |= 1;
                    } else {
                        if (t4 != 1) {
                            throw new y2.o(t4);
                        }
                        list4 = (List) b4.y(c0343x0, 1, interfaceC3527bArr[1], list4);
                        i5 |= 2;
                    }
                }
                i4 = i5;
                list = list3;
                list2 = list4;
            }
            b4.c(c0343x0);
            return new aw(i4, list, list2);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f23496b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            aw value = (aw) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f23496b;
            B2.d b4 = encoder.b(c0343x0);
            aw.a(value, b4, c0343x0);
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
            return a.f23495a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ aw(int i4, List list, List list2) {
        if (3 != (i4 & 3)) {
            AbstractC0341w0.a(i4, 3, a.f23495a.getDescriptor());
        }
        this.f23493a = list;
        this.f23494b = list2;
    }

    public static final /* synthetic */ void a(aw awVar, B2.d dVar, C0343x0 c0343x0) {
        InterfaceC3527b[] interfaceC3527bArr = f23492c;
        dVar.m(c0343x0, 0, interfaceC3527bArr[0], awVar.f23493a);
        dVar.m(c0343x0, 1, interfaceC3527bArr[1], awVar.f23494b);
    }

    @NotNull
    public final List<xv> b() {
        return this.f23494b;
    }

    @NotNull
    public final List<dw> c() {
        return this.f23493a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        return Intrinsics.areEqual(this.f23493a, awVar.f23493a) && Intrinsics.areEqual(this.f23494b, awVar.f23494b);
    }

    public final int hashCode() {
        return this.f23494b.hashCode() + (this.f23493a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelAdUnitMediation(waterfall=" + this.f23493a + ", bidding=" + this.f23494b + ")";
    }
}
