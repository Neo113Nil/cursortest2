package d2;

import a2.C0162b;

/* loaded from: classes.dex */
public final class x extends p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8308g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.google.android.gms.common.internal.a aVar, int i4) {
        super(aVar, i4, null);
        this.f8308g = aVar;
    }

    @Override // d2.p
    public final void a(C0162b c0162b) {
        this.f8308g.f5786i.a(c0162b);
        System.currentTimeMillis();
    }

    @Override // d2.p
    public final boolean b() {
        this.f8308g.f5786i.a(C0162b.f4263e);
        return true;
    }
}
