package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mp1 implements Comparable {
    public final op1 m;
    public final Bundle n;
    public final boolean o;
    public final int p;
    public final boolean q;

    public mp1(op1 op1Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.m = op1Var;
        this.n = bundle;
        this.o = z;
        this.p = i;
        this.q = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mp1 mp1Var) {
        mp1Var.getClass();
        boolean z = mp1Var.o;
        boolean z2 = this.o;
        if (z2 && !z) {
            return 1;
        }
        if (!z2 && z) {
            return -1;
        }
        int i = mp1Var.p;
        boolean z3 = mp1Var.q;
        Bundle bundle = mp1Var.n;
        int i2 = this.p - i;
        if (i2 > 0) {
            return 1;
        }
        if (i2 < 0) {
            return -1;
        }
        Bundle bundle2 = this.n;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.q;
        if (!z4 || z3) {
            return (z4 || !z3) ? 0 : -1;
        }
        return 1;
    }
}
