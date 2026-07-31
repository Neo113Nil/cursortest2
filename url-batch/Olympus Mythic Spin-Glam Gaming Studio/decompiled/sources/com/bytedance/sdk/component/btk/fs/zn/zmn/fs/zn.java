package com.bytedance.sdk.component.btk.fs.zn.zmn.fs;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.btk.olo;

/* loaded from: classes5.dex */
public class zn implements olo {
    private final com.bytedance.sdk.component.btk.fs.zn.zmn.zmn fs;
    private final olo zmn;

    public zn(olo oloVar) {
        this(oloVar, null);
    }

    public zn(olo oloVar, com.bytedance.sdk.component.btk.fs.zn.zmn.zmn zmnVar) {
        this.zmn = oloVar;
        this.fs = zmnVar;
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public boolean zmn(String str, Bitmap bitmap) {
        return this.zmn.zmn(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public Bitmap zmn(String str) {
        return this.zmn.zmn(str);
    }

    @Override // com.bytedance.sdk.component.btk.zmn
    public boolean fs(String str) {
        return this.zmn.fs(str);
    }
}
