package org.bouncycastle.crypto.params;

/* loaded from: classes5.dex */
public class k extends h {

    /* renamed from: q, reason: collision with root package name */
    private final org.bouncycastle.math.ec.i f17131q;

    public k(org.bouncycastle.math.ec.i iVar, f fVar) {
        super(false, fVar);
        this.f17131q = fVar.validatePublicPoint(iVar);
    }

    public org.bouncycastle.math.ec.i getQ() {
        return this.f17131q;
    }
}
