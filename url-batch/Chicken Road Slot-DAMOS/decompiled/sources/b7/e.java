package b7;

import com.google.android.gms.internal.measurement.l5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l5 f1281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1282b;

    public e(l5 l5Var, String str) {
        this.f1281a = l5Var;
        this.f1282b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1281a == eVar.f1281a && this.f1282b.equals(eVar.f1282b);
    }

    public final int hashCode() {
        return this.f1282b.hashCode() + (System.identityHashCode(this.f1281a) * 31);
    }
}
