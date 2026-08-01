package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class h implements Iterator, kp {
    public final /* synthetic */ int f = 0;
    public int g;
    public final Object h;

    public h(mg mgVar) {
        this.h = mgVar.a.iterator();
        this.g = mgVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return this.g < ((k) obj).a();
            case 1:
                return this.g < ((Object[]) obj).length;
            default:
                Iterator it = (Iterator) obj;
                while (this.g > 0 && it.hasNext()) {
                    it.next();
                    this.g--;
                }
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.g;
                this.g = i2 + 1;
                return ((k) obj).get(i2);
            case 1:
                try {
                    int i3 = this.g;
                    this.g = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.g--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                Iterator it = (Iterator) obj;
                while (this.g > 0 && it.hasNext()) {
                    it.next();
                    this.g--;
                }
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(k kVar) {
        this.h = kVar;
    }

    public h(Object[] objArr) {
        objArr.getClass();
        this.h = objArr;
    }
}
