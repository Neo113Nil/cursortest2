package N2;

import f3.AbstractBinderC4504c;
import f3.C4508g;
import java.lang.ref.WeakReference;

/* renamed from: N2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0330p extends AbstractBinderC4504c {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f2083n;

    public BinderC0330p(C0332s c0332s) {
        this.f2083n = new WeakReference(c0332s);
    }

    @Override // f3.InterfaceC4505d
    public final void i2(C4508g c4508g) {
        C0332s c0332s = (C0332s) this.f2083n.get();
        if (c0332s == null) {
            return;
        }
        C0327m c0327m = new C0327m(c0332s, c0332s, c4508g);
        HandlerC0333t handlerC0333t = c0332s.f2100n.f2143x;
        handlerC0333t.sendMessage(handlerC0333t.obtainMessage(1, c0327m));
    }
}
