package i0;

import java.util.ArrayList;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3144a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3145b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3146c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3147d;
    public final ArrayList e;

    public C0177b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f3144a = str;
        this.f3145b = str2;
        this.f3146c = str3;
        this.f3147d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0177b)) {
            return false;
        }
        C0177b c0177b = (C0177b) obj;
        if (this.f3144a.equals(c0177b.f3144a) && this.f3145b.equals(c0177b.f3145b) && this.f3146c.equals(c0177b.f3146c) && this.f3147d.equals(c0177b.f3147d)) {
            return this.e.equals(c0177b.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.f3147d.hashCode() + ((this.f3146c.hashCode() + ((this.f3145b.hashCode() + (this.f3144a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f3144a + "', onDelete='" + this.f3145b + " +', onUpdate='" + this.f3146c + "', columnNames=" + this.f3147d + ", referenceColumnNames=" + this.e + '}';
    }
}
