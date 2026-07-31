package T0;

import i1.AbstractBinderC0422c;
import java.lang.ref.WeakReference;

/* renamed from: T0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0180o extends AbstractBinderC0422c {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2316d;

    public BinderC0180o(r rVar) {
        this.f2316d = new WeakReference(rVar);
    }

    @Override // i1.InterfaceC0423d
    public final void a(i1.g gVar) {
        r rVar = (r) this.f2316d.get();
        if (rVar == null) {
            return;
        }
        x xVar = rVar.f2320f;
        C0177l c0177l = new C0177l(rVar, rVar, gVar);
        HandlerC0183s handlerC0183s = xVar.f2369h;
        handlerC0183s.sendMessage(handlerC0183s.obtainMessage(1, c0177l));
    }
}
