package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements Iterator, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f3099f;

    /* renamed from: g, reason: collision with root package name */
    public int f3100g;
    public boolean h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3101j;

    public b(int i) {
        this.f3099f = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3100g < this.f3099f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f5;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f3100g;
        switch (this.i) {
            case 0:
                f5 = ((f) this.f3101j).f(i);
                break;
            case 1:
                f5 = ((f) this.f3101j).i(i);
                break;
            default:
                f5 = ((g) this.f3101j).f3109g[i];
                break;
        }
        this.f3100g++;
        this.h = true;
        return f5;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f3100g - 1;
        this.f3100g = i;
        switch (this.i) {
            case 0:
                ((f) this.f3101j).g(i);
                break;
            case 1:
                ((f) this.f3101j).g(i);
                break;
            default:
                ((g) this.f3101j).a(i);
                break;
        }
        this.f3099f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.h);
        this.i = 2;
        this.f3101j = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i) {
        this(fVar.h);
        this.i = i;
        switch (i) {
            case 1:
                this.f3101j = fVar;
                this(fVar.h);
                break;
            default:
                this.f3101j = fVar;
                break;
        }
    }
}
