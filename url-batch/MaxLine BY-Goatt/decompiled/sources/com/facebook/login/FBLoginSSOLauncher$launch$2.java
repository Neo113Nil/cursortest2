package com.facebook.login;

import com.facebook.login.LoginClient;
import defpackage.o81;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FBLoginSSOLauncher$launch$2 extends o81 implements Function0<Unit> {
    final /* synthetic */ LoginClient.Request $request;
    final /* synthetic */ FBLoginSSOLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBLoginSSOLauncher$launch$2(FBLoginSSOLauncher fBLoginSSOLauncher, LoginClient.Request request) {
        super(0);
        this.this$0 = fBLoginSSOLauncher;
        this.$request = request;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5invoke() {
        FBLoginSSOLauncher.logSsoEvent$default(this.this$0, LoginLogger.EVENT_NAME_SSO_DISMISSED, this.$request.getAuthId(), null, LoginClient.Result.Code.CANCEL.getLoggingValue(), 4, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5invoke();
        return Unit.a;
    }
}
