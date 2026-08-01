package s7;

import java.lang.Thread;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f8807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f8808b;

    public l1(o1 o1Var, String str) {
        this.f8808b = o1Var;
        this.f8807a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        v0 v0Var = ((q1) this.f8808b.f1478d).f8937t;
        q1.l(v0Var);
        v0Var.f9050t.b(th, this.f8807a);
    }
}
