package defpackage;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.l;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kw implements tw {
    public final /* synthetic */ int d;
    public final o01 e;

    public /* synthetic */ kw(o01 o01Var, int i) {
        this.d = i;
        this.e = o01Var;
    }

    @Override // defpackage.o01
    public final Object get() {
        int i = this.d;
        o01 o01Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String packageName = ((Context) o01Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                l.b("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new w61(Integer.valueOf(w61.h).intValue(), (Context) o01Var.get(), "com.google.android.datatransport.events");
        }
    }
}
