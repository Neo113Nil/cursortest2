package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gyo extends gyl {
    private final char a;
    private final char b;

    public gyo(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.gyv
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
        bitSet.set(this.b);
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + gyv.m(this.a) + gyv.m(this.b) + "\")";
    }
}
