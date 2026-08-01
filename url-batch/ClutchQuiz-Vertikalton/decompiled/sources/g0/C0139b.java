package g0;

import java.util.ArrayList;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2548c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2549e;

    public C0139b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f2546a = str;
        this.f2547b = str2;
        this.f2548c = str3;
        this.d = arrayList;
        this.f2549e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0139b)) {
            return false;
        }
        C0139b c0139b = (C0139b) obj;
        if (this.f2546a.equals(c0139b.f2546a) && this.f2547b.equals(c0139b.f2547b) && this.f2548c.equals(c0139b.f2548c) && this.d.equals(c0139b.d)) {
            return this.f2549e.equals(c0139b.f2549e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2549e.hashCode() + ((this.d.hashCode() + ((this.f2548c.hashCode() + ((this.f2547b.hashCode() + (this.f2546a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f2546a + "', onDelete='" + this.f2547b + " +', onUpdate='" + this.f2548c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.f2549e + '}';
    }
}
