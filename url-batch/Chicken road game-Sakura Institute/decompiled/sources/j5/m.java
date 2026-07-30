package j5;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5074a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5075b;

    public m(ArrayList arrayList, HashMap hashMap) {
        this.f5074a = arrayList;
        this.f5075b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f5074a.equals(mVar.f5074a)) {
            return this.f5075b.equals(mVar.f5075b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5075b.hashCode() + (this.f5074a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.D(this.f5074a) + " (params: " + this.f5075b + ")";
    }
}
