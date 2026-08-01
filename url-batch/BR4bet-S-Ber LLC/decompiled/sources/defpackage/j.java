package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class j implements Iterator, wr {
    public final /* synthetic */ int f = 0;
    public int g;
    public final Object h;

    public j(ni niVar) {
        this.h = niVar.a.iterator();
        this.g = niVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return this.g < ((m) obj).a();
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
                return ((m) obj).get(i2);
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

    public j(m mVar) {
        this.h = mVar;
    }

    public j(Object[] objArr) {
        objArr.getClass();
        this.h = objArr;
    }
}
