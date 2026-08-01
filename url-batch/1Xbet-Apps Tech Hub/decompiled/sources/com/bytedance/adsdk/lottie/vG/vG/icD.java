package com.bytedance.adsdk.lottie.vG.vG;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.vG.vG.Jd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public class icD extends pvs {
    private final RectF Mxy;
    private final RectF Wyp;
    private boolean kj;
    private final Paint qh;
    private final List<pvs> so;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> yiw;

    public icD(com.bytedance.adsdk.lottie.so soVar, Jd jd, List<Jd> list, com.bytedance.adsdk.lottie.sUS sus) {
        super(soVar, jd);
        int i;
        pvs pvsVar;
        Jd.icD kj;
        int i2;
        this.so = new ArrayList();
        this.Mxy = new RectF();
        this.Wyp = new RectF();
        this.qh = new Paint();
        this.kj = true;
        com.bytedance.adsdk.lottie.vG.pvs.icD rCZ = jd.rCZ();
        if (rCZ != null) {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs = rCZ.pvs();
            this.yiw = pvs;
            pvs(pvs);
            this.yiw.pvs(this);
        } else {
            this.yiw = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(sus.Mxy().size());
        int size = list.size() - 1;
        pvs pvsVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Jd jd2 = list.get(size);
            pvs pvs2 = pvs.pvs(this, jd2, soVar, sus);
            if (pvs2 != null) {
                longSparseArray.put(pvs2.icD().NB(), pvs2);
                if (pvsVar2 != null) {
                    pvsVar2.pvs(pvs2);
                    pvsVar2 = null;
                } else {
                    this.so.add(0, pvs2);
                    if (jd2 != null && (kj = jd2.kj()) != null && ((i2 = AnonymousClass1.pvs[kj.ordinal()]) == 1 || i2 == 2)) {
                        pvsVar2 = pvs2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            pvs pvsVar3 = (pvs) longSparseArray.get(longSparseArray.keyAt(i));
            if (pvsVar3 != null && (pvsVar = (pvs) longSparseArray.get(pvsVar3.icD().Ju())) != null) {
                pvsVar3.icD(pvsVar);
            }
        }
    }

    /* compiled from: CompositionLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.vG.vG.icD$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[Jd.icD.values().length];
            pvs = iArr;
            try {
                iArr[Jd.icD.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[Jd.icD.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void icD(boolean z) {
        this.kj = z;
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    public void pvs(boolean z) {
        super.pvs(z);
        Iterator<pvs> it = this.so.iterator();
        while (it.hasNext()) {
            it.next().pvs(z);
        }
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    void icD(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.lottie.NB.pvs("CompositionLayer#draw");
        this.Wyp.set(0.0f, 0.0f, this.vG.so(), this.vG.Mxy());
        matrix.mapRect(this.Wyp);
        boolean z = this.icD.yiw() && this.so.size() > 1 && i != 255;
        if (z) {
            this.qh.setAlpha(i);
            com.bytedance.adsdk.lottie.sUS.sUS.pvs(canvas, this.Wyp, this.qh);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.so.size() - 1; size >= 0; size--) {
            if (((!this.kj && "__container".equals(this.vG.sUS())) || this.Wyp.isEmpty()) ? true : canvas.clipRect(this.Wyp)) {
                this.so.get(size).pvs(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.lottie.NB.icD("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs, com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        super.pvs(rectF, matrix, z);
        for (int size = this.so.size() - 1; size >= 0; size--) {
            this.Mxy.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.so.get(size).pvs(this.Mxy, this.pvs, true);
            rectF.union(this.Mxy);
        }
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    public void pvs(float f) {
        super.pvs(f);
        if (this.yiw != null) {
            f = ((this.yiw.yiw().floatValue() * this.vG.pvs().so()) - this.vG.pvs().sUS()) / (this.icD.OT().Ju() + 0.01f);
        }
        if (this.yiw == null) {
            f -= this.vG.vG();
        }
        if (this.vG.icD() != 0.0f && !"__container".equals(this.vG.sUS())) {
            f /= this.vG.icD();
        }
        for (int size = this.so.size() - 1; size >= 0; size--) {
            this.so.get(size).pvs(f);
        }
    }
}
