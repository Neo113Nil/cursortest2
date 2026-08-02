package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kxn extends kwx {
    private final kuw a;

    public kxn(kuw kuwVar) {
        this.a = kuwVar;
    }

    @Override // defpackage.kwx
    public final void a(Throwable th) {
        Object B = e().B();
        boolean z = kvo.a;
        boolean z2 = B instanceof kve;
        kuw kuwVar = this.a;
        if (z2) {
            kuwVar.ca(ixc.X(((kve) B).b));
        } else {
            kuwVar.ca(kxc.b(B));
        }
    }

    @Override // defpackage.kwx
    public final boolean b() {
        return false;
    }
}
