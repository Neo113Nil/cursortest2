package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f895d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f896e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f897i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f898r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f899s;

    public /* synthetic */ s0(n0.y yVar, x0.e eVar, s.c0 c0Var, int i3) {
        this.f897i = yVar;
        this.f898r = eVar;
        this.f899s = c0Var;
        this.f896e = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f895d) {
            case 0:
                a2.o0[] o0VarArr = (a2.o0[]) this.f897i;
                t0 t0Var = (t0) this.f898r;
                int[] iArr = (int[]) this.f899s;
                a2.n0 n0Var = (a2.n0) obj;
                int length = o0VarArr.length;
                int i3 = 0;
                int i10 = 0;
                while (i3 < length) {
                    a2.o0 o0Var = o0VarArr[i3];
                    o0Var.getClass();
                    o0Var.h();
                    n0Var.h(o0Var, iArr[i10], Math.round((1 + t0Var.f903b.f3295a) * ((this.f896e - o0Var.f132e) / 2.0f)), 0.0f);
                    i3++;
                    i10++;
                }
                return Unit.f5554a;
            default:
                n0.y yVar = (n0.y) this.f897i;
                x0.e eVar = (x0.e) this.f898r;
                s.c0 c0Var = (s.c0) this.f899s;
                if (obj == yVar) {
                    kotlin.collections.i0.l("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof b1.f0) {
                    int i11 = eVar.f10227a - this.f896e;
                    int c10 = c0Var.c(obj);
                    c0Var.f(Math.min(i11, c10 >= 0 ? c0Var.f8279c[c10] : Integer.MAX_VALUE), obj);
                }
                return Unit.f5554a;
        }
    }

    public /* synthetic */ s0(a2.o0[] o0VarArr, t0 t0Var, int i3, int[] iArr) {
        this.f897i = o0VarArr;
        this.f898r = t0Var;
        this.f896e = i3;
        this.f899s = iArr;
    }
}
