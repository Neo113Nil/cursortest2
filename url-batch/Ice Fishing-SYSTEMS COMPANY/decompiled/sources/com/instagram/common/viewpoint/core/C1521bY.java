package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1521bY extends RelativeLayout {
    public static String[] A06 = {"5SHdRwFrRc5I045mD2ED8hkR", "u607MEARHNz8UhlPP1yTj4t381pEaF91", "vukf6ONNN7udfcALTJGLQQCjk2MRvNqz", "", "LcpvFkzcfh74Tt7JU5VGWxCVkX9ufVQR", "0vcUNZ0oTZNrvLONhpGozykOOsxw8rlk", "", "YDZhxKGTPmLilHONF7GF9MvjPIJLKPZP"};
    public final int A00;
    public final LinearLayout A01;
    public final C1998jT A02;
    public final C1839gi A03;
    public final VA A04;
    public final InterfaceC1380Yh A05;

    public C1521bY(C1839gi c1839gi, C1998jT c1998jT, VA va, InterfaceC1380Yh interfaceC1380Yh, int i, int i4) {
        super(c1839gi);
        this.A03 = c1839gi;
        this.A02 = c1998jT;
        this.A04 = va;
        this.A05 = interfaceC1380Yh;
        this.A00 = i;
        this.A01 = new LinearLayout(c1839gi);
        A00();
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i4);
    }

    private void A00() {
        int i = 0;
        while (true) {
            int A23 = this.A02.A23();
            String[] strArr = A06;
            String str = strArr[2];
            String str2 = strArr[4];
            int charAt = str.charAt(18);
            int i4 = str2.charAt(18);
            if (charAt == i4) {
                throw new RuntimeException();
            }
            A06[7] = "iNncIzrUEB4NW29LDzlz6YUCQOx5Utak";
            if (i < A23) {
                LF lf = new LF(this.A03, this.A02.A27(i), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i9 = LF.A0C;
                int i10 = LF.A0C;
                int i11 = LF.A0C;
                int i12 = LF.A0C;
                layoutParams.setMargins(i9, i10, i11, i12);
                lf.setLayoutParams(layoutParams);
                this.A01.addView(lf);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i) {
        if (i != 1) {
            this.A01.setOrientation(0);
            this.A01.setPadding(0, this.A00, 0, (int) (this.A00 * 0.25d));
        } else {
            this.A01.setOrientation(1);
            this.A01.setPadding(0, (int) (this.A00 * 1.5d), 0, this.A00);
        }
    }
}
