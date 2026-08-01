package com.bytedance.sdk.component.NB.vG.pvs.icD;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.NB.cR;

/* compiled from: MemoryCacheWrapper.java */
/* loaded from: classes.dex */
public class Jd implements cR {
    private final com.bytedance.sdk.component.NB.vG.pvs.icD icD;
    private final cR pvs;

    public Jd(cR cRVar) {
        this(cRVar, null);
    }

    public Jd(cR cRVar, com.bytedance.sdk.component.NB.vG.pvs.icD icd) {
        this.pvs = cRVar;
        this.icD = icd;
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public boolean pvs(String str, Bitmap bitmap) {
        boolean pvs = this.pvs.pvs(str, bitmap);
        if (this.icD != null) {
            Boolean.valueOf(pvs);
        }
        return pvs;
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public Bitmap pvs(String str) {
        return this.pvs.pvs(str);
    }

    @Override // com.bytedance.sdk.component.NB.pvs
    public boolean icD(String str) {
        return this.pvs.icD(str);
    }
}
