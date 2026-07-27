package com.onesignal.internal;

import android.content.Context;
import android.os.Build;
import com.onesignal.common.DeviceUtils;
import com.onesignal.common.services.ServiceProvider;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.user.internal.UserSwitcher;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalImp$userSwitcher$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalImp this$0;

    /* renamed from: com.onesignal.internal.OneSignalImp$userSwitcher$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1430a {
        final /* synthetic */ Context $appContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(0);
            this.$appContext = context;
        }

        @Override // t4.InterfaceC1430a
        public final Context invoke() {
            return this.$appContext;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$userSwitcher$2(OneSignalImp oneSignalImp) {
        super(0);
        this.this$0 = oneSignalImp;
    }

    @Override // t4.InterfaceC1430a
    public final UserSwitcher invoke() {
        ServiceProvider serviceProvider;
        IdentityModelStore identityModelStore;
        PropertiesModelStore propertiesModelStore;
        SubscriptionModelStore subscriptionModelStore;
        ConfigModel configModel;
        IPreferencesService preferencesService;
        IOperationRepo operationRepo;
        ServiceProvider serviceProvider2;
        serviceProvider = this.this$0.services;
        Context appContext = ((IApplicationService) serviceProvider.getService(IApplicationService.class)).getAppContext();
        identityModelStore = this.this$0.getIdentityModelStore();
        propertiesModelStore = this.this$0.getPropertiesModelStore();
        subscriptionModelStore = this.this$0.getSubscriptionModelStore();
        configModel = this.this$0.getConfigModel();
        String carrierName = DeviceUtils.INSTANCE.getCarrierName(appContext);
        String str = Build.VERSION.RELEASE;
        preferencesService = this.this$0.getPreferencesService();
        operationRepo = this.this$0.getOperationRepo();
        serviceProvider2 = this.this$0.services;
        return new UserSwitcher(preferencesService, operationRepo, serviceProvider2, null, identityModelStore, propertiesModelStore, subscriptionModelStore, configModel, null, carrierName, str, null, new AnonymousClass1(appContext), 2312, null);
    }
}
