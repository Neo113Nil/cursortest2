package s0;

import e2.AbstractC0381e;
import g2.i;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884a extends i {

    /* renamed from: a, reason: collision with root package name */
    public f f7501a;

    @Override // g2.i
    public final boolean K(h hVar) {
        return hVar == this.f7501a.getKey();
    }

    @Override // g2.i
    public final Object N(h hVar) {
        if (hVar == this.f7501a.getKey()) {
            return this.f7501a.getValue();
        }
        AbstractC0381e.N("Check failed.");
        throw null;
    }
}
