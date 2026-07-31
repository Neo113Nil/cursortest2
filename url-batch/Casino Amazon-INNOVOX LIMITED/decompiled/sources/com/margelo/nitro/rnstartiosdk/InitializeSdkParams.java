package com.margelo.nitro.rnstartiosdk;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitializeSdkParams.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/InitializeSdkParams;", "", "androidAppId", "", "iOSAppId", "adPreferences", "Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;", "testAd", "", "returnAd", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAndroidAppId", "()Ljava/lang/String;", "getIOSAppId", "getAdPreferences", "()Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;", "getTestAd", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReturnAd", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/margelo/nitro/rnstartiosdk/InitializeSdkParams;", "equals", "other", "hashCode", "", "toString", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InitializeSdkParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdInitPreferences adPreferences;
    private final String androidAppId;
    private final String iOSAppId;
    private final Boolean returnAd;
    private final Boolean testAd;

    public static /* synthetic */ InitializeSdkParams copy$default(InitializeSdkParams initializeSdkParams, String str, String str2, AdInitPreferences adInitPreferences, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializeSdkParams.androidAppId;
        }
        if ((i & 2) != 0) {
            str2 = initializeSdkParams.iOSAppId;
        }
        if ((i & 4) != 0) {
            adInitPreferences = initializeSdkParams.adPreferences;
        }
        if ((i & 8) != 0) {
            bool = initializeSdkParams.testAd;
        }
        if ((i & 16) != 0) {
            bool2 = initializeSdkParams.returnAd;
        }
        Boolean bool3 = bool2;
        AdInitPreferences adInitPreferences2 = adInitPreferences;
        return initializeSdkParams.copy(str, str2, adInitPreferences2, bool, bool3);
    }

    @JvmStatic
    private static final InitializeSdkParams fromCpp(String str, String str2, AdInitPreferences adInitPreferences, Boolean bool, Boolean bool2) {
        return INSTANCE.fromCpp(str, str2, adInitPreferences, bool, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAndroidAppId() {
        return this.androidAppId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIOSAppId() {
        return this.iOSAppId;
    }

    /* renamed from: component3, reason: from getter */
    public final AdInitPreferences getAdPreferences() {
        return this.adPreferences;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getTestAd() {
        return this.testAd;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getReturnAd() {
        return this.returnAd;
    }

    public final InitializeSdkParams copy(String androidAppId, String iOSAppId, AdInitPreferences adPreferences, Boolean testAd, Boolean returnAd) {
        return new InitializeSdkParams(androidAppId, iOSAppId, adPreferences, testAd, returnAd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializeSdkParams)) {
            return false;
        }
        InitializeSdkParams initializeSdkParams = (InitializeSdkParams) other;
        return Intrinsics.areEqual(this.androidAppId, initializeSdkParams.androidAppId) && Intrinsics.areEqual(this.iOSAppId, initializeSdkParams.iOSAppId) && Intrinsics.areEqual(this.adPreferences, initializeSdkParams.adPreferences) && Intrinsics.areEqual(this.testAd, initializeSdkParams.testAd) && Intrinsics.areEqual(this.returnAd, initializeSdkParams.returnAd);
    }

    public int hashCode() {
        String str = this.androidAppId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iOSAppId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdInitPreferences adInitPreferences = this.adPreferences;
        int hashCode3 = (hashCode2 + (adInitPreferences == null ? 0 : adInitPreferences.hashCode())) * 31;
        Boolean bool = this.testAd;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.returnAd;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "InitializeSdkParams(androidAppId=" + this.androidAppId + ", iOSAppId=" + this.iOSAppId + ", adPreferences=" + this.adPreferences + ", testAd=" + this.testAd + ", returnAd=" + this.returnAd + ")";
    }

    public InitializeSdkParams(String str, String str2, AdInitPreferences adInitPreferences, Boolean bool, Boolean bool2) {
        this.androidAppId = str;
        this.iOSAppId = str2;
        this.adPreferences = adInitPreferences;
        this.testAd = bool;
        this.returnAd = bool2;
    }

    public final String getAndroidAppId() {
        return this.androidAppId;
    }

    public final String getIOSAppId() {
        return this.iOSAppId;
    }

    public final AdInitPreferences getAdPreferences() {
        return this.adPreferences;
    }

    public final Boolean getTestAd() {
        return this.testAd;
    }

    public final Boolean getReturnAd() {
        return this.returnAd;
    }

    /* compiled from: InitializeSdkParams.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/InitializeSdkParams$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/rnstartiosdk/InitializeSdkParams;", "androidAppId", "", "iOSAppId", "adPreferences", "Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;", "testAd", "", "returnAd", "(Ljava/lang/String;Ljava/lang/String;Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/margelo/nitro/rnstartiosdk/InitializeSdkParams;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final InitializeSdkParams fromCpp(String androidAppId, String iOSAppId, AdInitPreferences adPreferences, Boolean testAd, Boolean returnAd) {
            return new InitializeSdkParams(androidAppId, iOSAppId, adPreferences, testAd, returnAd);
        }
    }
}
