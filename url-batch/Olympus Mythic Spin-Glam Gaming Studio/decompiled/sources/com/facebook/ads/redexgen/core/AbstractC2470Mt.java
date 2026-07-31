package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2470Mt {
    public static byte[] A04;
    public InterfaceC2468Mr A00;
    public final C3218gi A01;
    public final VA A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract EnumC2467Mq A0G(String str);

    public AbstractC2470Mt(C3218gi c3218gi, VA va, String str) {
        this.A01 = c3218gi;
        this.A02 = va;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
    }

    public static String A0C(AbstractC2470Mt abstractC2470Mt) {
        if (abstractC2470Mt instanceof AnonymousClass84) {
            return A0B(6, 10, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        return A0B(0, 6, 79);
    }

    public final InterfaceC2468Mr A0E() {
        return this.A00;
    }

    public final void A0F(InterfaceC2468Mr interfaceC2468Mr) {
        this.A00 = interfaceC2468Mr;
    }
}
