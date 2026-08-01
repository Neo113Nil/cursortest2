package com.bytedance.sdk.component.NB.vG;

import com.bytedance.sdk.component.NB.qh;
import java.util.Map;

/* compiled from: ImageResponse.java */
/* loaded from: classes.dex */
public class Jd<T> implements qh {
    private T Jd;
    private boolean Mxy;
    private int NB;
    private com.bytedance.sdk.component.NB.yiw Wyp;
    private String icD;
    private String pvs;
    private int qh;
    private int sUS;
    private boolean so;
    private T vG;
    private Map<String, String> yiw;

    public Jd pvs(vG vGVar, T t) {
        this.vG = t;
        this.pvs = vGVar.NB();
        this.icD = vGVar.pvs();
        this.NB = vGVar.icD();
        this.sUS = vGVar.vG();
        this.Mxy = vGVar.bNS();
        this.Wyp = vGVar.mnm();
        this.qh = vGVar.vA();
        return this;
    }

    public Jd pvs(vG vGVar, T t, Map<String, String> map, boolean z) {
        this.yiw = map;
        this.so = z;
        return pvs(vGVar, t);
    }

    @Override // com.bytedance.sdk.component.NB.qh
    public String pvs() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.NB.qh
    public T icD() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.NB.qh
    public T vG() {
        return this.Jd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.NB.qh
    public void pvs(Object obj) {
        this.Jd = this.vG;
        this.vG = obj;
    }

    @Override // com.bytedance.sdk.component.NB.qh
    public Map<String, String> Jd() {
        return this.yiw;
    }

    @Override // com.bytedance.sdk.component.NB.qh
    public boolean NB() {
        return this.so;
    }

    @Override // com.bytedance.sdk.component.NB.qh
    public boolean sUS() {
        return this.Mxy;
    }

    @Override // com.bytedance.sdk.component.NB.qh
    public int yiw() {
        return this.qh;
    }
}
