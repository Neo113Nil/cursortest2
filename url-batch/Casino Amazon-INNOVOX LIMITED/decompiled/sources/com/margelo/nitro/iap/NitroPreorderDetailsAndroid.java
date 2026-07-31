package com.margelo.nitro.iap;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroPreorderDetailsAndroid.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/margelo/nitro/iap/NitroPreorderDetailsAndroid;", "", "preorderPresaleEndTimeMillis", "", "preorderReleaseTimeMillis", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPreorderPresaleEndTimeMillis", "()Ljava/lang/String;", "getPreorderReleaseTimeMillis", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NitroPreorderDetailsAndroid {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String preorderPresaleEndTimeMillis;
    private final String preorderReleaseTimeMillis;

    public static /* synthetic */ NitroPreorderDetailsAndroid copy$default(NitroPreorderDetailsAndroid nitroPreorderDetailsAndroid, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroPreorderDetailsAndroid.preorderPresaleEndTimeMillis;
        }
        if ((i & 2) != 0) {
            str2 = nitroPreorderDetailsAndroid.preorderReleaseTimeMillis;
        }
        return nitroPreorderDetailsAndroid.copy(str, str2);
    }

    @JvmStatic
    private static final NitroPreorderDetailsAndroid fromCpp(String str, String str2) {
        return INSTANCE.fromCpp(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPreorderPresaleEndTimeMillis() {
        return this.preorderPresaleEndTimeMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPreorderReleaseTimeMillis() {
        return this.preorderReleaseTimeMillis;
    }

    public final NitroPreorderDetailsAndroid copy(String preorderPresaleEndTimeMillis, String preorderReleaseTimeMillis) {
        Intrinsics.checkNotNullParameter(preorderPresaleEndTimeMillis, "preorderPresaleEndTimeMillis");
        Intrinsics.checkNotNullParameter(preorderReleaseTimeMillis, "preorderReleaseTimeMillis");
        return new NitroPreorderDetailsAndroid(preorderPresaleEndTimeMillis, preorderReleaseTimeMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroPreorderDetailsAndroid)) {
            return false;
        }
        NitroPreorderDetailsAndroid nitroPreorderDetailsAndroid = (NitroPreorderDetailsAndroid) other;
        return Intrinsics.areEqual(this.preorderPresaleEndTimeMillis, nitroPreorderDetailsAndroid.preorderPresaleEndTimeMillis) && Intrinsics.areEqual(this.preorderReleaseTimeMillis, nitroPreorderDetailsAndroid.preorderReleaseTimeMillis);
    }

    public int hashCode() {
        return (this.preorderPresaleEndTimeMillis.hashCode() * 31) + this.preorderReleaseTimeMillis.hashCode();
    }

    public String toString() {
        return "NitroPreorderDetailsAndroid(preorderPresaleEndTimeMillis=" + this.preorderPresaleEndTimeMillis + ", preorderReleaseTimeMillis=" + this.preorderReleaseTimeMillis + ")";
    }

    public NitroPreorderDetailsAndroid(String preorderPresaleEndTimeMillis, String preorderReleaseTimeMillis) {
        Intrinsics.checkNotNullParameter(preorderPresaleEndTimeMillis, "preorderPresaleEndTimeMillis");
        Intrinsics.checkNotNullParameter(preorderReleaseTimeMillis, "preorderReleaseTimeMillis");
        this.preorderPresaleEndTimeMillis = preorderPresaleEndTimeMillis;
        this.preorderReleaseTimeMillis = preorderReleaseTimeMillis;
    }

    public final String getPreorderPresaleEndTimeMillis() {
        return this.preorderPresaleEndTimeMillis;
    }

    public final String getPreorderReleaseTimeMillis() {
        return this.preorderReleaseTimeMillis;
    }

    /* compiled from: NitroPreorderDetailsAndroid.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0003¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/iap/NitroPreorderDetailsAndroid$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/iap/NitroPreorderDetailsAndroid;", "preorderPresaleEndTimeMillis", "", "preorderReleaseTimeMillis", "react-native-iap_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroPreorderDetailsAndroid fromCpp(String preorderPresaleEndTimeMillis, String preorderReleaseTimeMillis) {
            return new NitroPreorderDetailsAndroid(preorderPresaleEndTimeMillis, preorderReleaseTimeMillis);
        }
    }
}
