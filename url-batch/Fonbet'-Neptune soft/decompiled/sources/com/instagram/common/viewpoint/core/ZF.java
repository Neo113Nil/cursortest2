package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZF implements View.OnClickListener {
    public static byte[] A01;
    public static String[] A02 = {"sP3gpwd6Zoi5atkrMGPTc5EXN8BQ3Rhb", "CuI3HGsHCqf5OUDiTkLeplOhcTm9T7NI", "qUh1oDSzqsBPPR1tLa2Ioa4F3OHVyWz", "9USBf0H8rgb5C7JYpIITcKF8xtKeHlI", "rVv7rCrqZ3PnTP4EIzYeJpV", "KXSca88saLVPZ5uec2yV3IdyBKC0ygXP", "JOf8s03jk9aSXntkdxYTuuj", "1B5kCc4TTNYrg"};
    public final /* synthetic */ ZH A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].charAt(30) == 'J') {
                throw new RuntimeException();
            }
            A02[6] = "NOG9o";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{-68, -67, -54, -48, -49, -107, -67, -57, -68, -55, -58, -106, -93, -108, -106, -104, -87, -98, -85, -98, -87, -82, Ascii.DC4, 33, Ascii.ETB, 37, 34, Ascii.FS, Ascii.ETB, -31, Ascii.FS, 33, 39, Ascii.CAN, 33, 39, -31, Ascii.DC4, Ascii.SYN, 39, Ascii.FS, 34, 33, -31, 9, -4, -8, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C1153dL c1153dL;
        C1153dL c1153dL2;
        C1153dL c1153dL3;
        ZG zg;
        ZG zg2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            str = this.A00.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 38);
            str2 = this.A00.A06;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 126);
            str3 = this.A00.A06;
            Intent intent = new Intent(A002, WQ.A00(str3));
            intent.addFlags(268435456);
            c1153dL = this.A00.A09;
            c1153dL.A0F().A9q();
            try {
                c1153dL3 = this.A00.A09;
                WB.A0D(c1153dL3, intent);
                zg = this.A00.A04;
                if (zg != null) {
                    zg2 = this.A00.A04;
                    zg2.AEL();
                }
            } catch (W9 e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                c1153dL2 = this.A00.A09;
                c1153dL2.A08().AAy(A00(11, 11, 0), AbstractC0766Sv.A00, new C0767Sw(th));
            }
        } catch (Throwable th2) {
            AbstractC0832Vl.A00(th2, this);
        }
    }

    static {
        A01();
    }

    public ZF(ZH zh) {
        this.A00 = zh;
    }
}
