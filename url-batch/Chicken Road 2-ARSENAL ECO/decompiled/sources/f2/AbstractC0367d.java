package f2;

import kotlin.jvm.internal.i;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0367d {
    public static final void clearLegacyPlayerId(InterfaceC0365b interfaceC0365b) {
        i.e(interfaceC0365b, "<this>");
        interfaceC0365b.saveString(com.onesignal.common.threading.a.BASE_THREAD_NAME, "GT_PLAYER_ID", null);
    }

    public static final String getLegacyAppId(InterfaceC0365b interfaceC0365b) {
        i.e(interfaceC0365b, "<this>");
        return AbstractC0364a.getString$default(interfaceC0365b, com.onesignal.common.threading.a.BASE_THREAD_NAME, "GT_APP_ID", null, 4, null);
    }

    public static final String getLegacyPlayerId(InterfaceC0365b interfaceC0365b) {
        i.e(interfaceC0365b, "<this>");
        return AbstractC0364a.getString$default(interfaceC0365b, com.onesignal.common.threading.a.BASE_THREAD_NAME, "GT_PLAYER_ID", null, 4, null);
    }

    public static final String getLegacyUserSyncValues(InterfaceC0365b interfaceC0365b) {
        i.e(interfaceC0365b, "<this>");
        return AbstractC0364a.getString$default(interfaceC0365b, com.onesignal.common.threading.a.BASE_THREAD_NAME, "ONESIGNAL_USERSTATE_SYNCVALYES_CURRENT_STATE", null, 4, null);
    }
}
