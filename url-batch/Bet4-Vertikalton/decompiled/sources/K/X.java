package K;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class X implements Iterator, e1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f428a;

    /* renamed from: b, reason: collision with root package name */
    public int f429b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f430c;

    public /* synthetic */ X(int i, Object obj) {
        this.f428a = i;
        this.f430c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f428a) {
            case 0:
                return this.f429b < ((ViewGroup) this.f430c).getChildCount();
            case 1:
                return this.f429b < ((S0.c) this.f430c).a();
            case 2:
                return this.f429b < ((Object[]) this.f430c).length;
        }
        while (true) {
            int i = this.f429b;
            it = (Iterator) this.f430c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f429b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f428a) {
            case 0:
                int i = this.f429b;
                this.f429b = i + 1;
                View childAt = ((ViewGroup) this.f430c).getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f429b;
                this.f429b = i2 + 1;
                return ((S0.c) this.f430c).get(i2);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f430c;
                    int i3 = this.f429b;
                    this.f429b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f429b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i4 = this.f429b;
            it = (Iterator) this.f430c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f429b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f428a) {
            case 0:
                int i = this.f429b - 1;
                this.f429b = i;
                ((ViewGroup) this.f430c).removeViewAt(i);
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
        this.f428a = 2;
        d1.d.e(objArr, "array");
        this.f430c = objArr;
    }

    public X(j1.b bVar) {
        this.f428a = 3;
        this.f430c = bVar.f2599a.iterator();
        this.f429b = bVar.f2600b;
    }
}
