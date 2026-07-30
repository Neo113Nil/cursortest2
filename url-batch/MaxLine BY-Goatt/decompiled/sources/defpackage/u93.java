package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u93 extends ll3 {
    public final /* synthetic */ int i;

    @Override // defpackage.ll3
    public ce l(Context context, Looper looper, sf sfVar, Object obj, uv0 uv0Var, vv0 vv0Var) {
        switch (this.i) {
            case 0:
                sfVar.getClass();
                Integer num = (Integer) sfVar.f;
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
                return new dl2(context, looper, sfVar, bundle, uv0Var, vv0Var);
            case 1:
                throw q40.h(obj);
            default:
                return super.l(context, looper, sfVar, obj, uv0Var, vv0Var);
        }
    }

    @Override // defpackage.ll3
    public /* synthetic */ ce m(Context context, Looper looper, sf sfVar, Object obj, aa3 aa3Var, aa3 aa3Var2) {
        switch (this.i) {
            case 2:
                return new za3(context, looper, sfVar, (tt2) obj, aa3Var, aa3Var2);
            default:
                return super.m(context, looper, sfVar, obj, aa3Var, aa3Var2);
        }
    }
}
