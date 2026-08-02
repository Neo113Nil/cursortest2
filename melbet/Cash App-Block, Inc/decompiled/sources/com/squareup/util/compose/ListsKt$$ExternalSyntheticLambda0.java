package com.squareup.util.compose;

import android.graphics.Rect;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController$NavControllerNavigatorState;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.trace.Trace;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.cdf.booklet.BookletInteractTapButton;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.viewmodels.CardHomeAction;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardScreenId;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewEvent;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.MerchantPickerViewEvent;
import com.squareup.cash.work.viewmodels.MerchantRowViewModel;
import com.squareup.cash.work.viewmodels.PastPayStubViewModel;
import com.squareup.cash.work.viewmodels.PayHistoryListViewModel;
import com.squareup.cash.work.viewmodels.ShiftListScheduleViewModel;
import com.squareup.cash.work.viewmodels.ShiftListTimecardViewModel;
import com.squareup.cash.work.viewmodels.ShiftListViewEvent;
import com.squareup.cash.work.viewmodels.ShiftNoteViewModel;
import com.squareup.cash.work.views.clockin.ClockInOverlayMode;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.cash.work.views.clockin.DisabledClockInReason;
import com.squareup.cash.work.views.menu.DropdownItem;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.scannerview.PreviewFrame;
import com.squareup.util.cash.StringsKt;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.StripeRequest;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator;
import com.stripe.android.financialconnections.presentation.Async;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes7.dex */
public final /* synthetic */ class ListsKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ListsKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [com.stripe.android.core.networking.StripeConnection$Default] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Animatable animatable;
        Object obj;
        CharSequence charSequence;
        Object failure;
        int i = this.$r8$classId;
        DisabledClockInReason disabledClockInReason = null;
        r1 = null;
        String str = null;
        r1 = null;
        Long l = null;
        disabledClockInReason = null;
        boolean z = false;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                List list = ((LazyListState) obj3).getLayoutInfo().visibleItemsInfo;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                Analytics analytics = ((CardSchemePresenter) obj3).analytics;
                LocalizedString localizedString = ((CardModule.Button) obj2).text;
                analytics.track(new BookletInteractTapButton("CARD", null, localizedString != null ? StringsKt.translated(localizedString) : null, null, 22), null);
                return Unit.INSTANCE;
            case 2:
                CardScreenId cardScreenId = (CardScreenId) obj2;
                SnapshotStateMap snapshotStateMap = ((CardRegistry) obj3).sourceCardRegistry;
                if (!snapshotStateMap.isEmpty() && !snapshotStateMap.containsValue(cardScreenId)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj3;
                CardScreenId cardScreenId2 = (CardScreenId) obj2;
                if (snapshotStateMap2 == null || (animatable = (Animatable) snapshotStateMap2.get(cardScreenId2)) == null) {
                    return null;
                }
                return (Float) animatable.getValue();
            case 4:
                ((Function1) obj2).invoke((PresentationAction) obj3);
                return Unit.INSTANCE;
            case 5:
                return Float.valueOf(((Number) ((Animatable) obj3).getValue()).floatValue() + ((CardWobbleState) obj2).wobbleTranslation().vector[2]);
            case 6:
                return Float.valueOf(((Boolean) ((State) obj3).getValue()).booleanValue() ? ((Number) ((State) obj2).getValue()).floatValue() : RecyclerView.DECELERATION_RATE);
            case 7:
                CardHomeAction.LockDevices lockDevices = (CardHomeAction.LockDevices) obj3;
                ((Function1) obj2).invoke(new WalletHomeViewEvent.OpenLockHalfSheet(lockDevices.title, lockDevices.description));
                return Unit.INSTANCE;
            case 8:
                ((Function1) obj2).invoke(new MerchantPickerViewEvent.SelectMerchant(((MerchantRowViewModel) obj3).merchant));
                return Unit.INSTANCE;
            case 9:
                ((MutableState) obj2).setValue(((ClockInBottomSheetViewModel.JobItem) obj3).identifier);
                return Unit.INSTANCE;
            case 10:
                ((MutableState) obj2).setValue(((ClockInBottomSheetViewModel.LocationItem) obj3).identifier);
                return Unit.INSTANCE;
            case 11:
                ClockInOverlayState clockInOverlayState = (ClockInOverlayState) obj3;
                ClockInOverlayViewModel.Loaded.ClockedIn clockedIn = (ClockInOverlayViewModel.Loaded.ClockedIn) obj2;
                if (clockedIn == null || !clockedIn.shouldDeclareCashTips) {
                    clockInOverlayState.isClockingOut$delegate.setValue(Boolean.TRUE);
                    clockInOverlayState.onEvent.invoke(ClockInOverlayViewEvent.ClockOutConfirmContinueClicked.INSTANCE);
                } else {
                    clockInOverlayState.setOverlayMode(ClockInOverlayMode.DeclareCashTip);
                }
                return Unit.INSTANCE;
            case 12:
                ClockInOverlayState clockInOverlayState2 = (ClockInOverlayState) obj3;
                ClockInOverlayViewModel.Loaded loaded = (ClockInOverlayViewModel.Loaded) obj2;
                loaded.getClass();
                ClockInOverlayViewModel.Loaded.ClockedOut clockedOut = loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut ? (ClockInOverlayViewModel.Loaded.ClockedOut) loaded : null;
                if (clockedOut != null) {
                    Iterator it2 = clockedOut.locations.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((ClockInOverlayViewModel.PickerItem) obj).isSelected) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj;
                    if ((pickerItem != null ? pickerItem.name : null) == null) {
                        disabledClockInReason = DisabledClockInReason.NoLocation;
                    } else if (clockedOut.getSelectedJobTitle() == null) {
                        disabledClockInReason = DisabledClockInReason.NoJob;
                    }
                }
                clockInOverlayState2.setDisabledClockInReason(disabledClockInReason);
                return Unit.INSTANCE;
            case 13:
                Function1 function12 = (Function1) obj2;
                ClockInOverlayViewModel.Loaded.OnBreak onBreak = (ClockInOverlayViewModel.Loaded.OnBreak) ((ClockInOverlayViewModel.Loaded) obj3);
                Long l2 = onBreak.endBreakEnabledAtMillis;
                long currentTimeMillis = onBreak.currentTimeMillisProvider.currentTimeMillis();
                if (l2 != null) {
                    long longValue = l2.longValue() - currentTimeMillis;
                    if (longValue > 0) {
                        l = Long.valueOf((longValue + 59999) / 60000);
                    }
                }
                if (l != null) {
                    function12.invoke(l);
                }
                return Unit.INSTANCE;
            case 14:
                WindowInsetsControllerCompat windowInsetsControllerCompat = (WindowInsetsControllerCompat) obj3;
                Boolean bool = (Boolean) obj2;
                if (windowInsetsControllerCompat != null && bool != null) {
                    windowInsetsControllerCompat.setAppearanceLightStatusBars(bool.booleanValue());
                }
                return Unit.INSTANCE;
            case 15:
                ((DropdownItem) obj3).onClick.invoke();
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 16:
                ((Function1) obj2).invoke(((PastPayStubViewModel) obj3).id);
                return Unit.INSTANCE;
            case 17:
                PayHistoryListViewModel.Loaded loaded2 = (PayHistoryListViewModel.Loaded) obj2;
                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) CollectionsKt.lastOrNull(((LazyListState) obj3).getLayoutInfo().visibleItemsInfo);
                if ((lazyListMeasuredItem != null ? lazyListMeasuredItem.index : 0) >= r11.getLayoutInfo().totalItemsCount - 3 && loaded2.hasMoreItems && !loaded2.isLoadingMore) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                ((Function1) obj2).invoke(new ShiftListViewEvent.ScheduleClicked(((ShiftListScheduleViewModel) obj3).id));
                return Unit.INSTANCE;
            case 19:
                ((Function1) obj2).invoke(new ShiftListViewEvent.TimecardClicked(((ShiftListTimecardViewModel) obj3).id));
                return Unit.INSTANCE;
            case 20:
                TextFieldState textFieldState = (TextFieldState) obj3;
                ShiftNoteViewModel shiftNoteViewModel = (ShiftNoteViewModel) obj2;
                if (textFieldState != null && (charSequence = textFieldState.getValue$foundation().text) != null) {
                    str = charSequence.toString();
                }
                return Boolean.valueOf(!Intrinsics.areEqual(str, shiftNoteViewModel.inputSection != null ? r11.initialNote : ""));
            case 21:
                PreviewFrame previewFrame = (PreviewFrame) obj3;
                String obj4 = previewFrame.rotation.toString();
                ((Rect) obj2).flattenToString().getClass();
                ((Number) previewFrame.targetWidth$delegate.getValue()).intValue();
                ((Number) previewFrame.targetHeight$delegate.getValue()).intValue();
                int i2 = previewFrame.yData.rowStride;
                int i3 = previewFrame.uData.rowStride;
                int i4 = previewFrame.vData.rowStride;
                obj4.getClass();
                return new Plane(8);
            case 22:
                ((TextView) obj3).removeTextChangedListener((SearchView.AnonymousClass10) obj2);
                return Unit.INSTANCE;
            case 23:
                Function1 function13 = (Function1) obj2;
                List list2 = ((LazyGridState) obj3).getLayoutInfo().visibleItemsInfo;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((Boolean) function13.invoke(it3.next())).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 24:
                return ((KotlinConstructorBuilder) obj3).get((WireField) obj2);
            case 25:
                return ((KotlinConstructorBuilder) obj3).sealedOneofValues.get((String) obj2);
            case 26:
                Class cls = (Class) obj3;
                Class cls2 = (Class) obj2;
                if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
                    return new KotlinConstructorBuilder(cls2);
                }
                Object newInstance = cls.newInstance();
                newInstance.getClass();
                return (Message.Builder) newInstance;
            case 27:
                DefaultStripeNetworkClient defaultStripeNetworkClient = (DefaultStripeNetworkClient) obj3;
                StripeRequest stripeRequest = (StripeRequest) obj2;
                defaultStripeNetworkClient.connectionFactory.getClass();
                stripeRequest.getClass();
                KotterKnifeKt$$ExternalSyntheticLambda0 kotterKnifeKt$$ExternalSyntheticLambda0 = new KotterKnifeKt$$ExternalSyntheticLambda0(20);
                URLConnection openConnection = new URL(stripeRequest.getUrl()).openConnection();
                openConnection.getClass();
                final HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                kotterKnifeKt$$ExternalSyntheticLambda0.invoke(httpsURLConnection, stripeRequest);
                ?? r0 = new Closeable(httpsURLConnection) { // from class: com.stripe.android.core.networking.StripeConnection$Default
                    public static final String CHARSET = StandardCharsets.UTF_8.name();
                    public final HttpsURLConnection conn;

                    {
                        this.conn = httpsURLConnection;
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        HttpsURLConnection httpsURLConnection2 = this.conn;
                        int responseCode = httpsURLConnection2.getResponseCode();
                        InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpsURLConnection2.getErrorStream() : httpsURLConnection2.getInputStream();
                        if (errorStream != null) {
                            errorStream.close();
                        }
                        httpsURLConnection2.disconnect();
                    }

                    public final StripeResponse getResponse() {
                        HttpsURLConnection httpsURLConnection2 = this.conn;
                        int responseCode = httpsURLConnection2.getResponseCode();
                        int responseCode2 = httpsURLConnection2.getResponseCode();
                        InputStream errorStream = (200 > responseCode2 || responseCode2 >= 300) ? httpsURLConnection2.getErrorStream() : httpsURLConnection2.getInputStream();
                        if (errorStream != null) {
                            try {
                                Scanner useDelimiter = new Scanner(errorStream, CHARSET).useDelimiter("\\A");
                                r3 = useDelimiter.hasNext() ? useDelimiter.next() : null;
                                errorStream.close();
                            } finally {
                            }
                        }
                        Map<String, List<String>> headerFields = httpsURLConnection2.getHeaderFields();
                        headerFields.getClass();
                        return new StripeResponse(r3, headerFields, responseCode);
                    }
                };
                String url = stripeRequest.getUrl();
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = defaultStripeNetworkClient.logger;
                try {
                    Result.Companion companion = Result.Companion;
                    StripeResponse response = r0.getResponse();
                    logger$Companion$NOOP_LOGGER$1.info(response.toString());
                    failure = response;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl == null) {
                    return (StripeResponse) failure;
                }
                logger$Companion$NOOP_LOGGER$1.error("Exception while making Stripe API request", m4120exceptionOrNullimpl);
                if (!(m4120exceptionOrNullimpl instanceof IOException)) {
                    throw m4120exceptionOrNullimpl;
                }
                Set set = APIConnectionException.SENSITIVE_PARAM_NAMES;
                throw Trace.create(url, (IOException) m4120exceptionOrNullimpl);
            case 28:
                Function0 function0 = (Function0) obj2;
                if (!(((Async) obj3) instanceof Async.Loading)) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            default:
                NavController$NavControllerNavigatorState state = ((BottomSheetNavigator) obj3).getState();
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) ((MutableState) obj2).getValue();
                navBackStackEntry.getClass();
                state.popWithTransition(navBackStackEntry, false);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ListsKt$$ExternalSyntheticLambda0(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }
}
