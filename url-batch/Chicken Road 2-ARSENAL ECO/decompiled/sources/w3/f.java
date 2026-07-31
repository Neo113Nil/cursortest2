package w3;

import a.AbstractC0219a;
import java.util.Set;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final a Companion;
    public static final f DISABLED_FROM_REST_API_DEFAULT_REASON;
    public static final f ERROR;
    public static final f FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED;
    public static final f FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER;
    public static final f FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE;
    public static final f FIREBASE_FCM_ERROR_MISC_EXCEPTION;
    public static final f FIREBASE_FCM_INIT_ERROR;
    public static final f HMS_API_EXCEPTION_OTHER;
    public static final f HMS_ARGUMENTS_INVALID;
    public static final f HMS_TOKEN_TIMEOUT;
    public static final f MISSING_HMS_PUSHKIT_LIBRARY;
    private static final Set<f> RETRYABLE_TOKEN_ERRORS;
    private final int value;
    public static final f SUBSCRIBED = new f("SUBSCRIBED", 0, 1);
    public static final f NO_PERMISSION = new f("NO_PERMISSION", 1, 0);
    public static final f UNSUBSCRIBE = new f("UNSUBSCRIBE", 2, -2);
    public static final f MISSING_JETPACK_LIBRARY = new f("MISSING_JETPACK_LIBRARY", 3, -3);
    public static final f MISSING_FIREBASE_FCM_LIBRARY = new f("MISSING_FIREBASE_FCM_LIBRARY", 4, -4);
    public static final f OUTDATED_JETPACK_LIBRARY = new f("OUTDATED_JETPACK_LIBRARY", 5, -5);
    public static final f INVALID_FCM_SENDER_ID = new f("INVALID_FCM_SENDER_ID", 6, -6);
    public static final f OUTDATED_GOOGLE_PLAY_SERVICES_APP = new f("OUTDATED_GOOGLE_PLAY_SERVICES_APP", 7, -7);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final f fromInt(int i7) {
            for (f fVar : f.values()) {
                if (fVar.getValue() == i7) {
                    return fVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ f[] $values() {
        return new f[]{SUBSCRIBED, NO_PERMISSION, UNSUBSCRIBE, MISSING_JETPACK_LIBRARY, MISSING_FIREBASE_FCM_LIBRARY, OUTDATED_JETPACK_LIBRARY, INVALID_FCM_SENDER_ID, OUTDATED_GOOGLE_PLAY_SERVICES_APP, FIREBASE_FCM_INIT_ERROR, FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE, FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER, FIREBASE_FCM_ERROR_MISC_EXCEPTION, HMS_TOKEN_TIMEOUT, HMS_ARGUMENTS_INVALID, HMS_API_EXCEPTION_OTHER, MISSING_HMS_PUSHKIT_LIBRARY, FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED, DISABLED_FROM_REST_API_DEFAULT_REASON, ERROR};
    }

    static {
        f fVar = new f("FIREBASE_FCM_INIT_ERROR", 8, -8);
        FIREBASE_FCM_INIT_ERROR = fVar;
        f fVar2 = new f("FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE", 9, -9);
        FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE = fVar2;
        f fVar3 = new f("FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER", 10, -11);
        FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER = fVar3;
        f fVar4 = new f("FIREBASE_FCM_ERROR_MISC_EXCEPTION", 11, -12);
        FIREBASE_FCM_ERROR_MISC_EXCEPTION = fVar4;
        f fVar5 = new f("HMS_TOKEN_TIMEOUT", 12, -25);
        HMS_TOKEN_TIMEOUT = fVar5;
        HMS_ARGUMENTS_INVALID = new f("HMS_ARGUMENTS_INVALID", 13, -26);
        f fVar6 = new f("HMS_API_EXCEPTION_OTHER", 14, -27);
        HMS_API_EXCEPTION_OTHER = fVar6;
        MISSING_HMS_PUSHKIT_LIBRARY = new f("MISSING_HMS_PUSHKIT_LIBRARY", 15, -28);
        f fVar7 = new f("FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED", 16, -29);
        FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED = fVar7;
        DISABLED_FROM_REST_API_DEFAULT_REASON = new f("DISABLED_FROM_REST_API_DEFAULT_REASON", 17, -30);
        ERROR = new f("ERROR", 18, 9999);
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
        Companion = new a(null);
        RETRYABLE_TOKEN_ERRORS = AbstractC0219a.B(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7);
    }

    private f(String str, int i7, int i8) {
        this.value = i8;
    }

    public static InterfaceC0620a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isRetryableTokenError() {
        return RETRYABLE_TOKEN_ERRORS.contains(this);
    }
}
