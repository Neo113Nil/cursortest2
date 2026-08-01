package u8;

import a2.r;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9682a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9683b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            r.j("Null userAgent");
            throw null;
        }
        this.f9682a = str;
        this.f9683b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9682a.equals(aVar.f9682a) && this.f9683b.equals(aVar.f9683b);
    }

    public final int hashCode() {
        return ((this.f9682a.hashCode() ^ 1000003) * 1000003) ^ this.f9683b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f9682a + ", usedDates=" + this.f9683b + "}";
    }
}
