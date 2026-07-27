package E;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: E.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036k {

    /* renamed from: a, reason: collision with root package name */
    public final B2.b f622a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f623b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f624c = new HashMap();

    public C0036k(B2.b bVar) {
        this.f622a = bVar;
    }

    public final void a(InterfaceC0038m interfaceC0038m) {
        this.f623b.remove(interfaceC0038m);
        C0035j c0035j = (C0035j) this.f624c.remove(interfaceC0038m);
        if (c0035j != null) {
            c0035j.f620a.b(c0035j.f621b);
            c0035j.f621b = null;
        }
        this.f622a.run();
    }
}
