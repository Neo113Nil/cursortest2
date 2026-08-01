package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.qh.pvs.pvs;

/* compiled from: ImageBytesHelper.java */
/* loaded from: classes2.dex */
public class Ju {

    /* compiled from: ImageBytesHelper.java */
    public interface pvs {
        void pvs();

        void pvs(com.bytedance.sdk.openadsdk.qh.pvs.icD icd);
    }

    public static void pvs(com.bytedance.sdk.openadsdk.qh.pvs pvsVar, int i, int i2, pvs pvsVar2, String str) {
        pvs(pvsVar, i, i2, pvsVar2, str, 0);
    }

    public static void pvs(com.bytedance.sdk.openadsdk.qh.pvs pvsVar, int i, int i2, final pvs pvsVar2, String str, int i3) {
        com.bytedance.sdk.component.utils.Ju.pvs("splashLoadAd", " getImageBytes url ".concat(String.valueOf(pvsVar)));
        com.bytedance.sdk.openadsdk.qh.vG.pvs().vG().pvs(pvsVar, new pvs.InterfaceC0094pvs() { // from class: com.bytedance.sdk.openadsdk.utils.Ju.1
            @Override // com.bytedance.sdk.openadsdk.qh.pvs.pvs.InterfaceC0094pvs
            public void pvs(String str2, com.bytedance.sdk.openadsdk.qh.pvs.icD icd) {
                pvs pvsVar3;
                if (icd.Jd() && (pvsVar3 = pvs.this) != null) {
                    pvsVar3.pvs(icd);
                    return;
                }
                pvs pvsVar4 = pvs.this;
                if (pvsVar4 != null) {
                    pvsVar4.pvs();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.qh.pvs.pvs.InterfaceC0094pvs
            public void pvs(int i4, String str2, Throwable th) {
                pvs pvsVar3 = pvs.this;
                if (pvsVar3 != null) {
                    pvsVar3.pvs();
                }
            }
        }, i, i2, ImageView.ScaleType.CENTER_INSIDE, str, i3, null);
    }

    public static Drawable pvs(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return new ColorDrawable(0);
        }
        try {
            return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        } catch (Throwable unused) {
            return new ColorDrawable(0);
        }
    }
}
