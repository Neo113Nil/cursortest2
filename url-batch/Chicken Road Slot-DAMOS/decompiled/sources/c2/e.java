package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.n2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends wd.p implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final e f1523e;

    /* renamed from: i, reason: collision with root package name */
    public static final e f1524i;

    /* renamed from: r, reason: collision with root package name */
    public static final e f1525r;

    /* renamed from: s, reason: collision with root package name */
    public static final e f1526s;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1527d;

    static {
        int i3 = 2;
        f1523e = new e(i3, 0);
        f1524i = new e(i3, 1);
        f1525r = new e(i3, 2);
        f1526s = new e(i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, int i10) {
        super(i3);
        this.f1527d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1527d) {
            case 0:
                ((Number) obj2).intValue();
                ((g0) ((g) obj)).getClass();
                break;
            case 1:
                ((g0) ((g) obj)).Y((a2.g0) obj2);
                break;
            case 2:
                ((g0) ((g) obj)).Z((d1.l) obj2);
                break;
            default:
                n0.t tVar = (n0.t) obj2;
                g0 g0Var = (g0) ((g) obj);
                g0Var.O = tVar;
                b1 b1Var = g0Var.S;
                n2 n2Var = d2.d1.f3384h;
                x0.h hVar = (x0.h) tVar;
                hVar.getClass();
                g0Var.V((x2.c) n0.h.s(hVar, n2Var));
                x2.l lVar = (x2.l) n0.h.s(hVar, d2.d1.f3389n);
                if (g0Var.M != lVar) {
                    g0Var.M = lVar;
                    g0Var.B();
                    g0 s3 = g0Var.s();
                    if (s3 != null) {
                        s3.z();
                    } else {
                        d2.v vVar = g0Var.B;
                        if (vVar != null) {
                            vVar.invalidate();
                        }
                    }
                    g0Var.A();
                    for (d1.k kVar = (d1.k) b1Var.g; kVar != null; kVar = kVar.f3310t) {
                    }
                }
                g0Var.a0((d2.c2) n0.h.s(hVar, d2.d1.f3395t));
                d1.k kVar2 = (d1.k) b1Var.g;
                if ((kVar2.f3308r & 32768) != 0) {
                    while (kVar2 != null) {
                        if ((kVar2.f3307i & 32768) != 0) {
                            j jVar = kVar2;
                            ?? r22 = 0;
                            while (jVar != 0) {
                                if (jVar instanceof h) {
                                    d1.k kVar3 = ((d1.k) ((h) jVar)).f3305d;
                                    if (kVar3.B) {
                                        j1.c(kVar3);
                                    } else {
                                        kVar3.f3314x = true;
                                    }
                                } else if ((jVar.f3307i & 32768) != 0 && (jVar instanceof j)) {
                                    d1.k kVar4 = jVar.D;
                                    int i3 = 0;
                                    jVar = jVar;
                                    r22 = r22;
                                    while (kVar4 != null) {
                                        if ((kVar4.f3307i & 32768) != 0) {
                                            i3++;
                                            r22 = r22;
                                            if (i3 == 1) {
                                                jVar = kVar4;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new o0.e(new d1.k[16]);
                                                }
                                                if (jVar != 0) {
                                                    r22.b(jVar);
                                                    jVar = 0;
                                                }
                                                r22.b(kVar4);
                                            }
                                        }
                                        kVar4 = kVar4.f3310t;
                                        jVar = jVar;
                                        r22 = r22;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                jVar = k.e(r22);
                            }
                        }
                        if ((kVar2.f3308r & 32768) != 0) {
                            kVar2 = kVar2.f3310t;
                        }
                    }
                }
                break;
        }
        return Unit.f5554a;
    }
}
