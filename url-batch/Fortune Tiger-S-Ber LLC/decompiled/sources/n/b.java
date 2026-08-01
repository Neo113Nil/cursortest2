package n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements Iterator, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public int f2920f;
    public int g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2921i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2922j;

    public b(int i4) {
        this.f2920f = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f2920f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f4;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.g;
        switch (this.f2921i) {
            case 0:
                f4 = ((f) this.f2922j).f(i4);
                break;
            case 1:
                f4 = ((f) this.f2922j).i(i4);
                break;
            default:
                f4 = ((g) this.f2922j).g[i4];
                break;
        }
        this.g++;
        this.h = true;
        return f4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i4 = this.g - 1;
        this.g = i4;
        switch (this.f2921i) {
            case 0:
                ((f) this.f2922j).g(i4);
                break;
            case 1:
                ((f) this.f2922j).g(i4);
                break;
            default:
                ((g) this.f2922j).a(i4);
                break;
        }
        this.f2920f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.h);
        this.f2921i = 2;
        this.f2922j = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i4) {
        this(fVar.h);
        this.f2921i = i4;
        switch (i4) {
            case 1:
                this.f2922j = fVar;
                this(fVar.h);
                break;
            default:
                this.f2922j = fVar;
                break;
        }
    }
}
