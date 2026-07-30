package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zr1 extends m90 {
    public final /* synthetic */ int q;

    @Override // defpackage.m90
    public b8 p(Context context, Looper looper, jb jbVar, Object obj, e50 e50Var, f50 f50Var) {
        switch (this.q) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                jbVar.getClass();
                Integer num = (Integer) jbVar.b;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new oa1(context, looper, jbVar, bundle, e50Var, f50Var);
            case 1:
                throw qy0.h(obj);
            default:
                return super.p(context, looper, jbVar, obj, e50Var, f50Var);
        }
    }

    @Override // defpackage.m90
    public /* synthetic */ b8 q(Context context, Looper looper, jb jbVar, Object obj, es1 es1Var, es1 es1Var2) {
        switch (this.q) {
            case 2:
                return new et1(context, looper, jbVar, (sg1) obj, es1Var, es1Var2);
            default:
                return super.q(context, looper, jbVar, obj, es1Var, es1Var2);
        }
    }
}
