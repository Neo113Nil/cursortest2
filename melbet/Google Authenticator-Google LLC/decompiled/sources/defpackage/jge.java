package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jge {
    public final jit a;
    public final jgi b;
    public final boolean c;
    public final boolean d;

    public jge(jit jitVar, jgi jgiVar, boolean z, boolean z2) {
        this.a = jitVar;
        this.b = jgiVar;
        this.c = z;
        this.d = z2;
    }

    public static /* synthetic */ jge a(jge jgeVar, boolean z, int i) {
        jit jitVar = (i & 1) != 0 ? jgeVar.a : null;
        jgi jgiVar = (i & 2) != 0 ? jgeVar.b : null;
        boolean z2 = (i & 4) != 0 ? jgeVar.c : false;
        if ((i & 8) != 0) {
            z = jgeVar.d;
        }
        return new jge(jitVar, jgiVar, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jge)) {
            return false;
        }
        jge jgeVar = (jge) obj;
        return ksp.b(this.a, jgeVar.a) && ksp.b(this.b, jgeVar.b) && this.c == jgeVar.c && this.d == jgeVar.d;
    }

    public final int hashCode() {
        jit jitVar = this.a;
        int hashCode = jitVar == null ? 0 : jitVar.hashCode();
        jgi jgiVar = this.b;
        return (((((hashCode * 31) + (jgiVar != null ? jgiVar.hashCode() : 0)) * 31) + a.m(this.c)) * 31) + a.m(this.d);
    }

    public final String toString() {
        return "AccountMenuToolbarData(selectedAccountIdentifier=" + this.a + ", selectedAccountAvatarData=" + this.b + ", isScrolled=" + this.c + ", isTitleTextHidden=" + this.d + ")";
    }

    public jge() {
        this(null, null, false, false);
    }
}
