package u;

import f6.InterfaceC0406a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930a implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public int f8014d;

    /* renamed from: e, reason: collision with root package name */
    public int f8015e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8016i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8017l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8018m;

    public C0930a(int i2) {
        this.f8014d = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8015e < this.f8014d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e7;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f8015e;
        switch (this.f8017l) {
            case 0:
                e7 = ((C0934e) this.f8018m).e(i2);
                break;
            case 1:
                e7 = ((C0934e) this.f8018m).h(i2);
                break;
            default:
                e7 = ((C0935f) this.f8018m).f8029e[i2];
                break;
        }
        this.f8015e++;
        this.f8016i = true;
        return e7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8016i) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.f8015e - 1;
        this.f8015e = i2;
        switch (this.f8017l) {
            case 0:
                ((C0934e) this.f8018m).f(i2);
                break;
            case 1:
                ((C0934e) this.f8018m).f(i2);
                break;
            default:
                ((C0935f) this.f8018m).a(i2);
                break;
        }
        this.f8014d--;
        this.f8016i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0930a(C0935f c0935f) {
        this(c0935f.f8030i);
        this.f8017l = 2;
        this.f8018m = c0935f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0930a(C0934e c0934e, int i2) {
        this(c0934e.f8045i);
        this.f8017l = i2;
        switch (i2) {
            case 1:
                this.f8018m = c0934e;
                this(c0934e.f8045i);
                break;
            default:
                this.f8018m = c0934e;
                break;
        }
    }
}
