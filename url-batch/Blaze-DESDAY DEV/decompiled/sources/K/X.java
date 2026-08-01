package K;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class X implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f445a;

    /* renamed from: b, reason: collision with root package name */
    public int f446b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f447c;

    public /* synthetic */ X(int i, Object obj) {
        this.f445a = i;
        this.f447c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f445a) {
            case 0:
                return this.f446b < ((ViewGroup) this.f447c).getChildCount();
            case 1:
                return this.f446b < ((V0.c) this.f447c).a();
            case 2:
                return this.f446b < ((Object[]) this.f447c).length;
        }
        while (true) {
            int i = this.f446b;
            it = (Iterator) this.f447c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f446b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f445a) {
            case 0:
                int i = this.f446b;
                this.f446b = i + 1;
                View childAt = ((ViewGroup) this.f447c).getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f446b;
                this.f446b = i2 + 1;
                return ((V0.c) this.f447c).get(i2);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f447c;
                    int i3 = this.f446b;
                    this.f446b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f446b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i4 = this.f446b;
            it = (Iterator) this.f447c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f446b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f445a) {
            case 0:
                int i = this.f446b - 1;
                this.f446b = i;
                ((ViewGroup) this.f447c).removeViewAt(i);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public X(Object[] objArr) {
        this.f445a = 2;
        g1.d.e(objArr, "array");
        this.f447c = objArr;
    }

    public X(m1.b bVar) {
        this.f445a = 3;
        this.f447c = bVar.f3213a.iterator();
        this.f446b = bVar.f3214b;
    }
}
