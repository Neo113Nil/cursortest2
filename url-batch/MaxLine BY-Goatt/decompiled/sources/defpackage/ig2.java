package defpackage;

import android.app.Application;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ig2 extends dc {
    public final ij1 b;
    public final vo2 c;
    public final m62 d;

    public ig2(Application application) {
        application.getClass();
        this.b = ij1.d.i(application);
        vo2 f = zm3.f(BuildConfig.FLAVOR);
        this.c = f;
        o30 o30Var = null;
        fn0 fn0Var = new fn0(3, new xm0[]{f, iv1.X(f, new gg2(o30Var, this, 0)), iv1.X(f, new gg2(o30Var, this, 1))}, new hg2(4, null));
        yu C = yj1.C(this);
        po2 po2Var = new po2(5000L, Long.MAX_VALUE);
        ah0 ah0Var = ah0.m;
        this.d = iv1.U(fn0Var, C, po2Var, new eg2(BuildConfig.FLAVOR, ah0Var, ah0Var));
    }
}
