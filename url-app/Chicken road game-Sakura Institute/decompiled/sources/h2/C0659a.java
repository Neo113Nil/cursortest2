package h2;

import j2.AbstractC0720j;
import j2.C0715e;
import o2.C0924c;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659a extends d {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6870d;

    /* renamed from: e, reason: collision with root package name */
    public final C0715e f6871e;

    public C0659a(g2.e eVar, C0715e c0715e, boolean z4) {
        super(3, e.f6876d, eVar);
        this.f6871e = c0715e;
        this.f6870d = z4;
    }

    @Override // h2.d
    public final d a(C0924c c0924c) {
        g2.e eVar = (g2.e) this.f6875c;
        boolean isEmpty = eVar.isEmpty();
        boolean z4 = this.f6870d;
        C0715e c0715e = this.f6871e;
        if (!isEmpty) {
            AbstractC0720j.b("operationForChild called for unrelated child.", eVar.C().equals(c0924c));
            return new C0659a(eVar.F(), c0715e, z4);
        }
        if (c0715e.f7159d != null) {
            AbstractC0720j.b("affectedTree should not have overlapping affected paths.", c0715e.f7160e.isEmpty());
            return this;
        }
        return new C0659a(g2.e.f6694j, c0715e.D(new g2.e(c0924c)), z4);
    }

    public final String toString() {
        return "AckUserWrite { path=" + ((g2.e) this.f6875c) + ", revert=" + this.f6870d + ", affectedTree=" + this.f6871e + " }";
    }
}
