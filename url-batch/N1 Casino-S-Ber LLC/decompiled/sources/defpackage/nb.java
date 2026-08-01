package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements ml {
    public final /* synthetic */ int f;
    public final /* synthetic */ c3 g;

    public /* synthetic */ nb(c3 c3Var, int i) {
        this.f = i;
        this.g = c3Var;
    }

    @Override // defpackage.ml
    public final Object a() {
        int i = this.f;
        int i2 = 0;
        c3 c3Var = this.g;
        switch (i) {
            case 0:
                c3Var.reportFullyDrawn();
                return dh.m;
            case 1:
                return new ll(c3Var.k, new nb(c3Var, i2));
            case 2:
                yf yfVar = new yf();
                c3Var.h().a().b(yfVar);
                return yfVar;
            default:
                ew ewVar = new ew(new mb(c3Var, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (zo.b(Looper.myLooper(), Looper.getMainLooper())) {
                        c3Var.f.a(new ob(ewVar, c3Var));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new m3(c3Var, ewVar, 1));
                    }
                }
                return ewVar;
        }
    }
}
