package com.squareup.cash.ui;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.SpecialEffectsController$Companion;
import androidx.media3.ui.SubtitleViewUtils;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.components.CenterLineAlignmentRowScopeInstance;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsAutofillViewModel;
import com.squareup.cash.shopping.settings.viewmodels.ShoppingSettingsViewModel;
import com.squareup.cash.shopping.settings.views.ErrorDialogKt;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.viewmodels.BulletImage;
import com.squareup.cash.shopping.viewmodels.LogoImage;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatImageDetailViewModel;
import com.squareup.cash.support.chat.views.ChatExitPromptViewKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.support.viewmodels.PhoneVerificationViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.article.ArticleViewKt;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorDialogViewModel;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.primitives.TaxTooltipModel;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileModel;
import com.squareup.cash.tax.views.TaxReturnsViewKt;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.composer.ScheduledReloadConfigurationComposersKt;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.wallet.viewmodels.CardLockHalfSheetModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.wallet.views.WalletHomeViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class AlertBannerKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$4;

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda4(int i, int i2, Modifier modifier, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AlertBannerKt.AlertBanner((AlertBannerViewModel) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ErrorDialogKt.ShoppingSettingsAutofillView((ShoppingSettingsAutofillViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ErrorDialogKt.ShoppingSettingsView((ShoppingSettingsViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                FragmentKt.LoanLimitReachedContent((LocalizedMoneyFormatter.Factory) obj5, (CheckoutScreenType.LoanLimitReached) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                SpecialEffectsController$Companion.LoanLimitReachedErrorContent((LocalizedMoneyFormatter.Factory) obj5, (CheckoutScreenType.LoanLimitReachedError) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj5).LocalBulletImage((CenterLineAlignmentRowScopeInstance) obj4, (BulletImage.LocalImage) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj5).RemoteBulletImage((CenterLineAlignmentRowScopeInstance) obj4, (BulletImage.RemoteImage) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj5).BulletedSheetAvatar((Modifier) obj3, (LogoImage.AvatarModel) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ChatExitPromptViewKt.Image((ChatImageDetailViewModel) obj5, (RealImageLoader) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                MessageFileKt.MessageContainer((ChatContentViewModel.MessageViewModel) obj5, (Modifier) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.ButtonOrSubmitting((ContactSupportEmailMessageViewModel$Editing) obj5, (Function1) obj4, (TextFieldState) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.VerificationButtons((PhoneVerificationViewModel.Loaded.Status) obj5, (PhoneVerificationViewModel.Loaded.ButtonViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                ArticleViewKt.Link((Article.Appearance) obj5, (Link) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                TapToPayKt.TapToPayErrorDialog((TapToPayErrorDialogViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj5).UI((TaxesAppletTileModel) obj4, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                TaxReturnsViewKt.TaxDesktopToolTipContent((Modifier) obj3, (TaxTooltipModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                SubtitleViewUtils.ThreeDsView((ThreeDsViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.InstrumentLinkingOptionsSheetView((InstrumentLinkingOptionsViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.LinkedAccountsContent((LinkedAccountsViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.ManagedAccountConfirmationContent((Modifier) obj3, (WithdrawViewModel.ManagedAccountConfirmation) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.RecurringReloadOptionContent((RecurringReloadOptionViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.ScheduledReloadConfirmationContent((ScheduledReloadConfirmationViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ScheduledReloadConfigurationComposersKt.FrequencyPickerContent((Modifier) obj3, (RecurringReloadConfigurationViewModel.SelectFrequency) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                UtilsKt.CardLockHalfSheetView((CardLockHalfSheetModel) obj5, (Function2) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                HeroCardViewKt.CopyNumber((Modifier) obj3, (CardSchemeViewModel.Module.Accessory.Button) obj5, (MutableInteractionSourceImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                HeroCardViewKt.LockUnlockToggle((Modifier) obj3, (CardSchemeViewModel.Module.HeroCard) obj5, (CardSchemeViewModel.Module.Accessory.Button) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                HeroCardViewKt.Render((CardSchemeViewModel.Module.HeroCard) obj5, (Modifier) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                UtilsKt.Render((CardSchemeViewModel.Module.NextUpCard) obj5, (Modifier) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                UtilsKt.Disclosure((CardSchemeViewModel.Module.Disclosure) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                WalletHomeViewKt.CombinedCardHomeActions((TitleBarActionScope) obj5, (List) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
        this.f$4 = i;
    }
}
