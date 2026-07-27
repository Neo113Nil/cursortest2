package s0;

import W2.InterfaceC0302y;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import y2.AbstractC1343r;
import y2.C1333h;

/* loaded from: classes.dex */
public final class Q implements InterfaceC0302y {

    /* renamed from: d, reason: collision with root package name */
    public final View f10108d;

    /* renamed from: e, reason: collision with root package name */
    public final G0.z f10109e;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0302y f10110i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f10111j = new AtomicReference(null);

    public Q(View view, G0.z zVar, InterfaceC0302y interfaceC0302y) {
        this.f10108d = view;
        this.f10109e = zVar;
        this.f10110i = interfaceC0302y;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(y.z zVar, E2.c cVar) {
        C1129O c1129o;
        int i2;
        if (cVar instanceof C1129O) {
            c1129o = (C1129O) cVar;
            int i4 = c1129o.f10104l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c1129o.f10104l = i4 - Integer.MIN_VALUE;
                Object obj = c1129o.f10102j;
                D2.a aVar = D2.a.f2163d;
                i2 = c1129o.f10104l;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    AtomicReference atomicReference = this.f10111j;
                    q.n0 n0Var = new q.n0(zVar, 4, this);
                    C1130P c1130p = new C1130P(this, null);
                    c1129o.f10104l = 1;
                    if (W2.B.d(new S.r(n0Var, atomicReference, c1130p, null), c1129o) == aVar) {
                        return;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                }
                throw new C1333h();
            }
        }
        c1129o = new C1129O(this, cVar);
        Object obj2 = c1129o.f10102j;
        D2.a aVar2 = D2.a.f2163d;
        i2 = c1129o.f10104l;
        if (i2 != 0) {
        }
        throw new C1333h();
    }

    @Override // W2.InterfaceC0302y
    public final CoroutineContext q() {
        return this.f10110i.q();
    }
}
