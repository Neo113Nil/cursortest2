package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements ir {
    public final /* synthetic */ int f;
    public final /* synthetic */ b g;

    public /* synthetic */ od(b bVar, int i) {
        this.f = i;
        this.g = bVar;
    }

    @Override // defpackage.ir
    public final Object a() {
        int i = this.f;
        int i2 = 0;
        b bVar = this.g;
        switch (i) {
            case 0:
                bVar.reportFullyDrawn();
                return sk0.a;
            case 1:
                return new hr(bVar.k, new od(bVar, i2));
            case 2:
                dk dkVar = new dk();
                bVar.h().a().c.a(dkVar);
                return dkVar;
            case 3:
                return new tb0(bVar.getApplication(), bVar, bVar.getIntent() != null ? bVar.getIntent().getExtras() : null);
            default:
                y40 y40Var = new y40(new nd(bVar, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (mv.c(Looper.myLooper(), Looper.getMainLooper())) {
                        bVar.f.a(new pd(y40Var, bVar));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new e4(bVar, y40Var, 1));
                    }
                }
                return y40Var;
        }
    }
}
