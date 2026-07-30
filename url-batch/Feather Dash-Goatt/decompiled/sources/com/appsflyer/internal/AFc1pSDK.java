package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import defpackage.ae0;
import defpackage.ee0;
import defpackage.pc0;
import defpackage.qy0;
import defpackage.ry0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFc1pSDK implements AFc1jSDK {
    private final AFc1eSDK<SharedPreferences> getMonetizationNetwork;
    private final ae0 getRevenue;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "m_", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1pSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends pc0 implements Function0<SharedPreferences> {
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
        aFc1eSDK.getClass();
        this.getMonetizationNetwork = aFc1eSDK;
        this.getRevenue = ee0.b(new AnonymousClass3());
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void AFAdRevenueData(String str, int i) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final int getCurrencyIso4217Code(String str, int i) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getInt(str, i);
        } catch (ClassCastException e) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, qy0.j("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final long getMediationNetwork(String str, long j) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getLong(str, j);
        } catch (ClassCastException e) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, qy0.j("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final boolean getMonetizationNetwork(String str) {
        return ((SharedPreferences) this.getRevenue.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final boolean getRevenue(String str) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getBoolean(str, false);
        } catch (ClassCastException e) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, qy0.j("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getCurrencyIso4217Code(String str) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getMediationNetwork(String str, String str2) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final String getRevenue(String str, String str2) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getString(str, str2);
        } catch (ClassCastException e) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, qy0.j("Unexpected data type found for key ", str), e, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getRevenue(String str, boolean z) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getRevenue(String str, long j) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putLong(str, j).apply();
    }
}
