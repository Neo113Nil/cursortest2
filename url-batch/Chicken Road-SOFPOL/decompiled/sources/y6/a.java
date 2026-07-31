package y6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f8986d;

    /* renamed from: e, reason: collision with root package name */
    public int f8987e;

    /* renamed from: f, reason: collision with root package name */
    public int f8988f;

    /* renamed from: g, reason: collision with root package name */
    public int f8989g;

    /* renamed from: h, reason: collision with root package name */
    public int f8990h;

    public a(CharSequence charSequence) {
        q6.i.e(charSequence, "string");
        this.f8986d = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i8;
        int i9 = this.f8987e;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f8990h < 0) {
            this.f8987e = 2;
            return false;
        }
        CharSequence charSequence = this.f8986d;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i10 = this.f8988f; i10 < length2; i10++) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i8 = i10 + 1) < charSequence.length() && charSequence.charAt(i8) == '\n') ? 2 : 1;
                length = i10;
                this.f8987e = 1;
                this.f8990h = i;
                this.f8989g = length;
                return true;
            }
        }
        i = -1;
        this.f8987e = 1;
        this.f8990h = i;
        this.f8989g = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8987e = 0;
        int i = this.f8989g;
        int i8 = this.f8988f;
        this.f8988f = this.f8990h + i;
        return this.f8986d.subSequence(i8, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
