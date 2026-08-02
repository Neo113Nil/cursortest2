package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gyn extends gyl {
    private final char a;

    public gyn(char c) {
        this.a = c;
    }

    @Override // defpackage.gyv
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return c == this.a;
    }

    @Override // defpackage.gyv
    public final gyv e(gyv gyvVar) {
        return gyvVar.c(this.a) ? gyvVar : new gyt(this, gyvVar);
    }

    public final String toString() {
        return "CharMatcher.is('" + gyv.m(this.a) + "')";
    }
}
