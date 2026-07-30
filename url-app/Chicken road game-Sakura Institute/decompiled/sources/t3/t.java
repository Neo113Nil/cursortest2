package t3;

import android.os.Bundle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final v f8849f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f8850g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8851h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8852i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8853j;

    public t(v vVar, Bundle bundle, boolean z8, int i7, boolean z9) {
        this.f8849f = vVar;
        this.f8850g = bundle;
        this.f8851h = z8;
        this.f8852i = i7;
        this.f8853j = z9;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(t tVar) {
        r6.k.f(tVar, "other");
        boolean z8 = tVar.f8853j;
        boolean z9 = tVar.f8851h;
        Bundle bundle = tVar.f8850g;
        boolean z10 = this.f8851h;
        if (z10 && !z9) {
            return 1;
        }
        if (!z10 && z9) {
            return -1;
        }
        int i7 = this.f8852i - tVar.f8852i;
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f8850g;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            r6.k.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z11 = this.f8853j;
        if (!z11 || z8) {
            return (z11 || !z8) ? 0 : -1;
        }
        return 1;
    }
}
