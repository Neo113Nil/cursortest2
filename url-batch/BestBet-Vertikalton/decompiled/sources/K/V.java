package K;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public class V implements Iterator, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f583a;

    /* renamed from: b, reason: collision with root package name */
    public int f584b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f585c;

    public /* synthetic */ V(int i, Object obj) {
        this.f583a = i;
        this.f585c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f583a) {
            case 0:
                return this.f584b < ((ViewGroup) this.f585c).getChildCount();
            case 1:
                return this.f584b < ((Y0.d) this.f585c).a();
            case 2:
                return this.f584b < ((Object[]) this.f585c).length;
        }
        while (true) {
            int i = this.f584b;
            it = (Iterator) this.f585c;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f584b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f583a) {
            case 0:
                int i = this.f584b;
                this.f584b = i + 1;
                View childAt = ((ViewGroup) this.f585c).getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f584b;
                this.f584b = i2 + 1;
                return ((Y0.d) this.f585c).get(i2);
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f585c;
                    int i3 = this.f584b;
                    this.f584b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f584b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i4 = this.f584b;
            it = (Iterator) this.f585c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f584b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f583a) {
            case 0:
                int i = this.f584b - 1;
                this.f584b = i;
                ((ViewGroup) this.f585c).removeViewAt(i);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public V(Object[] objArr) {
        this.f583a = 2;
        k1.e.e(objArr, "array");
        this.f585c = objArr;
    }

    public V(q1.b bVar) {
        this.f583a = 3;
        this.f585c = bVar.f3813a.iterator();
        this.f584b = bVar.f3814b;
    }
}
