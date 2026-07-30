package com.facebook.login.widget;

import com.facebook.login.LoginManager;
import defpackage.o81;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class LoginButton$loginManagerLazy$1 extends o81 implements Function0<LoginManager> {
    public static final LoginButton$loginManagerLazy$1 INSTANCE = new LoginButton$loginManagerLazy$1();

    public LoginButton$loginManagerLazy$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LoginManager invoke() {
        return LoginManager.Companion.getInstance();
    }
}
