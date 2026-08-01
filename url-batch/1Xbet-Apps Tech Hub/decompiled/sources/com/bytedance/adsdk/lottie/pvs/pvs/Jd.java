package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* loaded from: classes.dex */
public class Jd implements pvs.InterfaceC0030pvs, Ju, NB {
    private final Path Jd;
    private final com.bytedance.adsdk.lottie.so Mxy;
    private final RectF NB;
    private List<Ju> Wyp;
    private final RectF icD;
    private final Paint pvs;
    private com.bytedance.adsdk.lottie.pvs.icD.mnm qh;
    private final String sUS;
    private final List<vG> so;
    private final Matrix vG;
    private final boolean yiw;

    private static List<vG> pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, List<com.bytedance.adsdk.lottie.vG.icD.vG> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            vG pvs = list.get(i).pvs(soVar, sus, pvsVar);
            if (pvs != null) {
                arrayList.add(pvs);
            }
        }
        return arrayList;
    }

    static com.bytedance.adsdk.lottie.vG.pvs.kj pvs(List<com.bytedance.adsdk.lottie.vG.icD.vG> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.lottie.vG.icD.vG vGVar = list.get(i);
            if (vGVar instanceof com.bytedance.adsdk.lottie.vG.pvs.kj) {
                return (com.bytedance.adsdk.lottie.vG.pvs.kj) vGVar;
            }
        }
        return null;
    }

    public Jd(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.mnm mnmVar, com.bytedance.adsdk.lottie.sUS sus) {
        this(soVar, pvsVar, mnmVar.pvs(), mnmVar.vG(), pvs(soVar, sus, pvsVar, mnmVar.icD()), pvs(mnmVar.icD()));
    }

    Jd(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, String str, boolean z, List<vG> list, com.bytedance.adsdk.lottie.vG.pvs.kj kjVar) {
        this.pvs = new com.bytedance.adsdk.lottie.pvs.pvs();
        this.icD = new RectF();
        this.vG = new Matrix();
        this.Jd = new Path();
        this.NB = new RectF();
        this.sUS = str;
        this.Mxy = soVar;
        this.yiw = z;
        this.so = list;
        if (kjVar != null) {
            com.bytedance.adsdk.lottie.pvs.icD.mnm Wyp = kjVar.Wyp();
            this.qh = Wyp;
            Wyp.pvs(pvsVar);
            this.qh.pvs(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            vG vGVar = list.get(size);
            if (vGVar instanceof Wyp) {
                arrayList.add((Wyp) vGVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((Wyp) arrayList.get(size2)).pvs(list.listIterator(list.size()));
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        this.Mxy.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.so.size());
        arrayList.addAll(list);
        for (int size = this.so.size() - 1; size >= 0; size--) {
            vG vGVar = this.so.get(size);
            vGVar.pvs(arrayList, this.so.subList(0, size));
            arrayList.add(vGVar);
        }
    }

    List<Ju> icD() {
        if (this.Wyp == null) {
            this.Wyp = new ArrayList();
            for (int i = 0; i < this.so.size(); i++) {
                vG vGVar = this.so.get(i);
                if (vGVar instanceof Ju) {
                    this.Wyp.add((Ju) vGVar);
                }
            }
        }
        return this.Wyp;
    }

    Matrix vG() {
        com.bytedance.adsdk.lottie.pvs.icD.mnm mnmVar = this.qh;
        if (mnmVar != null) {
            return mnmVar.Jd();
        }
        this.vG.reset();
        return this.vG;
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Ju
    public Path Jd() {
        this.vG.reset();
        com.bytedance.adsdk.lottie.pvs.icD.mnm mnmVar = this.qh;
        if (mnmVar != null) {
            this.vG.set(mnmVar.Jd());
        }
        this.Jd.reset();
        if (this.yiw) {
            return this.Jd;
        }
        for (int size = this.so.size() - 1; size >= 0; size--) {
            vG vGVar = this.so.get(size);
            if (vGVar instanceof Ju) {
                this.Jd.addPath(((Ju) vGVar).Jd(), this.vG);
            }
        }
        return this.Jd;
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(Canvas canvas, Matrix matrix, int i) {
        if (this.yiw) {
            return;
        }
        this.vG.set(matrix);
        com.bytedance.adsdk.lottie.pvs.icD.mnm mnmVar = this.qh;
        if (mnmVar != null) {
            this.vG.preConcat(mnmVar.Jd());
            i = (int) (((((this.qh.pvs() == null ? 100 : this.qh.pvs().yiw().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.Mxy.yiw() && NB() && i != 255;
        if (z) {
            this.icD.set(0.0f, 0.0f, 0.0f, 0.0f);
            pvs(this.icD, this.vG, true);
            this.pvs.setAlpha(i);
            com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.icD, this.pvs);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.so.size() - 1; size >= 0; size--) {
            vG vGVar = this.so.get(size);
            if (vGVar instanceof NB) {
                ((NB) vGVar).pvs(canvas, this.vG, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean NB() {
        int i = 0;
        for (int i2 = 0; i2 < this.so.size(); i2++) {
            if ((this.so.get(i2) instanceof NB) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        this.vG.set(matrix);
        com.bytedance.adsdk.lottie.pvs.icD.mnm mnmVar = this.qh;
        if (mnmVar != null) {
            this.vG.preConcat(mnmVar.Jd());
        }
        this.NB.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.so.size() - 1; size >= 0; size--) {
            vG vGVar = this.so.get(size);
            if (vGVar instanceof NB) {
                ((NB) vGVar).pvs(this.NB, this.vG, z);
                rectF.union(this.NB);
            }
        }
    }
}
