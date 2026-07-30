package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1539bq extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{31, 26, 26, 27, 10, 31, 23, 18, 13};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C1539bq(C1839gi c1839gi, C1097Na c1097Na, boolean z8, int i, int i4, int i9) {
        super(c1839gi);
        setOrientation(1);
        this.A02 = new TextView(c1839gi);
        YB.A0a(this.A02, true, i);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new TextView(c1839gi);
        this.A00 = new TextView(c1839gi);
        YB.A0a(this.A00, false, i4);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = C1289Up.A17(c1839gi);
        int i10 = this.A03 ? -2 : -1;
        addView(this.A02, new LinearLayout.LayoutParams(i10, -2));
        addView(this.A01, new LinearLayout.LayoutParams(i10, -2));
        this.A01.setVisibility(8);
        A03(c1097Na, z8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, -2);
        layoutParams.setMargins(0, i9, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1539bq(C1839gi c1839gi, C1097Na c1097Na, boolean z8, boolean z9, boolean z10) {
        this(c1839gi, c1097Na, z8, r4, r5, z10 ? r6 / 2 : r6);
        int i = z9 ? 18 : 22;
        int i4 = z9 ? 14 : 16;
        int i9 = A07;
    }

    public final void A02() {
        this.A02.setTypeface(this.A02.getTypeface(), 1);
    }

    public final void A03(C1097Na c1097Na, boolean z8) {
        this.A02.setTextColor(c1097Na.A07(z8));
        this.A01.setTextColor(c1097Na.A05(z8));
        this.A00.setTextColor(c1097Na.A06(z8));
    }

    public final void A04(String str, String str2, String str3, boolean z8, boolean z9) {
        boolean z10 = !TextUtils.isEmpty(str);
        boolean z11 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z10) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z10) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i = 3;
        String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z10 || !z11) {
                TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z8) {
                        i = 2;
                    } else if (z9) {
                        i = 4;
                    }
                    textView3.setMaxLines(i);
                    return;
                }
            } else {
                this.A02.setMaxLines(z8 ? 1 : 2);
                this.A00.setMaxLines(z8 ? 1 : z9 ? 3 : 2);
                return;
            }
        }
        throw new RuntimeException();
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i) {
        if (this.A03) {
            setGravity(i);
        }
        this.A02.setGravity(i);
        this.A00.setGravity(i);
    }

    public void setCTAClickListener(ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr) {
        ViewOnClickListenerC1542bt A03 = AbstractC1543bu.A03(viewOnClickListenerC1037Kr, A00(0, 9, 20));
        this.A02.setOnClickListener(A03);
        this.A00.setOnClickListener(A03);
        this.A01.setOnClickListener(A03);
    }

    public void setDescriptionTextSize(int i) {
        this.A00.setTextSize(i);
    }

    public void setDescriptionVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public void setTitleTextSize(int i) {
        this.A02.setTextSize(i);
    }
}
