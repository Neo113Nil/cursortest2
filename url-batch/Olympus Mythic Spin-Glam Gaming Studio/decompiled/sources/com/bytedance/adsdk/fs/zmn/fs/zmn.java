package com.bytedance.adsdk.fs.zmn.fs;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zmn<K, A> {
    private final zn<K> btk;
    protected com.bytedance.adsdk.fs.nps.fs<A> zn;
    final List<InterfaceC0104zmn> zmn = new ArrayList(1);
    private boolean fb = false;
    protected float fs = 0.0f;
    private A hhw = null;
    private float nps = -1.0f;
    private float zg = -1.0f;

    /* renamed from: com.bytedance.adsdk.fs.zmn.fs.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0104zmn {
        void zmn();
    }

    private interface zn<T> {
        float fb();

        com.bytedance.adsdk.fs.nps.zmn<T> fs();

        boolean fs(float f);

        boolean zmn();

        boolean zmn(float f);

        float zn();
    }

    abstract A zmn(com.bytedance.adsdk.fs.nps.zmn<K> zmnVar, float f);

    zmn(List<? extends com.bytedance.adsdk.fs.nps.zmn<K>> list) {
        this.btk = zmn(list);
    }

    public void zmn() {
        this.fb = true;
    }

    public void zmn(InterfaceC0104zmn interfaceC0104zmn) {
        this.zmn.add(interfaceC0104zmn);
    }

    public void zmn(float f) {
        if (this.btk.zmn()) {
            return;
        }
        if (f < bvs()) {
            f = bvs();
        } else if (f > hhw()) {
            f = hhw();
        }
        if (f == this.fs) {
            return;
        }
        this.fs = f;
        if (this.btk.zmn(f)) {
            fs();
        }
    }

    public void fs() {
        for (int i = 0; i < this.zmn.size(); i++) {
            this.zmn.get(i).zmn();
        }
    }

    protected com.bytedance.adsdk.fs.nps.zmn<K> zn() {
        com.bytedance.adsdk.fs.btk.zmn("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.fs.nps.zmn<K> fs2 = this.btk.fs();
        com.bytedance.adsdk.fs.btk.fs("BaseKeyframeAnimation#getCurrentKeyframe");
        return fs2;
    }

    float fb() {
        if (this.fb) {
            return 0.0f;
        }
        com.bytedance.adsdk.fs.nps.zmn<K> zn2 = zn();
        if (zn2.btk()) {
            return 0.0f;
        }
        return (this.fs - zn2.zn()) / (zn2.fb() - zn2.zn());
    }

    protected float btk() {
        com.bytedance.adsdk.fs.nps.zmn<K> zn2 = zn();
        if (zn2 == null || zn2.btk()) {
            return 0.0f;
        }
        return zn2.zn.getInterpolation(fb());
    }

    private float bvs() {
        if (this.nps == -1.0f) {
            this.nps = this.btk.zn();
        }
        return this.nps;
    }

    float hhw() {
        if (this.zg == -1.0f) {
            this.zg = this.btk.fb();
        }
        return this.zg;
    }

    public A nps() {
        A zmn;
        float fb2 = fb();
        if (this.zn == null && this.btk.fs(fb2)) {
            return this.hhw;
        }
        com.bytedance.adsdk.fs.nps.zmn<K> zn2 = zn();
        Interpolator interpolator = zn2.fb;
        if (interpolator != null && zn2.btk != null) {
            zmn = zmn(zn2, fb2, interpolator.getInterpolation(fb2), zn2.btk.getInterpolation(fb2));
        } else {
            zmn = zmn(zn2, btk());
        }
        this.hhw = zmn;
        return zmn;
    }

    public float zg() {
        return this.fs;
    }

    protected A zmn(com.bytedance.adsdk.fs.nps.zmn<K> zmnVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> zn<T> zmn(List<? extends com.bytedance.adsdk.fs.nps.zmn<T>> list) {
        if (list.isEmpty()) {
            return new fs();
        }
        if (list.size() == 1) {
            return new btk(list);
        }
        return new fb(list);
    }

    private static final class fs<T> implements zn<T> {
        private fs() {
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public float fb() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean zmn() {
            return true;
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean zmn(float f) {
            return false;
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public float zn() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public com.bytedance.adsdk.fs.nps.zmn<T> fs() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean fs(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    private static final class btk<T> implements zn<T> {
        private float fs = -1.0f;
        private final com.bytedance.adsdk.fs.nps.zmn<T> zmn;

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean zmn() {
            return false;
        }

        btk(List<? extends com.bytedance.adsdk.fs.nps.zmn<T>> list) {
            this.zmn = list.get(0);
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean zmn(float f) {
            return !this.zmn.btk();
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public com.bytedance.adsdk.fs.nps.zmn<T> fs() {
            return this.zmn;
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public float zn() {
            return this.zmn.zn();
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public float fb() {
            return this.zmn.fb();
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean fs(float f) {
            if (this.fs == f) {
                return true;
            }
            this.fs = f;
            return false;
        }
    }

    private static final class fb<T> implements zn<T> {
        private final List<? extends com.bytedance.adsdk.fs.nps.zmn<T>> zmn;
        private com.bytedance.adsdk.fs.nps.zmn<T> zn = null;
        private float fb = -1.0f;
        private com.bytedance.adsdk.fs.nps.zmn<T> fs = zn(0.0f);

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean zmn() {
            return false;
        }

        fb(List<? extends com.bytedance.adsdk.fs.nps.zmn<T>> list) {
            this.zmn = list;
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean zmn(float f) {
            if (this.fs.zmn(f)) {
                return !this.fs.btk();
            }
            this.fs = zn(f);
            return true;
        }

        private com.bytedance.adsdk.fs.nps.zmn<T> zn(float f) {
            com.bytedance.adsdk.fs.nps.zmn<T> zmnVar = this.zmn.get(r0.size() - 1);
            if (f >= zmnVar.zn()) {
                return zmnVar;
            }
            for (int size = this.zmn.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.fs.nps.zmn<T> zmnVar2 = this.zmn.get(size);
                if (this.fs != zmnVar2 && zmnVar2.zmn(f)) {
                    return zmnVar2;
                }
            }
            return this.zmn.get(0);
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public com.bytedance.adsdk.fs.nps.zmn<T> fs() {
            return this.fs;
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public float zn() {
            return this.zmn.get(0).zn();
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public float fb() {
            return this.zmn.get(r0.size() - 1).fb();
        }

        @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.zn
        public boolean fs(float f) {
            com.bytedance.adsdk.fs.nps.zmn<T> zmnVar = this.zn;
            com.bytedance.adsdk.fs.nps.zmn<T> zmnVar2 = this.fs;
            if (zmnVar == zmnVar2 && this.fb == f) {
                return true;
            }
            this.zn = zmnVar2;
            this.fb = f;
            return false;
        }
    }
}
