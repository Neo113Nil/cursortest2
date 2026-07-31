package com.bytedance.sdk.component.btk.fs.fs;

import android.text.TextUtils;
import com.bytedance.sdk.component.btk.kw;
import com.bytedance.sdk.component.utils.cyb;

/* loaded from: classes4.dex */
public class fs implements hhw {
    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public boolean zmn(com.bytedance.sdk.component.btk.fs.zn.zn znVar, kw kwVar, com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        if (TextUtils.isEmpty(znVar.zg())) {
            String zmn = zmn(znVar);
            znVar.fs(zmn);
            znVar.zmn(zmn);
        }
        znVar.zmn();
        return true;
    }

    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public String zmn() {
        return "generate_key";
    }

    private String zmn(com.bytedance.sdk.component.btk.fs.zn.zn znVar) {
        return cyb.zmn(znVar.zmn());
    }
}
