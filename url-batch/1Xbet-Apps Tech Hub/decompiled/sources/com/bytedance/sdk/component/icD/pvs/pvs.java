package com.bytedance.sdk.component.icD.pvs;

/* compiled from: CacheControl.java */
/* loaded from: classes.dex */
public final class pvs {
    public final boolean pvs;

    pvs(C0050pvs c0050pvs) {
        this.pvs = c0050pvs.pvs;
    }

    /* compiled from: CacheControl.java */
    /* renamed from: com.bytedance.sdk.component.icD.pvs.pvs$pvs, reason: collision with other inner class name */
    public static final class C0050pvs {
        boolean pvs;

        public C0050pvs pvs() {
            this.pvs = true;
            return this;
        }

        public pvs icD() {
            return new pvs(this);
        }
    }
}
