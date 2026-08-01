package c6;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1825b;

    public j(String str, int i3) {
        str.getClass();
        this.f1824a = str;
        this.f1825b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.a(this.f1824a, jVar.f1824a) && this.f1825b == jVar.f1825b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1825b) + (this.f1824a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f1824a);
        sb2.append(", generation=");
        return v4.a.m(sb2, this.f1825b, ')');
    }
}
