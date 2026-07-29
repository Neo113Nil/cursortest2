package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* loaded from: classes.dex */
public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a, reason: collision with root package name */
    private final j f2889a;

    UserServiceImpl(j jVar) {
        this.f2889a = jVar;
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f2889a.I().a(activity, onConsentDialogDismissListener);
    }
}
