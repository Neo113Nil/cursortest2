package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.aK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1037aK implements InterfaceC02715p {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC1045aS A00;
    public final /* synthetic */ InterfaceC01591e A01;
    public final /* synthetic */ C01601f A02;
    public final /* synthetic */ YA A03;
    public final /* synthetic */ boolean A04;

    public C1037aK(C01601f c01601f, YA ya, boolean z, AbstractC1045aS abstractC1045aS, InterfaceC01591e interfaceC01591e) {
        this.A02 = c01601f;
        this.A03 = ya;
        this.A04 = z;
        this.A00 = abstractC1045aS;
        this.A01 = interfaceC01591e;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02715p
    public final void AAW() {
        ArrayList arrayList;
        if (IP.A1P(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(C0719Oi.A01(this.A03, this.A00, 1, new C1038aL(this)));
            return;
        }
        InterfaceC01591e interfaceC01591e = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC01591e.AAQ();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02715p
    public final void AAX() {
        this.A01.AAP(AdError.CACHE_ERROR);
    }
}
