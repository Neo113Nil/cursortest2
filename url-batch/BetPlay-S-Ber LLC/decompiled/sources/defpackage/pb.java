package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.k;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements vl {
    public final /* synthetic */ int f;
    public final /* synthetic */ k g;

    public /* synthetic */ pb(k kVar, int i) {
        this.f = i;
        this.g = kVar;
    }

    @Override // defpackage.vl
    public final Object a() {
        int i = this.f;
        k kVar = this.g;
        switch (i) {
            case 0:
                kVar.reportFullyDrawn();
                return vg.m;
            case 1:
                return new ul(kVar.k, new pb(kVar, 0));
            case 2:
                qf qfVar = new qf();
                kVar.getOnBackPressedDispatcher().a().c.a(qfVar);
                return qfVar;
            default:
                lw lwVar = new lw(new rb(kVar, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (op.d(Looper.myLooper(), Looper.getMainLooper())) {
                        kVar.f.a(new qb(lwVar, kVar));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new c4(kVar, lwVar, 1));
                    }
                }
                return lwVar;
        }
    }
}
