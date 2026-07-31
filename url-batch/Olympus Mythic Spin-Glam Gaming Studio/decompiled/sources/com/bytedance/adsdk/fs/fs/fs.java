package com.bytedance.adsdk.fs.fs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.fs.fb;
import com.bytedance.adsdk.fs.hhw.hhw;
import com.bytedance.adsdk.fs.iv;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes11.dex */
public class fs {
    private static final Object zmn = new Object();
    private final Map<String, iv> btk;
    private fb fb;
    private final Context fs;
    private final String zn;

    public fs(Drawable.Callback callback, String str, fb fbVar, Map<String, iv> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.zn = str + '/';
        } else {
            this.zn = str;
        }
        this.btk = map;
        zmn(fbVar);
        if (!(callback instanceof View)) {
            this.fs = null;
        } else {
            this.fs = ((View) callback).getContext().getApplicationContext();
        }
    }

    public void zmn(fb fbVar) {
        this.fb = fbVar;
    }

    public Bitmap zmn(String str, Bitmap bitmap) {
        if (bitmap == null) {
            iv ivVar = this.btk.get(str);
            Bitmap rc = ivVar.rc();
            ivVar.zmn(null);
            return rc;
        }
        Bitmap rc2 = this.btk.get(str).rc();
        fs(str, bitmap);
        return rc2;
    }

    public Bitmap zmn(String str) {
        iv ivVar = this.btk.get(str);
        if (ivVar == null) {
            return null;
        }
        Bitmap rc = ivVar.rc();
        if (rc != null) {
            return rc;
        }
        fb fbVar = this.fb;
        if (fbVar != null) {
            return fbVar.zmn(ivVar);
        }
        Context context = this.fs;
        if (context == null) {
            return null;
        }
        String bvs = ivVar.bvs();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (bvs.startsWith("data:") && bvs.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(bvs.substring(bvs.indexOf(44) + 1), 0);
                return fs(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.zn)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.zn + bvs), null, options);
                if (decodeStream == null) {
                    return null;
                }
                return fs(str, hhw.zmn(decodeStream, ivVar.zmn(), ivVar.fs()));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean zmn(Context context) {
        return (context == null && this.fs == null) || this.fs.equals(context);
    }

    private Bitmap fs(String str, Bitmap bitmap) {
        synchronized (zmn) {
            this.btk.get(str).zmn(bitmap);
        }
        return bitmap;
    }
}
