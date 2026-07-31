package com.bytedance.sdk.openadsdk.iqz.zmn;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.fb;
import com.bytedance.sdk.component.utils.iqz;

/* loaded from: classes5.dex */
public class fs {
    private Bitmap btk;
    private Bitmap fb;
    private Drawable fs;
    int zmn;
    private byte[] zn;

    public fs(Drawable drawable, int i) {
        this.zn = null;
        this.fb = null;
        this.btk = null;
        this.fs = drawable;
        this.zmn = i;
    }

    public fs(byte[] bArr, int i) {
        this.fs = null;
        this.fb = null;
        this.btk = null;
        this.zn = bArr;
        this.zmn = i;
    }

    public fs(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.fs = null;
        this.zn = null;
        this.btk = bitmap2;
        this.fb = bitmap;
        this.zmn = i;
    }

    public Bitmap zmn() {
        return this.fb;
    }

    public Bitmap fs() {
        return this.btk;
    }

    public byte[] zn() {
        try {
            if (this.zn == null) {
                this.zn = fb.zmn(this.fb);
            }
        } catch (OutOfMemoryError e) {
            iqz.zn("GifRequestResult", e.getMessage());
        }
        return this.zn;
    }

    public Drawable fb() {
        return this.fs;
    }

    public boolean btk() {
        if (this.fb != null || this.fs != null) {
            return true;
        }
        byte[] bArr = this.zn;
        return bArr != null && bArr.length > 0;
    }
}
