package l6;

import a2.r;
import a4.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5880a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5881b;

    public a(int i3, long j) {
        if (i3 == 0) {
            r.j("Null status");
            throw null;
        }
        this.f5880a = i3;
        this.f5881b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f5880a, aVar.f5880a) && this.f5881b == aVar.f5881b;
    }

    public final int hashCode() {
        int b10 = (i.b(this.f5880a) ^ 1000003) * 1000003;
        long j = this.f5881b;
        return b10 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i3 = this.f5880a;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        sb2.append(this.f5881b);
        sb2.append("}");
        return sb2.toString();
    }
}
