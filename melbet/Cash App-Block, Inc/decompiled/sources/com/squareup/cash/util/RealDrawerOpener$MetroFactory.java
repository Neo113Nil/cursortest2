package com.squareup.cash.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.Room;
import app.cash.local.service.LocalService;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsr;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.SandboxedDataModule$Companion$provideMoneyTabStateOnSignOutAction$1;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.presenters.LiteCashAppTagSyncTopicProvider;
import com.squareup.cash.webview.android.AndroidCookieManager;
import com.squareup.cash.webview.android.AndroidWebViewModule$Companion$provideCookieManagerOnAccountTeardownAction$1;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.cash.work.data.real.RealUserPrefs;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.cash.work.presenters.shift.geofence.GeofenceStateResolver;
import com.squareup.cash.work.service.real.CashAppServiceModule;
import com.squareup.cash.work.service.real.RealBrandDetailsService;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.session.RealSelectedMerchantSetter;
import com.squareup.cash.work.session.SquareAccountStore;
import com.squareup.cash.work.tinygraph.EntityStore;
import com.squareup.cash.work.tinygraph.EntityStoreModule;
import com.squareup.preferences.KeyValue;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Lazy;
import net.idrnd.face.iad.capture.internal.o0;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class RealDrawerOpener$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider balanceSnapshotManager;

    public /* synthetic */ RealDrawerOpener$MetroFactory(Provider provider, int i) {
        this.$r8$classId = i;
        this.balanceSnapshotManager = provider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 2;
        Provider provider = this.balanceSnapshotManager;
        switch (i) {
            case 0:
                RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) provider.invoke();
                realBalanceSnapshotManager.getClass();
                return new o0(realBalanceSnapshotManager, i2);
            case 1:
                Context context = (Context) provider.invoke();
                context.getClass();
                return new RealNetworkInfo(context);
            case 2:
                SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                syncValueReader.getClass();
                return new RealCashAppTagManager(syncValueReader);
            case 3:
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider.invoke();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? SyncTopic.CASH_LITE_CARD_UI_CONFIG : SyncTopic.CARD_UI_CONFIG;
            case 4:
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda02 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider.invoke();
                LiteCashAppTagSyncTopicProvider liteCashAppTagSyncTopicProvider = new LiteCashAppTagSyncTopicProvider(1);
                LiteCashAppTagSyncTopicProvider liteCashAppTagSyncTopicProvider2 = new LiteCashAppTagSyncTopicProvider(0);
                cashAppLiteReleaseModule$$ExternalSyntheticLambda02.getClass();
                return cashAppLiteReleaseModule$$ExternalSyntheticLambda02.f$0 ? liteCashAppTagSyncTopicProvider2 : liteCashAppTagSyncTopicProvider;
            case 5:
                SharedPreferences sharedPreferences = (SharedPreferences) provider.invoke();
                sharedPreferences.getClass();
                return Room.IntKeyValue$default(sharedPreferences, "wallet-last-viewed-payment-device-page");
            case 6:
                KeyValue keyValue = (KeyValue) provider.invoke();
                keyValue.getClass();
                return new SandboxedDataModule$Companion$provideMoneyTabStateOnSignOutAction$1(keyValue, 2);
            case 7:
                AndroidCookieManager androidCookieManager = (AndroidCookieManager) provider.invoke();
                androidCookieManager.getClass();
                return new AndroidWebViewModule$Companion$provideCookieManagerOnAccountTeardownAction$1(androidCookieManager, 0);
            case 8:
                RealClockInRepository realClockInRepository = (RealClockInRepository) provider.invoke();
                realClockInRepository.getClass();
                return new JCAContext(realClockInRepository, 28);
            case 9:
                RealUserPrefs realUserPrefs = (RealUserPrefs) provider.invoke();
                realUserPrefs.getClass();
                return new RealLastClockedInInfoUseCase(realUserPrefs);
            case 10:
                SharedPreferences sharedPreferences2 = (SharedPreferences) provider.invoke();
                sharedPreferences2.getClass();
                return new RealUserPrefs(sharedPreferences2);
            case 11:
                AndroidClock androidClock = (AndroidClock) provider.invoke();
                androidClock.getClass();
                return new ClockInStateResolver(androidClock);
            case 12:
                AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                androidStringManager.getClass();
                return new GeofenceStateResolver(androidStringManager);
            case 13:
                Retrofit retrofit = (Retrofit) provider.invoke();
                retrofit.getClass();
                return CashAppServiceModule.provideMultipassService(retrofit);
            case 14:
                LocalService localService = (LocalService) provider.invoke();
                localService.getClass();
                return new RealBrandDetailsService(localService);
            case 15:
                provider.getClass();
                return zzsq.provideCashProxyCallFactory(provider instanceof Lazy ? (Lazy) provider : new DoubleCheck(provider));
            case 16:
                provider.getClass();
                return zzsq.provideRegisterCallFactory(provider instanceof Lazy ? (Lazy) provider : new DoubleCheck(provider));
            case 17:
                Retrofit retrofit3 = (Retrofit) provider.invoke();
                retrofit3.getClass();
                return zzsr.provideLoginEssentialsService(retrofit3);
            case 18:
                Retrofit retrofit4 = (Retrofit) provider.invoke();
                retrofit4.getClass();
                return zzsr.providePasscodeService(retrofit4);
            case 19:
                Retrofit retrofit5 = (Retrofit) provider.invoke();
                retrofit5.getClass();
                return zzsr.providePayrollJsonService(retrofit5);
            case 20:
                Retrofit retrofit6 = (Retrofit) provider.invoke();
                retrofit6.getClass();
                return zzsr.providePayrollService(retrofit6);
            case 21:
                Retrofit retrofit7 = (Retrofit) provider.invoke();
                retrofit7.getClass();
                return zzsr.provideSchedulingService(retrofit7);
            case 22:
                Retrofit retrofit8 = (Retrofit) provider.invoke();
                retrofit8.getClass();
                return zzsr.provideTaxFormsService(retrofit8);
            case 23:
                Retrofit retrofit9 = (Retrofit) provider.invoke();
                retrofit9.getClass();
                return zzsr.provideTimecardsService(retrofit9);
            case 24:
                SquareAccountStore squareAccountStore = (SquareAccountStore) provider.invoke();
                squareAccountStore.getClass();
                return new RealCurrentUserProvider(squareAccountStore);
            case 25:
                SquareAccountStore squareAccountStore2 = (SquareAccountStore) provider.invoke();
                squareAccountStore2.getClass();
                return new RealSelectedMerchantProvider(squareAccountStore2);
            case 26:
                SquareAccountStore squareAccountStore3 = (SquareAccountStore) provider.invoke();
                squareAccountStore3.getClass();
                return new RealSelectedMerchantSetter(squareAccountStore3);
            case 27:
                SharedPreferences sharedPreferences3 = (SharedPreferences) provider.invoke();
                sharedPreferences3.getClass();
                return new SquareAccountStore(sharedPreferences3);
            case 28:
                EntityStore entityStore = (EntityStore) provider.invoke();
                entityStore.getClass();
                return EntityStoreModule.provideLocationDao(entityStore);
            default:
                EntityStore entityStore2 = (EntityStore) provider.invoke();
                entityStore2.getClass();
                return EntityStoreModule.provideMembershipDao(entityStore2);
        }
    }
}
