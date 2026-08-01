package com.bytedance.adsdk.lottie.pvs.icD;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class pvs<K, A> {
    private final vG<K> NB;
    protected com.bytedance.adsdk.lottie.yiw.icD<A> vG;
    final List<InterfaceC0030pvs> pvs = new ArrayList(1);
    private boolean Jd = false;
    protected float icD = 0.0f;
    private A sUS = null;
    private float yiw = -1.0f;
    private float so = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: com.bytedance.adsdk.lottie.pvs.icD.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0030pvs {
        void pvs();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private interface vG<T> {
        float Jd();

        com.bytedance.adsdk.lottie.yiw.pvs<T> icD();

        boolean icD(float f);

        boolean pvs();

        boolean pvs(float f);

        float vG();
    }

    abstract A pvs(com.bytedance.adsdk.lottie.yiw.pvs<K> pvsVar, float f);

    pvs(List<? extends com.bytedance.adsdk.lottie.yiw.pvs<K>> list) {
        this.NB = pvs(list);
    }

    public void pvs() {
        this.Jd = true;
    }

    public void pvs(InterfaceC0030pvs interfaceC0030pvs) {
        this.pvs.add(interfaceC0030pvs);
    }

    public void pvs(float f) {
        if (this.NB.pvs()) {
            return;
        }
        if (f < Mxy()) {
            f = Mxy();
        } else if (f > sUS()) {
            f = sUS();
        }
        if (f == this.icD) {
            return;
        }
        this.icD = f;
        if (this.NB.pvs(f)) {
            icD();
        }
    }

    public void icD() {
        for (int i = 0; i < this.pvs.size(); i++) {
            this.pvs.get(i).pvs();
        }
    }

    protected com.bytedance.adsdk.lottie.yiw.pvs<K> vG() {
        com.bytedance.adsdk.lottie.NB.pvs("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.lottie.yiw.pvs<K> icD2 = this.NB.icD();
        com.bytedance.adsdk.lottie.NB.icD("BaseKeyframeAnimation#getCurrentKeyframe");
        return icD2;
    }

    float Jd() {
        if (this.Jd) {
            return 0.0f;
        }
        com.bytedance.adsdk.lottie.yiw.pvs<K> vG2 = vG();
        if (vG2.NB()) {
            return 0.0f;
        }
        return (this.icD - vG2.vG()) / (vG2.Jd() - vG2.vG());
    }

    protected float NB() {
        com.bytedance.adsdk.lottie.yiw.pvs<K> vG2 = vG();
        if (vG2 == null || vG2.NB()) {
            return 0.0f;
        }
        return vG2.vG.getInterpolation(Jd());
    }

    private float Mxy() {
        if (this.yiw == -1.0f) {
            this.yiw = this.NB.vG();
        }
        return this.yiw;
    }

    float sUS() {
        if (this.so == -1.0f) {
            this.so = this.NB.Jd();
        }
        return this.so;
    }

    public A yiw() {
        A pvs;
        float Jd2 = Jd();
        if (this.vG == null && this.NB.icD(Jd2)) {
            return this.sUS;
        }
        com.bytedance.adsdk.lottie.yiw.pvs<K> vG2 = vG();
        if (vG2.Jd != null && vG2.NB != null) {
            pvs = pvs(vG2, Jd2, vG2.Jd.getInterpolation(Jd2), vG2.NB.getInterpolation(Jd2));
        } else {
            pvs = pvs(vG2, NB());
        }
        this.sUS = pvs;
        return pvs;
    }

    public float so() {
        return this.icD;
    }

    protected A pvs(com.bytedance.adsdk.lottie.yiw.pvs<K> pvsVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> vG<T> pvs(List<? extends com.bytedance.adsdk.lottie.yiw.pvs<T>> list) {
        if (list.isEmpty()) {
            return new icD();
        }
        if (list.size() == 1) {
            return new NB(list);
        }
        return new Jd(list);
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class icD<T> implements vG<T> {
        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public float Jd() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean pvs() {
            return true;
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean pvs(float f) {
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public float vG() {
            return 0.0f;
        }

        private icD() {
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public com.bytedance.adsdk.lottie.yiw.pvs<T> icD() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean icD(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class NB<T> implements vG<T> {
        private float icD = -1.0f;
        private final com.bytedance.adsdk.lottie.yiw.pvs<T> pvs;

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean pvs() {
            return false;
        }

        NB(List<? extends com.bytedance.adsdk.lottie.yiw.pvs<T>> list) {
            this.pvs = list.get(0);
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean pvs(float f) {
            return !this.pvs.NB();
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public com.bytedance.adsdk.lottie.yiw.pvs<T> icD() {
            return this.pvs;
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public float vG() {
            return this.pvs.vG();
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public float Jd() {
            return this.pvs.Jd();
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean icD(float f) {
            if (this.icD == f) {
                return true;
            }
            this.icD = f;
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class Jd<T> implements vG<T> {
        private final List<? extends com.bytedance.adsdk.lottie.yiw.pvs<T>> pvs;
        private com.bytedance.adsdk.lottie.yiw.pvs<T> vG = null;
        private float Jd = -1.0f;
        private com.bytedance.adsdk.lottie.yiw.pvs<T> icD = vG(0.0f);

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean pvs() {
            return false;
        }

        Jd(List<? extends com.bytedance.adsdk.lottie.yiw.pvs<T>> list) {
            this.pvs = list;
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean pvs(float f) {
            if (this.icD.pvs(f)) {
                return !this.icD.NB();
            }
            this.icD = vG(f);
            return true;
        }

        private com.bytedance.adsdk.lottie.yiw.pvs<T> vG(float f) {
            com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar = this.pvs.get(r0.size() - 1);
            if (f >= pvsVar.vG()) {
                return pvsVar;
            }
            for (int size = this.pvs.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar2 = this.pvs.get(size);
                if (this.icD != pvsVar2 && pvsVar2.pvs(f)) {
                    return pvsVar2;
                }
            }
            return this.pvs.get(0);
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public com.bytedance.adsdk.lottie.yiw.pvs<T> icD() {
            return this.icD;
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public float vG() {
            return this.pvs.get(0).vG();
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public float Jd() {
            return this.pvs.get(r0.size() - 1).Jd();
        }

        @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.vG
        public boolean icD(float f) {
            com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar = this.vG;
            com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar2 = this.icD;
            if (pvsVar == pvsVar2 && this.Jd == f) {
                return true;
            }
            this.vG = pvsVar2;
            this.Jd = f;
            return false;
        }
    }
}
