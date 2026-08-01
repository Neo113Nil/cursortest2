package x1;

import s.d0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final o0.e f10268a = new o0.e(new f[16]);

    /* renamed from: b, reason: collision with root package name */
    public final d0 f10269b = new d0(10);

    public boolean a(s.p pVar, a2.n nVar, w7.m mVar, boolean z10) {
        o0.e eVar = this.f10268a;
        Object[] objArr = eVar.f7317d;
        int i3 = eVar.f7319i;
        boolean z11 = false;
        for (int i10 = 0; i10 < i3; i10++) {
            z11 = ((f) objArr[i10]).a(pVar, nVar, mVar, z10) || z11;
        }
        return z11;
    }

    public void b(w7.m mVar) {
        o0.e eVar = this.f10268a;
        int i3 = eVar.f7319i;
        while (true) {
            i3--;
            if (-1 >= i3) {
                return;
            }
            if (((f) eVar.f7317d[i3]).f10263d.f2174d == 0) {
                eVar.l(i3);
            }
        }
    }
}
