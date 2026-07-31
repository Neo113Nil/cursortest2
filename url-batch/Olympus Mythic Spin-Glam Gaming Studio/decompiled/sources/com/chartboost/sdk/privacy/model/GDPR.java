package com.chartboost.sdk.privacy.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR;", "Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "", "consent", "", "c", "(Ljava/lang/String;)Z", "getConsent", "()Ljava/lang/String;", "Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "<init>", "(Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;)V", "Companion", "GDPR_CONSENT", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class GDPR extends GenericDataUseConsent {

    @NotNull
    public static final String GDPR_STANDARD = "gdpr";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "", "", "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "NON_BEHAVIORAL", "BEHAVIORAL", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
    public static final class GDPR_CONSENT {
        private static final /* synthetic */ GDPR_CONSENT[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final /* synthetic */ EnumEntries c;

        /* renamed from: b, reason: from kotlin metadata */
        public final String value;
        public static final GDPR_CONSENT NON_BEHAVIORAL = new GDPR_CONSENT("NON_BEHAVIORAL", 0, "0");
        public static final GDPR_CONSENT BEHAVIORAL = new GDPR_CONSENT("BEHAVIORAL", 1, "1");

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT$Companion;", "", "()V", "fromValue", "Lcom/chartboost/sdk/privacy/model/GDPR$GDPR_CONSENT;", "value", "", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final GDPR_CONSENT fromValue(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GDPR_CONSENT gdpr_consent = GDPR_CONSENT.NON_BEHAVIORAL;
                if (Intrinsics.areEqual(gdpr_consent.getValue(), value)) {
                    return gdpr_consent;
                }
                GDPR_CONSENT gdpr_consent2 = GDPR_CONSENT.BEHAVIORAL;
                if (Intrinsics.areEqual(gdpr_consent2.getValue(), value)) {
                    return gdpr_consent2;
                }
                return null;
            }

            private Companion() {
            }
        }

        static {
            GDPR_CONSENT[] a = a();
            $VALUES = a;
            c = EnumEntriesKt.enumEntries(a);
            INSTANCE = new Companion(null);
        }

        public GDPR_CONSENT(String str, int i, String str2) {
            this.value = str2;
        }

        public static final /* synthetic */ GDPR_CONSENT[] a() {
            return new GDPR_CONSENT[]{NON_BEHAVIORAL, BEHAVIORAL};
        }

        @Nullable
        public static final GDPR_CONSENT fromValue(@NotNull String str) {
            return INSTANCE.fromValue(str);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return c;
        }

        public static GDPR_CONSENT valueOf(String str) {
            return (GDPR_CONSENT) Enum.valueOf(GDPR_CONSENT.class, str);
        }

        public static GDPR_CONSENT[] values() {
            return (GDPR_CONSENT[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GDPR(@NotNull GDPR_CONSENT consent) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(consent, "consent");
        if (c(consent.getValue())) {
            b("gdpr");
            a((Object) consent.getValue());
        } else {
            a("Invalid GDPR consent values. Use provided values or Custom class. Value: " + consent);
        }
    }

    private final boolean c(String consent) {
        return Intrinsics.areEqual(GDPR_CONSENT.NON_BEHAVIORAL.getValue(), consent) || Intrinsics.areEqual(GDPR_CONSENT.BEHAVIORAL.getValue(), consent);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    @NotNull
    public String getConsent() {
        Object consentValue = getConsentValue();
        Intrinsics.checkNotNull(consentValue, "null cannot be cast to non-null type kotlin.String");
        return (String) consentValue;
    }
}
