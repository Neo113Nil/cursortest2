package i0;

import android.content.Context;
import android.os.Build;
import d0.k;
import l0.p;

/* loaded from: classes.dex */
public class g extends c<h0.b> {
    public g(Context context, n0.a aVar) {
        super(j0.g.c(context, aVar).d());
    }

    @Override // i0.c
    boolean b(p pVar) {
        return pVar.f18486j.b() == k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f18486j.b() == k.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i0.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h0.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
