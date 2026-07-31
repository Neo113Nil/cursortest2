package M;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3425f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3426g;

    public d(Object[] objArr, int i3, int i4) {
        super(i3, i4);
        this.f3426g = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f3425f) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f3421d;
                this.f3421d = i3 + 1;
                return ((Object[]) this.f3426g)[i3];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f3421d++;
                return this.f3426g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f3425f) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f3421d - 1;
                this.f3421d = i3;
                return ((Object[]) this.f3426g)[i3];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f3421d--;
                return this.f3426g;
        }
    }

    public d(int i3, Object obj) {
        super(i3, 1);
        this.f3426g = obj;
    }
}
