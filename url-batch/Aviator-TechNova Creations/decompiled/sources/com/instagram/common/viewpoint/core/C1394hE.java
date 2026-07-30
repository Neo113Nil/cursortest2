package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.hE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1394hE extends AbstractRunnableC0846Vt {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1393hD A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, 38, 48, 55, 49, 44, 58, 99, 52, 34, 48, 99, 45, 44, 55, 99, 32, 34, 47, 47, 38, 39, 109, 123, Byte.MAX_VALUE, 124, 72, 89, 84, 88, 83, 94, 88, 115, 88, 73, 74, 82, 79, 86, 86, 96, 122, 47, 107, 102, 107, 97, 40, 123, 47, 108, 110, 99, 99, 47, 107, 106, 124, 123, 125, 96, 118, 39, 38, 47, 105, 96, 125, 47, 78, 107, 47, 64, 109, 101, 106, 108, 123, 33, 47, 91, 103, 102, 124, 47, 98, 110, 118, 47, 99, 106, 110, 107, 47, 123, 96, 47, 99, 106, 110, 100, 102, 97, 104, 47, 98, 106, 98, 96, 125, 118, 33, 47, 95, 99, 106, 110, 124, 106, 35, 47, 110, 99, 120, 110, 118, 124, 47, 108, 110, 99, 99, 47, 107, 106, 124, 123, 125, 96, 118, 39, 38, 47, 120, 103, 106, 97, 47, 118, 96, 122, 47, 107, 96, 97, 40, 123, 47, 97, 106, 106, 107, 47, 123, 103, 102, 124, 47, 78, 107, 47, 64, 109, 101, 106, 108, 123, 47, 110, 97, 118, 47, 98, 96, 125, 106, 33, 56, 41, 48};
    }

    public C1394hE(AbstractC1393hD abstractC1393hD) {
        this.A00 = abstractC1393hD;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        this.A00.A02.A0F().A3N();
        if (this.A00.A00.A6h() == NZ.A03) {
            return;
        }
        if (!BuildConfigApi.isDebug()) {
            this.A00.A02.A08().ABR(A00(Opcodes.NEWARRAY, 3, 107), AbstractC0772Sv.A0Y, new C0773Sw(A00(0, 23, Opcodes.LREM)));
        }
        Log.e(A00(23, 17, 15), A00(40, Opcodes.LCMP, 61));
        this.A00.A08();
    }
}
