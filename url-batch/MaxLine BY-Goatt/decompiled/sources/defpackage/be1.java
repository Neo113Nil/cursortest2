package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class be1 implements Iterator, k71 {
    public String m;
    public boolean n;
    public final /* synthetic */ yv o;

    public be1(yv yvVar) {
        this.o = yvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.m == null && !this.n) {
            String readLine = ((BufferedReader) this.o.b).readLine();
            this.m = readLine;
            if (readLine == null) {
                this.n = true;
            }
        }
        return this.m != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            b71.f();
            return null;
        }
        String str = this.m;
        this.m = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
