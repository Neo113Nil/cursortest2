package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class OC extends QT {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C00530h A00;

    public OC(C00530h c00530h) {
        this.A00 = c00530h;
    }

    @Override // com.instagram.common.viewpoint.core.QT
    public final void A0L(C02066g c02066g, int i) {
        int A25;
        InterfaceC0897Xu interfaceC0897Xu;
        super.A0L(c02066g, i);
        C1339gI linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (A25 = linearLayoutManager.A25()) >= 0) {
            C00530h c00530h = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c00530h.getAdapter() == null || A25 >= this.A00.getAdapter().A0B() || (interfaceC0897Xu = (InterfaceC0897Xu) c02066g.A1F(A25)) == null) {
                return;
            }
            interfaceC0897Xu.AIV();
        }
    }
}
