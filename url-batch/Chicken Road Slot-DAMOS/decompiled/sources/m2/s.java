package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f6513a;

    public s(r rVar) {
        this.f6513a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return Intrinsics.a(this.f6513a, ((s) obj).f6513a);
        }
        return false;
    }

    public final int hashCode() {
        r rVar = this.f6513a;
        if (rVar != null) {
            return rVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f6513a + ')';
    }
}
