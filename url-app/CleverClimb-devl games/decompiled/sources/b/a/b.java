package b.a;

/* compiled from: NamedRunnable.java */
/* loaded from: classes.dex */
public abstract class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    protected final String f1831b;

    protected abstract void b();

    public b(String str, Object... objArr) {
        this.f1831b = c.a(str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f1831b);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
