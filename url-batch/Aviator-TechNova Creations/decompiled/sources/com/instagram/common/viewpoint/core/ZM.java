package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZM implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ ZO A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, 16, Ascii.GS, 19, 33, Ascii.RS, Ascii.CAN, 19, -35, Ascii.CAN, Ascii.GS, 35, Ascii.DC4, Ascii.GS, 35, -35, 16, Ascii.DC2, 35, Ascii.CAN, Ascii.RS, Ascii.GS, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C1159dL c1159dL;
        C1159dL c1159dL2;
        C1159dL c1159dL3;
        ZN zn;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 12);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 51);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, WQ.A00(str3));
            intent.addFlags(268435456);
            c1159dL = this.A00.A0A;
            c1159dL.A0F().A9q();
            try {
                c1159dL3 = this.A00.A0A;
                WB.A0D(c1159dL3, intent);
                zn = this.A00.A05;
                zn.AEL();
            } catch (W9 e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                c1159dL2 = this.A00.A0A;
                c1159dL2.A08().AAy(A00(11, 11, 3), AbstractC0772Sv.A00, new C0773Sw(th));
            }
        } catch (Throwable th2) {
            AbstractC0838Vl.A00(th2, this);
        }
    }

    public ZM(ZO zo) {
        this.A00 = zo;
    }
}
