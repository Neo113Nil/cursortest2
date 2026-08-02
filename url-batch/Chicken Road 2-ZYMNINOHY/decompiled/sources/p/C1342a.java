package p;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342a implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public int f14636a;

    /* renamed from: b, reason: collision with root package name */
    public int f14637b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14638c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14640e;

    public C1342a(int i4) {
        this.f14636a = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14637b < this.f14636a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f4;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f14637b;
        switch (this.f14639d) {
            case 0:
                f4 = ((e) this.f14640e).f(i4);
                break;
            case 1:
                f4 = ((e) this.f14640e).i(i4);
                break;
            default:
                f4 = ((f) this.f14640e).f14651b[i4];
                break;
        }
        this.f14637b++;
        this.f14638c = true;
        return f4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14638c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i4 = this.f14637b - 1;
        this.f14637b = i4;
        switch (this.f14639d) {
            case 0:
                ((e) this.f14640e).g(i4);
                break;
            case 1:
                ((e) this.f14640e).g(i4);
                break;
            default:
                ((f) this.f14640e).b(i4);
                break;
        }
        this.f14636a--;
        this.f14638c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1342a(f fVar) {
        this(fVar.f14652c);
        this.f14639d = 2;
        this.f14640e = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1342a(e eVar, int i4) {
        this(eVar.f14667c);
        this.f14639d = i4;
        switch (i4) {
            case 1:
                this.f14640e = eVar;
                this(eVar.f14667c);
                break;
            default:
                this.f14640e = eVar;
                break;
        }
    }
}
