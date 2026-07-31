package x1;

import A.k;
import java.util.ArrayList;

/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10303a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10304b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10305c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10306d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10307e;

    public C1223b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f10303a = str;
        this.f10304b = str2;
        this.f10305c = str3;
        this.f10306d = arrayList;
        this.f10307e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1223b)) {
            return false;
        }
        C1223b c1223b = (C1223b) obj;
        if (this.f10303a.equals(c1223b.f10303a) && this.f10304b.equals(c1223b.f10304b) && this.f10305c.equals(c1223b.f10305c) && this.f10306d.equals(c1223b.f10306d)) {
            return this.f10307e.equals(c1223b.f10307e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10307e.hashCode() + ((this.f10306d.hashCode() + k.d(k.d(this.f10303a.hashCode() * 31, 31, this.f10304b), 31, this.f10305c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f10303a + "', onDelete='" + this.f10304b + " +', onUpdate='" + this.f10305c + "', columnNames=" + this.f10306d + ", referenceColumnNames=" + this.f10307e + '}';
    }
}
