package d6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o.u0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class b implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2310d;

    /* renamed from: e, reason: collision with root package name */
    public int f2311e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2312f;

    public /* synthetic */ b(int i, Object obj) {
        this.f2310d = i;
        this.f2312f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2310d) {
            case 0:
                if (this.f2311e < ((e) this.f2312f).a()) {
                }
                break;
            case 1:
                if (this.f2311e < ((u0) this.f2312f).f()) {
                }
                break;
            default:
                if (this.f2311e < ((Object[]) this.f2312f).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2310d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                e eVar = (e) this.f2312f;
                int i = this.f2311e;
                this.f2311e = i + 1;
                return eVar.get(i);
            case 1:
                u0 u0Var = (u0) this.f2312f;
                int i8 = this.f2311e;
                this.f2311e = i8 + 1;
                return u0Var.g(i8);
            default:
                try {
                    Object[] objArr = (Object[]) this.f2312f;
                    int i9 = this.f2311e;
                    this.f2311e = i9 + 1;
                    return objArr[i9];
                } catch (ArrayIndexOutOfBoundsException e8) {
                    this.f2311e--;
                    throw new NoSuchElementException(e8.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2310d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Object[] objArr) {
        this.f2310d = 2;
        q6.i.e(objArr, "array");
        this.f2312f = objArr;
    }
}
