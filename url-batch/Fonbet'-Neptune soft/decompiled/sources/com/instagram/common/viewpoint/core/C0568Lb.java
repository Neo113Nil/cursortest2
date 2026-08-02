package com.instagram.common.viewpoint.core;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0568Lb implements InterfaceC0885Xo {
    public static byte[] A02;
    public static String[] A03 = {"NTFBcVe31dSo2GnU3Js6iiY0zks5LQys", "Ca9zWfFJkFyFOF3Godi91RgYkRzgzr2p", "cII4QPxWTYmVZfubYcNoLj9MPP8GF9tt", "PE9F3dLYBiF4JqqMXSdTSS6miGDS", "DZYdCvYuTuX3W9uqeE5C1IukMMXrX2Kv", "LDE71mkJxI8TxTUVwO2u55MEQLy5qptr", "oLxvrvG8qZvA3h0mNhA70cq5V56", "NZtOBPQowQq2"};
    public final R0 A00;
    public final C1153dL A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{46, 41, 51, 56, 53, 49, 56, 38, 55, 55, 56, 40, 53, 46, 34, 41, 51, 38, 51, 46, 40, 41, 56, 44, 34, 62, 78, 73, 79, 66, 92, 89, 66, 84, 89, 66, 86, 88, 68, 69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 72, 71, 74, 8, 79, 86, 69, 8, 103, 83, 66, 79, 67, 72, 69, 67, 104, 67, 82, 81, 73, 84, 77, 99, 94, 86, 73, 84, 82, 67, 66, 103, 69, 82, 79, 80, 79, 82, 95};
    }

    static {
        A01();
    }

    public C0568Lb(C1153dL c1153dL, R0 r0) {
        this.A01 = c1153dL;
        this.A00 = r0;
    }

    private final void A02() {
        SN A0G = this.A01.A0G();
        if (A0G != null) {
            Ad A6c = A0G.A6c();
            String[] strArr = A03;
            if (strArr[2].charAt(26) == strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uggbWVrJrahsC4DgFI3QlP54yVqi59lG";
            strArr2[1] = "7cYKYqsJYjxuuUZE8o6LAtyu5uwrvd1J";
            if (A6c != null && A0G.A6g() != null) {
                A0G.A6g().onError(A6c, AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A05().finish();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AAl(Intent intent, Bundle bundle, R0 r0) {
        ComponentName component = new ComponentName(UA.A05(UA.A02.get()), A00(39, 61, 63));
        Intent intent2 = new Intent();
        intent2.setComponent(component);
        String A00 = A00(26, 13, 4);
        intent2.putExtra(A00, intent.getStringExtra(A00));
        String A002 = A00(0, 26, 126);
        intent2.putExtra(A002, intent.getIntExtra(A002, -1));
        try {
            this.A01.A0F().AHT();
            WB.A09(r0.A05(), intent2);
        } catch (W9 unused) {
            A02();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AEV(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AF0(boolean z) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void AIB(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final String getCurrentClientToken() {
        return A00(0, 0, 70);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        this.A01.A0F().AH5();
        if (i2 != -1) {
            this.A01.A0F().AH4(i2);
            A02();
            return false;
        }
        R0 r0 = this.A00;
        String[] strArr = A03;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "sxsZAXbczpYXyJjlUSCXbm3Rr92";
        strArr2[7] = "fqqSdoB1RgIi";
        r0.A05().finish();
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0885Xo
    public final void onDestroy() {
    }
}
