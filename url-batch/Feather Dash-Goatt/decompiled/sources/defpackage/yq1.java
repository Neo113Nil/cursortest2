package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yq1 extends vr1 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object g;

    public /* synthetic */ yq1(int i, Object obj) {
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.vr1
    public final void b() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                br1 br1Var = ((ar1) this.g).a;
                br1Var.b.a("unlinkToDeath", new Object[0]);
                ((rr1) br1Var.n).b.unlinkToDeath(br1Var.k, 0);
                br1Var.n = null;
                br1Var.g = false;
                return;
            default:
                synchronized (((br1) this.g).f) {
                    try {
                        if (((br1) this.g).l.get() > 0 && ((br1) this.g).l.decrementAndGet() > 0) {
                            ((br1) this.g).b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        br1 br1Var2 = (br1) this.g;
                        if (br1Var2.n != null) {
                            br1Var2.b.a("Unbind from service.", new Object[0]);
                            br1 br1Var3 = (br1) this.g;
                            br1Var3.a.unbindService(br1Var3.m);
                            br1 br1Var4 = (br1) this.g;
                            br1Var4.g = false;
                            br1Var4.n = null;
                            br1Var4.m = null;
                        }
                        ((br1) this.g).c();
                        return;
                    } finally {
                    }
                }
        }
    }
}
