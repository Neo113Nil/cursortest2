package com.squareup.cash.tabs.views;

import android.graphics.Bitmap;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.glance.BitmapImageProvider;
import androidx.glance.ImageKt;
import androidx.glance.layout.ColumnScopeImplInstance;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.text.FontWeight;
import androidx.glance.text.TextAlign;
import androidx.glance.text.TextKt;
import androidx.glance.text.TextStyle;
import androidx.glance.unit.Dimension;
import androidx.glance.unit.FixedColorProvider;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.components.CenterLineAlignmentRowScopeInstance;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.viewmodels.BulletImage;
import com.squareup.cash.stablecoin.viewmodels.StablecoinHomeViewModel;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatErrorViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.support.chat.views.ChatErrorDialogView;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda6;
import com.squareup.cash.support.chat.views.transcript.message.SuggestedRepliesViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetViewModel;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel;
import com.squareup.cash.support.views.ScreenshotConfirmViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.ScreenshotReviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.SupportArticleIncidentsSheetView;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.LinkedAccountsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetData;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewModel;
import com.squareup.cash.wallet.views.ArcadeCardControlDialog;
import com.squareup.cash.wallet.views.ArcadeCardControlDialog$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.views.ArcadeCardControlDialog$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Text;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$com$squareup$cash$transfers$views$composer$RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        RecurringReloadConfigurationViewModel.Keypad keypad = (RecurringReloadConfigurationViewModel.Keypad) this.f$0;
        Function0 function0 = (Function0) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            SizeKt.ButtonCta(function0, SpacerKt.imePadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f)), ButtonProminence.PROMINENT, false, keypad.getEnableContinue(), null, Expect_jvmKt.rememberComposableLambda(-843705309, new TaxReturnsViewKt$$ExternalSyntheticLambda5(keypad, 21), gapComposer), gapComposer, 1573248, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$composer$RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        RecurringReloadConfigurationViewModel.AtmPicker atmPicker = (RecurringReloadConfigurationViewModel.AtmPicker) this.f$0;
        Function0 function0 = (Function0) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            SizeKt.ButtonCta(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ButtonProminence.PROMINENT, false, atmPicker.getEnableContinue(), null, Expect_jvmKt.rememberComposableLambda(-228839767, new TaxReturnsViewKt$$ExternalSyntheticLambda5(atmPicker, 22), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$composer$ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        RecurringReloadConfigurationViewModel.SelectFrequency selectFrequency = (RecurringReloadConfigurationViewModel.SelectFrequency) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = selectFrequency.enableContinue;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda5(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-1738552985, new TaxReturnsViewKt$$ExternalSyntheticLambda5(selectFrequency, 23), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$composer$ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) this.f$0;
        Function0 function0 = (Function0) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            SizeKt.ButtonCta(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ButtonProminence.PROMINENT, false, selectScheduledAmountAtmPicker.enableContinue, null, Expect_jvmKt.rememberComposableLambda(-2039616605, new TaxReturnsViewKt$$ExternalSyntheticLambda5(selectScheduledAmountAtmPicker, 24), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$composer$ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        RecurringReloadConfigurationViewModel.SelectDay selectDay = (RecurringReloadConfigurationViewModel.SelectDay) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = selectDay.enableContinue;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda5(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(1923279719, new TaxReturnsViewKt$$ExternalSyntheticLambda5(selectDay, 25), gapComposer), gapComposer, 1573296, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$ui$qrcodes$widget$CashQrWidgetKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) this.f$0;
        CashQrWidgetData cashQrWidgetData = (CashQrWidgetData) this.f$1;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        ((ColumnScopeImplInstance) obj).getClass();
        ImageKt.m1115ImageGCr5PR4(new BitmapImageProvider(bitmap), cashQrWidgetData.cashtag, new WidthModifier(), composer, 0);
        String str = cashQrWidgetData.cashtag;
        if (str == null || str.length() == 0) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-2133096637);
            gapComposer.end(false);
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-2133513711);
            androidx.glance.layout.SpacerKt.Spacer(new HeightModifier(new Dimension.Dp()), gapComposer2, 0);
            TextKt.Text(cashQrWidgetData.cashtag, new WidthModifier().then(new HeightModifier(Dimension.Wrap.INSTANCE)), new TextStyle(new FixedColorProvider(Color.Black), new TextUnit(Room.getSp(13)), new FontWeight(), new TextAlign(), 104), 0, gapComposer2, 0, 8);
            gapComposer2.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$wallet$views$ArcadeCardControlDialog$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        CardControlDialogViewModel cardControlDialogViewModel = (CardControlDialogViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = ArcadeCardControlDialog.$r8$clinit;
        modalButtonScope.getClass();
        int i2 = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        int i3 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            CardControlDialogViewModel.Button button = cardControlDialogViewModel.primaryButton;
            boolean z = button.isDestructive;
            Object obj4 = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-2132700584);
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(button);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == obj4) {
                    rememberedValue = new ArcadeCardControlDialog$$ExternalSyntheticLambda3(function1, button, i3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modalButtonScope.PrimaryModalButtonDestructive(((intValue << 12) & 57344) | 3072, 6, gapComposer, Expect_jvmKt.rememberComposableLambda(1433946208, new ArcadeCardControlDialog$$ExternalSyntheticLambda4(button, i3), gapComposer), null, (Function0) rememberedValue, false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2132536253);
                boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(button);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == obj4) {
                    rememberedValue2 = new ArcadeCardControlDialog$$ExternalSyntheticLambda3(function1, button, i2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                modalButtonScope.PrimaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(904173969, new ArcadeCardControlDialog$$ExternalSyntheticLambda4(button, i2), gapComposer), gapComposer, ((intValue << 12) & 57344) | 3072, 6);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$wallet$views$ArcadeCardControlDialog$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$0;
        CardControlDialogViewModel.Button button = (CardControlDialogViewModel.Button) this.f$1;
        ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = ArcadeCardControlDialog.$r8$clinit;
        modalButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(modalButtonScope) ? 4 : 2;
        }
        int i2 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(button);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeCardControlDialog$$ExternalSyntheticLambda3(function1, button, i2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modalButtonScope.SecondaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(-110313403, new ArcadeCardControlDialog$$ExternalSyntheticLambda4(button, i2), gapComposer), gapComposer, ((intValue << 12) & 57344) | 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:343:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0b74  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.$r8$classId;
        int i2 = 9;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 16;
        Object obj4 = Composer.Companion.Empty;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                TabToolbarInternalViewModel tabToolbarInternalViewModel = (TabToolbarInternalViewModel) obj6;
                Function3 function3 = (Function3) obj5;
                BoxScope boxScope = (BoxScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                boxScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    gapComposer.skipToGroupEnd();
                } else if (tabToolbarInternalViewModel.moneybotSpacesButton == null) {
                    gapComposer.startReplaceGroup(223351606);
                    function3.invoke(boxScope, gapComposer, Integer.valueOf(intValue & 14));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(223375631);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                BulletImage bulletImage = (BulletImage) obj6;
                SquareLoyaltyDetailsView squareLoyaltyDetailsView = (SquareLoyaltyDetailsView) obj5;
                CenterLineAlignmentRowScopeInstance centerLineAlignmentRowScopeInstance = (CenterLineAlignmentRowScopeInstance) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                centerLineAlignmentRowScopeInstance.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(centerLineAlignmentRowScopeInstance) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    gapComposer2.skipToGroupEnd();
                } else if (bulletImage instanceof BulletImage.LocalImage) {
                    gapComposer2.startReplaceGroup(-1889211470);
                    squareLoyaltyDetailsView.LocalBulletImage(centerLineAlignmentRowScopeInstance, (BulletImage.LocalImage) bulletImage, gapComposer2, (intValue2 & 14) | MLKEMEngine.KyberPolyBytes);
                    gapComposer2.end(false);
                } else {
                    if (!(bulletImage instanceof BulletImage.RemoteImage)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -1889212753, false);
                    }
                    gapComposer2.startReplaceGroup(-1889208396);
                    squareLoyaltyDetailsView.RemoteBulletImage(centerLineAlignmentRowScopeInstance, (BulletImage.RemoteImage) bulletImage, gapComposer2, (intValue2 & 14) | MLKEMEngine.KyberPolyBytes);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            case 2:
                DirectoryListItem.Footer footer = (DirectoryListItem.Footer) obj6;
                Function1 function1 = (Function1) obj5;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    FetcherKt fetcherKt = footer.actionButton.content;
                    if (fetcherKt != null) {
                        Button$Content$Text button$Content$Text = fetcherKt instanceof Button$Content$Text ? (Button$Content$Text) fetcherKt : null;
                        if (button$Content$Text != null) {
                            str = button$Content$Text.value;
                            if (str != null) {
                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                return null;
                            }
                            boolean changed = gapComposer3.changed(function1) | gapComposer3.changedInstance(footer);
                            Object rememberedValue = gapComposer3.rememberedValue();
                            if (changed || rememberedValue == obj4) {
                                rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(24, function1, footer);
                                gapComposer3.updateRememberedValue(rememberedValue);
                            }
                            KeypadKt.m3640ButtonGFipHI0(str, (Function0) rememberedValue, androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(companion, null, 3), null, MooncakePillButton.Size.SMALL, MooncakePillButton.Style.SECONDARY, null, false, 0, null, null, gapComposer3, 221568, 0, 4040);
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                StablecoinHomeViewModel.NullStateCarousel nullStateCarousel = (StablecoinHomeViewModel.NullStateCarousel) obj;
                Composer composer4 = (Composer) obj2;
                ((Integer) obj3).getClass();
                nullStateCarousel.getClass();
                nullStateCarousel.swipeViewModel.Show(Expect_jvmKt.rememberComposableLambda(1286507681, new PoolDetailsViewKt$$ExternalSyntheticLambda41(i2, (Function1) obj6, (RealImageLoader) obj5), composer4), composer4, 6);
                return Unit.INSTANCE;
            case 4:
                ChatErrorViewModel chatErrorViewModel = (ChatErrorViewModel) obj6;
                Composer composer5 = (Composer) obj2;
                ((Integer) obj3).getClass();
                int i4 = ChatErrorDialogView.$r8$clinit;
                ((ChatErrorViewModel) obj).getClass();
                ModalKt.Modal((Modifier) null, chatErrorViewModel.title, chatErrorViewModel.message, Expect_jvmKt.rememberComposableLambda(741846262, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(21, (Function1) obj5), composer5), (Function3) null, (Function3) null, composer5, 3072, 49);
                return Unit.INSTANCE;
            case 5:
                Function1 function12 = (Function1) obj6;
                final ChatExitPromptSheetViewModel.Prompt prompt = (ChatExitPromptSheetViewModel.Prompt) obj5;
                Composer composer6 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer6;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean changed2 = gapComposer4.changed(function12);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(4, function12);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    final int i5 = r2 ? 1 : 0;
                    SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-988871387, new Function3() { // from class: com.squareup.cash.support.chat.views.ChatExitPromptSheetViewKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i6 = i5;
                            ChatExitPromptSheetViewModel.Prompt prompt2 = prompt;
                            switch (i6) {
                                case 0:
                                    Composer composer7 = (Composer) obj8;
                                    int intValue5 = ((Integer) obj9).intValue();
                                    ((RowScope) obj7).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer7;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (androidx.compose.ui.text.TextStyle) null, (TextLineBalancing) null, prompt2.saveAndContinueButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer8 = (Composer) obj8;
                                    int intValue6 = ((Integer) obj9).intValue();
                                    ((RowScope) obj7).getClass();
                                    GapComposer gapComposer6 = (GapComposer) composer8;
                                    if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (androidx.compose.ui.text.TextStyle) null, (TextLineBalancing) null, prompt2.endConversationButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4), gapComposer4, 1573296, 56);
                    boolean changed3 = gapComposer4.changed(function12);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(5, function12);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    final int i6 = 1;
                    SizeKt.ButtonCta((Function0) rememberedValue3, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(1770686492, new Function3() { // from class: com.squareup.cash.support.chat.views.ChatExitPromptSheetViewKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i62 = i6;
                            ChatExitPromptSheetViewModel.Prompt prompt2 = prompt;
                            switch (i62) {
                                case 0:
                                    Composer composer7 = (Composer) obj8;
                                    int intValue5 = ((Integer) obj9).intValue();
                                    ((RowScope) obj7).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer7;
                                    if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (androidx.compose.ui.text.TextStyle) null, (TextLineBalancing) null, prompt2.saveAndContinueButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer8 = (Composer) obj8;
                                    int intValue6 = ((Integer) obj9).intValue();
                                    ((RowScope) obj7).getClass();
                                    GapComposer gapComposer6 = (GapComposer) composer8;
                                    if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (androidx.compose.ui.text.TextStyle) null, (TextLineBalancing) null, prompt2.endConversationButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4), gapComposer4, 1573296, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ArrayList arrayList = (ArrayList) obj6;
                ChatView$$ExternalSyntheticLambda6 chatView$$ExternalSyntheticLambda6 = (ChatView$$ExternalSyntheticLambda6) obj5;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer7).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer7;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    List<ChatContentViewModel.SuggestedRepliesViewModel.SuggestedReplyViewModel> reversed = CollectionsKt.reversed(arrayList);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(reversed, 10));
                    GapComposer gapComposer6 = gapComposer5;
                    for (ChatContentViewModel.SuggestedRepliesViewModel.SuggestedReplyViewModel suggestedReplyViewModel : reversed) {
                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        boolean changed4 = gapComposer6.changed(chatView$$ExternalSyntheticLambda6) | gapComposer6.changedInstance(suggestedReplyViewModel);
                        Object rememberedValue4 = gapComposer6.rememberedValue();
                        if (changed4 || rememberedValue4 == obj4) {
                            rememberedValue4 = new ShareSheetViewKt$$ExternalSyntheticLambda5(29, chatView$$ExternalSyntheticLambda6, suggestedReplyViewModel);
                            gapComposer6.updateRememberedValue(rememberedValue4);
                        }
                        GapComposer gapComposer7 = gapComposer6;
                        SizeKt.ButtonCta((Function0) rememberedValue4, horizontalWeight, null, false, false, null, Expect_jvmKt.rememberComposableLambda(726476777, new SuggestedRepliesViewKt$$ExternalSyntheticLambda4(suggestedReplyViewModel, 1), gapComposer6), gapComposer7, 1572864, 60);
                        arrayList2.add(Unit.INSTANCE);
                        gapComposer6 = gapComposer7;
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function13 = (Function1) obj6;
                ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Failure failure = (ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Failure) obj5;
                ((Integer) obj3).getClass();
                ((ContactSupportEmailInputViewModel$Loaded) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) ((Composer) obj2);
                boolean changed5 = gapComposer8.changed(function13);
                Object rememberedValue5 = gapComposer8.rememberedValue();
                if (changed5 || rememberedValue5 == obj4) {
                    rememberedValue5 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(26, function13);
                    gapComposer8.updateRememberedValue(rememberedValue5);
                }
                ScreenshotReviewViewKt.InvalidEmailDialog(0, gapComposer8, null, failure.title, failure.body, Room.stringResource(gapComposer8, R.string.contact_support_email_validation_failed_confirmation), (Function0) rememberedValue5);
                return Unit.INSTANCE;
            case 8:
                Function1 function14 = (Function1) obj6;
                ContactSupportEmailMessageViewModel$Editing.StatusResult statusResult = (ContactSupportEmailMessageViewModel$Editing.StatusResult) obj5;
                ((Integer) obj3).getClass();
                ((ContactSupportEmailMessageViewModel$Editing) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) ((Composer) obj2);
                boolean changed6 = gapComposer9.changed(function14);
                Object rememberedValue6 = gapComposer9.rememberedValue();
                if (changed6 || rememberedValue6 == obj4) {
                    rememberedValue6 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(29, function14);
                    gapComposer9.updateRememberedValue(rememberedValue6);
                }
                Function0 function0 = (Function0) rememberedValue6;
                String str2 = statusResult.title;
                String str3 = statusResult.body;
                if (str3 == null) {
                    str3 = re$$ExternalSyntheticOutline0.m(gapComposer9, 1268301125, R.string.contact_support_email_message_failed_body_text, gapComposer9, false);
                } else {
                    gapComposer9.startReplaceGroup(1268299978);
                    gapComposer9.end(false);
                }
                ScreenshotReviewViewKt.FailedMessageSubmitDialog(0, gapComposer9, null, str2, str3, Room.stringResource(gapComposer9, R.string.contact_support_email_message_failed_confirmation), function0);
                return Unit.INSTANCE;
            case 9:
                ScreenshotReviewViewModel.Uploading uploading = (ScreenshotReviewViewModel.Uploading) obj6;
                Function1 function15 = (Function1) obj5;
                Composer composer8 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 16.0f);
                    androidx.compose.ui.text.TextStyle textStyle = ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    long j = colors.semantic.text.subtle;
                    Integer valueOf = Integer.valueOf(uploading.uploadCount);
                    Integer valueOf2 = Integer.valueOf(uploading.totalCount);
                    ArrayMap arrayMap = new ArrayMap(2);
                    arrayMap.put("total", valueOf2);
                    arrayMap.put("current", valueOf);
                    String format2 = new MessageFormat(Room.stringResource(gapComposer10, R.string.support_screenshot_review_sending_status)).format(arrayMap);
                    format2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, j, (Composer) gapComposer10, m298padding3ABfNKs, textStyle, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed7 = gapComposer10.changed(function15);
                    Object rememberedValue7 = gapComposer10.rememberedValue();
                    if (changed7 || rememberedValue7 == obj4) {
                        rememberedValue7 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(6, function15);
                        gapComposer10.updateRememberedValue(rememberedValue7);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue7, fillMaxWidth2, buttonProminence2, false, false, null, ScreenshotReviewViewKt.lambda$242623696, gapComposer10, 1573296, 56);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ScreenshotReviewViewModel screenshotReviewViewModel = (ScreenshotReviewViewModel) obj6;
                Function1 function16 = (Function1) obj5;
                Composer composer9 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (!gapComposer11.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    gapComposer11.skipToGroupEnd();
                } else if (screenshotReviewViewModel.getScreenshotList().isEmpty()) {
                    gapComposer11.startReplaceGroup(545697491);
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed8 = gapComposer11.changed(function16);
                    Object rememberedValue8 = gapComposer11.rememberedValue();
                    if (changed8 || rememberedValue8 == obj4) {
                        rememberedValue8 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(11, function16);
                        gapComposer11.updateRememberedValue(rememberedValue8);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue8, fillMaxWidth3, buttonProminence3, false, false, null, ScreenshotReviewViewKt.f696lambda$1778010247, gapComposer11, 1573296, 56);
                    gapComposer11.end(false);
                } else {
                    gapComposer11.startReplaceGroup(545106693);
                    ButtonProminence buttonProminence4 = ButtonProminence.SUBTLE;
                    Modifier fillMaxWidth4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed9 = gapComposer11.changed(function16);
                    Object rememberedValue9 = gapComposer11.rememberedValue();
                    if (changed9 || rememberedValue9 == obj4) {
                        rememberedValue9 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(i2, function16);
                        gapComposer11.updateRememberedValue(rememberedValue9);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth4, buttonProminence4, false, false, null, ScreenshotReviewViewKt.lambda$1605808, gapComposer11, 1573296, 56);
                    ButtonProminence buttonProminence5 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed10 = gapComposer11.changed(function16);
                    Object rememberedValue10 = gapComposer11.rememberedValue();
                    if (changed10 || rememberedValue10 == obj4) {
                        rememberedValue10 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(10, function16);
                        gapComposer11.updateRememberedValue(rememberedValue10);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth5, buttonProminence5, false, false, null, ScreenshotReviewViewKt.lambda$1457024423, gapComposer11, 1573296, 56);
                    gapComposer11.end(false);
                }
                return Unit.INSTANCE;
            case 11:
                ScreenshotReviewViewModel screenshotReviewViewModel2 = (ScreenshotReviewViewModel) obj6;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj5;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer10 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer10).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    String stringResource = Room.stringResource(gapComposer12, R.string.support_screenshot_review_title);
                    String format3 = new MessageFormat(Room.stringResource(gapComposer12, R.string.support_screenshot_review_subtitle)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(screenshotReviewViewModel2.getScreenshotList().size()), "count"));
                    format3.getClass();
                    Countries.PageHeader(stringResource, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, ScreenScaffoldKt.markAsScaffoldTitle(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), lazyScaffoldContentScope, gapComposer12, 6)), (Function2) null, format3, gapComposer12, 0, 4);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer12, null);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Function1 function17 = (Function1) obj6;
                ScreenshotReviewViewModel.Uploaded uploaded = (ScreenshotReviewViewModel.Uploaded) obj5;
                Composer composer11 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 16.0f);
                    androidx.compose.ui.text.TextStyle textStyle2 = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors2 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, colors2.semantic.text.subtle, (Composer) gapComposer13, m298padding3ABfNKs2, textStyle2, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.support_screenshot_review_send_successfully), (Map) null, (Function1) null, false);
                    ButtonProminence buttonProminence6 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth6 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed11 = gapComposer13.changed(function17);
                    Object rememberedValue11 = gapComposer13.rememberedValue();
                    if (changed11 || rememberedValue11 == obj4) {
                        rememberedValue11 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(8, function17);
                        gapComposer13.updateRememberedValue(rememberedValue11);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue11, fillMaxWidth6, buttonProminence6, false, false, null, Expect_jvmKt.rememberComposableLambda(1614619998, new TaxReturnsViewKt$$ExternalSyntheticLambda5(uploaded, 4), gapComposer13), gapComposer13, 1573296, 56);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                SupportArticleIncidentsSheetViewModel supportArticleIncidentsSheetViewModel = (SupportArticleIncidentsSheetViewModel) obj6;
                Function1 function18 = (Function1) obj5;
                Composer composer12 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                int i7 = SupportArticleIncidentsSheetView.$r8$clinit;
                ((SupportArticleIncidentsSheetViewModel) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    ScreenshotReviewViewKt.SheetContent(supportArticleIncidentsSheetViewModel, function18, gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                DisputeRow disputeRow = (DisputeRow) obj6;
                Icons icons = (Icons) obj5;
                RealCellActivityAvatarScope realCellActivityAvatarScope = (RealCellActivityAvatarScope) obj;
                Composer composer13 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                realCellActivityAvatarScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer13).changed(realCellActivityAvatarScope) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (gapComposer15.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    String valueOf3 = String.valueOf(StringsKt___StringsKt.first(disputeRow.displayName));
                    Colors colors3 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    long j2 = colors3.semantic.background.brand;
                    String str4 = disputeRow.iconUrl;
                    if (str4 == null) {
                        str4 = "";
                    }
                    realCellActivityAvatarScope.m3395AvatarOadGlvw(valueOf3, j2, new AvatarImage.Remote.Image(str4, false, icons != null ? new AvatarImage.LocalIcon(icons, 0L, 6) : null, 0L, new TaxReturnsViewKt$$ExternalSyntheticLambda5(disputeRow, 5), 58), null, gapComposer15, (intValue11 << 18) & 3670016, 56);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                SupportHomeContactOptionsSheetViewModel supportHomeContactOptionsSheetViewModel = (SupportHomeContactOptionsSheetViewModel) obj6;
                Function1 function19 = (Function1) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer14 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer14).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    Modifier fillMaxWidth7 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(androidx.compose.foundation.ImageKt.m177backgroundbw27NRU(fillMaxWidth7, colors4.semantic.background.f1047app, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, paddingValues.mo267calculateTopPaddingD9Ej5fM(), RecyclerView.DECELERATION_RATE, paddingValues.mo264calculateBottomPaddingD9Ej5fM(), 5);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer16, 0);
                    int hashCode = Long.hashCode(gapComposer16.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer16.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer16, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer16.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer16.startReusableNode();
                    if (gapComposer16.inserting) {
                        gapComposer16.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer16.useNode();
                    }
                    Updater.m576setimpl(gapComposer16, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer16, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer16, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer16, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer16, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Transformations.SheetHeader(Room.stringResource(gapComposer16, R.string.support_home_contact_options_sheet_title), (Modifier) null, (Function2) null, (String) null, gapComposer16, 0, 14);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer16, null);
                    ScreenshotReviewViewKt.OptionCells(supportHomeContactOptionsSheetViewModel, function19, gapComposer16, 0);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer16, null);
                    boolean changed12 = gapComposer16.changed(function19);
                    Object rememberedValue12 = gapComposer16.rememberedValue();
                    if (changed12 || rememberedValue12 == obj4) {
                        rememberedValue12 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(25, function19);
                        gapComposer16.updateRememberedValue(rememberedValue12);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue12, SpacerKt.m298padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 16.0f), ButtonProminence.STANDARD, false, false, null, ScreenshotReviewViewKt.lambda$165823103, gapComposer16, 1573296, 56);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer16, null);
                    gapComposer16.end(true);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Function1 function110 = (Function1) obj6;
                SupportIncidentDetailsViewModel.ButtonViewModel buttonViewModel = (SupportIncidentDetailsViewModel.ButtonViewModel) obj5;
                Composer composer15 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    boolean changed13 = gapComposer17.changed(function110) | gapComposer17.changedInstance(buttonViewModel);
                    Object rememberedValue13 = gapComposer17.rememberedValue();
                    if (changed13 || rememberedValue13 == obj4) {
                        rememberedValue13 = new TaxWebAppBridge$$ExternalSyntheticLambda0(i2, function110, buttonViewModel);
                        gapComposer17.updateRememberedValue(rememberedValue13);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue13, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(578343205, new TaxReturnsViewKt$$ExternalSyntheticLambda5(buttonViewModel, 7), gapComposer17), gapComposer17, 1572912, 60);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                AndroidPath androidPath = (AndroidPath) obj;
                Size size = (Size) obj2;
                LayoutDirection layoutDirection = (LayoutDirection) obj3;
                androidPath.getClass();
                layoutDirection.getClass();
                float mo236toPx0680j_4 = 2.0f * ((Density) obj6).mo236toPx0680j_4(2.0f);
                ColorKt.addOutline(androidPath, ((Shape) obj5).mo175createOutlinePq9zytI((Float.floatToRawIntBits(Float.intBitsToFloat((int) (size.packedValue >> 32)) - mo236toPx0680j_4) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (size.packedValue & BodyPartID.bodyIdMax)) - mo236toPx0680j_4) & BodyPartID.bodyIdMax), layoutDirection, SizeKt.Density$default()));
                androidPath.m667translatek4lQ0M((Float.floatToRawIntBits(r5) << 32) | (Float.floatToRawIntBits(r5) & BodyPartID.bodyIdMax));
                return Unit.INSTANCE;
            case 18:
                Function1 function111 = (Function1) obj6;
                WithdrawViewModel.ManagedAccountConfirmation managedAccountConfirmation = (WithdrawViewModel.ManagedAccountConfirmation) obj5;
                Composer composer16 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer16;
                if (gapComposer18.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ButtonProminence buttonProminence7 = ButtonProminence.PROMINENT;
                    boolean changed14 = gapComposer18.changed(function111);
                    Object rememberedValue14 = gapComposer18.rememberedValue();
                    if (changed14 || rememberedValue14 == obj4) {
                        rememberedValue14 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(12, function111);
                        gapComposer18.updateRememberedValue(rememberedValue14);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue14, null, buttonProminence7, false, true, null, Expect_jvmKt.rememberComposableLambda(-544298125, new TaxReturnsViewKt$$ExternalSyntheticLambda5(managedAccountConfirmation, i3), gapComposer18), gapComposer18, 1597824, 42);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ScheduledReloadConfirmationViewModel.Content content = (ScheduledReloadConfirmationViewModel.Content) obj6;
                Function1 function112 = (Function1) obj5;
                Composer composer17 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer17;
                if (gapComposer19.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    ButtonProminence buttonProminence8 = ButtonProminence.PROMINENT;
                    boolean z = content.buttonEnabled;
                    boolean changed15 = gapComposer19.changed(function112);
                    Object rememberedValue15 = gapComposer19.rememberedValue();
                    if (changed15 || rememberedValue15 == obj4) {
                        rememberedValue15 = new HeroCardViewKt$$ExternalSyntheticLambda5(15, function112);
                        gapComposer19.updateRememberedValue(rememberedValue15);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue15, null, buttonProminence8, false, z, null, Expect_jvmKt.rememberComposableLambda(-1641505714, new TaxReturnsViewKt$$ExternalSyntheticLambda5(content, 19), gapComposer19), gapComposer19, 1573248, 42);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                AmountDisplayState amountDisplayState = (AmountDisplayState) obj6;
                Function0 function02 = (Function0) obj5;
                Function2 function2 = (Function2) obj;
                Composer composer18 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                function2.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer18).changedInstance(function2) ? 4 : 2;
                }
                int i8 = intValue16;
                GapComposer gapComposer20 = (GapComposer) composer18;
                boolean shouldExecute = gapComposer20.shouldExecute(i8 & 1, (i8 & 19) != 18);
                Applier applier = gapComposer20.applier;
                if (shouldExecute) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer20, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer20.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer20, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf4 = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer20, valueOf4, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer20, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer20, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    AddMoneyViewKt.InternalTransfersAmountDisplay(amountDisplayState, null, function02, gapComposer20, 0, 2);
                    Modifier alpha = AlphaKt.alpha(companion, RecyclerView.DECELERATION_RATE);
                    Object rememberedValue16 = gapComposer20.rememberedValue();
                    if (rememberedValue16 == obj4) {
                        rememberedValue16 = new TaxWebAppBridge$$ExternalSyntheticLambda1(22);
                        gapComposer20.updateRememberedValue(rememberedValue16);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(alpha, (Function1) rememberedValue16);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer20, clearAndSetSemantics);
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer20.useNode();
                    }
                    Updater.m576setimpl(gapComposer20, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer20, composeUiNode$Companion$SetModifier$13, gapComposer20, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer20, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline2.m(i8 & 14, function2, gapComposer20, true, true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                return invoke$com$squareup$cash$transfers$views$composer$RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$transfers$views$composer$RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$transfers$views$composer$ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$transfers$views$composer$ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$transfers$views$composer$ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$ui$qrcodes$widget$CashQrWidgetKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$wallet$views$ArcadeCardControlDialog$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$wallet$views$ArcadeCardControlDialog$$ExternalSyntheticLambda1(obj, obj2, obj3);
            default:
                CardAppletTileViewModel cardAppletTileViewModel = (CardAppletTileViewModel) obj6;
                StyledCardViewModel styledCardViewModel = (StyledCardViewModel) obj5;
                Composer composer19 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer19;
                if (gapComposer21.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    CardAppletTileViewModel.WithCardUi withCardUi = (CardAppletTileViewModel.WithCardUi) cardAppletTileViewModel;
                    if (withCardUi instanceof CardAppletTileViewModel.Installed) {
                        gapComposer21.startReplaceGroup(-728610392);
                        CardAppletTileViewModel.Installed installed = (CardAppletTileViewModel.Installed) cardAppletTileViewModel;
                        CardAppletTileKt.CardWithPill(installed.use3D, installed.disableFilament, installed.model, installed.pill, styledCardViewModel, gapComposer21, 196608);
                        gapComposer21.end(false);
                    } else if (withCardUi instanceof CardAppletTileViewModel.Uninstalled) {
                        gapComposer21.startReplaceGroup(-728599471);
                        CardAppletTileViewModel.Uninstalled uninstalled = (CardAppletTileViewModel.Uninstalled) cardAppletTileViewModel;
                        CardAppletTileKt.RevolvingCardWithPill(null, uninstalled.use3D, uninstalled.rotatingCards, uninstalled.animateCardIntro, uninstalled.disableFilament, uninstalled.showingCardGrid, gapComposer21, 0);
                        gapComposer21.end(false);
                    } else {
                        gapComposer21.startReplaceGroup(-728589339);
                        gapComposer21.end(false);
                    }
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
