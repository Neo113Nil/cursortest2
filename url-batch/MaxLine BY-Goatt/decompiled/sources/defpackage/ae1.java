package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ae1 implements Iterator, k71 {
    public final CharSequence m;
    public int n;
    public int o;
    public int p;
    public int q;

    public ae1(CharSequence charSequence) {
        charSequence.getClass();
        this.m = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.n;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.q < 0) {
            this.n = 2;
            return false;
        }
        CharSequence charSequence = this.m;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.o; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.n = 1;
                this.q = i;
                this.p = length;
                return true;
            }
        }
        i = -1;
        this.n = 1;
        this.q = i;
        this.p = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            b71.f();
            return null;
        }
        this.n = 0;
        int i = this.p;
        int i2 = this.o;
        this.o = this.q + i;
        return this.m.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
