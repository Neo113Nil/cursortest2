package kotlin.text;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class LinesIterator implements Iterator, KMappedMarker {
    public int delimiterLength;
    public int delimiterStartIndex;
    public int state;

    /* renamed from: string, reason: collision with root package name */
    public final CharSequence f1541string;
    public int tokenStartIndex;

    public LinesIterator(CharSequence charSequence) {
        charSequence.getClass();
        this.f1541string = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.state;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.delimiterLength < 0) {
            this.state = 2;
            return false;
        }
        CharSequence charSequence = this.f1541string;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.tokenStartIndex; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.state = 1;
                this.delimiterLength = i;
                this.delimiterStartIndex = length;
                return true;
            }
        }
        i = -1;
        this.state = 1;
        this.delimiterLength = i;
        this.delimiterStartIndex = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.state = 0;
        int i = this.delimiterStartIndex;
        int i2 = this.tokenStartIndex;
        this.tokenStartIndex = this.delimiterLength + i;
        return this.f1541string.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
