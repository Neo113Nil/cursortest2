package com.onesignal.core.internal.device.impl;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import java.util.UUID;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class InstallIdService$currentId$2 extends j implements InterfaceC1430a {
    final /* synthetic */ InstallIdService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallIdService$currentId$2(InstallIdService installIdService) {
        super(0);
        this.this$0 = installIdService;
    }

    @Override // t4.InterfaceC1430a
    public final UUID invoke() {
        IPreferencesService iPreferencesService;
        IPreferencesService iPreferencesService2;
        iPreferencesService = this.this$0._prefs;
        String string$default = IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_OS_INSTALL_ID, null, 4, null);
        if (string$default != null) {
            return UUID.fromString(string$default);
        }
        UUID randomUUID = UUID.randomUUID();
        iPreferencesService2 = this.this$0._prefs;
        iPreferencesService2.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_INSTALL_ID, randomUUID.toString());
        return randomUUID;
    }
}
