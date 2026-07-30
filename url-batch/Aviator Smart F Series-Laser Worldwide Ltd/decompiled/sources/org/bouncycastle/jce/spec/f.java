package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class f extends a {

    /* renamed from: q, reason: collision with root package name */
    private i f17138q;

    public f(i iVar, d dVar) {
        super(dVar);
        this.f17138q = iVar.getCurve() != null ? iVar.normalize() : iVar;
    }

    public i getQ() {
        return this.f17138q;
    }
}
