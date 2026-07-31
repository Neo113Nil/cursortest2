package com.bytedance.sdk.openadsdk.iv;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.btk.rc;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.nu;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public class zn implements cyb {
    private final String fs = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> zmn;
    private cyb zn;

    public static cyb zmn(nqi nqiVar, String str, ImageView imageView) {
        return new fs(nqiVar, str, new zn(imageView));
    }

    public static cyb zmn(nqi nqiVar, String str, ImageView imageView, cyb cybVar) {
        return new fs(nqiVar, str, new zn(imageView, cybVar));
    }

    private zn(ImageView imageView, cyb cybVar) {
        this.zmn = new WeakReference<>(imageView);
        this.zn = cybVar;
    }

    private zn(ImageView imageView) {
        this.zmn = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.btk.cyb
    public void zmn(rc rcVar) {
        final ImageView imageView = this.zmn.get();
        if (imageView != null) {
            final Object fs = rcVar.fs();
            if (fs instanceof Bitmap) {
                if (nu.hhw()) {
                    imageView.setImageBitmap((Bitmap) fs);
                } else {
                    cn.zn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.iv.zn.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) fs);
                        }
                    });
                }
                cyb cybVar = this.zn;
                if (cybVar != null) {
                    cybVar.zmn(rcVar);
                    return;
                }
                return;
            }
            if (fs instanceof Drawable) {
                if (nu.hhw()) {
                    zmn(fs, imageView);
                } else {
                    cn.zn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.iv.zn.2
                        @Override // java.lang.Runnable
                        public void run() {
                            zn.this.zmn(fs, imageView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(obj)) {
            zn$$ExternalSyntheticApiModelOutline0.m(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.btk.cyb
    public void zmn(int i, String str, @Nullable Throwable th) {
        cyb cybVar = this.zn;
        if (cybVar != null) {
            cybVar.zmn(i, str, th);
        }
    }
}
