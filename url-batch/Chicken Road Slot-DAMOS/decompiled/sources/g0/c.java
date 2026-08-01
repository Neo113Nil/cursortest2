package g0;

import hd.a0;
import hd.z;
import k1.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f4222a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4223b;

    public c(long j, long j3) {
        this.f4222a = j;
        this.f4223b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.c(this.f4222a, cVar.f4222a) && p.c(this.f4223b, cVar.f4223b);
    }

    public final int hashCode() {
        int i3 = p.f5341h;
        z zVar = a0.f4495e;
        return Long.hashCode(this.f4223b) + (Long.hashCode(this.f4222a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        v4.a.t(this.f4222a, sb2, ", selectionBackgroundColor=");
        sb2.append((Object) p.h(this.f4223b));
        sb2.append(')');
        return sb2.toString();
    }
}
