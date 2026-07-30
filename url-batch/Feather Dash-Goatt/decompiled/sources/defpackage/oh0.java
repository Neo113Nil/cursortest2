package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oh0 implements Iterator, yb0 {
    public String d;
    public boolean e;
    public final /* synthetic */ x9 g;

    public oh0(x9 x9Var) {
        this.g = x9Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == null && !this.e) {
            String readLine = ((BufferedReader) this.g.b).readLine();
            this.d = readLine;
            if (readLine == null) {
                this.e = true;
            }
        }
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            dd0.c();
            return null;
        }
        String str = this.d;
        this.d = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
