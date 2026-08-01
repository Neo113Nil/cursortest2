package n0;

import com.google.android.gms.internal.measurement.se;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6666e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6667i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6668r;

    public /* synthetic */ e0(i0 i0Var, r0.a aVar, q0.g gVar, u0 u0Var) {
        this.f6665d = 0;
        this.f6666e = i0Var;
        this.f6667i = aVar;
        this.f6668r = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i3;
        switch (this.f6665d) {
            case 0:
                i0 i0Var = (i0) this.f6666e;
                r0.a aVar = (r0.a) this.f6667i;
                q0.g gVar = (q0.g) this.f6668r;
                r0.b bVar = i0Var.M;
                r0.a aVar2 = bVar.f8085b;
                try {
                    bVar.f8085b = aVar;
                    q0.g gVar2 = i0Var.G;
                    int[] iArr = i0Var.f6710o;
                    s.w wVar = i0Var.f6717v;
                    i0Var.f6710o = null;
                    i0Var.f6717v = null;
                    try {
                        i0Var.G = gVar;
                        boolean z10 = bVar.f8088e;
                        try {
                            bVar.f8088e = false;
                            throw null;
                        } finally {
                        }
                    } catch (Throwable th) {
                        i0Var.G = gVar2;
                        i0Var.f6710o = iArr;
                        i0Var.f6717v = wVar;
                        throw th;
                    }
                } catch (Throwable th2) {
                    bVar.f8085b = aVar2;
                    throw th2;
                }
            case 1:
                q0.b bVar2 = (q0.b) this.f6666e;
                q0.k kVar = (q0.k) this.f6667i;
                r0.j0 j0Var = (r0.j0) this.f6668r;
                if (bVar2 != null) {
                    kVar.a(kVar.c(bVar2) - kVar.f7777t);
                }
                List l10 = cf.c.l(kVar, null, kVar.f7777t, null);
                c1.c cVar = (c1.c) CollectionsKt.D(l10);
                Integer num = cVar != null ? cVar.f1480b : null;
                List b10 = j0Var.b(num);
                if (num != null && !b10.isEmpty()) {
                    b10 = CollectionsKt.G(kotlin.collections.x.c(new c1.c(((c1.c) CollectionsKt.x(b10)).f1479a, null, num)), CollectionsKt.v(b10, 1));
                }
                return new c1.a(CollectionsKt.G(l10, b10), j0Var.c());
            default:
                x0.b bVar3 = (x0.b) this.f6666e;
                se seVar = (se) this.f6667i;
                wd.a0 a0Var = (wd.a0) this.f6668r;
                bVar3.a();
                x0.a aVar3 = (x0.a) seVar.f2800i;
                int i10 = a0Var.f10139d;
                do {
                    i3 = aVar3.get();
                } while (!aVar3.compareAndSet(i3, ((i3 >>> 27) & 15) == i10 ? i3 - 1 : i3));
                return Unit.f5554a;
        }
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, int i3) {
        this.f6665d = i3;
        this.f6666e = obj;
        this.f6667i = obj2;
        this.f6668r = obj3;
    }
}
