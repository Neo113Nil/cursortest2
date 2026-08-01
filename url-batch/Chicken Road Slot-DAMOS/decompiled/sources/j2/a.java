package j2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4928a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.c f4929b;

    public a(String str, hd.c cVar) {
        this.f4928a = str;
        this.f4929b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f4928a, aVar.f4928a) && Intrinsics.a(this.f4929b, aVar.f4929b);
    }

    public final int hashCode() {
        String str = this.f4928a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        hd.c cVar = this.f4929b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f4928a + ", action=" + this.f4929b + ')';
    }
}
