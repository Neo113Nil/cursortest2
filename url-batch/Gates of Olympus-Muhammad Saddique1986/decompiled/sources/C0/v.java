package C0;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f653a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f654b = 0;

    static {
        O0.n[] nVarArr = O0.m.f3745b;
        f653a = O0.m.f3746c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        if (O0.m.a(r12, r14.f646c) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u a(u uVar, int i3, int i4, long j3, N0.o oVar, w wVar, N0.g gVar, int i5, int i6, N0.p pVar) {
        long j4;
        int i7 = i3;
        int i8 = i4;
        N0.o oVar2 = oVar;
        w wVar2 = wVar;
        N0.g gVar2 = gVar;
        int i9 = i5;
        int i10 = i6;
        N0.p pVar2 = pVar;
        if (N0.i.a(i3, Integer.MIN_VALUE) || N0.i.a(i3, uVar.f644a)) {
            if (O2.l.k0(j3)) {
                j4 = j3;
            } else {
                j4 = j3;
            }
            if ((oVar2 == null || oVar2.equals(uVar.f647d)) && ((N0.k.a(i8, Integer.MIN_VALUE) || N0.k.a(i8, uVar.f645b)) && ((wVar2 == null || wVar2.equals(uVar.f648e)) && ((gVar2 == null || gVar2.equals(uVar.f649f)) && ((i9 == 0 || i9 == uVar.f650g) && ((N0.d.a(i10, Integer.MIN_VALUE) || N0.d.a(i10, uVar.f651h)) && (pVar2 == null || pVar2.equals(uVar.f652i)))))))) {
                return uVar;
            }
        } else {
            j4 = j3;
        }
        long j5 = O2.l.k0(j3) ? uVar.f646c : j4;
        if (oVar2 == null) {
            oVar2 = uVar.f647d;
        }
        if (N0.i.a(i3, Integer.MIN_VALUE)) {
            i7 = uVar.f644a;
        }
        if (N0.k.a(i8, Integer.MIN_VALUE)) {
            i8 = uVar.f645b;
        }
        w wVar3 = uVar.f648e;
        if (wVar3 != null && wVar2 == null) {
            wVar2 = wVar3;
        }
        if (gVar2 == null) {
            gVar2 = uVar.f649f;
        }
        if (i9 == 0) {
            i9 = uVar.f650g;
        }
        if (N0.d.a(i10, Integer.MIN_VALUE)) {
            i10 = uVar.f651h;
        }
        if (pVar2 == null) {
            pVar2 = uVar.f652i;
        }
        return new u(i7, i8, j5, oVar2, wVar2, gVar2, i9, i10, pVar2);
    }
}
