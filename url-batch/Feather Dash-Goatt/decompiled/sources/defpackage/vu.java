package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vu extends la0 {
    public final /* synthetic */ wu x;

    public vu(wu wuVar) {
        this.x = wuVar;
    }

    @Override // defpackage.la0
    public final void O(Throwable th) {
        this.x.a.d(th);
    }

    @Override // defpackage.la0
    public final void P(o91 o91Var) {
        wu wuVar = this.x;
        wuVar.c = o91Var;
        o91 o91Var2 = wuVar.c;
        yu yuVar = wuVar.a;
        wuVar.b = new i8(o91Var2, yuVar.g, yuVar.i, Build.VERSION.SDK_INT >= 34 ? dv.a() : uq1.I());
        yu yuVar2 = wuVar.a;
        ArrayList arrayList = new ArrayList();
        yuVar2.a.writeLock().lock();
        try {
            yuVar2.c = 1;
            arrayList.addAll(yuVar2.b);
            yuVar2.b.clear();
            yuVar2.a.writeLock().unlock();
            yuVar2.d.post(new mf(arrayList, yuVar2.c, (Throwable) null));
        } catch (Throwable th) {
            yuVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
