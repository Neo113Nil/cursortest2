package A2;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: d, reason: collision with root package name */
    public int f835d;

    /* renamed from: e, reason: collision with root package name */
    public int f836e;

    /* renamed from: i, reason: collision with root package name */
    public int f837i;

    /* renamed from: j, reason: collision with root package name */
    public Object f838j;

    public h() {
        if (E1.i.f2295i == null) {
            E1.i.f2295i = new E1.i(17);
        }
    }

    public int b(int i2) {
        if (i2 < this.f837i) {
            return ((ByteBuffer) this.f838j).getShort(this.f836e + i2);
        }
        return 0;
    }

    public void c() {
        if (((e) this.f838j).f826n != this.f837i) {
            throw new ConcurrentModificationException();
        }
    }

    public void d() {
        while (true) {
            int i2 = this.f835d;
            e eVar = (e) this.f838j;
            if (i2 >= eVar.f824l || eVar.f821i[i2] >= 0) {
                return;
            } else {
                this.f835d = i2 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f835d < ((e) this.f838j).f824l;
    }

    public void remove() {
        c();
        if (this.f836e == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        e eVar = (e) this.f838j;
        eVar.c();
        eVar.n(this.f836e);
        this.f836e = -1;
        this.f837i = eVar.f826n;
    }
}
