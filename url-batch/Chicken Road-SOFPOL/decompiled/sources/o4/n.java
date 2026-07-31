package o4;

import android.os.Bundle;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final o f5664d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f5665e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5666f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5667g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5668h;

    public n(o oVar, Bundle bundle, boolean z3, int i, boolean z7) {
        this.f5664d = oVar;
        this.f5665e = bundle;
        this.f5666f = z3;
        this.f5667g = i;
        this.f5668h = z7;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(n nVar) {
        q6.i.e(nVar, "other");
        boolean z3 = nVar.f5668h;
        boolean z7 = nVar.f5666f;
        Bundle bundle = nVar.f5665e;
        boolean z8 = this.f5666f;
        if (z8 && !z7) {
            return 1;
        }
        if (!z8 && z7) {
            return -1;
        }
        int i = this.f5667g - nVar.f5667g;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.f5665e;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            q6.i.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z9 = this.f5668h;
        if (!z9 || z3) {
            return (z9 || !z3) ? 0 : -1;
        }
        return 1;
    }
}
