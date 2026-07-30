package F4;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class d {
    public static final void clearLegacyPlayerId(b bVar) {
        h.e(bVar, "<this>");
        bVar.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "GT_PLAYER_ID", null);
    }

    public static final String getLegacyAppId(b bVar) {
        h.e(bVar, "<this>");
        return a.getString$default(bVar, com.onesignal.common.threading.b.BASE_THREAD_NAME, "GT_APP_ID", null, 4, null);
    }

    public static final String getLegacyPlayerId(b bVar) {
        h.e(bVar, "<this>");
        return a.getString$default(bVar, com.onesignal.common.threading.b.BASE_THREAD_NAME, "GT_PLAYER_ID", null, 4, null);
    }

    public static final String getLegacyUserSyncValues(b bVar) {
        h.e(bVar, "<this>");
        return a.getString$default(bVar, com.onesignal.common.threading.b.BASE_THREAD_NAME, "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
    }
}
