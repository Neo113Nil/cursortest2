package com.onesignal.user.internal.builduser.impl;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.Operation;
import com.onesignal.user.internal.builduser.IRebuildUserService;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.CreateSubscriptionOperation;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.operations.RefreshUserOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class RebuildUserService implements IRebuildUserService {
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final PropertiesModelStore _propertiesModelStore;
    private final SubscriptionModelStore _subscriptionsModelStore;

    public RebuildUserService(IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, SubscriptionModelStore _subscriptionsModelStore, ConfigModelStore _configModelStore) {
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_subscriptionsModelStore, "_subscriptionsModelStore");
        i.e(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._subscriptionsModelStore = _subscriptionsModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // com.onesignal.user.internal.builduser.IRebuildUserService
    public List<Operation> getRebuildOperationsIfCurrentUser(String appId, String onesignalId) {
        i.e(appId, "appId");
        i.e(onesignalId, "onesignalId");
        IdentityModel identityModel = new IdentityModel();
        Object obj = null;
        identityModel.initializeFromModel(null, this._identityModelStore.getModel());
        new PropertiesModel().initializeFromModel(null, this._propertiesModelStore.getModel());
        ArrayList arrayList = new ArrayList();
        for (TModel tmodel : this._subscriptionsModelStore.list()) {
            SubscriptionModel subscriptionModel = new SubscriptionModel();
            subscriptionModel.initializeFromModel(null, tmodel);
            arrayList.add(subscriptionModel);
        }
        if (!i.a(identityModel.getOnesignalId(), onesignalId)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new LoginUserOperation(appId, onesignalId, identityModel.getExternalId(), null, 8, null));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i.a(((SubscriptionModel) next).getId(), this._configModelStore.getModel().getPushSubscriptionId())) {
                obj = next;
                break;
            }
        }
        SubscriptionModel subscriptionModel2 = (SubscriptionModel) obj;
        if (subscriptionModel2 != null) {
            arrayList2.add(new CreateSubscriptionOperation(appId, onesignalId, identityModel.getExternalId(), subscriptionModel2.getId(), subscriptionModel2.getType(), subscriptionModel2.getOptedIn(), subscriptionModel2.getAddress(), subscriptionModel2.getStatus()));
        }
        arrayList2.add(new RefreshUserOperation(appId, onesignalId, identityModel.getExternalId()));
        return arrayList2;
    }
}
