package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public long f6718a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6719b;

    public q1(f8.h hVar) {
        r6.k.f(hVar, "source");
        this.f6719b = hVar;
        this.f6718a = 262144L;
    }

    public s7.k a() {
        f1.g gVar = new f1.g(6);
        while (true) {
            String y4 = ((f8.h) this.f6719b).y(this.f6718a);
            this.f6718a -= y4.length();
            if (y4.length() == 0) {
                return gVar.d();
            }
            int D = z6.h.D(y4, ':', 1, 4);
            if (D != -1) {
                String substring = y4.substring(0, D);
                r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = y4.substring(D + 1);
                r6.k.e(substring2, "this as java.lang.String).substring(startIndex)");
                gVar.c(substring, substring2);
            } else if (y4.charAt(0) == ':') {
                String substring3 = y4.substring(1);
                r6.k.e(substring3, "this as java.lang.String).substring(startIndex)");
                gVar.c("", substring3);
            } else {
                gVar.c("", y4);
            }
        }
    }

    public q1(j0 j0Var) {
        this.f6719b = j0Var;
        this.f6718a = 0L;
    }
}
