package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddf implements ddj, dde, ddd, ddb {
    public final ddm a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public ddf(Executor executor, Object obj, ddm ddmVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
        this.a = ddmVar;
    }

    @Override // defpackage.ddb
    public final void a() {
        int i = this.d;
        ddm ddmVar = this.a;
        if (i != 0) {
            ddmVar.r();
        } else {
            ddmVar.r();
        }
    }

    @Override // defpackage.ddj
    public final void b(ddi ddiVar) {
        if (this.d != 0) {
            new avl(this, ddiVar, 16, (int[]) null).run();
        } else {
            this.c.execute(new avl(this, ddiVar, 20, (int[]) null));
        }
    }

    @Override // defpackage.ddd
    public final void c(Exception exc) {
        int i = this.d;
        ddm ddmVar = this.a;
        if (i != 0) {
            ddmVar.o(exc);
        } else {
            ddmVar.o(exc);
        }
    }

    @Override // defpackage.dde
    public final void d(Object obj) {
        int i = this.d;
        ddm ddmVar = this.a;
        if (i != 0) {
            ddmVar.p(obj);
        } else {
            ddmVar.p(obj);
        }
    }
}
