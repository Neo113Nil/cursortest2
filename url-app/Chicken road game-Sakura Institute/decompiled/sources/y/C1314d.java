package y;

import W2.InterfaceC0302y;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s0.Q;
import x.AbstractC1298d;
import y2.AbstractC1343r;
import y2.C1333h;

/* renamed from: y.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314d extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11464k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11465l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q f11466m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P0.h f11467n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1316f f11468o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f11469p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1314d(Q q2, P0.h hVar, C1316f c1316f, v vVar, C2.a aVar) {
        super(2, aVar);
        this.f11466m = q2;
        this.f11467n = hVar;
        this.f11468o = c1316f;
        this.f11469p = vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((C1314d) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
        return D2.a.f2163d;
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C1314d c1314d = new C1314d(this.f11466m, this.f11467n, this.f11468o, this.f11469p, aVar);
        c1314d.f11465l = obj;
        return c1314d;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11464k;
        C1316f c1316f = this.f11468o;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1343r.b(obj);
                throw new C1333h();
            }
            AbstractC1343r.b(obj);
            InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f11465l;
            x xVar = y.f11521a;
            Q q2 = this.f11466m;
            View view = q2.f10108d;
            xVar.getClass();
            t tVar = new t(view);
            z zVar = new z(q2.f10108d, new C1313c(this.f11469p), tVar);
            if (AbstractC1298d.f11401a) {
                W2.B.m(interfaceC0302y, null, null, new C1312b(c1316f, tVar, null), 3);
            }
            P0.h hVar = this.f11467n;
            if (hVar != null) {
                hVar.invoke(zVar);
            }
            c1316f.f11477c = zVar;
            this.f11464k = 1;
            q2.a(zVar, this);
            return aVar;
        } catch (Throwable th) {
            c1316f.f11477c = null;
            throw th;
        }
    }
}
