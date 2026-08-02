package E;

import b.RunnableC0243d;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: E.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0243d f428a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f429b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f430c = new HashMap();

    public C0011l(RunnableC0243d runnableC0243d) {
        this.f428a = runnableC0243d;
    }

    public final void a(InterfaceC0013n interfaceC0013n) {
        this.f429b.remove(interfaceC0013n);
        C0010k c0010k = (C0010k) this.f430c.remove(interfaceC0013n);
        if (c0010k != null) {
            c0010k.f426a.b(c0010k.f427b);
            c0010k.f427b = null;
        }
        this.f428a.run();
    }
}
