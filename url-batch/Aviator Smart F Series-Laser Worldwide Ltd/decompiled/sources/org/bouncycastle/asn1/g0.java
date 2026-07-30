package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
class g0 {
    static final l0 EMPTY_SEQUENCE = new l0();
    static final n0 EMPTY_SET = new n0();

    g0() {
    }

    static l0 createSequence(g gVar) {
        return gVar.size() < 1 ? EMPTY_SEQUENCE : new l0(gVar);
    }

    static n0 createSet(g gVar) {
        return gVar.size() < 1 ? EMPTY_SET : new n0(gVar);
    }
}
