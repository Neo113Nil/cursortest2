package com.onesignal.user.internal;

import android.content.Context;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.IDManager;
import com.onesignal.common.JSONObjectExtensionsKt;
import com.onesignal.common.OneSignalUtils;
import com.onesignal.common.modeling.IModelStore;
import com.onesignal.common.modeling.ISingletonModelStore;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.services.ServiceProvider;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferencesExtensionV4Kt;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.identity.IdentityModelStoreKt;
import com.onesignal.user.internal.operations.LoginUserFromSubscriptionOperation;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: UserSwitcher.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\u0010\u001cJL\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2:\b\u0002\u0010!\u001a4\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110'¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u001e\u0018\u00010\"J\b\u0010)\u001a\u00020\u001eH\u0002J.\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u001bJ\u000e\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020 J\u0010\u00101\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u0015H\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/onesignal/user/internal/UserSwitcher;", "", "preferencesService", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "operationRepo", "Lcom/onesignal/core/internal/operations/IOperationRepo;", "services", "Lcom/onesignal/common/services/ServiceProvider;", "idManager", "Lcom/onesignal/common/IDManager;", "identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "propertiesModelStore", "Lcom/onesignal/user/internal/properties/PropertiesModelStore;", "subscriptionModelStore", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "configModel", "Lcom/onesignal/core/internal/config/ConfigModel;", "oneSignalUtils", "Lcom/onesignal/common/OneSignalUtils;", "carrierName", "", "deviceOS", "androidUtils", "Lcom/onesignal/common/AndroidUtils;", "appContextProvider", "Lkotlin/Function0;", "Landroid/content/Context;", "(Lcom/onesignal/core/internal/preferences/IPreferencesService;Lcom/onesignal/core/internal/operations/IOperationRepo;Lcom/onesignal/common/services/ServiceProvider;Lcom/onesignal/common/IDManager;Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/properties/PropertiesModelStore;Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;Lcom/onesignal/core/internal/config/ConfigModel;Lcom/onesignal/common/OneSignalUtils;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/common/AndroidUtils;Lkotlin/jvm/functions/Function0;)V", "createAndSwitchToNewUser", "", "suppressBackendOperation", "", "modify", "Lkotlin/Function2;", "Lcom/onesignal/user/internal/identity/IdentityModel;", "Lkotlin/ParameterName;", "name", "identityModel", "Lcom/onesignal/user/internal/properties/PropertiesModel;", "propertiesModel", "createNewUser", "createPushSubscriptionFromLegacySync", "legacyPlayerId", "legacyUserSyncJSON", "Lorg/json/JSONObject;", "appContext", "initUser", "forceCreateUser", "migrateFromLegacyUser", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserSwitcher {
    private final AndroidUtils androidUtils;
    private final Function0<Context> appContextProvider;
    private final String carrierName;
    private final ConfigModel configModel;
    private final String deviceOS;
    private final IDManager idManager;
    private final IdentityModelStore identityModelStore;
    private final OneSignalUtils oneSignalUtils;
    private final IOperationRepo operationRepo;
    private final IPreferencesService preferencesService;
    private final PropertiesModelStore propertiesModelStore;
    private final ServiceProvider services;
    private final SubscriptionModelStore subscriptionModelStore;

    /* JADX WARN: Multi-variable type inference failed */
    public UserSwitcher(IPreferencesService preferencesService, IOperationRepo operationRepo, ServiceProvider services, IDManager idManager, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, SubscriptionModelStore subscriptionModelStore, ConfigModel configModel, OneSignalUtils oneSignalUtils, String str, String str2, AndroidUtils androidUtils, Function0<? extends Context> appContextProvider) {
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

    public /* synthetic */ UserSwitcher(IPreferencesService iPreferencesService, IOperationRepo iOperationRepo, ServiceProvider serviceProvider, IDManager iDManager, IdentityModelStore identityModelStore, PropertiesModelStore propertiesModelStore, SubscriptionModelStore subscriptionModelStore, ConfigModel configModel, OneSignalUtils oneSignalUtils, String str, String str2, AndroidUtils androidUtils, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iPreferencesService, iOperationRepo, serviceProvider, (i & 8) != 0 ? IDManager.INSTANCE : iDManager, identityModelStore, propertiesModelStore, subscriptionModelStore, configModel, (i & 256) != 0 ? OneSignalUtils.INSTANCE : oneSignalUtils, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? AndroidUtils.INSTANCE : androidUtils, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createAndSwitchToNewUser$default(UserSwitcher userSwitcher, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        userSwitcher.createAndSwitchToNewUser(z, function2);
    }

    public final void createAndSwitchToNewUser(boolean suppressBackendOperation, Function2<? super IdentityModel, ? super PropertiesModel, Unit> modify) {
        Object obj;
        String createLocalId;
        String str;
        SubscriptionStatus subscriptionStatus;
        Logging.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String createLocalId2 = this.idManager.createLocalId();
        IdentityModel identityModel = new IdentityModel();
        identityModel.setOnesignalId(createLocalId2);
        PropertiesModel propertiesModel = new PropertiesModel();
        propertiesModel.setOnesignalId(createLocalId2);
        if (modify != null) {
            modify.invoke(identityModel, propertiesModel);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((SubscriptionModel) obj).getId(), this.configModel.getPushSubscriptionId())) {
                    break;
                }
            }
        }
        SubscriptionModel subscriptionModel = (SubscriptionModel) obj;
        SubscriptionModel subscriptionModel2 = new SubscriptionModel();
        if (subscriptionModel == null || (createLocalId = subscriptionModel.getId()) == null) {
            createLocalId = this.idManager.createLocalId();
        }
        subscriptionModel2.setId(createLocalId);
        subscriptionModel2.setType(SubscriptionType.PUSH);
        subscriptionModel2.setOptedIn(subscriptionModel != null ? subscriptionModel.getOptedIn() : true);
        if (subscriptionModel == null || (str = subscriptionModel.getAddress()) == null) {
            str = "";
        }
        subscriptionModel2.setAddress(str);
        if (subscriptionModel == null || (subscriptionStatus = subscriptionModel.getStatus()) == null) {
            subscriptionStatus = SubscriptionStatus.NO_PERMISSION;
        }
        subscriptionModel2.setStatus(subscriptionStatus);
        subscriptionModel2.setSdk(this.oneSignalUtils.getSdkVersion());
        String str2 = this.deviceOS;
        if (str2 == null) {
            str2 = "";
        }
        subscriptionModel2.setDeviceOS(str2);
        String str3 = this.carrierName;
        if (str3 == null) {
            str3 = "";
        }
        subscriptionModel2.setCarrier(str3);
        String appVersion = this.androidUtils.getAppVersion(this.appContextProvider.invoke());
        subscriptionModel2.setAppVersion(appVersion != null ? appVersion : "");
        this.configModel.setPushSubscriptionId(subscriptionModel2.getId());
        arrayList.add(subscriptionModel2);
        this.subscriptionModelStore.clear(ModelChangeTags.NO_PROPOGATE);
        ISingletonModelStore.DefaultImpls.replace$default(this.identityModelStore, identityModel, null, 2, null);
        ISingletonModelStore.DefaultImpls.replace$default(this.propertiesModelStore, propertiesModel, null, 2, null);
        if (suppressBackendOperation) {
            this.subscriptionModelStore.replaceAll(arrayList, ModelChangeTags.NO_PROPOGATE);
        } else {
            IModelStore.DefaultImpls.replaceAll$default(this.subscriptionModelStore, arrayList, null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createPushSubscriptionFromLegacySync(String legacyPlayerId, JSONObject legacyUserSyncJSON, ConfigModel configModel, SubscriptionModelStore subscriptionModelStore, Context appContext) {
        boolean z;
        String safeString;
        SubscriptionStatus subscriptionStatus;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(legacyPlayerId, "legacyPlayerId");
        Intrinsics.checkNotNullParameter(legacyUserSyncJSON, "legacyUserSyncJSON");
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        Intrinsics.checkNotNullParameter(subscriptionModelStore, "subscriptionModelStore");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Integer safeInt = JSONObjectExtensionsKt.safeInt(legacyUserSyncJSON, "notification_types");
        SubscriptionModel subscriptionModel = new SubscriptionModel();
        subscriptionModel.setId(legacyPlayerId);
        subscriptionModel.setType(SubscriptionType.PUSH);
        int value = SubscriptionStatus.NO_PERMISSION.getValue();
        if (safeInt == null || safeInt.intValue() != value) {
            int value2 = SubscriptionStatus.UNSUBSCRIBE.getValue();
            if (safeInt == null || safeInt.intValue() != value2) {
                z = true;
                subscriptionModel.setOptedIn(z);
                safeString = JSONObjectExtensionsKt.safeString(legacyUserSyncJSON, "identifier");
                if (safeString == null) {
                    safeString = "";
                }
                subscriptionModel.setAddress(safeString);
                if (safeInt != null) {
                    subscriptionStatus = SubscriptionStatus.INSTANCE.fromInt(safeInt.intValue());
                }
                subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
                subscriptionModel.setStatus(subscriptionStatus);
                subscriptionModel.setSdk(OneSignalUtils.INSTANCE.getSdkVersion());
                str = this.deviceOS;
                if (str == null) {
                    str = "";
                }
                subscriptionModel.setDeviceOS(str);
                str2 = this.carrierName;
                if (str2 == null) {
                    str2 = "";
                }
                subscriptionModel.setCarrier(str2);
                String appVersion = AndroidUtils.INSTANCE.getAppVersion(appContext);
                subscriptionModel.setAppVersion(appVersion != null ? appVersion : "");
                configModel.setPushSubscriptionId(legacyPlayerId);
                subscriptionModelStore.add(subscriptionModel, ModelChangeTags.NO_PROPOGATE);
                return true;
            }
        }
        z = false;
        subscriptionModel.setOptedIn(z);
        safeString = JSONObjectExtensionsKt.safeString(legacyUserSyncJSON, "identifier");
        if (safeString == null) {
        }
        subscriptionModel.setAddress(safeString);
        if (safeInt != null) {
        }
        subscriptionStatus = SubscriptionStatus.SUBSCRIBED;
        subscriptionModel.setStatus(subscriptionStatus);
        subscriptionModel.setSdk(OneSignalUtils.INSTANCE.getSdkVersion());
        str = this.deviceOS;
        if (str == null) {
        }
        subscriptionModel.setDeviceOS(str);
        str2 = this.carrierName;
        if (str2 == null) {
        }
        subscriptionModel.setCarrier(str2);
        String appVersion2 = AndroidUtils.INSTANCE.getAppVersion(appContext);
        subscriptionModel.setAppVersion(appVersion2 != null ? appVersion2 : "");
        configModel.setPushSubscriptionId(legacyPlayerId);
        subscriptionModelStore.add(subscriptionModel, ModelChangeTags.NO_PROPOGATE);
        return true;
    }

    public final void initUser(boolean forceCreateUser) {
        if (forceCreateUser || !IdentityModelStoreKt.hasOneSignalId(this.identityModelStore)) {
            String legacyPlayerId = PreferencesExtensionV4Kt.getLegacyPlayerId(this.preferencesService);
            if (legacyPlayerId == null) {
                createNewUser();
                return;
            } else {
                migrateFromLegacyUser(legacyPlayerId);
                return;
            }
        }
        Logging.debug$default("initWithContext: using cached user " + this.identityModelStore.getModel().getOnesignalId(), null, 2, null);
    }

    private final void createNewUser() {
        Logging.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
        createAndSwitchToNewUser$default(this, false, null, 3, null);
        IOperationRepo.DefaultImpls.enqueue$default(this.operationRepo, new LoginUserOperation(this.configModel.getAppId(), this.identityModelStore.getModel().getOnesignalId(), this.identityModelStore.getModel().getExternalId(), null, 8, null), false, 2, null);
    }

    private final void migrateFromLegacyUser(String legacyPlayerId) {
        UserSwitcher userSwitcher;
        String str;
        boolean z;
        Logging.debug$default("initWithContext: creating user linked to subscription " + legacyPlayerId, null, 2, null);
        String legacyUserSyncValues = PreferencesExtensionV4Kt.getLegacyUserSyncValues(this.preferencesService);
        if (legacyUserSyncValues != null) {
            userSwitcher = this;
            str = legacyPlayerId;
            userSwitcher.createPushSubscriptionFromLegacySync(str, new JSONObject(legacyUserSyncValues), this.configModel, this.subscriptionModelStore, ((IApplicationService) this.services.getService(IApplicationService.class)).getAppContext());
            z = true;
        } else {
            userSwitcher = this;
            str = legacyPlayerId;
            z = false;
        }
        createAndSwitchToNewUser$default(this, z, null, 2, null);
        IOperationRepo.DefaultImpls.enqueue$default(userSwitcher.operationRepo, new LoginUserFromSubscriptionOperation(userSwitcher.configModel.getAppId(), userSwitcher.identityModelStore.getModel().getOnesignalId(), userSwitcher.identityModelStore.getModel().getExternalId(), str), false, 2, null);
        PreferencesExtensionV4Kt.clearLegacyPlayerId(userSwitcher.preferencesService);
    }
}
