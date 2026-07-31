package com.yandex.mobile.ads.impl;

import C2.AbstractC0341w0;
import C2.C0343x0;
import C2.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;
import z2.AbstractC3551a;

@InterfaceC3533h
/* loaded from: classes3.dex */
public final class mk1 {

    @NotNull
    public static final b Companion = new b(0);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3527b[] f29134d = {nk1.Companion.serializer(), null, null};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nk1 f29135a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f29136b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Integer f29137c;

    public static final class a implements C2.L {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29138a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C0343x0 f29139b;

        static {
            a aVar = new a();
            f29138a = aVar;
            C0343x0 c0343x0 = new C0343x0("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", aVar, 3);
            c0343x0.l("status", false);
            c0343x0.l("error_message", false);
            c0343x0.l("status_code", false);
            f29139b = c0343x0;
        }

        private a() {
        }

        @Override // C2.L
        @NotNull
        public final InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{mk1.f29134d[0], AbstractC3551a.t(C2.M0.f224a), AbstractC3551a.t(C2.V.f255a)};
        }

        @Override // y2.InterfaceC3526a
        public final Object deserialize(B2.e decoder) {
            int i4;
            nk1 nk1Var;
            String str;
            Integer num;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            C0343x0 c0343x0 = f29139b;
            B2.c b4 = decoder.b(c0343x0);
            InterfaceC3527b[] interfaceC3527bArr = mk1.f29134d;
            nk1 nk1Var2 = null;
            if (b4.v()) {
                nk1Var = (nk1) b4.y(c0343x0, 0, interfaceC3527bArr[0], null);
                str = (String) b4.B(c0343x0, 1, C2.M0.f224a, null);
                num = (Integer) b4.B(c0343x0, 2, C2.V.f255a, null);
                i4 = 7;
            } else {
                boolean z4 = true;
                int i5 = 0;
                String str2 = null;
                Integer num2 = null;
                while (z4) {
                    int t4 = b4.t(c0343x0);
                    if (t4 == -1) {
                        z4 = false;
                    } else if (t4 == 0) {
                        nk1Var2 = (nk1) b4.y(c0343x0, 0, interfaceC3527bArr[0], nk1Var2);
                        i5 |= 1;
                    } else if (t4 == 1) {
                        str2 = (String) b4.B(c0343x0, 1, C2.M0.f224a, str2);
                        i5 |= 2;
                    } else {
                        if (t4 != 2) {
                            throw new y2.o(t4);
                        }
                        num2 = (Integer) b4.B(c0343x0, 2, C2.V.f255a, num2);
                        i5 |= 4;
                    }
                }
                i4 = i5;
                nk1Var = nk1Var2;
                str = str2;
                num = num2;
            }
            b4.c(c0343x0);
            return new mk1(i4, nk1Var, str, num);
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        @NotNull
        public final A2.f getDescriptor() {
            return f29139b;
        }

        @Override // y2.InterfaceC3535j
        public final void serialize(B2.f encoder, Object obj) {
            mk1 value = (mk1) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            C0343x0 c0343x0 = f29139b;
            B2.d b4 = encoder.b(c0343x0);
            mk1.a(value, b4, c0343x0);
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
            return a.f29138a;
        }

        public /* synthetic */ b(int i4) {
            this();
        }
    }

    public /* synthetic */ mk1(int i4, nk1 nk1Var, String str, Integer num) {
        if (7 != (i4 & 7)) {
            AbstractC0341w0.a(i4, 7, a.f29138a.getDescriptor());
        }
        this.f29135a = nk1Var;
        this.f29136b = str;
        this.f29137c = num;
    }

    public static final /* synthetic */ void a(mk1 mk1Var, B2.d dVar, C0343x0 c0343x0) {
        dVar.m(c0343x0, 0, f29134d[0], mk1Var.f29135a);
        dVar.x(c0343x0, 1, C2.M0.f224a, mk1Var.f29136b);
        dVar.x(c0343x0, 2, C2.V.f255a, mk1Var.f29137c);
    }

    @Nullable
    public final String b() {
        return this.f29136b;
    }

    @NotNull
    public final nk1 c() {
        return this.f29135a;
    }

    @Nullable
    public final Integer d() {
        return this.f29137c;
    }

    public mk1(@NotNull nk1 status, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f29135a = status;
        this.f29136b = str;
        this.f29137c = num;
    }
}
