package t1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final u f8923d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f8924e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8925f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8926g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8927h;

    public s(u uVar, Bundle bundle, boolean z3, int i3, boolean z4) {
        f2.j.f(uVar, "destination");
        this.f8923d = uVar;
        this.f8924e = bundle;
        this.f8925f = z3;
        this.f8926g = i3;
        this.f8927h = z4;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        f2.j.f(sVar, "other");
        boolean z3 = sVar.f8925f;
        boolean z4 = this.f8925f;
        if (z4 && !z3) {
            return 1;
        }
        if (!z4 && z3) {
            return -1;
        }
        int i3 = this.f8926g - sVar.f8926g;
        if (i3 > 0) {
            return 1;
        }
        if (i3 < 0) {
            return -1;
        }
        Bundle bundle = sVar.f8924e;
        Bundle bundle2 = this.f8924e;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            f2.j.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z5 = sVar.f8927h;
        boolean z6 = this.f8927h;
        if (!z6 || z5) {
            return (z6 || !z5) ? 0 : -1;
        }
        return 1;
    }
}
