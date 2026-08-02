package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gyt extends gyv {
    final gyv a;
    final gyv b;

    public gyt(gyv gyvVar, gyv gyvVar2) {
        this.a = gyvVar;
        this.b = gyvVar2;
    }

    @Override // defpackage.gyv
    public final void b(BitSet bitSet) {
        this.a.b(bitSet);
        this.b.b(bitSet);
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return this.a.c(c) || this.b.c(c);
    }

    public final String toString() {
        gyv gyvVar = this.b;
        return this.a.toString() + ".or(" + gyvVar.toString() + ")";
    }
}
