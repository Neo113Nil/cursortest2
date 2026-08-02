package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hwc extends hvg {
    final /* synthetic */ hwd a;
    private final Callable b;

    public hwc(hwd hwdVar, Callable callable) {
        this.a = hwdVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.hvg
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.hvg
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.hvg
    public final void d(Throwable th) {
        this.a.p(th);
    }

    @Override // defpackage.hvg
    public final void e(Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.hvg
    public final boolean g() {
        return this.a.isDone();
    }
}
