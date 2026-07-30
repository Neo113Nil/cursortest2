package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ob, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1124Ob extends AbstractC1783fo {
    public static String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ Z2 A00;

    public C1124Ob(Z2 z22) {
        this.A00 = z22;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1783fo
    public final void A03() {
        AbstractC1139Oq abstractC1139Oq;
        C1784fp c1784fp;
        Y2 y22;
        WeakReference weakReference;
        C1784fp c1784fp2;
        Y2 y23;
        AbstractC1139Oq abstractC1139Oq2;
        C1784fp c1784fp3;
        abstractC1139Oq = this.A00.A08;
        if (abstractC1139Oq != null) {
            abstractC1139Oq2 = this.A00.A08;
            if (!abstractC1139Oq2.A0G()) {
                c1784fp3 = this.A00.A0A;
                c1784fp3.A0T();
                return;
            }
        }
        c1784fp = this.A00.A0A;
        c1784fp.A0V();
        y22 = this.A00.A06;
        if (!y22.A07()) {
            y23 = this.A00.A06;
            y23.A05();
        }
        weakReference = this.A00.A0C;
        Z1 listener = (Z1) weakReference.get();
        if (listener != null) {
            listener.AEA();
        }
        Z2 z22 = this.A00;
        String[] strArr = A01;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
        strArr2[3] = "nqXy6qNf0NylKakjBUJ";
        c1784fp2 = z22.A0A;
        c1784fp2.A0V();
    }
}
