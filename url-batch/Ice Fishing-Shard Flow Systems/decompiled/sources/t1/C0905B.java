package t1;

import android.os.Bundle;

/* renamed from: t1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905B extends s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f7896g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0905B(com.google.android.gms.common.internal.a aVar, int i2, Bundle bundle) {
        super(aVar, i2, bundle);
        this.f7896g = aVar;
    }

    @Override // t1.s
    public final boolean a() {
        this.f7896g.f4389n.a(q1.b.f7309n);
        return true;
    }

    @Override // t1.s
    public final void b(q1.b bVar) {
        com.google.android.gms.common.internal.a aVar = this.f7896g;
        aVar.getClass();
        aVar.f4389n.a(bVar);
        aVar.f4380d = bVar.f7311e;
        aVar.f4381e = System.currentTimeMillis();
    }
}
