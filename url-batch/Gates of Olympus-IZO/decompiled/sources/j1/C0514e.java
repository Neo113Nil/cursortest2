package j1;

import D1.C0014b;
import android.os.Build;
import e2.AbstractC0381e;
import h.AbstractC0416e;
import java.util.ArrayList;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514e extends AbstractC0416e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0515f f5248a;

    public C0514e(C0515f c0515f) {
        this.f5248a = c0515f;
    }

    @Override // h.AbstractC0416e
    public final void x(Throwable th) {
        this.f5248a.f5249a.d(th);
    }

    @Override // h.AbstractC0416e
    public final void y(A2.k kVar) {
        C0515f c0515f = this.f5248a;
        c0515f.f5251c = kVar;
        A2.k kVar2 = c0515f.f5251c;
        C0518i c0518i = c0515f.f5249a;
        c0515f.f5250b = new C0014b(kVar2, c0518i.f5262g, c0518i.f5264i, Build.VERSION.SDK_INT >= 34 ? n.a() : AbstractC0381e.D());
        C0518i c0518i2 = c0515f.f5249a;
        c0518i2.getClass();
        ArrayList arrayList = new ArrayList();
        c0518i2.f5256a.writeLock().lock();
        try {
            c0518i2.f5258c = 1;
            arrayList.addAll(c0518i2.f5257b);
            c0518i2.f5257b.clear();
            c0518i2.f5256a.writeLock().unlock();
            c0518i2.f5259d.post(new RunnableC0516g(arrayList, c0518i2.f5258c, null));
        } catch (Throwable th) {
            c0518i2.f5256a.writeLock().unlock();
            throw th;
        }
    }
}
