package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpo implements Iterator {
    private final int a;
    private boolean b;
    private int c;

    public kpo(int i, int i2) {
        this.a = i2;
        boolean z = i <= i2;
        this.b = z;
        this.c = true != z ? i2 : i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.c;
        if (i != this.a) {
            this.c = i + 1;
        } else {
            if (!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.c();
    }
}
