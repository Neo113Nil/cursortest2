package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class MY extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC1471id A00;
    public MX A01;
    public C1159dL A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, Ascii.SI, 71, 64, 66, 68, 67, 78, 78, 74, Ascii.SI, 64, 69, 82, Ascii.SI, 67, 64, 79, 79, 68, 83, Ascii.SI, 66, 77, 72, 66, 74, 68, 69};
    }

    public MY(C1159dL c1159dL, String str, InterfaceC1471id interfaceC1471id, MX mx) {
        this.A02 = c1159dL;
        this.A03 = str;
        this.A01 = mx;
        this.A00 = interfaceC1471id;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        OO.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        OO.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ACb(this.A00);
        }
    }
}
