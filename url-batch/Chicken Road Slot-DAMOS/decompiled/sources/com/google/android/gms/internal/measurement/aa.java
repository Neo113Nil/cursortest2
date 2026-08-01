package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class aa extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2141a;

    public /* synthetic */ aa(int i3) {
        this.f2141a = i3;
    }

    @Override // a.a
    public c7.i i(Context context, Looper looper, m.g2 g2Var, Object obj, a7.k kVar, a7.l lVar) {
        switch (this.f2141a) {
            case 0:
                return new fa(context, looper, 51, g2Var, kVar, lVar);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                g2Var.getClass();
                Integer num = (Integer) g2Var.f6083u;
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
                return new u7.a(context, looper, g2Var, bundle, kVar, lVar);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                throw n0.l.e(obj);
            default:
                return super.i(context, looper, g2Var, obj, kVar, lVar);
        }
    }

    @Override // a.a
    public c7.i j(Context context, Looper looper, m.g2 g2Var, Object obj, a7.k kVar, a7.l lVar) {
        switch (this.f2141a) {
            case 1:
                return new e7.a(context, looper, 449, g2Var, kVar, lVar);
            case 2:
                return new e7.e(context, looper, g2Var, (c7.o) obj, kVar, lVar);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new n7.b(context, looper, 457, g2Var, kVar, lVar);
            default:
                return super.j(context, looper, g2Var, obj, kVar, lVar);
        }
    }
}
