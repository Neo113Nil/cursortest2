package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gwo extends ox {
    final /* synthetic */ String a = "AuthenticationCallback";
    final /* synthetic */ ox b;
    final /* synthetic */ brn c;

    public gwo(brn brnVar, ox oxVar) {
        this.b = oxVar;
        this.c = brnVar;
    }

    @Override // defpackage.ox
    public final void b(int i, CharSequence charSequence) {
        gtt a = ((gva) this.c.a).a(258, this.a.concat(":onAuthenticationError"));
        try {
            this.b.b(i, charSequence);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ox
    public final void c() {
        ((gva) this.c.a).a(259, this.a.concat(":onAuthenticationFailed")).close();
    }

    @Override // defpackage.ox
    public final void h(bsh bshVar) {
        gtt a = ((gva) this.c.a).a(260, this.a.concat(":onAuthenticationSucceeded"));
        try {
            this.b.h(bshVar);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
