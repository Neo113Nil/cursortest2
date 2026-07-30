package com.onesignal.user.internal;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {
    private final AndroidUtils androidUtils;
    private final Function0<Context> appContextProvider;
    private final String carrierName;
    private final com.onesignal.core.internal.config.b configModel;
    private final String deviceOS;
    private final com.onesignal.common.d idManager;
    private final T3.b identityModelStore;
    private final com.onesignal.common.h oneSignalUtils;
    private final F2.f operationRepo;
    private final H2.b preferencesService;
    private final com.onesignal.user.internal.properties.b propertiesModelStore;
    private final t2.d services;
    private final Y3.e subscriptionModelStore;

    /* JADX WARN: Multi-variable type inference failed */
    public l(H2.b preferencesService, F2.f operationRepo, t2.d services, com.onesignal.common.d idManager, T3.b identityModelStore, com.onesignal.user.internal.properties.b propertiesModelStore, Y3.e subscriptionModelStore, com.onesignal.core.internal.config.b configModel, com.onesignal.common.h oneSignalUtils, String str, String str2, AndroidUtils androidUtils, Function0<? extends Context> appContextProvider) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(operationRepo, "operationRepo");
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(idManager, "idManager");
        Intrinsics.checkNotNullParameter(identityModelStore, "identityModelStore");
        Intrinsics.checkNotNullParameter(propertiesModelStore, "propertiesModelStore");
        Intrinsics.checkNotNullParameter(subscriptionModelStore, "subscriptionModelStore");
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        Intrinsics.checkNotNullParameter(oneSignalUtils, "oneSignalUtils");
        Intrinsics.checkNotNullParameter(androidUtils, "androidUtils");
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.preferencesService = preferencesService;
        this.operationRepo = operationRepo;
        this.services = services;
        this.idManager = idManager;
        this.identityModelStore = identityModelStore;
        this.propertiesModelStore = propertiesModelStore;
        this.subscriptionModelStore = subscriptionModelStore;
        this.configModel = configModel;
        this.oneSignalUtils = oneSignalUtils;
        this.carrierName = str;
        this.deviceOS = str2;
        this.androidUtils = androidUtils;
        this.appContextProvider = appContextProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createAndSwitchToNewUser$default(l lVar, boolean z7, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z7 = false;
        }
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        lVar.createAndSwitchToNewUser(z7, function2);
    }

    private final void createNewUser() {
        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
        createAndSwitchToNewUser$default(this, false, null, 3, null);
        F2.e.enqueue$default(this.operationRepo, new U3.f(this.configModel.getAppId(), ((T3.a) this.identityModelStore.getModel()).getOnesignalId(), ((T3.a) this.identityModelStore.getModel()).getExternalId(), null, 8, null), false, 2, null);
    }

    private final void migrateFromLegacyUser(String str) {
        l lVar;
        String str2;
        boolean z7;
        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating user linked to subscription " + str, null, 2, null);
        String legacyUserSyncValues = H2.d.getLegacyUserSyncValues(this.preferencesService);
        if (legacyUserSyncValues != null) {
            lVar = this;
            str2 = str;
            lVar.createPushSubscriptionFromLegacySync(str2, new JSONObject(legacyUserSyncValues), this.configModel, this.subscriptionModelStore, ((v2.f) this.services.getService(v2.f.class)).getAppContext());
            z7 = true;
        } else {
            lVar = this;
            str2 = str;
            z7 = false;
        }
        createAndSwitchToNewUser$default(this, z7, null, 2, null);
        F2.e.enqueue$default(lVar.operationRepo, new U3.e(lVar.configModel.getAppId(), ((T3.a) lVar.identityModelStore.getModel()).getOnesignalId(), ((T3.a) lVar.identityModelStore.getModel()).getExternalId(), str2), false, 2, null);
        H2.d.clearLegacyPlayerId(lVar.preferencesService);
    }

    public final void createAndSwitchToNewUser(boolean z7, Function2<? super T3.a, ? super com.onesignal.user.internal.properties.a, Unit> function2) {
        Object obj;
        String createLocalId;
        String str;
        Y3.f fVar;
        com.onesignal.debug.internal.logging.b.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String createLocalId2 = this.idManager.createLocalId();
        T3.a aVar = new T3.a();
        aVar.setOnesignalId(createLocalId2);
        com.onesignal.user.internal.properties.a aVar2 = new com.onesignal.user.internal.properties.a();
        aVar2.setOnesignalId(createLocalId2);
        if (function2 != null) {
            function2.invoke(aVar, aVar2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.a(((Y3.d) obj).getId(), this.configModel.getPushSubscriptionId())) {
                    break;
                }
            }
        }
        Y3.d dVar = (Y3.d) obj;
        Y3.d dVar2 = new Y3.d();
        if (dVar == null || (createLocalId = dVar.getId()) == null) {
            createLocalId = this.idManager.createLocalId();
        }
        dVar2.setId(createLocalId);
        dVar2.setType(Y3.g.PUSH);
        dVar2.setOptedIn(dVar != null ? dVar.getOptedIn() : true);
        if (dVar == null || (str = dVar.getAddress()) == null) {
            str = "";
        }
        dVar2.setAddress(str);
        if (dVar == null || (fVar = dVar.getStatus()) == null) {
            fVar = Y3.f.NO_PERMISSION;
        }
        dVar2.setStatus(fVar);
        dVar2.setSdk(this.oneSignalUtils.getSdkVersion());
        String str2 = this.deviceOS;
        if (str2 == null) {
            str2 = "";
        }
        dVar2.setDeviceOS(str2);
        String str3 = this.carrierName;
        if (str3 == null) {
            str3 = "";
        }
        dVar2.setCarrier(str3);
        String appVersion = this.androidUtils.getAppVersion((Context) this.appContextProvider.invoke());
        dVar2.setAppVersion(appVersion != null ? appVersion : "");
        this.configModel.setPushSubscriptionId(dVar2.getId());
        arrayList.add(dVar2);
        this.subscriptionModelStore.clear("NO_PROPOGATE");
        com.onesignal.common.modeling.e.replace$default(this.identityModelStore, aVar, null, 2, null);
        com.onesignal.common.modeling.e.replace$default(this.propertiesModelStore, aVar2, null, 2, null);
        if (z7) {
            this.subscriptionModelStore.replaceAll(arrayList, "NO_PROPOGATE");
        } else {
            com.onesignal.common.modeling.b.replaceAll$default(this.subscriptionModelStore, arrayList, null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createPushSubscriptionFromLegacySync(String legacyPlayerId, JSONObject legacyUserSyncJSON, com.onesignal.core.internal.config.b configModel, Y3.e subscriptionModelStore, Context appContext) {
        boolean z7;
        String safeString;
        Y3.f fVar;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(legacyPlayerId, "legacyPlayerId");
        Intrinsics.checkNotNullParameter(legacyUserSyncJSON, "legacyUserSyncJSON");
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        Intrinsics.checkNotNullParameter(subscriptionModelStore, "subscriptionModelStore");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Integer safeInt = com.onesignal.common.e.safeInt(legacyUserSyncJSON, "notification_types");
        Y3.d dVar = new Y3.d();
        dVar.setId(legacyPlayerId);
        dVar.setType(Y3.g.PUSH);
        int value = Y3.f.NO_PERMISSION.getValue();
        if (safeInt == null || safeInt.intValue() != value) {
            int value2 = Y3.f.UNSUBSCRIBE.getValue();
            if (safeInt == null || safeInt.intValue() != value2) {
                z7 = true;
                dVar.setOptedIn(z7);
                safeString = com.onesignal.common.e.safeString(legacyUserSyncJSON, "identifier");
                if (safeString == null) {
                    safeString = "";
                }
                dVar.setAddress(safeString);
                if (safeInt != null) {
                    fVar = Y3.f.Companion.fromInt(safeInt.intValue());
                }
                fVar = Y3.f.SUBSCRIBED;
                dVar.setStatus(fVar);
                dVar.setSdk(com.onesignal.common.h.INSTANCE.getSdkVersion());
                str = this.deviceOS;
                if (str == null) {
                    str = "";
                }
                dVar.setDeviceOS(str);
                str2 = this.carrierName;
                if (str2 == null) {
                    str2 = "";
                }
                dVar.setCarrier(str2);
                String appVersion = AndroidUtils.INSTANCE.getAppVersion(appContext);
                dVar.setAppVersion(appVersion != null ? appVersion : "");
                configModel.setPushSubscriptionId(legacyPlayerId);
                subscriptionModelStore.add(dVar, "NO_PROPOGATE");
                return true;
            }
        }
        z7 = false;
        dVar.setOptedIn(z7);
        safeString = com.onesignal.common.e.safeString(legacyUserSyncJSON, "identifier");
        if (safeString == null) {
        }
        dVar.setAddress(safeString);
        if (safeInt != null) {
        }
        fVar = Y3.f.SUBSCRIBED;
        dVar.setStatus(fVar);
        dVar.setSdk(com.onesignal.common.h.INSTANCE.getSdkVersion());
        str = this.deviceOS;
        if (str == null) {
        }
        dVar.setDeviceOS(str);
        str2 = this.carrierName;
        if (str2 == null) {
        }
        dVar.setCarrier(str2);
        String appVersion2 = AndroidUtils.INSTANCE.getAppVersion(appContext);
        dVar.setAppVersion(appVersion2 != null ? appVersion2 : "");
        configModel.setPushSubscriptionId(legacyPlayerId);
        subscriptionModelStore.add(dVar, "NO_PROPOGATE");
        return true;
    }

    public final void initUser(boolean z7) {
        if (!z7 && T3.c.hasOneSignalId(this.identityModelStore)) {
            com.onesignal.debug.internal.logging.b.debug$default("initWithContext: using cached user " + ((T3.a) this.identityModelStore.getModel()).getOnesignalId(), null, 2, null);
        } else {
            String legacyPlayerId = H2.d.getLegacyPlayerId(this.preferencesService);
            if (legacyPlayerId == null) {
                createNewUser();
            } else {
                migrateFromLegacyUser(legacyPlayerId);
            }
        }
    }

    public /* synthetic */ l(H2.b bVar, F2.f fVar, t2.d dVar, com.onesignal.common.d dVar2, T3.b bVar2, com.onesignal.user.internal.properties.b bVar3, Y3.e eVar, com.onesignal.core.internal.config.b bVar4, com.onesignal.common.h hVar, String str, String str2, AndroidUtils androidUtils, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, fVar, dVar, (i2 & 8) != 0 ? com.onesignal.common.d.INSTANCE : dVar2, bVar2, bVar3, eVar, bVar4, (i2 & 256) != 0 ? com.onesignal.common.h.INSTANCE : hVar, (i2 & 512) != 0 ? null : str, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? AndroidUtils.INSTANCE : androidUtils, function0);
    }
}
