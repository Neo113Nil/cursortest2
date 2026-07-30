package w3;

import java.util.ArrayList;
import r6.i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9502a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9503b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9504c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9505d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9506e;

    public b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f9502a = str;
        this.f9503b = str2;
        this.f9504c = str3;
        this.f9505d = arrayList;
        this.f9506e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f9502a.equals(bVar.f9502a) && this.f9503b.equals(bVar.f9503b) && this.f9504c.equals(bVar.f9504c) && this.f9505d.equals(bVar.f9505d)) {
            return this.f9506e.equals(bVar.f9506e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9506e.hashCode() + ((this.f9505d.hashCode() + i.a(i.a(this.f9502a.hashCode() * 31, 31, this.f9503b), 31, this.f9504c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f9502a + "', onDelete='" + this.f9503b + " +', onUpdate='" + this.f9504c + "', columnNames=" + this.f9505d + ", referenceColumnNames=" + this.f9506e + '}';
    }
}
