package d4;

import id.h;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import kotlin.collections.i0;
import u8.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public int f3616d;

    /* renamed from: e, reason: collision with root package name */
    public int f3617e;

    /* renamed from: i, reason: collision with root package name */
    public int f3618i;

    /* renamed from: r, reason: collision with root package name */
    public Object f3619r;

    public c() {
        if (d.f9692i == null) {
            d.f9692i = new d(18);
        }
    }

    public int a(int i3) {
        if (i3 < this.f3618i) {
            return ((ByteBuffer) this.f3619r).getShort(this.f3617e + i3);
        }
        return 0;
    }

    public void b() {
        if (((h) this.f3619r).f4701v != this.f3618i) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i3 = this.f3616d;
            h hVar = (h) this.f3619r;
            if (i3 >= hVar.f4699t || hVar.f4696i[i3] >= 0) {
                return;
            } else {
                this.f3616d = i3 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f3616d < ((h) this.f3619r).f4699t;
    }

    public void remove() {
        h hVar = (h) this.f3619r;
        b();
        if (this.f3617e == -1) {
            i0.l("Call next() before removing element from the iterator.");
            return;
        }
        hVar.c();
        hVar.k(this.f3617e);
        this.f3617e = -1;
        this.f3618i = hVar.f4701v;
    }
}
