package S;

import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2183a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2184b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2185c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2186d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2187e;

    public b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        i.e(columnNames, "columnNames");
        i.e(referenceColumnNames, "referenceColumnNames");
        this.f2183a = str;
        this.f2184b = str2;
        this.f2185c = str3;
        this.f2186d = columnNames;
        this.f2187e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (i.a(this.f2183a, bVar.f2183a) && i.a(this.f2184b, bVar.f2184b) && i.a(this.f2185c, bVar.f2185c) && i.a(this.f2186d, bVar.f2186d)) {
            return i.a(this.f2187e, bVar.f2187e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2187e.hashCode() + ((this.f2186d.hashCode() + ((this.f2185c.hashCode() + ((this.f2184b.hashCode() + (this.f2183a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f2183a + "', onDelete='" + this.f2184b + " +', onUpdate='" + this.f2185c + "', columnNames=" + this.f2186d + ", referenceColumnNames=" + this.f2187e + '}';
    }
}
