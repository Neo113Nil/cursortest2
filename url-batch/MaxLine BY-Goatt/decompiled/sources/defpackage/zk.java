package defpackage;

import android.app.Application;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zk extends dc {
    public final ij1 b;
    public final vo2 c;
    public final vo2 d;
    public final m62 e;

    public zk(Application application) {
        application.getClass();
        ij1 i = ij1.d.i(application);
        this.b = i;
        o30 o30Var = null;
        vo2 f = zm3.f(null);
        this.c = f;
        vo2 f2 = zm3.f(BuildConfig.FLAVOR);
        this.d = f2;
        int i2 = 0;
        pt X = iv1.X(new qn0(f, f2, new wk(3, o30Var, i2), i2), new xk(i2, o30Var, this));
        hk hkVar = i.b;
        this.e = iv1.U(new fn0(5, new xm0[]{X, new cj1(bd3.p(hkVar.a, new String[]{"atlas_progress"}, new zd(8)), 2), i.h(), new cj1(hkVar.b(), i2), f}, new yk(this, null)), yj1.C(this), new po2(5000L, Long.MAX_VALUE), new vk(null, BuildConfig.FLAVOR, ah0.m, mi1.c(), 0, 0));
    }
}
