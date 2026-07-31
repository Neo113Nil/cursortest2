package N1;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import k.C0523b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: d, reason: collision with root package name */
    public int f2871d;

    /* renamed from: e, reason: collision with root package name */
    public int f2872e;

    /* renamed from: f, reason: collision with root package name */
    public int f2873f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2874g;

    public f() {
        if (C0523b.f5305b == null) {
            C0523b.f5305b = new C0523b(1);
        }
    }

    public int a(int i3) {
        if (i3 < this.f2873f) {
            return ((ByteBuffer) this.f2874g).getShort(this.f2872e + i3);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f2874g).f2883k != this.f2873f) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i3 = this.f2871d;
            g gVar = (g) this.f2874g;
            if (i3 >= gVar.f2881i || gVar.f2878f[i3] >= 0) {
                return;
            } else {
                this.f2871d = i3 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f2871d < ((g) this.f2874g).f2881i;
    }

    public void remove() {
        b();
        if (this.f2872e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        g gVar = (g) this.f2874g;
        gVar.c();
        gVar.l(this.f2872e);
        this.f2872e = -1;
        this.f2873f = gVar.f2883k;
    }
}
