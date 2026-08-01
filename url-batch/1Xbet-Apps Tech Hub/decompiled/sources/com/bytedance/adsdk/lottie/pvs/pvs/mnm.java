package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: RepeaterContent.java */
/* loaded from: classes.dex */
public class mnm implements pvs.InterfaceC0030pvs, Ju, NB, Wyp, qh {
    private final com.bytedance.adsdk.lottie.vG.vG.pvs Jd;
    private final com.bytedance.adsdk.lottie.pvs.icD.mnm Mxy;
    private final String NB;
    private Jd Wyp;
    private final boolean sUS;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> so;
    private final com.bytedance.adsdk.lottie.so vG;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> yiw;
    private final Matrix pvs = new Matrix();
    private final Path icD = new Path();

    public mnm(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.kj kjVar) {
        this.vG = soVar;
        this.Jd = pvsVar;
        this.NB = kjVar.pvs();
        this.sUS = kjVar.NB();
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs = kjVar.icD().pvs();
        this.yiw = pvs;
        pvsVar.pvs(pvs);
        pvs.pvs(this);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs2 = kjVar.vG().pvs();
        this.so = pvs2;
        pvsVar.pvs(pvs2);
        pvs2.pvs(this);
        com.bytedance.adsdk.lottie.pvs.icD.mnm Wyp = kjVar.Jd().Wyp();
        this.Mxy = Wyp;
        Wyp.pvs(pvsVar);
        Wyp.pvs(this);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Wyp
    public void pvs(ListIterator<vG> listIterator) {
        if (this.Wyp != null) {
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
        this.Wyp = new Jd(this.vG, this.Jd, "Repeater", this.sUS, arrayList, null);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        this.Wyp.pvs(list, list2);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Ju
    public Path Jd() {
        Path Jd = this.Wyp.Jd();
        this.icD.reset();
        float floatValue = this.yiw.yiw().floatValue();
        float floatValue2 = this.so.yiw().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.pvs.set(this.Mxy.icD(i + floatValue2));
            this.icD.addPath(Jd, this.pvs);
        }
        return this.icD;
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.yiw.yiw().floatValue();
        float floatValue2 = this.so.yiw().floatValue();
        float floatValue3 = this.Mxy.icD().yiw().floatValue() / 100.0f;
        float floatValue4 = this.Mxy.vG().yiw().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.pvs.set(matrix);
            float f = i2;
            this.pvs.preConcat(this.Mxy.icD(f + floatValue2));
            this.Wyp.pvs(canvas, this.pvs, (int) (i * com.bytedance.adsdk.lottie.sUS.NB.pvs(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        this.Wyp.pvs(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        this.vG.invalidateSelf();
    }
}
