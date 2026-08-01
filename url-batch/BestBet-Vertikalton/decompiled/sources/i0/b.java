package i0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3007b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3008c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3009e;

    public b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f3006a = str;
        this.f3007b = str2;
        this.f3008c = str3;
        this.d = arrayList;
        this.f3009e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3006a.equals(bVar.f3006a) && this.f3007b.equals(bVar.f3007b) && this.f3008c.equals(bVar.f3008c) && this.d.equals(bVar.d)) {
            return this.f3009e.equals(bVar.f3009e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3009e.hashCode() + ((this.d.hashCode() + ((this.f3008c.hashCode() + ((this.f3007b.hashCode() + (this.f3006a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f3006a + "', onDelete='" + this.f3007b + " +', onUpdate='" + this.f3008c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.f3009e + '}';
    }
}
