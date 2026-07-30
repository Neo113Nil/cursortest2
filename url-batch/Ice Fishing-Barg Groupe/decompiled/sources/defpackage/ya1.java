package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ya1 implements Comparable {
    public final Bundle OPXfSBeufaJ8;
    public final int dgRBjINgWbAK;
    public final za1 rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public final boolean x50lh2ztY7Y5;

    public ya1(za1 za1Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.rtx2ld2ELZv4 = za1Var;
        this.OPXfSBeufaJ8 = bundle;
        this.wdg6QnbFHrFF = z;
        this.dgRBjINgWbAK = i;
        this.x50lh2ztY7Y5 = z2;
    }

    @Override // java.lang.Comparable
    /* renamed from: PxuCJdSBwIXG, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ya1 ya1Var) {
        ya1Var.getClass();
        boolean z = ya1Var.x50lh2ztY7Y5;
        boolean z2 = ya1Var.wdg6QnbFHrFF;
        Bundle bundle = ya1Var.OPXfSBeufaJ8;
        boolean z3 = this.wdg6QnbFHrFF;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.dgRBjINgWbAK - ya1Var.dgRBjINgWbAK;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.OPXfSBeufaJ8;
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
        boolean z4 = this.x50lh2ztY7Y5;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
