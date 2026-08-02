package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpn {
    public final int a;
    public final Object b;

    public kpn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpn)) {
            return false;
        }
        kpn kpnVar = (kpn) obj;
        return this.a == kpnVar.a && ksp.b(this.b, kpnVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
