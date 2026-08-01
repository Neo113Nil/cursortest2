package kotlin.text;

import java.util.Iterator;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f5619d;

    /* renamed from: e, reason: collision with root package name */
    public int f5620e;

    /* renamed from: i, reason: collision with root package name */
    public int f5621i;

    /* renamed from: r, reason: collision with root package name */
    public int f5622r;

    /* renamed from: s, reason: collision with root package name */
    public int f5623s;

    public e(CharSequence charSequence) {
        charSequence.getClass();
        this.f5619d = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        int i10;
        int i11 = this.f5620e;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f5623s < 0) {
            this.f5620e = 2;
            return false;
        }
        CharSequence charSequence = this.f5619d;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f5621i; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i3 = (charAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f5620e = 1;
                this.f5623s = i3;
                this.f5622r = length;
                return true;
            }
        }
        i3 = -1;
        this.f5620e = 1;
        this.f5623s = i3;
        this.f5622r = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i0.c();
            return null;
        }
        this.f5620e = 0;
        int i3 = this.f5622r;
        int i10 = this.f5621i;
        this.f5621i = this.f5623s + i3;
        return this.f5619d.subSequence(i10, i3).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
