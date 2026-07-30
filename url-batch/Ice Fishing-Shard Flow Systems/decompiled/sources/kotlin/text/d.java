package kotlin.text;

import f6.InterfaceC0406a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f6191d;

    /* renamed from: e, reason: collision with root package name */
    public int f6192e;

    /* renamed from: i, reason: collision with root package name */
    public int f6193i;

    /* renamed from: l, reason: collision with root package name */
    public int f6194l;

    /* renamed from: m, reason: collision with root package name */
    public int f6195m;

    public d(CharSequence string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f6191d = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i5;
        int i7 = this.f6192e;
        if (i7 != 0) {
            return i7 == 1;
        }
        if (this.f6195m < 0) {
            this.f6192e = 2;
            return false;
        }
        CharSequence charSequence = this.f6191d;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i8 = this.f6193i; i8 < length2; i8++) {
            char charAt = charSequence.charAt(i8);
            if (charAt == '\n' || charAt == '\r') {
                i2 = (charAt == '\r' && (i5 = i8 + 1) < charSequence.length() && charSequence.charAt(i5) == '\n') ? 2 : 1;
                length = i8;
                this.f6192e = 1;
                this.f6195m = i2;
                this.f6194l = length;
                return true;
            }
        }
        i2 = -1;
        this.f6192e = 1;
        this.f6195m = i2;
        this.f6194l = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6192e = 0;
        int i2 = this.f6194l;
        int i5 = this.f6193i;
        this.f6193i = this.f6195m + i2;
        return this.f6191d.subSequence(i5, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
