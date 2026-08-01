package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFc1pSDK implements AFc1qSDK {
    private final hd.g getMediationNetwork;
    private final AFc1gSDK<SharedPreferences> getMonetizationNetwork;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "m_", "()Landroid/content/SharedPreferences;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1pSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends wd.p implements Function0<SharedPreferences> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: m_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1pSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1pSDK(AFc1gSDK<SharedPreferences> aFc1gSDK) {
        aFc1gSDK.getClass();
        this.getMonetizationNetwork = aFc1gSDK;
        this.getMediationNetwork = hd.h.b(new AnonymousClass4());
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str, boolean z10) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putBoolean(str, z10).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(String str, boolean z10) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getBoolean(str, z10);
        } catch (ClassCastException e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, v4.a.k("Unexpected data type found for key ", str), e2, false, false, false, false, 120, null);
            return z10;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final String getMonetizationNetwork(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, v4.a.k("Unexpected data type found for key ", str), e2, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int getRevenue(String str, int i3) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getInt(str, i3);
        } catch (ClassCastException e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, v4.a.k("Unexpected data type found for key ", str), e2, false, false, false, false, 120, null);
            return i3;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str, long j) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(String str) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getMonetizationNetwork(String str, long j) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getLong(str, j);
        } catch (ClassCastException e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, v4.a.k("Unexpected data type found for key ", str), e2, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getRevenue(String str, String str2) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(String str, int i3) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putInt(str, i3).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMonetizationNetwork(String str) {
        return ((SharedPreferences) this.getMediationNetwork.getValue()).contains(str);
    }
}
