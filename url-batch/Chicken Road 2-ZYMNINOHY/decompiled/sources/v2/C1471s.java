package v2;

import a.AbstractC0124a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: v2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1471s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f15668a;

    /* renamed from: b, reason: collision with root package name */
    public int f15669b;

    /* renamed from: c, reason: collision with root package name */
    public int f15670c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1474v f15671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1474v f15673f;

    public C1471s(C1474v c1474v, int i4) {
        this.f15672e = i4;
        this.f15673f = c1474v;
        this.f15671d = c1474v;
        this.f15668a = c1474v.f15684e;
        this.f15669b = c1474v.isEmpty() ? -1 : 0;
        this.f15670c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15669b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        C1474v c1474v = this.f15671d;
        if (c1474v.f15684e != this.f15668a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f15669b;
        this.f15670c = i4;
        switch (this.f15672e) {
            case 0:
                obj = this.f15673f.j()[i4];
                break;
            case 1:
                obj = new C1473u(this.f15673f, i4);
                break;
            default:
                obj = this.f15673f.k()[i4];
                break;
        }
        int i5 = this.f15669b + 1;
        if (i5 >= c1474v.f15685f) {
            i5 = -1;
        }
        this.f15669b = i5;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1474v c1474v = this.f15671d;
        if (c1474v.f15684e != this.f15668a) {
            throw new ConcurrentModificationException();
        }
        AbstractC0124a.s("no calls to next() since the last call to remove()", this.f15670c >= 0);
        this.f15668a += 32;
        c1474v.remove(c1474v.j()[this.f15670c]);
        this.f15669b--;
        this.f15670c = -1;
    }
}
