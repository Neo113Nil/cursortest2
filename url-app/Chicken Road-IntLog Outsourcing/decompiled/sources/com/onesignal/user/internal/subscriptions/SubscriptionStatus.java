package com.onesignal.user.internal.subscriptions;

import kotlin.jvm.internal.e;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SubscriptionStatus {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ SubscriptionStatus[] $VALUES;
    public static final Companion Companion;
    private final int value;
    public static final SubscriptionStatus SUBSCRIBED = new SubscriptionStatus("SUBSCRIBED", 0, 1);
    public static final SubscriptionStatus NO_PERMISSION = new SubscriptionStatus("NO_PERMISSION", 1, 0);
    public static final SubscriptionStatus UNSUBSCRIBE = new SubscriptionStatus("UNSUBSCRIBE", 2, -2);
    public static final SubscriptionStatus MISSING_JETPACK_LIBRARY = new SubscriptionStatus("MISSING_JETPACK_LIBRARY", 3, -3);
    public static final SubscriptionStatus MISSING_FIREBASE_FCM_LIBRARY = new SubscriptionStatus("MISSING_FIREBASE_FCM_LIBRARY", 4, -4);
    public static final SubscriptionStatus OUTDATED_JETPACK_LIBRARY = new SubscriptionStatus("OUTDATED_JETPACK_LIBRARY", 5, -5);
    public static final SubscriptionStatus INVALID_FCM_SENDER_ID = new SubscriptionStatus("INVALID_FCM_SENDER_ID", 6, -6);
    public static final SubscriptionStatus OUTDATED_GOOGLE_PLAY_SERVICES_APP = new SubscriptionStatus("OUTDATED_GOOGLE_PLAY_SERVICES_APP", 7, -7);
    public static final SubscriptionStatus FIREBASE_FCM_INIT_ERROR = new SubscriptionStatus("FIREBASE_FCM_INIT_ERROR", 8, -8);
    public static final SubscriptionStatus FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE = new SubscriptionStatus("FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE", 9, -9);
    public static final SubscriptionStatus FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER = new SubscriptionStatus("FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER", 10, -11);
    public static final SubscriptionStatus FIREBASE_FCM_ERROR_MISC_EXCEPTION = new SubscriptionStatus("FIREBASE_FCM_ERROR_MISC_EXCEPTION", 11, -12);
    public static final SubscriptionStatus HMS_TOKEN_TIMEOUT = new SubscriptionStatus("HMS_TOKEN_TIMEOUT", 12, -25);
    public static final SubscriptionStatus HMS_ARGUMENTS_INVALID = new SubscriptionStatus("HMS_ARGUMENTS_INVALID", 13, -26);
    public static final SubscriptionStatus HMS_API_EXCEPTION_OTHER = new SubscriptionStatus("HMS_API_EXCEPTION_OTHER", 14, -27);
    public static final SubscriptionStatus MISSING_HMS_PUSHKIT_LIBRARY = new SubscriptionStatus("MISSING_HMS_PUSHKIT_LIBRARY", 15, -28);
    public static final SubscriptionStatus FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED = new SubscriptionStatus("FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED", 16, -29);
    public static final SubscriptionStatus DISABLED_FROM_REST_API_DEFAULT_REASON = new SubscriptionStatus("DISABLED_FROM_REST_API_DEFAULT_REASON", 17, -30);
    public static final SubscriptionStatus ERROR = new SubscriptionStatus("ERROR", 18, 9999);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SubscriptionStatus fromInt(int i2) {
            for (SubscriptionStatus subscriptionStatus : SubscriptionStatus.values()) {
                if (subscriptionStatus.getValue() == i2) {
                    return subscriptionStatus;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SubscriptionStatus[] $values() {
        return new SubscriptionStatus[]{SUBSCRIBED, NO_PERMISSION, UNSUBSCRIBE, MISSING_JETPACK_LIBRARY, MISSING_FIREBASE_FCM_LIBRARY, OUTDATED_JETPACK_LIBRARY, INVALID_FCM_SENDER_ID, OUTDATED_GOOGLE_PLAY_SERVICES_APP, FIREBASE_FCM_INIT_ERROR, FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE, FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER, FIREBASE_FCM_ERROR_MISC_EXCEPTION, HMS_TOKEN_TIMEOUT, HMS_ARGUMENTS_INVALID, HMS_API_EXCEPTION_OTHER, MISSING_HMS_PUSHKIT_LIBRARY, FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED, DISABLED_FROM_REST_API_DEFAULT_REASON, ERROR};
    }

    static {
        SubscriptionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
        Companion = new Companion(null);
    }

    private SubscriptionStatus(String str, int i2, int i3) {
        this.value = i3;
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionStatus valueOf(String str) {
        return (SubscriptionStatus) Enum.valueOf(SubscriptionStatus.class, str);
    }

    public static SubscriptionStatus[] values() {
        return (SubscriptionStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
