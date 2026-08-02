package w3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;

/* renamed from: w3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507d implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f15944a;

    /* renamed from: b, reason: collision with root package name */
    public int f15945b;

    /* renamed from: c, reason: collision with root package name */
    public int f15946c;

    /* renamed from: d, reason: collision with root package name */
    public int f15947d;

    /* renamed from: e, reason: collision with root package name */
    public int f15948e;

    public C1507d(CharSequence string) {
        kotlin.jvm.internal.i.e(string, "string");
        this.f15944a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i5;
        int i6 = this.f15945b;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f15948e < 0) {
            this.f15945b = 2;
            return false;
        }
        CharSequence charSequence = this.f15944a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i7 = this.f15946c; i7 < length2; i7++) {
            char charAt = charSequence.charAt(i7);
            if (charAt == '\n' || charAt == '\r') {
                i4 = (charAt == '\r' && (i5 = i7 + 1) < charSequence.length() && charSequence.charAt(i5) == '\n') ? 2 : 1;
                length = i7;
                this.f15945b = 1;
                this.f15948e = i4;
                this.f15947d = length;
                return true;
            }
        }
        i4 = -1;
        this.f15945b = 1;
        this.f15948e = i4;
        this.f15947d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15945b = 0;
        int i4 = this.f15947d;
        int i5 = this.f15946c;
        this.f15946c = this.f15948e + i4;
        return this.f15944a.subSequence(i5, i4).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
