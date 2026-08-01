package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xg extends j8 {
    public final /* synthetic */ yg k;

    public xg(yg ygVar) {
        this.k = ygVar;
    }

    @Override // defpackage.j8
    public final void G(Throwable th) {
        this.k.a.d(th);
    }

    @Override // defpackage.j8
    public final void H(h8 h8Var) {
        yg ygVar = this.k;
        ygVar.c = h8Var;
        h8 h8Var2 = ygVar.c;
        ch chVar = ygVar.a;
        ygVar.b = new r6(h8Var2, chVar.g, chVar.i, Build.VERSION.SDK_INT >= 34 ? hh.a() : op.B());
        ch chVar2 = ygVar.a;
        ArrayList arrayList = new ArrayList();
        chVar2.a.writeLock().lock();
        try {
            chVar2.c = 1;
            arrayList.addAll(chVar2.b);
            chVar2.b.clear();
            chVar2.a.writeLock().unlock();
            chVar2.d.post(new y8(arrayList, chVar2.c, (Throwable) null));
        } catch (Throwable th) {
            chVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
