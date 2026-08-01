package n4;

import android.os.Bundle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final s f7108d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f7109e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7110i;

    /* renamed from: r, reason: collision with root package name */
    public final int f7111r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f7112s;

    public r(s sVar, Bundle bundle, boolean z10, int i3, boolean z11) {
        this.f7108d = sVar;
        this.f7109e = bundle;
        this.f7110i = z10;
        this.f7111r = i3;
        this.f7112s = z11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r rVar) {
        rVar.getClass();
        boolean z10 = rVar.f7110i;
        boolean z11 = this.f7110i;
        if (z11 && !z10) {
            return 1;
        }
        if (!z11 && z10) {
            return -1;
        }
        int i3 = rVar.f7111r;
        boolean z12 = rVar.f7112s;
        Bundle bundle = rVar.f7109e;
        int i10 = this.f7111r - i3;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f7109e;
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
        boolean z13 = this.f7112s;
        if (!z13 || z12) {
            return (z13 || !z12) ? 0 : -1;
        }
        return 1;
    }
}
