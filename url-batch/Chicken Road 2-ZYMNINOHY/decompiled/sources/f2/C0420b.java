package f2;

import L1.h;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b2.g;
import c2.m;
import d2.k;
import i2.AbstractC0457a;
import o2.C1327b;
import s2.C1411a;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420b extends AbstractC0457a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8810k;

    public /* synthetic */ C0420b(int i4) {
        this.f8810k = i4;
    }

    @Override // i2.AbstractC0457a
    public b2.c a(Context context, Looper looper, h hVar, Object obj, g gVar, b2.h hVar2) {
        switch (this.f8810k) {
            case 2:
                return new C1327b(context, looper, (m) gVar, (m) hVar2, hVar);
            case 3:
                hVar.getClass();
                Integer num = (Integer) hVar.f1634b;
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
                return new C1411a(context, looper, hVar, bundle, gVar, hVar2);
            case 4:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.a(context, looper, hVar, obj, gVar, hVar2);
        }
    }

    @Override // i2.AbstractC0457a
    public b2.c b(Context context, Looper looper, h hVar, Object obj, m mVar, m mVar2) {
        switch (this.f8810k) {
            case 0:
                return new C0422d(context, looper, hVar, (k) obj, mVar, mVar2);
            case 1:
                return new l2.b(context, looper, 300, hVar, mVar, mVar2, 0);
            default:
                return super.b(context, looper, hVar, obj, mVar, mVar2);
        }
    }
}
