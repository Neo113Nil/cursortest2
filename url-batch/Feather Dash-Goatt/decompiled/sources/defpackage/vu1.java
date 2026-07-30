package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vu1 {
    public final int a;
    public final ng1 b = new ng1();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public vu1(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                return false;
        }
    }

    public final void b(d91 d91Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + d91Var.toString());
        }
        this.b.a.l(d91Var);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.b.a(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + a() + "}";
    }
}
