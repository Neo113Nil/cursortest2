package com.onesignal.user.internal;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import f2.AbstractC0367d;
import f2.InterfaceC0365b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import r3.C0617a;
import x5.InterfaceC0732a;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class l {
    private final AndroidUtils androidUtils;
    private final InterfaceC0732a appContextProvider;
    private final String carrierName;
    private final com.onesignal.core.internal.config.b configModel;
    private final String deviceOS;
    private final com.onesignal.common.d idManager;
    private final r3.b identityModelStore;
    private final com.onesignal.common.h oneSignalUtils;
    private final d2.f operationRepo;
    private final InterfaceC0365b preferencesService;
    private final com.onesignal.user.internal.properties.b propertiesModelStore;
    private final R1.d services;
    private final w3.e subscriptionModelStore;

    public l(InterfaceC0365b preferencesService, d2.f operationRepo, R1.d services, com.onesignal.common.d idManager, r3.b identityModelStore, com.onesignal.user.internal.properties.b propertiesModelStore, w3.e subscriptionModelStore, com.onesignal.core.internal.config.b configModel, com.onesignal.common.h oneSignalUtils, String str, String str2, AndroidUtils androidUtils, InterfaceC0732a appContextProvider) {
        kotlin.jvm.internal.i.e(preferencesService, "preferencesService");
        kotlin.jvm.internal.i.e(operationRepo, "operationRepo");
        kotlin.jvm.internal.i.e(services, "services");
        kotlin.jvm.internal.i.e(idManager, "idManager");
        kotlin.jvm.internal.i.e(identityModelStore, "identityModelStore");
        kotlin.jvm.internal.i.e(propertiesModelStore, "propertiesModelStore");
        kotlin.jvm.internal.i.e(subscriptionModelStore, "subscriptionModelStore");
        kotlin.jvm.internal.i.e(configModel, "configModel");
        kotlin.jvm.internal.i.e(oneSignalUtils, "oneSignalUtils");
        kotlin.jvm.internal.i.e(androidUtils, "androidUtils");
        kotlin.jvm.internal.i.e(appContextProvider, "appContextProvider");
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

    public static /* synthetic */ void createAndSwitchToNewUser$default(l lVar, boolean z5, InterfaceC0747p interfaceC0747p, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        if ((i7 & 2) != 0) {
            interfaceC0747p = null;
        }
        lVar.createAndSwitchToNewUser(z5, interfaceC0747p);
    }

    private final void createNewUser() {
        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
        createAndSwitchToNewUser$default(this, false, null, 3, null);
        d2.e.enqueue$default(this.operationRepo, new s3.f(this.configModel.getAppId(), ((C0617a) this.identityModelStore.getModel()).getOnesignalId(), ((C0617a) this.identityModelStore.getModel()).getExternalId(), null, 8, null), false, 2, null);
    }

    private final void migrateFromLegacyUser(String str) {
        l lVar;
        String str2;
        boolean z5;
        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating user linked to subscription " + str, null, 2, null);
        String legacyUserSyncValues = AbstractC0367d.getLegacyUserSyncValues(this.preferencesService);
        if (legacyUserSyncValues != null) {
            lVar = this;
            str2 = str;
            lVar.createPushSubscriptionFromLegacySync(str2, new JSONObject(legacyUserSyncValues), this.configModel, this.subscriptionModelStore, ((T1.f) this.services.getService(T1.f.class)).getAppContext());
            z5 = true;
        } else {
            lVar = this;
            str2 = str;
            z5 = false;
        }
        createAndSwitchToNewUser$default(this, z5, null, 2, null);
        d2.e.enqueue$default(lVar.operationRepo, new s3.e(lVar.configModel.getAppId(), ((C0617a) lVar.identityModelStore.getModel()).getOnesignalId(), ((C0617a) lVar.identityModelStore.getModel()).getExternalId(), str2), false, 2, null);
        AbstractC0367d.clearLegacyPlayerId(lVar.preferencesService);
    }

    public final void createAndSwitchToNewUser(boolean z5, InterfaceC0747p interfaceC0747p) {
        Object obj;
        String createLocalId;
        String str;
        w3.f fVar;
        com.onesignal.debug.internal.logging.b.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String createLocalId2 = this.idManager.createLocalId();
        C0617a c0617a = new C0617a();
        c0617a.setOnesignalId(createLocalId2);
        com.onesignal.user.internal.properties.a aVar = new com.onesignal.user.internal.properties.a();
        aVar.setOnesignalId(createLocalId2);
        if (interfaceC0747p != null) {
            interfaceC0747p.invoke(c0617a, aVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.i.a(((w3.d) obj).getId(), this.configModel.getPushSubscriptionId())) {
                    break;
                }
            }
        }
        w3.d dVar = (w3.d) obj;
        w3.d dVar2 = new w3.d();
        if (dVar == null || (createLocalId = dVar.getId()) == null) {
            createLocalId = this.idManager.createLocalId();
        }
        dVar2.setId(createLocalId);
        dVar2.setType(w3.g.PUSH);
        dVar2.setOptedIn(dVar != null ? dVar.getOptedIn() : true);
        if (dVar == null || (str = dVar.getAddress()) == null) {
            str = "";
        }
        dVar2.setAddress(str);
        if (dVar == null || (fVar = dVar.getStatus()) == null) {
            fVar = w3.f.NO_PERMISSION;
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
        com.onesignal.common.modeling.e.replace$default(this.identityModelStore, c0617a, null, 2, null);
        com.onesignal.common.modeling.e.replace$default(this.propertiesModelStore, aVar, null, 2, null);
        if (z5) {
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
    public final boolean createPushSubscriptionFromLegacySync(String legacyPlayerId, JSONObject legacyUserSyncJSON, com.onesignal.core.internal.config.b configModel, w3.e subscriptionModelStore, Context appContext) {
        boolean z5;
        String safeString;
        w3.f fVar;
        String str;
        String str2;
        kotlin.jvm.internal.i.e(legacyPlayerId, "legacyPlayerId");
        kotlin.jvm.internal.i.e(legacyUserSyncJSON, "legacyUserSyncJSON");
        kotlin.jvm.internal.i.e(configModel, "configModel");
        kotlin.jvm.internal.i.e(subscriptionModelStore, "subscriptionModelStore");
        kotlin.jvm.internal.i.e(appContext, "appContext");
        Integer safeInt = com.onesignal.common.e.safeInt(legacyUserSyncJSON, "notification_types");
        w3.d dVar = new w3.d();
        dVar.setId(legacyPlayerId);
        dVar.setType(w3.g.PUSH);
        int value = w3.f.NO_PERMISSION.getValue();
        if (safeInt == null || safeInt.intValue() != value) {
            int value2 = w3.f.UNSUBSCRIBE.getValue();
            if (safeInt == null || safeInt.intValue() != value2) {
                z5 = true;
                dVar.setOptedIn(z5);
                safeString = com.onesignal.common.e.safeString(legacyUserSyncJSON, "identifier");
                if (safeString == null) {
                    safeString = "";
                }
                dVar.setAddress(safeString);
                if (safeInt != null) {
                    fVar = w3.f.Companion.fromInt(safeInt.intValue());
                }
                fVar = w3.f.SUBSCRIBED;
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
        z5 = false;
        dVar.setOptedIn(z5);
        safeString = com.onesignal.common.e.safeString(legacyUserSyncJSON, "identifier");
        if (safeString == null) {
        }
        dVar.setAddress(safeString);
        if (safeInt != null) {
        }
        fVar = w3.f.SUBSCRIBED;
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

    public final void initUser(boolean z5) {
        if (!z5 && r3.c.hasOneSignalId(this.identityModelStore)) {
            com.onesignal.debug.internal.logging.b.debug$default("initWithContext: using cached user " + ((C0617a) this.identityModelStore.getModel()).getOnesignalId(), null, 2, null);
        } else {
            String legacyPlayerId = AbstractC0367d.getLegacyPlayerId(this.preferencesService);
            if (legacyPlayerId == null) {
                createNewUser();
            } else {
                migrateFromLegacyUser(legacyPlayerId);
            }
        }
    }

    public /* synthetic */ l(InterfaceC0365b interfaceC0365b, d2.f fVar, R1.d dVar, com.onesignal.common.d dVar2, r3.b bVar, com.onesignal.user.internal.properties.b bVar2, w3.e eVar, com.onesignal.core.internal.config.b bVar3, com.onesignal.common.h hVar, String str, String str2, AndroidUtils androidUtils, InterfaceC0732a interfaceC0732a, int i7, kotlin.jvm.internal.e eVar2) {
        this(interfaceC0365b, fVar, dVar, (i7 & 8) != 0 ? com.onesignal.common.d.INSTANCE : dVar2, bVar, bVar2, eVar, bVar3, (i7 & 256) != 0 ? com.onesignal.common.h.INSTANCE : hVar, (i7 & 512) != 0 ? null : str, (i7 & 1024) != 0 ? null : str2, (i7 & 2048) != 0 ? AndroidUtils.INSTANCE : androidUtils, interfaceC0732a);
    }
}
