package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arv {
    public final Executor a;
    public final kqn b;
    public final Executor c;
    public final atf d;
    public final asz e;
    public final wo f;
    public final wo g;
    public final wo h;
    public final String i;
    public final int j;
    public final int k;
    public final boolean l;
    public final yn m;
    public final yp n;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public arv(aru aruVar) {
        kqn kqnVar = aruVar.b;
        Executor executor = aruVar.a;
        if (executor == null) {
            if (kqnVar != null) {
                kqk kqkVar = (kqk) kqnVar.get(kqk.b);
                kvj kvjVar = kqkVar instanceof kvj ? (kvj) kqkVar : null;
                if (kvjVar != null) {
                    executor = ixh.a(kvjVar);
                    if (executor == null) {
                        kvj kvjVar2 = kwa.a;
                        int max = Math.max(1, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
                        kqf kqfVar = kvj.c;
                        executor = ixh.a(kvjVar2.g(max));
                    }
                }
            }
            executor = null;
            if (executor == null) {
            }
        }
        this.a = executor;
        this.b = kqnVar == null ? aruVar.a != null ? ixh.b(executor) : kwa.a : kqnVar;
        Executor executor2 = aruVar.d;
        this.c = executor2 == null ? ixh.a(kwa.a) : executor2;
        this.n = new yp(null);
        atf atfVar = aruVar.c;
        this.d = atfVar == null ? asc.a : atfVar;
        asz aszVar = aruVar.e;
        this.e = aszVar == null ? new atl() : aszVar;
        this.j = aruVar.j;
        this.k = aruVar.k;
        this.f = aruVar.f;
        this.g = aruVar.g;
        this.h = aruVar.h;
        this.i = aruVar.i;
        this.l = aruVar.l;
        this.m = new yn();
    }
}
