package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final long f3001a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3002b = 0;

    static {
        r2.p[] pVarArr = r2.n.f6533b;
        f3001a = r2.n.f6534c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0024, code lost:
    
        if (r1 == r18.f2993a) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r a(r rVar, int i, int i8, long j7, q2.q qVar, t tVar, q2.i iVar, int i9, int i10, q2.s sVar) {
        long j8;
        int i11 = i;
        int i12 = i8;
        long j9 = j7;
        q2.q qVar2 = qVar;
        t tVar2 = tVar;
        q2.i iVar2 = iVar;
        int i13 = i9;
        int i14 = i10;
        q2.s sVar2 = sVar;
        if (i11 == Integer.MIN_VALUE) {
            j8 = 0;
        } else {
            j8 = 0;
        }
        r2.p[] pVarArr = r2.n.f6533b;
        if (((j9 & 1095216660480L) == j8 || r2.n.a(j9, rVar.f2995c)) && ((qVar2 == null || qVar2.equals(rVar.f2996d)) && ((i12 == Integer.MIN_VALUE || i12 == rVar.f2994b) && ((tVar2 == null || tVar2.equals(rVar.f2997e)) && ((iVar2 == null || iVar2.equals(rVar.f2998f)) && ((i13 == 0 || i13 == rVar.f2999g) && ((i14 == Integer.MIN_VALUE || i14 == rVar.f3000h) && (sVar2 == null || sVar2.equals(rVar.i))))))))) {
            return rVar;
        }
        r2.p[] pVarArr2 = r2.n.f6533b;
        if ((j9 & 1095216660480L) == j8) {
            j9 = rVar.f2995c;
        }
        if (qVar2 == null) {
            qVar2 = rVar.f2996d;
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = rVar.f2993a;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = rVar.f2994b;
        }
        t tVar3 = rVar.f2997e;
        if (tVar3 != null && tVar2 == null) {
            tVar2 = tVar3;
        }
        if (iVar2 == null) {
            iVar2 = rVar.f2998f;
        }
        if (i13 == 0) {
            i13 = rVar.f2999g;
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = rVar.f3000h;
        }
        if (sVar2 == null) {
            sVar2 = rVar.i;
        }
        return new r(i11, i12, j9, qVar2, tVar2, iVar2, i13, i14, sVar2);
    }
}
