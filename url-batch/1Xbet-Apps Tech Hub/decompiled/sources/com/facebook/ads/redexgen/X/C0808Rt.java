package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0808Rt extends AbstractC0763Qa {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ InterfaceC0565If A00;
    public final /* synthetic */ LN A01;
    public final /* synthetic */ PC A02;
    public final /* synthetic */ C0806Rr A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0808Rt(C0806Rr c0806Rr, String str, PC pc, InterfaceC0565If interfaceC0565If, Map map, LN ln) {
        this.A03 = c0806Rr;
        this.A04 = str;
        this.A02 = pc;
        this.A00 = interfaceC0565If;
        this.A05 = map;
        this.A01 = ln;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0763Qa
    public final void A03() {
        C0764Qb c0764Qb;
        SparseBooleanArray sparseBooleanArray;
        C0764Qb c0764Qb2;
        C1R c1r;
        YA ya;
        SparseBooleanArray sparseBooleanArray2;
        c0764Qb = this.A03.A02;
        if (c0764Qb.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str)) {
            sparseBooleanArray = this.A03.A05;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                InterfaceC0565If interfaceC0565If = this.A00;
                String str2 = this.A04;
                NL nl = new NL(this.A05);
                c0764Qb2 = this.A03.A03;
                interfaceC0565If.A9S(str2, nl.A03(c0764Qb2).A02(this.A01).A05());
                c1r = this.A03.A00;
                ya = this.A03.A06;
                C1R.A07(c1r, ya);
                sparseBooleanArray2 = this.A03.A05;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
