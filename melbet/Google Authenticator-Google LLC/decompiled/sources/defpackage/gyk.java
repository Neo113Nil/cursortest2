package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gyk extends gyp {
    private final BitSet a;

    public gyk(BitSet bitSet, String str) {
        super(str);
        this.a = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    @Override // defpackage.gyv
    public final void b(BitSet bitSet) {
        bitSet.or(this.a);
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return this.a.get(c);
    }
}
