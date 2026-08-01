package com.bykv.vk.openvk.component.video.pvs.icD.NB;

import com.bykv.vk.openvk.component.video.pvs.icD.Mxy;
import com.bytedance.sdk.component.icD.pvs.bNS;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VolleyResponseWrapper.java */
/* loaded from: classes.dex */
public class sUS extends pvs {
    private bNS vG;

    public sUS(bNS bns, NB nb) {
        com.bytedance.sdk.component.icD.pvs.sUS yiw;
        this.vG = bns;
        this.pvs = new ArrayList();
        if (bns != null && (yiw = bns.yiw()) != null) {
            for (int i = 0; i < yiw.pvs(); i++) {
                this.pvs.add(new Mxy.icD(yiw.pvs(i), yiw.icD(i)));
            }
        }
        this.icD = nb;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs
    public int pvs() {
        return this.vG.vG();
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs
    public boolean icD() {
        return this.vG.vG() >= 200 && this.vG.vG() < 300;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs
    public String pvs(String str, String str2) {
        return pvs(str) != null ? pvs(str).icD : str2;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs
    public List<Mxy.icD> vG() {
        return this.pvs;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs
    public InputStream Jd() {
        return this.vG.sUS().vG();
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs
    public String NB() {
        bNS bns = this.vG;
        return (bns == null || bns.so() == null) ? "http/1.1" : this.vG.so().toString();
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.icD.NB.pvs
    public String sUS() {
        return pvs(this.vG.vG());
    }
}
