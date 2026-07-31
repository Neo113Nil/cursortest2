package com.bytedance.sdk.component.fs.zmn.zmn.zmn;

import android.text.TextUtils;
import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rc;

/* loaded from: classes14.dex */
public class fb extends rc {
    public hhw bvs;
    public zmn iv;

    public fb(rc.zmn zmnVar) {
        super(zmnVar);
        hhw hhwVar = new hhw();
        this.bvs = hhwVar;
        this.iv = new zmn(hhwVar.fs());
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rc
    public com.bytedance.sdk.component.fs.zmn.fb fs() {
        return this.bvs;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.rc
    public com.bytedance.sdk.component.fs.zmn.fs zmn(klz klzVar) {
        klzVar.zmn(this);
        if (klzVar.fb() == null || klzVar.fb().zmn() == null || TextUtils.isEmpty(klzVar.fb().zmn().toString())) {
            return null;
        }
        if (zmn.zmn != null && zmn.zmn.fs() && this.iv.btk() && !"setting".equals(klzVar.zg())) {
            fs fsVar = new fs(klzVar, this.iv);
            this.iv.zn().add(fsVar);
            return fsVar;
        }
        fs fsVar2 = new fs(klzVar, this.bvs);
        this.bvs.zn().add(fsVar2);
        return fsVar2;
    }
}
