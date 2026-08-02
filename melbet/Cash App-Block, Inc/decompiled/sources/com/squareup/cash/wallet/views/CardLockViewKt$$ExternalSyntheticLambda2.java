package com.squareup.cash.wallet.views;

import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.material.textfield.IconHelper;
import com.squareup.cash.banking.viewmodels.AccountDetailsContent;
import com.squareup.cash.banking.views.BalanceHomeViewKt;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.views.CardArtImageKt;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.moneybot.views.plugins.SlottedMetricKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewModel;
import com.squareup.cash.paymentpad.views.HomeViewKt;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.views.notifications.EnableAliasSheetViewKt;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.shopping.autofill.views.AutofillSheetViewKt;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.franklin.ui.UiAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardLockViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CardLockViewKt$$ExternalSyntheticLambda2(Function1 function1, Alias alias, boolean z, int i, int i2) {
        this.$r8$classId = 19;
        this.f$1 = function1;
        this.f$2 = alias;
        this.f$0 = z;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        boolean z = this.f$0;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CardLockViewKt.LockAnimation(z, (Modifier) obj4, (LockAnimationColorTreatment) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                EmptyChatKt.m3629ViewfinderExternalSurfaceJQLjw8((Modifier) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                SimpleLayoutKt.TextFieldSelectionHandle(z, (ResolvedTextDirection) obj4, (TextFieldSelectionManager) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                LocalOpenTabCheckoutViewKt.PaymentTimingOptionRow((LocalCheckoutPaymentTimingViewModel.OptionViewModel) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                BalanceHomeViewKt.AccountDetails((AccountDetailsContent) obj4, (Function1) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                CanvasKt.HeartConfirmationEffect((Modifier) obj4, z, (HeartEdition) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                CanvasKt.MiniCardConfirmationEffect((Modifier) obj4, z, (MiniCardEdition) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                CanvasKt.WandConfirmationEffect((Modifier) obj4, z, (WandEdition) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AllowanceViewKt.U13CelebrationView((U13CelebrationViewModel) obj4, (Function1) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.ProvisionSuccess((FidesmoProvisioningViewModel.Success.Provisioned) obj4, (Function1) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                FidesmoProvisioningViewKt.SuccessAnimation(updateChangedFlags, (Composer) obj, (Modifier) obj4, (TagFormFactor) obj3, z);
                break;
            case 11:
                ((Integer) obj2).getClass();
                IconHelper.ComponentContainerWidget((GenericContainerViewModel.ComponentContainerViewModel) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                CardArtImageKt.BrandCardArt((Modifier) obj4, (InstrumentIcon.LocalBrand) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                SharedUIKt.LoadingBalanceAppletTile((InstalledAppletTileHeaderModel) obj4, (Function0) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                zzacn.MoneybotFeedbackView((MoneybotFeedbackViewModel) obj4, (Function1) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                SlottedMetricKt.AnimatedMetricAmountText((SlotContent.Metric) obj4, (TextStyle) obj3, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                TextCardKt.TextBubble((SlotContent.ProgressRing.Content.Text) obj3, (Modifier) obj4, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                TextCardKt.AvatarBubble((UiAvatar) obj3, (Modifier) obj4, z, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                HomeViewKt.LitePaymentPad((LitePaymentPadViewModel) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(385);
                EnableAliasSheetViewKt.AliasRow((Function1) obj4, (Alias) obj3, this.f$0, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
            default:
                ((Integer) obj2).intValue();
                AutofillSheetViewKt.AutofillSheet(z, (AutofillViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardLockViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = z;
        this.f$3 = i;
    }

    public /* synthetic */ CardLockViewKt$$ExternalSyntheticLambda2(Object obj, boolean z, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = z;
        this.f$2 = obj2;
        this.f$3 = i;
    }

    public /* synthetic */ CardLockViewKt$$ExternalSyntheticLambda2(Object obj, Modifier modifier, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$1 = modifier;
        this.f$0 = z;
        this.f$3 = i;
    }

    public /* synthetic */ CardLockViewKt$$ExternalSyntheticLambda2(boolean z, Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = i;
    }
}
