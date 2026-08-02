package com.squareup.cash.transfers.views.composer;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cardcustomizations.signature.SignaturesKt$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ScheduledReloadConfigurationComposersKt {
    public static final void DayItem(Modifier modifier, String str, int i, Integer num, Function0 function0, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        float f;
        Modifier modifier4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1396709054);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i2 | (gapComposer.changed(modifier2) ? 4 : 2);
        }
        int i6 = i4 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(i) ? 256 : 128) | (gapComposer.changed(num) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 9363) != 9362)) {
            Modifier modifier5 = Modifier.Companion.$$INSTANCE;
            if (i5 != 0) {
                modifier2 = modifier5;
            }
            boolean z = num != null && i == num.intValue();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.4f;
                if (num != null && Math.abs(i - num.intValue()) > 1) {
                    f = 0.2f;
                }
            }
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier2, 1.0f), 44.0f);
            if (z) {
                gapComposer.startReplaceGroup(284316287);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                modifier4 = modifier2;
                modifier5 = ImageKt.m177backgroundbw27NRU(modifier5, Color.m675copywmQWz5c$default(0.08f, colors.semantic.text.standard, 14), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
                gapComposer.end(false);
            } else {
                modifier4 = modifier2;
                gapComposer.startReplaceGroup(284508766);
                gapComposer.end(false);
            }
            Modifier alpha = AlphaKt.alpha(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m183clickableoSLSa3U$default(m277height3ABfNKs.then(modifier5), false, null, null, function0, 15), 16.0f, RecyclerView.DECELERATION_RATE, 2), f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, alpha);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, (i6 >> 3) & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(modifier3, str, i, num, function0, i2, i3);
        }
    }

    public static final void DayPickerContent(Modifier modifier, RecurringReloadConfigurationViewModel.SelectDay selectDay, Function1 function1, Composer composer, int i) {
        int i2;
        RecurringReloadConfigurationViewModel.SelectDay selectDay2;
        float f;
        Modifier.Companion companion;
        RecurringReloadConfigurationViewModel.SelectDay selectDay3;
        selectDay.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(160239348);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(selectDay) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = selectDay.frequency == RecurringSchedule.Frequency.EVERY_MONTH;
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
            String str = selectDay.title;
            TextStyle textStyle = Strings.getTypography(gapComposer).header;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (z) {
                gapComposer.startReplaceGroup(81337354);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                selectDay2 = selectDay;
                MonthlyDayList(SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f), selectDay2, function1, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
                f = RecyclerView.DECELERATION_RATE;
            } else {
                selectDay2 = selectDay;
                gapComposer.startReplaceGroup(81486154);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f);
                Strings.getSizes(gapComposer).getClass();
                f = RecyclerView.DECELERATION_RATE;
                WeeklyDayList(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), selectDay2, function1, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            }
            String str2 = selectDay2.disclaimer;
            if (str2 == null) {
                gapComposer.startReplaceGroup(81719769);
                gapComposer.end(false);
                selectDay3 = selectDay2;
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(81719770);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                TextStyle textStyle2 = Strings.getTypography(gapComposer).bodyXSmall;
                long j = Strings.getColors(gapComposer).semantic.text.subtle;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                Strings.getSizes(gapComposer).getClass();
                companion = companion2;
                selectDay3 = selectDay;
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, f, 2), textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(42983532, new TabToolbarsKt$$ExternalSyntheticLambda3(25, selectDay3, function1), gapComposer), gapComposer, 24582, 14);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda8(modifier, selectDay, function1, i, 0);
        }
    }

    public static final void FrequencyPickerContent(Modifier modifier, RecurringReloadConfigurationViewModel.SelectFrequency selectFrequency, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        selectFrequency.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1750598004);
        int i2 = (i & 6) == 0 ? (gapComposer2.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(selectFrequency) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = selectFrequency.title;
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).header;
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            List<Pair> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(RecurringSchedule.Frequency.EVERY_DAY, Room.stringResource(gapComposer, R.string.scheduled_reload_frequency_day)), new Pair(RecurringSchedule.Frequency.EVERY_WEEK, Room.stringResource(gapComposer, R.string.scheduled_reload_frequency_week)), new Pair(RecurringSchedule.Frequency.EVERY_MONTH, Room.stringResource(gapComposer, R.string.scheduled_reload_frequency_month))});
            gapComposer.startReplaceGroup(-228148203);
            for (Pair pair : listOf) {
                RecurringSchedule.Frequency frequency = (RecurringSchedule.Frequency) pair.first;
                String str2 = (String) pair.second;
                CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(frequency == selectFrequency.selectedFrequency);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1389878411, new PastPaySectionKt$$ExternalSyntheticLambda1(str2, 7), gapComposer);
                boolean changed = ((i2 & 896) == 256) | gapComposer.changed(frequency.ordinal());
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda0(26, function1, frequency);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer3 = gapComposer;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue, false, false, null, null, 0L, radio, null, gapComposer3, 6, 1530);
                gapComposer = gapComposer3;
            }
            gapComposer.end(false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-1273733396, new TabToolbarsKt$$ExternalSyntheticLambda3(23, selectFrequency, function1), gapComposer), gapComposer, 24582, 14);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(i, 22, modifier, selectFrequency, function1);
        }
    }

    public static final void MonthlyDayList(Modifier modifier, RecurringReloadConfigurationViewModel.SelectDay selectDay, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1774584822);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(selectDay) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int size = selectDay.items.size();
            int i3 = size * 100;
            int i4 = size * 50;
            Integer num = selectDay.selectedIndex;
            if (num != null) {
                i4 = (num.intValue() + i4) - 1;
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(i4, 2, gapComposer);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(selectDay) | gapComposer.changed(rememberLazyListState) | gapComposer.changed(i4);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new MoneyTabUIKt$MoneyTabLoaded$1$1(selectDay, rememberLazyListState, i4, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            boolean changed = gapComposer.changed(i3) | gapComposer.changed(size) | gapComposer.changedInstance(selectDay) | ((i2 & 896) == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                rememberedValue2 = new SignaturesKt$$ExternalSyntheticLambda1(i3, size, selectDay, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(modifier, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, i2 & 14, 508);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda8(modifier, selectDay, function1, i, 2);
        }
    }

    public static final void ScheduledAmountPickerContent(Modifier modifier, RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker, Function1 function1, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        selectScheduledAmountAtmPicker.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1858574794);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(selectScheduledAmountAtmPicker) ? 32 : 16;
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
            String str = selectScheduledAmountAtmPicker.title;
            TextStyle textStyle = Strings.getTypography(gapComposer).header;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            GapComposer gapComposer2 = gapComposer;
            if (selectScheduledAmountAtmPicker.subtitle.length() > 0) {
                gapComposer2.startReplaceGroup(125829671);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                String str2 = selectScheduledAmountAtmPicker.subtitle;
                TextStyle textStyle2 = Strings.getTypography(gapComposer2).bodyMedium;
                long j = Strings.getColors(gapComposer2).semantic.text.subtle;
                Strings.getSizes(gapComposer2).getClass();
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer2, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer2;
                gapComposer2.end(false);
            } else {
                companion = companion2;
                gapComposer2.startReplaceGroup(126101634);
                gapComposer2.end(false);
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            Modifier.Companion companion3 = companion;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            InputChipKt.InputChipGrid(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), 0, Expect_jvmKt.rememberComposableLambda(-129730089, new SheetKt$$ExternalSyntheticLambda5(27, selectScheduledAmountAtmPicker, function1, function02), gapComposer2), gapComposer2, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            GapComposer gapComposer3 = gapComposer2;
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion3, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-457601090, new TabToolbarsKt$$ExternalSyntheticLambda3(24, selectScheduledAmountAtmPicker, function0), gapComposer2), gapComposer3, 24582, 14);
            gapComposer = gapComposer3;
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17(modifier, selectScheduledAmountAtmPicker, function1, function0, function02, i, 13);
        }
    }

    public static final void WeeklyDayList(Modifier modifier, RecurringReloadConfigurationViewModel.SelectDay selectDay, Function1 function1, Composer composer, int i) {
        RecurringReloadConfigurationViewModel.SelectDay selectDay2;
        Object navHostKt$NavHost$29$1$1$1;
        Throwable th;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(499628806);
        int i2 = (i & 6) == 0 ? (gapComposer.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(selectDay) ? 32 : 16;
        }
        int i3 = 256;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2;
        boolean z = true;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(44.0f);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(selectDay) | gapComposer.changed(mo236toPx0680j_4) | gapComposer.changed(rememberScrollState);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                th = null;
                selectDay2 = selectDay;
                navHostKt$NavHost$29$1$1$1 = new NavHostKt$NavHost$29$1$1$1(selectDay2, mo236toPx0680j_4, rememberScrollState, null, 2);
                gapComposer.updateRememberedValue(navHostKt$NavHost$29$1$1$1);
            } else {
                selectDay2 = selectDay;
                navHostKt$NavHost$29$1$1$1 = rememberedValue;
                th = null;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) navHostKt$NavHost$29$1$1$1);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(modifier, rememberScrollState, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            Throwable th2 = th;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw th2;
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
            gapComposer.startReplaceGroup(-2095033291);
            int i5 = 0;
            for (Object obj : selectDay2.items) {
                boolean z3 = z;
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw th2;
                }
                String str = (String) obj;
                boolean z4 = z2;
                Integer num = selectDay2.selectedIndex;
                boolean changed = ((i4 & 896) == i3 ? z3 : z4) | gapComposer.changed(i6);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda18(i6, 12, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                DayItem(null, str, i6, num, (Function0) rememberedValue2, gapComposer, 0, 1);
                i4 = i4;
                z2 = z4;
                neverEqualPolicy = neverEqualPolicy;
                i5 = i6;
                i3 = i3;
                z = z3;
            }
            gapComposer.end(z2);
            gapComposer.end(z);
        } else {
            selectDay2 = selectDay;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda8(modifier, selectDay2, function1, i, 1);
        }
    }
}
