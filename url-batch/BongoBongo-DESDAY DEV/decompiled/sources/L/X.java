package L;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class X implements Iterator, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f495a;

    /* renamed from: b, reason: collision with root package name */
    public int f496b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f497c;

    public /* synthetic */ X(int i, Object obj) {
        this.f495a = i;
        this.f497c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f495a) {
            case 0:
                return this.f496b < ((ViewGroup) this.f497c).getChildCount();
            case 1:
                return this.f496b < ((W0.c) this.f497c).a();
            case 2:
                return this.f496b < ((Object[]) this.f497c).length;
        }
        while (true) {
            int i = this.f496b;
            it = (Iterator) this.f497c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f496b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f495a) {
            case 0:
                int i = this.f496b;
                this.f496b = i + 1;
                View childAt = ((ViewGroup) this.f497c).getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f496b;
                this.f496b = i2 + 1;
                return ((W0.c) this.f497c).get(i2);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f497c;
                    int i3 = this.f496b;
                    this.f496b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f496b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i4 = this.f496b;
            it = (Iterator) this.f497c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f496b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f495a) {
            case 0:
                int i = this.f496b - 1;
                this.f496b = i;
                ((ViewGroup) this.f497c).removeViewAt(i);
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
        this.f495a = 2;
        h1.d.e(objArr, "array");
        this.f497c = objArr;
    }

    public X(n1.b bVar) {
        this.f495a = 3;
        this.f497c = bVar.f3385a.iterator();
        this.f496b = bVar.f3386b;
    }
}
