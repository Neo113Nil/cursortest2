package com.facebook.login;

import defpackage.kr0;
import defpackage.o81;
import defpackage.t3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class LoginFragment$getLoginMethodHandlerCallback$1 extends o81 implements Function1<t3, Unit> {
    final /* synthetic */ kr0 $activity;
    final /* synthetic */ LoginFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFragment$getLoginMethodHandlerCallback$1(LoginFragment loginFragment, kr0 kr0Var) {
        super(1);
        this.this$0 = loginFragment;
        this.$activity = kr0Var;
    }

    public final void invoke(t3 t3Var) {
        t3Var.getClass();
        if (t3Var.m == -1) {
            this.this$0.getLoginClient().onActivityResult(LoginClient.Companion.getLoginRequestCode(), t3Var.m, t3Var.n);
        } else {
            this.$activity.finish();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((t3) obj);
        return Unit.a;
    }
}
