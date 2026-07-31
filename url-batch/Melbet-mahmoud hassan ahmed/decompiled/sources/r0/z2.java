package r0;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    private final b f21110a;

    /* renamed from: b, reason: collision with root package name */
    private final a f21111b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.d f21112c;

    /* renamed from: d, reason: collision with root package name */
    private final r3 f21113d;

    /* renamed from: e, reason: collision with root package name */
    private int f21114e;

    /* renamed from: f, reason: collision with root package name */
    private Object f21115f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f21116g;

    /* renamed from: h, reason: collision with root package name */
    private int f21117h;

    /* renamed from: i, reason: collision with root package name */
    private long f21118i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21119j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21120k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21121l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21122m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21123n;

    public interface a {
        void c(z2 z2Var);
    }

    public interface b {
        void p(int i7, Object obj);
    }

    public z2(a aVar, b bVar, r3 r3Var, int i7, o2.d dVar, Looper looper) {
        this.f21111b = aVar;
        this.f21110a = bVar;
        this.f21113d = r3Var;
        this.f21116g = looper;
        this.f21112c = dVar;
        this.f21117h = i7;
    }

    public synchronized boolean a(long j7) {
        boolean z6;
        o2.a.f(this.f21120k);
        o2.a.f(this.f21116g.getThread() != Thread.currentThread());
        long a7 = this.f21112c.a() + j7;
        while (true) {
            z6 = this.f21122m;
            if (z6 || j7 <= 0) {
                break;
            }
            this.f21112c.d();
            wait(j7);
            j7 = a7 - this.f21112c.a();
        }
        if (!z6) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f21121l;
    }

    public boolean b() {
        return this.f21119j;
    }

    public Looper c() {
        return this.f21116g;
    }

    public int d() {
        return this.f21117h;
    }

    public Object e() {
        return this.f21115f;
    }

    public long f() {
        return this.f21118i;
    }

    public b g() {
        return this.f21110a;
    }

    public r3 h() {
        return this.f21113d;
    }

    public int i() {
        return this.f21114e;
    }

    public synchronized boolean j() {
        return this.f21123n;
    }

    public synchronized void k(boolean z6) {
        this.f21121l = z6 | this.f21121l;
        this.f21122m = true;
        notifyAll();
    }

    public z2 l() {
        o2.a.f(!this.f21120k);
        if (this.f21118i == -9223372036854775807L) {
            o2.a.a(this.f21119j);
        }
        this.f21120k = true;
        this.f21111b.c(this);
        return this;
    }

    public z2 m(Object obj) {
        o2.a.f(!this.f21120k);
        this.f21115f = obj;
        return this;
    }

    public z2 n(int i7) {
        o2.a.f(!this.f21120k);
        this.f21114e = i7;
        return this;
    }
}
