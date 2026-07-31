package q1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final w f6954d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6955e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6956f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6957g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6958h;

    public u(w wVar, Bundle bundle, boolean z3, int i3, boolean z4) {
        Z1.i.f(wVar, "destination");
        this.f6954d = wVar;
        this.f6955e = bundle;
        this.f6956f = z3;
        this.f6957g = i3;
        this.f6958h = z4;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        Z1.i.f(uVar, "other");
        boolean z3 = uVar.f6956f;
        boolean z4 = this.f6956f;
        if (z4 && !z3) {
            return 1;
        }
        if (!z4 && z3) {
            return -1;
        }
        int i3 = this.f6957g - uVar.f6957g;
        if (i3 > 0) {
            return 1;
        }
        if (i3 < 0) {
            return -1;
        }
        Bundle bundle = uVar.f6955e;
        Bundle bundle2 = this.f6955e;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            Z1.i.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z5 = uVar.f6958h;
        boolean z6 = this.f6958h;
        if (!z6 || z5) {
            return (z6 || !z5) ? 0 : -1;
        }
        return 1;
    }
}
