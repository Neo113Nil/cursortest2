package com.bytedance.adsdk.lottie.icD;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.lottie.Jd;
import com.bytedance.adsdk.lottie.Mxy;
import com.bytedance.adsdk.lottie.sUS.sUS;
import java.io.IOException;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public class icD {
    private static final Object pvs = new Object();
    private Jd Jd;
    private final Map<String, Mxy> NB;
    private final Context icD;
    private final String vG;

    public icD(Drawable.Callback callback, String str, Jd jd, Map<String, Mxy> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.vG = str + '/';
        } else {
            this.vG = str;
        }
        this.NB = map;
        pvs(jd);
        if (!(callback instanceof View)) {
            this.icD = null;
        } else {
            this.icD = ((View) callback).getContext().getApplicationContext();
        }
    }

    public void pvs(Jd jd) {
        this.Jd = jd;
    }

    public Bitmap pvs(String str, Bitmap bitmap) {
        if (bitmap == null) {
            Mxy mxy = this.NB.get(str);
            Bitmap sUS = mxy.sUS();
            mxy.pvs(null);
            return sUS;
        }
        Bitmap sUS2 = this.NB.get(str).sUS();
        icD(str, bitmap);
        return sUS2;
    }

    public Bitmap pvs(String str) {
        Mxy mxy = this.NB.get(str);
        if (mxy == null) {
            return null;
        }
        Bitmap sUS = mxy.sUS();
        if (sUS != null) {
            return sUS;
        }
        Jd jd = this.Jd;
        if (jd != null) {
            return jd.pvs(mxy);
        }
        Context context = this.icD;
        if (context == null) {
            return null;
        }
        String Jd = mxy.Jd();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = Opcodes.IF_ICMPNE;
        if (Jd.startsWith("data:") && Jd.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(Jd.substring(Jd.indexOf(44) + 1), 0);
                return icD(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.vG)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.vG + Jd), null, options);
                if (decodeStream == null) {
                    return null;
                }
                return icD(str, sUS.pvs(decodeStream, mxy.pvs(), mxy.icD()));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean pvs(Context context) {
        return (context == null && this.icD == null) || this.icD.equals(context);
    }

    private Bitmap icD(String str, Bitmap bitmap) {
        synchronized (pvs) {
            this.NB.get(str).pvs(bitmap);
        }
        return bitmap;
    }
}
