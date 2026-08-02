package defpackage;

import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gyi extends gyv {
    private final char[] a;

    public gyi(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.gyv
    public final void b(BitSet bitSet) {
        for (char c : this.a) {
            bitSet.set(c);
        }
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(gyv.m(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
