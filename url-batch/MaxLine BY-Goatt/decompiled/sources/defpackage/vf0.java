package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vf0 extends s93 {
    public final /* synthetic */ wf0 s;

    public vf0(wf0 wf0Var) {
        this.s = wf0Var;
    }

    @Override // defpackage.s93
    public final void K(Throwable th) {
        this.s.a.f(th);
    }

    @Override // defpackage.s93
    public final void L(js0 js0Var) {
        wf0 wf0Var = this.s;
        wf0Var.c = js0Var;
        js0 js0Var2 = wf0Var.c;
        ag0 ag0Var = wf0Var.a;
        wf0Var.b = new mh(js0Var2, ag0Var.g, ag0Var.i, Build.VERSION.SDK_INT >= 34 ? gg0.a() : bd3.u());
        ag0 ag0Var2 = wf0Var.a;
        ArrayList arrayList = new ArrayList();
        ag0Var2.a.writeLock().lock();
        try {
            ag0Var2.c = 1;
            arrayList.addAll(ag0Var2.b);
            ag0Var2.b.clear();
            ag0Var2.a.writeLock().unlock();
            ag0Var2.d.post(new xr(arrayList, ag0Var2.c, (Throwable) null));
        } catch (Throwable th) {
            ag0Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
