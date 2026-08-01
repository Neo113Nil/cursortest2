package com.bytedance.sdk.component.NB.vG;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.NB.Ju;
import com.bytedance.sdk.component.NB.cR;
import com.bytedance.sdk.component.NB.kj;
import com.bytedance.sdk.component.NB.rCZ;
import com.bytedance.sdk.component.NB.vA;
import com.bytedance.sdk.component.NB.zM;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadFactory.java */
/* loaded from: classes.dex */
public class sUS {
    private vA Mxy;
    private final Ju icD;
    private com.bytedance.sdk.component.NB.Jd sUS;
    private ExecutorService so;
    private kj yiw;
    private Map<String, List<vG>> pvs = new ConcurrentHashMap();
    private Map<String, cR> vG = new HashMap();
    private Map<String, zM> Jd = new HashMap();
    private Map<String, com.bytedance.sdk.component.NB.vG> NB = new HashMap();

    public sUS(Context context, Ju ju) {
        this.icD = (Ju) so.pvs(ju);
        com.bytedance.sdk.component.NB.vG.pvs.pvs.pvs(context, ju.Mxy());
    }

    public Collection<cR> pvs() {
        return this.vG.values();
    }

    public Collection<zM> icD() {
        return this.Jd.values();
    }

    public Collection<com.bytedance.sdk.component.NB.vG> vG() {
        return this.NB.values();
    }

    public cR pvs(com.bytedance.sdk.component.NB.icD icd) {
        if (icd == null) {
            icd = com.bytedance.sdk.component.NB.vG.pvs.pvs.yiw();
        }
        String file = icd.NB().toString();
        cR cRVar = this.vG.get(file);
        if (cRVar != null) {
            return cRVar;
        }
        cR Jd = Jd(icd);
        this.vG.put(file, Jd);
        return Jd;
    }

    private cR Jd(com.bytedance.sdk.component.NB.icD icd) {
        cR NB = this.icD.NB();
        if (NB != null) {
            return com.bytedance.sdk.component.NB.vG.pvs.icD.pvs.pvs(NB);
        }
        return com.bytedance.sdk.component.NB.vG.pvs.icD.pvs.pvs(icd.icD());
    }

    public zM icD(com.bytedance.sdk.component.NB.icD icd) {
        if (icd == null) {
            icd = com.bytedance.sdk.component.NB.vG.pvs.pvs.yiw();
        }
        String file = icd.NB().toString();
        zM zMVar = this.Jd.get(file);
        if (zMVar != null) {
            return zMVar;
        }
        zM NB = NB(icd);
        this.Jd.put(file, NB);
        return NB;
    }

    private zM NB(com.bytedance.sdk.component.NB.icD icd) {
        zM sUS = this.icD.sUS();
        return sUS != null ? sUS : com.bytedance.sdk.component.NB.vG.pvs.icD.NB.pvs(icd.icD());
    }

    public com.bytedance.sdk.component.NB.vG vG(com.bytedance.sdk.component.NB.icD icd) {
        if (icd == null) {
            icd = com.bytedance.sdk.component.NB.vG.pvs.pvs.yiw();
        }
        String file = icd.NB().toString();
        com.bytedance.sdk.component.NB.vG vGVar = this.NB.get(file);
        if (vGVar != null) {
            return vGVar;
        }
        com.bytedance.sdk.component.NB.vG sUS = sUS(icd);
        this.NB.put(file, sUS);
        return sUS;
    }

    public com.bytedance.sdk.component.NB.vG pvs(String str) {
        return vG(com.bytedance.sdk.component.NB.vG.pvs.pvs.pvs(new File(str)));
    }

    private com.bytedance.sdk.component.NB.vG sUS(com.bytedance.sdk.component.NB.icD icd) {
        com.bytedance.sdk.component.NB.vG yiw = this.icD.yiw();
        return yiw != null ? yiw : new com.bytedance.sdk.component.NB.vG.pvs.pvs.icD(icd.NB(), icd.pvs(), sUS());
    }

    public com.bytedance.sdk.component.NB.Jd Jd() {
        if (this.sUS == null) {
            this.sUS = Mxy();
        }
        return this.sUS;
    }

    private com.bytedance.sdk.component.NB.Jd Mxy() {
        com.bytedance.sdk.component.NB.Jd Jd = this.icD.Jd();
        return Jd == null ? com.bytedance.sdk.component.NB.icD.icD.pvs() : Jd;
    }

    public kj NB() {
        if (this.yiw == null) {
            this.yiw = Wyp();
        }
        return this.yiw;
    }

    private kj Wyp() {
        kj pvs = this.icD.pvs();
        return pvs != null ? pvs : com.bytedance.sdk.component.NB.pvs.icD.pvs();
    }

    public ExecutorService sUS() {
        ExecutorService pvs;
        rCZ vG = this.icD.vG();
        if (vG != null && (pvs = vG.pvs()) != null) {
            return pvs;
        }
        if (this.so == null) {
            this.so = qh();
        }
        return this.so;
    }

    private ExecutorService qh() {
        ExecutorService icD = this.icD.icD();
        return icD != null ? icD : com.bytedance.sdk.component.NB.pvs.vG.pvs();
    }

    public Map<String, List<vG>> yiw() {
        return this.pvs;
    }

    public com.bytedance.sdk.component.NB.vG.icD.pvs pvs(vG vGVar) {
        ImageView.ScaleType Jd = vGVar.Jd();
        if (Jd == null) {
            Jd = com.bytedance.sdk.component.NB.vG.icD.pvs.pvs;
        }
        ImageView.ScaleType scaleType = Jd;
        Bitmap.Config qh = vGVar.qh();
        if (qh == null) {
            qh = com.bytedance.sdk.component.NB.vG.icD.pvs.icD;
        }
        return new com.bytedance.sdk.component.NB.vG.icD.pvs(vGVar.icD(), vGVar.vG(), scaleType, qh, vGVar.yiw(), vGVar.so());
    }

    public vA so() {
        if (this.Mxy == null) {
            this.Mxy = kj();
        }
        return this.Mxy;
    }

    private vA kj() {
        vA so = this.icD.so();
        return so == null ? new yiw() : so;
    }
}
