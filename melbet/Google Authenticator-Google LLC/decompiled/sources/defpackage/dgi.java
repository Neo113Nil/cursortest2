package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgi extends dgo {
    final /* synthetic */ hvm a;
    final /* synthetic */ koe b;

    public dgi(hvm hvmVar, koe koeVar) {
        this.a = hvmVar;
        this.b = koeVar;
    }

    @Override // defpackage.dgo, defpackage.hus
    public final /* synthetic */ hvl e() {
        return this.a;
    }

    @Override // defpackage.huo, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new dgj(runnable, this.b));
    }

    @Override // defpackage.huo, defpackage.hdk
    public final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hus, defpackage.huo
    public final /* synthetic */ ExecutorService g() {
        return this.a;
    }

    @Override // defpackage.dgo
    public final hvm h() {
        return this.a;
    }

    @Override // defpackage.huo, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.huo, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hdk
    public final String toString() {
        return "ExceptionHandling[" + super.toString() + "]";
    }
}
