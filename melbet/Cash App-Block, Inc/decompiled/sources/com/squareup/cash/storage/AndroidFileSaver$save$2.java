package com.squareup.cash.storage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.versioned.Versioned;
import coil3.ImageLoader$Builder;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionViewModel;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.api.AsyncResult;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.account.AccountConfigureDisablePasscode;
import com.squareup.cash.cdf.account.AccountConfigureEnablePasscode;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardPrimaryHalfSheetView;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardPrimaryHalfSheetViewSubpage;
import com.squareup.cash.cdf.prepurchasecard.Surface;
import com.squareup.cash.cdf.savingsfolder.SavingsFolderManageViewActivity;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.RealDeepLinking;
import com.squareup.cash.intent.Source;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$models$6$2;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter$models$6$3;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestTab;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.SelectedRecipient;
import com.squareup.cash.payments.views.MainPaymentView;
import com.squareup.cash.payments.views.MainPaymentViewState;
import com.squareup.cash.portfolio.graphs.RealInvestingCryptoGraphHeaderPresenter;
import com.squareup.cash.portfolio.graphs.RealInvestingCryptoGraphHeaderPresenter$models$1$1$1;
import com.squareup.cash.prepurchasecashcard.presenters.PrepurchaseCardPlanningState;
import com.squareup.cash.profile.presenters.personal.AliasesSectionPresenter$Result;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$models$2$1$1;
import com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$models$1$1$1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.reactions.treehouse.PassThroughLayout;
import com.squareup.cash.reactions.treehouse.ReactionDialogAnchorBinding;
import com.squareup.cash.reactions.viewmodels.ReactionViewModel;
import com.squareup.cash.reactions.views.ChooseReactionOverlay;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.presenters.LoadedSavingsModel;
import com.squareup.cash.savings.presenters.SavingsActivityItemEventDecorator;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.score.views.ScoreDisplayContent;
import com.squareup.cash.screens.Back;
import com.squareup.cash.security.presenters.BasePasswordPresenter;
import com.squareup.cash.security.presenters.PasswordEntryState;
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$SaveBiometricsLogIn;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.cash.session.backend.DoubleWriteSessionManager;
import com.squareup.cash.session.backend.DoubleWriteSessionManager$conditionalDoubleWrite$2$1$1;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.support.backend.api.RecentlyViewedNode;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.thing.Thing;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import okio.Okio;
import okio.Utf8;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AndroidFileSaver$save$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $displayName;
    public final /* synthetic */ Object $internalUri;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFileSaver$save$2(String str, RealQrCodesPresenter realQrCodesPresenter, QrCodeArgs qrCodeArgs, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 20;
        this.$displayName = str;
        this.this$0 = realQrCodesPresenter;
        this.$internalUri = qrCodeArgs;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$internalUri;
        Object obj3 = this.$displayName;
        switch (i) {
            case 0:
                return new AndroidFileSaver$save$2((AndroidFileSaver) this.this$0, (String) obj3, (Uri) obj2, continuation, 0);
            case 1:
                return new AndroidFileSaver$save$2((MutableState) this.this$0, (Set) obj3, (PaymentConfigurationPresenter) obj2, continuation, 1);
            case 2:
                AndroidFileSaver$save$2 androidFileSaver$save$2 = new AndroidFileSaver$save$2((PaymentConfigurationPresenter) obj3, (MutableState) obj2, continuation, 2);
                androidFileSaver$save$2.this$0 = obj;
                return androidFileSaver$save$2;
            case 3:
                AndroidFileSaver$save$2 androidFileSaver$save$22 = new AndroidFileSaver$save$2((PersonalizePaymentPresenter) obj3, (MutableState) obj2, continuation, 3);
                androidFileSaver$save$22.this$0 = obj;
                return androidFileSaver$save$22;
            case 4:
                return new AndroidFileSaver$save$2((Function1) this.this$0, (MainPaymentView) obj3, (MutableState) obj2, continuation, 4);
            case 5:
                AndroidFileSaver$save$2 androidFileSaver$save$23 = new AndroidFileSaver$save$2((Function1) obj3, (TextFieldState) obj2, continuation, 5);
                androidFileSaver$save$23.this$0 = obj;
                return androidFileSaver$save$23;
            case 6:
                return new AndroidFileSaver$save$2((RealCashVibrator) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 6);
            case 7:
                return new AndroidFileSaver$save$2((NearbyPayRequestViewModel) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 7);
            case 8:
                return new AndroidFileSaver$save$2((Function1) this.this$0, (Element) obj3, (MutableState) obj2, continuation, 8);
            case 9:
                AndroidFileSaver$save$2 androidFileSaver$save$24 = new AndroidFileSaver$save$2((Money) obj3, continuation, (MutableState) obj2, 9);
                androidFileSaver$save$24.this$0 = obj;
                return androidFileSaver$save$24;
            case 10:
                AndroidFileSaver$save$2 androidFileSaver$save$25 = new AndroidFileSaver$save$2((RealInvestingCryptoGraphHeaderPresenter) obj3, (MutableState) obj2, continuation, 10);
                androidFileSaver$save$25.this$0 = obj;
                return androidFileSaver$save$25;
            case 11:
                return new AndroidFileSaver$save$2((LocalEditorialPresenter) this.this$0, (PrepurchaseCashCardAppletData) obj3, (MutableState) obj2, continuation, 11);
            case 12:
                AndroidFileSaver$save$2 androidFileSaver$save$26 = new AndroidFileSaver$save$2((Boolean) obj3, continuation, (TransfersPresenter) obj2, 12);
                androidFileSaver$save$26.this$0 = obj;
                return androidFileSaver$save$26;
            case 13:
                AndroidFileSaver$save$2 androidFileSaver$save$27 = new AndroidFileSaver$save$2((SetDefaultInstrumentPresenter) obj3, (MutableState) obj2, continuation, 13);
                androidFileSaver$save$27.this$0 = obj;
                return androidFileSaver$save$27;
            case 14:
                AndroidFileSaver$save$2 androidFileSaver$save$28 = new AndroidFileSaver$save$2((WorkHomePresenter) obj3, (MutableState) obj2, continuation, 14);
                androidFileSaver$save$28.this$0 = obj;
                return androidFileSaver$save$28;
            case 15:
                AndroidFileSaver$save$2 androidFileSaver$save$29 = new AndroidFileSaver$save$2((AliasesSectionPresenter$Result) obj3, continuation, (MutableState) obj2, 15);
                androidFileSaver$save$29.this$0 = obj;
                return androidFileSaver$save$29;
            case 16:
                return new AndroidFileSaver$save$2((RealProfileRepo) this.this$0, (String) obj3, (AsyncResult.Success) obj2, continuation, 16);
            case 17:
                AndroidFileSaver$save$2 androidFileSaver$save$210 = new AndroidFileSaver$save$2((CashQrScannerPresenter) obj3, (MutableState) obj2, continuation, 17);
                androidFileSaver$save$210.this$0 = obj;
                return androidFileSaver$save$210;
            case 18:
                AndroidFileSaver$save$2 androidFileSaver$save$211 = new AndroidFileSaver$save$2((LocalEditorialPresenter) obj3, (MutableState) obj2, continuation, 18);
                androidFileSaver$save$211.this$0 = obj;
                return androidFileSaver$save$211;
            case 19:
                return new AndroidFileSaver$save$2((AssetPublicSuffixList) this.this$0, (Navigator) obj2, (String) obj3, continuation);
            case 20:
                return new AndroidFileSaver$save$2((String) obj3, (RealQrCodesPresenter) this.this$0, (QrCodeArgs) obj2, continuation);
            case 21:
                return new AndroidFileSaver$save$2((OverlayLayer.Session) this.this$0, (ReactionDialogAnchorBinding) obj3, (ReactionViewModel) obj2, continuation, 21);
            case 22:
                return new AndroidFileSaver$save$2((ImageLoader$Builder) this.this$0, (BlockersScreens) obj3, (BlockersData) obj2, continuation, 22);
            case 23:
                AndroidFileSaver$save$2 androidFileSaver$save$212 = new AndroidFileSaver$save$2((SavingsActivityItemEventDecorator) obj3, (ActivityItemViewModel) obj2, continuation, 23);
                androidFileSaver$save$212.this$0 = obj;
                return androidFileSaver$save$212;
            case 24:
                AndroidFileSaver$save$2 androidFileSaver$save$213 = new AndroidFileSaver$save$2((LoadedSavingsModel) obj3, continuation, (SavingsScreenPresenter) obj2, 24);
                androidFileSaver$save$213.this$0 = obj;
                return androidFileSaver$save$213;
            case 25:
                return new AndroidFileSaver$save$2((Boolean) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 25);
            case 26:
                return new AndroidFileSaver$save$2((BasePasswordPresenter) this.this$0, (PasswordEntryViewEvent) obj3, (MutableState) obj2, continuation, 26);
            case 27:
                AndroidFileSaver$save$2 androidFileSaver$save$214 = new AndroidFileSaver$save$2((Function2) obj3, (DoubleWriteSessionManager) obj2, continuation, 27);
                androidFileSaver$save$214.this$0 = obj;
                return androidFileSaver$save$214;
            case 28:
                return new AndroidFileSaver$save$2((ShoppingWebPresenter) this.this$0, (String) obj3, (String) obj2, continuation, 28);
            default:
                AndroidFileSaver$save$2 androidFileSaver$save$215 = new AndroidFileSaver$save$2((Article) obj3, continuation, (ArticlePresenter) obj2, 29);
                androidFileSaver$save$215.this$0 = obj;
                return androidFileSaver$save$215;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((AndroidFileSaver$save$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        InputStream openInputStream;
        Event prepurchaseCardPrimaryHalfSheetViewSubpage;
        PrepurchaseCashCardAppletData.PaymentPlansData paymentPlansData;
        LocalizedString localizedString;
        AliasesSectionViewModel aliasesSectionViewModel;
        AliasesSectionViewModel aliasesSectionViewModel2;
        File file;
        int i = this.$r8$classId;
        int i2 = 2;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        int i3 = 0;
        Object obj2 = this.$internalUri;
        Object obj3 = this.$displayName;
        switch (i) {
            case 0:
                Uri uri2 = (Uri) obj2;
                String str = (String) obj3;
                Lazy lazy = ((AndroidFileSaver) this.this$0).contentResolver$delegate;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                try {
                    ContentResolver contentResolver = (ContentResolver) lazy.getValue();
                    Uri uri3 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "application/pdf");
                    contentValues.put("is_pending", new Integer(1));
                    uri = contentResolver.insert(uri3, contentValues);
                } catch (IOException unused) {
                    uri = null;
                }
                if (uri == null) {
                    throw new IOException("Failed to create new file for ".concat(str));
                }
                try {
                    openInputStream = ((ContentResolver) lazy.getValue()).openInputStream(uri2);
                } catch (IOException unused2) {
                    if (uri != null) {
                        Okio.boxInt(((ContentResolver) lazy.getValue()).delete(uri, null, null));
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                if (openInputStream == null) {
                    throw new IOException("Failed to open input stream for " + uri2);
                }
                try {
                    OutputStream openOutputStream = ((ContentResolver) lazy.getValue()).openOutputStream(uri);
                    if (openOutputStream == null) {
                        throw new IOException("Failed to open output stream for " + uri);
                    }
                    try {
                        ByteStreamsKt.copyTo$default(openInputStream, openOutputStream);
                        openOutputStream.close();
                        openInputStream.close();
                        ContentResolver contentResolver2 = (ContentResolver) lazy.getValue();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("is_pending", new Integer(0));
                        contentResolver2.update(uri, contentValues2, null, null);
                        return Boolean.valueOf(z);
                    } finally {
                    }
                } finally {
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set set = (Set) obj3;
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj2;
                for (StablecoinWithdrawalOption stablecoinWithdrawalOption : ((PaymentRouterData) ((MutableState) this.this$0).getValue()).stablecoinWithdrawalOptions) {
                    StablecoinNetwork stablecoinNetwork = stablecoinWithdrawalOption.network;
                    String str2 = stablecoinNetwork.address;
                    String str3 = stablecoinNetwork.chain;
                    str2.getClass();
                    str3.getClass();
                    if (set.add(str2 + "::" + str3)) {
                        Analytics analytics = paymentConfigurationPresenter.analytics;
                        String uuid = paymentConfigurationPresenter.paymentToken.toString();
                        uuid.getClass();
                        AnalyticsHelperKt.trackPaymentViewStablecoinRecipient(analytics, uuid, stablecoinWithdrawalOption.network.chain, paymentConfigurationPresenter.flowToken, paymentConfigurationPresenter.analyticsOrigin);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, ((PaymentConfigurationPresenter) obj3).ioDispatcher, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3((MutableState) obj2, r7, 11), 2);
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PersonalizePaymentPresenter personalizePaymentPresenter = (PersonalizePaymentPresenter) obj3;
                JobKt.launch$default(coroutineScope2, null, null, new PersonalizePaymentPresenter$models$6$3(personalizePaymentPresenter, (MutableState) obj2, r7, z3 ? 1 : 0), 3);
                JobKt.launch$default(coroutineScope2, null, null, new PersonalizePaymentPresenter$models$6$2(personalizePaymentPresenter, r7, z2 ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 4:
                Function1 function1 = (Function1) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState = (MutableState) obj2;
                int i4 = MainPaymentView.$r8$clinit;
                if (((MainPaymentViewState) mutableState.getValue()).updated) {
                    function1.invoke(new MainPaymentViewEvent.RestoreState(((MainPaymentViewState) mutableState.getValue()).query, ((MainPaymentViewState) mutableState.getValue()).note, ((MainPaymentViewState) mutableState.getValue()).instrumentSelected, ((MainPaymentViewState) mutableState.getValue()).selectedRecipients));
                }
                Object obj4 = Thing.Companion.thing((MainPaymentView) obj3).result;
                r7 = obj4 instanceof SelectedRecipient ? (SelectedRecipient) obj4 : 0;
                if (r7 != 0) {
                    function1.invoke(new MainPaymentViewEvent.ListRowClicked(r7, 2));
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (coroutineScope3.toString().length() <= 50) {
                    ((Function1) obj3).invoke(((TextFieldState) obj2).getValue$foundation().text.toString());
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState2 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((MutableState) obj3).getValue()).booleanValue() && ((Versioned) mutableState2.getValue()) != null) {
                    RealCashVibrator realCashVibrator = (RealCashVibrator) this.this$0;
                    if (realCashVibrator != null) {
                        realCashVibrator.vibrate(100L);
                    }
                    mutableState2.setValue(null);
                }
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState3 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) this.this$0;
                if (nearbyPayRequestViewModel instanceof NearbyPayRequestViewModel.Ready) {
                    NearbyPayRequestViewModel.Ready ready = (NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel;
                    if (ready.selectedTab == NearbyPayRequestTab.PAY) {
                        if (((Boolean) ((MutableState) obj3).getValue()).booleanValue()) {
                            List list = ready.avatars;
                            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                            for (Object obj5 : list) {
                                linkedHashMap.put(((NearbyPerson) obj5).customerToken, obj5);
                            }
                            Map minus = MapsKt__MapsKt.minus((Map) linkedHashMap, (Iterable) ((Map) mutableState3.getValue()).keySet());
                            if (!minus.isEmpty()) {
                                mutableState3.setValue(MapsKt__MapsKt.plus((Map) mutableState3.getValue(), minus));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                mutableState3.setValue(emptyMap);
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState4 = (MutableState) obj2;
                if (((Boolean) mutableState4.getValue()) != null) {
                    Function1 function12 = (Function1) this.this$0;
                    int id = ((Element) obj3).getId();
                    Boolean bool = (Boolean) mutableState4.getValue();
                    bool.getClass();
                    function12.invoke(new PersonalizePaymentViewEvent.DeleteElement(id, bool.booleanValue()));
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState5 = (MutableState) obj2;
                mutableState5.setValue(RealInvestingCryptoGraphHeaderPresenter.State.copy$default((RealInvestingCryptoGraphHeaderPresenter.State) mutableState5.getValue(), null, null, null, null, null, false, (Money) obj3, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealInvestingCryptoGraphHeaderPresenter realInvestingCryptoGraphHeaderPresenter = (RealInvestingCryptoGraphHeaderPresenter) obj3;
                MutableState mutableState6 = (MutableState) obj2;
                JobKt.launch$default(coroutineScope4, null, null, new RealInvestingCryptoGraphHeaderPresenter$models$1$1$1(realInvestingCryptoGraphHeaderPresenter, mutableState6, r7, i3), 3);
                JobKt.launch$default(coroutineScope4, null, null, new RealInvestingCryptoGraphHeaderPresenter$models$1$1$1(realInvestingCryptoGraphHeaderPresenter, mutableState6, r7, z4 ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 11:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
                Surface surface = (Surface) localEditorialPresenter.responseContextHandler;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PrepurchaseCardPlanningState prepurchaseCardPlanningState = (PrepurchaseCardPlanningState) ((MutableState) obj2).getValue();
                if (Intrinsics.areEqual(prepurchaseCardPlanningState, PrepurchaseCardPlanningState.HomeState.INSTANCE)) {
                    prepurchaseCardPrimaryHalfSheetViewSubpage = new PrepurchaseCardPrimaryHalfSheetView(surface);
                } else if (prepurchaseCardPlanningState instanceof PrepurchaseCardPlanningState.InfoState) {
                    prepurchaseCardPrimaryHalfSheetViewSubpage = new PrepurchaseCardPrimaryHalfSheetViewSubpage(((PrepurchaseCardPlanningState.InfoState) prepurchaseCardPlanningState).infoSheet.title, surface);
                } else {
                    if (!Intrinsics.areEqual(prepurchaseCardPlanningState, PrepurchaseCardPlanningState.SelectPaymentPlanState.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    PrepurchaseCashCardAppletData prepurchaseCashCardAppletData = (PrepurchaseCashCardAppletData) obj3;
                    prepurchaseCardPrimaryHalfSheetViewSubpage = new PrepurchaseCardPrimaryHalfSheetViewSubpage((prepurchaseCashCardAppletData == null || (paymentPlansData = prepurchaseCashCardAppletData.payment_plans_data) == null || (localizedString = paymentPlansData.title) == null) ? null : localizedString.translated_value, surface);
                }
                ((Analytics) localEditorialPresenter.installedStore).track(prepurchaseCardPrimaryHalfSheetViewSubpage, null);
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj2;
                ((Analytics) transfersPresenter.analytics).track(booleanValue ? new AccountConfigureEnablePasscode() : new AccountConfigureDisablePasscode(), null);
                ((BetterNavigator.ScreenNavigator) transfersPresenter.navigator).goTo(((RealFlowStarter) ((FlowStarter) transfersPresenter.args)).startPasscodeFlow(booleanValue ? Flow$Type.ENABLE_SECURITY_LOCK_FOR_MOVE_MONEY : Flow$Type.DISABLE_SECURITY_LOCK, (ProfileScreens) transfersPresenter.clipboardManager));
                return Unit.INSTANCE;
            case 13:
                MutableState mutableState7 = (MutableState) obj2;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SetDefaultInstrumentPresenter setDefaultInstrumentPresenter = (SetDefaultInstrumentPresenter) obj3;
                if (((RealAllowlistRepository) setDefaultInstrumentPresenter.analytics).isAllowlistOn()) {
                    JobKt.launch$default(coroutineScope5, null, null, new RingtoneView.AnonymousClass1(setDefaultInstrumentPresenter, mutableState7, r7, r2), 3);
                } else {
                    mutableState7.setValue(new GetAllowlistForCustomerResponse(null, EmptyList.INSTANCE, ByteString.EMPTY));
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope6, null, null, new RingtoneView.AnonymousClass1((WorkHomePresenter) obj3, (MutableState) obj2, r7, 17), 3);
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AliasesSectionPresenter$Result aliasesSectionPresenter$Result = (AliasesSectionPresenter$Result) obj3;
                MutableState mutableState8 = (MutableState) obj2;
                if (aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.PopulatedList) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(((AliasesSectionViewModel) mutableState8.getValue()).aliases);
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    while (it.hasNext()) {
                        linkedHashMap2.put((ProfileAlias) ((Map.Entry) it.next()).getKey(), AliasesSectionViewModel.AliasState.REMOVED);
                    }
                    Iterator it2 = ((AliasesSectionPresenter$Result.PopulatedList) aliasesSectionPresenter$Result).aliases.iterator();
                    while (it2.hasNext()) {
                        linkedHashMap2.put((ProfileAlias) it2.next(), AliasesSectionViewModel.AliasState.DISPLAYED);
                    }
                    aliasesSectionViewModel2 = new AliasesSectionViewModel(linkedHashMap2);
                } else {
                    if (aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.UnregisterOngoing) {
                        AliasesSectionViewModel aliasesSectionViewModel3 = (AliasesSectionViewModel) mutableState8.getValue();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(((AliasesSectionViewModel) mutableState8.getValue()).aliases);
                        linkedHashMap3.put(((AliasesSectionPresenter$Result.UnregisterOngoing) aliasesSectionPresenter$Result).alias, AliasesSectionViewModel.AliasState.HIDDEN);
                        aliasesSectionViewModel3.getClass();
                        aliasesSectionViewModel = new AliasesSectionViewModel(linkedHashMap3);
                    } else if (aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.UnregisterSuccess) {
                        AliasesSectionViewModel aliasesSectionViewModel4 = (AliasesSectionViewModel) mutableState8.getValue();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(((AliasesSectionViewModel) mutableState8.getValue()).aliases);
                        linkedHashMap4.put(((AliasesSectionPresenter$Result.UnregisterSuccess) aliasesSectionPresenter$Result).alias, AliasesSectionViewModel.AliasState.REMOVED);
                        aliasesSectionViewModel4.getClass();
                        aliasesSectionViewModel = new AliasesSectionViewModel(linkedHashMap4);
                    } else {
                        if (!(aliasesSectionPresenter$Result instanceof AliasesSectionPresenter$Result.UnregisterFailed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        AliasesSectionViewModel aliasesSectionViewModel5 = (AliasesSectionViewModel) mutableState8.getValue();
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(((AliasesSectionViewModel) mutableState8.getValue()).aliases);
                        linkedHashMap5.put(((AliasesSectionPresenter$Result.UnregisterFailed) aliasesSectionPresenter$Result).alias, AliasesSectionViewModel.AliasState.DISPLAYED);
                        aliasesSectionViewModel5.getClass();
                        aliasesSectionViewModel = new AliasesSectionViewModel(linkedHashMap5);
                    }
                    aliasesSectionViewModel2 = aliasesSectionViewModel;
                }
                mutableState8.setValue(aliasesSectionViewModel2);
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((RealProfileRepo) this.this$0).extendedProfileDetailsQueries.insertOrReplace((String) obj3, (GetProfileDetailsResponse) ((AsyncResult.Success) obj2).response);
            case 17:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CashQrScannerPresenter cashQrScannerPresenter = (CashQrScannerPresenter) obj3;
                MutableState mutableState9 = (MutableState) obj2;
                JobKt.launch$default(coroutineScope7, null, null, new CashQrScannerPresenter$models$2$1$1(cashQrScannerPresenter, mutableState9, r7, i3), 3);
                JobKt.launch$default(coroutineScope7, null, null, new CashQrScannerPresenter$models$2$1$1(cashQrScannerPresenter, mutableState9, r7, z5 ? 1 : 0), 3);
                JobKt.launch$default(coroutineScope7, null, null, new CashQrScannerPresenter$models$2$1$1(cashQrScannerPresenter, mutableState9, r7, i2), 3);
                return Unit.INSTANCE;
            case 18:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalEditorialPresenter localEditorialPresenter2 = (LocalEditorialPresenter) obj3;
                MutableState mutableState10 = (MutableState) obj2;
                JobKt.launch$default(coroutineScope8, null, null, new CashtagQrScanPresenter$models$1$1$1(localEditorialPresenter2, mutableState10, r7, i3), 3);
                JobKt.launch$default(coroutineScope8, null, null, new CashtagQrScanPresenter$models$1$1$1(localEditorialPresenter2, mutableState10, r7, z6 ? 1 : 0), 3);
                JobKt.launch$default(coroutineScope8, null, null, new CashtagQrScanPresenter$models$1$1$1(localEditorialPresenter2, mutableState10, r7, i2), 3);
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(((RealDeepLinking) ((AssetPublicSuffixList) this.this$0).listRead).handleDeeplink((Navigator) obj2, (String) obj3, Source.IN_APP_SCANNER));
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str4 = (String) obj3;
                str4.getClass();
                Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
                QrCodeArgs qrCodeArgs = (QrCodeArgs) obj2;
                Integer num = qrCodeArgs.backgroundColor;
                if (num != null) {
                    buildUpon.appendQueryParameter("bg", StringsKt___StringsKt.drop(2, String.format("%08x", Arrays.copyOf(new Object[]{new Integer(num.intValue())}, 1))));
                }
                Integer num2 = qrCodeArgs.logoColor;
                if (num2 != null) {
                    buildUpon.appendQueryParameter("logoColor", StringsKt___StringsKt.drop(2, String.format("%08x", Arrays.copyOf(new Object[]{new Integer(num2.intValue())}, 1))));
                }
                Integer num3 = qrCodeArgs.currencyColor;
                if (num3 != null) {
                    buildUpon.appendQueryParameter("currencyColor", StringsKt___StringsKt.drop(2, String.format("%08x", Arrays.copyOf(new Object[]{new Integer(num3.intValue())}, 1))));
                }
                Integer num4 = qrCodeArgs.size;
                if (num4 != null) {
                    int intValue = num4.intValue();
                    if (intValue > 1024) {
                        intValue = 1024;
                    }
                    buildUpon.appendQueryParameter("size", String.valueOf(intValue));
                }
                CurrencyCode currencyCode = qrCodeArgs.currency;
                if (currencyCode != null) {
                    buildUpon.appendQueryParameter("currency", currencyCode.name());
                }
                String uri4 = buildUpon.build().toString();
                uri4.getClass();
                RealQrCodesPresenter realQrCodesPresenter = (RealQrCodesPresenter) this.this$0;
                RealFileDownloader realFileDownloader = realQrCodesPresenter.fileDownloader;
                RealFileDownloader realFileDownloader2 = realQrCodesPresenter.tempFileDownloader;
                boolean z8 = qrCodeArgs.saveToTemporaryStorage;
                ByteString.Companion companion = ByteString.Companion;
                String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(ByteString.Companion.encodeUtf8(uri4).digest$okio("SHA-256").hex(), ".png");
                RealFileDownloader realFileDownloader3 = z8 ? realFileDownloader2 : realFileDownloader;
                FileDownloader$Category fileDownloader$Category = FileDownloader$Category.CASH_QR;
                if (realFileDownloader3.download(fileDownloader$Category, m$1, uri4, false) == FileDownloader$DownloadStatus.SUCCESS) {
                    if (z8) {
                        realFileDownloader = realFileDownloader2;
                    }
                    Uri localUri = realFileDownloader.localUri(fileDownloader$Category, m$1);
                    file = localUri != null ? new File(localUri.getPath()) : null;
                    file.getClass();
                } else {
                    file = null;
                }
                FileInputStream fileInputStream = file != null ? new FileInputStream(file) : null;
                fileInputStream.getClass();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                    fileInputStream.close();
                    return decodeStream;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Utf8.closeFinally(fileInputStream, th);
                        throw th2;
                    }
                }
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OverlayLayer.Session session = (OverlayLayer.Session) this.this$0;
                ChooseReactionOverlay chooseReactionOverlay = (ChooseReactionOverlay) session.getOverlay();
                PassThroughLayout passThroughLayout = ((ReactionDialogAnchorBinding) obj3).value;
                View rootView = passThroughLayout.getRootView();
                rootView.getClass();
                chooseReactionOverlay.setViewContext(new ChooseReactionOverlay.ViewContext(Views.boundsRelativeTo(rootView, passThroughLayout)));
                ((ChooseReactionOverlay) session.getOverlay()).setModel((ReactionViewModel) obj2);
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) this.this$0;
                ((BetterNavigator.ScreenNavigator) imageLoader$Builder.extras).goTo(((BlockersDataNavigator) imageLoader$Builder.eventListenerFactory).getNext((BlockersScreens) obj3, (BlockersData) obj2));
                return Unit.INSTANCE;
            case 23:
                ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (activityItemCallbackEvent == ActivityItemCallbackEvent.AnalyticsEvent.ItemTapped) {
                    ((SavingsActivityItemEventDecorator) obj3).analytics.track(new SavingsFolderManageViewActivity(((ActivityItemViewModel) obj2).rowId), null);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((LoadedSavingsModel) obj3).data == null) {
                    SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) obj2;
                    if (((SavingsScreen.ScreenType) savingsScreenPresenter.screenType) instanceof SavingsScreen.ScreenType.GoalDetail) {
                        savingsScreenPresenter.navigator.goTo(Back.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            case 25:
                MutableState mutableState11 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                boolean areEqual = Intrinsics.areEqual((Boolean) this.this$0, Boolean.TRUE);
                if (Intrinsics.areEqual((ScoreDisplayContent) ((MutableState) obj3).getValue(), ScoreDisplayContent.AfterCelebrationScore.INSTANCE) || !((Boolean) mutableState11.getValue()).booleanValue()) {
                    mutableState11.setValue(Boolean.valueOf(areEqual));
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState12 = (MutableState) obj2;
                mutableState12.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState12.getValue(), false, new BiometricsCheckboxModel$SaveBiometricsLogIn(((PasswordEntryViewEvent.BiometricsCheckboxToggle) ((PasswordEntryViewEvent) obj3)).isChecked), 3));
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Function2 function2 = (Function2) obj3;
                DoubleWriteSessionManager doubleWriteSessionManager = (DoubleWriteSessionManager) obj2;
                JobKt.launch$default(coroutineScope9, null, null, new DoubleWriteSessionManager$conditionalDoubleWrite$2$1$1(function2, doubleWriteSessionManager, r7, i3), 3);
                return JobKt.launch$default(coroutineScope9, null, null, new DoubleWriteSessionManager$conditionalDoubleWrite$2$1$1(function2, doubleWriteSessionManager, r7, z7 ? 1 : 0), 3);
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((ShoppingWebPresenter) this.this$0).fileDownloader.download(FileDownloader$Category.SCRIPT, (String) obj3, (String) obj2, false);
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ArticlePresenter) obj2).viewedArticlesStore.add(new RecentlyViewedNode(((Article) obj3).token));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidFileSaver$save$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$displayName = obj;
        this.$internalUri = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidFileSaver$save$2(Object obj, Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$displayName = obj;
        this.$internalUri = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidFileSaver$save$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$displayName = obj2;
        this.$internalUri = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFileSaver$save$2(AssetPublicSuffixList assetPublicSuffixList, Navigator navigator, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 19;
        this.this$0 = assetPublicSuffixList;
        this.$internalUri = navigator;
        this.$displayName = str;
    }
}
