package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

@com.bytedance.adsdk.ugeno.yoga.zmn.zmn
/* loaded from: classes4.dex */
public abstract class YogaNodeJNIBase extends iv implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.zmn.zmn
    private float[] arr;
    private fs btk;
    private nps fb;
    private YogaNodeJNIBase fs;
    private Object hhw;

    @com.bytedance.adsdk.ugeno.yoga.zmn.zmn
    private int mLayoutDirection;
    private boolean nps;
    protected long zmn;
    private List<YogaNodeJNIBase> zn;

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.nps = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.zmn = j;
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public int zmn() {
        List<YogaNodeJNIBase> list = this.zn;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase zmn(int i) {
        List<YogaNodeJNIBase> list = this.zn;
        if (list == null) {
            throw new IllegalStateException("YogaNode does not have children");
        }
        return list.get(i);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(iv ivVar, int i) {
        if (ivVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ivVar;
            if (yogaNodeJNIBase.fs != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.zn == null) {
                this.zn = new ArrayList(4);
            }
            this.zn.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.fs = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.zmn, yogaNodeJNIBase.zmn, i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    /* renamed from: fb, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase fs(int i) {
        List<YogaNodeJNIBase> list = this.zn;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase remove = list.remove(i);
        remove.fs = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.zmn, remove.zmn);
        return remove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    /* renamed from: rc, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase fs() {
        return this.fs;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public int zmn(iv ivVar) {
        List<YogaNodeJNIBase> list = this.zn;
        if (list == null) {
            return -1;
        }
        return list.indexOf(ivVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(float f, float f2) {
        fs((iv) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.zn;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.fs(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].zmn;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.zmn, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    private void fs(iv ivVar) {
        iv();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(zn znVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.zmn, znVar.zmn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(btk btkVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.zmn, btkVar.zmn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(hhw hhwVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.zmn, hhwVar.zmn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(zmn zmnVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.zmn, zmnVar.zmn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void fs(zmn zmnVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.zmn, zmnVar.zmn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zn(zmn zmnVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.zmn, zmnVar.zmn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(mw mwVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.zmn, mwVar.zmn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(rt rtVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.zmn, rtVar.zmn());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void fs(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zn(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zn() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.zmn);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(fb fbVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.zmn, fbVar.zmn(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void fs(fb fbVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.zmn, fbVar.zmn(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zn(fb fbVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.zmn, fbVar.zmn(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void fb(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void btk(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void fb() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.zmn);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void hhw(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void nps(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void btk() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.zmn);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zg(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void bvs(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void iv(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void rc(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void klz(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.zmn, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(nps npsVar) {
        this.fb = npsVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.zmn, npsVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(boolean z) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.zmn, z);
    }

    @com.bytedance.adsdk.ugeno.yoga.zmn.zmn
    public final long measure(float f, int i, float f2, int i2) {
        if (!klz()) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        return this.fb.zmn(this, f, zg.zmn(i), f2, zg.zmn(i2));
    }

    @com.bytedance.adsdk.ugeno.yoga.zmn.zmn
    public final float baseline(float f, float f2) {
        return this.btk.zmn(this, f, f2);
    }

    public boolean klz() {
        return this.fb != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public void zmn(Object obj) {
        this.hhw = obj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public Object iv() {
        return this.hhw;
    }

    @com.bytedance.adsdk.ugeno.yoga.zmn.zmn
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.zn;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.zn.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.fs = this;
        return yogaNodeJNIBase.zmn;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public float hhw() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public float nps() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public float zg() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.iv
    public float bvs() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }
}
