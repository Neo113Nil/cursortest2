package a0;

import T.C0095m;
import W.InterfaceC0118k;
import W.InterfaceC0119l;

/* renamed from: a0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0156w implements InterfaceC0119l, InterfaceC0118k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0130F f4248a;

    public /* synthetic */ C0156w(C0130F c0130f) {
        this.f4248a = c0130f;
    }

    @Override // W.InterfaceC0119l
    public void b(Object obj, C0095m c0095m) {
        ((T.L) obj).onEvents(this.f4248a.f3881g, new T.K(c0095m));
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        ((T.L) obj).onAvailableCommandsChanged(this.f4248a.f3861Q);
    }
}
