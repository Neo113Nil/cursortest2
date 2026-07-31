package W0;

import S0.e;
import S0.f;
import U0.k;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import i1.C0420a;
import k.v0;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class b extends AbstractC0521b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2788c;

    public /* synthetic */ b(int i7) {
        this.f2788c = i7;
    }

    @Override // m1.AbstractC0521b
    public S0.a c(Context context, Looper looper, v0 v0Var, Object obj, e eVar, f fVar) {
        switch (this.f2788c) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v0Var.getClass();
                Integer num = (Integer) v0Var.f5142l;
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
                return new C0420a(context, looper, v0Var, bundle, eVar, fVar);
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.c(context, looper, v0Var, obj, eVar, fVar);
        }
    }

    @Override // m1.AbstractC0521b
    public /* synthetic */ S0.a d(Context context, Looper looper, v0 v0Var, Object obj, e eVar, f fVar) {
        switch (this.f2788c) {
            case 0:
                return new d(context, looper, v0Var, (k) obj, eVar, fVar);
            default:
                return super.d(context, looper, v0Var, obj, eVar, fVar);
        }
    }
}
