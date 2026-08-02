package com.squareup.cash.tax.views;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.shopping.viewmodels.ShopHubResultsListItem;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.chat.views.transcript.message.StatusTimestampView;
import com.squareup.cash.support.incidents.viewmodels.IncidentViewModel$SubscriptionAction;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportFullScreenActivityPickerViewModel;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.tax.viewmodels.TaxReturnsViewModel;
import com.squareup.cash.transactionpicker.viewmodels.TransactionViewModel;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsNuxViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewModel;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.ui.widget.SwitchSettingView;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxReturnsViewKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TaxReturnsViewKt$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                TaxReturnsViewModel taxReturnsViewModel = (TaxReturnsViewModel) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    String str = taxReturnsViewModel.buttonText;
                    str.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ShopHubResultsListItem.EmptyResult emptyResult = (ShopHubResultsListItem.EmptyResult) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ShopErrorKt.ShopEmptyView(MLKEMEngine.KyberPolyBytes, gapComposer2, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 16.0f), emptyResult.title, emptyResult.message);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                StatusTimestampView statusTimestampView = (StatusTimestampView) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                int i2 = StatusTimestampView.$r8$clinit;
                ((FlowRowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    statusTimestampView.StatusTimestampContent(statusTimestampView.getModel(), gapComposer3, 64);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                ContactSupportEmailMessageViewModel$Editing contactSupportEmailMessageViewModel$Editing = (ContactSupportEmailMessageViewModel$Editing) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    gapComposer4.skipToGroupEnd();
                } else if (contactSupportEmailMessageViewModel$Editing.showMinimumCharactersNotMetMessage) {
                    gapComposer4.startReplaceGroup(1034676746);
                    Trace.m1191Iconww6aTOc(Icons.AlertFill24, (String) null, (Modifier) null, 0L, gapComposer4, 54, 12);
                    String stringResource = Room.stringResource(gapComposer4, R.string.contact_support_ensure_minimum_character_message);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.danger, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(1034995798);
                    gapComposer4.end(false);
                }
                break;
            case 4:
                ScreenshotReviewViewModel.Uploaded uploaded = (ScreenshotReviewViewModel.Uploaded) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, uploaded.doneButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                ((Integer) obj3).getClass();
                ((PainterRequest) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) ((Composer) obj2);
                gapComposer6.startReplaceGroup(1196326577);
                AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(((DisputeRow) obj4).iconUrl, (RealImageLoader) gapComposer6.consume(LocalImageLoaderKt.LocalImageLoader), ContentScale.Companion.Crop, gapComposer6, 24576, 44);
                gapComposer6.end(false);
                break;
            case 6:
                SupportFullScreenActivityPickerViewModel supportFullScreenActivityPickerViewModel = (SupportFullScreenActivityPickerViewModel) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((EmbeddedHeaderScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    SupportFullScreenActivityPickerViewModel.Loaded loaded = (SupportFullScreenActivityPickerViewModel.Loaded) supportFullScreenActivityPickerViewModel;
                    if (loaded.headerTitle != null) {
                        gapComposer7.startReplaceGroup(23128568);
                        String str2 = loaded.headerTitle;
                        str2.getClass();
                        ScreenshotReviewViewKt.FullScreenActivityPickerHeader(str2, loaded.headerSubTitle, gapComposer7, 0);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(23314041);
                        gapComposer7.end(false);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 7:
                SupportIncidentDetailsViewModel.ButtonViewModel buttonViewModel = (SupportIncidentDetailsViewModel.ButtonViewModel) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    SupportIncidentDetailsViewModel.ButtonViewModel.Display display = (SupportIncidentDetailsViewModel.ButtonViewModel.Display) buttonViewModel;
                    Trace.m1191Iconww6aTOc(display.action == IncidentViewModel$SubscriptionAction.SUBSCRIBE ? Icons.Notifications24 : Icons.Check24, (String) null, (Modifier) null, 0L, gapComposer8, 48, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer8, (Modifier) null, ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, display.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 8:
                Link link = (Link) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, link.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 9:
                TransactionViewModel transactionViewModel = (TransactionViewModel) obj4;
                RealCellActivityAvatarScope realCellActivityAvatarScope = (RealCellActivityAvatarScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                realCellActivityAvatarScope.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(realCellActivityAvatarScope) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    realCellActivityAvatarScope.Avatar(AvatarsKt.toAvatarEntry(transactionViewModel.avatarViewModel, null, null, gapComposer10, 8, 3), gapComposer10, (intValue9 << 6) & 896);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 10:
                TextSetter textSetter = (TextSetter) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Countries.PageHeader((String) textSetter.textView, SizeKt.fillMaxWidth(companion, 1.0f), (Function2) null, (String) null, gapComposer11, 48, 12);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 11:
                AddMoneyViewModel addMoneyViewModel = (AddMoneyViewModel) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, addMoneyViewModel.getConfirmationButtonLabel(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 12:
                InstrumentDetailsViewModel.DefaultState defaultState = (InstrumentDetailsViewModel.DefaultState) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InstrumentDetailsViewModel.DefaultState.NotSet) defaultState).setDefaultButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 13:
                LinkedAccountsNuxViewModel linkedAccountsNuxViewModel = (LinkedAccountsNuxViewModel) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, linkedAccountsNuxViewModel.ctaLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 14:
                AddMoneyViewModel.ManagedAccountInstrumentPicker managedAccountInstrumentPicker = (AddMoneyViewModel.ManagedAccountInstrumentPicker) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, managedAccountInstrumentPicker.doneButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 15:
                WithdrawViewModel.ManagedAccountAmountEntry managedAccountAmountEntry = (WithdrawViewModel.ManagedAccountAmountEntry) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, managedAccountAmountEntry.continueButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 16:
                WithdrawViewModel.ManagedAccountConfirmation managedAccountConfirmation = (WithdrawViewModel.ManagedAccountConfirmation) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, managedAccountConfirmation.confirmButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 17:
                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadOptionViewModel.toggleButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 18:
                RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel = (RecurringReloadsChangeInstrumentViewModel) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsChangeInstrumentViewModel.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 19:
                ScheduledReloadConfirmationViewModel.Content content = (ScheduledReloadConfirmationViewModel.Content) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 20:
                WithdrawViewModel.ChangeAmount changeAmount = (WithdrawViewModel.ChangeAmount) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, changeAmount.saveAmountButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 21:
                RecurringReloadConfigurationViewModel.Keypad keypad = (RecurringReloadConfigurationViewModel.Keypad) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, keypad.getButtonLabel(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 22:
                RecurringReloadConfigurationViewModel.AtmPicker atmPicker = (RecurringReloadConfigurationViewModel.AtmPicker) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, atmPicker.getButtonLabel(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                break;
            case 23:
                RecurringReloadConfigurationViewModel.SelectFrequency selectFrequency = (RecurringReloadConfigurationViewModel.SelectFrequency) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selectFrequency.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                break;
            case 24:
                RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) obj4;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer24;
                if (gapComposer25.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selectScheduledAmountAtmPicker.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                break;
            case 25:
                RecurringReloadConfigurationViewModel.SelectDay selectDay = (RecurringReloadConfigurationViewModel.SelectDay) obj4;
                Composer composer25 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer25;
                if (gapComposer26.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selectDay.buttonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                break;
            case 26:
                Context context = (Context) obj4;
                Composer composer26 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer26;
                if (gapComposer27.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    String string2 = context.getString(R.string.retry);
                    string2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer27, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, string2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                int intValue27 = ((Integer) obj3).intValue();
                KProperty[] kPropertyArr = SwitchSettingView.$$delegatedProperties;
                ((View) obj).getClass();
                ((SwitchSettingView) obj4).getTextContainer().setMinimumHeight(intValue27);
                break;
            case 28:
                NullStateCarouselViewModel.Content content2 = (NullStateCarouselViewModel.Content) obj4;
                Composer composer27 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer27;
                if (gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer28, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                break;
            default:
                NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content = (NullStateViewModel$SwipeViewModel$Content) obj4;
                Composer composer28 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer28;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer29, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nullStateViewModel$SwipeViewModel$Content.button.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
