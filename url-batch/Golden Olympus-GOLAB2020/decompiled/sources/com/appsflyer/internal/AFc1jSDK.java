package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFc1jSDK implements AFc1qSDK {
    private final AFc1hSDK<SharedPreferences> getMediationNetwork;
    private final W1.h getMonetizationNetwork;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFc1jSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.jvm.internal.s implements Function0<SharedPreferences> {
        AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: l_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1jSDK.this.getMediationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1jSDK(AFc1hSDK<SharedPreferences> aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMediationNetwork = aFc1hSDK;
        this.getMonetizationNetwork = W1.i.b(new AnonymousClass5());
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getCurrencyIso4217Code(String str, boolean z4) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putBoolean(str, z4).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, String str2) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(String str, long j4) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putLong(str, j4).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final String AFAdRevenueData(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e4) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e4, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getCurrencyIso4217Code(String str, long j4) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getLong(str, j4);
        } catch (ClassCastException e4) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e4, false, false, false, false, 120, null);
            return j4;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str, boolean z4) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getBoolean(str, z4);
        } catch (ClassCastException e4) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e4, false, false, false, false, 120, null);
            return z4;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMonetizationNetwork(String str) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int AFAdRevenueData(String str, int i4) {
        try {
            return ((SharedPreferences) this.getMonetizationNetwork.getValue()).getInt(str, i4);
        } catch (ClassCastException e4) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e4, false, false, false, false, 120, null);
            return i4;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, int i4) {
        ((SharedPreferences) this.getMonetizationNetwork.getValue()).edit().putInt(str, i4).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str) {
        return ((SharedPreferences) this.getMonetizationNetwork.getValue()).contains(str);
    }
}
