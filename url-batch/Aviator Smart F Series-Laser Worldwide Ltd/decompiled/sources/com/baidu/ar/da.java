package com.baidu.ar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.photo.PhotoCallback;
import java.io.File;

/* loaded from: classes.dex */
public class da implements com.baidu.ar.arplay.core.renderer.TakePictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public String f2045a;

    /* renamed from: b, reason: collision with root package name */
    public PhotoCallback f2046b;

    public void a(IARRenderer iARRenderer, String str, PhotoCallback photoCallback) {
        if (iARRenderer == null || TextUtils.isEmpty(str) || photoCallback == null) {
            return;
        }
        this.f2045a = str;
        this.f2046b = photoCallback;
        iARRenderer.getSnapShot(this);
    }

    @Override // com.baidu.ar.arplay.core.renderer.TakePictureCallback
    public void onPictureTake(boolean z7, Bitmap bitmap, long j8) {
        if (this.f2046b == null || TextUtils.isEmpty(this.f2045a)) {
            return;
        }
        j4.d(new File(this.f2045a));
        j4.a(this.f2045a, bitmap, 100);
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f2046b.onPictureTake(z7, this.f2045a);
    }
}
