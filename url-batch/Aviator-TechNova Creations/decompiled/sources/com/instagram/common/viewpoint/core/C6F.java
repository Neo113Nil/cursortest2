package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: com.facebook.ads.redexgen.X.6F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6F extends C1339gI {
    public static String[] A08 = {"3Z4oVcBXIxTGfHDkJENHcNR3oKWZn0O4", "rFv82zPhlr6ageKpcxYW53i7WQEhI", "2tYR0SC80tVMegpE61nD", "NxUbiyfiYIyXyrFLuBvPtjT94e88s", "0hjSAQsR9gnR7LOOW", "3YJcpQnZmcsLDiaVOnEQeEpmcgGPkAOH", "Bqc2ZUTwiywYobMvaWapE1roD64Q2E5u", "7wlgBc9wtLyqXjV7RP"};
    public float A00;
    public int A01;
    public int A02;
    public C6G A03;
    public int[] A04;
    public final C1159dL A05;
    public final C1119cg A06;
    public final C1120ch A07;

    public C6F(C1159dL c1159dL, C1120ch c1120ch, C1119cg c1119cg) {
        super(c1159dL);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1159dL;
        this.A07 = c1120ch;
        this.A06 = c1119cg;
        this.A01 = -1;
        this.A03 = new C6G(this, this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.QO
    public final void A1L(QW qw, C0703Qd c0703Qd, int i, int widthMode) {
        int[] iArr;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A28() == 1) || (mode2 == 1073741824 && A28() == 0)) {
            super.A1L(qw, c0703Qd, i, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArr = this.A06.A02(this.A01);
        } else {
            iArr = new int[]{0, 0};
            if (c0703Qd.A03() >= 1) {
                int i2 = A0Y() > 0 ? 1 : A0Y();
                for (int heightMode = 0; heightMode < i2; heightMode++) {
                    View A1o = A1o(heightMode);
                    if (A1o == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(A1o, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A28() == 0) {
                        iArr[0] = iArr[0] + this.A04[0];
                        if (heightMode == 0) {
                            iArr[1] = this.A04[1] + A0i() + A0f();
                        }
                    } else {
                        iArr[1] = iArr[1] + this.A04[1];
                        if (heightMode == 0) {
                            iArr[0] = this.A04[0] + A0g() + A0h();
                        }
                    }
                }
                int i3 = this.A01;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "c7gaApi93PYPuTyj4vut3Dl9rZW6DyZw";
                strArr2[7] = "eCokdcVdwhThfuMVf9";
                if (i3 != -1) {
                    this.A06.A00(this.A01, iArr);
                }
            }
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        A15(iArr[0], iArr[1]);
    }

    @Override // com.instagram.common.viewpoint.core.C1339gI, com.instagram.common.viewpoint.core.QO
    public final void A1r(int i) {
        A2D(i, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.C1339gI, com.instagram.common.viewpoint.core.QO
    public final void A1z(C02066g c02066g, C0703Qd c0703Qd, int i) {
        this.A03.A0A(i);
        A1N(this.A03);
    }

    public final void A2I(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C6G(this, this.A05);
    }

    public final void A2J(int i) {
        this.A01 = i;
    }

    public final void A2K(int i) {
        this.A02 = i;
    }
}
