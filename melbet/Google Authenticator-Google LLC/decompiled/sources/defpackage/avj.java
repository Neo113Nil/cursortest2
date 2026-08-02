package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class avj implements krt {
    final /* synthetic */ asp a;
    final /* synthetic */ hvi b;

    public avj(asp aspVar, hvi hviVar) {
        this.a = aspVar;
        this.b = hviVar;
    }

    @Override // defpackage.krt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof ava) {
            this.a.h(((ava) th).a);
        }
        this.b.cancel(false);
        return kow.a;
    }
}
