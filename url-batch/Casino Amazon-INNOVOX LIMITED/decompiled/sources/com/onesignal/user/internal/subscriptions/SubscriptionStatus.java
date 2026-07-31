package com.onesignal.user.internal.subscriptions;

import com.onesignal.core.BuildConfig;
import io.opentelemetry.semconv.OtelAttributes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubscriptionModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, d2 = {"Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;", "", "value", "", "(Ljava/lang/String;II)V", "isRetryableTokenError", "", "()Z", "getValue", "()I", "SUBSCRIBED", "NO_PERMISSION", "UNSUBSCRIBE", "MISSING_JETPACK_LIBRARY", "MISSING_FIREBASE_FCM_LIBRARY", "OUTDATED_JETPACK_LIBRARY", "INVALID_FCM_SENDER_ID", "OUTDATED_GOOGLE_PLAY_SERVICES_APP", "FIREBASE_FCM_INIT_ERROR", "FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE", "FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER", "FIREBASE_FCM_ERROR_MISC_EXCEPTION", "HMS_TOKEN_TIMEOUT", "HMS_ARGUMENTS_INVALID", "HMS_API_EXCEPTION_OTHER", "MISSING_HMS_PUSHKIT_LIBRARY", "FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED", "DISABLED_FROM_REST_API_DEFAULT_REASON", OtelAttributes.OtelStatusCodeValues.ERROR, "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscriptionStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscriptionStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SubscriptionStatus DISABLED_FROM_REST_API_DEFAULT_REASON;
    public static final SubscriptionStatus ERROR;
    public static final SubscriptionStatus FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED;
    public static final SubscriptionStatus FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER;
    public static final SubscriptionStatus FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE;
    public static final SubscriptionStatus FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    public static final SubscriptionStatus FIREBASE_FCM_INIT_ERROR;
    public static final SubscriptionStatus HMS_API_EXCEPTION_OTHER;
    public static final SubscriptionStatus HMS_ARGUMENTS_INVALID;
    public static final SubscriptionStatus HMS_TOKEN_TIMEOUT;
    public static final SubscriptionStatus MISSING_HMS_PUSHKIT_LIBRARY;
    private static final Set<SubscriptionStatus> RETRYABLE_TOKEN_ERRORS;
    private final int value;
    public static final SubscriptionStatus SUBSCRIBED = new SubscriptionStatus("SUBSCRIBED", 0, 1);
    public static final SubscriptionStatus NO_PERMISSION = new SubscriptionStatus("NO_PERMISSION", 1, 0);
    public static final SubscriptionStatus UNSUBSCRIBE = new SubscriptionStatus("UNSUBSCRIBE", 2, -2);
    public static final SubscriptionStatus MISSING_JETPACK_LIBRARY = new SubscriptionStatus("MISSING_JETPACK_LIBRARY", 3, -3);
    public static final SubscriptionStatus MISSING_FIREBASE_FCM_LIBRARY = new SubscriptionStatus("MISSING_FIREBASE_FCM_LIBRARY", 4, -4);
    public static final SubscriptionStatus OUTDATED_JETPACK_LIBRARY = new SubscriptionStatus("OUTDATED_JETPACK_LIBRARY", 5, -5);
    public static final SubscriptionStatus INVALID_FCM_SENDER_ID = new SubscriptionStatus("INVALID_FCM_SENDER_ID", 6, -6);
    public static final SubscriptionStatus OUTDATED_GOOGLE_PLAY_SERVICES_APP = new SubscriptionStatus("OUTDATED_GOOGLE_PLAY_SERVICES_APP", 7, -7);

    private static final /* synthetic */ SubscriptionStatus[] $values() {
        return new SubscriptionStatus[]{SUBSCRIBED, NO_PERMISSION, UNSUBSCRIBE, MISSING_JETPACK_LIBRARY, MISSING_FIREBASE_FCM_LIBRARY, OUTDATED_JETPACK_LIBRARY, INVALID_FCM_SENDER_ID, OUTDATED_GOOGLE_PLAY_SERVICES_APP, FIREBASE_FCM_INIT_ERROR, FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE, FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER, FIREBASE_FCM_ERROR_MISC_EXCEPTION, HMS_TOKEN_TIMEOUT, HMS_ARGUMENTS_INVALID, HMS_API_EXCEPTION_OTHER, MISSING_HMS_PUSHKIT_LIBRARY, FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED, DISABLED_FROM_REST_API_DEFAULT_REASON, ERROR};
    }

    public static EnumEntries<SubscriptionStatus> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionStatus valueOf(String str) {
        return (SubscriptionStatus) Enum.valueOf(SubscriptionStatus.class, str);
    }

    public static SubscriptionStatus[] values() {
        return (SubscriptionStatus[]) $VALUES.clone();
    }

    private SubscriptionStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        SubscriptionStatus subscriptionStatus = new SubscriptionStatus("FIREBASE_FCM_INIT_ERROR", 8, -8);
        FIREBASE_FCM_INIT_ERROR = subscriptionStatus;
        SubscriptionStatus subscriptionStatus2 = new SubscriptionStatus("FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE", 9, -9);
        FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE = subscriptionStatus2;
        SubscriptionStatus subscriptionStatus3 = new SubscriptionStatus("FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER", 10, -11);
        FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER = subscriptionStatus3;
        SubscriptionStatus subscriptionStatus4 = new SubscriptionStatus("FIREBASE_FCM_ERROR_MISC_EXCEPTION", 11, -12);
        FIREBASE_FCM_ERROR_MISC_EXCEPTION = subscriptionStatus4;
        SubscriptionStatus subscriptionStatus5 = new SubscriptionStatus("HMS_TOKEN_TIMEOUT", 12, -25);
        HMS_TOKEN_TIMEOUT = subscriptionStatus5;
        HMS_ARGUMENTS_INVALID = new SubscriptionStatus("HMS_ARGUMENTS_INVALID", 13, -26);
        SubscriptionStatus subscriptionStatus6 = new SubscriptionStatus("HMS_API_EXCEPTION_OTHER", 14, -27);
        HMS_API_EXCEPTION_OTHER = subscriptionStatus6;
        MISSING_HMS_PUSHKIT_LIBRARY = new SubscriptionStatus("MISSING_HMS_PUSHKIT_LIBRARY", 15, -28);
        SubscriptionStatus subscriptionStatus7 = new SubscriptionStatus("FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED", 16, -29);
        FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED = subscriptionStatus7;
        DISABLED_FROM_REST_API_DEFAULT_REASON = new SubscriptionStatus("DISABLED_FROM_REST_API_DEFAULT_REASON", 17, -30);
        ERROR = new SubscriptionStatus(OtelAttributes.OtelStatusCodeValues.ERROR, 18, 9999);
        SubscriptionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        RETRYABLE_TOKEN_ERRORS = SetsKt.setOf((Object[]) new SubscriptionStatus[]{subscriptionStatus, subscriptionStatus2, subscriptionStatus3, subscriptionStatus4, subscriptionStatus5, subscriptionStatus6, subscriptionStatus7});
    }

    public final boolean isRetryableTokenError() {
        return RETRYABLE_TOKEN_ERRORS.contains(this);
    }

    /* compiled from: SubscriptionModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus$Companion;", "", "()V", "RETRYABLE_TOKEN_ERRORS", "", "Lcom/onesignal/user/internal/subscriptions/SubscriptionStatus;", "fromInt", "value", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubscriptionStatus fromInt(int value) {
            for (SubscriptionStatus subscriptionStatus : SubscriptionStatus.values()) {
                if (subscriptionStatus.getValue() == value) {
                    return subscriptionStatus;
                }
            }
            return null;
        }
    }
}
