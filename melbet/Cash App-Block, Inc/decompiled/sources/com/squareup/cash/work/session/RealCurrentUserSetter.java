package com.squareup.cash.work.session;

import android.content.SharedPreferences;
import androidx.room.Room;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsr;
import com.google.mlkit.vision.text.internal.zzr;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.api.ProductionApiModule$Companion$createTreelotService$1;
import com.squareup.cash.onboarding.backend.OnboardingFlowType;
import com.squareup.cash.support.incidents.backend.real.RealIncidentsService;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.cash.tax.service.TaxExperienceService;
import com.squareup.cash.treehouse.android.TreehouseModule;
import com.squareup.cash.treehouse.android.apps.financialservices.RealFinancialServicesBridge;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigSyncer;
import com.squareup.cash.treehouse.android.platform.AndroidPlatformServiceFactory;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.cash.work.tinygraph.EntityStore;
import com.squareup.cash.work.tinygraph.EntityStoreModule;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.cashvoice.verification.app.v1.VerificationAppService;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.incidentalerts.app.v1.IncidentAlertsService;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.RealShareResultsReceiver;
import com.squareup.util.android.ShareModule$Companion;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import net.oneformapp.helper.HelperFunctions;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class RealCurrentUserSetter {
    public final SquareAccountStore squareAccountStore;

    public RealCurrentUserSetter(SquareAccountStore squareAccountStore) {
        this.squareAccountStore = squareAccountStore;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final DoubleCheck squareAccountStore;

        public MetroFactory(TreehouseModule treehouseModule, DoubleCheck doubleCheck) {
            this.$r8$classId = 16;
            this.squareAccountStore = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SharedPreferencesKeyValue BooleanKeyValue;
            SharedPreferencesKeyValue BooleanKeyValue2;
            SharedPreferencesKeyValue BooleanKeyValue3;
            int i = this.$r8$classId;
            int i2 = 29;
            DoubleCheck doubleCheck = this.squareAccountStore;
            switch (i) {
                case 0:
                    SquareAccountStore squareAccountStore = (SquareAccountStore) doubleCheck.getValue();
                    squareAccountStore.getClass();
                    return new RealCurrentUserSetter(squareAccountStore);
                case 1:
                    SharedPreferences sharedPreferences = (SharedPreferences) doubleCheck.getValue();
                    sharedPreferences.getClass();
                    return HelperFunctions.provideFirstCustomSellOrderSetting$presenters(sharedPreferences);
                case 2:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) doubleCheck.getValue();
                    sharedPreferences2.getClass();
                    return new EnumPreference(sharedPreferences2, OnboardingFlowType.class, "onboarding_flow_type", OnboardingFlowType.CLASSIC);
                case 3:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) doubleCheck.getValue();
                    featureFlagManager.getClass();
                    return new Error.Code.Companion(featureFlagManager);
                case 4:
                    SharedPreferences sharedPreferences3 = (SharedPreferences) doubleCheck.getValue();
                    sharedPreferences3.getClass();
                    return zzagy.provideHypeAnimationLastShownTimestamp(sharedPreferences3);
                case 5:
                    SharedPreferences sharedPreferences4 = (SharedPreferences) doubleCheck.getValue();
                    sharedPreferences4.getClass();
                    return zzagy.provideLowDiskSpaceAlertShownTimestampPreference(sharedPreferences4);
                case 6:
                    SyncValueReader syncValueReader = (SyncValueReader) doubleCheck.getValue();
                    syncValueReader.getClass();
                    return new JCAContext(syncValueReader, 24);
                case 7:
                    AppService appService = (AppService) doubleCheck.getValue();
                    appService.getClass();
                    return new zzr(appService, 28);
                case 8:
                    CustomerSearchClientService customerSearchClientService = (CustomerSearchClientService) doubleCheck.getValue();
                    customerSearchClientService.getClass();
                    return new SizeMap(customerSearchClientService, 27);
                case 9:
                    SharedPreferences sharedPreferences5 = (SharedPreferences) doubleCheck.getValue();
                    sharedPreferences5.getClass();
                    BooleanKeyValue = Room.BooleanKeyValue(sharedPreferences5, "SEEN_DETAILS_FOR_INN", false, false);
                    return BooleanKeyValue;
                case 10:
                    SharedPreferences sharedPreferences6 = (SharedPreferences) doubleCheck.getValue();
                    sharedPreferences6.getClass();
                    BooleanKeyValue2 = Room.BooleanKeyValue(sharedPreferences6, "SEEN_AUTOFILL_SHEET", false, false);
                    return BooleanKeyValue2;
                case 11:
                    SharedPreferences sharedPreferences7 = (SharedPreferences) doubleCheck.getValue();
                    sharedPreferences7.getClass();
                    BooleanKeyValue3 = Room.BooleanKeyValue(sharedPreferences7, "stablecoin-onboarding-pref", false, true);
                    return BooleanKeyValue3;
                case 12:
                    VerificationAppService verificationAppService = (VerificationAppService) doubleCheck.getValue();
                    verificationAppService.getClass();
                    return new zzr(verificationAppService, i2);
                case 13:
                    IncidentAlertsService incidentAlertsService = (IncidentAlertsService) doubleCheck.getValue();
                    incidentAlertsService.getClass();
                    return new RealIncidentsService(incidentAlertsService);
                case 14:
                    TaxExperienceService taxExperienceService = (TaxExperienceService) doubleCheck.getValue();
                    taxExperienceService.getClass();
                    return new RealTaxEntryTileUserDataProvider(taxExperienceService);
                case 15:
                    SyncValueReader syncValueReader2 = (SyncValueReader) doubleCheck.getValue();
                    syncValueReader2.getClass();
                    return new SizeMap(syncValueReader2, i2);
                case 16:
                    AndroidPlatformServiceFactory androidPlatformServiceFactory = (AndroidPlatformServiceFactory) doubleCheck.getValue();
                    androidPlatformServiceFactory.getClass();
                    return androidPlatformServiceFactory;
                case 17:
                    PaychecksAppService paychecksAppService = (PaychecksAppService) doubleCheck.getValue();
                    paychecksAppService.getClass();
                    return new RealFinancialServicesBridge(paychecksAppService);
                case 18:
                    ProductionApiModule$Companion$createTreelotService$1 productionApiModule$Companion$createTreelotService$1 = (ProductionApiModule$Companion$createTreelotService$1) doubleCheck.getValue();
                    productionApiModule$Companion$createTreelotService$1.getClass();
                    return new RealTreehouseConfigSyncer(productionApiModule$Companion$createTreelotService$1);
                case 19:
                    TimecardsService timecardsService = (TimecardsService) doubleCheck.getValue();
                    timecardsService.getClass();
                    return new RealClockInRepository(timecardsService);
                case 20:
                    Retrofit retrofit = (Retrofit) doubleCheck.getValue();
                    retrofit.getClass();
                    return zzsr.providePayrollWebService(retrofit);
                case 21:
                    EntityStore entityStore = (EntityStore) doubleCheck.getValue();
                    entityStore.getClass();
                    return EntityStoreModule.provideEntityEventFlow(entityStore);
                default:
                    RealShareResultsReceiver realShareResultsReceiver = (RealShareResultsReceiver) doubleCheck.getValue();
                    realShareResultsReceiver.getClass();
                    return ShareModule$Companion.provideShareResults(realShareResultsReceiver);
            }
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, int i) {
            this.$r8$classId = i;
            this.squareAccountStore = doubleCheck;
        }
    }
}
