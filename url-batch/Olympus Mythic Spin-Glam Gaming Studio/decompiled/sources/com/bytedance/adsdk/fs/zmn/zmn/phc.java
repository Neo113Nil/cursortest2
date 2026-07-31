package com.bytedance.adsdk.fs.zmn.zmn;

import com.bytedance.adsdk.fs.zmn.fs.zmn;
import com.bytedance.adsdk.fs.zn.fs.kw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class phc implements zmn.InterfaceC0104zmn, zn {
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> btk;
    private final kw.zmn fb;
    private final boolean fs;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> hhw;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> nps;
    private final String zmn;
    private final List<zmn.InterfaceC0104zmn> zn = new ArrayList();

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
    }

    public phc(com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.kw kwVar) {
        this.zmn = kwVar.zmn();
        this.fs = kwVar.hhw();
        this.fb = kwVar.fs();
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn = kwVar.fb().zmn();
        this.btk = zmn;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn2 = kwVar.zn().zmn();
        this.hhw = zmn2;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn3 = kwVar.btk().zmn();
        this.nps = zmn3;
        zmnVar.zmn(zmn);
        zmnVar.zmn(zmn2);
        zmnVar.zmn(zmn3);
        zmn.zmn(this);
        zmn2.zmn(this);
        zmn3.zmn(this);
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        for (int i = 0; i < this.zn.size(); i++) {
            this.zn.get(i).zmn();
        }
    }

    void zmn(zmn.InterfaceC0104zmn interfaceC0104zmn) {
        this.zn.add(interfaceC0104zmn);
    }

    kw.zmn fs() {
        return this.fb;
    }

    public com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> zn() {
        return this.btk;
    }

    public com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> fb() {
        return this.hhw;
    }

    public com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> btk() {
        return this.nps;
    }

    public boolean hhw() {
        return this.fs;
    }
}
