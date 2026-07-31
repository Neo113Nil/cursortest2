package com.bytedance.sdk.component.btk.fs.fs;

import com.bytedance.sdk.component.btk.kgc;
import com.bytedance.sdk.component.btk.kw;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class zn implements hhw {
    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public boolean zmn(com.bytedance.sdk.component.btk.fs.zn.zn znVar, kw kwVar, com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        com.bytedance.sdk.component.btk.fs olo = znVar.olo();
        com.bytedance.sdk.component.btk.fs.zn.hhw cyb = znVar.cyb();
        if (olo != null && cyb != null) {
            if (olo.hhw()) {
                if (kwVar != null) {
                    kwVar.zmn("data_cache", znVar);
                }
                kgc fs = cyb.fs(olo);
                r2 = fs != null ? fs.zmn(znVar.nps()) : null;
                if (kwVar != null) {
                    kwVar.fs("data_cache", znVar);
                }
                znVar.nps();
                znVar.zmn();
            }
            if (olo.nps() && r2 == null) {
                if (kwVar != null) {
                    kwVar.zmn("disk_cache", znVar);
                }
                byte[] zmn = zmn(olo, cyb, znVar.nps());
                if (zmn != null) {
                    zmn(znVar.olo(), cyb, znVar.nps(), zmn);
                }
                if (kwVar != null) {
                    kwVar.fs("disk_cache", znVar);
                }
                znVar.nps();
                znVar.zmn();
                r2 = zmn;
            }
        }
        if (cyb != null && r2 == null) {
            if (kwVar != null) {
                kwVar.zmn("net_request", znVar);
            }
            r2 = zmn(cyb, znVar, zmnVar);
            znVar.nps();
            znVar.zmn();
            if (kwVar != null) {
                kwVar.fs("net_request", znVar);
            }
        }
        if (r2 == null) {
            znVar.nps();
            znVar.zmn();
            return false;
        }
        znVar.zmn(r2);
        return true;
    }

    @Override // com.bytedance.sdk.component.btk.fs.fs.hhw
    public String zmn() {
        return "data_intercept";
    }

    private byte[] zmn(com.bytedance.sdk.component.btk.fs.zn.hhw hhwVar, com.bytedance.sdk.component.btk.fs.zn.zn znVar, com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar) {
        com.bytedance.sdk.component.btk.fb btk = hhwVar.btk();
        znVar.zmn(false);
        try {
            com.bytedance.sdk.component.btk.hhw zmn = btk.zmn(new com.bytedance.sdk.component.btk.zmn.fs(znVar.zmn(), false, false, znVar.kgc()));
            if (zmn == null) {
                zmnVar.zmn(1004, "call is empty", new Exception("call is empty"));
                return null;
            }
            int zmn2 = zmn.zmn();
            if (zmn2 == 200) {
                byte[] bArr = (byte[]) zmn.fs();
                if (bArr == null) {
                    zmnVar.zmn(zmn2, zmn.zn(), new Exception("net data is empty"));
                    return null;
                }
                zmn(znVar.olo(), hhwVar, znVar.nps(), bArr);
                fs(znVar.olo(), hhwVar, znVar.nps(), bArr);
                return bArr;
            }
            Object fs = zmn.fs();
            zmnVar.zmn(zmn2, zmn.zn(), fs instanceof Throwable ? (Throwable) fs : null);
            return null;
        } catch (Throwable th) {
            zmnVar.zmn(1004, "net request failed!", th);
            return null;
        }
    }

    private byte[] zmn(com.bytedance.sdk.component.btk.fs fsVar, com.bytedance.sdk.component.btk.fs.zn.hhw hhwVar, String str) {
        hhwVar.zn(fsVar);
        Collection<com.bytedance.sdk.component.btk.zn> fb = hhwVar.fb();
        if (fb == null) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.btk.zn> it = fb.iterator();
        while (it.hasNext()) {
            byte[] zmn = it.next().zmn((com.bytedance.sdk.component.btk.zn) str);
            if (zmn != null) {
                return zmn;
            }
        }
        return null;
    }

    private void zmn(com.bytedance.sdk.component.btk.fs fsVar, com.bytedance.sdk.component.btk.fs.zn.hhw hhwVar, String str, byte[] bArr) {
        if (fsVar == null || !fsVar.hhw()) {
            return;
        }
        hhwVar.fs(fsVar).zmn(str, bArr);
    }

    private void fs(final com.bytedance.sdk.component.btk.fs fsVar, final com.bytedance.sdk.component.btk.fs.zn.hhw hhwVar, final String str, final byte[] bArr) {
        if (fsVar == null || !fsVar.nps()) {
            return;
        }
        hhwVar.zg().submit(new Runnable() { // from class: com.bytedance.sdk.component.btk.fs.fs.zn.1
            @Override // java.lang.Runnable
            public void run() {
                hhwVar.zn(fsVar).zmn(str, bArr);
            }
        });
    }
}
