package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.TuplesKt;
import okhttp3.internal.Tags;

@Serializable
/* loaded from: classes8.dex */
public final class LinkAccountSessionPaymentAccount {
    public final String id;
    public final MicrodepositVerificationMethod microdepositVerificationMethod;
    public final Boolean networkingSuccessful;
    public final FinancialConnectionsSessionManifest.Pane nextPane;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(5)), null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return LinkAccountSessionPaymentAccount$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod", "", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "AMOUNTS", "DESCRIPTOR_CODE", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable
    public final class MicrodepositVerificationMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MicrodepositVerificationMethod[] $VALUES;
        private static final Lazy<KSerializer> $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("amounts")
        public static final MicrodepositVerificationMethod AMOUNTS = new MicrodepositVerificationMethod("AMOUNTS", 0, "amounts");

        @SerialName("descriptor_code")
        public static final MicrodepositVerificationMethod DESCRIPTOR_CODE = new MicrodepositVerificationMethod("DESCRIPTOR_CODE", 1, "descriptor_code");

        @SerialName("unknown")
        public static final MicrodepositVerificationMethod UNKNOWN = new MicrodepositVerificationMethod("UNKNOWN", 2, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$MicrodepositVerificationMethod;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) MicrodepositVerificationMethod.$cachedSerializer$delegate.getValue();
            }
        }

        private static final /* synthetic */ MicrodepositVerificationMethod[] $values() {
            return new MicrodepositVerificationMethod[]{AMOUNTS, DESCRIPTOR_CODE, UNKNOWN};
        }

        static {
            MicrodepositVerificationMethod[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(6));
        }

        private MicrodepositVerificationMethod(String str, int i, String str2) {
            this.value = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod", values(), new String[]{"amounts", "descriptor_code", "unknown"}, new Annotation[][]{null, null, null});
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static MicrodepositVerificationMethod valueOf(String str) {
            return (MicrodepositVerificationMethod) Enum.valueOf(MicrodepositVerificationMethod.class, str);
        }

        public static MicrodepositVerificationMethod[] values() {
            return (MicrodepositVerificationMethod[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ LinkAccountSessionPaymentAccount(int i, String str, MicrodepositVerificationMethod microdepositVerificationMethod, Boolean bool, FinancialConnectionsSessionManifest.Pane pane) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, LinkAccountSessionPaymentAccount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.microdepositVerificationMethod = MicrodepositVerificationMethod.UNKNOWN;
        } else {
            this.microdepositVerificationMethod = microdepositVerificationMethod;
        }
        if ((i & 4) == 0) {
            this.networkingSuccessful = null;
        } else {
            this.networkingSuccessful = bool;
        }
        if ((i & 8) == 0) {
            this.nextPane = null;
        } else {
            this.nextPane = pane;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkAccountSessionPaymentAccount)) {
            return false;
        }
        LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) obj;
        return Intrinsics.areEqual(this.id, linkAccountSessionPaymentAccount.id) && this.microdepositVerificationMethod == linkAccountSessionPaymentAccount.microdepositVerificationMethod && Intrinsics.areEqual(this.networkingSuccessful, linkAccountSessionPaymentAccount.networkingSuccessful) && this.nextPane == linkAccountSessionPaymentAccount.nextPane;
    }

    public final int hashCode() {
        int hashCode = (this.microdepositVerificationMethod.hashCode() + (this.id.hashCode() * 31)) * 31;
        Boolean bool = this.networkingSuccessful;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.nextPane;
        return hashCode2 + (pane != null ? pane.hashCode() : 0);
    }

    public final String toString() {
        return "LinkAccountSessionPaymentAccount(id=" + this.id + ", microdepositVerificationMethod=" + this.microdepositVerificationMethod + ", networkingSuccessful=" + this.networkingSuccessful + ", nextPane=" + this.nextPane + ")";
    }
}
