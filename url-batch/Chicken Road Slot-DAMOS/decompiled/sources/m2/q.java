package m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6509a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6510b = 0;

    static {
        x2.o[] oVarArr = x2.n.f10334b;
        f6509a = x2.n.f10335c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0033, code lost:
    
        if (x2.n.a(r3, r17.f6503c) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p a(p pVar, int i3, int i10, long j, w2.q qVar, r rVar, w2.i iVar, int i11, int i12, w2.s sVar) {
        long j3;
        int i13 = i3;
        int i14 = i10;
        long j10 = j;
        w2.q qVar2 = qVar;
        r rVar2 = rVar;
        w2.i iVar2 = iVar;
        int i15 = i11;
        int i16 = i12;
        w2.s sVar2 = sVar;
        if (i13 == 0 || i13 == pVar.f6501a) {
            x2.o[] oVarArr = x2.n.f10334b;
            if ((j10 & 1095216660480L) == 0) {
                j3 = 0;
            } else {
                j3 = 0;
            }
            if ((qVar2 == null || qVar2.equals(pVar.f6504d)) && ((i14 == 0 || i14 == pVar.f6502b) && ((rVar2 == null || rVar2.equals(pVar.f6505e)) && ((iVar2 == null || iVar2.equals(pVar.f6506f)) && ((i15 == 0 || i15 == pVar.g) && ((i16 == 0 || i16 == pVar.f6507h) && (sVar2 == null || sVar2.equals(pVar.f6508i)))))))) {
                return pVar;
            }
        } else {
            j3 = 0;
        }
        x2.o[] oVarArr2 = x2.n.f10334b;
        if ((j10 & 1095216660480L) == j3) {
            j10 = pVar.f6503c;
        }
        if (qVar2 == null) {
            qVar2 = pVar.f6504d;
        }
        if (i13 == 0) {
            i13 = pVar.f6501a;
        }
        if (i14 == 0) {
            i14 = pVar.f6502b;
        }
        r rVar3 = pVar.f6505e;
        if (rVar3 != null && rVar2 == null) {
            rVar2 = rVar3;
        }
        if (iVar2 == null) {
            iVar2 = pVar.f6506f;
        }
        if (i15 == 0) {
            i15 = pVar.g;
        }
        if (i16 == 0) {
            i16 = pVar.f6507h;
        }
        if (sVar2 == null) {
            sVar2 = pVar.f6508i;
        }
        return new p(i13, i14, j10, qVar2, rVar2, iVar2, i15, i16, sVar2);
    }
}
