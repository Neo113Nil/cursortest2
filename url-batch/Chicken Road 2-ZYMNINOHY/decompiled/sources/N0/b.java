package N0;

import T.D;
import a.AbstractC0124a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1799a;

    public b(ArrayList arrayList) {
        this.f1799a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j4 = ((a) arrayList.get(0)).f1797b;
            int i4 = 1;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i4)).f1796a < j4) {
                    z = true;
                    break;
                } else {
                    j4 = ((a) arrayList.get(i4)).f1797b;
                    i4++;
                }
            }
        }
        AbstractC0124a.h(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f1799a.equals(((b) obj).f1799a);
    }

    public final int hashCode() {
        return this.f1799a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f1799a;
    }
}
