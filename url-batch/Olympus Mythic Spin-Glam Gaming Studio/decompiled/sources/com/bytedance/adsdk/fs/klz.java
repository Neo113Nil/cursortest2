package com.bytedance.adsdk.fs;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class klz<V> {
    private final Throwable fs;
    private final V zmn;

    public klz(V v) {
        this.zmn = v;
        this.fs = null;
    }

    public klz(Throwable th) {
        this.fs = th;
        this.zmn = null;
    }

    public V zmn() {
        return this.zmn;
    }

    public Throwable fs() {
        return this.fs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klz)) {
            return false;
        }
        klz klzVar = (klz) obj;
        if (zmn() != null && zmn().equals(klzVar.zmn())) {
            return true;
        }
        if (fs() == null || klzVar.fs() == null) {
            return false;
        }
        return fs().toString().equals(fs().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{zmn(), fs()});
    }
}
