package j;

import g2.InterfaceC0439a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527a implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public int f6265d;

    /* renamed from: e, reason: collision with root package name */
    public int f6266e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6268g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6269h;

    public C0527a(int i3) {
        this.f6265d = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6266e < this.f6265d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e3;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f6266e;
        switch (this.f6268g) {
            case 0:
                e3 = ((C0531e) this.f6269h).e(i3);
                break;
            case 1:
                e3 = ((C0531e) this.f6269h).h(i3);
                break;
            default:
                e3 = ((C0532f) this.f6269h).f6280e[i3];
                break;
        }
        this.f6266e++;
        this.f6267f = true;
        return e3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6267f) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.f6266e - 1;
        this.f6266e = i3;
        switch (this.f6268g) {
            case 0:
                ((C0531e) this.f6269h).f(i3);
                break;
            case 1:
                ((C0531e) this.f6269h).f(i3);
                break;
            default:
                ((C0532f) this.f6269h).b(i3);
                break;
        }
        this.f6265d--;
        this.f6267f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0527a(C0532f c0532f) {
        this(c0532f.f6281f);
        this.f6268g = 2;
        this.f6269h = c0532f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0527a(C0531e c0531e, int i3) {
        this(c0531e.f6258f);
        this.f6268g = i3;
        switch (i3) {
            case 1:
                this.f6269h = c0531e;
                this(c0531e.f6258f);
                break;
            default:
                this.f6269h = c0531e;
                break;
        }
    }
}
