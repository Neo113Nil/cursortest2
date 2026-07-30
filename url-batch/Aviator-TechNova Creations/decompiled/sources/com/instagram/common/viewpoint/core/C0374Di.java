package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Di, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0374Di extends AbstractC0782Tf<C01253d> {
    public static String[] A01 = {"Xm4oO1fgaoMOjj45N8r00LATVp4gHrYG", "MO5WiyOQHdAIBAUWSCIdsXDipyRYP8jB", "8ZD7midsUGLLHTawsvmUwyHXKE63ocNK", "eXsxAyUW", "", "KTVY2IhXiCn688zdyYvQYy9fTV", "AuZpLEz4ubgydEKdqdaVeIvdhtRZUWrW", "O3ESmZOEeO27LGblO6LyKeoijHa02l1o"};
    public final /* synthetic */ C01303i A00;

    public C0374Di(C01303i c01303i) {
        this.A00 = c01303i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C01253d c01253d) {
        int A00 = c01253d.A00();
        int duration = c01253d.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && A00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = A00 + 500;
        if (duration < currentPosition3) {
            if (duration == 0) {
                C01303i c01303i = this.A00;
                int currentPosition4 = this.A00.A00;
                c01303i.A0j(currentPosition4);
                return;
            }
            this.A00.A0j(duration);
            return;
        }
        C01303i c01303i2 = this.A00;
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[0];
        int duration2 = str.charAt(6);
        int currentPosition5 = str2.charAt(6);
        if (duration2 == currentPosition5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "eYEuq0G9XeIp1YNIhTPdTiyuyz";
        strArr2[3] = "ZD2QUH1g";
        c01303i2.A0j(A00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
    public final Class<C01253d> A01() {
        return C01253d.class;
    }
}
