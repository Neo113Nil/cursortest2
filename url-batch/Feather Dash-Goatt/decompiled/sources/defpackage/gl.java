package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gl {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hl hlVar = (hl) obj;
                hlVar.A--;
                break;
            default:
                bc1 bc1Var = (bc1) obj;
                bc1Var.k--;
                break;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((hl) obj).A++;
                break;
            default:
                ((bc1) obj).k++;
                break;
        }
    }
}
