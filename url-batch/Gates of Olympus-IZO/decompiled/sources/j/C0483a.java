package j;

import a2.InterfaceC0184a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483a implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public int f5147d;

    /* renamed from: e, reason: collision with root package name */
    public int f5148e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5151h;

    public C0483a(int i3) {
        this.f5147d = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5148e < this.f5147d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e3;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f5148e;
        switch (this.f5150g) {
            case 0:
                e3 = ((C0487e) this.f5151h).e(i3);
                break;
            case 1:
                e3 = ((C0487e) this.f5151h).h(i3);
                break;
            default:
                e3 = ((C0488f) this.f5151h).f5162e[i3];
                break;
        }
        this.f5148e++;
        this.f5149f = true;
        return e3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5149f) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.f5148e - 1;
        this.f5148e = i3;
        switch (this.f5150g) {
            case 0:
                ((C0487e) this.f5151h).f(i3);
                break;
            case 1:
                ((C0487e) this.f5151h).f(i3);
                break;
            default:
                ((C0488f) this.f5151h).b(i3);
                break;
        }
        this.f5147d--;
        this.f5149f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0483a(C0488f c0488f) {
        this(c0488f.f5163f);
        this.f5150g = 2;
        this.f5151h = c0488f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0483a(C0487e c0487e, int i3) {
        this(c0487e.f5140f);
        this.f5150g = i3;
        switch (i3) {
            case 1:
                this.f5151h = c0487e;
                this(c0487e.f5140f);
                break;
            default:
                this.f5151h = c0487e;
                break;
        }
    }
}
