package com.bytedance.sdk.openadsdk.core.ugen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.pvs;
import com.bytedance.sdk.component.NB.mnm;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.NB.so;
import com.bytedance.sdk.openadsdk.core.widget.GifView;
import com.bytedance.sdk.openadsdk.sUS.Jd;
import com.bytedance.sdk.openadsdk.utils.Ju;

/* compiled from: ImageLoaderProvider.java */
/* loaded from: classes2.dex */
public class pvs implements com.bytedance.adsdk.ugeno.pvs {
    @Override // com.bytedance.adsdk.ugeno.pvs
    public void pvs(Context context, String str, ImageView imageView) {
        if (imageView instanceof GifView) {
            final GifView gifView = (GifView) imageView;
            gifView.setAdjustViewBounds(true);
            gifView.setBackgroundColor(Color.parseColor("#00000000"));
            Jd.pvs(str).vG(3).pvs(Bitmap.Config.RGB_565).pvs(new mnm() { // from class: com.bytedance.sdk.openadsdk.core.ugen.pvs.1
                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(int i, String str2, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.NB.mnm
                public void pvs(qh qhVar) {
                    try {
                        Object icD = qhVar.icD();
                        if (icD instanceof byte[]) {
                            if (qhVar.NB()) {
                                gifView.pvs((byte[]) icD, false);
                                gifView.setRepeatConfig(true);
                            } else {
                                gifView.setImageDrawable(Ju.pvs((byte[]) icD, 0));
                            }
                        }
                    } catch (Throwable th) {
                        pvs(1002, "", th);
                    }
                }
            });
            return;
        }
        Jd.pvs(str).pvs(imageView);
    }

    @Override // com.bytedance.adsdk.ugeno.pvs
    public void pvs(final Context context, String str, final float f, final pvs.InterfaceC0037pvs interfaceC0037pvs) {
        Jd.pvs(str).pvs(new so() { // from class: com.bytedance.sdk.openadsdk.core.ugen.pvs.3
            @Override // com.bytedance.sdk.component.NB.so
            public Bitmap pvs(Bitmap bitmap) {
                float f2 = f;
                if (f2 > 0.0f) {
                    return com.bytedance.sdk.component.adexpress.Jd.pvs.pvs(context, bitmap, (int) f2);
                }
                return null;
            }
        }).pvs(new mnm() { // from class: com.bytedance.sdk.openadsdk.core.ugen.pvs.2
            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(int i, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.NB.mnm
            public void pvs(qh qhVar) {
                Object icD = qhVar.icD();
                if (icD instanceof Bitmap) {
                    interfaceC0037pvs.pvs((Bitmap) icD);
                }
            }
        });
    }
}
