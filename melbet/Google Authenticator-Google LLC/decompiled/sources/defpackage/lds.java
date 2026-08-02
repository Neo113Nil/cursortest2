package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lds extends kvj {
    public static final lds a = new lds();

    @Override // defpackage.kvj
    public final void a(kqn kqnVar, Runnable runnable) {
        ldn.a.h(runnable, false);
    }

    @Override // defpackage.kvj
    public final void f(kqn kqnVar, Runnable runnable) {
        ldn.a.h(runnable, true);
    }

    @Override // defpackage.kvj
    public final kvj g(int i) {
        ixl.a(i);
        return i >= ldr.d ? this : super.g(i);
    }

    @Override // defpackage.kvj
    public final String toString() {
        return "Dispatchers.IO";
    }
}
