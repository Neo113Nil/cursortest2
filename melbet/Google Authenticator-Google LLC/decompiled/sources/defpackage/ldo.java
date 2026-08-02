package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldo extends kwm {
    private final String a;
    private final ldl d;

    public ldo(int i, int i2, long j, String str) {
        this.a = str;
        this.d = new ldl(i, i2, j, str);
    }

    @Override // defpackage.kvj
    public final void a(kqn kqnVar, Runnable runnable) {
        this.d.a(runnable, false, false);
    }

    public void close() {
        this.d.f();
    }

    @Override // defpackage.kwm
    public final Executor e() {
        return this.d;
    }

    @Override // defpackage.kvj
    public final void f(kqn kqnVar, Runnable runnable) {
        this.d.a(runnable, false, true);
    }

    public final void h(Runnable runnable, boolean z) {
        this.d.a(runnable, true, z);
    }
}
