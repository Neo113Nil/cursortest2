package com.bytedance.sdk.openadsdk.core.cn.fb;

import com.bykv.vk.openvk.zmn.zmn.fs.zn.fb;
import com.bykv.vk.openvk.zmn.zmn.zmn.zmn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public class zn extends fb {
    private final zmn fb;
    private final List<fs> zmn = Collections.synchronizedList(new ArrayList());
    private int fs = 1;
    private int zn = 1;

    public interface fs extends zmn.InterfaceC0103zmn {
        void zmn(int i, int i2);
    }

    static /* synthetic */ int zmn(zn znVar) {
        int i = znVar.zn;
        znVar.zn = i + 1;
        return i;
    }

    public zn() {
        zmn zmnVar = new zmn();
        this.fb = zmnVar;
        super.zmn(zmnVar);
        zmn(500);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.fb
    public long olo() {
        return super.olo() * this.fs;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.fb
    public long kgc() {
        long kgc = super.kgc();
        return this.fs == 1 ? kgc : kgc + ((this.zn - 1) * super.olo());
    }

    public void zn(int i) {
        this.fs = Math.max(1, i);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.fs.zn.fb
    public void zmn(zmn.InterfaceC0103zmn interfaceC0103zmn) {
        if (interfaceC0103zmn instanceof fs) {
            if (this.zmn.contains(interfaceC0103zmn)) {
                return;
            }
            this.zmn.add((fs) interfaceC0103zmn);
            return;
        }
        super.zmn(interfaceC0103zmn);
    }

    public int phc() {
        return this.zn;
    }

    private class zmn implements zmn.InterfaceC0103zmn {
        private zmn() {
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            zn.zmn(zn.this);
            if (zn.this.zn <= zn.this.fs) {
                Iterator it = zn.this.zmn.iterator();
                while (it.hasNext()) {
                    ((fs) it.next()).zmn(zn.this.zn, zn.this.fs);
                }
                zn.this.bvs();
                return;
            }
            Iterator it2 = zn.this.zmn.iterator();
            while (it2.hasNext()) {
                ((fs) it2.next()).zmn(zmnVar);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, long j) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).zmn(zmnVar, j);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).fs(zmnVar);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar2) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).zmn(zmnVar, zmnVar2);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, boolean z) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).zmn(zmnVar, z);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).zn(zmnVar);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i, int i2) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).zmn(zmnVar, i, i2);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i, int i2, int i3) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).zmn(zmnVar, i, i2, i3);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).zmn(zmnVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void fs(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, int i) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).fs(zmnVar, i);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar, long j, long j2) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).zmn(zmnVar, j, j2);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void fb(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).fb(zmnVar);
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn.InterfaceC0103zmn
        public void btk(com.bykv.vk.openvk.zmn.zmn.zmn.zmn zmnVar) {
            Iterator it = zn.this.zmn.iterator();
            while (it.hasNext()) {
                ((fs) it.next()).btk(zmnVar);
            }
        }
    }
}
