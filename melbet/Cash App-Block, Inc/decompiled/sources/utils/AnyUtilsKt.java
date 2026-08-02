package utils;

import android.media.ImageReader;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.Typography;
import androidx.compose.material3.TypographyKt;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appintro.viewmodels.AlternativeNewSponsorAliasViewModel;
import com.squareup.cash.appintro.views.AlternativeNewSponsorAliasView$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.mooncake.compose_ui.components.AlertDialogButton;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import type.JsonLogicList;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;

/* loaded from: classes5.dex */
public abstract class AnyUtilsKt {
    public static final void AlternativeNewSponsorAliasDialog(AlternativeNewSponsorAliasViewModel alternativeNewSponsorAliasViewModel, Function1 function1, Composer composer, int i) {
        alternativeNewSponsorAliasViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-409241624);
        int i2 = (gapComposer.changedInstance(alternativeNewSponsorAliasViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = alternativeNewSponsorAliasViewModel.title;
            boolean z = false;
            String str2 = alternativeNewSponsorAliasViewModel.message;
            String str3 = alternativeNewSponsorAliasViewModel.continueButtonLabel;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AlertDialogButton alertDialogButton = new AlertDialogButton(str3, (Function0) rememberedValue);
            String str4 = alternativeNewSponsorAliasViewModel.dismissButtonLabel;
            if (i3 == 32) {
                z = true;
            }
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(11, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeypadKt.AlertDialogContent(null, null, str, str2, alertDialogButton, new AlertDialogButton(str4, (Function0) rememberedValue2), false, gapComposer, 0, 67);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlternativeNewSponsorAliasView$$ExternalSyntheticLambda0(alternativeNewSponsorAliasViewModel, function1, i);
        }
    }

    public static final void ButtonView(ComposePlatform.Button button, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        Object failure;
        Object obj;
        button.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-408053469);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(button) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            if (gapComposer.consume(GenieCompositionLocalsKt.LocalGenieActionExecutor) != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            GenieLogger genieLogger = (GenieLogger) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieLogger);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            boolean changedInstance = gapComposer.changedInstance(button) | gapComposer.changedInstance(null) | gapComposer.changedInstance(coroutineScope) | gapComposer.changedInstance(genieViewState) | gapComposer.changedInstance(genieLogger);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda5(button, coroutineScope, genieViewState, genieLogger);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            Expression expression = button.style;
            if (expression != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    failure = Double.valueOf(expressionEvaluator.evaluate(expression, genieViewState).numericValue());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                Double d = (Double) failure;
                if (d != null) {
                    int doubleValue = (int) d.doubleValue();
                    Object[] objArr = (Enum[]) ComposePlatform.ButtonStyle.class.getEnumConstants();
                    if (objArr != null) {
                        for (Object obj2 : objArr) {
                            obj2.getClass();
                            if (((WireEnum) obj2).getValue() == doubleValue) {
                                obj = obj2;
                                break;
                            }
                        }
                    }
                }
            }
            obj = null;
            ComposePlatform.ButtonStyle buttonStyle = (ComposePlatform.ButtonStyle) obj;
            if (buttonStyle == null) {
                buttonStyle = ComposePlatform.ButtonStyle.BUTTON_STYLE_FILLED;
            }
            TextStyle textStyle = resolvedStyle.textStyle;
            if (textStyle == null) {
                gapComposer.startReplaceGroup(-1297333331);
                textStyle = ((Typography) gapComposer.consume(TypographyKt.LocalTypography)).labelLarge;
            } else {
                gapComposer.startReplaceGroup(-1297334695);
            }
            gapComposer.end(false);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1413265060, new MoneyUiFactory$$ExternalSyntheticLambda1(button, expressionEvaluator, genieViewState, textStyle, 23), gapComposer);
            Color color = resolvedStyle.contentColor;
            long j = color != null ? color.value : Color.Unspecified;
            int ordinal = buttonStyle.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                long j2 = j;
                gapComposer.startReplaceGroup(-1297300271);
                PaddingValuesImpl paddingValuesImpl = ButtonDefaults.ContentPadding;
                long j3 = Color.Unspecified;
                ColorScheme colorScheme = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
                ButtonColors buttonColors = colorScheme.defaultButtonColorsCached;
                if (buttonColors == null) {
                    buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.ContainerColor), ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.LabelTextColor), Color.m675copywmQWz5c$default(FilledButtonTokens.DisabledContainerOpacity, ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.DisabledContainerColor), 14), Color.m675copywmQWz5c$default(FilledButtonTokens.DisabledLabelTextOpacity, ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.DisabledLabelTextColor), 14));
                    colorScheme.defaultButtonColorsCached = buttonColors;
                }
                MenuKt.Button(function0, modifier, false, null, buttonColors.m517copyjRlVdoo(j3, j2, j3, j3), null, null, null, Expect_jvmKt.rememberComposableLambda(-60846965, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 18), gapComposer), gapComposer, ((i3 >> 3) & 112) | 805306368, 492);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (ordinal == 2) {
                long j4 = j;
                gapComposer.startReplaceGroup(-1297292889);
                PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.ContentPadding;
                long j5 = Color.Unspecified;
                ColorScheme colorScheme2 = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
                ButtonColors buttonColors2 = colorScheme2.defaultFilledTonalButtonColorsCached;
                if (buttonColors2 == null) {
                    buttonColors2 = new ButtonColors(ColorSchemeKt.fromToken(colorScheme2, FilledTonalButtonTokens.ContainerColor), ColorSchemeKt.fromToken(colorScheme2, FilledTonalButtonTokens.LabelTextColor), Color.m675copywmQWz5c$default(0.12f, ColorSchemeKt.fromToken(colorScheme2, FilledTonalButtonTokens.DisabledContainerColor), 14), Color.m675copywmQWz5c$default(0.38f, ColorSchemeKt.fromToken(colorScheme2, FilledTonalButtonTokens.DisabledLabelTextColor), 14));
                    colorScheme2.defaultFilledTonalButtonColorsCached = buttonColors2;
                }
                MenuKt.FilledTonalButton(function0, modifier, false, null, buttonColors2.m517copyjRlVdoo(j5, j4, j5, j5), null, null, Expect_jvmKt.rememberComposableLambda(1116954326, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 19), gapComposer), gapComposer, ((i3 >> 3) & 112) | 805306368);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (ordinal == 3) {
                long j6 = j;
                gapComposer.startReplaceGroup(-1297284959);
                PaddingValuesImpl paddingValuesImpl3 = ButtonDefaults.ContentPadding;
                long j7 = Color.Unspecified;
                ColorScheme colorScheme3 = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
                ButtonColors buttonColors3 = colorScheme3.defaultElevatedButtonColorsCached;
                if (buttonColors3 == null) {
                    buttonColors3 = new ButtonColors(ColorSchemeKt.fromToken(colorScheme3, ElevatedButtonTokens.ContainerColor), ColorSchemeKt.fromToken(colorScheme3, ElevatedButtonTokens.LabelTextColor), Color.m675copywmQWz5c$default(ElevatedButtonTokens.DisabledContainerOpacity, ColorSchemeKt.fromToken(colorScheme3, ElevatedButtonTokens.DisabledContainerColor), 14), Color.m675copywmQWz5c$default(ElevatedButtonTokens.DisabledLabelTextOpacity, ColorSchemeKt.fromToken(colorScheme3, ElevatedButtonTokens.DisabledLabelTextColor), 14));
                    colorScheme3.defaultElevatedButtonColorsCached = buttonColors3;
                }
                MenuKt.ElevatedButton(function0, modifier, false, null, buttonColors3.m517copyjRlVdoo(j7, j6, j7, j7), null, null, Expect_jvmKt.rememberComposableLambda(-1225683939, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 20), gapComposer), gapComposer, ((i3 >> 3) & 112) | 805306368);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else if (ordinal == 4) {
                gapComposer.startReplaceGroup(-1297277215);
                PaddingValuesImpl paddingValuesImpl4 = ButtonDefaults.ContentPadding;
                long j8 = Color.Unspecified;
                ColorScheme colorScheme4 = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
                ButtonColors buttonColors4 = colorScheme4.defaultOutlinedButtonColorsCached;
                if (buttonColors4 == null) {
                    long j9 = Color.Transparent;
                    buttonColors4 = new ButtonColors(j9, ColorSchemeKt.fromToken(colorScheme4, OutlinedButtonTokens.LabelTextColor), j9, Color.m675copywmQWz5c$default(OutlinedButtonTokens.DisabledLabelTextOpacity, ColorSchemeKt.fromToken(colorScheme4, OutlinedButtonTokens.DisabledLabelTextColor), 14));
                    colorScheme4.defaultOutlinedButtonColorsCached = buttonColors4;
                }
                MenuKt.OutlinedButton(function0, modifier, false, null, buttonColors4.m517copyjRlVdoo(j8, j, j8, j8), null, null, Expect_jvmKt.rememberComposableLambda(-1301271372, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 21), gapComposer), gapComposer, ((i3 >> 3) & 112) | 805306368);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                if (ordinal != 5) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1297302897, false);
                }
                gapComposer.startReplaceGroup(-1297269607);
                MenuKt.TextButton(function0, modifier, false, null, ButtonDefaults.m518textButtonColorsro_MJ88(j, gapComposer), null, Expect_jvmKt.rememberComposableLambda(-2067787618, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 22), gapComposer), gapComposer, ((i3 >> 3) & 112) | 805306368, 492);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(button, resolvedStyle, modifier, i, 1);
        }
    }

    public static VideoCapture.AnonymousClass3 createIsolatedReader(int i, int i2, int i3, int i4) {
        return new VideoCapture.AnonymousClass3(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static final ArrayList getAsDoubleList(Object obj) {
        JsonLogicList asList = getAsList(obj);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asList, 10));
        for (Object obj2 : asList.items) {
            arrayList.add(obj2 instanceof Number ? Double.valueOf(((Number) obj2).doubleValue()) : obj2 instanceof String ? StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) obj2) : null);
        }
        return arrayList;
    }

    public static final JsonLogicList getAsList(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        return list != null ? new JsonLogicList(list) : new JsonLogicList(CollectionsKt__CollectionsJVMKt.listOf(obj));
    }

    public static final ArrayList getComparableList(List list) {
        list.getClass();
        JsonLogicList asList = getAsList(list);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asList, 10));
        for (Object obj : asList.items) {
            arrayList.add(obj instanceof Comparable ? (Comparable) obj : obj instanceof List ? new JsonLogicList((List) obj) : null);
        }
        return arrayList;
    }

    public static final boolean isExpression(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null && !map.isEmpty()) {
            Set keySet = map.keySet();
            if ((keySet instanceof Collection) && keySet.isEmpty()) {
                return true;
            }
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return true;
        }
        return false;
    }
}
