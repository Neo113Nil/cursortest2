package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0679Mu implements View.OnClickListener {
    public static byte[] A02;
    public final /* synthetic */ YA A00;
    public final /* synthetic */ C0681Mw A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, Ascii.DC4, 33, Ascii.DC2, Ascii.DC4, Ascii.SYN, 39, Ascii.FS, 41, Ascii.FS, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        if (K0.A02(this)) {
            return;
        }
        try {
            str = this.A01.A06;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 35);
            str2 = this.A01.A06;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 33);
            str3 = this.A01.A06;
            Intent intent = new Intent(A002, C0611Kc.A00(str3));
            intent.addFlags(268435456);
            this.A00.A0E().A8W();
            try {
                KN.A0B(this.A00, intent);
            } catch (KL e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A07().A9M(A00(11, 11, 113), C03207x.A00, new C03217y(th));
            }
        } catch (Throwable th2) {
            K0.A00(th2, this);
        }
    }

    public ViewOnClickListenerC0679Mu(C0681Mw c0681Mw, YA ya) {
        this.A01 = c0681Mw;
        this.A00 = ya;
    }
}
