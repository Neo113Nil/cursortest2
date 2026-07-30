package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
class r1 {
    static final v EMPTY_SEQUENCE = new u1();
    static final x EMPTY_SET = new w1();

    r1() {
    }

    static v createSequence(g gVar) {
        return gVar.size() < 1 ? EMPTY_SEQUENCE : new u1(gVar);
    }

    static x createSet(g gVar) {
        return gVar.size() < 1 ? EMPTY_SET : new w1(gVar);
    }
}
