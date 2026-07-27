package o;

import A.C0028y;
import D.C0120c;
import W2.InterfaceC0302y;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* renamed from: o.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871D extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8600k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8602m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0802C f8603n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A.J f8604o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0028y f8605p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0872E f8606q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0872E f8607r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0120c f8608s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0871D(C0891i0 c0891i0, C0802C c0802c, A.J j4, C0028y c0028y, C0872E c0872e, C0872E c0872e2, C0120c c0120c, C2.a aVar) {
        super(2, aVar);
        this.f8602m = c0891i0;
        this.f8603n = c0802c;
        this.f8604o = j4;
        this.f8605p = c0028y;
        this.f8606q = c0872e;
        this.f8607r = c0872e2;
        this.f8608s = c0120c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0871D) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0872E c0872e = this.f8607r;
        C0120c c0120c = this.f8608s;
        C0871D c0871d = new C0871D(this.f8602m, this.f8603n, this.f8604o, this.f8605p, this.f8606q, c0872e, c0120c, aVar);
        c0871d.f8601l = obj;
        return c0871d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0302y interfaceC0302y;
        CancellationException e4;
        Y2.e eVar;
        Object obj2 = D2.a.f2163d;
        int i2 = this.f8600k;
        C0891i0 c0891i0 = this.f8602m;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y2 = (InterfaceC0302y) this.f8601l;
            try {
                N n2 = c0891i0.f8797v;
                C0802C c0802c = this.f8603n;
                A.J j4 = this.f8604o;
                C0028y c0028y = this.f8605p;
                C0872E c0872e = this.f8606q;
                C0872E c0872e2 = this.f8607r;
                C0120c c0120c = this.f8608s;
                this.f8601l = interfaceC0302y2;
                this.f8600k = 1;
                float f4 = AbstractC0870C.f8598a;
                Object g4 = m3.z.g(c0802c, new C0868A(c0872e2, new M2.D(), n2, j4, c0120c, c0872e, c0028y, null), this);
                if (g4 != obj2) {
                    g4 = Unit.f7487a;
                }
                if (g4 == obj2) {
                    return obj2;
                }
            } catch (CancellationException e5) {
                interfaceC0302y = interfaceC0302y2;
                e4 = e5;
                eVar = c0891i0.f8801z;
                if (eVar != null) {
                }
                if (!W2.B.k(interfaceC0302y)) {
                }
                return Unit.f7487a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0302y = (InterfaceC0302y) this.f8601l;
            try {
                AbstractC1343r.b(obj);
            } catch (CancellationException e6) {
                e4 = e6;
                eVar = c0891i0.f8801z;
                if (eVar != null) {
                    eVar.o(r.f8864a);
                }
                if (!W2.B.k(interfaceC0302y)) {
                    throw e4;
                }
                return Unit.f7487a;
            }
        }
        return Unit.f7487a;
    }
}
