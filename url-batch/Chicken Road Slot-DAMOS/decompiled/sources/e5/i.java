package e5;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3911a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3912b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3913c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3914d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3915e;

    public i(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f3911a = str;
        this.f3912b = str2;
        this.f3913c = str3;
        this.f3914d = list;
        this.f3915e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Intrinsics.a(this.f3911a, iVar.f3911a) && Intrinsics.a(this.f3912b, iVar.f3912b) && Intrinsics.a(this.f3913c, iVar.f3913c) && Intrinsics.a(this.f3914d, iVar.f3914d)) {
            return Intrinsics.a(this.f3915e, iVar.f3915e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3915e.hashCode() + ((this.f3914d.hashCode() + ((this.f3913c.hashCode() + ((this.f3912b.hashCode() + (this.f3911a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return kotlin.text.i.b(kotlin.text.i.d("\n            |ForeignKey {\n            |   referenceTable = '" + this.f3911a + "',\n            |   onDelete = '" + this.f3912b + "',\n            |   onUpdate = '" + this.f3913c + "',\n            |   columnNames = {" + a.a.P(CollectionsKt.K(this.f3914d)) + "\n            |   referenceColumnNames = {" + a.a.O(CollectionsKt.K(this.f3915e)) + "\n            |}\n        "));
    }
}
