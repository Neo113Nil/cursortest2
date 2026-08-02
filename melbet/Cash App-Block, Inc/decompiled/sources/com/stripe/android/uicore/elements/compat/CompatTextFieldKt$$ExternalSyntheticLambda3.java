package com.stripe.android.uicore.elements.compat;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.DefaultTextFieldColors;
import androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt$$ExternalSyntheticLambda20;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes8.dex */
public final /* synthetic */ class CompatTextFieldKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ KeyboardOptions f$10;
    public final /* synthetic */ KeyboardActions f$11;
    public final /* synthetic */ boolean f$12;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ int f$14;
    public final /* synthetic */ VisualTransformation f$15;
    public final /* synthetic */ Function2 f$16;
    public final /* synthetic */ Function2 f$17;
    public final /* synthetic */ Function2 f$18;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Shape f$20;
    public final /* synthetic */ PaddingValuesImpl f$21;
    public final /* synthetic */ MutableInteractionSourceImpl f$3;
    public final /* synthetic */ DefaultTextFieldColors f$4;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ Function1 f$7;
    public final /* synthetic */ TextStyle f$9;

    public /* synthetic */ CompatTextFieldKt$$ExternalSyntheticLambda3(Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, DefaultTextFieldColors defaultTextFieldColors, String str, Function1 function1, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z2, int i, int i2, VisualTransformation visualTransformation, Function2 function2, Function2 function22, Function2 function23, Shape shape, PaddingValuesImpl paddingValuesImpl) {
        this.f$0 = modifier;
        this.f$2 = z;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = defaultTextFieldColors;
        this.f$6 = str;
        this.f$7 = function1;
        this.f$9 = textStyle;
        this.f$10 = keyboardOptions;
        this.f$11 = keyboardActions;
        this.f$12 = z2;
        this.f$13 = i;
        this.f$14 = i2;
        this.f$15 = visualTransformation;
        this.f$16 = function2;
        this.f$17 = function22;
        this.f$18 = function23;
        this.f$20 = shape;
        this.f$21 = paddingValuesImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = 2;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    final boolean z = this.f$2;
                    final MutableInteractionSourceImpl mutableInteractionSourceImpl = this.f$3;
                    final DefaultTextFieldColors defaultTextFieldColors = this.f$4;
                    Modifier composed = PlatformKt.composed(this.f$0, new TextFieldDefaults$$ExternalSyntheticLambda2(true, z, mutableInteractionSourceImpl, defaultTextFieldColors, 2.0f, 1.0f));
                    composed.getClass();
                    Modifier composed2 = PlatformKt.composed(composed, new SelectPaymentPlanViewKt$$ExternalSyntheticLambda20(null, i, z));
                    SolidColor solidColor = new SolidColor(((Color) defaultTextFieldColors.cursorColor(z, gapComposer).getValue()).value);
                    final String str = this.f$6;
                    final Function2 function2 = this.f$16;
                    final Function2 function22 = this.f$17;
                    final Function2 function23 = this.f$18;
                    final VisualTransformation visualTransformation = this.f$15;
                    final boolean z2 = this.f$12;
                    final Shape shape = this.f$20;
                    final PaddingValuesImpl paddingValuesImpl = this.f$21;
                    BasicTextFieldKt.BasicTextField(str, this.f$7, composed2, true, false, this.f$9, this.f$10, this.f$11, z2, this.f$13, this.f$14, visualTransformation, null, mutableInteractionSourceImpl, solidColor, Expect_jvmKt.rememberComposableLambda(1687027626, new Function3() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Function2 function24 = (Function2) obj3;
                            Composer composer2 = (Composer) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            function24.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer2).changedInstance(function24) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                CompatTextFieldKt.InsetDecorationBox(str, function24, true, function2, function22, function23, null, z, visualTransformation, z2, mutableInteractionSourceImpl, shape, defaultTextFieldColors, paddingValuesImpl, gapComposer2, (intValue2 << 3) & 112);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 0, 196608, 4096);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                CompatTextFieldKt.CompatTextField(this.f$6, this.f$7, this.f$0, this.f$9, this.f$16, this.f$17, this.f$18, this.f$2, this.f$15, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$3, this.f$20, this.f$4, this.f$21, (Composer) obj, Updater.updateChangedFlags(14155777));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CompatTextFieldKt$$ExternalSyntheticLambda3(String str, Function1 function1, Modifier modifier, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, boolean z, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z2, int i, int i2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, DefaultTextFieldColors defaultTextFieldColors, PaddingValuesImpl paddingValuesImpl, int i3) {
        this.f$6 = str;
        this.f$7 = function1;
        this.f$0 = modifier;
        this.f$9 = textStyle;
        this.f$16 = function2;
        this.f$17 = function22;
        this.f$18 = function23;
        this.f$2 = z;
        this.f$15 = visualTransformation;
        this.f$10 = keyboardOptions;
        this.f$11 = keyboardActions;
        this.f$12 = z2;
        this.f$13 = i;
        this.f$14 = i2;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$20 = shape;
        this.f$4 = defaultTextFieldColors;
        this.f$21 = paddingValuesImpl;
    }
}
