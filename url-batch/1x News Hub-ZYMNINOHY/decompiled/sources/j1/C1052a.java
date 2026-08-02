package j1;

import a.AbstractC0129a;
import q1.AbstractC1180a;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052a {

    /* renamed from: a, reason: collision with root package name */
    public final i f9515a;

    public C1052a(i iVar) {
        this.f9515a = iVar;
    }

    public static C1052a a(AbstractC1053b abstractC1053b) {
        i iVar = (i) abstractC1053b;
        if (iVar.f9544e.f10231c != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        AbstractC0129a.f(iVar);
        C1052a c1052a = new C1052a(iVar);
        iVar.f9544e.f10231c = c1052a;
        return c1052a;
    }

    public final void b() {
        i iVar = this.f9515a;
        AbstractC0129a.a(iVar);
        iVar.f9541b.getClass();
        if (iVar.f9548j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        AbstractC1180a abstractC1180a = iVar.f9544e;
        n1.i.f10160a.a(abstractC1180a.g(), "publishLoadedEvent", null, abstractC1180a.f10229a);
        iVar.f9548j = true;
    }
}
