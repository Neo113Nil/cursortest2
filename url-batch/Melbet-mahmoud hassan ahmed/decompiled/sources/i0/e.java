package i0;

import android.content.Context;
import android.os.Build;
import d0.j;
import d0.k;
import l0.p;

/* loaded from: classes.dex */
public class e extends c<h0.b> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f16884e = j.f("NetworkMeteredCtrlr");

    public e(Context context, n0.a aVar) {
        super(j0.g.c(context, aVar).d());
    }

    @Override // i0.c
    boolean b(p pVar) {
        return pVar.f18486j.b() == k.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i0.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h0.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        j.c().a(f16884e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
