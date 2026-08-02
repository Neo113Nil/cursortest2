package P0;

import L0.g;
import L0.h;
import M0.m;
import N0.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import c1.C0201a;

/* loaded from: classes.dex */
public final class b extends C2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1254b;

    public /* synthetic */ b(int i3) {
        this.f1254b = i3;
    }

    @Override // C2.b
    public L0.c c(Context context, Looper looper, F1.c cVar, Object obj, g gVar, h hVar) {
        switch (this.f1254b) {
            case 2:
                return new Y0.b(context, looper, (m) gVar, (m) hVar, cVar);
            case 3:
                cVar.getClass();
                Integer num = (Integer) cVar.f;
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
                return new C0201a(context, looper, cVar, bundle, gVar, hVar);
            case 4:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.c(context, looper, cVar, obj, gVar, hVar);
        }
    }

    @Override // C2.b
    public L0.c d(Context context, Looper looper, F1.c cVar, Object obj, m mVar, m mVar2) {
        switch (this.f1254b) {
            case 0:
                return new d(context, looper, cVar, (j) obj, mVar, mVar2);
            case 1:
                return new V0.b(context, looper, 300, cVar, mVar, mVar2);
            default:
                return super.d(context, looper, cVar, obj, mVar, mVar2);
        }
    }
}
