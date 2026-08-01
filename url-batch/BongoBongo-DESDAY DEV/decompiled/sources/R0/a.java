package R0;

import h1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f794a;

    /* renamed from: b, reason: collision with root package name */
    public final String f795b;

    /* renamed from: c, reason: collision with root package name */
    public final int f796c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f797e;

    public a(long j2, String str, int i, boolean z2, String str2) {
        d.e(str, "rangeLabel");
        d.e(str2, "result");
        this.f794a = j2;
        this.f795b = str;
        this.f796c = i;
        this.d = z2;
        this.f797e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f794a == aVar.f794a && d.a(this.f795b, aVar.f795b) && this.f796c == aVar.f796c && this.d == aVar.d && d.a(this.f797e, aVar.f797e);
    }

    public final int hashCode() {
        return this.f797e.hashCode() + ((Boolean.hashCode(this.d) + ((Integer.hashCode(this.f796c) + ((this.f795b.hashCode() + (Long.hashCode(this.f794a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HistoryEntry(timestamp=" + this.f794a + ", rangeLabel=" + this.f795b + ", count=" + this.f796c + ", unique=" + this.d + ", result=" + this.f797e + ")";
    }
}
