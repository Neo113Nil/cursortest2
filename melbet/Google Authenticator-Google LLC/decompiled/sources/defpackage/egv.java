package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class egv implements gzf {
    @Override // defpackage.gzf
    public final /* synthetic */ Object a(Object obj) {
        cpf cpfVar = (cpf) obj;
        efz a = ega.a();
        if (cpfVar.a("account_name") != null) {
            a.b(cpfVar.a("account_name"));
        }
        if (cpfVar.c() != null) {
            a.a = cpfVar.c();
        }
        if (cpfVar.e() != null) {
            c(cpfVar, a);
        }
        if (cpfVar.d() != null) {
            b(cpfVar, a);
        }
        if (cpfVar.a("gaia_id") != null) {
            a.d = cpfVar.a("gaia_id");
        }
        d(cpfVar, a);
        if (cpfVar.b() != null) {
            a.e = cpfVar.b();
        }
        return a.a();
    }

    public void b(cpf cpfVar, efz efzVar) {
        throw null;
    }

    public void c(cpf cpfVar, efz efzVar) {
        throw null;
    }

    public abstract void d(cpf cpfVar, efz efzVar);
}
