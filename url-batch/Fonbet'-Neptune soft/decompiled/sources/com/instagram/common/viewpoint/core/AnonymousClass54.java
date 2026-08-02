package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import com.google.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.54, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass54 extends DV {
    public static byte[] A01;
    public final /* synthetic */ C1056bl A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, Ascii.EM, 4};
    }

    public AnonymousClass54(C1056bl c1056bl) {
        this.A00 = c1056bl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(DW dw) {
        InterfaceC1055bk interfaceC1055bk;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new RunnableC1054bj(this));
        interfaceC1055bk = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC1055bk.AFh(A00(0, 5, 126), A03);
    }
}
