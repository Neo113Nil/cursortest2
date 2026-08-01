package com.bytedance.adsdk.lottie;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class qh<V> {
    private final Throwable icD;
    private final V pvs;

    public qh(V v) {
        this.pvs = v;
        this.icD = null;
    }

    public qh(Throwable th) {
        this.icD = th;
        this.pvs = null;
    }

    public V pvs() {
        return this.pvs;
    }

    public Throwable icD() {
        return this.icD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj;
        if (pvs() != null && pvs().equals(qhVar.pvs())) {
            return true;
        }
        if (icD() == null || qhVar.icD() == null) {
            return false;
        }
        return icD().toString().equals(icD().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{pvs(), icD()});
    }
}
