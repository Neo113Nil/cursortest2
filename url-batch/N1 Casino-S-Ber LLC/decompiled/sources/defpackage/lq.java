package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class lq implements Iterator, kp {
    public final String f;
    public int g;
    public int h;
    public int i;
    public int j;

    public lq(String str) {
        this.f = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.g;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.j < 0) {
            this.g = 2;
            return false;
        }
        String str = this.f;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.h; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.g = 1;
                this.j = i;
                this.i = length;
                return true;
            }
        }
        i = -1;
        this.g = 1;
        this.j = i;
        this.i = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.g = 0;
        int i = this.i;
        int i2 = this.h;
        this.h = this.j + i;
        return this.f.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
