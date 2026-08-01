package com.bytedance.sdk.openadsdk.sUS;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.NB.mnm;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.ae;
import java.lang.ref.WeakReference;

/* compiled from: ImageLoaderToViewWrapper.java */
/* loaded from: classes2.dex */
public class vG implements mnm<Bitmap> {
    private final String icD = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> pvs;

    @Override // com.bytedance.sdk.component.NB.mnm
    public void pvs(int i, String str, Throwable th) {
    }

    public static mnm pvs(cR cRVar, String str, ImageView imageView) {
        return new icD(cRVar, str, new vG(imageView));
    }

    private vG(ImageView imageView) {
        this.pvs = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.NB.mnm
    public void pvs(qh<Bitmap> qhVar) {
        final ImageView imageView = this.pvs.get();
        if (imageView == null || !(qhVar.icD() instanceof Bitmap)) {
            return;
        }
        final Bitmap icD = qhVar.icD();
        if (ae.NB()) {
            imageView.setImageBitmap(icD);
        } else {
            Ju.vG().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sUS.vG.1
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(icD);
                }
            });
        }
    }
}
