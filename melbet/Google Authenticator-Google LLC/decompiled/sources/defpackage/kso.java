package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kso extends ksh implements ksn, ktl {
    private final int a;

    public kso(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
    }

    @Override // defpackage.ksh
    protected final void e() {
        int i = ksx.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kso) {
            kso ksoVar = (kso) obj;
            return this.d.equals(ksoVar.d) && this.e.equals(ksoVar.e) && ksp.b(this.c, ksoVar.c) && ksp.b(c(), ksoVar.c());
        }
        if (obj instanceof ktl) {
            return obj.equals(b());
        }
        return false;
    }

    public final int hashCode() {
        return (((c() == null ? 0 : c().hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // defpackage.ksn
    public final int i() {
        return this.a;
    }

    public final String toString() {
        kti b = b();
        if (b != this) {
            return b.toString();
        }
        String str = this.d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a.Z(str, "function ", " (Kotlin reflection is not available)");
    }

    public kso(int i, Class cls, String str, String str2, int i2) {
        this(i, b, cls, str, str2, i2);
    }
}
