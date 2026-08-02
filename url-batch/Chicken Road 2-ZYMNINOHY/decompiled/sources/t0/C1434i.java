package t0;

import T.C0097o;
import T.U;
import a0.AbstractC0135a;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1434i extends p implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f15314e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15315f;

    public C1434i(int i4, U u4, int i5, l lVar, int i6) {
        super(i4, u4, i5);
        int i7;
        this.f15314e = AbstractC0135a.n(i6, lVar.f15328B) ? 1 : 0;
        C0097o c0097o = this.f15348d;
        int i8 = c0097o.f2874u;
        int i9 = -1;
        if (i8 != -1 && (i7 = c0097o.v) != -1) {
            i9 = i8 * i7;
        }
        this.f15315f = i9;
    }

    @Override // t0.p
    public final int a() {
        return this.f15314e;
    }

    @Override // t0.p
    public final /* bridge */ /* synthetic */ boolean b(p pVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f15315f, ((C1434i) obj).f15315f);
    }
}
