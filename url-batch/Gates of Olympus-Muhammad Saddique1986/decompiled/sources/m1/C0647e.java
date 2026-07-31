package m1;

import a.AbstractC0235a;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: m1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647e extends O2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0648f f6938g;

    public C0647e(C0648f c0648f) {
        this.f6938g = c0648f;
    }

    @Override // O2.l
    public final void o0(Throwable th) {
        this.f6938g.f6939a.e(th);
    }

    @Override // O2.l
    public final void p0(G1.g gVar) {
        C0648f c0648f = this.f6938g;
        c0648f.f6941c = gVar;
        G1.g gVar2 = c0648f.f6941c;
        i iVar = c0648f.f6939a;
        c0648f.f6940b = new G1.m(gVar2, iVar.f6952g, iVar.f6954i, Build.VERSION.SDK_INT >= 34 ? n.a() : AbstractC0235a.x());
        i iVar2 = c0648f.f6939a;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        iVar2.f6946a.writeLock().lock();
        try {
            iVar2.f6948c = 1;
            arrayList.addAll(iVar2.f6947b);
            iVar2.f6947b.clear();
            iVar2.f6946a.writeLock().unlock();
            iVar2.f6949d.post(new RunnableC0649g(arrayList, iVar2.f6948c, null));
        } catch (Throwable th) {
            iVar2.f6946a.writeLock().unlock();
            throw th;
        }
    }
}
