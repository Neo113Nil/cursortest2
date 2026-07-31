package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class fb implements zmn.InterfaceC0104zmn, btk, mw {
    private final RectF btk;
    private final com.bytedance.adsdk.fs.bvs bvs;
    private final Path fb;
    private final RectF fs;
    private final String hhw;
    private List<mw> iv;
    private final boolean nps;
    private com.bytedance.adsdk.fs.zmn.fs.cyb rc;
    private final List<zn> zg;
    private final Paint zmn;
    private final Matrix zn;

    private static List<zn> zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, List<com.bytedance.adsdk.fs.zn.fs.zn> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            zn zmn = list.get(i).zmn(bvsVar, npsVar, zmnVar);
            if (zmn != null) {
                arrayList.add(zmn);
            }
        }
        return arrayList;
    }

    static com.bytedance.adsdk.fs.zn.zmn.klz zmn(List<com.bytedance.adsdk.fs.zn.fs.zn> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.fs.zn.fs.zn znVar = list.get(i);
            if (znVar instanceof com.bytedance.adsdk.fs.zn.zmn.klz) {
                return (com.bytedance.adsdk.fs.zn.zmn.klz) znVar;
            }
        }
        return null;
    }

    public fb(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.cyb cybVar, com.bytedance.adsdk.fs.nps npsVar) {
        this(bvsVar, zmnVar, cybVar.zmn(), cybVar.zn(), zmn(bvsVar, npsVar, zmnVar, cybVar.fs()), zmn(cybVar.fs()));
    }

    fb(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, String str, boolean z, List<zn> list, com.bytedance.adsdk.fs.zn.zmn.klz klzVar) {
        this.zmn = new com.bytedance.adsdk.fs.zmn.zmn();
        this.fs = new RectF();
        this.zn = new Matrix();
        this.fb = new Path();
        this.btk = new RectF();
        this.hhw = str;
        this.bvs = bvsVar;
        this.nps = z;
        this.zg = list;
        if (klzVar != null) {
            com.bytedance.adsdk.fs.zmn.fs.cyb iv = klzVar.iv();
            this.rc = iv;
            iv.zmn(zmnVar);
            this.rc.zmn(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            zn znVar = list.get(size);
            if (znVar instanceof iv) {
                arrayList.add((iv) znVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((iv) arrayList.get(size2)).zmn(list.listIterator(list.size()));
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        this.bvs.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.zg.size());
        arrayList.addAll(list);
        for (int size = this.zg.size() - 1; size >= 0; size--) {
            zn znVar = this.zg.get(size);
            znVar.zmn(arrayList, this.zg.subList(0, size));
            arrayList.add(znVar);
        }
    }

    List<mw> fs() {
        if (this.iv == null) {
            this.iv = new ArrayList();
            for (int i = 0; i < this.zg.size(); i++) {
                zn znVar = this.zg.get(i);
                if (znVar instanceof mw) {
                    this.iv.add((mw) znVar);
                }
            }
        }
        return this.iv;
    }

    Matrix zn() {
        com.bytedance.adsdk.fs.zmn.fs.cyb cybVar = this.rc;
        if (cybVar != null) {
            return cybVar.fb();
        }
        this.zn.reset();
        return this.zn;
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.mw
    public Path fb() {
        this.zn.reset();
        com.bytedance.adsdk.fs.zmn.fs.cyb cybVar = this.rc;
        if (cybVar != null) {
            this.zn.set(cybVar.fb());
        }
        this.fb.reset();
        if (this.nps) {
            return this.fb;
        }
        for (int size = this.zg.size() - 1; size >= 0; size--) {
            zn znVar = this.zg.get(size);
            if (znVar instanceof mw) {
                this.fb.addPath(((mw) znVar).fb(), this.zn);
            }
        }
        return this.fb;
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(Canvas canvas, Matrix matrix, int i) {
        if (this.nps) {
            return;
        }
        this.zn.set(matrix);
        com.bytedance.adsdk.fs.zmn.fs.cyb cybVar = this.rc;
        if (cybVar != null) {
            this.zn.preConcat(cybVar.fb());
            i = (int) (((((this.rc.zmn() == null ? 100 : this.rc.zmn().nps().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.bvs.bvs() && btk() && i != 255;
        if (z) {
            this.fs.set(0.0f, 0.0f, 0.0f, 0.0f);
            zmn(this.fs, this.zn, true);
            this.zmn.setAlpha(i);
            com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.fs, this.zmn);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.zg.size() - 1; size >= 0; size--) {
            zn znVar = this.zg.get(size);
            if (znVar instanceof btk) {
                ((btk) znVar).zmn(canvas, this.zn, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean btk() {
        int i = 0;
        for (int i2 = 0; i2 < this.zg.size(); i2++) {
            if ((this.zg.get(i2) instanceof btk) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        this.zn.set(matrix);
        com.bytedance.adsdk.fs.zmn.fs.cyb cybVar = this.rc;
        if (cybVar != null) {
            this.zn.preConcat(cybVar.fb());
        }
        this.btk.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.zg.size() - 1; size >= 0; size--) {
            zn znVar = this.zg.get(size);
            if (znVar instanceof btk) {
                ((btk) znVar).zmn(this.btk, this.zn, z);
                rectF.union(this.btk);
            }
        }
    }
}
