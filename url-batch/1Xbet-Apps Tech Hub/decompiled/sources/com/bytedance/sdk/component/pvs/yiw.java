package com.bytedance.sdk.component.pvs;

import com.bytedance.sdk.component.pvs.Jd;
import com.bytedance.sdk.component.pvs.OT;
import com.bytedance.sdk.component.pvs.rCZ;
import com.bytedance.sdk.component.pvs.zM;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* compiled from: CallHandler.java */
/* loaded from: classes.dex */
class yiw implements OT.pvs {
    private final boolean Mxy;
    private final com.bytedance.sdk.component.pvs.pvs Wyp;
    private final uc icD;
    private final so pvs;
    private final boolean so;
    private final Ju yiw;
    private final Map<String, icD> vG = new HashMap();
    private final Map<String, Jd.icD> Jd = new HashMap();
    private final List<mnm> NB = new ArrayList();
    private final Set<Jd> sUS = new HashSet();

    yiw(Wyp wyp, com.bytedance.sdk.component.pvs.pvs pvsVar, rCZ rcz) {
        this.Wyp = pvsVar;
        this.pvs = wyp.Jd;
        uc ucVar = new uc(rcz, wyp.kj, wyp.Ju);
        this.icD = ucVar;
        ucVar.pvs(this);
        ucVar.pvs(wyp.mnm);
        this.yiw = wyp.Mxy;
        this.so = wyp.so;
        this.Mxy = wyp.bNS;
    }

    pvs pvs(mnm mnmVar, sUS sus) throws Exception {
        icD icd = this.vG.get(mnmVar.Jd);
        if (icd != null) {
            try {
                ny icD = icD(sus.icD, icd);
                sus.Jd = icD;
                if (icD == null) {
                    new StringBuilder("Permission denied, call: ").append(mnmVar);
                    throw new cR(-1);
                }
                if (icd instanceof NB) {
                    new StringBuilder("Processing stateless call: ").append(mnmVar);
                    return pvs(mnmVar, (NB) icd, sus);
                }
                if (icd instanceof vG) {
                    new StringBuilder("Processing raw call: ").append(mnmVar);
                    return pvs(mnmVar, (vG) icd, icD);
                }
            } catch (rCZ.pvs unused) {
                new StringBuilder("No remote permission config fetched, call pending: ").append(mnmVar);
                this.NB.add(mnmVar);
                return new pvs(false, ZhG.pvs());
            }
        }
        Jd.icD icd2 = this.Jd.get(mnmVar.Jd);
        if (icd2 != null) {
            Jd pvs2 = icd2.pvs();
            pvs2.pvs(mnmVar.Jd);
            ny icD2 = icD(sus.icD, pvs2);
            sus.Jd = icD2;
            if (icD2 == null) {
                new StringBuilder("Permission denied, call: ").append(mnmVar);
                pvs2.Jd();
                throw new cR(-1);
            }
            new StringBuilder("Processing stateful call: ").append(mnmVar);
            return pvs(mnmVar, pvs2, sus);
        }
        new StringBuilder("Received call: ").append(mnmVar);
        return null;
    }

    void pvs(String str, NB<?, ?> nb) {
        nb.pvs(str);
        this.vG.put(str, nb);
    }

    void pvs(String str, Jd.icD icd) {
        this.Jd.put(str, icd);
    }

    void pvs() {
        Iterator<Jd> it = this.sUS.iterator();
        while (it.hasNext()) {
            it.next().NB();
        }
        this.sUS.clear();
        this.vG.clear();
        this.Jd.clear();
        this.icD.icD(this);
    }

    private pvs pvs(mnm mnmVar, NB nb, sUS sus) throws Exception {
        return new pvs(true, ZhG.pvs(this.pvs.pvs((so) nb.pvs(pvs(mnmVar.NB, (icD) nb), sus))));
    }

    private pvs pvs(final mnm mnmVar, final Jd jd, sUS sus) throws Exception {
        this.sUS.add(jd);
        jd.pvs(pvs(mnmVar.NB, jd), sus, new Jd.pvs() { // from class: com.bytedance.sdk.component.pvs.yiw.1
            @Override // com.bytedance.sdk.component.pvs.Jd.pvs
            public void pvs(Object obj) {
                if (yiw.this.Wyp == null) {
                    return;
                }
                yiw.this.Wyp.icD(ZhG.pvs(yiw.this.pvs.pvs((so) obj)), mnmVar);
                yiw.this.sUS.remove(jd);
            }

            @Override // com.bytedance.sdk.component.pvs.Jd.pvs
            public void pvs(Throwable th) {
                if (yiw.this.Wyp == null) {
                    return;
                }
                yiw.this.Wyp.icD(ZhG.pvs(th), mnmVar);
                yiw.this.sUS.remove(jd);
            }
        });
        return new pvs(false, ZhG.pvs());
    }

    private pvs pvs(final mnm mnmVar, vG vGVar, ny nyVar) throws Exception {
        new zM(mnmVar.Jd, nyVar, new zM.pvs() { // from class: com.bytedance.sdk.component.pvs.yiw.2
        });
        return new pvs(false, ZhG.pvs());
    }

    private Object pvs(String str, icD icd) throws JSONException {
        return this.pvs.pvs(str, pvs(icd)[0]);
    }

    private ny icD(String str, icD icd) {
        if (this.Mxy) {
            return ny.PRIVATE;
        }
        return this.icD.pvs(this.so, str, icd);
    }

    private static Type[] pvs(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            throw new IllegalStateException("Method is not parameterized?!");
        }
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
    }

    /* compiled from: CallHandler.java */
    static final class pvs {
        String icD;
        boolean pvs;

        private pvs(boolean z, String str) {
            this.pvs = z;
            this.icD = str;
        }
    }
}
