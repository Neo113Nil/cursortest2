package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AppsFlyerConsent {
    public static final Companion Companion = new Companion(null);
    private final boolean AFInAppEventType;
    private final Boolean AFKeystoreWrapper;
    private final Boolean values;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public final AppsFlyerConsent forGDPRUser(boolean z4, boolean z5) {
            return new AppsFlyerConsent(true, Boolean.valueOf(z4), Boolean.valueOf(z5), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final AppsFlyerConsent forNonGDPRUser() {
            return new AppsFlyerConsent(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AppsFlyerConsent(boolean z4, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, bool, bool2);
    }

    public static /* synthetic */ AppsFlyerConsent copy$default(AppsFlyerConsent appsFlyerConsent, boolean z4, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z4 = appsFlyerConsent.AFInAppEventType;
        }
        if ((i2 & 2) != 0) {
            bool = appsFlyerConsent.values;
        }
        if ((i2 & 4) != 0) {
            bool2 = appsFlyerConsent.AFKeystoreWrapper;
        }
        return appsFlyerConsent.copy(z4, bool, bool2);
    }

    public static final AppsFlyerConsent forGDPRUser(boolean z4, boolean z5) {
        return Companion.forGDPRUser(z4, z5);
    }

    public static final AppsFlyerConsent forNonGDPRUser() {
        return Companion.forNonGDPRUser();
    }

    public final boolean component1() {
        return this.AFInAppEventType;
    }

    public final Boolean component2() {
        return this.values;
    }

    public final Boolean component3() {
        return this.AFKeystoreWrapper;
    }

    public final AppsFlyerConsent copy(boolean z4, Boolean bool, Boolean bool2) {
        return new AppsFlyerConsent(z4, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerConsent)) {
            return false;
        }
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) obj;
        return this.AFInAppEventType == appsFlyerConsent.AFInAppEventType && Intrinsics.a(this.values, appsFlyerConsent.values) && Intrinsics.a(this.AFKeystoreWrapper, appsFlyerConsent.AFKeystoreWrapper);
    }

    public final Boolean getHasConsentForAdsPersonalization() {
        return this.AFKeystoreWrapper;
    }

    public final Boolean getHasConsentForDataUsage() {
        return this.values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z4 = this.AFInAppEventType;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i2 = r02 * 31;
        Boolean bool = this.values;
        int hashCode = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFKeystoreWrapper;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean isUserSubjectToGDPR() {
        return this.AFInAppEventType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsFlyerConsent(isUserSubjectToGDPR=");
        sb.append(this.AFInAppEventType);
        sb.append(", hasConsentForDataUsage=");
        sb.append(this.values);
        sb.append(", hasConsentForAdsPersonalization=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(')');
        return sb.toString();
    }

    private AppsFlyerConsent(boolean z4, Boolean bool, Boolean bool2) {
        this.AFInAppEventType = z4;
        this.values = bool;
        this.AFKeystoreWrapper = bool2;
    }
}
