package com.bytedance.adsdk.fs.zn.fs;

import android.graphics.Paint;
import com.bytedance.adsdk.fs.zmn.zmn.iqz;
import java.util.List;

/* loaded from: classes13.dex */
public class kgc implements zn {
    private final com.bytedance.adsdk.fs.zn.zmn.fb btk;
    private final float bvs;
    private final com.bytedance.adsdk.fs.zn.zmn.zmn fb;
    private final com.bytedance.adsdk.fs.zn.zmn.fs fs;
    private final com.bytedance.adsdk.fs.zn.zmn.fs hhw;
    private final boolean iv;
    private final zmn nps;
    private final fs zg;
    private final String zmn;
    private final List<com.bytedance.adsdk.fs.zn.zmn.fs> zn;

    public enum zmn {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap zmn() {
            int i = AnonymousClass1.zmn[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i == 2) {
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.SQUARE;
        }
    }

    /* renamed from: com.bytedance.adsdk.fs.zn.fs.kgc$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fs;
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[fs.values().length];
            fs = iArr;
            try {
                iArr[fs.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fs[fs.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fs[fs.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[zmn.values().length];
            zmn = iArr2;
            try {
                iArr2[zmn.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zmn[zmn.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zmn[zmn.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum fs {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join zmn() {
            int i = AnonymousClass1.fs[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public kgc(String str, com.bytedance.adsdk.fs.zn.zmn.fs fsVar, List<com.bytedance.adsdk.fs.zn.zmn.fs> list, com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar, com.bytedance.adsdk.fs.zn.zmn.fb fbVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar2, zmn zmnVar2, fs fsVar3, float f, boolean z) {
        this.zmn = str;
        this.fs = fsVar;
        this.zn = list;
        this.fb = zmnVar;
        this.btk = fbVar;
        this.hhw = fsVar2;
        this.nps = zmnVar2;
        this.zg = fsVar3;
        this.bvs = f;
        this.iv = z;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new iqz(bvsVar, zmnVar, this);
    }

    public String zmn() {
        return this.zmn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.zmn fs() {
        return this.fb;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fb zn() {
        return this.btk;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs fb() {
        return this.hhw;
    }

    public List<com.bytedance.adsdk.fs.zn.zmn.fs> btk() {
        return this.zn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs hhw() {
        return this.fs;
    }

    public zmn nps() {
        return this.nps;
    }

    public fs zg() {
        return this.zg;
    }

    public float bvs() {
        return this.bvs;
    }

    public boolean iv() {
        return this.iv;
    }
}
