package j0;

import C4.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5931a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5932b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5933c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5934d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5935e;

    public C0564b(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.f5931a = referenceTable;
        this.f5932b = onDelete;
        this.f5933c = onUpdate;
        this.f5934d = columnNames;
        this.f5935e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0564b)) {
            return false;
        }
        C0564b c0564b = (C0564b) obj;
        if (Intrinsics.a(this.f5931a, c0564b.f5931a) && Intrinsics.a(this.f5932b, c0564b.f5932b) && Intrinsics.a(this.f5933c, c0564b.f5933c) && Intrinsics.a(this.f5934d, c0564b.f5934d)) {
            return Intrinsics.a(this.f5935e, c0564b.f5935e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5935e.hashCode() + ((this.f5934d.hashCode() + p.e(this.f5933c, p.e(this.f5932b, this.f5931a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f5931a + "', onDelete='" + this.f5932b + " +', onUpdate='" + this.f5933c + "', columnNames=" + this.f5934d + ", referenceColumnNames=" + this.f5935e + '}';
    }
}
