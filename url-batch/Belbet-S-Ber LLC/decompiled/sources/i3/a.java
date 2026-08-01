package i3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class a implements Iterator, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2069f;

    /* renamed from: g, reason: collision with root package name */
    public int f2070g;
    public final Object h;

    public /* synthetic */ a(int i, Object obj) {
        this.f2069f = i;
        this.h = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2069f) {
            case 0:
                return this.f2070g < ((Object[]) this.h).length;
            case 1:
                return this.f2070g < ((ViewGroup) this.h).getChildCount();
            case 2:
                Iterator it = (Iterator) this.h;
                while (this.f2070g > 0 && it.hasNext()) {
                    it.next();
                    this.f2070g--;
                }
                return it.hasNext();
            default:
                return this.f2070g < ((x2.c) this.h).a();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2069f) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.h;
                    int i = this.f2070g;
                    this.f2070g = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f2070g--;
                    throw new NoSuchElementException(e4.getMessage());
                }
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.h;
                int i4 = this.f2070g;
                this.f2070g = i4 + 1;
                View childAt = viewGroup.getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                Iterator it = (Iterator) this.h;
                while (this.f2070g > 0 && it.hasNext()) {
                    it.next();
                    this.f2070g--;
                }
                return it.next();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                x2.c cVar = (x2.c) this.h;
                int i5 = this.f2070g;
                this.f2070g = i5 + 1;
                return cVar.get(i5);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2069f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.h;
                int i = this.f2070g - 1;
                this.f2070g = i;
                viewGroup.removeViewAt(i);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(Object[] objArr) {
        this.f2069f = 0;
        d.e(objArr, "array");
        this.h = objArr;
    }

    public a(o3.b bVar) {
        this.f2069f = 2;
        this.h = bVar.f3024a.iterator();
        this.f2070g = bVar.f3025b;
    }
}
