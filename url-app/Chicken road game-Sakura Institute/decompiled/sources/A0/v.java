package A0;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f385a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f386b = 0;

    static {
        M0.n[] nVarArr = M0.m.f3559b;
        f385a = M0.m.f3560c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0032, code lost:
    
        if (M0.m.a(r12, r14.f378c) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final u a(u uVar, int i2, int i4, long j4, L0.p pVar, w wVar, L0.g gVar, int i5, int i6, L0.q qVar) {
        long j5;
        int i7 = i2;
        int i8 = i4;
        L0.p pVar2 = pVar;
        w wVar2 = wVar;
        L0.g gVar2 = gVar;
        int i9 = i5;
        int i10 = i6;
        L0.q qVar2 = qVar;
        if (L0.i.a(i2, Integer.MIN_VALUE) || L0.i.a(i2, uVar.f376a)) {
            if (u3.l.m0(j4)) {
                j5 = j4;
            } else {
                j5 = j4;
            }
            if ((pVar2 == null || pVar2.equals(uVar.f379d)) && ((L0.k.a(i8, Integer.MIN_VALUE) || L0.k.a(i8, uVar.f377b)) && ((wVar2 == null || wVar2.equals(uVar.f380e)) && ((gVar2 == null || gVar2.equals(uVar.f381f)) && ((i9 == 0 || i9 == uVar.f382g) && ((L0.d.a(i10, Integer.MIN_VALUE) || L0.d.a(i10, uVar.f383h)) && (qVar2 == null || qVar2.equals(uVar.f384i)))))))) {
                return uVar;
            }
        } else {
            j5 = j4;
        }
        long j6 = u3.l.m0(j4) ? uVar.f378c : j5;
        if (pVar2 == null) {
            pVar2 = uVar.f379d;
        }
        if (L0.i.a(i2, Integer.MIN_VALUE)) {
            i7 = uVar.f376a;
        }
        if (L0.k.a(i8, Integer.MIN_VALUE)) {
            i8 = uVar.f377b;
        }
        w wVar3 = uVar.f380e;
        if (wVar3 != null && wVar2 == null) {
            wVar2 = wVar3;
        }
        if (gVar2 == null) {
            gVar2 = uVar.f381f;
        }
        if (i9 == 0) {
            i9 = uVar.f382g;
        }
        if (L0.d.a(i10, Integer.MIN_VALUE)) {
            i10 = uVar.f383h;
        }
        if (qVar2 == null) {
            qVar2 = uVar.f384i;
        }
        return new u(i7, i8, j6, pVar2, wVar2, gVar2, i9, i10, qVar2);
    }
}
