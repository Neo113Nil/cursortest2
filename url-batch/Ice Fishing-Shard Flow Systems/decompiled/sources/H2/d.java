package H2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static final void clearLegacyPlayerId(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "GT_PLAYER_ID", null);
    }

    public static final String getLegacyAppId(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return a.getString$default(bVar, com.onesignal.common.threading.a.BASE_THREAD_NAME, "GT_APP_ID", null, 4, null);
    }

    public static final String getLegacyPlayerId(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return a.getString$default(bVar, com.onesignal.common.threading.a.BASE_THREAD_NAME, "GT_PLAYER_ID", null, 4, null);
    }

    public static final String getLegacyUserSyncValues(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return a.getString$default(bVar, com.onesignal.common.threading.a.BASE_THREAD_NAME, "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
    }
}
