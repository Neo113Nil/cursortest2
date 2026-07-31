package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public int f5406d;

    /* renamed from: e, reason: collision with root package name */
    public int f5407e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5410h;

    public a(int i) {
        this.f5406d = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5407e < this.f5406d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f6;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f5407e;
        switch (this.f5409g) {
            case 0:
                f6 = ((e) this.f5410h).f(i);
                break;
            case 1:
                f6 = ((e) this.f5410h).i(i);
                break;
            default:
                f6 = ((f) this.f5410h).f5445e[i];
                break;
        }
        this.f5407e++;
        this.f5408f = true;
        return f6;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5408f) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f5407e - 1;
        this.f5407e = i;
        switch (this.f5409g) {
            case 0:
                ((e) this.f5410h).g(i);
                break;
            case 1:
                ((e) this.f5410h).g(i);
                break;
            default:
                ((f) this.f5410h).a(i);
                break;
        }
        this.f5406d--;
        this.f5408f = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f5446f);
        this.f5409g = 2;
        this.f5410h = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i) {
        this(eVar.f5542f);
        this.f5409g = i;
        switch (i) {
            case 1:
                this.f5410h = eVar;
                this(eVar.f5542f);
                break;
            default:
                this.f5410h = eVar;
                break;
        }
    }
}
