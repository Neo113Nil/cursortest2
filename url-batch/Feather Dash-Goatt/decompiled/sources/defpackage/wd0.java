package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd0(xd0 xd0Var, Object obj, int i) {
        this.a = i;
        this.b = xd0Var;
        this.c = obj;
    }

    public pd0 b() {
        xd0 xd0Var = this.b;
        jd0 jd0Var = (jd0) xd0Var.n.g(this.c);
        if (jd0Var != null) {
            return (pd0) xd0Var.j.g(jd0Var);
        }
        return null;
    }

    public final boolean c() {
        cw0 cw0Var;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                pd0 b = b();
                if (b == null || (cw0Var = b.f) == null) {
                    return true;
                }
                return cw0Var.c();
        }
    }

    private final void a() {
    }
}
