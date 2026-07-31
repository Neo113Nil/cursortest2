package v1;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements o {

    /* renamed from: b, reason: collision with root package name */
    private final long f22723b;

    /* renamed from: c, reason: collision with root package name */
    private final long f22724c;

    /* renamed from: d, reason: collision with root package name */
    private long f22725d;

    public b(long j7, long j8) {
        this.f22723b = j7;
        this.f22724c = j8;
        f();
    }

    protected final void c() {
        long j7 = this.f22725d;
        if (j7 < this.f22723b || j7 > this.f22724c) {
            throw new NoSuchElementException();
        }
    }

    protected final long d() {
        return this.f22725d;
    }

    public boolean e() {
        return this.f22725d > this.f22724c;
    }

    public void f() {
        this.f22725d = this.f22723b - 1;
    }

    @Override // v1.o
    public boolean next() {
        this.f22725d++;
        return !e();
    }
}
