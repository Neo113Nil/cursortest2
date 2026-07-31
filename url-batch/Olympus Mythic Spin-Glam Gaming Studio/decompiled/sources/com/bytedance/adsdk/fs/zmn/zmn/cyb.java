package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class cyb implements zmn.InterfaceC0104zmn, btk, iv, mw, rc {
    private final String btk;
    private final com.bytedance.adsdk.fs.zmn.fs.cyb bvs;
    private final com.bytedance.adsdk.fs.zn.zn.zmn fb;
    private final boolean hhw;
    private fb iv;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> nps;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zg;
    private final com.bytedance.adsdk.fs.bvs zn;
    private final Matrix zmn = new Matrix();
    private final Path fs = new Path();

    public cyb(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.klz klzVar) {
        this.zn = bvsVar;
        this.fb = zmnVar;
        this.btk = klzVar.zmn();
        this.hhw = klzVar.btk();
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn = klzVar.fs().zmn();
        this.nps = zmn;
        zmnVar.zmn(zmn);
        zmn.zmn(this);
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn2 = klzVar.zn().zmn();
        this.zg = zmn2;
        zmnVar.zmn(zmn2);
        zmn2.zmn(this);
        com.bytedance.adsdk.fs.zmn.fs.cyb iv = klzVar.fb().iv();
        this.bvs = iv;
        iv.zmn(zmnVar);
        iv.zmn(this);
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.iv
    public void zmn(ListIterator<zn> listIterator) {
        if (this.iv != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.iv = new fb(this.zn, this.fb, "Repeater", this.hhw, arrayList, null);
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        this.iv.zmn(list, list2);
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.mw
    public Path fb() {
        Path fb = this.iv.fb();
        this.fs.reset();
        float floatValue = this.nps.nps().floatValue();
        float floatValue2 = this.zg.nps().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.zmn.set(this.bvs.fs(i + floatValue2));
            this.fs.addPath(fb, this.zmn);
        }
        return this.fs;
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.nps.nps().floatValue();
        float floatValue2 = this.zg.nps().floatValue();
        float floatValue3 = this.bvs.fs().nps().floatValue() / 100.0f;
        float floatValue4 = this.bvs.zn().nps().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.zmn.set(matrix);
            float f = i2;
            this.zmn.preConcat(this.bvs.fs(f + floatValue2));
            this.iv.zmn(canvas, this.zmn, (int) (i * com.bytedance.adsdk.fs.hhw.btk.zmn(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        this.iv.zmn(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        this.zn.invalidateSelf();
    }
}
