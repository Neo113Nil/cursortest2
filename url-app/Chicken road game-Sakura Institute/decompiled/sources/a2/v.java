package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f459a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f460b = 0;

    static {
        m2.n[] nVarArr = m2.m.f6326b;
        f459a = m2.m.f6327c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0022, code lost:
    
        if (m2.m.a(r10, r12.f452c) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u a(u uVar, int i7, int i8, long j8, l2.o oVar, w wVar, l2.g gVar, int i9, int i10, l2.p pVar) {
        long j9;
        l2.o oVar2 = oVar;
        w wVar2 = wVar;
        l2.g gVar2 = gVar;
        int i11 = i9;
        int i12 = i10;
        if (i7 == Integer.MIN_VALUE || i7 == uVar.f450a) {
            if (r4.a.L(j8)) {
                j9 = j8;
            } else {
                j9 = j8;
            }
            if ((oVar2 == null || oVar2.equals(uVar.f453d)) && ((i8 == Integer.MIN_VALUE || i8 == uVar.f451b) && ((wVar2 == null || wVar2.equals(uVar.f454e)) && ((gVar2 == null || gVar2.equals(uVar.f455f)) && ((i11 == 0 || i11 == uVar.f456g) && ((i12 == Integer.MIN_VALUE || i12 == uVar.f457h) && (pVar == null || pVar.equals(uVar.f458i)))))))) {
                return uVar;
            }
        } else {
            j9 = j8;
        }
        long j10 = r4.a.L(j9) ? uVar.f452c : j9;
        if (oVar2 == null) {
            oVar2 = uVar.f453d;
        }
        if (i7 == Integer.MIN_VALUE) {
            i7 = uVar.f450a;
        }
        int i13 = i8 == Integer.MIN_VALUE ? uVar.f451b : i8;
        w wVar3 = uVar.f454e;
        if (wVar3 != null && wVar2 == null) {
            wVar2 = wVar3;
        }
        if (gVar2 == null) {
            gVar2 = uVar.f455f;
        }
        if (i11 == 0) {
            i11 = uVar.f456g;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = uVar.f457h;
        }
        return new u(i7, i13, j10, oVar2, wVar2, gVar2, i11, i12, pVar == null ? uVar.f458i : pVar);
    }
}
