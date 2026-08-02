package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksf implements Iterator {
    private int a;
    private final /* synthetic */ int b;
    private final Object c;

    public ksf(cpe cpeVar, int i) {
        this.b = i;
        this.c = cpeVar;
        this.a = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != 0) {
            return this.a < ((cpe) this.c).a.h + (-1);
        }
        return this.a < ((Object[]) this.c).length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == 0) {
            try {
                Object obj = this.c;
                int i = this.a;
                this.a = i + 1;
                return ((Object[]) obj)[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                this.a--;
                throw new NoSuchElementException(e.getMessage());
            }
        }
        if (hasNext()) {
            Object obj2 = this.c;
            int i2 = this.a + 1;
            this.a = i2;
            return new cpf(((cpe) obj2).a, i2);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b != 0) {
            throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
        }
        a.c();
    }

    public ksf(Object[] objArr, int i) {
        this.b = i;
        this.c = objArr;
    }
}
