package h9;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4491c;

    public a(String str, int i3, int i10) {
        str.getClass();
        this.f4489a = i3;
        this.f4490b = str;
        this.f4491c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4489a == aVar.f4489a && Intrinsics.a(this.f4490b, aVar.f4490b) && this.f4491c == aVar.f4491c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4491c) + ((this.f4490b.hashCode() + (Integer.hashCode(this.f4489a) * 31)) * 31);
    }

    public final String toString() {
        return "MedalEntry(id=" + this.f4489a + ", date=" + this.f4490b + ", score=" + this.f4491c + ")";
    }
}
