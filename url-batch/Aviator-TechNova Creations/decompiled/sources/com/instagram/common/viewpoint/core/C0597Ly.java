package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0597Ly extends AbstractC1231eW {
    public static String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ Y9 A00;

    public C0597Ly(Y9 y9) {
        this.A00 = y9;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1231eW
    public final void A03() {
        Y3 y3;
        C1232eX c1232eX;
        XH xh;
        WeakReference weakReference;
        C1232eX c1232eX2;
        XH xh2;
        Y3 y32;
        C1232eX c1232eX3;
        y3 = this.A00.A07;
        if (y3 != null) {
            y32 = this.A00.A07;
            if (!y32.A0D()) {
                c1232eX3 = this.A00.A09;
                c1232eX3.A0T();
                return;
            }
        }
        c1232eX = this.A00.A09;
        c1232eX.A0V();
        xh = this.A00.A05;
        if (!xh.A07()) {
            xh2 = this.A00.A05;
            xh2.A05();
        }
        weakReference = this.A00.A0B;
        Y8 listener = (Y8) weakReference.get();
        if (listener != null) {
            listener.ADW();
        }
        Y9 y9 = this.A00;
        String[] strArr = A01;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
        strArr2[3] = "nqXy6qNf0NylKakjBUJ";
        c1232eX2 = y9.A09;
        c1232eX2.A0V();
    }
}
