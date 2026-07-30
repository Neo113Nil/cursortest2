package com.chicken.road.cerman.fixs.ui.screens;

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
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.StrokeCap;
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
import com.chicken.road.cerman.fixs.BroilerApp;
import com.chicken.road.cerman.fixs.Routes;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.EggLog;
import com.chicken.road.cerman.fixs.data.FeedEntry;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.data.Sale;
import com.chicken.road.cerman.fixs.data.Vaccination;
import com.chicken.road.cerman.fixs.data.WeightEntry;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import com.chicken.road.cerman.fixs.ui.Fmt;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChickenDetailScreen.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 ²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u0084\u0002²\u0006\u0010\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\nX\u008a\u0084\u0002²\u0006\u0010\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\nX\u008a\u0084\u0002²\u0006\u0010\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\nX\u008a\u0084\u0002²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u008a\u0084\u0002²\u0006\u0010\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\nX\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002"}, d2 = {"ChickenDetailScreen", "", "nav", "Landroidx/navigation/NavController;", "id", "", "(Landroidx/navigation/NavController;JLandroidx/compose/runtime/Composer;I)V", "averageDailyGain", "", "sorted", "", "Lcom/chicken/road/cerman/fixs/data/WeightEntry;", "(Ljava/util/List;)Ljava/lang/Integer;", "WeightSparkline", "entries", "color", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "WeightSparkline-3IgeMak", "(Ljava/util/List;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MutedLine", "text", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "MiniRow", "title", "date", "value", "accent", "MiniRow-Bx497Mc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "app_release", "chicken", "Lcom/chicken/road/cerman/fixs/data/Chicken;", Routes.FEED, "Lcom/chicken/road/cerman/fixs/data/FeedEntry;", Routes.EGGS, "Lcom/chicken/road/cerman/fixs/data/EggLog;", "sales", "Lcom/chicken/road/cerman/fixs/data/Sale;", "weights", "vacc", "Lcom/chicken/road/cerman/fixs/data/Vaccination;", "editOpen", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChickenDetailScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChickenDetailScreen$lambda$16(NavController navController, long j, int i, Composer composer, int i2) {
        ChickenDetailScreen(navController, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MiniRow_Bx497Mc$lambda$29(String str, String str2, String str3, long j, int i, Composer composer, int i2) {
        m6686MiniRowBx497Mc(str, str2, str3, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MutedLine$lambda$26(String str, int i, Composer composer, int i2) {
        MutedLine(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WeightSparkline_3IgeMak$lambda$17(List list, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m6687WeightSparkline3IgeMak(list, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WeightSparkline_3IgeMak$lambda$25(List list, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m6687WeightSparkline3IgeMak(list, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ChickenDetailScreen(final NavController nav, final long j, Composer composer, final int i) {
        int i2;
        String str;
        Composer composer2;
        Intrinsics.checkNotNullParameter(nav, "nav");
        Composer startRestartGroup = composer.startRestartGroup(1171945496);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nav) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1171945496, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreen (ChickenDetailScreen.kt:58)");
            }
            startRestartGroup.startReplaceGroup(-1667359376);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = BroilerApp.INSTANCE.getINSTANCE().getRepository();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            State collectAsState = SnapshotStateKt.collectAsState(repository.chicken(j), null, null, startRestartGroup, 48, 2);
            final State collectAsState2 = SnapshotStateKt.collectAsState(repository.feedFor(j), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            final State collectAsState3 = SnapshotStateKt.collectAsState(repository.eggsFor(j), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            final State collectAsState4 = SnapshotStateKt.collectAsState(repository.salesFor(j), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            final State collectAsState5 = SnapshotStateKt.collectAsState(repository.weightFor(j), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            final State collectAsState6 = SnapshotStateKt.collectAsState(repository.vaccinationsFor(j), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(-1667343353);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Chicken ChickenDetailScreen$lambda$1 = ChickenDetailScreen$lambda$1(collectAsState);
            if (ChickenDetailScreen$lambda$1 == null || (str = ChickenDetailScreen$lambda$1.getName()) == null) {
                str = "Chicken";
            }
            String str2 = str;
            startRestartGroup.startReplaceGroup(-1667337925);
            boolean changedInstance = startRestartGroup.changedInstance(nav);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit ChickenDetailScreen$lambda$11$lambda$10;
                        ChickenDetailScreen$lambda$11$lambda$10 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$11$lambda$10(NavController.this);
                        return ChickenDetailScreen$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            CommonKt.FarmScaffold(str2, (Function0) rememberedValue4, ComposableLambdaKt.rememberComposableLambda(-1440474509, true, new ChickenDetailScreenKt$ChickenDetailScreen$2(ChickenDetailScreen$lambda$1, coroutineScope, repository, nav, mutableState), composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-327754504, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$ChickenDetailScreen$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:102:0x0731  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x0757 A[LOOP:3: B:104:0x0751->B:106:0x0757, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:110:0x07cd  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x07f1 A[LOOP:4: B:112:0x07eb->B:114:0x07f1, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:118:0x0851  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x0875 A[LOOP:5: B:120:0x086f->B:122:0x0875, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:126:0x08e5  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0909 A[LOOP:6: B:128:0x0903->B:130:0x0909, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0944  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x09bc  */
                /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:140:0x06e6  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x05ff  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0658  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(PaddingValues inner, Composer composer3, int i3) {
                    List ChickenDetailScreen$lambda$2;
                    List ChickenDetailScreen$lambda$4;
                    List ChickenDetailScreen$lambda$3;
                    List ChickenDetailScreen$lambda$5;
                    Integer averageDailyGain;
                    String str3;
                    Composer composer4;
                    boolean z;
                    Chicken chicken;
                    List ChickenDetailScreen$lambda$22;
                    List ChickenDetailScreen$lambda$23;
                    List ChickenDetailScreen$lambda$24;
                    List ChickenDetailScreen$lambda$32;
                    List ChickenDetailScreen$lambda$33;
                    List ChickenDetailScreen$lambda$42;
                    List ChickenDetailScreen$lambda$43;
                    List ChickenDetailScreen$lambda$6;
                    List ChickenDetailScreen$lambda$62;
                    Intrinsics.checkNotNullParameter(inner, "inner");
                    int i4 = (i3 & 6) == 0 ? i3 | (composer3.changed(inner) ? 4 : 2) : i3;
                    if ((i4 & 19) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-327754504, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreen.<anonymous> (ChickenDetailScreen.kt:85)");
                        }
                        composer3.startReplaceGroup(2074767148);
                        if (Chicken.this == null) {
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, inner), 0.0f, 1, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
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
                            TextKt.m2373Text4IGK_g("Loadingâ€¦", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 6, 0, 131066);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceGroup();
                            return;
                        }
                        composer3.endReplaceGroup();
                        ChickenDetailScreen$lambda$2 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$2(collectAsState2);
                        Iterator it = ChickenDetailScreen$lambda$2.iterator();
                        double d = 0.0d;
                        while (it.hasNext()) {
                            d += ((FeedEntry) it.next()).getCost();
                        }
                        ChickenDetailScreen$lambda$4 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$4(collectAsState4);
                        Iterator it2 = ChickenDetailScreen$lambda$4.iterator();
                        double d2 = 0.0d;
                        while (it2.hasNext()) {
                            d2 += ((Sale) it2.next()).getTotal();
                        }
                        ChickenDetailScreen$lambda$3 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$3(collectAsState3);
                        Iterator it3 = ChickenDetailScreen$lambda$3.iterator();
                        int i5 = 0;
                        while (it3.hasNext()) {
                            i5 += ((EggLog) it3.next()).getCount();
                        }
                        double acquiredCost = (d2 - d) - Chicken.this.getAcquiredCost();
                        ChickenDetailScreen$lambda$5 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$5(collectAsState5);
                        final List sortedWith = CollectionsKt.sortedWith(ChickenDetailScreen$lambda$5, new Comparator() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$ChickenDetailScreen$3$invoke$$inlined$sortedBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt.compareValues(Long.valueOf(((WeightEntry) t).getDate()), Long.valueOf(((WeightEntry) t2).getDate()));
                            }
                        });
                        WeightEntry weightEntry = (WeightEntry) CollectionsKt.lastOrNull(sortedWith);
                        Integer valueOf = weightEntry != null ? Integer.valueOf(weightEntry.getWeightGrams()) : null;
                        averageDailyGain = ChickenDetailScreenKt.averageDailyGain(sortedWith);
                        float f = 16;
                        Modifier m681padding3ABfNKs = PaddingKt.m681padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, inner), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), Dp.m6299constructorimpl(f));
                        final Chicken chicken2 = Chicken.this;
                        double d3 = d2;
                        State<List<FeedEntry>> state = collectAsState2;
                        State<List<EggLog>> state2 = collectAsState3;
                        State<List<Sale>> state3 = collectAsState4;
                        State<List<Vaccination>> state4 = collectAsState6;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m681padding3ABfNKs);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
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
                        CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(24)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1987439120, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$ChickenDetailScreen$3$2$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer5, Integer num) {
                                invoke(columnScope, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(ColumnScope Card, Composer composer5, int i6) {
                                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                if ((i6 & 17) != 16 || !composer5.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1987439120, i6, -1, "com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreen.<anonymous>.<anonymous>.<anonymous> (ChickenDetailScreen.kt:111)");
                                    }
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m681padding3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(18)), 0.0f, 1, null);
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    final Chicken chicken3 = Chicken.this;
                                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer5, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer5);
                                    Updater.m3340setimpl(m3333constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.m726size3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(64)), RoundedCornerShapeKt.getCircleShape(), Color.m3839copywmQWz5c$default(FlockScreenKt.typeColor(chicken3.getType()), 0.22f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(694121457, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$ChickenDetailScreen$3$2$1$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            invoke(composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer6, int i7) {
                                            if ((i7 & 3) != 2 || !composer6.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(694121457, i7, -1, "com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChickenDetailScreen.kt:120)");
                                                }
                                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                                Chicken chicken4 = Chicken.this;
                                                ComposerKt.sourceInformationMarkerStart(composer6, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                                                ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer6, companion);
                                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composer6.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor4);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                Composer m3333constructorimpl4 = Updater.m3333constructorimpl(composer6);
                                                Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                }
                                                Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer6, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                String upperCase = StringsKt.take(chicken4.getName(), 1).toUpperCase(Locale.ROOT);
                                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                                TextKt.m2373Text4IGK_g(upperCase, (Modifier) null, FlockScreenKt.typeColor(chicken4.getType()), TextUnitKt.getSp(26), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 199680, 0, 131026);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                composer6.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer6.skipToGroupEnd();
                                        }
                                    }, composer5, 54), composer5, 12582918, MenuKt.InTransitionDuration);
                                    SpacerKt.Spacer(SizeKt.m726size3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(16)), composer5, 6);
                                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer5, weight$default);
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer m3333constructorimpl4 = Updater.m3333constructorimpl(composer5);
                                    Updater.m3340setimpl(m3333constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    TextKt.m2373Text4IGK_g(chicken3.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getHeadlineSmall(), composer5, 0, 0, 65534);
                                    TextKt.m2373Text4IGK_g(chicken3.getBreed(), (Modifier) null, ThemeKt.getForest(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3072, 0, 131058);
                                    float f2 = 6;
                                    SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f2)), composer5, 6);
                                    Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(f2));
                                    ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m561spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer5, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer5, companion);
                                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer5.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor5);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer m3333constructorimpl5 = Updater.m3333constructorimpl(composer5);
                                    Updater.m3340setimpl(m3333constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl5.getInserting() || !Intrinsics.areEqual(m3333constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        m3333constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        m3333constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer5, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    CommonKt.m6677PillRPmYEkk(chicken3.getType().name(), FlockScreenKt.typeColor(chicken3.getType()), composer5, 0);
                                    CommonKt.m6677PillRPmYEkk(chicken3.getStatus().name(), FlockScreenKt.statusColor(chicken3.getStatus()), composer5, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    composer5.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    composer5.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    composer5.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }, composer3, 54), composer3, 196614, 24);
                        float f2 = 18;
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f2)), composer3, 6);
                        CommonKt.SectionHeader("Performance", composer3, 6);
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        float f3 = 10;
                        Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(f3));
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m561spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer3);
                        Updater.m3340setimpl(m3333constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        CommonKt.m6678StatTilecf5BqRc("REVENUE", Fmt.INSTANCE.money(d3), ThemeKt.getForest(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 6, 0);
                        CommonKt.m6678StatTilecf5BqRc("FEED COST", Fmt.INSTANCE.money(d), ThemeKt.getAmberDeep(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 6, 0);
                        CommonKt.m6678StatTilecf5BqRc("PROFIT", Fmt.INSTANCE.money(acquiredCost), acquiredCost >= 0.0d ? ThemeKt.getForest() : ThemeKt.getBrick(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 6, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f3)), composer3, 6);
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m561spacedBy0680j_42 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(f3));
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m561spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3333constructorimpl4 = Updater.m3333constructorimpl(composer3);
                        Updater.m3340setimpl(m3333constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        CommonKt.m6678StatTilecf5BqRc("EGGS LAID", String.valueOf(i5), ThemeKt.getAmber(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 6, 0);
                        String str4 = "—";
                        if (valueOf != null) {
                            String str5 = valueOf.intValue() + " g";
                            if (str5 != null) {
                                str3 = str5;
                                CommonKt.m6678StatTilecf5BqRc("LATEST WEIGHT", str3, ThemeKt.getAmberDeep(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 6, 0);
                                if (averageDailyGain != null) {
                                    String str6 = averageDailyGain.intValue() + " g/d";
                                    if (str6 != null) {
                                        str4 = str6;
                                    }
                                }
                                CommonKt.m6678StatTilecf5BqRc("ADG", str4, ThemeKt.getForest(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 6, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.startReplaceGroup(-1071308502);
                                if (sortedWith.size() < 2) {
                                    SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f2)), composer3, 6);
                                    CommonKt.SectionHeader("Growth (" + sortedWith.size() + " entries)", composer3, 0);
                                    composer4 = composer3;
                                    chicken = chicken2;
                                    z = true;
                                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(20)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-487963243, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$ChickenDetailScreen$3$2$4
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer5, Integer num) {
                                            invoke(columnScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(ColumnScope Card, Composer composer5, int i6) {
                                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                            if ((i6 & 17) != 16 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-487963243, i6, -1, "com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreen.<anonymous>.<anonymous>.<anonymous> (ChickenDetailScreen.kt:164)");
                                                }
                                                ChickenDetailScreenKt.m6687WeightSparkline3IgeMak(sortedWith, ThemeKt.getAmberDeep(), PaddingKt.m681padding3ABfNKs(SizeKt.m712height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6299constructorimpl(160)), Dp.m6299constructorimpl(16)), composer5, 384, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }, composer4, 54), composer3, 196614, 24);
                                } else {
                                    composer4 = composer3;
                                    z = true;
                                    chicken = chicken2;
                                }
                                composer3.endReplaceGroup();
                                SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(20)), composer4, 6);
                                ChickenDetailScreen$lambda$22 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$2(state);
                                CommonKt.SectionHeader("Recent feed (" + ChickenDetailScreen$lambda$22.size() + ")", composer4, 0);
                                composer4.startReplaceGroup(-1071283784);
                                ChickenDetailScreen$lambda$23 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$2(state);
                                if (ChickenDetailScreen$lambda$23.isEmpty()) {
                                    ChickenDetailScreenKt.MutedLine("No feed entries yet.", composer4, 6);
                                }
                                composer3.endReplaceGroup();
                                composer4.startReplaceGroup(-1071281062);
                                ChickenDetailScreen$lambda$24 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$2(state);
                                for (FeedEntry feedEntry : CollectionsKt.take(ChickenDetailScreen$lambda$24, 5)) {
                                    ChickenDetailScreenKt.m6686MiniRowBx497Mc(feedEntry.getFeedType() + " Â· " + Fmt.INSTANCE.kg(feedEntry.getQuantityKg()), Fmt.INSTANCE.shortDate(feedEntry.getDate()), Fmt.INSTANCE.money(feedEntry.getCost()), ThemeKt.getAmberDeep(), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f)), composer4, 6);
                                CommonKt.SectionHeader("Recent eggs", composer4, 6);
                                composer4.startReplaceGroup(-1071270217);
                                ChickenDetailScreen$lambda$32 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$3(state2);
                                if (ChickenDetailScreen$lambda$32.isEmpty()) {
                                    ChickenDetailScreenKt.MutedLine("No eggs logged yet.", composer4, 6);
                                }
                                composer3.endReplaceGroup();
                                composer4.startReplaceGroup(-1071267668);
                                ChickenDetailScreen$lambda$33 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$3(state2);
                                for (EggLog eggLog : CollectionsKt.take(ChickenDetailScreen$lambda$33, 5)) {
                                    ChickenDetailScreenKt.m6686MiniRowBx497Mc(eggLog.getCount() + " eggs", Fmt.INSTANCE.shortDate(eggLog.getDate()), "", ThemeKt.getAmber(), composer3, 384);
                                }
                                composer3.endReplaceGroup();
                                SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f)), composer4, 6);
                                CommonKt.SectionHeader("Recent sales", composer4, 6);
                                composer4.startReplaceGroup(-1071261198);
                                ChickenDetailScreen$lambda$42 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$4(state3);
                                if (ChickenDetailScreen$lambda$42.isEmpty()) {
                                    ChickenDetailScreenKt.MutedLine("No sales yet.", composer4, 6);
                                }
                                composer3.endReplaceGroup();
                                composer4.startReplaceGroup(-1071258642);
                                ChickenDetailScreen$lambda$43 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$4(state3);
                                for (Sale sale : CollectionsKt.take(ChickenDetailScreen$lambda$43, 5)) {
                                    ChickenDetailScreenKt.m6686MiniRowBx497Mc(sale.getSaleType() + " Ã— " + sale.getQuantity(), Fmt.INSTANCE.shortDate(sale.getDate()), Fmt.INSTANCE.money(sale.getTotal()), ThemeKt.getForest(), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f)), composer4, 6);
                                CommonKt.SectionHeader("Vaccinations", composer4, 6);
                                composer4.startReplaceGroup(-1071248131);
                                ChickenDetailScreen$lambda$6 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$6(state4);
                                if (ChickenDetailScreen$lambda$6.isEmpty()) {
                                    ChickenDetailScreenKt.MutedLine("No vaccinations recorded.", composer4, 6);
                                }
                                composer3.endReplaceGroup();
                                composer4.startReplaceGroup(-1071245407);
                                ChickenDetailScreen$lambda$62 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$6(state4);
                                for (Vaccination vaccination : CollectionsKt.take(ChickenDetailScreen$lambda$62, 5)) {
                                    ChickenDetailScreenKt.m6686MiniRowBx497Mc(vaccination.getName(), Fmt.INSTANCE.shortDate(vaccination.getDate()), "", ThemeKt.getBrick(), composer3, 384);
                                }
                                composer3.endReplaceGroup();
                                composer4.startReplaceGroup(-1071241825);
                                if (StringsKt.isBlank(chicken.getNotes()) ^ z) {
                                    SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f)), composer4, 6);
                                    CommonKt.SectionHeader("Notes", composer4, 6);
                                    TextKt.m2373Text4IGK_g(chicken.getNotes(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131058);
                                }
                                composer3.endReplaceGroup();
                                SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(40)), composer4, 6);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                ComposerKt.traceEventEnd();
                                return;
                            }
                        }
                        str3 = "—";
                        CommonKt.m6678StatTilecf5BqRc("LATEST WEIGHT", str3, ThemeKt.getAmberDeep(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 6, 0);
                        if (averageDailyGain != null) {
                        }
                        CommonKt.m6678StatTilecf5BqRc("ADG", str4, ThemeKt.getForest(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 6, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.startReplaceGroup(-1071308502);
                        if (sortedWith.size() < 2) {
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(20)), composer4, 6);
                        ChickenDetailScreen$lambda$22 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$2(state);
                        CommonKt.SectionHeader("Recent feed (" + ChickenDetailScreen$lambda$22.size() + ")", composer4, 0);
                        composer4.startReplaceGroup(-1071283784);
                        ChickenDetailScreen$lambda$23 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$2(state);
                        if (ChickenDetailScreen$lambda$23.isEmpty()) {
                        }
                        composer3.endReplaceGroup();
                        composer4.startReplaceGroup(-1071281062);
                        ChickenDetailScreen$lambda$24 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$2(state);
                        while (r9.hasNext()) {
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f)), composer4, 6);
                        CommonKt.SectionHeader("Recent eggs", composer4, 6);
                        composer4.startReplaceGroup(-1071270217);
                        ChickenDetailScreen$lambda$32 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$3(state2);
                        if (ChickenDetailScreen$lambda$32.isEmpty()) {
                        }
                        composer3.endReplaceGroup();
                        composer4.startReplaceGroup(-1071267668);
                        ChickenDetailScreen$lambda$33 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$3(state2);
                        while (r9.hasNext()) {
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f)), composer4, 6);
                        CommonKt.SectionHeader("Recent sales", composer4, 6);
                        composer4.startReplaceGroup(-1071261198);
                        ChickenDetailScreen$lambda$42 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$4(state3);
                        if (ChickenDetailScreen$lambda$42.isEmpty()) {
                        }
                        composer3.endReplaceGroup();
                        composer4.startReplaceGroup(-1071258642);
                        ChickenDetailScreen$lambda$43 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$4(state3);
                        while (r9.hasNext()) {
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(f)), composer4, 6);
                        CommonKt.SectionHeader("Vaccinations", composer4, 6);
                        composer4.startReplaceGroup(-1071248131);
                        ChickenDetailScreen$lambda$6 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$6(state4);
                        if (ChickenDetailScreen$lambda$6.isEmpty()) {
                        }
                        composer3.endReplaceGroup();
                        composer4.startReplaceGroup(-1071245407);
                        ChickenDetailScreen$lambda$62 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$6(state4);
                        while (r8.hasNext()) {
                        }
                        composer3.endReplaceGroup();
                        composer4.startReplaceGroup(-1071241825);
                        if (StringsKt.isBlank(chicken.getNotes()) ^ z) {
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m712height3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(40)), composer4, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }, composer2, 54), composer2, 24960, 8);
            if (ChickenDetailScreen$lambda$8(mutableState) && ChickenDetailScreen$lambda$1 != null) {
                composer2.startReplaceGroup(-1667131527);
                Object rememberedValue5 = composer2.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function0() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ChickenDetailScreen$lambda$13$lambda$12;
                            ChickenDetailScreen$lambda$13$lambda$12 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$13$lambda$12(MutableState.this);
                            return ChickenDetailScreen$lambda$13$lambda$12;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                Function0 function0 = (Function0) rememberedValue5;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1667130067);
                boolean changedInstance2 = composer2.changedInstance(coroutineScope) | composer2.changedInstance(repository);
                Object rememberedValue6 = composer2.rememberedValue();
                if (changedInstance2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ChickenDetailScreen$lambda$15$lambda$14;
                            ChickenDetailScreen$lambda$15$lambda$14 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$15$lambda$14(CoroutineScope.this, repository, mutableState, (Chicken) obj);
                            return ChickenDetailScreen$lambda$15$lambda$14;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue6);
                }
                composer2.endReplaceGroup();
                FlockScreenKt.AddEditChickenDialog(ChickenDetailScreen$lambda$1, function0, (Function1) rememberedValue6, composer2, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ChickenDetailScreen$lambda$16;
                    ChickenDetailScreen$lambda$16 = ChickenDetailScreenKt.ChickenDetailScreen$lambda$16(NavController.this, j, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ChickenDetailScreen$lambda$16;
                }
            });
        }
    }

    private static final boolean ChickenDetailScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChickenDetailScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChickenDetailScreen$lambda$11$lambda$10(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChickenDetailScreen$lambda$13$lambda$12(MutableState mutableState) {
        ChickenDetailScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChickenDetailScreen$lambda$15$lambda$14(CoroutineScope coroutineScope, Repository repository, MutableState mutableState, Chicken it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ChickenDetailScreenKt$ChickenDetailScreen$5$1$1(repository, it, null), 3, null);
        ChickenDetailScreen$lambda$9(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer averageDailyGain(List<WeightEntry> list) {
        if (list.size() < 2) {
            return null;
        }
        WeightEntry weightEntry = (WeightEntry) CollectionsKt.first((List) list);
        WeightEntry weightEntry2 = (WeightEntry) CollectionsKt.last((List) list);
        double date = (weightEntry2.getDate() - weightEntry.getDate()) / 8.64E7d;
        if (date <= 0.0d) {
            return null;
        }
        return Integer.valueOf((int) ((weightEntry2.getWeightGrams() - weightEntry.getWeightGrams()) / date));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0078  */
    /* renamed from: WeightSparkline-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6687WeightSparkline3IgeMak(final List<WeightEntry> list, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final int i5;
        Modifier modifier3;
        final Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-303085868);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if ((i4 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-303085868, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.WeightSparkline (ChickenDetailScreen.kt:245)");
                }
                if (list.size() >= 2) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier6 = modifier5;
                        endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit WeightSparkline_3IgeMak$lambda$17;
                                WeightSparkline_3IgeMak$lambda$17 = ChickenDetailScreenKt.WeightSparkline_3IgeMak$lambda$17(list, j, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return WeightSparkline_3IgeMak$lambda$17;
                            }
                        });
                        return;
                    }
                    return;
                }
                List<WeightEntry> list2 = list;
                Iterator<T> it = list2.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int weightGrams = ((WeightEntry) it.next()).getWeightGrams();
                loop0: while (true) {
                    i5 = weightGrams;
                    while (it.hasNext()) {
                        weightGrams = ((WeightEntry) it.next()).getWeightGrams();
                        if (i5 > weightGrams) {
                            break;
                        }
                    }
                }
                Iterator<T> it2 = list2.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int weightGrams2 = ((WeightEntry) it2.next()).getWeightGrams();
                while (it2.hasNext()) {
                    int weightGrams3 = ((WeightEntry) it2.next()).getWeightGrams();
                    if (weightGrams2 < weightGrams3) {
                        weightGrams2 = weightGrams3;
                    }
                }
                final int coerceAtLeast = RangesKt.coerceAtLeast(weightGrams2 - i5, 1);
                final long date = ((WeightEntry) CollectionsKt.first((List) list)).getDate();
                final long coerceAtLeast2 = RangesKt.coerceAtLeast(((WeightEntry) CollectionsKt.last((List) list)).getDate() - date, 1L);
                startRestartGroup.startReplaceGroup(122188600);
                boolean changedInstance = ((i4 & 112) == 32) | startRestartGroup.changedInstance(list) | startRestartGroup.changed(date) | startRestartGroup.changed(coerceAtLeast2) | startRestartGroup.changed(i5) | startRestartGroup.changed(coerceAtLeast);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    modifier3 = modifier5;
                    Function1 function1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit WeightSparkline_3IgeMak$lambda$24$lambda$23;
                            WeightSparkline_3IgeMak$lambda$24$lambda$23 = ChickenDetailScreenKt.WeightSparkline_3IgeMak$lambda$24$lambda$23(j, list, date, coerceAtLeast2, i5, coerceAtLeast, (DrawScope) obj);
                            return WeightSparkline_3IgeMak$lambda$24$lambda$23;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function1);
                    rememberedValue = function1;
                } else {
                    modifier3 = modifier5;
                }
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(modifier3, (Function1) rememberedValue, startRestartGroup, (i4 >> 6) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit WeightSparkline_3IgeMak$lambda$25;
                        WeightSparkline_3IgeMak$lambda$25 = ChickenDetailScreenKt.WeightSparkline_3IgeMak$lambda$25(list, j, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return WeightSparkline_3IgeMak$lambda$25;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (list.size() >= 2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WeightSparkline_3IgeMak$lambda$24$lambda$23(long j, List list, long j2, long j3, int i, int i2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3668getWidthimpl = Size.m3668getWidthimpl(Canvas.mo4396getSizeNHjbRc());
        float m3665getHeightimpl = Size.m3665getHeightimpl(Canvas.mo4396getSizeNHjbRc());
        long m3839copywmQWz5c$default = Color.m3839copywmQWz5c$default(j, 0.15f, 0.0f, 0.0f, 0.0f, 14, null);
        for (int i3 = 0; i3 < 4; i3++) {
            float f = (i3 * m3665getHeightimpl) / 3.0f;
            DrawScope.m4382drawLineNGM6Ib0$default(Canvas, m3839copywmQWz5c$default, OffsetKt.Offset(0.0f, f), OffsetKt.Offset(m3668getWidthimpl, f), 1.0f, 0, null, 0.0f, null, 0, 496, null);
        }
        List<WeightEntry> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (WeightEntry weightEntry : list2) {
            arrayList.add(Offset.m3588boximpl(OffsetKt.Offset(((weightEntry.getDate() - j2) / j3) * m3668getWidthimpl, m3665getHeightimpl - (((weightEntry.getWeightGrams() - i) / i2) * m3665getHeightimpl))));
        }
        ArrayList arrayList2 = arrayList;
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(Offset.m3599getXimpl(((Offset) CollectionsKt.first((List) arrayList2)).getPackedValue()), Offset.m3600getYimpl(((Offset) CollectionsKt.first((List) arrayList2)).getPackedValue()));
        ArrayList arrayList3 = arrayList2;
        Iterator it = CollectionsKt.drop(arrayList3, 1).iterator();
        while (it.hasNext()) {
            long packedValue = ((Offset) it.next()).getPackedValue();
            Path.lineTo(Offset.m3599getXimpl(packedValue), Offset.m3600getYimpl(packedValue));
        }
        DrawScope.m4386drawPathLG529CI$default(Canvas, Path, j, 0.0f, new Stroke(4.0f, 0.0f, StrokeCap.INSTANCE.m4194getRoundKaPHkGw(), 0, null, 26, null), null, 0, 52, null);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            DrawScope.m4377drawCircleVaOC9Bg$default(Canvas, j, 5.0f, ((Offset) it2.next()).getPackedValue(), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MutedLine(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(86347165);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(86347165, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.MutedLine (ChickenDetailScreen.kt:276)");
            }
            composer2 = startRestartGroup;
            TextKt.m2373Text4IGK_g(str, PaddingKt.m683paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6299constructorimpl(6), 1, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 & 14) | 3120, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MutedLine$lambda$26;
                    MutedLine$lambda$26 = ChickenDetailScreenKt.MutedLine$lambda$26(str, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MutedLine$lambda$26;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MiniRow-Bx497Mc, reason: not valid java name */
    public static final void m6686MiniRowBx497Mc(final String str, final String str2, final String str3, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(618061194);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(618061194, i3, -1, "com.chicken.road.cerman.fixs.ui.screens.MiniRow (ChickenDetailScreen.kt:281)");
            }
            Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6299constructorimpl(6), 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m683paddingVpY3zN4$default);
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
            int i4 = i3 >> 3;
            int i5 = i4 & 896;
            SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.m726size3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(8)), RoundedCornerShapeKt.getCircleShape(), j, 0L, 0.0f, 0.0f, null, ComposableSingletons$ChickenDetailScreenKt.INSTANCE.m6692getLambda3$app_release(), startRestartGroup, i5 | 12582918, MenuKt.InTransitionDuration);
            SpacerKt.Spacer(SizeKt.m726size3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(10)), startRestartGroup, 6);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2373Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurface(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i3 & 14) | 3072, 0, 131058);
            TextKt.m2373Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, (i4 & 14) | 3072, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1973926868);
            if (str3.length() > 0) {
                composer2 = startRestartGroup;
                TextKt.m2373Text4IGK_g(str3, (Modifier) null, j, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i3 >> 6)) | 199680 | i5, 0, 131026);
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceGroup();
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
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.cerman.fixs.ui.screens.ChickenDetailScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MiniRow_Bx497Mc$lambda$29;
                    MiniRow_Bx497Mc$lambda$29 = ChickenDetailScreenKt.MiniRow_Bx497Mc$lambda$29(str, str2, str3, j, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MiniRow_Bx497Mc$lambda$29;
                }
            });
        }
    }

    private static final Chicken ChickenDetailScreen$lambda$1(State<Chicken> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<FeedEntry> ChickenDetailScreen$lambda$2(State<? extends List<FeedEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<EggLog> ChickenDetailScreen$lambda$3(State<? extends List<EggLog>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Sale> ChickenDetailScreen$lambda$4(State<? extends List<Sale>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<WeightEntry> ChickenDetailScreen$lambda$5(State<? extends List<WeightEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Vaccination> ChickenDetailScreen$lambda$6(State<? extends List<Vaccination>> state) {
        return state.getValue();
    }
}
