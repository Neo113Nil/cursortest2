package e4;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import w5.f;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public int f2488d;

    /* renamed from: e, reason: collision with root package name */
    public int f2489e;

    /* renamed from: f, reason: collision with root package name */
    public int f2490f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2491g;

    public c() {
        if (f.f8084e == null) {
            f.f8084e = new f(12);
        }
    }

    public int a(int i) {
        if (i < this.f2490f) {
            return ((ByteBuffer) this.f2491g).getShort(this.f2489e + i);
        }
        return 0;
    }

    public void b() {
        if (((e6.f) this.f2491g).f2528k != this.f2490f) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.f2488d;
            e6.f fVar = (e6.f) this.f2491g;
            if (i >= fVar.i || fVar.f2524f[i] >= 0) {
                return;
            } else {
                this.f2488d = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f2488d < ((e6.f) this.f2491g).i;
    }

    public void remove() {
        e6.f fVar = (e6.f) this.f2491g;
        b();
        if (this.f2489e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fVar.b();
        fVar.k(this.f2489e);
        this.f2489e = -1;
        this.f2490f = fVar.f2528k;
    }
}
