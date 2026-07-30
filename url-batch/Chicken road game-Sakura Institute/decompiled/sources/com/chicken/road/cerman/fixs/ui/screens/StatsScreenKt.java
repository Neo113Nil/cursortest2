package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BarChartKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.navigation.NavController;
import androidx.profileinstaller.ProfileVerifier;
import com.chicken.road.cerman.fixs.BroilerApp;
import com.chicken.road.cerman.fixs.Routes;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.EggLog;
import com.chicken.road.cerman.fixs.data.FeedEntry;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.data.Sale;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import com.chicken.road.cerman.fixs.ui.Fmt;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* compiled from: StatsScreen.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a(\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010\u000b\u001a%\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002\u001a$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002¨\u0006'²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020*0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u000eX\u008a\u0084\u0002"}, d2 = {"StatsScreen", "", "nav", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V", "ChartCard", "title", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LineChart", "values", "", "", "accent", "Landroidx/compose/ui/graphics/Color;", "LineChart-RPmYEkk", "(Ljava/util/List;JLandroidx/compose/runtime/Composer;I)V", "DualBarChart", "rev", Routes.FEED, "revColor", "feedColor", "DualBarChart-9z6LAg8", "(Ljava/util/List;Ljava/util/List;JJLandroidx/compose/runtime/Composer;I)V", "LegendDot", "c", "label", "LegendDot-Iv8Zu3U", "(JLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "startOfDay", "", "now", "monthKey", "Lkotlin/Pair;", "monthsAgo", "", "app_release", "chickens", "Lcom/chicken/road/cerman/fixs/data/Chicken;", "Lcom/chicken/road/cerman/fixs/data/FeedEntry;", "sales", "Lcom/chicken/road/cerman/fixs/data/Sale;", Routes.EGGS, "Lcom/chicken/road/cerman/fixs/data/EggLog;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartCard$lambda$8(String str, Function2 function2, int i, Composer composer, int i2) {
        ChartCard(str, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DualBarChart_9z6LAg8$lambda$18(List list, List list2, long j, long j2, int i, Composer composer, int i2) {
        m6777DualBarChart9z6LAg8(list, list2, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendDot_Iv8Zu3U$lambda$20(long j, String str, int i, Composer composer, int i2) {
        m6778LegendDotIv8Zu3U(j, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LineChart_RPmYEkk$lambda$13(List list, long j, int i, Composer composer, int i2) {
        m6779LineChartRPmYEkk(list, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatsScreen$lambda$7(NavController navController, int i, Composer composer, int i2) {
        StatsScreen(navController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void StatsScreen(final NavController nav, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(nav, "nav");
        Composer startRestartGroup = composer.startRestartGroup(1952499096);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nav) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1952499096, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.StatsScreen (StatsScreen.kt:50)");
            }
            startRestartGroup.startReplaceGroup(1646367401);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = BroilerApp.INSTANCE.getINSTANCE().getRepository();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            final State collectAsState = SnapshotStateKt.collectAsState(repository.getChickens(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            final State collectAsState2 = SnapshotStateKt.collectAsState(repository.getAllFeed(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            final State collectAsState3 = SnapshotStateKt.collectAsState(repository.getAllSales(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            final State collectAsState4 = SnapshotStateKt.collectAsState(repository.getAllEggs(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(1646379156);
            boolean changedInstance = startRestartGroup.changedInstance(nav);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit StatsScreen$lambda$6$lambda$5;
                        StatsScreen$lambda$6$lambda$5 = StatsScreenKt.StatsScreen$lambda$6$lambda$5(NavController.this);
                        return StatsScreen$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            CommonKt.FarmScaffold("Statistics", (Function0) rememberedValue2, null, null, ComposableLambdaKt.rememberComposableLambda(-296545096, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$StatsScreen$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues inner, Composer composer2, int i3) {
                    List StatsScreen$lambda$1;
                    long startOfDay;
                    List StatsScreen$lambda$12;
                    List StatsScreen$lambda$3;
                    List StatsScreen$lambda$2;
                    List StatsScreen$lambda$22;
                    List StatsScreen$lambda$32;
                    Pair monthKey;
                    List StatsScreen$lambda$4;
                    List StatsScreen$lambda$23;
                    List StatsScreen$lambda$33;
                    List StatsScreen$lambda$42;
                    Composer composer3 = composer2;
                    Intrinsics.checkNotNullParameter(inner, "inner");
                    int i4 = (i3 & 6) == 0 ? i3 | (composer3.changed(inner) ? 4 : 2) : i3;
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-296545096, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.StatsScreen.<anonymous> (StatsScreen.kt:58)");
                    }
                    composer3.startReplaceGroup(740162597);
                    StatsScreen$lambda$1 = StatsScreenKt.StatsScreen$lambda$1(collectAsState);
                    if (StatsScreen$lambda$1.isEmpty()) {
                        StatsScreen$lambda$23 = StatsScreenKt.StatsScreen$lambda$2(collectAsState2);
                        if (StatsScreen$lambda$23.isEmpty()) {
                            StatsScreen$lambda$33 = StatsScreenKt.StatsScreen$lambda$3(collectAsState3);
                            if (StatsScreen$lambda$33.isEmpty()) {
                                StatsScreen$lambda$42 = StatsScreenKt.StatsScreen$lambda$4(collectAsState4);
                                if (StatsScreen$lambda$42.isEmpty()) {
                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, inner), 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                                    Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    CommonKt.EmptyState(BarChartKt.getBarChart(Icons.Filled.INSTANCE), "Nothing to chart yet", "Add chickens, feed and sales to see analytics.", composer3, 432);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2.endReplaceGroup();
                                    return;
                                }
                            }
                        }
                    }
                    composer2.endReplaceGroup();
                    float f = 16;
                    Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, inner), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), Dp.m6299constructorimpl(f), 0.0f, 2, null);
                    State<List<EggLog>> state = collectAsState4;
                    State<List<Sale>> state2 = collectAsState3;
                    State<List<FeedEntry>> state3 = collectAsState2;
                    State<List<Chicken>> state4 = collectAsState;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m683paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                    Updater.m3340setimpl(m3333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    long currentTimeMillis = System.currentTimeMillis();
                    startOfDay = StatsScreenKt.startOfDay(currentTimeMillis);
                    IntProgression downTo = RangesKt.downTo(13, 0);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(downTo, 10));
                    Iterator<Integer> it = downTo.iterator();
                    while (it.hasNext()) {
                        long nextInt = startOfDay - (((IntIterator) it).nextInt() * CalendarModelKt.MillisecondsIn24Hours);
                        long j = nextInt + CalendarModelKt.MillisecondsIn24Hours;
                        StatsScreen$lambda$4 = StatsScreenKt.StatsScreen$lambda$4(state);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : StatsScreen$lambda$4) {
                            long date = ((EggLog) obj).getDate();
                            if (nextInt <= date && date < j) {
                                arrayList2.add(obj);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        int i5 = 0;
                        while (it2.hasNext()) {
                            i5 += ((EggLog) it2.next()).getCount();
                        }
                        arrayList.add(Integer.valueOf(i5));
                    }
                    final ArrayList arrayList3 = arrayList;
                    StatsScreenKt.ChartCard("Eggs per day Â· last 14 days", ComposableLambdaKt.rememberComposableLambda(1841602672, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$StatsScreen$2$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1841602672, i6, -1, "com.chicken.road.cerman.fixs.ui.screens.StatsScreen.<anonymous>.<anonymous>.<anonymous> (StatsScreen.kt:82)");
                            }
                            List<Integer> list = arrayList3;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            Iterator<T> it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(Double.valueOf(((Number) it3.next()).intValue()));
                            }
                            StatsScreenKt.m6779LineChartRPmYEkk(arrayList4, ThemeKt.getAmber(), composer4, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 54);
                    float f2 = 14;
                    SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f2)), composer3, 6);
                    IntProgression downTo2 = RangesKt.downTo(5, 0);
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(downTo2, 10));
                    Iterator<Integer> it3 = downTo2.iterator();
                    while (it3.hasNext()) {
                        monthKey = StatsScreenKt.monthKey(currentTimeMillis, ((IntIterator) it3).nextInt());
                        arrayList4.add(monthKey);
                    }
                    ArrayList<Pair> arrayList5 = arrayList4;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                    for (Pair pair : arrayList5) {
                        long longValue = ((Number) pair.component1()).longValue();
                        long longValue2 = ((Number) pair.component2()).longValue();
                        StatsScreen$lambda$32 = StatsScreenKt.StatsScreen$lambda$3(state2);
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj2 : StatsScreen$lambda$32) {
                            long date2 = ((Sale) obj2).getDate();
                            if (longValue <= date2 && date2 < longValue2) {
                                arrayList7.add(obj2);
                            }
                        }
                        Iterator it4 = arrayList7.iterator();
                        double d = 0.0d;
                        while (it4.hasNext()) {
                            d += ((Sale) it4.next()).getTotal();
                        }
                        arrayList6.add(Double.valueOf(d));
                    }
                    final ArrayList arrayList8 = arrayList6;
                    ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                    for (Pair pair2 : arrayList5) {
                        long longValue3 = ((Number) pair2.component1()).longValue();
                        long longValue4 = ((Number) pair2.component2()).longValue();
                        StatsScreen$lambda$22 = StatsScreenKt.StatsScreen$lambda$2(state3);
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj3 : StatsScreen$lambda$22) {
                            long date3 = ((FeedEntry) obj3).getDate();
                            if (longValue3 <= date3 && date3 < longValue4) {
                                arrayList10.add(obj3);
                            }
                        }
                        Iterator it5 = arrayList10.iterator();
                        double d2 = 0.0d;
                        while (it5.hasNext()) {
                            d2 += ((FeedEntry) it5.next()).getCost();
                        }
                        arrayList9.add(Double.valueOf(d2));
                    }
                    final ArrayList arrayList11 = arrayList9;
                    boolean z = true;
                    StatsScreenKt.ChartCard("Revenue vs feed cost Â· 6 months", ComposableLambdaKt.rememberComposableLambda(326115239, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$StatsScreen$2$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i6) {
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(326115239, i6, -1, "com.chicken.road.cerman.fixs.ui.screens.StatsScreen.<anonymous>.<anonymous>.<anonymous> (StatsScreen.kt:91)");
                            }
                            StatsScreenKt.m6777DualBarChart9z6LAg8(arrayList8, arrayList11, ThemeKt.getForest(), ThemeKt.getAmberDeep(), composer4, 3456);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 54);
                    SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f2)), composer3, 6);
                    CommonKt.SectionHeader("Profit per chicken", composer3, 6);
                    StatsScreen$lambda$12 = StatsScreenKt.StatsScreen$lambda$1(state4);
                    List<Chicken> list = StatsScreen$lambda$12;
                    ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (Chicken chicken : list) {
                        StatsScreen$lambda$3 = StatsScreenKt.StatsScreen$lambda$3(state2);
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj4 : StatsScreen$lambda$3) {
                            Long chickenId = ((Sale) obj4).getChickenId();
                            long id = chicken.getId();
                            if (chickenId != null && chickenId.longValue() == id) {
                                arrayList13.add(obj4);
                            }
                        }
                        Iterator it6 = arrayList13.iterator();
                        double d3 = 0.0d;
                        while (it6.hasNext()) {
                            d3 += ((Sale) it6.next()).getTotal();
                        }
                        StatsScreen$lambda$2 = StatsScreenKt.StatsScreen$lambda$2(state3);
                        ArrayList arrayList14 = new ArrayList();
                        for (Object obj5 : StatsScreen$lambda$2) {
                            Long chickenId2 = ((FeedEntry) obj5).getChickenId();
                            long id2 = chicken.getId();
                            if (chickenId2 != null && chickenId2.longValue() == id2) {
                                arrayList14.add(obj5);
                            }
                        }
                        Iterator it7 = arrayList14.iterator();
                        double d4 = 0.0d;
                        while (it7.hasNext()) {
                            d4 += ((FeedEntry) it7.next()).getCost();
                        }
                        arrayList12.add(new Triple(chicken.getName(), Double.valueOf(d3 - (d4 + chicken.getAcquiredCost())), chicken.getBreed()));
                    }
                    List sortedWith = CollectionsKt.sortedWith(arrayList12, new Comparator() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$StatsScreen$2$invoke$lambda$19$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues((Double) ((Triple) t2).getSecond(), (Double) ((Triple) t).getSecond());
                        }
                    });
                    if (sortedWith.isEmpty()) {
                        composer3.startReplaceGroup(-1339667393);
                        TextKt.m2373Text4IGK_g("Add chickens to see this.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 131058);
                        composer2.endReplaceGroup();
                        composer3 = composer3;
                    } else {
                        composer3.startReplaceGroup(-1339464622);
                        List<Triple> list2 = sortedWith;
                        Iterator it8 = list2.iterator();
                        if (!it8.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        double abs = Math.abs(((Number) ((Triple) it8.next()).getSecond()).doubleValue());
                        while (it8.hasNext()) {
                            abs = Math.max(abs, Math.abs(((Number) ((Triple) it8.next()).getSecond()).doubleValue()));
                        }
                        final double coerceAtLeast = RangesKt.coerceAtLeast(abs, 1.0d);
                        for (Triple triple : list2) {
                            final String str = (String) triple.component1();
                            final double doubleValue = ((Number) triple.component2()).doubleValue();
                            final String str2 = (String) triple.component3();
                            boolean z2 = z;
                            CardKt.Card(PaddingKt.m683paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, z2 ? 1 : 0, null), 0.0f, Dp.m6299constructorimpl(5), z2 ? 1 : 0, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(f)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-202841219, z2, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$StatsScreen$2$2$3$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer4, Integer num) {
                                    invoke(columnScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Card, Composer composer4, int i6) {
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i6 & 17) != 16 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-202841219, i6, -1, "com.chicken.road.cerman.fixs.ui.screens.StatsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatsScreen.kt:111)");
                                        }
                                        Modifier m681padding3ABfNKs = PaddingKt.m681padding3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(14));
                                        double d5 = doubleValue;
                                        String str3 = str;
                                        String str4 = str2;
                                        double d6 = coerceAtLeast;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer4, m681padding3ABfNKs);
                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor3);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer4);
                                        Updater.m3340setimpl(m3333constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, companion);
                                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor4);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m3333constructorimpl4 = Updater.m3333constructorimpl(composer4);
                                        Updater.m3340setimpl(m3333constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                        Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, weight$default);
                                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor5);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m3333constructorimpl5 = Updater.m3333constructorimpl(composer4);
                                        Updater.m3340setimpl(m3333constructorimpl5, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3333constructorimpl5.getInserting() || !Intrinsics.areEqual(m3333constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                            m3333constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                            m3333constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                        TextKt.m2373Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getTitleMedium(), composer4, 0, 0, 65534);
                                        TextKt.m2373Text4IGK_g(str4, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        TextKt.m2373Text4IGK_g(Fmt.INSTANCE.money(d5), (Modifier) null, d5 >= 0.0d ? ThemeKt.getForest() : ThemeKt.getBrick(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131034);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(6)), composer4, 6);
                                        float f3 = 8;
                                        float f4 = 4;
                                        Modifier m235backgroundbw27NRU = BackgroundKt.m235backgroundbw27NRU(SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6299constructorimpl(f3)), MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getSurfaceVariant(), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(f4)));
                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer4, m235backgroundbw27NRU);
                                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor6);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m3333constructorimpl6 = Updater.m3333constructorimpl(composer4);
                                        Updater.m3340setimpl(m3333constructorimpl6, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3333constructorimpl6.getInserting() || !Intrinsics.areEqual(m3333constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                            m3333constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                            m3333constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        BoxKt.Box(BackgroundKt.m235backgroundbw27NRU(SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, RangesKt.coerceIn((float) (Math.abs(d5) / d6), 0.05f, 1.0f)), Dp.m6299constructorimpl(f3)), d5 >= 0.0d ? ThemeKt.getForest() : ThemeKt.getBrick(), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(f4))), composer4, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer2, 196614, 24);
                            z = z2 ? 1 : 0;
                            f = f;
                        }
                        composer2.endReplaceGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(32)), composer3, 6);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 24582, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit StatsScreen$lambda$7;
                    StatsScreen$lambda$7 = StatsScreenKt.StatsScreen$lambda$7(NavController.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return StatsScreen$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatsScreen$lambda$6$lambda$5(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartCard(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1124644364);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1124644364, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.ChartCard (StatsScreen.kt:147)");
            }
            composer2 = startRestartGroup;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(20)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1537306726, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$ChartCard$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i3 & 17) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1537306726, i3, -1, "com.chicken.road.cerman.fixs.ui.screens.ChartCard.<anonymous> (StatsScreen.kt:153)");
                        }
                        Modifier m681padding3ABfNKs = PaddingKt.m681padding3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(16));
                        String str2 = str;
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m681padding3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer3);
                        Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m2373Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, 0, 0, 65534);
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                        function22.invoke(composer3, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), composer2, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChartCard$lambda$8;
                    ChartCard$lambda$8 = StatsScreenKt.ChartCard$lambda$8(str, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ChartCard$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LineChart-RPmYEkk, reason: not valid java name */
    public static final void m6779LineChartRPmYEkk(final List<Double> list, final long j, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(36921131);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(36921131, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.LineChart (StatsScreen.kt:162)");
            }
            Double maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Double>) list);
            final double coerceAtLeast = RangesKt.coerceAtLeast(maxOrNull != null ? maxOrNull.doubleValue() : 0.0d, 1.0d);
            Modifier m712height3ABfNKs = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6299constructorimpl(140));
            startRestartGroup.startReplaceGroup(63218931);
            boolean changedInstance = startRestartGroup.changedInstance(list) | startRestartGroup.changed(coerceAtLeast) | ((i2 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LineChart_RPmYEkk$lambda$12$lambda$11;
                        LineChart_RPmYEkk$lambda$12$lambda$11 = StatsScreenKt.LineChart_RPmYEkk$lambda$12$lambda$11(list, j, coerceAtLeast, (DrawScope) obj);
                        return LineChart_RPmYEkk$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue = function1;
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(m712height3ABfNKs, (Function1) rememberedValue, startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LineChart_RPmYEkk$lambda$13;
                    LineChart_RPmYEkk$lambda$13 = StatsScreenKt.LineChart_RPmYEkk$lambda$13(list, j, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LineChart_RPmYEkk$lambda$13;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LineChart_RPmYEkk$lambda$12$lambda$11(List list, long j, double d, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3668getWidthimpl = Size.m3668getWidthimpl(Canvas.mo4396getSizeNHjbRc());
        float m3665getHeightimpl = Size.m3665getHeightimpl(Canvas.mo4396getSizeNHjbRc());
        float size = list.size() > 1 ? m3668getWidthimpl / (list.size() - 1) : m3668getWidthimpl;
        int i = 1;
        while (i < 4) {
            float f = (i * m3665getHeightimpl) / 4.0f;
            DrawScope.m4382drawLineNGM6Ib0$default(Canvas, ColorKt.Color(4293254601L), OffsetKt.Offset(0.0f, f), OffsetKt.Offset(m3668getWidthimpl, f), 1.0f, 0, null, 0.0f, null, 0, 496, null);
            i++;
            m3665getHeightimpl = m3665getHeightimpl;
        }
        float f2 = m3665getHeightimpl;
        Path Path = AndroidPath_androidKt.Path();
        Path Path2 = AndroidPath_androidKt.Path();
        List list2 = list;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            double doubleValue = ((Number) obj).doubleValue();
            float f3 = i3 * size;
            float f4 = f2;
            float f5 = (f4 - ((float) ((doubleValue / d) * (f4 - 10)))) - 4.0f;
            if (i3 == 0) {
                Path.moveTo(f3, f5);
                Path2.moveTo(f3, f4);
            } else {
                Path.lineTo(f3, f5);
            }
            Path2.lineTo(f3, f5);
            i3 = i4;
            f2 = f4;
        }
        float f6 = f2;
        Path2.lineTo(m3668getWidthimpl, f6);
        Path2.close();
        DrawScope.m4386drawPathLG529CI$default(Canvas, Path2, Color.m3839copywmQWz5c$default(j, 0.18f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, null, null, 0, 60, null);
        DrawScope.m4386drawPathLG529CI$default(Canvas, Path, j, 0.0f, new Stroke(4.0f, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        for (Object obj2 : list2) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DrawScope.m4377drawCircleVaOC9Bg$default(Canvas, j, 5.0f, OffsetKt.Offset(i2 * size, (f6 - ((float) ((((Number) obj2).doubleValue() / d) * (f6 - 10)))) - 4.0f), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            i2 = i5;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DualBarChart-9z6LAg8, reason: not valid java name */
    public static final void m6777DualBarChart9z6LAg8(final List<Double> list, final List<Double> list2, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        Composer composer2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-2039047355);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2039047355, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.DualBarChart (StatsScreen.kt:192)");
            }
            Double maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Double>) CollectionsKt.plus((Collection) list, (Iterable) list2));
            double coerceAtLeast = maxOrNull != null ? RangesKt.coerceAtLeast(maxOrNull.doubleValue(), 1.0d) : 1.0d;
            Modifier m712height3ABfNKs = SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6299constructorimpl(140));
            startRestartGroup.startReplaceGroup(-1411926383);
            boolean changedInstance = startRestartGroup.changedInstance(list) | startRestartGroup.changed(coerceAtLeast) | startRestartGroup.changedInstance(list2) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                modifier = m712height3ABfNKs;
                final double d = coerceAtLeast;
                composer2 = startRestartGroup;
                i3 = i4;
                Function1 function1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DualBarChart_9z6LAg8$lambda$16$lambda$15;
                        DualBarChart_9z6LAg8$lambda$16$lambda$15 = StatsScreenKt.DualBarChart_9z6LAg8$lambda$16$lambda$15(list, d, list2, j, j2, (DrawScope) obj);
                        return DualBarChart_9z6LAg8$lambda$16$lambda$15;
                    }
                };
                composer2.updateRememberedValue(function1);
                rememberedValue = function1;
            } else {
                modifier = m712height3ABfNKs;
                composer2 = startRestartGroup;
                i3 = i4;
            }
            composer2.endReplaceGroup();
            CanvasKt.Canvas(modifier, (Function1) rememberedValue, composer2, 6);
            SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(8)), composer2, 6);
            Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(14));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m561spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
            Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m6778LegendDotIv8Zu3U(j, "Revenue", composer2, ((i3 >> 6) & 14) | 48);
            m6778LegendDotIv8Zu3U(j2, "Feed cost", composer2, ((i3 >> 9) & 14) | 48);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DualBarChart_9z6LAg8$lambda$18;
                    DualBarChart_9z6LAg8$lambda$18 = StatsScreenKt.DualBarChart_9z6LAg8$lambda$18(list, list2, j, j2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DualBarChart_9z6LAg8$lambda$18;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DualBarChart_9z6LAg8$lambda$16$lambda$15(List list, double d, List list2, long j, long j2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3668getWidthimpl = Size.m3668getWidthimpl(Canvas.mo4396getSizeNHjbRc());
        float m3665getHeightimpl = Size.m3665getHeightimpl(Canvas.mo4396getSizeNHjbRc());
        float size = m3668getWidthimpl / list.size();
        float f = size * 0.3f;
        Iterator<Integer> it = CollectionsKt.getIndices(list).iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            float f2 = (nextInt * size) + (size / 2.0f);
            double d2 = m3665getHeightimpl - 8;
            float doubleValue = (float) ((((Number) list.get(nextInt)).doubleValue() / d) * d2);
            float doubleValue2 = (float) ((((Number) list2.get(nextInt)).doubleValue() / d) * d2);
            float f3 = f;
            DrawScope.m4392drawRoundRectuAw5IA$default(Canvas, j, OffsetKt.Offset((f2 - f) - 2.0f, m3665getHeightimpl - doubleValue), androidx.compose.ui.geometry.SizeKt.Size(f, doubleValue), CornerRadiusKt.CornerRadius(6.0f, 6.0f), null, 0.0f, null, 0, 240, null);
            DrawScope.m4392drawRoundRectuAw5IA$default(Canvas, j2, OffsetKt.Offset(f2 + 2.0f, m3665getHeightimpl - doubleValue2), androidx.compose.ui.geometry.SizeKt.Size(f3, doubleValue2), CornerRadiusKt.CornerRadius(6.0f, 6.0f), null, 0.0f, null, 0, 240, null);
            f = f3;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: LegendDot-Iv8Zu3U, reason: not valid java name */
    private static final void m6778LegendDotIv8Zu3U(final long j, final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1646380904);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1646380904, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.LegendDot (StatsScreen.kt:226)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m235backgroundbw27NRU(SizeKt.m726size3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(10)), j, RoundedCornerShapeKt.RoundedCornerShape(50)), startRestartGroup, 0);
            composer2 = startRestartGroup;
            TextKt.m2373Text4IGK_g("  " + str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.StatsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LegendDot_Iv8Zu3U$lambda$20;
                    LegendDot_Iv8Zu3U$lambda$20 = StatsScreenKt.LegendDot_Iv8Zu3U$lambda$20(j, str, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LegendDot_Iv8Zu3U$lambda$20;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long startOfDay(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Long, Long> monthKey(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(2, -i);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(2, 1);
        return TuplesKt.to(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Chicken> StatsScreen$lambda$1(State<? extends List<Chicken>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<FeedEntry> StatsScreen$lambda$2(State<? extends List<FeedEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Sale> StatsScreen$lambda$3(State<? extends List<Sale>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<EggLog> StatsScreen$lambda$4(State<? extends List<EggLog>> state) {
        return state.getValue();
    }
}
