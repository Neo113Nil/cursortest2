package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class led extends lbx {
    public final bst c;

    public led(long j, led ledVar, int i) {
        super(j, ledVar, i);
        this.c = new bst(lec.f);
    }

    @Override // defpackage.lbx
    public final int a() {
        return lec.f;
    }

    @Override // defpackage.lbx
    public final void k(int i) {
        bst bstVar = this.c;
        bstVar.A(i).c(lec.e);
        r();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
