package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Path;
import com.bytedance.adsdk.lottie.vG.icD.Mxy;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
/* loaded from: classes.dex */
public class kj implements Ju, Wyp {
    private final String Jd;
    private final com.bytedance.adsdk.lottie.vG.icD.Mxy sUS;
    private final Path pvs = new Path();
    private final Path icD = new Path();
    private final Path vG = new Path();
    private final List<Ju> NB = new ArrayList();

    public kj(com.bytedance.adsdk.lottie.vG.icD.Mxy mxy) {
        this.Jd = mxy.pvs();
        this.sUS = mxy;
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Wyp
    public void pvs(ListIterator<vG> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            vG previous = listIterator.previous();
            if (previous instanceof Ju) {
                this.NB.add((Ju) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        for (int i = 0; i < this.NB.size(); i++) {
            this.NB.get(i).pvs(list, list2);
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Ju
    public Path Jd() {
        this.vG.reset();
        if (this.sUS.vG()) {
            return this.vG;
        }
        int i = AnonymousClass1.pvs[this.sUS.icD().ordinal()];
        if (i == 1) {
            pvs();
        } else if (i == 2) {
            pvs(Path.Op.UNION);
        } else if (i == 3) {
            pvs(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            pvs(Path.Op.INTERSECT);
        } else if (i == 5) {
            pvs(Path.Op.XOR);
        }
        return this.vG;
    }

    /* compiled from: MergePathsContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.pvs.pvs.kj$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[Mxy.pvs.values().length];
            pvs = iArr;
            try {
                iArr[Mxy.pvs.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[Mxy.pvs.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pvs[Mxy.pvs.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pvs[Mxy.pvs.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pvs[Mxy.pvs.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void pvs() {
        for (int i = 0; i < this.NB.size(); i++) {
            this.vG.addPath(this.NB.get(i).Jd());
        }
    }

    private void pvs(Path.Op op) {
        this.icD.reset();
        this.pvs.reset();
        for (int size = this.NB.size() - 1; size > 0; size--) {
            Ju ju = this.NB.get(size);
            if (ju instanceof Jd) {
                Jd jd = (Jd) ju;
                List<Ju> icD = jd.icD();
                for (int size2 = icD.size() - 1; size2 >= 0; size2--) {
                    Path Jd = icD.get(size2).Jd();
                    Jd.transform(jd.vG());
                    this.icD.addPath(Jd);
                }
            } else {
                this.icD.addPath(ju.Jd());
            }
        }
        Ju ju2 = this.NB.get(0);
        if (ju2 instanceof Jd) {
            Jd jd2 = (Jd) ju2;
            List<Ju> icD2 = jd2.icD();
            for (int i = 0; i < icD2.size(); i++) {
                Path Jd2 = icD2.get(i).Jd();
                Jd2.transform(jd2.vG());
                this.pvs.addPath(Jd2);
            }
        } else {
            this.pvs.set(ju2.Jd());
        }
        this.vG.op(this.pvs, this.icD, op);
    }
}
