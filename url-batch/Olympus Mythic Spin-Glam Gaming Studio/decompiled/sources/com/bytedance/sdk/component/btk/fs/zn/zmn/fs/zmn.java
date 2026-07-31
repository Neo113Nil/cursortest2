package com.bytedance.sdk.component.btk.fs.zn.zmn.fs;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.btk.olo;

/* loaded from: classes5.dex */
public class zmn implements olo {
    private com.bytedance.sdk.component.btk.fs.zn.zmn.zn<String, Bitmap> fb;
    private int fs;
    private long zmn = 4194304;
    private int zn;

    public zmn(int i, int i2) {
        this.fs = i2;
        this.zn = i;
        this.fb = new com.bytedance.sdk.component.btk.fs.zn.zmn.zn<>(i2);
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public boolean zmn(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int zmn = zmn(bitmap);
                if (zmn <= this.zmn && zmn != 0) {
                    this.fb.zmn(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public Bitmap zmn(String str) {
        try {
            return this.fb.zmn((com.bytedance.sdk.component.btk.fs.zn.zmn.zn<String, Bitmap>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public boolean fs(String str) {
        return this.fb.zmn((com.bytedance.sdk.component.btk.fs.zn.zmn.zn<String, Bitmap>) str) != null;
    }

    public static int zmn(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
