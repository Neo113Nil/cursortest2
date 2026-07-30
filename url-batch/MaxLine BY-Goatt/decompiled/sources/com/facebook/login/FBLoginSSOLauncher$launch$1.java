package com.facebook.login;

import com.facebook.login.LoginClient;
import defpackage.o81;
import defpackage.xx;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FBLoginSSOLauncher$launch$1 extends o81 implements Function0<Unit> {
    final /* synthetic */ LoginClient.Request $request;
    final /* synthetic */ String $ssoContext;
    final /* synthetic */ FBLoginSSOLauncher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FBLoginSSOLauncher$launch$1(FBLoginSSOLauncher fBLoginSSOLauncher, LoginClient.Request request, String str) {
        super(0);
        this.this$0 = fBLoginSSOLauncher;
        this.$request = request;
        this.$ssoContext = str;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4invoke() {
        xx xxVar;
        Collection<String> collection;
        FBLoginSSOLauncher.logSsoEvent$default(this.this$0, LoginLogger.EVENT_NAME_SSO_CONTINUE_CLICKED, this.$request.getAuthId(), new JSONObject().put("reason", this.$ssoContext), null, 8, null);
        LoginManager companion = LoginManager.Companion.getInstance();
        xxVar = this.this$0.activity;
        collection = this.this$0.pendingPermissions;
        companion.startLoginWithForceConfirmation$facebook_common_release(xxVar, collection, this.$ssoContext, this.$request.getAuthId());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4invoke();
        return Unit.a;
    }
}
