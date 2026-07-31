package T1;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import m1.w;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: d, reason: collision with root package name */
    public int f4350d;

    /* renamed from: e, reason: collision with root package name */
    public int f4351e;

    /* renamed from: f, reason: collision with root package name */
    public int f4352f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4353g;

    public e() {
        if (w.f6990e == null) {
            w.f6990e = new w(1);
        }
    }

    public int a(int i3) {
        if (i3 < this.f4352f) {
            return ((ByteBuffer) this.f4353g).getShort(this.f4351e + i3);
        }
        return 0;
    }

    public void b() {
        if (((f) this.f4353g).f4362k != this.f4352f) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i3 = this.f4350d;
            f fVar = (f) this.f4353g;
            if (i3 >= fVar.f4360i || fVar.f4357f[i3] >= 0) {
                return;
            } else {
                this.f4350d = i3 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f4350d < ((f) this.f4353g).f4360i;
    }

    public void remove() {
        b();
        if (this.f4351e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        f fVar = (f) this.f4353g;
        fVar.c();
        fVar.l(this.f4351e);
        this.f4351e = -1;
        this.f4352f = fVar.f4362k;
    }
}
