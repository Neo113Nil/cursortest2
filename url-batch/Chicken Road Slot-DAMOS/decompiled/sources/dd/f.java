package dd;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final a Companion;
    private final int value;
    public static final f SUBSCRIBED = new f("SUBSCRIBED", 0, 1);
    public static final f NO_PERMISSION = new f("NO_PERMISSION", 1, 0);
    public static final f UNSUBSCRIBE = new f("UNSUBSCRIBE", 2, -2);
    public static final f MISSING_JETPACK_LIBRARY = new f("MISSING_JETPACK_LIBRARY", 3, -3);
    public static final f MISSING_FIREBASE_FCM_LIBRARY = new f("MISSING_FIREBASE_FCM_LIBRARY", 4, -4);
    public static final f OUTDATED_JETPACK_LIBRARY = new f("OUTDATED_JETPACK_LIBRARY", 5, -5);
    public static final f INVALID_FCM_SENDER_ID = new f("INVALID_FCM_SENDER_ID", 6, -6);
    public static final f OUTDATED_GOOGLE_PLAY_SERVICES_APP = new f("OUTDATED_GOOGLE_PLAY_SERVICES_APP", 7, -7);
    public static final f FIREBASE_FCM_INIT_ERROR = new f("FIREBASE_FCM_INIT_ERROR", 8, -8);
    public static final f FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE = new f("FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE", 9, -9);
    public static final f FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER = new f("FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER", 10, -11);
    public static final f FIREBASE_FCM_ERROR_MISC_EXCEPTION = new f("FIREBASE_FCM_ERROR_MISC_EXCEPTION", 11, -12);
    public static final f HMS_TOKEN_TIMEOUT = new f("HMS_TOKEN_TIMEOUT", 12, -25);
    public static final f HMS_ARGUMENTS_INVALID = new f("HMS_ARGUMENTS_INVALID", 13, -26);
    public static final f HMS_API_EXCEPTION_OTHER = new f("HMS_API_EXCEPTION_OTHER", 14, -27);
    public static final f MISSING_HMS_PUSHKIT_LIBRARY = new f("MISSING_HMS_PUSHKIT_LIBRARY", 15, -28);
    public static final f FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED = new f("FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED", 16, -29);
    public static final f DISABLED_FROM_REST_API_DEFAULT_REASON = new f("DISABLED_FROM_REST_API_DEFAULT_REASON", 17, -30);
    public static final f ERROR = new f("ERROR", 18, 9999);

    private static final /* synthetic */ f[] $values() {
        return new f[]{SUBSCRIBED, NO_PERMISSION, UNSUBSCRIBE, MISSING_JETPACK_LIBRARY, MISSING_FIREBASE_FCM_LIBRARY, OUTDATED_JETPACK_LIBRARY, INVALID_FCM_SENDER_ID, OUTDATED_GOOGLE_PLAY_SERVICES_APP, FIREBASE_FCM_INIT_ERROR, FIREBASE_FCM_ERROR_IOEXCEPTION_SERVICE_NOT_AVAILABLE, FIREBASE_FCM_ERROR_IOEXCEPTION_OTHER, FIREBASE_FCM_ERROR_MISC_EXCEPTION, HMS_TOKEN_TIMEOUT, HMS_ARGUMENTS_INVALID, HMS_API_EXCEPTION_OTHER, MISSING_HMS_PUSHKIT_LIBRARY, FIREBASE_FCM_ERROR_IOEXCEPTION_AUTHENTICATION_FAILED, DISABLED_FROM_REST_API_DEFAULT_REASON, ERROR};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
        Companion = new a(null);
    }

    private f(String str, int i3, int i10) {
        this.value = i10;
    }

    public static od.a getEntries() {
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

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f fromInt(int i3) {
            for (f fVar : f.values()) {
                if (fVar.getValue() == i3) {
                    return fVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
