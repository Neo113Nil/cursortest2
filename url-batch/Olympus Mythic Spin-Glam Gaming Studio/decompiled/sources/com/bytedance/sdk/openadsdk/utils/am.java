package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class am implements com.bytedance.sdk.component.btk.cyb {
    private final WeakReference<ImageView> zmn;

    public am(ImageView imageView) {
        this.zmn = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.btk.cyb
    public void zmn(com.bytedance.sdk.component.btk.rc rcVar) {
        ImageView imageView = this.zmn.get();
        if (imageView == null) {
            return;
        }
        try {
            Object fs = rcVar.fs();
            if (fs instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) fs);
                return;
            }
            if (fs instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(fs)) {
                    zn$$ExternalSyntheticApiModelOutline0.m(fs).start();
                }
                imageView.setImageDrawable((Drawable) fs);
                return;
            }
            imageView.setVisibility(8);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.btk.cyb
    public void zmn(int i, String str, @Nullable Throwable th) {
        ImageView imageView = this.zmn.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
