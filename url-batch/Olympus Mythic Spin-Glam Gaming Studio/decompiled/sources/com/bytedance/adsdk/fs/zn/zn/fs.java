package com.bytedance.adsdk.fs.zn.zn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.fs.zn.zn.btk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class fs extends zmn {
    private final RectF bvs;
    private final RectF iv;
    private boolean klz;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> nps;
    private final Paint rc;
    private final List<zmn> zg;

    public fs(com.bytedance.adsdk.fs.bvs bvsVar, btk btkVar, List<btk> list, com.bytedance.adsdk.fs.nps npsVar, Context context) {
        super(bvsVar, btkVar);
        int i;
        zmn zmnVar;
        btk.fs klz;
        int i2;
        this.zg = new ArrayList();
        this.bvs = new RectF();
        this.iv = new RectF();
        this.rc = new Paint();
        this.klz = true;
        com.bytedance.adsdk.fs.zn.zmn.fs phc = btkVar.phc();
        if (phc != null) {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn = phc.zmn();
            this.nps = zmn;
            zmn(zmn);
            this.nps.zmn(this);
        } else {
            this.nps = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(npsVar.mw().size());
        int size = list.size() - 1;
        zmn zmnVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            btk btkVar2 = list.get(size);
            zmn zmn2 = zmn.zmn(this, btkVar2, bvsVar, npsVar, context);
            if (zmn2 != null) {
                longSparseArray.put(zmn2.fs().btk(), zmn2);
                if (zmnVar2 != null) {
                    zmnVar2.zmn(zmn2);
                    zmnVar2 = null;
                } else {
                    this.zg.add(0, zmn2);
                    if (btkVar2 != null && (klz = btkVar2.klz()) != null && ((i2 = AnonymousClass1.zmn[klz.ordinal()]) == 1 || i2 == 2)) {
                        zmnVar2 = zmn2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            zmn zmnVar3 = (zmn) longSparseArray.get(longSparseArray.keyAt(i));
            if (zmnVar3 != null && (zmnVar = (zmn) longSparseArray.get(zmnVar3.fs().mw())) != null) {
                zmnVar3.fs(zmnVar);
            }
        }
    }

    /* renamed from: com.bytedance.adsdk.fs.zn.zn.fs$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[btk.fs.values().length];
            zmn = iArr;
            try {
                iArr[btk.fs.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[btk.fs.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void fs(boolean z) {
        this.klz = z;
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public void zmn(boolean z) {
        super.zmn(z);
        Iterator<zmn> it = this.zg.iterator();
        while (it.hasNext()) {
            it.next().zmn(z);
        }
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public void fs(Canvas canvas, Matrix matrix, int i) {
        super.fs(canvas, matrix, i);
        com.bytedance.adsdk.fs.btk.zmn("CompositionLayer#draw");
        this.iv.set(0.0f, 0.0f, this.zn.zg(), this.zn.bvs());
        matrix.mapRect(this.iv);
        boolean z = this.fs.bvs() && this.zg.size() > 1 && i != 255;
        if (z) {
            this.rc.setAlpha(i);
            com.bytedance.adsdk.fs.hhw.hhw.zmn(canvas, this.iv, this.rc);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.zg.size() - 1; size >= 0; size--) {
            if (((this.klz || !"__container".equals(this.zn.hhw())) && !this.iv.isEmpty()) ? canvas.clipRect(this.iv) : true) {
                this.zg.get(size).zmn(canvas, matrix, i);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.fs.btk.fs("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn, com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        super.zmn(rectF, matrix, z);
        for (int size = this.zg.size() - 1; size >= 0; size--) {
            this.bvs.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.zg.get(size).zmn(this.bvs, this.zmn, true);
            rectF.union(this.bvs);
        }
    }

    public List<zmn> klz() {
        return this.zg;
    }

    @Override // com.bytedance.adsdk.fs.zn.zn.zmn
    public void zmn(float f) {
        super.zmn(f);
        if (this.nps != null) {
            f = ((this.nps.nps().floatValue() * this.zn.zmn().klz()) - this.zn.zmn().hhw()) / (this.fs.rp().olo() + 0.01f);
        }
        if (this.nps == null) {
            f -= this.zn.zn();
        }
        if (this.zn.fs() != 0.0f && !"__container".equals(this.zn.hhw())) {
            f /= this.zn.fs();
        }
        for (int size = this.zg.size() - 1; size >= 0; size--) {
            this.zg.get(size).zmn(f);
        }
    }
}
