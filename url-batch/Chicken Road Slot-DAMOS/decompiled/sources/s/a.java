package s;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public int f8256d;

    /* renamed from: e, reason: collision with root package name */
    public int f8257e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8258i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8259r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8260s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i3) {
        this(eVar.f8369i);
        this.f8259r = i3;
        switch (i3) {
            case 1:
                this.f8260s = eVar;
                this(eVar.f8369i);
                break;
            default:
                this.f8260s = eVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8257e < this.f8256d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e2;
        if (!hasNext()) {
            kotlin.collections.i0.c();
            return null;
        }
        int i3 = this.f8257e;
        switch (this.f8259r) {
            case 0:
                e2 = ((e) this.f8260s).e(i3);
                break;
            case 1:
                e2 = ((e) this.f8260s).h(i3);
                break;
            default:
                e2 = ((f) this.f8260s).f8297e[i3];
                break;
        }
        this.f8257e++;
        this.f8258i = true;
        return e2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8258i) {
            kotlin.collections.i0.l("Call next() before removing an element.");
            return;
        }
        int i3 = this.f8257e - 1;
        this.f8257e = i3;
        switch (this.f8259r) {
            case 0:
                ((e) this.f8260s).f(i3);
                break;
            case 1:
                ((e) this.f8260s).f(i3);
                break;
            default:
                ((f) this.f8260s).b(i3);
                break;
        }
        this.f8256d--;
        this.f8258i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f8298i);
        this.f8259r = 2;
        this.f8260s = fVar;
    }

    public a(int i3) {
        this.f8256d = i3;
    }
}
