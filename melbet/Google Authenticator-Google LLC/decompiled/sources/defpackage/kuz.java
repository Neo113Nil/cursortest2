package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kuz extends kwx {
    public final kuw a;

    public kuz(kuw kuwVar) {
        this.a = kuwVar;
    }

    @Override // defpackage.kwx
    public final void a(Throwable th) {
        kuw kuwVar = this.a;
        Throwable q = kuwVar.q(e());
        if (kuwVar.C()) {
            kuk kukVar = ((lcc) kuwVar.a).f;
            while (true) {
                Object obj = kukVar.a;
                ldb ldbVar = lcd.b;
                if (ksp.b(obj, ldbVar)) {
                    if (kukVar.d(ldbVar, q)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (kukVar.d(obj, null)) {
                        break;
                    }
                }
            }
        }
        kuwVar.j(q);
        kuwVar.x();
    }

    @Override // defpackage.kwx
    public final boolean b() {
        return true;
    }
}
