package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0307f;
import C2.C0343x0;
import C2.L;
import com.yandex.mobile.ads.impl.ak1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class yj1 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f35162b = {new C0307f(ak1.a.f23347a)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<ak1> f35163a;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f35164a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f35165b;

        static {
            a aVar = new a();
            f35164a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationData", aVar, 1);
            c0343x0.l("prefetched_mediation_data", false);
            f35165b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{yj1.f35162b[0]};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            List list;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f35165b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = yj1.f35162b;
            int i4 = 1;
            List list2 = null;
            if (b4.v()) {
                list = (List) b4.y(c0343x0, 0, interfaceC3527bArr[0], null);
            } else {
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
                        list2 = (List) b4.y(c0343x0, 0, interfaceC3527bArr[0], list2);
                        i5 = 1;
                    }
                }
                list = list2;
                i4 = i5;
            }
            b4.c(c0343x0);
            return new yj1(i4, list);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f35165b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            yj1 value = (yj1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f35165b;
            B2.d b4 = encoder.b(c0343x0);
            yj1.a(value, b4, c0343x0);
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
            return a.f35164a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ yj1(int i4, List list) {
        if (1 != (i4 & 1)) {
            AbstractC0341w0.a(i4, 1, a.f35164a.getDescriptor());
        }
        this.f35163a = list;
    }

    public static final /* synthetic */ void a(yj1 yj1Var, B2.d dVar, C0343x0 c0343x0) {
        dVar.m(c0343x0, 0, f35162b[0], yj1Var.f35163a);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yj1) && Intrinsics.areEqual(this.f35163a, ((yj1) obj).f35163a);
    }

    public final int hashCode() {
        return this.f35163a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PrefetchedMediationData(mediationPrefetchAdapters=" + this.f35163a + ")";
    }

    public yj1(@NotNull List<ak1> mediationPrefetchAdapters) {
        Intrinsics.checkNotNullParameter(mediationPrefetchAdapters, "mediationPrefetchAdapters");
        this.f35163a = mediationPrefetchAdapters;
    }
}
