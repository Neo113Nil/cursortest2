package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class h implements Iterator, vp {
    public final /* synthetic */ int f = 2;
    public int g;
    public final Object h;

    public h(eg egVar) {
        this.h = egVar.a.iterator();
        this.g = egVar.b;
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
