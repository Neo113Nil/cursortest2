package com.onesignal.core.activities;

import D4.InterfaceC0022w;
import android.content.Intent;
import android.os.Bundle;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.activities.PermissionsActivity$onNewIntent$1", f = "PermissionsActivity.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PermissionsActivity$onNewIntent$1 extends h implements InterfaceC1445p {
    final /* synthetic */ Intent $intent;
    int label;
    final /* synthetic */ PermissionsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsActivity$onNewIntent$1(PermissionsActivity permissionsActivity, Intent intent, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = permissionsActivity;
        this.$intent = intent;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new PermissionsActivity$onNewIntent$1(this.this$0, this.$intent, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((PermissionsActivity$onNewIntent$1) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object handleBundleParams;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            PermissionsActivity permissionsActivity = this.this$0;
            Bundle extras = this.$intent.getExtras();
            this.label = 1;
            handleBundleParams = permissionsActivity.handleBundleParams(extras, this);
            if (handleBundleParams == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }
}
