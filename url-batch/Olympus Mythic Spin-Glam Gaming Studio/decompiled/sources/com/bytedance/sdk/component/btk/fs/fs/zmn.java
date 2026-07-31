package com.bytedance.sdk.component.btk.fs.fs;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.btk.kw;

/* loaded from: classes5.dex */
public class zmn<T> implements hhw {
    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public boolean zmn(com.bytedance.sdk.component.btk.fs.zn.zn znVar, kw kwVar, com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        Bitmap zmn;
        String zg = znVar.zg();
        znVar.zmn();
        com.bytedance.sdk.component.btk.fs olo = znVar.olo();
        com.bytedance.sdk.component.btk.fs.zn.hhw cyb = znVar.cyb();
        if (olo == null || cyb == null || !olo.btk() || !zmn(znVar) || (zmn = cyb.zmn(olo).zmn(zg)) == null) {
            return true;
        }
        znVar.zmn();
        zmnVar.zmn(new com.bytedance.sdk.component.btk.fs.zn.fb().zmn(znVar, zmn, null, false));
        return false;
    }

    private boolean zmn(com.bytedance.sdk.component.btk.fs.zn.zn znVar) {
        int rc = znVar.rc();
        return rc == 1 || rc == 2;
    }

    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public String zmn() {
        return "bitmap_cache";
    }
}
