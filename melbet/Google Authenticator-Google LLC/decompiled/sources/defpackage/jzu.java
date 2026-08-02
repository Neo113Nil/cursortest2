package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzu implements Iterator {
    final /* synthetic */ jzv a;
    private boolean b = true;
    private int c;

    public jzu(jzv jzvVar) {
        this.a = jzvVar;
        this.c = jzvVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return true;
        }
        while (true) {
            int i = this.c;
            jzv jzvVar = this.a;
            kaa kaaVar = jzvVar.c;
            if (i >= kaaVar.e) {
                return false;
            }
            if (Arrays.equals(jzvVar.a.b, kaaVar.k(i))) {
                this.b = true;
                return true;
            }
            this.c++;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = false;
        jzv jzvVar = this.a;
        int i = this.c;
        this.c = i + 1;
        return jzvVar.c.e(i, jzvVar.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
