package r0;

import kotlin.jvm.functions.Function0;
import n0.l0;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r extends i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final r f8125d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f8126e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f8127f;
    public static final r g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8128c;

    static {
        int i3 = 1;
        f8125d = new r(i3, 2, 0);
        int i10 = 1;
        f8126e = new r(i10, i10, 1);
        f8127f = new r(i3, 2, 2);
        int i11 = 1;
        g = new r(i11, i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, int i10, int i11) {
        super(i3, i10);
        this.f8128c = i11;
    }

    @Override // r0.i0
    public final void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        switch (this.f8128c) {
            case 0:
                Object invoke = ((Function0) jVar.c(0)).invoke();
                q0.b bVar = (q0.b) jVar.c(1);
                int b10 = jVar.b(0);
                bVar.getClass();
                kVar.U(kVar.c(bVar), invoke);
                aVar.e(b10, invoke);
                aVar.c(invoke);
                break;
            case 1:
                q0.b bVar2 = (q0.b) jVar.c(0);
                int b11 = jVar.b(0);
                aVar.l();
                bVar2.getClass();
                aVar.b(b11, kVar.D(kVar.c(bVar2)));
                break;
            case 2:
                Object c10 = jVar.c(0);
                q0.b bVar3 = (q0.b) jVar.c(1);
                int b12 = jVar.b(0);
                if (c10 instanceof l0) {
                    l0 l0Var = (l0) c10;
                    ((o0.e) qVar.f1861e).b(l0Var);
                    ((s.i0) qVar.f1860d).a(l0Var);
                }
                Object K = kVar.K(kVar.c(bVar3), b12, c10);
                if (!(K instanceof l0)) {
                    if (K instanceof s1) {
                        ((s1) K).c();
                        break;
                    }
                } else {
                    qVar.d((l0) K);
                    break;
                }
                break;
            default:
                Object c11 = jVar.c(0);
                int b13 = jVar.b(0);
                if (c11 instanceof l0) {
                    l0 l0Var2 = (l0) c11;
                    ((o0.e) qVar.f1861e).b(l0Var2);
                    ((s.i0) qVar.f1860d).a(l0Var2);
                }
                Object K2 = kVar.K(kVar.f7777t, b13, c11);
                if (!(K2 instanceof l0)) {
                    if (K2 instanceof s1) {
                        ((s1) K2).c();
                        break;
                    }
                } else {
                    qVar.d((l0) K2);
                    break;
                }
                break;
        }
    }

    @Override // r0.i0
    public q0.b b(androidx.datastore.preferences.protobuf.j jVar) {
        switch (this.f8128c) {
            case 0:
                return (q0.b) jVar.c(1);
            case 1:
                return (q0.b) jVar.c(0);
            default:
                return super.b(jVar);
        }
    }
}
