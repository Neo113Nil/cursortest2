package com.bytedance.sdk.component.btk.zmn;

import com.bytedance.sdk.component.btk.btk;
import com.bytedance.sdk.component.btk.rt;

/* loaded from: classes4.dex */
public class fs implements btk {
    private rt fb;
    private boolean fs;
    private String zmn;
    private boolean zn;

    public fs(String str, boolean z, boolean z2, rt rtVar) {
        this.zmn = str;
        this.fs = z;
        this.zn = z2;
        this.fb = rtVar;
    }

    @Override // com.bytedance.sdk.component.btk.btk
    public String zmn() {
        return this.zmn;
    }

    @Override // com.bytedance.sdk.component.btk.btk
    public boolean fs() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.btk.btk
    public boolean zn() {
        return this.zn;
    }
}
