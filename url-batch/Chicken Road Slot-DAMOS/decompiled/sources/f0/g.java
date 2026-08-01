package f0;

import kotlin.jvm.internal.Intrinsics;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f4033a;

    /* renamed from: b, reason: collision with root package name */
    public String f4034b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4035c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f4036d = null;

    public g(String str, String str2) {
        this.f4033a = str;
        this.f4034b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f4033a, gVar.f4033a) && Intrinsics.a(this.f4034b, gVar.f4034b) && this.f4035c == gVar.f4035c && Intrinsics.a(this.f4036d, gVar.f4036d);
    }

    public final int hashCode() {
        int d10 = l.d((this.f4034b.hashCode() + (this.f4033a.hashCode() * 31)) * 31, 31, this.f4035c);
        d dVar = this.f4036d;
        return d10 + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f4036d + ", isShowingSubstitution=" + this.f4035c + ')';
    }
}
