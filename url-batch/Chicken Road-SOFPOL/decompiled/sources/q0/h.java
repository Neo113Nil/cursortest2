package q0;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f5950f;

    /* renamed from: g, reason: collision with root package name */
    public final k f5951g;

    public h(Object[] objArr, Object[] objArr2, int i, int i8, int i9) {
        super(i, i8);
        this.f5950f = objArr2;
        int i10 = (i8 - 1) & (-32);
        this.f5951g = new k(objArr, i > i10 ? i10 : i, i10, i9);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k kVar = this.f5951g;
        if (kVar.hasNext()) {
            this.f5931d++;
            return kVar.next();
        }
        int i = this.f5931d;
        this.f5931d = i + 1;
        return this.f5950f[i - kVar.f5932e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5931d;
        k kVar = this.f5951g;
        int i8 = kVar.f5932e;
        if (i <= i8) {
            this.f5931d = i - 1;
            return kVar.previous();
        }
        int i9 = i - 1;
        this.f5931d = i9;
        return this.f5950f[i9 - i8];
    }
}
