package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class fh extends zo {
    public final /* synthetic */ gh r;

    public fh(gh ghVar) {
        this.r = ghVar;
    }

    @Override // defpackage.zo
    public final void A(Throwable th) {
        this.r.a.d(th);
    }

    @Override // defpackage.zo
    public final void D(we weVar) {
        gh ghVar = this.r;
        ghVar.c = weVar;
        we weVar2 = ghVar.c;
        kh khVar = ghVar.a;
        ghVar.b = new a6(weVar2, khVar.g, khVar.i, Build.VERSION.SDK_INT >= 34 ? ph.a() : jw.w());
        kh khVar2 = ghVar.a;
        ArrayList arrayList = new ArrayList();
        khVar2.a.writeLock().lock();
        try {
            khVar2.c = 1;
            arrayList.addAll(khVar2.b);
            khVar2.b.clear();
            khVar2.a.writeLock().unlock();
            khVar2.d.post(new d9(arrayList, khVar2.c, (Throwable) null));
        } catch (Throwable th) {
            khVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
