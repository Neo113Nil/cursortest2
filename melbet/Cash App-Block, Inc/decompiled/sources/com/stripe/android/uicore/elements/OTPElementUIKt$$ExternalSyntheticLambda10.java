package com.stripe.android.uicore.elements;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.support.views.ScreenshotConfirmViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes8.dex */
public final /* synthetic */ class OTPElementUIKt$$ExternalSyntheticLambda10 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ OTPElementUIKt$$ExternalSyntheticLambda10(boolean z, OTPElementColors oTPElementColors, String str, boolean z2, String str2) {
        this.f$0 = z;
        this.f$1 = oTPElementColors;
        this.f$2 = str;
        this.f$3 = z2;
        this.f$4 = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj4 = this.f$4;
        Object obj5 = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                OTPElementColors oTPElementColors = (OTPElementColors) obj5;
                String str = (String) obj4;
                Function2 function2 = (Function2) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                function2.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changedInstance(function2) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    int i2 = intValue;
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = StripeThemeKt.LocalColors;
                    long j = ((StripeColors) gapComposer.consume(staticProvidableCompositionLocal)).onComponent;
                    long j2 = z ? oTPElementColors.selectedBackground : oTPElementColors.background;
                    long j3 = ((StripeColors) gapComposer.consume(staticProvidableCompositionLocal)).textCursor;
                    long j4 = oTPElementColors.background;
                    long j5 = oTPElementColors.placeholder;
                    textFieldDefaults.TextFieldDecorationBox(this.f$2, function2, this.f$3, mutableInteractionSourceImpl, Expect_jvmKt.rememberComposableLambda(-1472332780, new TextFieldUIKt$$ExternalSyntheticLambda14(z, str), gapComposer), null, TextFieldDefaults.m506textFieldColorsdx8h9Zs(j, 0L, j2, j3, 0L, j4, j4, j4, 0L, 0L, 0L, j5, j5, gapComposer, 524050), SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3), gapComposer, ((i2 << 3) & 112) | 100887552);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Function1 function1 = (Function1) obj5;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (z) {
                        gapComposer2.startReplaceGroup(-1009929944);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1010100041);
                        boolean changed = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(23, function1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        SizeKt.ButtonCta((Function0) rememberedValue2, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, ScreenshotReviewViewKt.f705lambda$859728966, gapComposer2, 1572912, 60);
                        gapComposer2.end(false);
                    }
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed2 = gapComposer2.changed(delegatingSoftwareKeyboardController) | gapComposer2.changed(function1);
                    String str2 = this.f$2;
                    boolean changed3 = changed2 | gapComposer2.changed(str2);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new BasicShieetScope$$ExternalSyntheticLambda10(22, delegatingSoftwareKeyboardController, function1, str2);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth, buttonProminence, false, this.f$3, null, Expect_jvmKt.rememberComposableLambda(-1837649569, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 9), gapComposer2), gapComposer2, 1573296, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OTPElementUIKt$$ExternalSyntheticLambda10(boolean z, Function1 function1, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, String str, boolean z2) {
        this.f$0 = z;
        this.f$1 = function1;
        this.f$4 = delegatingSoftwareKeyboardController;
        this.f$2 = str;
        this.f$3 = z2;
    }
}
