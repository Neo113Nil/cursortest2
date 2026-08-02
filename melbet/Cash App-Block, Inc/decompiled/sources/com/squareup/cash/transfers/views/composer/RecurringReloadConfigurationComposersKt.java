package com.squareup.cash.transfers.views.composer;

import android.view.View;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.util.android.Keyboards;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class RecurringReloadConfigurationComposersKt {
    public static final ComposableLambdaImpl lambda$1433817742 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(22), false, 1433817742);

    /* renamed from: lambda$-783857631, reason: not valid java name */
    public static final ComposableLambdaImpl f739lambda$783857631 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(23), false, -783857631);

    public static final void AmountKeypadContent(Modifier modifier, RecurringReloadConfigurationViewModel.Keypad keypad, Function1 function1, final Function0 function0, final Function0 function02, LocalizedMoneyFormatter.Factory factory, RealCashVibrator realCashVibrator, Composer composer, int i) {
        int i2;
        LocalizedMoneyFormatter.Factory factory2;
        GapComposer gapComposer;
        AmountDisplayState amountDisplayState;
        Shaker shaker;
        Object obj;
        final View view;
        RecurringReloadConfigurationViewModel.Keypad keypad2;
        keypad.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1863160630);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(keypad) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            factory2 = factory;
            i2 |= gapComposer2.changedInstance(factory2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            factory2 = factory;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(realCashVibrator) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            View view2 = (View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = new KeypadAmount();
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            KeypadAmount keypadAmount = (KeypadAmount) rememberedValue;
            FocusRequester rememberFocusRequesterAndRequestFocus = DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = factory2.createNoSymbolCompact();
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MoneyFormatter moneyFormatter = (MoneyFormatter) rememberedValue2;
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer2, 0);
            CurrencyCode currencyCode = keypad.getCurrentAmount().currency_code;
            currencyCode.getClass();
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14);
            String format2 = moneyFormatter.format(keypad.getCurrentAmount());
            int i3 = i2;
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer2.changedInstance(keypad);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue3 == obj2) {
                rememberedValue3 = new BottomSheet$$ExternalSyntheticLambda3(21, function1, keypad);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, format2, (Function1) rememberedValue3, gapComposer2, 0);
            Object[] objArr = {keypadAmount, rememberAmountDisplayState, realCashVibrator, rememberShaker};
            boolean changedInstance2 = gapComposer2.changedInstance(keypadAmount) | gapComposer2.changed(rememberAmountDisplayState) | gapComposer2.changedInstance(rememberShaker) | gapComposer2.changedInstance(realCashVibrator) | gapComposer2.changedInstance(keypad) | gapComposer2.changedInstance(moneyFormatter);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue4 == obj2) {
                amountDisplayState = rememberAmountDisplayState;
                shaker = rememberShaker;
                obj = obj2;
                view = view2;
                Object navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(keypadAmount, keypad, moneyFormatter, amountDisplayState, shaker, realCashVibrator, (Continuation) null, 20);
                keypadAmount = keypadAmount;
                keypad2 = keypad;
                gapComposer2.updateRememberedValue(navHostKt$NavHost$33$1);
                rememberedValue4 = navHostKt$NavHost$33$1;
            } else {
                obj = obj2;
                amountDisplayState = rememberAmountDisplayState;
                view = view2;
                shaker = rememberShaker;
                keypad2 = keypad;
            }
            Updater.LaunchedEffect(objArr, (Function2) rememberedValue4, gapComposer2);
            CurrencyCode currencyCode2 = keypad2.getCurrentAmount().currency_code;
            boolean changed = gapComposer2.changed(amountDisplayState) | gapComposer2.changedInstance(keypad2);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed || rememberedValue5 == obj) {
                rememberedValue5 = new WorkflowNode$tick$1$1(amountDisplayState, keypad2, null, 9);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(currencyCode2, amountDisplayState, (Function2) rememberedValue5, gapComposer2);
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(modifier);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            Function0 function03 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function03);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            NavigationType navigationType = NavigationType.BACK;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1974727482, new FieldBinding$$ExternalSyntheticLambda4(keypad2, 8), gapComposer2);
            boolean changedInstance3 = gapComposer2.changedInstance(view) | ((i3 & 57344) == 16384);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue6 == obj) {
                final int i4 = 0;
                rememberedValue6 = new Function0() { // from class: com.squareup.cash.transfers.views.composer.RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                Keyboards.hideKeyboard(view);
                                function02.invoke();
                                break;
                            default:
                                Keyboards.hideKeyboard(view);
                                function02.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            final View view3 = view;
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue6, (Modifier) null, f739lambda$783857631, gapComposer2, 1572918, 44);
            KeypadAmount keypadAmount2 = keypadAmount;
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            final int i5 = 1;
            SpacerKt.Spacer(gapComposer2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, 1.0f), shaker);
            boolean changedInstance4 = ((i3 & 7168) == 2048) | gapComposer2.changedInstance(view3);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue7 == obj) {
                rememberedValue7 = new Function0() { // from class: com.squareup.cash.transfers.views.composer.RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                Keyboards.hideKeyboard(view3);
                                function0.invoke();
                                break;
                            default:
                                Keyboards.hideKeyboard(view3);
                                function0.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            Function0 function04 = (Function0) rememberedValue7;
            boolean changed2 = gapComposer2.changed(rememberFocusRequesterAndRequestFocus) | gapComposer2.changedInstance(view3);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue8 == obj) {
                rememberedValue8 = new AddMoneyViewKt$$ExternalSyntheticLambda4(rememberFocusRequesterAndRequestFocus, view3, 2);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            RecurringReloadConfigurationViewModel.Keypad keypad3 = keypad2;
            AddMoneyViewKt.TransfersAmountView(amountDisplayState, keypadAmount2, shakeWith, function04, (Function0) rememberedValue8, rememberFocusRequesterAndRequestFocus, gapComposer2, 560, 0);
            gapComposer = gapComposer2;
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(404408510, new TabToolbarsKt$$ExternalSyntheticLambda3(21, keypad3, function0), gapComposer), gapComposer, 24582, 14);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(modifier, keypad, function1, function0, function02, factory, realCashVibrator, i, 11);
        }
    }

    public static final void AmountPickerContent(Modifier modifier, RecurringReloadConfigurationViewModel.AtmPicker atmPicker, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        RecurringReloadConfigurationViewModel.AtmPicker atmPicker2;
        atmPicker.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(932600956);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(atmPicker) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String title = atmPicker.getTitle();
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            atmPicker2 = atmPicker;
            InputChipKt.InputChipGrid(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), 0, Expect_jvmKt.rememberComposableLambda(-1078341667, new SheetKt$$ExternalSyntheticLambda5(26, atmPicker2, function1, function02), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-1565301756, new TabToolbarsKt$$ExternalSyntheticLambda3(22, atmPicker2, function0), gapComposer), gapComposer, 24582, 14);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            atmPicker2 = atmPicker;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17(modifier, atmPicker2, function1, function0, function02, i, 12);
        }
    }
}
