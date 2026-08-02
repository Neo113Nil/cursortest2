package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktv extends ktw implements Iterator, kqj {
    public kqj a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(a.Y(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    @Override // defpackage.ktw
    public final Object a(Object obj, kqj kqjVar) {
        this.c = obj;
        this.b = 3;
        this.a = kqjVar;
        return kqp.a;
    }

    @Override // defpackage.ktw
    public final Object b(Iterator it, kqj kqjVar) {
        if (!it.hasNext()) {
            return kow.a;
        }
        this.d = it;
        this.b = 2;
        this.a = kqjVar;
        return kqp.a;
    }

    @Override // defpackage.kqj
    public final kqn bU() {
        return kqo.a;
    }

    @Override // defpackage.kqj
    public final void ca(Object obj) {
        ixc.Y(obj);
        this.b = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            kqj kqjVar = this.a;
            kqjVar.getClass();
            this.a = null;
            kqjVar.ca(kow.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.c();
    }
}
