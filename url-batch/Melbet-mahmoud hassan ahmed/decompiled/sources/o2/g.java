package o2;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final d f19717a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19718b;

    public g() {
        this(d.f19699a);
    }

    public g(d dVar) {
        this.f19717a = dVar;
    }

    public synchronized void a() {
        while (!this.f19718b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z6 = false;
        while (!this.f19718b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z6;
        z6 = this.f19718b;
        this.f19718b = false;
        return z6;
    }

    public synchronized boolean d() {
        return this.f19718b;
    }

    public synchronized boolean e() {
        if (this.f19718b) {
            return false;
        }
        this.f19718b = true;
        notifyAll();
        return true;
    }
}
