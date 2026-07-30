package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.AFa1tSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit currencyIso4217Code;
        SharedPreferences o_;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                currencyIso4217Code = ((AFa1tSDK.AFa1ySDK) obj).getCurrencyIso4217Code();
                return currencyIso4217Code;
            default:
                o_ = ((AFc1cSDK) obj).o_();
                return o_;
        }
    }
}
