package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class kft implements Runnable {
    private final jxr a;

    protected kft(jxr jxrVar) {
        this.a = jxrVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        jxr a = this.a.a();
        try {
            a();
        } finally {
            this.a.f(a);
        }
    }
}
