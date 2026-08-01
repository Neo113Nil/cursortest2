package com.bytedance.sdk.component.NB.icD;

import com.bytedance.sdk.component.NB.IP;

/* compiled from: HttpRequest.java */
/* loaded from: classes.dex */
public class vG implements com.bytedance.sdk.component.NB.NB {
    private IP Jd;
    private boolean icD;
    private String pvs;
    private boolean vG;

    public vG(String str, boolean z, boolean z2, IP ip) {
        this.pvs = str;
        this.icD = z;
        this.vG = z2;
        this.Jd = ip;
    }

    @Override // com.bytedance.sdk.component.NB.NB
    public String pvs() {
        return this.pvs;
    }

    @Override // com.bytedance.sdk.component.NB.NB
    public boolean icD() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.NB.NB
    public boolean vG() {
        return this.vG;
    }
}
