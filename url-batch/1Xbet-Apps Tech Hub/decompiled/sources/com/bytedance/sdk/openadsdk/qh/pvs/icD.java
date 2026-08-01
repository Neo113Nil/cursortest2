package com.bytedance.sdk.openadsdk.qh.pvs;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.Jd;
import com.bytedance.sdk.component.utils.Ju;
import java.util.List;
import java.util.Map;

/* compiled from: GifRequestResult.java */
/* loaded from: classes2.dex */
public class icD {
    private Bitmap Jd;
    private List<Object> NB;
    private byte[] icD;
    int pvs;
    private Map<String, String> sUS;
    private Bitmap vG;

    public icD(byte[] bArr, int i) {
        this.vG = null;
        this.Jd = null;
        this.NB = null;
        this.sUS = null;
        this.icD = bArr;
        this.pvs = i;
    }

    public icD(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.icD = null;
        this.NB = null;
        this.sUS = null;
        this.Jd = bitmap2;
        this.vG = bitmap;
        this.pvs = i;
    }

    public Bitmap pvs() {
        return this.vG;
    }

    public Bitmap icD() {
        return this.Jd;
    }

    public byte[] vG() {
        try {
            if (this.icD == null) {
                this.icD = Jd.pvs(this.vG);
            }
        } catch (OutOfMemoryError e) {
            Ju.pvs("GifRequestResult", e.getMessage());
        }
        return this.icD;
    }

    public boolean Jd() {
        if (this.vG != null) {
            return true;
        }
        byte[] bArr = this.icD;
        return bArr != null && bArr.length > 0;
    }
}
