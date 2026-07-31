package t1;

import H2.AbstractC0080b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7977a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7978b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7979c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7980d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7981e;

    public b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f7977a = str;
        this.f7978b = str2;
        this.f7979c = str3;
        this.f7980d = arrayList;
        this.f7981e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7977a.equals(bVar.f7977a) && this.f7978b.equals(bVar.f7978b) && this.f7979c.equals(bVar.f7979c) && this.f7980d.equals(bVar.f7980d)) {
            return this.f7981e.equals(bVar.f7981e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7981e.hashCode() + ((this.f7980d.hashCode() + AbstractC0080b.e(AbstractC0080b.e(this.f7977a.hashCode() * 31, 31, this.f7978b), 31, this.f7979c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f7977a + "', onDelete='" + this.f7978b + " +', onUpdate='" + this.f7979c + "', columnNames=" + this.f7980d + ", referenceColumnNames=" + this.f7981e + '}';
    }
}
