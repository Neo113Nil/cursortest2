package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Dj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0369Dj extends AbstractC0776Tf<C3Q> {
    public static String[] A01 = {"Etf6rxr38TN0vQCp7eNtUvsDOmNclbJq", "tsAjjvZCMDWdS", "8hGTWRVePtIxVw2NOXuq9knVHvw3DPvW", "EWxkCjZIostDvyF", "5rZAWcCWfjjM2", "LrhlSMt3F2A2PPkpDiBfjHpLA", "jQk7ZNmPb7V9ueUuvUfiKmSE", "mvg7pIDRu6IgLugvRarlC3XDTGoYv5EO"};
    public final /* synthetic */ C01243i A00;

    public C0369Dj(C01243i c01243i) {
        this.A00 = c01243i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3Q c3q) {
        E1 e1;
        E1 e12;
        int A00 = c3q.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            e1 = this.A00.A0C;
            int currentPositionMS2 = e1.getDuration();
            if (A00 == currentPositionMS2) {
                e12 = this.A00.A0C;
                int duration = e12.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        C01243i c01243i = this.A00;
        if (A01[5].length() == 7) {
            throw new RuntimeException();
        }
        A01[5] = "7AA42mFgyTVlZSuOszNfTs49";
        c01243i.A0k(A00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0776Tf
    public final Class<C3Q> A01() {
        return C3Q.class;
    }
}
