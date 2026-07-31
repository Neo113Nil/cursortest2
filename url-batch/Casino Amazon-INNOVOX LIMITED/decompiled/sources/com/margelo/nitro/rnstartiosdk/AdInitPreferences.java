package com.margelo.nitro.rnstartiosdk;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdInitPreferences.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;", "", "age", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/margelo/nitro/rnstartiosdk/AdPreferenceGender;", "<init>", "(Ljava/lang/Double;Lcom/margelo/nitro/rnstartiosdk/AdPreferenceGender;)V", "getAge", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGender", "()Lcom/margelo/nitro/rnstartiosdk/AdPreferenceGender;", "component1", "component2", "copy", "(Ljava/lang/Double;Lcom/margelo/nitro/rnstartiosdk/AdPreferenceGender;)Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdInitPreferences {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double age;
    private final AdPreferenceGender gender;

    public static /* synthetic */ AdInitPreferences copy$default(AdInitPreferences adInitPreferences, Double d, AdPreferenceGender adPreferenceGender, int i, Object obj) {
        if ((i & 1) != 0) {
            d = adInitPreferences.age;
        }
        if ((i & 2) != 0) {
            adPreferenceGender = adInitPreferences.gender;
        }
        return adInitPreferences.copy(d, adPreferenceGender);
    }

    @JvmStatic
    private static final AdInitPreferences fromCpp(Double d, AdPreferenceGender adPreferenceGender) {
        return INSTANCE.fromCpp(d, adPreferenceGender);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getAge() {
        return this.age;
    }

    /* renamed from: component2, reason: from getter */
    public final AdPreferenceGender getGender() {
        return this.gender;
    }

    public final AdInitPreferences copy(Double age, AdPreferenceGender gender) {
        return new AdInitPreferences(age, gender);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdInitPreferences)) {
            return false;
        }
        AdInitPreferences adInitPreferences = (AdInitPreferences) other;
        return Intrinsics.areEqual((Object) this.age, (Object) adInitPreferences.age) && this.gender == adInitPreferences.gender;
    }

    public int hashCode() {
        Double d = this.age;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        AdPreferenceGender adPreferenceGender = this.gender;
        return hashCode + (adPreferenceGender != null ? adPreferenceGender.hashCode() : 0);
    }

    public String toString() {
        return "AdInitPreferences(age=" + this.age + ", gender=" + this.gender + ")";
    }

    public AdInitPreferences(Double d, AdPreferenceGender adPreferenceGender) {
        this.age = d;
        this.gender = adPreferenceGender;
    }

    public final Double getAge() {
        return this.age;
    }

    public final AdPreferenceGender getGender() {
        return this.gender;
    }

    /* compiled from: AdInitPreferences.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;", "age", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/margelo/nitro/rnstartiosdk/AdPreferenceGender;", "(Ljava/lang/Double;Lcom/margelo/nitro/rnstartiosdk/AdPreferenceGender;)Lcom/margelo/nitro/rnstartiosdk/AdInitPreferences;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final AdInitPreferences fromCpp(Double age, AdPreferenceGender gender) {
            return new AdInitPreferences(age, gender);
        }
    }
}
