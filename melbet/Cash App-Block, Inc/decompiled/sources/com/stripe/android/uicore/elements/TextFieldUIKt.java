package com.stripe.android.uicore.elements;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.DefaultTextFieldColors;
import androidx.compose.material.IconKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt;
import com.squareup.cash.payments.views.NoteInputViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda32;
import com.squareup.cash.work.views.ClockedInStatusDotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.util.cash.Countries;
import com.stripe.android.core.strings.IdentifierResolvableString;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes8.dex */
public abstract class TextFieldUIKt {
    public static final StaticProvidableCompositionLocal LocalAutofillEventReporter = new StaticProvidableCompositionLocal(TextFieldUIKt$LocalAutofillEventReporter$1.INSTANCE);

    public static final void Composable(TextFieldIcon$Trailing textFieldIcon$Trailing, boolean z, Function1 function1, Function1 function12, boolean z2, Composer composer, int i) {
        boolean z3;
        TextFieldIcon$Trailing textFieldIcon$Trailing2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1832466611);
        int i2 = (gapComposer.changed(textFieldIcon$Trailing) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024) | (gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (!(textFieldIcon$Trailing instanceof TextFieldIcon$Trailing)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 518363021, false);
            }
            gapComposer.startReplaceGroup(-1110597427);
            z3 = z;
            TrailingIcon(textFieldIcon$Trailing, z3, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
            textFieldIcon$Trailing2 = textFieldIcon$Trailing;
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            z3 = z;
            textFieldIcon$Trailing2 = textFieldIcon$Trailing;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldUIKt$$ExternalSyntheticLambda16(textFieldIcon$Trailing2, z3, function1, function12, z2, i);
        }
    }

    /* renamed from: TextField-ZkbtPhE, reason: not valid java name */
    public static final void m4072TextFieldZkbtPhE(SimpleTextFieldController simpleTextFieldController, int i, Modifier modifier, Function1 function1, int i2, int i3, FocusRequester focusRequester, boolean z, boolean z2, Composer composer, int i4) {
        GapComposer gapComposer;
        Function1 function12;
        int i5;
        int i6;
        FocusRequester focusRequester2;
        boolean z3;
        boolean z4;
        FocusRequester focusRequester3;
        int i7;
        Function1 function13;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        int i9;
        MutableState mutableState;
        Object obj;
        long TextRange;
        MutableState mutableState2;
        TextFieldValue textFieldValue;
        MutableState mutableState3;
        Object obj2;
        FocusRequester focusRequester4;
        MutableState mutableState4;
        Object obj3;
        MutableState mutableState5;
        int i10;
        Function1 function14;
        int i11;
        int i12;
        FocusOwnerImpl focusOwnerImpl;
        SimpleTextFieldController simpleTextFieldController2;
        boolean z8;
        boolean z9;
        KFunction kFunction;
        FieldValidationMessage$Error fieldValidationMessage$Error;
        Function1 function15;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1949869177);
        int i13 = 2;
        int i14 = i4 | (gapComposer2.changed(simpleTextFieldController) ? 4 : 2) | (gapComposer2.changed(true) ? 32 : 16) | (gapComposer2.changed(i) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024) | 919166976;
        if (gapComposer2.shouldExecute(i14 & 1, (306783379 & i14) != 306783378)) {
            gapComposer2.startDefaults();
            int i15 = i4 & 1;
            Object obj4 = Composer.Companion.Empty;
            if (i15 == 0 || gapComposer2.getDefaultsInvalid()) {
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == obj4) {
                    rememberedValue = new EncodeKt$$ExternalSyntheticLambda0(14);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Function1 function16 = (Function1) rememberedValue;
                int i16 = i14 & (-4128769);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj4) {
                    rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
                }
                focusRequester3 = (FocusRequester) rememberedValue2;
                i7 = i16;
                function13 = function16;
                i8 = 1;
                z5 = true;
                z6 = true;
            } else {
                gapComposer2.skipToGroupEnd();
                function13 = function1;
                i13 = i3;
                focusRequester3 = focusRequester;
                z6 = z;
                z5 = z2;
                i7 = i14 & (-4128769);
                i8 = i2;
            }
            gapComposer2.endDefaults();
            FocusOwnerImpl focusOwnerImpl2 = (FocusOwnerImpl) gapComposer2.consume(CompositionLocalsKt.LocalFocusManager);
            MutableState collectAsState = StateFlowsComposeKt.collectAsState(simpleTextFieldController.fieldValue, gapComposer2);
            MutableState collectAsState2 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.trailingIcon, gapComposer2);
            MutableState collectAsState3 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.visibleValidationMessage, gapComposer2);
            MutableState collectAsState4 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.loading, gapComposer2);
            Object collectAsState5 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.contentDescription, gapComposer2);
            MutableState collectAsState6 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.visualTransformation, gapComposer2);
            MutableState collectAsState7 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.placeHolder, gapComposer2);
            int i17 = i13;
            Object[] objArr = new Object[0];
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj4) {
                z7 = z5;
                rememberedValue3 = new HCaptchaHtmlKt$$ExternalSyntheticLambda0(23);
                gapComposer2.updateRememberedValue(rememberedValue3);
            } else {
                z7 = z5;
            }
            MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer2, 48);
            MutableState collectAsState8 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.fieldState, gapComposer2);
            MutableState collectAsState9 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.label, gapComposer2);
            MutableState collectAsState10 = StateFlowsComposeKt.collectAsState(simpleTextFieldController.validationMessage, gapComposer2);
            TextFieldState textFieldState = (TextFieldState) collectAsState8.getValue();
            boolean changed = gapComposer2.changed(collectAsState8) | gapComposer2.changed(mutableState6) | gapComposer2.changedInstance(focusOwnerImpl2) | gapComposer2.changed(i8);
            int i18 = i8;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed || rememberedValue4 == obj4) {
                rememberedValue4 = new Logger$log$1(mutableState6, focusOwnerImpl2, i18, collectAsState8, (Continuation) null);
                i9 = i18;
                mutableState = collectAsState8;
                gapComposer2.updateRememberedValue(rememberedValue4);
            } else {
                mutableState = collectAsState8;
                i9 = i18;
            }
            Updater.LaunchedEffect(gapComposer2, textFieldState, (Function2) rememberedValue4);
            Function1 function17 = (Function1) gapComposer2.consume(LocalAutofillEventReporter);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj4) {
                rememberedValue5 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState7 = (MutableState) rememberedValue5;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == obj4) {
                rememberedValue6 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState8 = (MutableState) rememberedValue6;
            Object obj5 = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            String str = (String) collectAsState.getValue();
            TextRange textRange = (TextRange) mutableState7.getValue();
            if (textRange != null) {
                obj = obj5;
                TextRange = textRange.packedValue;
            } else {
                obj = obj5;
                int length = ((String) collectAsState.getValue()).length();
                TextRange = SizeKt.TextRange(length, length);
            }
            FocusRequester focusRequester5 = focusRequester3;
            TextFieldValue textFieldValue2 = new TextFieldValue(str, TextRange, (TextRange) mutableState8.getValue());
            boolean booleanValue = ((Boolean) collectAsState4.getValue()).booleanValue();
            int i19 = i7 & 14;
            boolean z10 = i19 == 4;
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (z10 || rememberedValue7 == obj4) {
                mutableState2 = collectAsState;
                textFieldValue = textFieldValue2;
                mutableState3 = mutableState6;
                obj2 = obj;
                focusRequester4 = focusRequester5;
                mutableState4 = collectAsState7;
                obj3 = collectAsState5;
                mutableState5 = collectAsState6;
                i10 = i17;
                function14 = function17;
                i11 = i19;
                i12 = i9;
                focusOwnerImpl = focusOwnerImpl2;
                Object textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, simpleTextFieldController, SimpleTextFieldController.class, "onDropdownItemClicked", "onDropdownItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;)V", 0, 0);
                gapComposer2.updateRememberedValue(textFieldUIKt$TextField$4$1);
                rememberedValue7 = textFieldUIKt$TextField$4$1;
            } else {
                mutableState3 = mutableState6;
                obj2 = obj;
                focusRequester4 = focusRequester5;
                textFieldValue = textFieldValue2;
                mutableState2 = collectAsState;
                mutableState4 = collectAsState7;
                obj3 = collectAsState5;
                mutableState5 = collectAsState6;
                i10 = i17;
                function14 = function17;
                i11 = i19;
                i12 = i9;
                focusOwnerImpl = focusOwnerImpl2;
            }
            KFunction kFunction2 = (KFunction) rememberedValue7;
            boolean z11 = i11 == 4;
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (z11 || rememberedValue8 == obj4) {
                simpleTextFieldController2 = simpleTextFieldController;
                Object textFieldUIKt$TextField$4$12 = new TextFieldUIKt$TextField$4$1(1, simpleTextFieldController2, SimpleTextFieldController.class, "onSelectorItemClicked", "onSelectorItemClicked(Lcom/stripe/android/uicore/elements/TextFieldIcon$Selector$Item;)V", 0, 22);
                gapComposer2.updateRememberedValue(textFieldUIKt$TextField$4$12);
                rememberedValue8 = textFieldUIKt$TextField$4$12;
            } else {
                simpleTextFieldController2 = simpleTextFieldController;
            }
            KFunction kFunction3 = (KFunction) rememberedValue8;
            Modifier onPreviewKeyEvent = KeyEventType.onPreviewKeyEvent(modifier, new TextFieldUIKt$onPreviewKeyEvent$1((String) mutableState2.getValue(), focusOwnerImpl, i10, 0));
            int i20 = i7 << 3;
            boolean changed2 = ((((i20 & 112) ^ 48) > 32 && gapComposer2.changedInstance(simpleTextFieldController2)) || (i20 & 48) == 32) | gapComposer2.changed(function14);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue9 == obj4) {
                z8 = false;
                rememberedValue9 = new TextFieldUIKt$$ExternalSyntheticLambda9(simpleTextFieldController2, function14, 0);
                gapComposer2.updateRememberedValue(rememberedValue9);
            } else {
                z8 = false;
            }
            Modifier onFocusChanged = FocusOwnerImplKt.onFocusChanged(SemanticsModifierKt.semantics(onPreviewKeyEvent, z8, (Function1) rememberedValue9), new HCaptcha$$ExternalSyntheticLambda1(5, mutableState3, simpleTextFieldController2));
            FocusRequester focusRequester6 = focusRequester4;
            Modifier focusRequester7 = FocusTraversalKt.focusRequester(onFocusChanged, focusRequester6);
            Object obj6 = obj3;
            Object obj7 = obj2;
            boolean changed3 = gapComposer2.changed(obj6) | gapComposer2.changedInstance(obj7);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue10 == obj4) {
                z9 = z7;
                rememberedValue10 = new DialogHostKt$$ExternalSyntheticLambda2(obj7, z9, obj6, 13);
                gapComposer2.updateRememberedValue(rememberedValue10);
            } else {
                z9 = z7;
            }
            Modifier semantics = SemanticsModifierKt.semantics(focusRequester7, false, (Function1) rememberedValue10);
            String resolve = ScanningShapePulseKt.resolve((ResolvableString) collectAsState9.getValue(), gapComposer2);
            String str2 = (String) mutableState4.getValue();
            TextFieldIcon$Trailing textFieldIcon$Trailing = (TextFieldIcon$Trailing) collectAsState2.getValue();
            boolean booleanValue2 = ((Boolean) collectAsState3.getValue()).booleanValue();
            FieldValidationMessage$Error fieldValidationMessage$Error2 = (FieldValidationMessage$Error) collectAsState10.getValue();
            VisualTransformation visualTransformation = (VisualTransformation) mutableState5.getValue();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, simpleTextFieldController2.keyboardType, i, (Boolean) null, 114);
            boolean changedInstance = gapComposer2.changedInstance(focusOwnerImpl);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue11 == obj4) {
                kFunction = kFunction3;
                rememberedValue11 = new NoteInputViewKt$$ExternalSyntheticLambda2(focusOwnerImpl, 6);
                gapComposer2.updateRememberedValue(rememberedValue11);
            } else {
                kFunction = kFunction3;
            }
            Function1 function18 = (Function1) rememberedValue11;
            int i21 = i12;
            boolean changedInstance2 = gapComposer2.changedInstance(focusOwnerImpl) | gapComposer2.changed(i21);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue12 == obj4) {
                fieldValidationMessage$Error = fieldValidationMessage$Error2;
                rememberedValue12 = new LazyListState$$ExternalSyntheticLambda3(focusOwnerImpl, i21, 15);
                gapComposer2.updateRememberedValue(rememberedValue12);
            } else {
                fieldValidationMessage$Error = fieldValidationMessage$Error2;
            }
            KeyboardActions keyboardActions = new KeyboardActions(function18, (Function1) rememberedValue12, null, 58);
            boolean booleanValue3 = ((Boolean) mutableState3.getValue()).booleanValue();
            MutableState mutableState9 = mutableState;
            MutableState mutableState10 = mutableState2;
            boolean changed4 = gapComposer2.changed(mutableState9) | gapComposer2.changed(mutableState10) | (i11 == 4);
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue13 == obj4) {
                Function1 function19 = function13;
                rememberedValue13 = new SliderKt$$ExternalSyntheticLambda3(simpleTextFieldController, function19, mutableState9, mutableState10, mutableState7, mutableState8);
                function15 = function19;
                gapComposer2.updateRememberedValue(rememberedValue13);
            } else {
                function15 = function13;
            }
            Function1 function110 = (Function1) kFunction;
            boolean z12 = z6;
            gapComposer = gapComposer2;
            TextFieldUi(textFieldValue, booleanValue, resolve, str2, textFieldIcon$Trailing, booleanValue2, fieldValidationMessage$Error, z12, semantics, visualTransformation, keyboardOptions, keyboardActions, (Function1) rememberedValue13, (Function1) kFunction2, function110, booleanValue3, gapComposer, 805306368);
            i6 = i10;
            z4 = z9;
            focusRequester2 = focusRequester6;
            z3 = z12;
            i5 = i21;
            function12 = function15;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            function12 = function1;
            i5 = i2;
            i6 = i3;
            focusRequester2 = focusRequester;
            z3 = z;
            z4 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldUIKt$$ExternalSyntheticLambda8(simpleTextFieldController, i, modifier, function12, i5, i6, focusRequester2, z3, z4, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* renamed from: TextFieldColors-zf8z9n0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DefaultTextFieldColors m4073TextFieldColorszf8z9n0(FieldDisplayState fieldDisplayState, long j, long j2, long j3, Composer composer, int i, int i2) {
        long j4;
        int ordinal;
        long j5;
        boolean z;
        long j6;
        int ordinal2;
        long j7;
        long j8 = (i2 & 2) != 0 ? ((StripeColors) ((GapComposer) composer).consume(StripeThemeKt.LocalColors)).onComponent : j;
        if ((i2 & 4) != 0) {
            GapComposer gapComposer = (GapComposer) composer;
            long j9 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
            if (((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight()) {
                ColorKt.m690luminance8_81llA(j9);
            } else {
                ColorKt.m690luminance8_81llA(j9);
            }
            j4 = Color.m675copywmQWz5c$default(0.38f, j8, 14);
        } else {
            j4 = j2;
        }
        long j10 = ((StripeColors) ((GapComposer) composer).consume(StripeThemeKt.LocalColors)).component;
        long j11 = (i2 & 16) != 0 ? Color.Transparent : j3;
        int ordinal3 = fieldDisplayState.ordinal();
        if (ordinal3 != 0) {
            if (ordinal3 == 1) {
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(892053260);
                long m483getError0d7_KjU = ((Colors) gapComposer2.consume(ColorsKt.LocalColors)).m483getError0d7_KjU();
                gapComposer2.end(false);
                j8 = m483getError0d7_KjU;
                long j12 = StripeThemeKt.getStripeColors(composer).placeholderText;
                long j13 = StripeThemeKt.getStripeColors(composer).placeholderText;
                long j14 = StripeThemeKt.getStripeColors(composer).placeholderText;
                long j15 = Color.Transparent;
                long j16 = StripeThemeKt.getStripeColors(composer).textCursor;
                ordinal = fieldDisplayState.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        GapComposer gapComposer3 = (GapComposer) composer;
                        gapComposer3.startReplaceGroup(892075180);
                        j6 = ((Colors) gapComposer3.consume(ColorsKt.LocalColors)).m483getError0d7_KjU();
                        z = false;
                        gapComposer3.end(false);
                        j5 = j8;
                        ordinal2 = fieldDisplayState.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 1) {
                                GapComposer gapComposer4 = (GapComposer) composer;
                                gapComposer4.startReplaceGroup(892082316);
                                j7 = ((Colors) gapComposer4.consume(ColorsKt.LocalColors)).m483getError0d7_KjU();
                                gapComposer4.end(z);
                                return TextFieldDefaults.m506textFieldColorsdx8h9Zs(j5, j4, j10, j16, j6, j15, j15, j11, j7, j13, j12, j14, 0L, composer, 1474048);
                            }
                            if (ordinal2 != 2) {
                                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 892079830, z);
                            }
                        }
                        GapComposer gapComposer5 = (GapComposer) composer;
                        gapComposer5.startReplaceGroup(892084722);
                        gapComposer5.end(z);
                        j7 = j15;
                        return TextFieldDefaults.m506textFieldColorsdx8h9Zs(j5, j4, j10, j16, j6, j15, j15, j11, j7, j13, j12, j14, 0L, composer, 1474048);
                    }
                    if (ordinal != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 892072714, false);
                    }
                }
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(892078257);
                j5 = j8;
                long j17 = StripeThemeKt.getStripeColors(gapComposer6).textCursor;
                z = false;
                gapComposer6.end(false);
                j6 = j17;
                ordinal2 = fieldDisplayState.ordinal();
                if (ordinal2 != 0) {
                }
                GapComposer gapComposer52 = (GapComposer) composer;
                gapComposer52.startReplaceGroup(892084722);
                gapComposer52.end(z);
                j7 = j15;
                return TextFieldDefaults.m506textFieldColorsdx8h9Zs(j5, j4, j10, j16, j6, j15, j15, j11, j7, j13, j12, j14, 0L, composer, 1474048);
            }
            if (ordinal3 != 2) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 892050766, false);
            }
        }
        GapComposer gapComposer7 = (GapComposer) composer;
        gapComposer7.startReplaceGroup(892055472);
        gapComposer7.end(false);
        long j122 = StripeThemeKt.getStripeColors(composer).placeholderText;
        long j132 = StripeThemeKt.getStripeColors(composer).placeholderText;
        long j142 = StripeThemeKt.getStripeColors(composer).placeholderText;
        long j152 = Color.Transparent;
        long j162 = StripeThemeKt.getStripeColors(composer).textCursor;
        ordinal = fieldDisplayState.ordinal();
        if (ordinal != 0) {
        }
        GapComposer gapComposer62 = (GapComposer) composer;
        gapComposer62.startReplaceGroup(892078257);
        j5 = j8;
        long j172 = StripeThemeKt.getStripeColors(gapComposer62).textCursor;
        z = false;
        gapComposer62.end(false);
        j6 = j172;
        ordinal2 = fieldDisplayState.ordinal();
        if (ordinal2 != 0) {
        }
        GapComposer gapComposer522 = (GapComposer) composer;
        gapComposer522.startReplaceGroup(892084722);
        gapComposer522.end(z);
        j7 = j152;
        return TextFieldDefaults.m506textFieldColorsdx8h9Zs(j5, j4, j10, j162, j6, j152, j152, j11, j7, j132, j122, j142, 0L, composer, 1474048);
    }

    public static final void TextFieldSection(Modifier modifier, SimpleTextFieldController simpleTextFieldController, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2063701262);
        int i2 = (gapComposer.changed(simpleTextFieldController) ? 32 : 16) | i | (gapComposer.changed(z) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            SectionUIKt.Section(null, (FieldValidationMessage$Error) StateFlowsComposeKt.collectAsState(simpleTextFieldController.validationMessage, gapComposer).getValue(), modifier, z, composableLambdaImpl, gapComposer, ((i2 << 3) & 7168) | 24960);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardViewKt$$ExternalSyntheticLambda32(modifier, simpleTextFieldController, z, composableLambdaImpl, i, 7);
        }
    }

    public static final void TextFieldUi(final TextFieldValue textFieldValue, final boolean z, final String str, final String str2, final TextFieldIcon$Trailing textFieldIcon$Trailing, final boolean z2, final FieldValidationMessage$Error fieldValidationMessage$Error, final boolean z3, final Modifier modifier, final VisualTransformation visualTransformation, final KeyboardOptions keyboardOptions, final KeyboardActions keyboardActions, final Function1 function1, final Function1 function12, final Function1 function13, final boolean z4, Composer composer, final int i) {
        final TextFieldValue textFieldValue2;
        int i2;
        boolean z5;
        String str3;
        FieldDisplayState fieldDisplayState;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1177340186);
        if ((i & 6) == 0) {
            textFieldValue2 = textFieldValue;
            i2 = (gapComposer.changed(textFieldValue2) ? 4 : 2) | i;
        } else {
            textFieldValue2 = textFieldValue;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(true) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z5 = z;
            i2 |= gapComposer.changed(z5) ? 256 : 128;
        } else {
            z5 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str3 = str2;
            i2 |= gapComposer.changed(str3) ? 16384 : 8192;
        } else {
            str3 = str2;
        }
        if ((i & 196608) == 0) {
            i2 |= gapComposer.changed(textFieldIcon$Trailing) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= gapComposer.changed(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= gapComposer.changed(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= gapComposer.changed(fieldValidationMessage$Error) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= gapComposer.changed(z3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer.shouldExecute(i2 & 1, ((i2 & 306783379) == 306783378 && (38347923 & (((((((((gapComposer.changed(modifier) ? (char) 4 : (char) 2) | (gapComposer.changed(visualTransformation) ? ' ' : (char) 16)) | (gapComposer.changed(-1) ? 256 : 128)) | (gapComposer.changed(keyboardOptions) ? (char) 2048 : (char) 1024)) | (gapComposer.changed(keyboardActions) ? (char) 16384 : (char) 8192)) | (gapComposer.changedInstance(function1) ? (char) 0 : (char) 0)) | (gapComposer.changedInstance(function12) ? (char) 0 : (char) 0)) | (gapComposer.changedInstance(function13) ? (char) 0 : (char) 0)) | (gapComposer.changed(z4) ? (char) 0 : (char) 0))) == 38347922) ? false : true)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            if (z2) {
                if (!(fieldValidationMessage$Error instanceof FieldValidationMessage$Error) && fieldValidationMessage$Error != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                fieldDisplayState = FieldDisplayState.ERROR;
            } else {
                if (z2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                fieldDisplayState = FieldDisplayState.NORMAL;
            }
            final DefaultTextFieldColors m4073TextFieldColorszf8z9n0 = m4073TextFieldColorszf8z9n0(fieldDisplayState, 0L, 0L, 0L, gapComposer, 0, 30);
            final FormInsets formInsets = (FormInsets) gapComposer.consume(StripeThemeKt.LocalTextFieldInsets);
            gapComposer.startReplaceGroup(-1847476051);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalLayoutDirection;
            LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(staticProvidableCompositionLocal);
            gapComposer.end(false);
            ProvidedValue defaultProvidedValue$runtime = staticProvidableCompositionLocal.defaultProvidedValue$runtime(layoutDirection);
            final boolean z6 = z5;
            final String str4 = str3;
            Function2 function2 = new Function2(function1, modifier, str4, textFieldIcon$Trailing, z2, fieldValidationMessage$Error, visualTransformation, keyboardOptions, keyboardActions, m4073TextFieldColorszf8z9n0, formInsets, str, z3, z6, function12, function13, z4) { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda11
                public final /* synthetic */ Function1 f$1;
                public final /* synthetic */ KeyboardActions f$10;
                public final /* synthetic */ DefaultTextFieldColors f$11;
                public final /* synthetic */ FormInsets f$12;
                public final /* synthetic */ String f$14;
                public final /* synthetic */ boolean f$15;
                public final /* synthetic */ boolean f$16;
                public final /* synthetic */ Function1 f$17;
                public final /* synthetic */ Function1 f$18;
                public final /* synthetic */ boolean f$19;
                public final /* synthetic */ Modifier f$2;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ boolean f$6;
                public final /* synthetic */ FieldValidationMessage$Error f$7;
                public final /* synthetic */ VisualTransformation f$8;
                public final /* synthetic */ KeyboardOptions f$9;

                {
                    this.f$6 = z2;
                    this.f$7 = fieldValidationMessage$Error;
                    this.f$8 = visualTransformation;
                    this.f$9 = keyboardOptions;
                    this.f$10 = keyboardActions;
                    this.f$11 = m4073TextFieldColorszf8z9n0;
                    this.f$12 = formInsets;
                    this.f$14 = str;
                    this.f$15 = z3;
                    this.f$16 = z6;
                    this.f$17 = function12;
                    this.f$18 = function13;
                    this.f$19 = z4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ComposableLambdaImpl composableLambdaImpl;
                    String str5;
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Integer) obj2).intValue();
                    byte b = 0;
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(this.f$2, 1.0f);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-422432608, new TextFieldUIKt$$ExternalSyntheticLambda14(this.f$14, this.f$15, b, b), gapComposer2);
                        String str6 = this.f$4;
                        if (str6 == null) {
                            gapComposer2.startReplaceGroup(-127734023);
                            gapComposer2.end(false);
                            composableLambdaImpl = null;
                        } else {
                            gapComposer2.startReplaceGroup(-127734022);
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1455639466, new PastPaySectionKt$$ExternalSyntheticLambda1(str6, 15), gapComposer2);
                            gapComposer2.end(false);
                            composableLambdaImpl = rememberComposableLambda2;
                        }
                        gapComposer2.startReplaceGroup(-127592105);
                        gapComposer2.end(false);
                        FieldValidationMessage$Error fieldValidationMessage$Error2 = this.f$7;
                        IdentifierResolvableString resolvable = fieldValidationMessage$Error2 != null ? fieldValidationMessage$Error2.getResolvable() : null;
                        if (resolvable == null) {
                            gapComposer2.startReplaceGroup(-127324110);
                            gapComposer2.end(false);
                            str5 = null;
                        } else {
                            gapComposer2.startReplaceGroup(411534767);
                            String resolve = ScanningShapePulseKt.resolve(resolvable, gapComposer2);
                            gapComposer2.end(false);
                            str5 = resolve;
                        }
                        FormInsets formInsets2 = this.f$12;
                        CompatTextFieldKt.CompatTextField(TextFieldValue.this, this.f$1, fillMaxWidth, true, null, rememberComposableLambda, composableLambdaImpl, null, this.f$6, str5, this.f$8, this.f$9, this.f$10, true, 0, 0, null, null, this.f$11, new PaddingValuesImpl(formInsets2.start, formInsets2.top, formInsets2.end, formInsets2.bottom), gapComposer2, 1572864, 196608, 983344);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer = gapComposer;
            Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(-164934746, function2, gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(z, str, str2, textFieldIcon$Trailing, z2, fieldValidationMessage$Error, z3, modifier, visualTransformation, keyboardOptions, keyboardActions, function1, function12, function13, z4, i) { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda12
                public final /* synthetic */ Modifier f$10;
                public final /* synthetic */ VisualTransformation f$11;
                public final /* synthetic */ KeyboardOptions f$13;
                public final /* synthetic */ KeyboardActions f$14;
                public final /* synthetic */ Function1 f$15;
                public final /* synthetic */ Function1 f$16;
                public final /* synthetic */ Function1 f$17;
                public final /* synthetic */ boolean f$18;
                public final /* synthetic */ int f$19;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ boolean f$7;
                public final /* synthetic */ FieldValidationMessage$Error f$8;
                public final /* synthetic */ boolean f$9;

                {
                    this.f$7 = z2;
                    this.f$8 = fieldValidationMessage$Error;
                    this.f$9 = z3;
                    this.f$10 = modifier;
                    this.f$11 = visualTransformation;
                    this.f$13 = keyboardOptions;
                    this.f$14 = keyboardActions;
                    this.f$15 = function1;
                    this.f$16 = function12;
                    this.f$17 = function13;
                    this.f$18 = z4;
                    this.f$19 = i;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(this.f$19 | 1);
                    TextFieldUIKt.TextFieldUi(TextFieldValue.this, this.f$2, this.f$3, this.f$4, null, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, this.f$18, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TrailingIcon(TextFieldIcon$Trailing textFieldIcon$Trailing, boolean z, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        GapComposer gapComposer;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        textFieldIcon$Trailing.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(580728384);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(textFieldIcon$Trailing) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier5 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                if (z) {
                    gapComposer2.startReplaceGroup(351160694);
                    gapComposer = gapComposer2;
                    ProgressIndicatorKt.m496CircularProgressIndicatorLxG7B9w(androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(CanvasKt.progressSemantics(modifier5), 24.0f), 0L, RecyclerView.DECELERATION_RATE, 0L, 0, gapComposer, 0, 30);
                    gapComposer.end(false);
                    modifier4 = modifier5;
                } else {
                    gapComposer2.startReplaceGroup(351370750);
                    Painter painterResource = Countries.painterResource(R.drawable.stripe_ic_chevron_down, 0, gapComposer2);
                    gapComposer2.startReplaceGroup(351508110);
                    gapComposer2.end(false);
                    modifier4 = modifier5;
                    IconKt.m492Iconww6aTOc(painterResource, null, modifier4, 0L, gapComposer2, Painter.$stable, 8);
                    gapComposer = gapComposer2;
                    gapComposer.end(false);
                }
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ClockedInStatusDotKt$$ExternalSyntheticLambda0(textFieldIcon$Trailing, z, modifier3, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
