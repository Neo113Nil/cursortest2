package com.bytedance.sdk.openadsdk.core.rt.fs;

import com.bytedance.sdk.openadsdk.core.rt.fs.zn;

/* loaded from: classes3.dex */
public class fs extends zn implements Comparable<fs> {
    private final float zmn;

    private fs(float f, String str, zn.EnumC0181zn enumC0181zn, Boolean bool) {
        super(str, enumC0181zn, bool);
        this.zmn = f;
    }

    public boolean zmn(float f) {
        return this.zmn <= f && !fb();
    }

    @Override // java.lang.Comparable
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public int compareTo(fs fsVar) {
        if (fsVar == null) {
            return 1;
        }
        float f = this.zmn;
        float f2 = fsVar.zmn;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rt.fs.zn
    public void l_() {
        super.l_();
    }

    public static class zmn {
        private final float fs;
        private final String zmn;
        private zn.EnumC0181zn zn = zn.EnumC0181zn.TRACKING_URL;
        private boolean fb = false;

        public zmn(String str, float f) {
            this.zmn = str;
            this.fs = f;
        }

        public fs zmn() {
            return new fs(this.fs, this.zmn, this.zn, Boolean.valueOf(this.fb));
        }
    }

    public String toString() {
        return super.toString();
    }
}
