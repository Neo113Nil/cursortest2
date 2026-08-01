package a1;

import a.AbstractC0058a;
import i1.p;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0063a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f1666a;

    public AbstractC0063a(h hVar) {
        this.f1666a = hVar;
    }

    @Override // a1.i
    public final i B(i iVar) {
        return AbstractC0058a.R(this, iVar);
    }

    @Override // a1.i
    public g d(h hVar) {
        return AbstractC0058a.s(this, hVar);
    }

    @Override // a1.g
    public final h getKey() {
        return this.f1666a;
    }

    @Override // a1.i
    public final Object q(Object obj, p pVar) {
        return pVar.d(obj, this);
    }

    @Override // a1.i
    public i z(h hVar) {
        return AbstractC0058a.N(this, hVar);
    }
}
