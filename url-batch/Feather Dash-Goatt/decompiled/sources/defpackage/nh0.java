package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nh0 implements Iterator, yb0 {
    public final String d;
    public int e;
    public int g;
    public int h;
    public int i;

    public nh0(String str) {
        this.d = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.e;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.i < 0) {
            this.e = 2;
            return false;
        }
        String str = this.d;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.g; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.e = 1;
                this.i = i;
                this.h = length;
                return true;
            }
        }
        i = -1;
        this.e = 1;
        this.i = i;
        this.h = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            dd0.c();
            return null;
        }
        this.e = 0;
        int i = this.h;
        int i2 = this.g;
        this.g = this.i + i;
        return this.d.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
