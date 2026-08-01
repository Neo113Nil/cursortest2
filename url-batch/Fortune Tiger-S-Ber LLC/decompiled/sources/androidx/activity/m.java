package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class m extends u2.d implements t2.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123f;
    public final /* synthetic */ f.i g;

    public /* synthetic */ m(f.i iVar, int i4) {
        this.f123f = i4;
        this.g = iVar;
    }

    @Override // t2.a
    public final Object a() {
        switch (this.f123f) {
            case 0:
                this.g.reportFullyDrawn();
                return m2.c.c;
            case 1:
                f.i iVar = this.g;
                return new y(iVar.f129k, new m(iVar, 0));
            default:
                f.i iVar2 = this.g;
                h0 h0Var = new h0(new d(iVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (u2.c.a(Looper.myLooper(), Looper.getMainLooper())) {
                        iVar2.f126f.a(new h(h0Var, iVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new n(iVar2, h0Var, 0));
                    }
                }
                return h0Var;
        }
    }
}
