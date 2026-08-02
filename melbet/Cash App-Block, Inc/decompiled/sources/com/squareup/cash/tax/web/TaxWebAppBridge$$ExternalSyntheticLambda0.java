package com.squareup.cash.tax.web;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$RefreshMode;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardCardTabCtaTap;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.fidesmo.screens.FidesmoDeprovisioningScreen;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.UtilsKt;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.presenters.SupportActivityItemPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.RealScreenshotManager$toCompleteCachePath$1;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotResult;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotState;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewEvent;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewEvent;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetEvents;
import com.squareup.cash.support.viewmodels.SupportHomeViewEvent;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewEvent;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel;
import com.squareup.cash.support.viewmodels.SupportNotification;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tax.viewmodels.TaxReturnsEvent;
import com.squareup.cash.tax.viewmodels.TaxReturnsViewModel;
import com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter;
import com.squareup.cash.transfers.presenters.WithdrawPresenter;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewEvent;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewEvent;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.FidesmoDeprovisionBlockerFactory;
import com.squareup.ecr.EmbeddedCardReader;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.Buffer$outputStream$1;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import okio.Utf8;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxWebAppBridge$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TaxWebAppBridge$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String path;
        Object obj;
        int i = this.$r8$classId;
        boolean z = true;
        int i2 = 0;
        Object obj2 = null;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ContextScope plus = JobKt.plus(new CoroutineName(TaxWebAppBridge.class.getName()), (ContextScope) obj4);
                StateFlowKt.closeWith(((TaxWebAppBridge) obj3).taxUrlsAllowlistMatcher, plus, new TaxWebAppBridge$$ExternalSyntheticLambda1(i2));
                return plus;
            case 1:
                ((Function1) obj4).invoke(((BodyViewModel$ActionBodyViewModel) obj3).action);
                return Unit.INSTANCE;
            case 2:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj4;
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) localHomePresenter.syncer;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                Lazy lazy = (Lazy) localHomePresenter.neighborhoodsTabContentEnabled$delegate;
                return realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default((ActivitiesManager.ActivityContext) lazy.getValue(), RealActivitiesCacheManager.take$default((RealActivitiesCacheManager) obj3, (ActivitiesManager.ActivityContext) lazy.getValue()), (SupportScreens.FlowScreens.SupportActivityPickerFullScreen) localHomePresenter.localHomeGeoPresenterFactory, true, null, null, (SupportActivityItemPresenter$Factory$Impl) localHomePresenter.store, null, null, 15272));
            case 3:
                SupportHomePresenter supportHomePresenter = (SupportHomePresenter) obj4;
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = supportHomePresenter.activityEmbeddedPresenterFactory;
                BetterNavigator.ScreenNavigator screenNavigator2 = supportHomePresenter.navigator;
                Lazy lazy2 = supportHomePresenter.activityContext$delegate;
                ActivitiesManager.ActivityContext activityContext = (ActivitiesManager.ActivityContext) lazy2.getValue();
                ActivitiesCache take$default = RealActivitiesCacheManager.take$default((RealActivitiesCacheManager) obj3, (ActivitiesManager.ActivityContext) lazy2.getValue());
                SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = supportHomePresenter.args;
                ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode = ActivityEmbeddedPresenter$RefreshMode.Never;
                return realActivityEmbeddedPresenter$Factory$Impl2.create(screenNavigator2, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, take$default, supportHomeScreen, new SheetKt$$ExternalSyntheticLambda9(25), 5, null, null, null, supportHomePresenter.supportActivityItemPresenterFactory, null, 7104));
            case 4:
                RealScreenshotManager realScreenshotManager = (RealScreenshotManager) obj4;
                ScreenshotManager$ScreenshotResult screenshotManager$ScreenshotResult = (ScreenshotManager$ScreenshotResult) obj3;
                Bitmap bitmap = ((ScreenshotManager$ScreenshotResult.Success) screenshotManager$ScreenshotResult).screenshot;
                String m = Recorder$$ExternalSyntheticOutline2.m("screenshot-", realScreenshotManager.sessionId);
                StateFlowImpl stateFlowImpl = realScreenshotManager.screenshotState;
                String m2 = Recorder$$ExternalSyntheticOutline2.m(m, "/", UtilsKt.tempFileName("screenshot"));
                String str = Path.DIRECTORY_SEPARATOR;
                String path2 = ((RealStorage) realScreenshotManager.storage).getFileUri(Path.Companion.get(m2, false), RealScreenshotManager$toCompleteCachePath$1.INSTANCE).getPath();
                if (path2 == null) {
                    path = null;
                } else {
                    File file = new File(path2);
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    RealBufferedSink realBufferedSink = new RealBufferedSink(Okio.sink$default(file));
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 65, new Buffer$outputStream$1(realBufferedSink, 2));
                        path = file.getPath();
                        realBufferedSink.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Utf8.closeFinally(realBufferedSink, th);
                            throw th2;
                        }
                    }
                }
                if (path != null) {
                    stateFlowImpl.updateState(null, ScreenshotManager$ScreenshotState.copy$default((ScreenshotManager$ScreenshotState) stateFlowImpl.getValue(), false, null, screenshotManager$ScreenshotResult, CollectionsKt.plus((Collection) ((ScreenshotManager$ScreenshotState) stateFlowImpl.getValue()).screenshotFilePaths, (Object) path), false, 19));
                } else {
                    stateFlowImpl.updateState(null, ScreenshotManager$ScreenshotState.copy$default((ScreenshotManager$ScreenshotState) stateFlowImpl.getValue(), false, null, ScreenshotManager$ScreenshotResult.Failed.INSTANCE, null, false, 27));
                }
                return Unit.INSTANCE;
            case 5:
                String str2 = (String) obj4;
                StateFlowImpl stateFlowImpl2 = ((RealScreenshotManager) obj3).screenshotState;
                if (new File(str2).delete()) {
                    stateFlowImpl2.updateState(null, ScreenshotManager$ScreenshotState.copy$default((ScreenshotManager$ScreenshotState) stateFlowImpl2.getValue(), false, null, null, CollectionsKt.minus(((ScreenshotManager$ScreenshotState) stateFlowImpl2.getValue()).screenshotFilePaths, str2), false, 23));
                }
                return Unit.INSTANCE;
            case 6:
                ScreenshotReviewViewModel.Screenshot screenshot = (ScreenshotReviewViewModel.Screenshot) obj4;
                Function1 function1 = (Function1) obj3;
                if (screenshot.uploadStatus == null) {
                    String uri = screenshot.uri.toString();
                    uri.getClass();
                    function1.invoke(new ScreenshotReviewViewEvent.RemoveScreenshot(uri));
                }
                return Unit.INSTANCE;
            case 7:
                ((Function1) obj4).invoke(new SupportDisputeTrackerViewEvent.TransactionClicked((DisputeRow) obj3));
                return Unit.INSTANCE;
            case 8:
                ((Function1) obj4).invoke((SupportHomeContactOptionsSheetEvents) obj3);
                return Unit.INSTANCE;
            case 9:
                ((Function1) obj4).invoke(new SupportIncidentDetailsViewEvent.UpdateIncidentSubscription(((SupportIncidentDetailsViewModel.ButtonViewModel.Display) ((SupportIncidentDetailsViewModel.ButtonViewModel) obj3)).action));
                return Unit.INSTANCE;
            case 10:
                ((Function1) obj4).invoke(new ArticleViewEvent.Contact(((ArticleViewModel.ContactOption) obj3).f1208type));
                return Unit.INSTANCE;
            case 11:
                ((Function1) obj4).invoke((SupportHomeViewModel.Category) obj3);
                return Unit.INSTANCE;
            case 12:
                Function1 function12 = (Function1) obj3;
                int ordinal = ((SupportHomeViewModel.ContactOption) obj4).f1210type.ordinal();
                if (ordinal == 0) {
                    function12.invoke(SupportHomeViewEvent.ChatModuleClicked.INSTANCE);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    function12.invoke(SupportHomeViewEvent.PhoneClicked.INSTANCE);
                }
                return Unit.INSTANCE;
            case 13:
                ((Function1) obj4).invoke((SupportHomeViewModel.SuggestedAction) obj3);
                return Unit.INSTANCE;
            case 14:
                ((Function1) obj4).invoke(((SupportNotification) obj3).trigger);
                return Unit.INSTANCE;
            case 15:
                ((Function1) obj4).invoke(new TabToolbarInternalViewEvent.ToolbarButtonClick(((TabToolbarInternalViewModel.ImageButton) obj3).id));
                return Unit.INSTANCE;
            case 16:
                ((TabToolbarInternalViewModel.TextButton) obj3).getClass();
                ((Function1) obj4).invoke(new TabToolbarInternalViewEvent.ToolbarButtonClick(TabToolbarInternalViewModel.ToolbarButton.Id.Moneybot));
                return Unit.INSTANCE;
            case 17:
                return new EmbeddedCardReader(((Activity) obj4).getApplicationContext(), (AssetPublicSuffixList) ((TextSetter) obj3).textSwitcher);
            case 18:
                String str3 = ((TaxReturnsViewModel) obj3).deeplink;
                str3.getClass();
                ((Function1) obj4).invoke(new TaxReturnsEvent.RouteToDeepLink(str3));
                return Unit.INSTANCE;
            case 19:
                final UnifiedActivityPickerBlockerPresenter unifiedActivityPickerBlockerPresenter = (UnifiedActivityPickerBlockerPresenter) obj4;
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl3 = unifiedActivityPickerBlockerPresenter.activityEmbeddedPresenterFactory;
                BetterNavigator.ScreenNavigator screenNavigator3 = unifiedActivityPickerBlockerPresenter.navigator;
                Lazy lazy3 = unifiedActivityPickerBlockerPresenter.activityContext$delegate;
                return realActivityEmbeddedPresenter$Factory$Impl3.create(screenNavigator3, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default((ActivitiesManager.ActivityContext) lazy3.getValue(), RealActivitiesCacheManager.take$default((RealActivitiesCacheManager) obj3, (ActivitiesManager.ActivityContext) lazy3.getValue()), unifiedActivityPickerBlockerPresenter.args, true, null, new ActivityItemEventHandler.Factory() { // from class: com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter$activityEmbeddedPresenter$2$1
                    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler.Factory
                    public final ActivityItemEventHandler create(Navigator navigator, Function1 function13) {
                        navigator.getClass();
                        return UnifiedActivityPickerBlockerPresenter.this;
                    }
                }, unifiedActivityPickerBlockerPresenter.supportActivityItemPresenterFactory, null, null, 14760));
            case 20:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj3;
                if (!(((CombinedLoadStates) ((LazyPagingItems) obj4).loadState$delegate.getValue()).refresh instanceof LoadState.Loading) && !(((CombinedLoadStates) lazyPagingItems.loadState$delegate.getValue()).refresh instanceof LoadState.Loading)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                State state = (State) obj3;
                AddMoneyScreen addMoneyScreen = ((AddMoneyPresenter) obj4).args;
                String str4 = addMoneyScreen.instrumentToken;
                if (str4 == null) {
                    Iterator it = ((List) state.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((Instrument) next).defaultForInstrumentType) {
                                obj2 = next;
                            }
                        }
                    }
                    return (Instrument) obj2;
                }
                if (StringsKt__StringsJVMKt.startsWith(str4, "GOOGLE_PAY", false)) {
                    if (((List) state.getValue()).isEmpty()) {
                        return null;
                    }
                    return new Instrument(str4, CashInstrumentType.GOOGLE_PAY, (InstrumentType) null, (String) null, (String) null, (String) null, (String) null, (String) null, "Google Pay", (Boolean) null, (String) null, (String) null, (String) null, true, (String) null, (Long) null, 65536);
                }
                Iterator it2 = ((List) state.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (Intrinsics.areEqual(((Instrument) obj).token, addMoneyScreen.instrumentToken)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Instrument instrument = (Instrument) obj;
                if (instrument != null) {
                    return instrument;
                }
                Iterator it3 = ((List) state.getValue()).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (((Instrument) next2).defaultForInstrumentType) {
                            obj2 = next2;
                        }
                    }
                }
                return (Instrument) obj2;
            case 22:
                Money money = (Money) obj3;
                Money money2 = ((WithdrawPresenter) obj4).args.amount;
                if (money2 != null) {
                    money = money2;
                }
                return Updater.mutableStateOf$default(money);
            case 23:
                Function0 function0 = (Function0) obj3;
                if (((InstrumentDetailsViewModel.DefaultState) obj4) instanceof InstrumentDetailsViewModel.DefaultState.NotSet) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 24:
                ((Function1) obj4).invoke(((InstrumentLinkingOptionsViewModel.Option) obj3).instrumentViewEvent);
                return Unit.INSTANCE;
            case 25:
                ((Function1) obj4).invoke(new AddMoneyViewEvent.InstrumentSelected(((AddMoneyViewModel.ManagedAccountInstrumentPicker.InstrumentItem) obj3).token));
                return Unit.INSTANCE;
            case 26:
                ((Function1) obj4).invoke(new RecurringReloadConfigurationViewEvent.FrequencySelected((RecurringSchedule.Frequency) obj3));
                return Unit.INSTANCE;
            case 27:
                ((Function1) obj4).invoke(new NullStateCarouselViewEvent.ButtonClick(((ParcelableSnapshotMutableIntState) ((DefaultPagerState) obj3).scrollPosition.elementTypes).getIntValue()));
                return Unit.INSTANCE;
            case 28:
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) obj4;
                cardSchemePresenter.navigator.goTo(new FidesmoDeprovisioningScreen(BlockersData.DUMMY, FidesmoDeprovisionBlockerFactory.createDeprovisionBlocker(cardSchemePresenter.stringManager, (CashAppTag) obj3)));
                return Unit.INSTANCE;
            default:
                CardSchemePresenter cardSchemePresenter2 = (CardSchemePresenter) obj4;
                cardSchemePresenter2.analytics.track(new PrepurchaseCardCardTabCtaTap(), null);
                cardSchemePresenter2.completeClientRoute((String) obj3);
                return Unit.INSTANCE;
        }
    }
}
