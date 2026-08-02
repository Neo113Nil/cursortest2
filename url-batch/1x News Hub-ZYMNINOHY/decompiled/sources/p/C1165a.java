package p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165a implements Iterator, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f10177a;

    /* renamed from: b, reason: collision with root package name */
    public int f10178b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10181e;

    public C1165a(int i3) {
        this.f10177a = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10178b < this.f10177a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e3;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f10178b;
        switch (this.f10180d) {
            case 0:
                e3 = ((C1169e) this.f10181e).e(i3);
                break;
            case 1:
                e3 = ((C1169e) this.f10181e).h(i3);
                break;
            default:
                e3 = ((C1170f) this.f10181e).f10191b[i3];
                break;
        }
        this.f10178b++;
        this.f10179c = true;
        return e3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10179c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.f10178b - 1;
        this.f10178b = i3;
        switch (this.f10180d) {
            case 0:
                ((C1169e) this.f10181e).f(i3);
                break;
            case 1:
                ((C1169e) this.f10181e).f(i3);
                break;
            default:
                ((C1170f) this.f10181e).b(i3);
                break;
        }
        this.f10177a--;
        this.f10179c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1165a(C1170f c1170f) {
        this(c1170f.f10192c);
        this.f10180d = 2;
        this.f10181e = c1170f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1165a(C1169e c1169e, int i3) {
        this(c1169e.f10206c);
        this.f10180d = i3;
        switch (i3) {
            case 1:
                this.f10181e = c1169e;
                this(c1169e.f10206c);
                break;
            default:
                this.f10181e = c1169e;
                break;
        }
    }
}
