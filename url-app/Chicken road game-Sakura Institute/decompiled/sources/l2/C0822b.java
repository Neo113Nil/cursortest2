package l2;

import b2.C0517a;
import g2.w;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final g2.e f7965a;

    /* renamed from: b, reason: collision with root package name */
    public final w f7966b;

    /* renamed from: c, reason: collision with root package name */
    public final C0517a f7967c;

    public C0822b(w wVar, C0517a c0517a, g2.e eVar) {
        this.f7966b = wVar;
        this.f7965a = eVar;
        this.f7967c = c0517a;
    }

    @Override // l2.e
    public final void a() {
        this.f7966b.f6768e.b(this.f7967c);
    }

    @Override // l2.e
    public final String toString() {
        return this.f7965a + ":CANCEL";
    }
}
