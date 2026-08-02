package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.PaymentIntent;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.TuplesKt;
import okhttp3.internal.Tags;

@Serializable
/* loaded from: classes8.dex */
public final class MobileFallbackWebviewParams implements StripeModel {
    public final WebviewRequirementType webViewRequirementType;
    public final String webviewOpenUrl;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<MobileFallbackWebviewParams> CREATOR = new PaymentIntent.Creator(10);
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(4)), null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/MobileFallbackWebviewParams$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/MobileFallbackWebviewParams;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MobileFallbackWebviewParams$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType", "", "Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Unknown", "Required", "NotRequired", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable
    public final class WebviewRequirementType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WebviewRequirementType[] $VALUES;
        private static final Lazy<KSerializer> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final WebviewRequirementType Unknown = new WebviewRequirementType("Unknown", 0, "");
        public static final WebviewRequirementType Required = new WebviewRequirementType("Required", 1, "required");
        public static final WebviewRequirementType NotRequired = new WebviewRequirementType("NotRequired", 2, "notrequired");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/MobileFallbackWebviewParams$WebviewRequirementType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) WebviewRequirementType.$cachedSerializer$delegate.getValue();
            }
        }

        private static final /* synthetic */ WebviewRequirementType[] $values() {
            return new WebviewRequirementType[]{Unknown, Required, NotRequired};
        }

        static {
            WebviewRequirementType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(5));
        }

        private WebviewRequirementType(String str, int i, String str2) {
            this.value = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            WebviewRequirementType[] values = values();
            values.getClass();
            return new EnumSerializer("com.stripe.android.model.MobileFallbackWebviewParams.WebviewRequirementType", (Enum[]) values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static WebviewRequirementType valueOf(String str) {
            return (WebviewRequirementType) Enum.valueOf(WebviewRequirementType.class, str);
        }

        public static WebviewRequirementType[] values() {
            return (WebviewRequirementType[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ MobileFallbackWebviewParams(int i, WebviewRequirementType webviewRequirementType, String str) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, MobileFallbackWebviewParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.webViewRequirementType = webviewRequirementType;
        if ((i & 2) == 0) {
            this.webviewOpenUrl = null;
        } else {
            this.webviewOpenUrl = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileFallbackWebviewParams)) {
            return false;
        }
        MobileFallbackWebviewParams mobileFallbackWebviewParams = (MobileFallbackWebviewParams) obj;
        return this.webViewRequirementType == mobileFallbackWebviewParams.webViewRequirementType && Intrinsics.areEqual(this.webviewOpenUrl, mobileFallbackWebviewParams.webviewOpenUrl);
    }

    public final int hashCode() {
        int hashCode = this.webViewRequirementType.hashCode() * 31;
        String str = this.webviewOpenUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MobileFallbackWebviewParams(webViewRequirementType=" + this.webViewRequirementType + ", webviewOpenUrl=" + this.webviewOpenUrl + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.webViewRequirementType.name());
        parcel.writeString(this.webviewOpenUrl);
    }

    public MobileFallbackWebviewParams(WebviewRequirementType webviewRequirementType, String str) {
        webviewRequirementType.getClass();
        this.webViewRequirementType = webviewRequirementType;
        this.webviewOpenUrl = str;
    }
}
