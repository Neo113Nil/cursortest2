package F5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class d implements Iterator, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f795f;

    /* renamed from: g, reason: collision with root package name */
    public int f796g;

    /* renamed from: h, reason: collision with root package name */
    public int f797h;

    /* renamed from: i, reason: collision with root package name */
    public int f798i;

    /* renamed from: j, reason: collision with root package name */
    public int f799j;

    public d(CharSequence string) {
        kotlin.jvm.internal.i.e(string, "string");
        this.f795f = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i8;
        int i9 = this.f796g;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f799j < 0) {
            this.f796g = 2;
            return false;
        }
        CharSequence charSequence = this.f795f;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i10 = this.f797h; i10 < length2; i10++) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                i7 = (charAt == '\r' && (i8 = i10 + 1) < charSequence.length() && charSequence.charAt(i8) == '\n') ? 2 : 1;
                length = i10;
                this.f796g = 1;
                this.f799j = i7;
                this.f798i = length;
                return true;
            }
        }
        i7 = -1;
        this.f796g = 1;
        this.f799j = i7;
        this.f798i = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f796g = 0;
        int i7 = this.f798i;
        int i8 = this.f797h;
        this.f797h = this.f799j + i7;
        return this.f795f.subSequence(i8, i7).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
