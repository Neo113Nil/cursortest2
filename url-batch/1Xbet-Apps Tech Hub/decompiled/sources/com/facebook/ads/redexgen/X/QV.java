package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* loaded from: assets/audience_network.dex */
public class QV implements View.OnTouchListener {
    public static String[] A01 = {"mce3RnjQuKnQyZwY2MYCRKsU6qDPnRTv", "6i", "za", "wlJBNttigYYlx2yteY8tG49BlED6WsVY", "MVnjYKLYm17azeeTFPLJcrer3BwrjfHl", "3Wee1YLSMyRTxC38n8Qm6eLBL9IfF0GN", "3z6wLog4xxMob0RUOVoWJU4Ax22Nftgw", "VSwWIM7jHdG3nIkp1OJVw48UFn88gUH7"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0569Ij A00;

    public QV(TextureViewSurfaceTextureListenerC0569Ij textureViewSurfaceTextureListenerC0569Ij) {
        this.A00 = textureViewSurfaceTextureListenerC0569Ij;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r4.isShowing() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r0 = r5.A00.A0A;
        r0.hide();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        r0 = r5.A00.A0A;
        r0.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r4.isShowing() != false) goto L15;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        MediaController mediaController;
        MediaController mediaController2;
        z = this.A00.A0G;
        if (z) {
            return true;
        }
        mediaController = this.A00.A0A;
        String[] strArr = A01;
        if (strArr[4].charAt(0) == strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "HvEVRWVu4b3A6ir0KswDbL9zFlDBl7Vo";
        strArr2[3] = "aSdZu49XGoInnb2I2ybBtqTd8GDfXNZF";
        if (mediaController != null && motionEvent.getAction() == 1) {
            mediaController2 = this.A00.A0A;
            if (A01[7].charAt(9) != 'o') {
                A01[5] = "PKAZCNEBQS248pKbgoN5vL2n8kWbkeSf";
            } else {
                String[] strArr3 = A01;
                strArr3[0] = "se9uNVwp2KR0SqcPH5E6zAp8mBDLV9kP";
                strArr3[3] = "7jkgWI5wEJtN4OtVk5f4fU2wMaDr3zYP";
            }
        }
        return true;
    }
}
