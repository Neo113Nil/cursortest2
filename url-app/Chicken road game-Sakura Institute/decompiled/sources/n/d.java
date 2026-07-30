package n;

import a8.m;
import p2.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public final long f6476a;

    public d(long j8) {
        this.f6476a = j8;
    }

    @Override // p2.y
    public final long a(m2.i iVar, long j8, m2.k kVar, long j9) {
        int i7 = iVar.f6317a;
        long j10 = this.f6476a;
        return m.c(t6.a.n(i7 + ((int) (j10 >> 32)), (int) (j9 >> 32), (int) (j8 >> 32), kVar == m2.k.f6322f), t6.a.n(iVar.f6318b + ((int) (j10 & 4294967295L)), (int) (j9 & 4294967295L), (int) (j8 & 4294967295L), true));
    }
}
