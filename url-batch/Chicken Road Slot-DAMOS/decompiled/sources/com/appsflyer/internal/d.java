package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.internal.AFa1ySDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2074e;

    public /* synthetic */ d(int i3, Object obj) {
        this.f2073d = i3;
        this.f2074e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit mediationNetwork;
        SharedPreferences o_;
        switch (this.f2073d) {
            case 0:
                mediationNetwork = ((AFa1ySDK.AFa1zSDK) this.f2074e).getMediationNetwork();
                return mediationNetwork;
            default:
                o_ = ((AFc1bSDK) this.f2074e).o_();
                return o_;
        }
    }
}
