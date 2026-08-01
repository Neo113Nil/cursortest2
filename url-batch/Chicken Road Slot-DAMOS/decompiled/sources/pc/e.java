package pc;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {
    public static final String DIRECT_TAG = "direct";
    public static final String IAM_ID_TAG = "iam_id";
    private static final String IAM_TAG;
    public static final e INSTANCE = new e();
    public static final String NOTIFICATIONS_IDS = "notification_ids";
    public static final String NOTIFICATION_ID_TAG = "notification_id";
    private static final String NOTIFICATION_TAG;
    public static final String PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN = "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN";
    public static final String PREFS_OS_LAST_IAMS_RECEIVED = "PREFS_OS_LAST_IAMS_RECEIVED";
    public static final String PREFS_OS_LAST_NOTIFICATIONS_RECEIVED = "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED";
    public static final String PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE = "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE";
    public static final String PREFS_OS_OUTCOMES_CURRENT_NOTIFICATION_INFLUENCE = "PREFS_OS_OUTCOMES_CURRENT_SESSION";
    public static final String TIME = "time";

    static {
        String canonicalName = d.class.getCanonicalName();
        canonicalName.getClass();
        IAM_TAG = canonicalName;
        String canonicalName2 = h.class.getCanonicalName();
        canonicalName2.getClass();
        NOTIFICATION_TAG = canonicalName2;
    }

    private e() {
    }

    public final String getIAM_TAG() {
        return IAM_TAG;
    }

    public final String getNOTIFICATION_TAG() {
        return NOTIFICATION_TAG;
    }
}
