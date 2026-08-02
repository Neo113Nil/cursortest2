package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewModel;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.util.cash.Countries;
import com.stripe.android.cards.DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.image.DefaultStripeImageLoader;
import com.stripe.android.uicore.image.StripeImageKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda32 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda32(Modifier modifier, CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, Function0 function0, boolean z, int i) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = heroCardDetails;
        this.f$2 = function0;
        this.f$3 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        boolean z = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                HeroCardViewKt.SlimCardRender((Modifier) obj5, (CardSchemeViewModel.Module.HeroCardDetails) obj4, (Function0) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                CameraXPreviewKt.CashQrCameraXScanner((CashQrScannerViewModel) obj4, (Function1) obj3, (Modifier) obj5, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                WalletHomeViewKt.CardHomeActionButton((String) obj5, (Icons) obj4, this.f$3, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 3:
                TakeBreakBottomSheetViewModel.BreakItem breakItem = (TakeBreakBottomSheetViewModel.BreakItem) obj5;
                Function1 function1 = (Function1) obj4;
                MutableState mutableState = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changedInstance = gapComposer.changedInstance(breakItem) | gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda9(breakItem, function1, mutableState, 11);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCompact((Function0) rememberedValue, null, null, false, ((String) mutableState.getValue()) == null, null, Expect_jvmKt.rememberComposableLambda(-203712788, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 13), gapComposer), gapComposer, 1572864, 46);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ShiftListViewKt.ShiftListTitleBar((String) obj5, this.f$3, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(3073));
                break;
            case 5:
                IconSize iconSize = (IconSize) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    StripeImageKt.StripeImage(str, (DefaultStripeImageLoader) gapComposer2.consume(FinancialConnectionsSheetNativeActivityKt.LocalImageLoader), str2, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, z ? iconSize.size : iconSize.paddedSize), ContentScale.Companion.Crop, null, Countries.painterResource(R.drawable.stripe_ic_person, 0, gapComposer2), null, Expect_jvmKt.rememberComposableLambda(-1183890906, new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(iconSize, str2), gapComposer2), null, gapComposer2, (Painter.$stable << 18) | 805330944, 0, 1440);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 6:
                FocusRequester focusRequester = (FocusRequester) obj5;
                SimpleTextFieldController simpleTextFieldController = (SimpleTextFieldController) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier focusRequester2 = FocusTraversalKt.focusRequester(companion, focusRequester);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new HeroTagViewKt$$ExternalSyntheticLambda7(15, mutableState2);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    TextFieldUIKt.m4072TextFieldZkbtPhE(simpleTextFieldController, z ? 6 : 7, FocusOwnerImplKt.onFocusChanged(focusRequester2, (Function1) rememberedValue2), null, 0, 0, null, false, false, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                TextFieldUIKt.TextFieldSection((Modifier) obj5, (SimpleTextFieldController) obj4, this.f$3, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(24583));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda32(FocusRequester focusRequester, boolean z, SimpleTextFieldController simpleTextFieldController, MutableState mutableState) {
        this.$r8$classId = 6;
        this.f$0 = focusRequester;
        this.f$3 = z;
        this.f$1 = simpleTextFieldController;
        this.f$2 = mutableState;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda32(CashQrScannerViewModel cashQrScannerViewModel, Function1 function1, Modifier modifier, boolean z, int i) {
        this.$r8$classId = 1;
        this.f$1 = cashQrScannerViewModel;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$3 = z;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda32(TakeBreakBottomSheetViewModel.BreakItem breakItem, Function1 function1, MutableState mutableState, boolean z) {
        this.$r8$classId = 3;
        this.f$0 = breakItem;
        this.f$1 = function1;
        this.f$2 = mutableState;
        this.f$3 = z;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda32(Object obj, Object obj2, boolean z, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = z;
        this.f$2 = function;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda32(String str, boolean z, Function1 function1, Function0 function0, int i) {
        this.$r8$classId = 4;
        this.f$0 = str;
        this.f$3 = z;
        this.f$1 = function1;
        this.f$2 = function0;
    }

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda32(boolean z, IconSize iconSize, String str, String str2) {
        this.$r8$classId = 5;
        this.f$3 = z;
        this.f$0 = iconSize;
        this.f$1 = str;
        this.f$2 = str2;
    }
}
