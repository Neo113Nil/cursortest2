package z;

import android.view.View;
import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import u0.S;
import y.AbstractC1230d;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240d extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10436h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10437i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f10438j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ R0.g f10439k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1242f f10440l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1258v f10441m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240d(S s3, R0.g gVar, C1242f c1242f, C1258v c1258v, V1.d dVar) {
        super(2, dVar);
        this.f10438j = s3;
        this.f10439k = gVar;
        this.f10440l = c1242f;
        this.f10441m = c1258v;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((C1240d) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
        return W1.a.f4608d;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1240d c1240d = new C1240d(this.f10438j, this.f10439k, this.f10440l, this.f10441m, dVar);
        c1240d.f10437i = obj;
        return c1240d;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10436h;
        C1242f c1242f = this.f10440l;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
                throw new C1.c();
            }
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f10437i;
            x xVar = y.f10493a;
            S s3 = this.f10438j;
            View view = s3.f9265d;
            xVar.getClass();
            C1256t c1256t = new C1256t(view);
            z zVar = new z(s3.f9265d, new C1239c(this.f10441m), c1256t);
            if (AbstractC1230d.f10377a) {
                AbstractC0837y.r(interfaceC0835w, null, null, new C1238b(c1242f, c1256t, null), 3);
            }
            R0.g gVar = this.f10439k;
            if (gVar != null) {
                gVar.n(zVar);
            }
            c1242f.f10449c = zVar;
            this.f10436h = 1;
            s3.a(zVar, this);
            return aVar;
        } catch (Throwable th) {
            c1242f.f10449c = null;
            throw th;
        }
    }
}
