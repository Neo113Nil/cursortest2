package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\b\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J2\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\b\u0010\u0004"}, d2 = {"Lcom/appsflyer/AppsFlyerConsent;", "", "", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "isUserSubjectToGDPR", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/appsflyer/AppsFlyerConsent;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AFKeystoreWrapper", "Ljava/lang/Boolean;", "getHasConsentForAdsPersonalization", "values", "getHasConsentForDataUsage", "AFInAppEventType", "Z", "p0", "p1", "p2", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "Companion"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AppsFlyerConsent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private final boolean isUserSubjectToGDPR;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    private final Boolean hasConsentForAdsPersonalization;

    /* renamed from: values, reason: from kotlin metadata */
    private final Boolean hasConsentForDataUsage;

    public /* synthetic */ AppsFlyerConsent(boolean z, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, bool, bool2);
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, boolean z, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appsFlyerConsent.isUserSubjectToGDPR;
        }
        if ((i & 2) != 0) {
            bool = appsFlyerConsent.hasConsentForDataUsage;
        }
        if ((i & 4) != 0) {
            bool2 = appsFlyerConsent.hasConsentForAdsPersonalization;
        }
        return appsFlyerConsent.copy(z, bool, bool2);
    }

    @JvmStatic
    public static final AppsFlyerConsent forGDPRUser(boolean z, boolean z2) {
        return INSTANCE.forGDPRUser(z, z2);
    }

    @JvmStatic
    public static final AppsFlyerConsent forNonGDPRUser() {
        return INSTANCE.forNonGDPRUser();
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    public final AppsFlyerConsent copy(boolean isUserSubjectToGDPR, Boolean hasConsentForDataUsage, Boolean hasConsentForAdsPersonalization) {
        return new AppsFlyerConsent(isUserSubjectToGDPR, hasConsentForDataUsage, hasConsentForAdsPersonalization);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) other;
        return this.isUserSubjectToGDPR == appsFlyerConsent.isUserSubjectToGDPR && Intrinsics.areEqual(this.hasConsentForDataUsage, appsFlyerConsent.hasConsentForDataUsage) && Intrinsics.areEqual(this.hasConsentForAdsPersonalization, appsFlyerConsent.hasConsentForAdsPersonalization);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.isUserSubjectToGDPR;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.hasConsentForDataUsage;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasConsentForAdsPersonalization;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return new StringBuilder("AppsFlyerConsent(isUserSubjectToGDPR=").append(this.isUserSubjectToGDPR).append(", hasConsentForDataUsage=").append(this.hasConsentForDataUsage).append(", hasConsentForAdsPersonalization=").append(this.hasConsentForAdsPersonalization).append(')').toString();
    }

    private AppsFlyerConsent(boolean z, Boolean bool, Boolean bool2) {
        this.isUserSubjectToGDPR = z;
        this.hasConsentForDataUsage = bool;
        this.hasConsentForAdsPersonalization = bool2;
    }

    public final boolean isUserSubjectToGDPR() {
        return this.isUserSubjectToGDPR;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.hasConsentForDataUsage;
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.hasConsentForAdsPersonalization;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/appsflyer/AppsFlyerConsent$Companion;", "", "", "hasConsentForDataUsage", "hasConsentForAdsPersonalization", "Lcom/appsflyer/AppsFlyerConsent;", "forGDPRUser", "(ZZ)Lcom/appsflyer/AppsFlyerConsent;", "forNonGDPRUser", "()Lcom/appsflyer/AppsFlyerConsent;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppsFlyerConsent forGDPRUser(boolean hasConsentForDataUsage, boolean hasConsentForAdsPersonalization) {
            return new AppsFlyerConsent(true, Boolean.valueOf(hasConsentForDataUsage), Boolean.valueOf(hasConsentForAdsPersonalization), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }
    }
}
