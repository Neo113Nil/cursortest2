package D1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import n.w1;
import r1.InterfaceC0844c;
import r1.k;
import r1.l;
import t1.C0924k;
import v1.C0969a;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class d extends AbstractC1053a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f350c;

    public /* synthetic */ d(int i2) {
        this.f350c = i2;
    }

    @Override // z1.AbstractC1053a
    public InterfaceC0844c g(Context context, Looper looper, w1 w1Var, Object obj, k kVar, l lVar) {
        switch (this.f350c) {
            case 1:
                w1Var.getClass();
                Integer num = (Integer) w1Var.f6947o;
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
                return new I1.a(context, looper, w1Var, bundle, kVar, lVar);
            case 2:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.g(context, looper, w1Var, obj, kVar, lVar);
        }
    }

    @Override // z1.AbstractC1053a
    public InterfaceC0844c h(Context context, Looper looper, w1 w1Var, Object obj, k kVar, l lVar) {
        switch (this.f350c) {
            case 0:
                return new b(context, looper, 457, w1Var, kVar, lVar);
            case 1:
            case 2:
            default:
                return super.h(context, looper, w1Var, obj, kVar, lVar);
            case 3:
                return new C0969a(context, looper, 449, w1Var, kVar, lVar);
            case 4:
                return new v1.e(context, looper, w1Var, (C0924k) obj, kVar, lVar);
        }
    }
}
