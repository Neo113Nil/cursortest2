package D;

import H1.RunnableC0139m;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: D.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097j {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0139m f296a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f297b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f298c = new HashMap();

    public C0097j(RunnableC0139m runnableC0139m) {
        this.f296a = runnableC0139m;
    }

    public final void a(InterfaceC0099l interfaceC0099l) {
        this.f297b.remove(interfaceC0099l);
        C0096i c0096i = (C0096i) this.f298c.remove(interfaceC0099l);
        if (c0096i != null) {
            c0096i.f294a.b(c0096i.f295b);
            c0096i.f295b = null;
        }
        this.f296a.run();
    }
}
