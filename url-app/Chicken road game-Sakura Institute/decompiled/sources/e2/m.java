package e2;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6205a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6206b;

    public m(ArrayList arrayList, HashMap hashMap) {
        this.f6205a = arrayList;
        this.f6206b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f6205a.equals(mVar.f6205a)) {
            return this.f6206b.equals(mVar.f6206b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6206b.hashCode() + (this.f6205a.hashCode() * 31);
    }

    public final String toString() {
        return M1.a.M(this.f6205a) + " (params: " + this.f6206b + ")";
    }
}
