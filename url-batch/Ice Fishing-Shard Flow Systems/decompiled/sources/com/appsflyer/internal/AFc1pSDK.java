package com.appsflyer.internal;

import R5.InterfaceC0168h;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFc1pSDK implements AFc1jSDK {
    private final AFc1eSDK<SharedPreferences> getMonetizationNetwork;
    private final InterfaceC0168h getRevenue;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFc1pSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends kotlin.jvm.internal.p implements Function0<SharedPreferences> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: m_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1pSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1pSDK(AFc1eSDK<SharedPreferences> aFc1eSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.getMonetizationNetwork = aFc1eSDK;
        this.getRevenue = R5.i.b(new AnonymousClass3());
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final int getCurrencyIso4217Code(String str, int i2) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getInt(str, i2);
        } catch (ClassCastException e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, r4.f.i("Unexpected data type found for key ", str), e7, false, false, false, false, 120, null);
            return i2;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getMediationNetwork(String str, String str2) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final boolean getMonetizationNetwork(String str) {
        return ((SharedPreferences) this.getRevenue.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final String getRevenue(String str, String str2) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getString(str, str2);
        } catch (ClassCastException e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, r4.f.i("Unexpected data type found for key ", str), e7, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void AFAdRevenueData(String str, int i2) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putInt(str, i2).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final long getMediationNetwork(String str, long j) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getLong(str, j);
        } catch (ClassCastException e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, r4.f.i("Unexpected data type found for key ", str), e7, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getCurrencyIso4217Code(String str) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final boolean getRevenue(String str) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getBoolean(str, false);
        } catch (ClassCastException e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, r4.f.i("Unexpected data type found for key ", str), e7, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getRevenue(String str, boolean z7) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putBoolean(str, z7).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getRevenue(String str, long j) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putLong(str, j).apply();
    }
}
