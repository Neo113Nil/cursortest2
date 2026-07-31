package i0;

import android.content.Context;
import android.os.Build;
import d0.j;
import d0.k;
import l0.p;

/* loaded from: classes.dex */
public class f extends c<h0.b> {

    /* renamed from: e, reason: collision with root package name */
    private static final String f16885e = j.f("NetworkNotRoamingCtrlr");

    public f(Context context, n0.a aVar) {
        super(j0.g.c(context, aVar).d());
    }

    @Override // i0.c
    boolean b(p pVar) {
        return pVar.f18486j.b() == k.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i0.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h0.b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (bVar.a() && bVar.c()) ? false : true;
        }
        j.c().a(f16885e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
