package f6;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: f, reason: collision with root package name */
    public int f3413f;

    /* renamed from: g, reason: collision with root package name */
    public int f3414g;

    /* renamed from: h, reason: collision with root package name */
    public int f3415h;

    /* renamed from: i, reason: collision with root package name */
    public Object f3416i;

    public f() {
        if (m4.f.f6365g == null) {
            m4.f.f6365g = new m4.f();
        }
    }

    public int a(int i7) {
        if (i7 < this.f3415h) {
            return ((ByteBuffer) this.f3416i).getShort(this.f3414g + i7);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f3416i).f3425m != this.f3415h) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i7 = this.f3413f;
            g gVar = (g) this.f3416i;
            if (i7 >= gVar.f3423k || gVar.f3420h[i7] >= 0) {
                return;
            } else {
                this.f3413f = i7 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f3413f < ((g) this.f3416i).f3423k;
    }

    public void remove() {
        g gVar = (g) this.f3416i;
        b();
        if (this.f3414g == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        gVar.c();
        gVar.l(this.f3414g);
        this.f3414g = -1;
        this.f3415h = gVar.f3425m;
    }
}
