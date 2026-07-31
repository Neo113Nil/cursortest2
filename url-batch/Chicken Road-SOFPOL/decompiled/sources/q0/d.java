package q0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5935f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5936g;

    public d(Object[] objArr, int i, int i8) {
        super(i, i8);
        this.f5936g = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5935f) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f5936g;
                int i = this.f5931d;
                this.f5931d = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f5931d++;
                return this.f5936g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5935f) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f5936g;
                int i = this.f5931d - 1;
                this.f5931d = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f5931d--;
                return this.f5936g;
        }
    }

    public d(int i, Object obj) {
        super(i, 1);
        this.f5936g = obj;
    }
}
