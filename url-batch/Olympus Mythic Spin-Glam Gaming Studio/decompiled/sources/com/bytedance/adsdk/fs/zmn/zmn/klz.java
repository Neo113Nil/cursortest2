package com.bytedance.adsdk.fs.zmn.zmn;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.bytedance.adsdk.fs.zn.fs.bvs;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes13.dex */
public class klz implements iv, mw {
    private final String fb;
    private final com.bytedance.adsdk.fs.zn.fs.bvs hhw;
    private final Path zmn = new Path();
    private final Path fs = new Path();
    private final Path zn = new Path();
    private final List<mw> btk = new ArrayList();

    public klz(com.bytedance.adsdk.fs.zn.fs.bvs bvsVar) {
        this.fb = bvsVar.zmn();
        this.hhw = bvsVar;
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.iv
    public void zmn(ListIterator<zn> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            zn previous = listIterator.previous();
            if (previous instanceof mw) {
                this.btk.add((mw) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        for (int i = 0; i < this.btk.size(); i++) {
            this.btk.get(i).zmn(list, list2);
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.mw
    public Path fb() {
        this.zn.reset();
        if (this.hhw.zn()) {
            return this.zn;
        }
        int i = AnonymousClass1.zmn[this.hhw.fs().ordinal()];
        if (i == 1) {
            zmn();
        } else if (i == 2) {
            zmn(Path.Op.UNION);
        } else if (i == 3) {
            zmn(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            zmn(Path.Op.INTERSECT);
        } else if (i == 5) {
            zmn(Path.Op.XOR);
        }
        return this.zn;
    }

    /* renamed from: com.bytedance.adsdk.fs.zmn.zmn.klz$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[bvs.zmn.values().length];
            zmn = iArr;
            try {
                iArr[bvs.zmn.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[bvs.zmn.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[bvs.zmn.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zmn[bvs.zmn.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zmn[bvs.zmn.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void zmn() {
        for (int i = 0; i < this.btk.size(); i++) {
            this.zn.addPath(this.btk.get(i).fb());
        }
    }

    @TargetApi(19)
    private void zmn(Path.Op op) {
        this.fs.reset();
        this.zmn.reset();
        for (int size = this.btk.size() - 1; size > 0; size--) {
            mw mwVar = this.btk.get(size);
            if (mwVar instanceof fb) {
                fb fbVar = (fb) mwVar;
                List<mw> fs = fbVar.fs();
                for (int size2 = fs.size() - 1; size2 >= 0; size2--) {
                    Path fb = fs.get(size2).fb();
                    fb.transform(fbVar.zn());
                    this.fs.addPath(fb);
                }
            } else {
                this.fs.addPath(mwVar.fb());
            }
        }
        mw mwVar2 = this.btk.get(0);
        if (mwVar2 instanceof fb) {
            fb fbVar2 = (fb) mwVar2;
            List<mw> fs2 = fbVar2.fs();
            for (int i = 0; i < fs2.size(); i++) {
                Path fb2 = fs2.get(i).fb();
                fb2.transform(fbVar2.zn());
                this.zmn.addPath(fb2);
            }
        } else {
            this.zmn.set(mwVar2.fb());
        }
        this.zn.op(this.zmn, this.fs, op);
    }
}
