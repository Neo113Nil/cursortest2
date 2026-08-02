package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvw extends Exception {
    public final Throwable a;

    public kvw(Throwable th, kvj kvjVar, kqn kqnVar) {
        super(a.ae(kqnVar, kvjVar, "Coroutine dispatcher ", " threw an exception, context = "), th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
