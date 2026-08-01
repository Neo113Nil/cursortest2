package c1;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f1479a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1480b;

    public c(int i3, i7.a aVar, Integer num) {
        this.f1479a = i3;
        this.f1480b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1479a == cVar.f1479a && Intrinsics.a(null, null) && Intrinsics.a(this.f1480b, cVar.f1480b);
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.f1479a) * 31) + 0) * 31;
        Integer num = this.f1480b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f1479a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f1480b + ')';
    }
}
