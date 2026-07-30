package defpackage;

import android.app.Application;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f61 extends dc {
    public final ij1 b;
    public final vo2 c;
    public final vo2 d;
    public final m62 e;

    public f61(Application application) {
        application.getClass();
        this.b = ij1.d.i(application);
        vo2 f = zm3.f(BuildConfig.FLAVOR);
        vo2 f2 = zm3.f(null);
        this.c = f2;
        vo2 f3 = zm3.f(null);
        this.d = f3;
        this.e = iv1.U(new fn0(4, new xm0[]{iv1.X(f, new xk(6, (o30) null, this)), f2, f3, f}, new e61(5, null)), yj1.C(this), new po2(5000L, Long.MAX_VALUE), new d61(BuildConfig.FLAVOR, null, null, ah0.m, 0, 0.0d));
    }
}
