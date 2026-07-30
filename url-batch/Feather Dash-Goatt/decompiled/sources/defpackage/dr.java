package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dr implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ fr e;
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ s40 h;

    public /* synthetic */ dr(fr frVar, Runnable runnable, s40 s40Var, int i) {
        this.d = i;
        this.e = frVar;
        this.g = runnable;
        this.h = s40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        final s40 s40Var = this.h;
        final Runnable runnable = this.g;
        fr frVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                final int i2 = 0;
                frVar.d.execute(new Runnable() { // from class: br
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        s40 s40Var2 = s40Var;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    s40Var2.z(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    s40Var2.z(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    hr hrVar = (hr) s40Var2.e;
                                    if (s0.j.t(hrVar, null, s0.k)) {
                                        s0.c(hrVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    s40Var2.z(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                frVar.d.execute(new Runnable() { // from class: br
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        s40 s40Var2 = s40Var;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    s40Var2.z(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    s40Var2.z(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    hr hrVar = (hr) s40Var2.e;
                                    if (s0.j.t(hrVar, null, s0.k)) {
                                        s0.c(hrVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    s40Var2.z(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                frVar.d.execute(new Runnable() { // from class: br
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i4;
                        s40 s40Var2 = s40Var;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    s40Var2.z(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    s40Var2.z(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    hr hrVar = (hr) s40Var2.e;
                                    if (s0.j.t(hrVar, null, s0.k)) {
                                        s0.c(hrVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e3) {
                                    s40Var2.z(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
