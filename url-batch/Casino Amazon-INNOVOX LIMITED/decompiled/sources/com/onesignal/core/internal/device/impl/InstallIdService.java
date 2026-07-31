package com.onesignal.core.internal.device.impl;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstallIdService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/onesignal/core/internal/device/impl/InstallIdService;", "Lcom/onesignal/core/internal/device/IInstallIdService;", "_prefs", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "(Lcom/onesignal/core/internal/preferences/IPreferencesService;)V", "currentId", "Ljava/util/UUID;", "getCurrentId", "()Ljava/util/UUID;", "currentId$delegate", "Lkotlin/Lazy;", "getId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstallIdService implements IInstallIdService {
    private final IPreferencesService _prefs;

    /* renamed from: currentId$delegate, reason: from kotlin metadata */
    private final Lazy currentId;

    public InstallIdService(IPreferencesService _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
        this.currentId = LazyKt.lazy(new Function0<UUID>() { // from class: com.onesignal.core.internal.device.impl.InstallIdService$currentId$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final UUID invoke() {
                IPreferencesService iPreferencesService;
                IPreferencesService iPreferencesService2;
                iPreferencesService = InstallIdService.this._prefs;
                String string$default = IPreferencesService.DefaultImpls.getString$default(iPreferencesService, "OneSignal", PreferenceOneSignalKeys.PREFS_OS_INSTALL_ID, null, 4, null);
                if (string$default != null) {
                    return UUID.fromString(string$default);
                }
                UUID randomUUID = UUID.randomUUID();
                iPreferencesService2 = InstallIdService.this._prefs;
                iPreferencesService2.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_INSTALL_ID, randomUUID.toString());
                return randomUUID;
            }
        });
    }

    private final UUID getCurrentId() {
        Object value = this.currentId.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // com.onesignal.core.internal.device.IInstallIdService
    public Object getId(Continuation<? super UUID> continuation) {
        return getCurrentId();
    }
}
