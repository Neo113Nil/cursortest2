package com.yandex.div.internal.viewpool;

import A2.f;
import B2.c;
import B2.d;
import B2.e;
import C2.C0343x0;
import C2.H0;
import C2.L;
import C2.V;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y2.InterfaceC3527b;
import y2.o;

@Metadata
/* loaded from: classes2.dex */
public final class PreCreationModel$$serializer implements L {

    @NotNull
    public static final PreCreationModel$$serializer INSTANCE;
    private static final /* synthetic */ C0343x0 descriptor;

    static {
        PreCreationModel$$serializer preCreationModel$$serializer = new PreCreationModel$$serializer();
        INSTANCE = preCreationModel$$serializer;
        C0343x0 c0343x0 = new C0343x0("com.yandex.div.internal.viewpool.PreCreationModel", preCreationModel$$serializer, 3);
        c0343x0.l("capacity", false);
        c0343x0.l("min", true);
        c0343x0.l("max", true);
        descriptor = c0343x0;
    }

    private PreCreationModel$$serializer() {
    }

    @Override // C2.L
    @NotNull
    public InterfaceC3527b[] childSerializers() {
        V v4 = V.f255a;
        return new InterfaceC3527b[]{v4, v4, v4};
    }

    @Override // y2.InterfaceC3526a
    @NotNull
    public PreCreationModel deserialize(@NotNull e decoder) {
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b4 = decoder.b(descriptor2);
        if (b4.v()) {
            i4 = b4.s(descriptor2, 0);
            int s4 = b4.s(descriptor2, 1);
            i5 = b4.s(descriptor2, 2);
            i6 = s4;
            i7 = 7;
        } else {
            boolean z4 = true;
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (z4) {
                int t4 = b4.t(descriptor2);
                if (t4 == -1) {
                    z4 = false;
                } else if (t4 == 0) {
                    i4 = b4.s(descriptor2, 0);
                    i10 |= 1;
                } else if (t4 == 1) {
                    i9 = b4.s(descriptor2, 1);
                    i10 |= 2;
                } else {
                    if (t4 != 2) {
                        throw new o(t4);
                    }
                    i8 = b4.s(descriptor2, 2);
                    i10 |= 4;
                }
            }
            i5 = i8;
            i6 = i9;
            i7 = i10;
        }
        int i11 = i4;
        b4.c(descriptor2);
        return new PreCreationModel(i7, i11, i6, i5, (H0) null);
    }

    @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    @NotNull
    public f getDescriptor() {
        return descriptor;
    }

    @Override // y2.InterfaceC3535j
    public void serialize(@NotNull B2.f encoder, @NotNull PreCreationModel value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f descriptor2 = getDescriptor();
        d b4 = encoder.b(descriptor2);
        PreCreationModel.write$Self(value, b4, descriptor2);
        b4.c(descriptor2);
    }

    @Override // C2.L
    @NotNull
    public InterfaceC3527b[] typeParametersSerializers() {
        return L.a.a(this);
    }
}
