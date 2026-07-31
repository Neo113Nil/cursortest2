package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2343Hv extends AbstractRunnableC2705Wc {
    public static byte[] A01;
    public final /* synthetic */ C5F A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{118, 73, 68, 69, 79, 0, 87, 65, 83, 0, 78, 69, 86, 69, 82, 0, 80, 82, 69, 80, 65, 82, 69, 68};
    }

    public C2343Hv(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        boolean z;
        InterfaceC3038dm interfaceC3038dm;
        z = this.A00.A0T;
        if (!z) {
            interfaceC3038dm = this.A00.A0Z;
            interfaceC3038dm.AGQ(A00(0, 24, 86));
        }
    }
}
