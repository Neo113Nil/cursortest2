package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends k3.m {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f333k;

    public e(f fVar) {
        this.f333k = fVar;
    }

    @Override // k3.m
    public final void J(Throwable th) {
        this.f333k.f334a.d(th);
    }

    @Override // k3.m
    public final void M(w wVar) {
        f fVar = this.f333k;
        fVar.c = wVar;
        w wVar2 = fVar.c;
        l lVar = fVar.f334a;
        fVar.f335b = new s(wVar2, lVar.g, lVar.f346i, Build.VERSION.SDK_INT >= 34 ? p.a() : k3.d.F());
        l lVar2 = fVar.f334a;
        lVar2.getClass();
        ArrayList arrayList = new ArrayList();
        lVar2.f341a.writeLock().lock();
        try {
            lVar2.c = 1;
            arrayList.addAll(lVar2.f342b);
            lVar2.f342b.clear();
            lVar2.f341a.writeLock().unlock();
            lVar2.f343d.post(new j(arrayList, lVar2.c, (Throwable) null));
        } catch (Throwable th) {
            lVar2.f341a.writeLock().unlock();
            throw th;
        }
    }
}
