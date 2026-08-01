package com.bytedance.sdk.component.NB.vG.pvs.icD;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.NB.cR;

/* compiled from: LruCountBitmapCache.java */
/* loaded from: classes.dex */
public class icD implements cR {
    private int icD;
    private int pvs;
    private com.bytedance.sdk.component.NB.vG.pvs.vG<String, Bitmap> vG;

    public icD(int i, int i2) {
        this.icD = i;
        this.pvs = i2;
        this.vG = new com.bytedance.sdk.component.NB.vG.pvs.vG<String, Bitmap>(i) { // from class: com.bytedance.sdk.component.NB.vG.pvs.icD.icD.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.NB.vG.pvs.vG
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public int icD(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return icD.pvs(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public boolean pvs(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.vG.pvs(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public Bitmap pvs(String str) {
        return this.vG.pvs((com.bytedance.sdk.component.NB.vG.pvs.vG<String, Bitmap>) str);
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public boolean icD(String str) {
        return this.vG.pvs((com.bytedance.sdk.component.NB.vG.pvs.vG<String, Bitmap>) str) != null;
    }

    public static int pvs(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
