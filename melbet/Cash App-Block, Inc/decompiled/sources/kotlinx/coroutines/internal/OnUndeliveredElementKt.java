package kotlinx.coroutines.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.mikepenz.markdown.compose.ComposeLocalKt;
import com.mikepenz.markdown.compose.elements.MarkdownImageKt$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.model.NoOpImageTransformerImpl;
import com.squareup.cash.R;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content;
import com.squareup.cash.investing.viewmodels.metrics.InvestingGraphDetailsModel;
import com.squareup.cash.maps.views.MapMarkerPropertiesKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.stablecoin.views.StablecoinHomeViewKt$$ExternalSyntheticLambda7;
import com.squareup.util.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import net.idrnd.face.iad.capture.internal.s2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public abstract class OnUndeliveredElementKt {
    /* renamed from: AccentCircle-RPmYEkk, reason: not valid java name */
    public static final void m4201AccentCircleRPmYEkk(long j, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2052393455);
        int i2 = (gapComposer.changed(j) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier then = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 8.0f).then(new VerticalAlignElement(Alignment.Companion.CenterVertically));
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new c7$$ExternalSyntheticLambda6(j, 14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(0, gapComposer, then, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MapMarkerPropertiesKt$$ExternalSyntheticLambda1(i, 4, j);
        }
    }

    public static final void FinancialBarGraph(final InvestingFinancialViewModel$Content investingFinancialViewModel$Content, final Function1 function1, final Modifier modifier, Composer composer, final int i) {
        int i2;
        int i3;
        investingFinancialViewModel$Content.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1915179173);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(investingFinancialViewModel$Content) : gapComposer.changedInstance(investingFinancialViewModel$Content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            i3 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (investingFinancialViewModel$Content.financialModels.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.investing.components.metrics.FinancialBarGraphKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    OnUndeliveredElementKt.FinancialBarGraph(investingFinancialViewModel$Content, function1, modifier, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    OnUndeliveredElementKt.FinancialBarGraph(investingFinancialViewModel$Content, function1, modifier, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i3 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1328303354, new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(3, modifier, investingFinancialViewModel$Content, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            final int i6 = i3;
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.investing.components.metrics.FinancialBarGraphKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            OnUndeliveredElementKt.FinancialBarGraph(investingFinancialViewModel$Content, function1, modifier, composer2, Updater.updateChangedFlags(i6 | 1));
                            break;
                        default:
                            OnUndeliveredElementKt.FinancialBarGraph(investingFinancialViewModel$Content, function1, modifier, composer2, Updater.updateChangedFlags(i6 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void InvestingGraphDetails(int i, Composer composer, Modifier modifier, ArrayList arrayList) {
        Modifier modifier2;
        MutableState mutableState;
        MutableState mutableState2;
        Modifier.Companion companion;
        TextStyle textStyle;
        MutableState mutableState3;
        boolean z;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1742150854);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(arrayList) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle2 = ((Typography) gapComposer.consume(providableCompositionLocal)).buttonCompact;
            boolean changed = gapComposer.changed(arrayList.hashCode());
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(new TextUnit(textStyle2.spanStyle.fontSize));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState4 = (MutableState) rememberedValue;
            TextStyle textStyle3 = ((Typography) gapComposer.consume(providableCompositionLocal)).buttonCompact;
            boolean changed2 = gapComposer.changed(arrayList.hashCode());
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(new TextUnit(textStyle3.spanStyle.fontSize));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState5 = (MutableState) rememberedValue2;
            TextStyle textStyle4 = ((Typography) gapComposer.consume(providableCompositionLocal)).buttonCompact;
            boolean changed3 = gapComposer.changed(arrayList.hashCode());
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == obj) {
                mutableState = mutableState4;
                rememberedValue3 = Updater.mutableStateOf$default(new TextUnit(textStyle4.spanStyle.fontSize));
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                mutableState = mutableState4;
            }
            MutableState mutableState6 = (MutableState) rememberedValue3;
            TextStyle textStyle5 = ((Typography) gapComposer.consume(providableCompositionLocal)).buttonCompact;
            boolean changed4 = gapComposer.changed(arrayList.hashCode());
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue4 == obj) {
                rememberedValue4 = Updater.mutableStateOf$default(new TextUnit(textStyle5.spanStyle.fontSize));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState7 = (MutableState) rememberedValue4;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceEvenly, Alignment.Companion.Top, gapComposer, 6);
            int i3 = 6;
            TextStyle textStyle6 = textStyle5;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-368705389);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InvestingGraphDetailsModel investingGraphDetailsModel = (InvestingGraphDetailsModel) it.next();
                boolean z2 = investingGraphDetailsModel.showQuarter;
                String str = investingGraphDetailsModel.year;
                String str2 = z2 ? investingGraphDetailsModel.quarter : str;
                String str3 = z2 ? str : null;
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                TextStyle textStyle7 = textStyle4;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                MutableState mutableState8 = mutableState5;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                ComposeUiNode.Companion.getClass();
                Function0 function02 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                MutableState mutableState9 = mutableState6;
                if (gapComposer.inserting) {
                    gapComposer.createNode(function02);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                Modifier aspectRatio = OffsetKt.aspectRatio(2.18f, SizeKt.m290width3ABfNKs(companion2, 48.0f), false);
                long j2 = Strings.getColors(gapComposer).semantic.background.prominent;
                Strings.getSizes(gapComposer).getClass();
                Object obj2 = DefaultSizes.border.entries;
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(8.0f, aspectRatio, j2, 4.0f);
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle2, 0L, ((TextUnit) mutableState.getValue()).packedValue, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                TextStyle textStyle8 = textStyle2;
                long sp = Room.getSp(i3);
                Modifier.Companion companion3 = companion2;
                long j3 = Strings.getColors(gapComposer).base.constantWhite;
                MutableState mutableState10 = mutableState;
                boolean changed5 = gapComposer.changed(mutableState10);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed5 || rememberedValue5 == obj) {
                    mutableState2 = mutableState8;
                    rememberedValue5 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(24, mutableState10);
                    gapComposer.updateRememberedValue(rememberedValue5);
                } else {
                    mutableState2 = mutableState8;
                }
                TextStyle textStyle9 = textStyle3;
                MutableState mutableState11 = mutableState7;
                Object obj3 = obj;
                MutableState mutableState12 = mutableState2;
                TextStyle textStyle10 = textStyle6;
                int i4 = i3;
                zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, 1597440, 128, j3, sp, gapComposer, m, m994copyp1EtxEg$default, str2, (Function1) rememberedValue5);
                if (str3 == null) {
                    gapComposer.startReplaceGroup(-124658268);
                    gapComposer.end(false);
                    mutableState3 = mutableState12;
                    companion = companion3;
                    textStyle = textStyle9;
                } else {
                    gapComposer.startReplaceGroup(-124658267);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    companion = companion3;
                    TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(textStyle9, 0L, ((TextUnit) mutableState12.getValue()).packedValue, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                    textStyle = textStyle9;
                    long sp2 = Room.getSp(i4);
                    long j4 = Strings.getColors(gapComposer).semantic.text.standard;
                    boolean changed6 = gapComposer.changed(mutableState12);
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (changed6 || rememberedValue6 == obj3) {
                        rememberedValue6 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(25, mutableState12);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    mutableState3 = mutableState12;
                    zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, 1597488, 128, j4, sp2, gapComposer, m302paddingqDBjuR0$default, m994copyp1EtxEg$default2, str3, (Function1) rememberedValue6);
                    gapComposer.end(false);
                }
                Modifier.Companion companion4 = companion;
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 6.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                String str4 = investingGraphDetailsModel.expected;
                TextStyle m994copyp1EtxEg$default3 = TextStyle.m994copyp1EtxEg$default(textStyle10, 0L, ((TextUnit) mutableState11.getValue()).packedValue, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                textStyle6 = textStyle10;
                long j5 = Strings.getColors(gapComposer).semantic.text.subtle;
                long sp3 = Room.getSp(i4);
                boolean changed7 = gapComposer.changed(mutableState11);
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (changed7 || rememberedValue7 == obj3) {
                    rememberedValue7 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(26, mutableState11);
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, 1597488, 128, j5, sp3, gapComposer, m302paddingqDBjuR0$default2, m994copyp1EtxEg$default3, str4, (Function1) rememberedValue7);
                Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 6.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                String str5 = investingGraphDetailsModel.actual;
                TextStyle m994copyp1EtxEg$default4 = TextStyle.m994copyp1EtxEg$default(textStyle7, 0L, ((TextUnit) mutableState9.getValue()).packedValue, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                int ordinal = investingGraphDetailsModel.labelColorType.ordinal();
                if (ordinal != 0) {
                    z = true;
                    if (ordinal != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -558168567, false);
                    }
                    gapComposer.startReplaceGroup(-558163869);
                    j = Strings.getColors(gapComposer).semantic.text.disabled;
                    gapComposer.end(false);
                } else {
                    z = true;
                    gapComposer.startReplaceGroup(-558166013);
                    j = Strings.getColors(gapComposer).semantic.icon.standard;
                    gapComposer.end(false);
                }
                long j6 = j;
                long sp4 = Room.getSp(i4);
                boolean changed8 = gapComposer.changed(mutableState9);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (changed8 || rememberedValue8 == obj3) {
                    rememberedValue8 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(27, mutableState9);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, 1597488, 128, j6, sp4, gapComposer, m302paddingqDBjuR0$default3, m994copyp1EtxEg$default4, str5, (Function1) rememberedValue8);
                gapComposer.end(z);
                obj = obj3;
                textStyle4 = textStyle7;
                companion2 = companion4;
                mutableState6 = mutableState9;
                textStyle2 = textStyle8;
                mutableState = mutableState10;
                mutableState7 = mutableState11;
                i3 = i4;
                textStyle3 = textStyle;
                mutableState5 = mutableState3;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StablecoinHomeViewKt$$ExternalSyntheticLambda7(arrayList, modifier2, i, 2);
        }
    }

    public static final void InvestingGraphLegend(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0) {
        Modifier modifier2;
        str.getClass();
        str2.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(342102861);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.icon.standard;
            long j2 = MooncakeTheme.getColors(gapComposer).placeholderLabel;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            m4201AccentCircleRPmYEkk(j, gapComposer, 6);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 7.0f));
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4086, j, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
            m4201AccentCircleRPmYEkk(j2, gapComposer, 6);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 7.0f));
            if (!(((double) 1.0f) > 0.0d)) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4084, j2, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            Modifier then = ImageKt.m183clickableoSLSa3U$default(SpacerKt.m298padding3ABfNKs(companion, 4.0f), false, null, null, function0, 15).then(new VerticalAlignElement(Alignment.Companion.CenterVertically));
            Icons icons = Icons.InformationFill16;
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, Room.stringResource(gapComposer, R.string.investing_components_more_info_content_description), then, colors2.semantic.icon.extraSubtle, gapComposer, 6, 0);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AgentsHomeViewKt$$ExternalSyntheticLambda16(str, function0, modifier2, str2, i, 1);
        }
    }

    public static final void MarkdownImage(String str, ASTNodeImpl aSTNodeImpl, Composer composer, int i) {
        RecomposeScopeImpl recomposeScopeImpl;
        MarkdownImageKt$$ExternalSyntheticLambda0 markdownImageKt$$ExternalSyntheticLambda0;
        str.getClass();
        aSTNodeImpl.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(174338955);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(aSTNodeImpl) ? 32 : 16);
        int i3 = 1;
        int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ASTNodeImpl findChildOfTypeRecursive = s2.findChildOfTypeRecursive(aSTNodeImpl, MarkdownTokenTypes.LINK_DESTINATION);
            if (findChildOfTypeRecursive == null || s2.getUnescapedTextInNode(findChildOfTypeRecursive, str) == null) {
                recomposeScopeImpl = gapComposer.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    markdownImageKt$$ExternalSyntheticLambda0 = new MarkdownImageKt$$ExternalSyntheticLambda0(str, aSTNodeImpl, i, i4);
                    recomposeScopeImpl.block = markdownImageKt$$ExternalSyntheticLambda0;
                }
                return;
            }
            ((NoOpImageTransformerImpl) gapComposer.consume(ComposeLocalKt.LocalImageTransformer)).getClass();
            gapComposer.startReplaceGroup(1643297092);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(1116589373);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            markdownImageKt$$ExternalSyntheticLambda0 = new MarkdownImageKt$$ExternalSyntheticLambda0(str, aSTNodeImpl, i, i3);
            recomposeScopeImpl.block = markdownImageKt$$ExternalSyntheticLambda0;
        }
    }

    public static final void callUndeliveredElement(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException callUndeliveredElementCatchingException = callUndeliveredElementCatchingException(function1, obj, null);
        if (callUndeliveredElementCatchingException != null) {
            JobKt.handleCoroutineException(coroutineContext, callUndeliveredElementCatchingException);
        }
    }

    public static final UndeliveredElementException callUndeliveredElementCatchingException(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(Boxes$$ExternalSyntheticOutline1.m("Exception in undelivered element handler for ", obj), th);
            }
            ExceptionsKt__ExceptionsKt.addSuppressed(undeliveredElementException, th);
            return undeliveredElementException;
        }
    }
}
