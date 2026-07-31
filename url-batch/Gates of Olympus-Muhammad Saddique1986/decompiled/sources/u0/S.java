package u0;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p.C0758d0;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class S implements InterfaceC0835w {

    /* renamed from: d, reason: collision with root package name */
    public final View f9265d;

    /* renamed from: e, reason: collision with root package name */
    public final I0.A f9266e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0835w f9267f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f9268g = new AtomicReference(null);

    public S(View view, I0.A a3, InterfaceC0835w interfaceC0835w) {
        this.f9265d = view;
        this.f9266e = a3;
        this.f9267f = interfaceC0835w;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(z.z zVar, X1.c cVar) {
        P p3;
        int i3;
        if (cVar instanceof P) {
            p3 = (P) cVar;
            int i4 = p3.f9241i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p3.f9241i = i4 - Integer.MIN_VALUE;
                Object obj = p3.f9239g;
                W1.a aVar = W1.a.f4608d;
                i3 = p3.f9241i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    AtomicReference atomicReference = this.f9268g;
                    C0758d0 c0758d0 = new C0758d0(zVar, 7, this);
                    Q q3 = new Q(this, null);
                    p3.f9241i = 1;
                    if (AbstractC0837y.e(new U.t(c0758d0, atomicReference, q3, null), p3) == aVar) {
                        return;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                }
                throw new C1.c();
            }
        }
        p3 = new P(this, cVar);
        Object obj2 = p3.f9239g;
        W1.a aVar2 = W1.a.f4608d;
        i3 = p3.f9241i;
        if (i3 != 0) {
        }
        throw new C1.c();
    }

    @Override // q2.InterfaceC0835w
    public final V1.i q() {
        return this.f9267f.q();
    }
}
