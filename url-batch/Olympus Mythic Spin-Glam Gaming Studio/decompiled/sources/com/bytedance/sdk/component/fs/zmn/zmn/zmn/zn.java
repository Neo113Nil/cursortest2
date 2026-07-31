package com.bytedance.sdk.component.fs.zmn.zmn.zmn;

import com.bytedance.sdk.component.fs.zmn.klz;
import com.bytedance.sdk.component.fs.zmn.rt;
import com.bytedance.sdk.component.fs.zmn.zg;
import java.io.IOException;
import java.util.List;

/* loaded from: classes12.dex */
public class zn implements zg.zmn {
    klz fs;
    List<com.bytedance.sdk.component.fs.zmn.zg> zmn;
    int zn = 0;

    zn(List<com.bytedance.sdk.component.fs.zmn.zg> list, klz klzVar) {
        this.zmn = list;
        this.fs = klzVar;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.zg.zmn
    public klz zmn() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.zg.zmn
    public rt zmn(klz klzVar) throws IOException {
        this.fs = klzVar;
        int i = this.zn + 1;
        this.zn = i;
        if (i >= this.zmn.size()) {
            return null;
        }
        return this.zmn.get(this.zn).zmn(this);
    }
}
