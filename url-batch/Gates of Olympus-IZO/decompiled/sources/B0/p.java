package B0;

import a.AbstractC0157a;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final long f297a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f298b = 0;

    static {
        M0.m[] mVarArr = M0.l.f2779b;
        f297a = M0.l.f2780c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        if (M0.l.a(r12, r14.f290c) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final o a(o oVar, int i3, int i4, long j3, L0.l lVar, q qVar, L0.e eVar, int i5, int i6, L0.m mVar) {
        long j4;
        int i7 = i3;
        int i8 = i4;
        L0.l lVar2 = lVar;
        q qVar2 = qVar;
        L0.e eVar2 = eVar;
        int i9 = i5;
        int i10 = i6;
        L0.m mVar2 = mVar;
        if (L0.f.a(i3, Integer.MIN_VALUE) || L0.f.a(i3, oVar.f288a)) {
            if (AbstractC0157a.L(j3)) {
                j4 = j3;
            } else {
                j4 = j3;
            }
            if ((lVar2 == null || lVar2.equals(oVar.f291d)) && ((L0.h.a(i8, Integer.MIN_VALUE) || L0.h.a(i8, oVar.f289b)) && ((qVar2 == null || qVar2.equals(oVar.f292e)) && ((eVar2 == null || eVar2.equals(oVar.f293f)) && ((i9 == 0 || i9 == oVar.f294g) && ((I2.l.w(i10, Integer.MIN_VALUE) || I2.l.w(i10, oVar.f295h)) && (mVar2 == null || mVar2.equals(oVar.f296i)))))))) {
                return oVar;
            }
        } else {
            j4 = j3;
        }
        long j5 = AbstractC0157a.L(j3) ? oVar.f290c : j4;
        if (lVar2 == null) {
            lVar2 = oVar.f291d;
        }
        if (L0.f.a(i3, Integer.MIN_VALUE)) {
            i7 = oVar.f288a;
        }
        if (L0.h.a(i8, Integer.MIN_VALUE)) {
            i8 = oVar.f289b;
        }
        q qVar3 = oVar.f292e;
        if (qVar3 != null && qVar2 == null) {
            qVar2 = qVar3;
        }
        if (eVar2 == null) {
            eVar2 = oVar.f293f;
        }
        if (i9 == 0) {
            i9 = oVar.f294g;
        }
        if (I2.l.w(i10, Integer.MIN_VALUE)) {
            i10 = oVar.f295h;
        }
        if (mVar2 == null) {
            mVar2 = oVar.f296i;
        }
        return new o(i7, i8, j5, lVar2, qVar2, eVar2, i9, i10, mVar2);
    }
}
