package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.de, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1651de extends AnimatorListenerAdapter {
    public static String[] A02 = {"BCZIhVNDQDCh76DtmyNtHAlhFMDATvVt", "BpxJG5PSy8RrC8gDj9F3m7wY3N24XhJv", "ijlTTH3qZVfV3k2EcDrdjmOyjm2IhbRx", "nG1o2sYesXs6M57Sh7jiiyWqAFcBt7Ov", "7oLodlqz52tT27TMmX1w5sX", "BpgZ9fjSEMvqLyG8EKapvQvzg2h53TAK", "RGI6AKM997BtZD7KRZnSFDXmKos5ru", "RnEGi"};
    public final /* synthetic */ AnonymousClass55 A00;
    public final /* synthetic */ boolean A01;

    public C1651de(AnonymousClass55 anonymousClass55, boolean z8) {
        this.A00 = anonymousClass55;
        this.A01 = z8;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z8;
        M3 m32;
        M3 m33;
        super.onAnimationEnd(animator);
        AnonymousClass55 anonymousClass55 = this.A00;
        z8 = this.A00.A0D;
        anonymousClass55.A0w(z8, true);
        if (!this.A01) {
            m32 = this.A00.A06;
            if (m32 != null) {
                m33 = this.A00.A06;
                String[] strArr = A02;
                if (strArr[7].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "ljAGPopRVKGa2tZDYlD1hZgNr97DsQwm";
                strArr2[5] = "7Tfn34ptiafVbRMsYTiCD1YlzW67R4Al";
                m33.destroy();
            }
        }
    }
}
