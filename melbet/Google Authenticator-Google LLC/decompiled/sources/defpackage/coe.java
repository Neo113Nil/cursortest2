package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class coe implements cpj {
    public final cml a;
    public final cno b;
    public final /* synthetic */ cog e;
    public cqp f = null;
    public Set c = null;
    public boolean d = false;

    public coe(cog cogVar, cml cmlVar, cno cnoVar) {
        this.e = cogVar;
        this.a = cmlVar;
        this.b = cnoVar;
    }

    @Override // defpackage.cpj
    public final void a(clg clgVar) {
        this.e.o.post(new avl((Object) this, (Object) clgVar, 10, (byte[]) null));
    }

    public final void b(clg clgVar) {
        coc cocVar = (coc) this.e.k.get(this.b);
        if (cocVar != null) {
            cocVar.l(clgVar);
        }
    }

    public final void c() {
        cqp cqpVar;
        if (!this.d || (cqpVar = this.f) == null) {
            return;
        }
        this.a.r(cqpVar, this.c);
    }
}
