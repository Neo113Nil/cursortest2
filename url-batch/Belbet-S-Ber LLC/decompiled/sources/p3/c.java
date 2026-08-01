package p3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements Iterator, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f3095f;

    /* renamed from: g, reason: collision with root package name */
    public int f3096g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3097j;

    public c(String str) {
        i3.d.e(str, "string");
        this.f3095f = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i4;
        int i5 = this.f3096g;
        if (i5 != 0) {
            return i5 == 1;
        }
        if (this.f3097j < 0) {
            this.f3096g = 2;
            return false;
        }
        CharSequence charSequence = this.f3095f;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i6 = this.h; i6 < length2; i6++) {
            char charAt = charSequence.charAt(i6);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i4 = i6 + 1) < charSequence.length() && charSequence.charAt(i4) == '\n') ? 2 : 1;
                length = i6;
                this.f3096g = 1;
                this.f3097j = i;
                this.i = length;
                return true;
            }
        }
        i = -1;
        this.f3096g = 1;
        this.f3097j = i;
        this.i = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3096g = 0;
        int i = this.i;
        int i4 = this.h;
        this.h = this.f3097j + i;
        return this.f3095f.subSequence(i4, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
