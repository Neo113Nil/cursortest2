package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gyq extends gyv {
    final gyv b;

    public gyq(gyv gyvVar) {
        this.b = gyvVar;
    }

    @Override // defpackage.gyv
    public final void b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.b.b(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return !this.b.c(c);
    }

    @Override // defpackage.gyv
    public final boolean f(CharSequence charSequence) {
        return this.b.g(charSequence);
    }

    @Override // defpackage.gyv
    public final boolean g(CharSequence charSequence) {
        return this.b.f(charSequence);
    }

    public String toString() {
        return this.b.toString().concat(".negate()");
    }
}
