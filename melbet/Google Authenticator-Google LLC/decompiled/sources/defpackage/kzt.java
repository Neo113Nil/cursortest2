package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kzt {
    private static final krt a = new ghz(15);
    private static final krx b = new gjo(8);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r0.b == r2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kzq a(kzq kzqVar) {
        if (!(kzqVar instanceof lai)) {
            boolean z = kzqVar instanceof kzp;
            krt krtVar = a;
            krx krxVar = b;
            if (z) {
                kzp kzpVar = (kzp) kzqVar;
                if (kzpVar.a == krtVar) {
                }
            }
            return new kzp(kzqVar, krtVar, krxVar);
        }
        return kzqVar;
    }
}
