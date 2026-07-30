package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.internal.AFa1tSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4322e;

    public /* synthetic */ d(int i2, Object obj) {
        this.f4321d = i2;
        this.f4322e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit currencyIso4217Code;
        SharedPreferences o_;
        switch (this.f4321d) {
            case 0:
                currencyIso4217Code = ((AFa1tSDK.AFa1ySDK) this.f4322e).getCurrencyIso4217Code();
                return currencyIso4217Code;
            default:
                o_ = ((AFc1cSDK) this.f4322e).o_();
                return o_;
        }
    }
}
