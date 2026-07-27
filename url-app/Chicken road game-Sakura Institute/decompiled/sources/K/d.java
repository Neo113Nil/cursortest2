package K;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3422i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3423j;

    public d(Object[] objArr, int i2, int i4) {
        super(i2, i4);
        this.f3423j = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f3422i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f3418d;
                this.f3418d = i2 + 1;
                return ((Object[]) this.f3423j)[i2];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f3418d++;
                return this.f3423j;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f3422i) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f3418d - 1;
                this.f3418d = i2;
                return ((Object[]) this.f3423j)[i2];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f3418d--;
                return this.f3423j;
        }
    }

    public d(int i2, Object obj) {
        super(i2, 1);
        this.f3423j = obj;
    }
}
