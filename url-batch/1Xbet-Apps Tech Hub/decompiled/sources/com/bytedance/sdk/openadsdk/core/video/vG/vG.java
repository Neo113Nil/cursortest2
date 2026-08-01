package com.bytedance.sdk.openadsdk.core.video.vG;

import com.bykv.vk.openvk.component.video.api.pvs;
import com.bykv.vk.openvk.component.video.pvs.Jd.Jd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportReplayMediaPlayer.java */
/* loaded from: classes2.dex */
public class vG extends Jd {
    private final pvs Jd;
    private final List<icD> pvs = Collections.synchronizedList(new ArrayList());
    private int icD = 1;
    private int vG = 1;

    /* compiled from: SupportReplayMediaPlayer.java */
    public interface icD extends pvs.InterfaceC0018pvs {
        void pvs(int i, int i2);
    }

    static /* synthetic */ int pvs(vG vGVar) {
        int i = vGVar.vG;
        vGVar.vG = i + 1;
        return i;
    }

    public vG() {
        pvs pvsVar = new pvs();
        this.Jd = pvsVar;
        super.pvs(pvsVar);
        pvs(500);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.Jd
    public long mnm() {
        return super.mnm() * this.icD;
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.Jd
    public long vA() {
        return super.vA() + ((this.vG - 1) * super.mnm());
    }

    public void vG(int i) {
        this.icD = Math.max(1, i);
    }

    @Override // com.bykv.vk.openvk.component.video.pvs.Jd.Jd
    public void pvs(pvs.InterfaceC0018pvs interfaceC0018pvs) {
        if (interfaceC0018pvs instanceof icD) {
            if (this.pvs.contains(interfaceC0018pvs)) {
                return;
            }
            this.pvs.add((icD) interfaceC0018pvs);
            return;
        }
        super.pvs(interfaceC0018pvs);
    }

    public int uc() {
        return this.vG;
    }

    /* compiled from: SupportReplayMediaPlayer.java */
    private class pvs implements pvs.InterfaceC0018pvs {
        private pvs() {
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
            vG.pvs(vG.this);
            if (vG.this.vG <= vG.this.icD) {
                Iterator it = vG.this.pvs.iterator();
                while (it.hasNext()) {
                    ((icD) it.next()).pvs(vG.this.vG, vG.this.icD);
                }
                vG.this.Mxy();
                return;
            }
            Iterator it2 = vG.this.pvs.iterator();
            while (it2.hasNext()) {
                ((icD) it2.next()).pvs(pvsVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, long j) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).pvs(pvsVar, j);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void icD(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).icD(pvsVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar2) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).pvs(pvsVar, pvsVar2);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, boolean z) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).pvs(pvsVar, z);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void vG(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).vG(pvsVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i, int i2) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).pvs(pvsVar, i, i2);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i, int i2, int i3) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).pvs(pvsVar, i, i2, i3);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).pvs(pvsVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void icD(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).icD(pvsVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, long j, long j2) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).pvs(pvsVar, j, j2);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void Jd(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).Jd(pvsVar);
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
        public void NB(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
            Iterator it = vG.this.pvs.iterator();
            while (it.hasNext()) {
                ((icD) it.next()).NB(pvsVar);
            }
        }
    }
}
