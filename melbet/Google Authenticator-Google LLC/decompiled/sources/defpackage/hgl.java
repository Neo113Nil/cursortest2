package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hgl extends hjr {
    private final Object a;
    private boolean b;

    public hgl(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            throw new NoSuchElementException();
        }
        this.b = true;
        return this.a;
    }
}
