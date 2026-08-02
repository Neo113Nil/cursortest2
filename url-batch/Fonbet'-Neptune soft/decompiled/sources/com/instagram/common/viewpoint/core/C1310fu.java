package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1310fu extends AbstractRunnableC0827Vg {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C1306fq A00;
    public final /* synthetic */ V1 A01;

    public C1310fu(C1306fq c1306fq, V1 v1) {
        this.A00 = c1306fq;
        this.A01 = v1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0827Vg
    public final void A01() {
        C0719Qz c0719Qz;
        C0719Qz c0719Qz2;
        C0719Qz c0719Qz3;
        c0719Qz = this.A00.A01;
        if (c0719Qz.A06() != null) {
            c0719Qz2 = this.A00.A01;
            AdListener A06 = c0719Qz2.A06();
            c0719Qz3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c0719Qz3.A07(), WT.A00(this.A01));
        }
    }
}
