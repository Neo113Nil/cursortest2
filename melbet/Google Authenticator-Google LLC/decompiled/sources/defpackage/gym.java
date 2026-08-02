package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gym extends gyl {
    private final char a;
    private final char b;

    public gym(char c, char c2) {
        hoq.x(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.gyv
    public final void b(BitSet bitSet) {
        bitSet.set(this.a, this.b + 1);
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + gyv.m(this.a) + "', '" + gyv.m(this.b) + "')";
    }
}
