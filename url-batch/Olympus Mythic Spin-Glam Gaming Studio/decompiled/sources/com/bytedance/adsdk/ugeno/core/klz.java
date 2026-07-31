package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.nps;
import com.bytedance.adsdk.ugeno.fs.zmn;
import com.ironsource.C4834q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class klz {
    private cn btk;
    private com.bytedance.adsdk.ugeno.fb.mw bvs;
    private com.bytedance.adsdk.ugeno.fb.zmn.zmn cn;
    private boolean cyb;
    private bvs doe;
    private zg fb;
    private JSONObject fs;
    private kgc hhw;
    private float iqz;
    private nps iv;
    private List<String> kgc;
    private rc klz;
    private btk kw;
    private cyb nps;
    private boolean olo;
    private float phc;
    private String rc;
    private com.bytedance.adsdk.ugeno.fb.rt zg;
    private Context zmn;
    private com.bytedance.adsdk.ugeno.fs.zn<View> zn;
    private boolean mw = true;
    private boolean rt = false;

    public klz(Context context) {
        this.zmn = context;
    }

    public void zmn(String str, rc rcVar) {
        this.klz = rcVar;
        this.rc = str;
        if (rcVar != null) {
            this.fs = rcVar.zmn();
        }
    }

    public com.bytedance.adsdk.ugeno.fs.zn<View> zmn(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.fs = jSONObject2;
        kgc kgcVar = this.hhw;
        if (kgcVar != null) {
            kgcVar.zmn();
        }
        nps npsVar = new nps(jSONObject, jSONObject2, jSONObject3);
        this.iv = npsVar;
        npsVar.zmn(this.iqz, this.phc);
        this.cn = new com.bytedance.adsdk.ugeno.fb.zmn.zmn();
        if (this.btk instanceof com.bytedance.adsdk.ugeno.core.zmn.fs) {
            this.iv.fs();
            throw null;
        }
        this.zn = zmn(this.iv.zmn(), (com.bytedance.adsdk.ugeno.fs.zn<View>) null);
        if (this.doe != null) {
            throw null;
        }
        kgc kgcVar2 = this.hhw;
        if (kgcVar2 != null) {
            kgcVar2.fs();
            this.zn.zmn(this.hhw);
            this.hhw.zn();
        }
        zmn(this.zn);
        if (this.hhw != null) {
            olo oloVar = new olo();
            oloVar.zmn(0);
            oloVar.zmn(this.zn);
            this.hhw.zmn(oloVar);
        }
        return this.zn;
    }

    public com.bytedance.adsdk.ugeno.fs.zn<View> zmn(nps.zmn zmnVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.fs = jSONObject;
        kgc kgcVar = this.hhw;
        if (kgcVar != null) {
            kgcVar.zmn();
        }
        this.cn = new com.bytedance.adsdk.ugeno.fb.zmn.zmn();
        if (this.btk instanceof com.bytedance.adsdk.ugeno.core.zmn.fs) {
            throw null;
        }
        this.zn = zmn(zmnVar, (com.bytedance.adsdk.ugeno.fs.zn<View>) null);
        kgc kgcVar2 = this.hhw;
        if (kgcVar2 != null) {
            kgcVar2.fs();
            this.zn.zmn(this.hhw);
        }
        zmn(this.zn);
        return this.zn;
    }

    public com.bytedance.adsdk.ugeno.fs.zn<View> zmn(nps.zmn zmnVar, com.bytedance.adsdk.ugeno.fs.zn<View> znVar) {
        zmn.C0110zmn c0110zmn;
        List<nps.zmn> zn;
        if (!nps.fb(zmnVar)) {
            return null;
        }
        String fb = zmnVar.fb();
        fs zmn = fb.zmn(fb);
        fs fsVar = zmn;
        if (zmn == null) {
            this.cyb = true;
            if (this.kgc == null) {
                this.kgc = new ArrayList();
            }
            this.kgc.add(fb);
            fb = "View";
            zmnVar.zmn("View");
            fs zmn2 = fb.zmn("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            fsVar = zmn2;
            if (zmn2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
        }
        com.bytedance.adsdk.ugeno.fs.zn zmn3 = fsVar.zmn(this.zmn);
        if (zmn3 == null) {
            return null;
        }
        JSONObject btk = zmnVar.btk();
        zmn3.bvs(com.bytedance.adsdk.ugeno.zn.fs.zmn(zmnVar.zmn(), this.fs));
        zmn3.iv(fb);
        zmn3.zn(btk);
        zmn3.zmn(zmnVar);
        zmn3.fs(this.fs);
        nps npsVar = this.iv;
        if (npsVar == null) {
            zmn3.zmn(true);
        } else {
            zmn3.zmn(npsVar.fb());
        }
        zmn3.zmn(this.klz);
        zmn3.zmn(this.cn);
        Iterator<String> keys = btk.keys();
        if (znVar instanceof com.bytedance.adsdk.ugeno.fs.zmn) {
            com.bytedance.adsdk.ugeno.fs.zmn zmnVar2 = (com.bytedance.adsdk.ugeno.fs.zmn) znVar;
            c0110zmn = zmnVar2.iv();
            zmn3.zmn(zmnVar2);
        } else {
            c0110zmn = null;
        }
        while (keys.hasNext()) {
            String next = keys.next();
            String zmn4 = com.bytedance.adsdk.ugeno.zn.fs.zmn(btk.optString(next), this.fs);
            zmn3.zmn(next, zmn4);
            if (this.doe != null) {
                throw null;
            }
            if (c0110zmn != null) {
                c0110zmn.zmn(this.zmn, next, zmn4);
            }
        }
        if (c0110zmn != null) {
            zmn3.zmn(c0110zmn.zmn());
        }
        if (znVar != null && TextUtils.equals("virtualNode", znVar.tf()) && zmn3.na()) {
            this.olo = true;
        }
        if (zmn3 instanceof com.bytedance.adsdk.ugeno.fs.zmn) {
            List<nps.zmn> hhw = zmnVar.hhw();
            if (hhw == null || hhw.size() <= 0) {
                if (TextUtils.equals(zmn3.fkt(), "RecyclerLayout") && (zn = this.iv.zn()) != null && zn.size() > 0) {
                    Iterator<nps.zmn> it = zn.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.fs.zn<View> zmn5 = zmn(it.next(), (com.bytedance.adsdk.ugeno.fs.zn<View>) zmn3);
                        if (zmn5 != null && zmn5.ww()) {
                            ((com.bytedance.adsdk.ugeno.fs.zmn) zmn3).zmn(zmn5);
                        }
                    }
                }
                return zmn3;
            }
            if (TextUtils.equals(zmn3.fkt(), "Swiper") && hhw.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            try {
                Collections.sort(hhw, new Comparator<nps.zmn>() { // from class: com.bytedance.adsdk.ugeno.core.klz.1
                    @Override // java.util.Comparator
                    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
                    public int compare(nps.zmn zmnVar3, nps.zmn zmnVar4) {
                        return zmnVar3.btk().optInt(C4834q2.u, 0) - zmnVar4.btk().optInt(C4834q2.u, 0);
                    }
                });
            } catch (Throwable unused) {
            }
            Iterator<nps.zmn> it2 = hhw.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.fs.zn<View> zmn6 = zmn(it2.next(), (com.bytedance.adsdk.ugeno.fs.zn<View>) zmn3);
                if (zmn6 != null && !zmn6.na()) {
                    ((com.bytedance.adsdk.ugeno.fs.zmn) zmn3).zmn(zmn6, zmn6.am());
                }
            }
        }
        this.zn = zmn3;
        return zmn3;
    }

    public com.bytedance.adsdk.ugeno.fs.zn<View> zmn(JSONObject jSONObject) {
        kgc kgcVar = this.hhw;
        if (kgcVar != null) {
            kgcVar.zmn();
        }
        nps npsVar = new nps(jSONObject, this.fs);
        this.iv = npsVar;
        if (this.btk instanceof com.bytedance.adsdk.ugeno.core.zmn.fs) {
            npsVar.fs();
            throw null;
        }
        this.zn = fs(npsVar.zmn(), (com.bytedance.adsdk.ugeno.fs.zn<View>) null);
        kgc kgcVar2 = this.hhw;
        if (kgcVar2 != null) {
            kgcVar2.fs();
            this.zn.zmn(this.hhw);
        }
        return this.zn;
    }

    public com.bytedance.adsdk.ugeno.fs.zn<View> fs(nps.zmn zmnVar, com.bytedance.adsdk.ugeno.fs.zn<View> znVar) {
        List<nps.zmn> zn;
        zmn.C0110zmn c0110zmn = null;
        if (!nps.fb(zmnVar)) {
            return null;
        }
        String fb = zmnVar.fb();
        fs zmn = fb.zmn(fb);
        if (zmn == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(fb)));
            this.cyb = true;
            if (this.kgc == null) {
                this.kgc = new ArrayList();
            }
            this.kgc.add(fb);
            return null;
        }
        com.bytedance.adsdk.ugeno.fs.zn zmn2 = zmn.zmn(this.zmn);
        if (zmn2 == null) {
            return null;
        }
        zmn2.bvs(com.bytedance.adsdk.ugeno.zn.fs.zmn(zmnVar.zmn(), this.fs));
        zmn2.iv(fb);
        zmn2.zn(zmnVar.btk());
        zmn2.zmn(zmnVar);
        zmn2.zmn(this.klz);
        if (znVar instanceof com.bytedance.adsdk.ugeno.fs.zmn) {
            com.bytedance.adsdk.ugeno.fs.zmn zmnVar2 = (com.bytedance.adsdk.ugeno.fs.zmn) znVar;
            zmn2.zmn(zmnVar2);
            c0110zmn = zmnVar2.iv();
        }
        Iterator<String> keys = zmnVar.btk().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String zmn3 = com.bytedance.adsdk.ugeno.zn.fs.zmn(zmnVar.btk().optString(next), this.fs);
            zmn2.zmn(next, zmn3);
            if (c0110zmn != null) {
                c0110zmn.zmn(this.zmn, next, zmn3);
            }
        }
        if (zmn2 instanceof com.bytedance.adsdk.ugeno.fs.zmn) {
            List<nps.zmn> hhw = zmnVar.hhw();
            if (hhw == null || hhw.size() <= 0) {
                if (TextUtils.equals(zmn2.fkt(), "RecyclerLayout") && (zn = this.iv.zn()) != null && zn.size() > 0) {
                    Iterator<nps.zmn> it = zn.iterator();
                    while (it.hasNext()) {
                        com.bytedance.adsdk.ugeno.fs.zn<View> fs = fs(it.next(), (com.bytedance.adsdk.ugeno.fs.zn<View>) zmn2);
                        if (fs != null && fs.ww()) {
                            ((com.bytedance.adsdk.ugeno.fs.zmn) zmn2).zmn(fs);
                        }
                    }
                }
                return zmn2;
            }
            if (TextUtils.equals(zmn2.fkt(), "Swiper") && hhw.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<nps.zmn> it2 = hhw.iterator();
            while (it2.hasNext()) {
                com.bytedance.adsdk.ugeno.fs.zn<View> fs2 = fs(it2.next(), (com.bytedance.adsdk.ugeno.fs.zn<View>) zmn2);
                if (fs2 != null && fs2.ww()) {
                    ((com.bytedance.adsdk.ugeno.fs.zmn) zmn2).zmn(fs2);
                }
            }
        }
        if (c0110zmn != null) {
            zmn2.zmn(c0110zmn.zmn());
        }
        this.zn = zmn2;
        return zmn2;
    }

    public void fs(JSONObject jSONObject) {
        kgc kgcVar = this.hhw;
        if (kgcVar != null) {
            kgcVar.zn();
        }
        this.fs = jSONObject;
        zmn(this.zn, jSONObject);
        zmn(this.zn);
        if (this.hhw != null) {
            olo oloVar = new olo();
            oloVar.zmn(0);
            oloVar.zmn(this.zn);
            this.hhw.zmn(oloVar);
        }
    }

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, JSONObject jSONObject) {
        if (znVar == null) {
            return;
        }
        if (znVar instanceof com.bytedance.adsdk.ugeno.fs.zmn) {
            znVar.zmn(jSONObject);
            List<com.bytedance.adsdk.ugeno.fs.zn<View>> bvs = ((com.bytedance.adsdk.ugeno.fs.zmn) znVar).bvs();
            if (bvs == null || bvs.size() <= 0) {
                return;
            }
            Iterator<com.bytedance.adsdk.ugeno.fs.zn<View>> it = bvs.iterator();
            while (it.hasNext()) {
                zmn(it.next(), jSONObject);
            }
            return;
        }
        znVar.zmn(jSONObject);
    }

    private void zmn(com.bytedance.adsdk.ugeno.fs.zn<View> znVar) {
        List<com.bytedance.adsdk.ugeno.fs.zn<View>> bvs;
        if (znVar == null) {
            return;
        }
        JSONObject rp = znVar.rp();
        Iterator<String> keys = rp.keys();
        com.bytedance.adsdk.ugeno.fs.zmn ev = znVar.ev();
        zmn.C0110zmn iv = ev != null ? ev.iv() : null;
        fs(znVar);
        while (keys.hasNext()) {
            String next = keys.next();
            String zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(rp.optString(next), this.fs);
            znVar.zmn(next, zmn);
            if (iv != null) {
                iv.zmn(this.zmn, next, zmn);
            }
        }
        znVar.zmn(this.fb);
        znVar.zmn(this.btk);
        znVar.zmn(this.nps);
        bvs bvsVar = this.doe;
        if (bvsVar != null) {
            znVar.zmn(bvsVar);
        }
        btk btkVar = this.kw;
        if (btkVar != null) {
            znVar.zmn(btkVar);
        }
        com.bytedance.adsdk.ugeno.fb.rt rtVar = this.zg;
        if (rtVar != null) {
            znVar.zmn(rtVar);
        }
        com.bytedance.adsdk.ugeno.fb.mw mwVar = this.bvs;
        if (mwVar != null) {
            znVar.zmn(mwVar);
        }
        if ((znVar instanceof com.bytedance.adsdk.ugeno.fs.zmn) && (bvs = ((com.bytedance.adsdk.ugeno.fs.zmn) znVar).bvs()) != null && bvs.size() > 0) {
            Iterator<com.bytedance.adsdk.ugeno.fs.zn<View>> it = bvs.iterator();
            while (it.hasNext()) {
                zmn(it.next());
            }
        }
        if (iv != null) {
            znVar.zmn(iv.zmn());
        }
        znVar.fs();
    }

    private void fs(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        try {
            if (!znVar.so() || znVar.yj() == null || znVar.yj().nps() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", znVar.yj().nps());
            this.fs.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void zmn(cn cnVar) {
        com.bytedance.adsdk.ugeno.core.zmn.zmn btk = com.bytedance.adsdk.ugeno.btk.zmn().btk();
        if (btk == null) {
            this.btk = cnVar;
        } else {
            if (btk.zmn(cnVar) == null) {
                this.btk = cnVar;
                return;
            }
            throw null;
        }
    }

    public void zmn(cyb cybVar) {
        this.nps = cybVar;
    }

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.fs.zn<View>> bvs;
        if (znVar == null) {
            return;
        }
        znVar.zmn(str, objArr);
        if (!(znVar instanceof com.bytedance.adsdk.ugeno.fs.zmn) || (bvs = ((com.bytedance.adsdk.ugeno.fs.zmn) znVar).bvs()) == null || bvs.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.fs.zn<View>> it = bvs.iterator();
        while (it.hasNext()) {
            zmn(it.next(), str, objArr);
        }
    }

    public boolean zmn() {
        return this.cyb;
    }

    public List<String> fs() {
        return this.kgc;
    }

    public void zmn(btk btkVar) {
        this.kw = btkVar;
    }

    public void zmn(JSONObject jSONObject, com.bytedance.adsdk.ugeno.fs.zn znVar) {
        fs(jSONObject, znVar);
        zmn((com.bytedance.adsdk.ugeno.fs.zn<View>) znVar);
    }

    private void fs(JSONObject jSONObject, com.bytedance.adsdk.ugeno.fs.zn znVar) {
        List<com.bytedance.adsdk.ugeno.fs.zn<View>> bvs;
        if (znVar == null) {
            return;
        }
        this.fs = jSONObject;
        znVar.fs(jSONObject);
        znVar.zmn(this.klz);
        zmn.C0110zmn iv = znVar.ev() != null ? znVar.ev().iv() : null;
        Iterator<String> keys = znVar.rp().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String zmn = com.bytedance.adsdk.ugeno.zn.fs.zmn(znVar.rp().optString(next), jSONObject);
            znVar.zmn(next, zmn);
            if (iv != null) {
                iv.zmn(this.zmn, next, zmn);
            }
        }
        if ((znVar instanceof com.bytedance.adsdk.ugeno.fs.zmn) && (bvs = ((com.bytedance.adsdk.ugeno.fs.zmn) znVar).bvs()) != null && !bvs.isEmpty()) {
            Iterator<com.bytedance.adsdk.ugeno.fs.zn<View>> it = bvs.iterator();
            while (it.hasNext()) {
                fs(jSONObject, it.next());
            }
        }
        if (iv != null) {
            znVar.zmn(iv.zmn());
        }
    }

    public void zmn(com.bytedance.adsdk.ugeno.fb.rt rtVar) {
        this.zg = rtVar;
    }
}
