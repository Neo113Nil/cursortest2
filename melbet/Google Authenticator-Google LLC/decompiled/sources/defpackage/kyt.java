package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kyt extends kum implements kys {
    public final kys b;

    public kyt(kqn kqnVar, kys kysVar) {
        super(kqnVar, true);
        this.b = kysVar;
    }

    @Override // defpackage.kzf
    public final kyk A() {
        return this.b.A();
    }

    @Override // defpackage.kxb
    public final void G(Throwable th) {
        kys kysVar = this.b;
        CancellationException D = D(th, null);
        kysVar.s(D);
        K(D);
    }

    @Override // defpackage.kzf
    public final Object d(kqj kqjVar) {
        throw null;
    }

    @Override // defpackage.kzf
    public final Object e(kqj kqjVar) {
        throw null;
    }

    @Override // defpackage.kzg
    public final Object h(Object obj, kqj kqjVar) {
        throw null;
    }

    @Override // defpackage.kzf
    public final Object i() {
        throw null;
    }

    @Override // defpackage.kzg
    public final Object j(Object obj) {
        return this.b.j(obj);
    }

    @Override // defpackage.kzg
    public final void r(krt krtVar) {
        throw null;
    }

    @Override // defpackage.kxb, defpackage.kwu
    public final void s(CancellationException cancellationException) {
        if (ce()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new kwv(a(), null, this);
        }
        G(cancellationException);
    }

    @Override // defpackage.kzg
    public final boolean u(Throwable th) {
        throw null;
    }

    @Override // defpackage.kzg
    public final boolean y() {
        throw null;
    }
}
