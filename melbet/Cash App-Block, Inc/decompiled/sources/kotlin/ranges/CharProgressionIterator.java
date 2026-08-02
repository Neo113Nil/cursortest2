package kotlin.ranges;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class CharProgressionIterator extends CharIterator {
    public final int finalElement;
    public boolean hasNext;
    public int next;
    public final int step;

    public CharProgressionIterator(char c, char c2, int i) {
        this.step = i;
        this.finalElement = c2;
        boolean z = false;
        if (i <= 0 ? Intrinsics.compare((int) c, (int) c2) >= 0 : Intrinsics.compare((int) c, (int) c2) <= 0) {
            z = true;
        }
        this.hasNext = z;
        this.next = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.CharIterator
    public final char nextChar() {
        int i = this.next;
        if (i != this.finalElement) {
            this.next = this.step + i;
        } else {
            if (!this.hasNext) {
                a$$ExternalSyntheticBUOutline0.m();
                return (char) 0;
            }
            this.hasNext = false;
        }
        return (char) i;
    }
}
