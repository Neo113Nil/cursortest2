package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dui {
    public final duq a;
    public final wo b;
    public final krt c;
    public final gjl d;

    public dui(gjl gjlVar, duq duqVar, wo woVar, krt krtVar) {
        gjlVar.getClass();
        this.d = gjlVar;
        this.a = duqVar;
        this.b = woVar;
        this.c = krtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dui)) {
            return false;
        }
        dui duiVar = (dui) obj;
        return ksp.b(this.d, duiVar.d) && ksp.b(this.a, duiVar.a) && ksp.b(this.b, duiVar.b) && ksp.b(this.c, duiVar.c);
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "FragmentScopedData(appStateData=" + this.d + ", viewModelData=" + this.a + ", customDialogConsumer=" + this.b + ", handleWithFragment=" + this.c + ")";
    }
}
