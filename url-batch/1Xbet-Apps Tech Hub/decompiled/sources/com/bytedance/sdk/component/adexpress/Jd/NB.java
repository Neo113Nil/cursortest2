package com.bytedance.sdk.component.adexpress.Jd;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.Mxy;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: ImageLoadUtils.java */
/* loaded from: classes.dex */
public class NB {
    private static void icD(ImageView imageView, byte[] bArr, int i, int i2) {
        Jd(imageView, bArr, i, i2);
    }

    private static void vG(ImageView imageView, byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                imageView.setImageDrawable(ImageDecoder.decodeDrawable(ImageDecoder.createSource(wrap)));
            } catch (IOException unused) {
            }
        } else {
            Jd(imageView, bArr, i, i2);
        }
    }

    private static void Jd(ImageView imageView, byte[] bArr, int i, int i2) {
        Bitmap pvs = new com.bytedance.sdk.component.NB.vG.icD.pvs(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).pvs(bArr);
        if (pvs != null) {
            imageView.setImageBitmap(pvs);
        }
    }

    public static void pvs(ImageView imageView, byte[] bArr, int i, int i2) {
        if (TextUtils.equals("png", Mxy.pvs(Arrays.copyOfRange(bArr, 0, Mxy.pvs())))) {
            icD(imageView, bArr, i, i2);
        } else {
            vG(imageView, bArr, i, i2);
        }
    }
}
