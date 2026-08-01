package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gj extends b9 {
    public final /* synthetic */ hj x;

    public gj(hj hjVar) {
        this.x = hjVar;
    }

    @Override // defpackage.b9
    public final void C(rg rgVar) {
        hj hjVar = this.x;
        hjVar.c = rgVar;
        rg rgVar2 = hjVar.c;
        lj ljVar = hjVar.a;
        hjVar.b = new k6(rgVar2, ljVar.g, ljVar.i, Build.VERSION.SDK_INT >= 34 ? rj.a() : xf.r());
        lj ljVar2 = hjVar.a;
        ArrayList arrayList = new ArrayList();
        ljVar2.a.writeLock().lock();
        try {
            ljVar2.c = 1;
            arrayList.addAll(ljVar2.b);
            ljVar2.b.clear();
            ljVar2.a.writeLock().unlock();
            ljVar2.d.post(new q9(arrayList, ljVar2.c, (Throwable) null));
        } catch (Throwable th) {
            ljVar2.a.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.b9
    public final void y(Throwable th) {
        this.x.a.d(th);
    }
}
