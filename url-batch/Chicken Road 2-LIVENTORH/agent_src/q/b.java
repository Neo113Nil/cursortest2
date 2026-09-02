package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements Iterator, g3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f3015f;

    /* renamed from: g, reason: collision with root package name */
    public int f3016g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3017h;
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3018j;

    public b(int i) {
        this.f3015f = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3016g < this.f3015f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f3016g;
        switch (this.i) {
            case 0:
                f2 = ((f) this.f3018j).f(i);
                break;
            case 1:
                f2 = ((f) this.f3018j).i(i);
                break;
            default:
                f2 = ((g) this.f3018j).f3027g[i];
                break;
        }
        this.f3016g++;
        this.f3017h = true;
        return f2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3017h) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f3016g - 1;
        this.f3016g = i;
        switch (this.i) {
            case 0:
                ((f) this.f3018j).g(i);
                break;
            case 1:
                ((f) this.f3018j).g(i);
                break;
            default:
                ((g) this.f3018j).a(i);
                break;
        }
        this.f3015f--;
        this.f3017h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f3028h);
        this.i = 2;
        this.f3018j = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i) {
        this(fVar.f3036h);
        this.i = i;
        switch (i) {
            case 1:
                this.f3018j = fVar;
                this(fVar.f3036h);
                break;
            default:
                this.f3018j = fVar;
                break;
        }
    }
}
