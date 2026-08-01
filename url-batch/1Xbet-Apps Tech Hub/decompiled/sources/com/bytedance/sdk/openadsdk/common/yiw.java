package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.vA;

/* compiled from: LandingPageLoadingStyle.java */
/* loaded from: classes2.dex */
public abstract class yiw {
    protected String[] Jd;
    protected View NB;
    protected final bNS icD;
    protected Context sUS;
    protected String vG;
    protected vA yiw;

    public abstract void icD();

    protected abstract void pvs();

    public abstract void pvs(int i);

    public abstract void vG();

    public yiw(Context context, String str, String[] strArr, bNS bns, vA vAVar) {
        this.vG = str;
        this.Jd = strArr;
        this.sUS = context;
        this.icD = bns;
        this.yiw = vAVar;
        pvs();
    }

    public View NB() {
        return this.NB;
    }

    public void Jd() {
        vG();
        this.NB = null;
        this.sUS = null;
    }
}
