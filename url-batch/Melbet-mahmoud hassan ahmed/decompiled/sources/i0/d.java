package i0;

import android.content.Context;
import android.os.Build;
import d0.k;
import l0.p;

/* loaded from: classes.dex */
public class d extends c<h0.b> {
    public d(Context context, n0.a aVar) {
        super(j0.g.c(context, aVar).d());
    }

    @Override // i0.c
    boolean b(p pVar) {
        return pVar.f18486j.b() == k.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i0.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h0.b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? (bVar.a() && bVar.d()) ? false : true : !bVar.a();
    }
}
