package com.squareup.cash.support.chat.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.util.Strings;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChatInputView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ChatInputView f$0;

    public /* synthetic */ ChatInputView$$ExternalSyntheticLambda0(ChatInputView chatInputView) {
        this.f$0 = chatInputView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ChatInputView chatInputView = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                TextFieldState textFieldState = chatInputView.textFieldState;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = 0;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
                    }
                    FocusRequester focusRequester = (FocusRequester) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
                    CharSequence charSequence = textFieldState.getValue$foundation().text;
                    boolean changedInstance = gapComposer.changedInstance(chatInputView);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    Continuation continuation = null;
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new ChatInputView$Content$1$1$1(chatInputView, continuation, i3);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue3);
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance2 = gapComposer.changedInstance(chatInputView);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new WorkflowNode$tick$1$1(chatInputView, focusRequester, continuation, i2);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m276defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 56.0f, 1), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    TextFieldState textFieldState2 = chatInputView.textFieldState;
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(FocusTraversalKt.focusRequester(companion, focusRequester), 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).input, Strings.getColors(gapComposer).component.input.text.f195default, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                    SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer).component.input.cursor);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(3, (Boolean) null, 0, 0, (Boolean) null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    boolean changedInstance3 = gapComposer.changedInstance(chatInputView);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new ChatInputView$$ExternalSyntheticLambda2(chatInputView, i3);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    BasicTextFieldKt.BasicTextField(textFieldState2, m300paddingVpY3zN4$default, false, false, null, m994copyp1EtxEg$default, keyboardOptions, (KeyboardActionHandler) rememberedValue5, null, mutableInteractionSourceImpl, solidColor, null, textFieldState.getValue$foundation().text.length() == 0 ? ChatInputView$Content$1$3$2.INSTANCE : null, null, gapComposer, 1572864, 6, 21276);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                chatInputView.Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ChatInputView$$ExternalSyntheticLambda0(ChatInputView chatInputView, int i) {
        this.f$0 = chatInputView;
    }
}
