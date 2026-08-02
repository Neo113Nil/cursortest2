package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kst extends ksh implements kto {
    public kst() {
        super(ksh.b, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kst) {
            kst kstVar = (kst) obj;
            return c().equals(kstVar.c()) && this.d.equals(kstVar.d) && this.e.equals(kstVar.e) && ksp.b(this.c, kstVar.c);
        }
        if (obj instanceof kto) {
            return obj.equals(b());
        }
        return false;
    }

    protected final kto h() {
        kti b = b();
        if (b != this) {
            return (kto) b;
        }
        throw new krh();
    }

    public final int hashCode() {
        return (((c().hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        kti b = b();
        if (b != this) {
            return b.toString();
        }
        return "property " + this.d + " (Kotlin reflection is not available)";
    }

    public kst(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }
}
