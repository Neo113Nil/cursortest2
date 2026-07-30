package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0523Jc extends AbstractRunnableC0846Vt {
    public static String[] A02 = {"LRx", "usnMdIZ0FvkqiUZevNTWLktoEg5pLAC7", "DXfpDntuFVUaB3iAC9xpEYaXMcysh68b", "KPagnGwIHNxRQqHn90bhIF", "OiThbZ96vqk0YqBrWrlbCPGqj", "zO4ylzajSSdkzzLOGvXbKRrkPLlgkkF6", "2QDKj7W9IPpyibsxcOZVzQQBEZY6mcrJ", "j8cJ2BFMipeHC45SmF0VkU4zcd"};
    public final /* synthetic */ JU A00;
    public final /* synthetic */ boolean A01;

    public C0523Jc(JU ju, boolean z) {
        this.A00 = ju;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C0997ai c0997ai;
        boolean z;
        c0997ai = this.A00.A0N;
        AbstractC0889Xm A0C = c0997ai.A0C();
        if (A0C != null) {
            if (!this.A01) {
                boolean A0B = A0C.A0B();
                if (A02[4].length() != 25) {
                    throw new RuntimeException();
                }
                A02[4] = "GjOMFYo3T7nhomgErVvGRCVPy";
                if (!A0B) {
                    z = true;
                    A0C.setPageDetailsVisible(z);
                    A0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
                }
            }
            z = false;
            A0C.setPageDetailsVisible(z);
            A0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}
