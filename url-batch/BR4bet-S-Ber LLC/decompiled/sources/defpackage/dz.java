package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class dz {
    public final xm a;
    public final ms b;

    public dz(xm xmVar, ms msVar) {
        xmVar.getClass();
        this.a = xmVar;
        this.b = msVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz)) {
            return false;
        }
        dz dzVar = (dz) obj;
        return kr.b(this.a, dzVar.a) && this.b.equals(dzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
