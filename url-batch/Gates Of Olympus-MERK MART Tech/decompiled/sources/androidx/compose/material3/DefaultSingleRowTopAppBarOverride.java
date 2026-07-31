package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/DefaultSingleRowTopAppBarOverride;", "Landroidx/compose/material3/SingleRowTopAppBarOverride;", "<init>", "()V", "SingleRowTopAppBar", "", "Landroidx/compose/material3/SingleRowTopAppBarOverrideScope;", "(Landroidx/compose/material3/SingleRowTopAppBarOverrideScope;Landroidx/compose/runtime/Composer;I)V", "material3", "targetColor", "Landroidx/compose/ui/graphics/Color;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultSingleRowTopAppBarOverride implements SingleRowTopAppBarOverride {
    public static final int $stable = 0;
    public static final DefaultSingleRowTopAppBarOverride INSTANCE = new DefaultSingleRowTopAppBarOverride();

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SingleRowTopAppBar$lambda$15$lambda$14$lambda$13() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar$lambda$16(DefaultSingleRowTopAppBarOverride defaultSingleRowTopAppBarOverride, SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, int i, Composer composer, int i2) {
        defaultSingleRowTopAppBarOverride.SingleRowTopAppBar(singleRowTopAppBarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private DefaultSingleRowTopAppBarOverride() {
    }

    @Override // androidx.compose.material3.SingleRowTopAppBarOverride
    public void SingleRowTopAppBar(final SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Modifier.Companion companion;
        Modifier adjustHeightOffsetLimit;
        Composer startRestartGroup = composer.startRestartGroup(2137486921);
        ComposerKt.sourceInformation(startRestartGroup, "C(SingleRowTopAppBar)2520@118647L280,2531@119179L7,2528@118976L225,2536@119296L222,2574@120882L222,2580@121136L27,2581@121204L2,2570@120751L1724:AppBar.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(singleRowTopAppBarOverrideScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2137486921, i2, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar (AppBar.kt:2510)");
            }
            if (Float.isNaN(singleRowTopAppBarOverrideScope.getExpandedHeight()) || (Float.floatToRawIntBits(singleRowTopAppBarOverrideScope.getExpandedHeight()) & Integer.MAX_VALUE) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
            }
            Object colors = singleRowTopAppBarOverrideScope.getColors();
            Object scrollBehavior = singleRowTopAppBarOverrideScope.getScrollBehavior();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130584929, "CC(remember):AppBar.kt#9igjgp");
            boolean changed = startRestartGroup.changed(colors) | startRestartGroup.changed(scrollBehavior);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Color>() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$targetColor$2$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Color invoke() {
                        return Color.m5383boximpl(m2381invoke0d7_KjU());
                    }

                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long m2381invoke0d7_KjU() {
                        TopAppBarState state;
                        TopAppBarScrollBehavior scrollBehavior2 = SingleRowTopAppBarOverrideScope.this.getScrollBehavior();
                        return SingleRowTopAppBarOverrideScope.this.getColors().m3477containerColorvNxB06k$material3(((scrollBehavior2 == null || (state = scrollBehavior2.getState()) == null) ? 0.0f : state.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final State<Color> m148animateColorAsStateeuL9pac = SingleValueAnimationKt.m148animateColorAsStateeuL9pac(SingleRowTopAppBar$lambda$2((State) rememberedValue), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), null, null, startRestartGroup, 0, 12);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1658896622, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$actionsRow$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    ComposerKt.sourceInformation(composer3, "C2537@119314L190:AppBar.kt#uh7d8r");
                    if (!composer3.shouldExecute((i3 & 3) != 2, i3 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1658896622, i3, -1, "androidx.compose.material3.DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar.<anonymous> (AppBar.kt:2537)");
                    }
                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function3<RowScope, Composer, Integer, Unit> actions = SingleRowTopAppBarOverrideScope.this.getActions();
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer3, 54);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4643constructorimpl = Updater.m4643constructorimpl(composer3);
                    Updater.m4651setimpl(m4643constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4643constructorimpl.getInserting() || !Intrinsics.areEqual(m4643constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4643constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4643constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    actions.invoke(RowScopeInstance.INSTANCE, composer3, 6);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54);
            if (singleRowTopAppBarOverrideScope.getScrollBehavior() != null && !singleRowTopAppBarOverrideScope.getScrollBehavior().getIsPinned()) {
                startRestartGroup.startReplaceGroup(689467622);
                ComposerKt.sourceInformation(startRestartGroup, "2550@119886L107,2550@119863L130,2553@120031L312");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Orientation orientation = Orientation.Vertical;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130624404, "CC(remember):AppBar.kt#9igjgp");
                int i3 = i2 & 14;
                boolean z = i3 == 4;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit SingleRowTopAppBar$lambda$4$lambda$3;
                            SingleRowTopAppBar$lambda$4$lambda$3 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$4$lambda$3(SingleRowTopAppBarOverrideScope.this, ((Float) obj).floatValue());
                            return SingleRowTopAppBar$lambda$4$lambda$3;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue2, startRestartGroup, 0);
                Modifier.Companion companion3 = companion2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130629249, "CC(remember):AppBar.kt#9igjgp");
                boolean z2 = i3 == 4;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function3) new DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(singleRowTopAppBarOverrideScope, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                companion = DraggableKt.draggable$default(companion3, rememberDraggableState, orientation, false, null, false, null, (Function3) rememberedValue3, false, 188, null);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(690108113);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.INSTANCE;
            }
            Modifier then = singleRowTopAppBarOverrideScope.getModifier().then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130656391, "CC(remember):AppBar.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m148animateColorAsStateeuL9pac);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SingleRowTopAppBar$lambda$7$lambda$6;
                        SingleRowTopAppBar$lambda$7$lambda$6 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$7$lambda$6(State.this, (DrawScope) obj);
                        return SingleRowTopAppBar$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier drawBehind = DrawModifierKt.drawBehind(then, (Function1) rememberedValue4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130664324, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SingleRowTopAppBar$lambda$9$lambda$8;
                        SingleRowTopAppBar$lambda$9$lambda$8 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$9$lambda$8((SemanticsPropertyReceiver) obj);
                        return SingleRowTopAppBar$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(drawBehind, false, (Function1) rememberedValue5, 1, null);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1130666475, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$4$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        return Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(semantics$default, unit, (PointerInputEventHandler) rememberedValue6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, pointerInput);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4643constructorimpl = Updater.m4643constructorimpl(startRestartGroup);
            Updater.m4651setimpl(m4643constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4651setimpl(m4643constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4643constructorimpl.getInserting() || !Intrinsics.areEqual(m4643constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4643constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4643constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4651setimpl(m4643constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1199733554, "C2589@121570L45,2598@122100L6,2583@121231L1234:AppBar.kt#uh7d8r");
            adjustHeightOffsetLimit = AppBarKt.adjustHeightOffsetLimit(ClipKt.clipToBounds(WindowInsetsPaddingKt.windowInsetsPadding(Modifier.INSTANCE, singleRowTopAppBarOverrideScope.getWindowInsets())), singleRowTopAppBarOverrideScope.getScrollBehavior());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -592880752, "CC(remember):AppBar.kt#9igjgp");
            boolean z3 = (i2 & 14) == 4;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new FloatProducer() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda3
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        float SingleRowTopAppBar$lambda$15$lambda$12$lambda$11;
                        SingleRowTopAppBar$lambda$15$lambda$12$lambda$11 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$12$lambda$11(SingleRowTopAppBarOverrideScope.this);
                        return SingleRowTopAppBar$lambda$15$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            FloatProducer floatProducer = (FloatProducer) rememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            long navigationIconContentColor = singleRowTopAppBarOverrideScope.getColors().getNavigationIconContentColor();
            long titleContentColor = singleRowTopAppBarOverrideScope.getColors().getTitleContentColor();
            long actionIconContentColor = singleRowTopAppBarOverrideScope.getColors().getActionIconContentColor();
            long subtitleContentColor = singleRowTopAppBarOverrideScope.getColors().getSubtitleContentColor();
            Function2<Composer, Integer, Unit> title = singleRowTopAppBarOverrideScope.getTitle();
            TextStyle titleTextStyle = singleRowTopAppBarOverrideScope.getTitleTextStyle();
            Function2<Composer, Integer, Unit> subtitle = singleRowTopAppBarOverrideScope.getSubtitle();
            TextStyle subtitleTextStyle = singleRowTopAppBarOverrideScope.getSubtitleTextStyle();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Horizontal titleHorizontalAlignment = singleRowTopAppBarOverrideScope.getTitleHorizontalAlignment();
            Function2<Composer, Integer, Unit> navigationIcon = singleRowTopAppBarOverrideScope.getNavigationIcon();
            float expandedHeight = singleRowTopAppBarOverrideScope.getExpandedHeight();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -592863831, "CC(remember):AppBar.kt#9igjgp");
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        float SingleRowTopAppBar$lambda$15$lambda$14$lambda$13;
                        SingleRowTopAppBar$lambda$15$lambda$14$lambda$13 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$14$lambda$13();
                        return Float.valueOf(SingleRowTopAppBar$lambda$15$lambda$14$lambda$13);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            AppBarKt.m2023TopAppBarLayoutlyUyIHI(adjustHeightOffsetLimit, floatProducer, navigationIconContentColor, titleContentColor, subtitleContentColor, actionIconContentColor, title, titleTextStyle, subtitle, subtitleTextStyle, (Function0) rememberedValue8, center, titleHorizontalAlignment, 0, false, navigationIcon, rememberComposableLambda, expandedHeight, startRestartGroup, 0, 1600566);
            Composer composer3 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DefaultSingleRowTopAppBarOverride$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SingleRowTopAppBar$lambda$16;
                    SingleRowTopAppBar$lambda$16 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$16(DefaultSingleRowTopAppBarOverride.this, singleRowTopAppBarOverrideScope, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SingleRowTopAppBar$lambda$16;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar$lambda$4$lambda$3(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, float f) {
        TopAppBarState state = singleRowTopAppBarOverrideScope.getScrollBehavior().getState();
        state.setHeightOffset(state.getHeightOffset() + f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar$lambda$7$lambda$6(State state, DrawScope drawScope) {
        long m5403unboximpl = ((Color) state.getValue()).m5403unboximpl();
        if (!Color.m5394equalsimpl0(m5403unboximpl, Color.INSTANCE.m5429getUnspecified0d7_KjU())) {
            DrawScope.m5968drawRectnJ9OG0$default(drawScope, m5403unboximpl, 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SingleRowTopAppBar$lambda$9$lambda$8(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SingleRowTopAppBar$lambda$15$lambda$12$lambda$11(SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope) {
        TopAppBarState state;
        TopAppBarScrollBehavior scrollBehavior = singleRowTopAppBarOverrideScope.getScrollBehavior();
        if (scrollBehavior == null || (state = scrollBehavior.getState()) == null) {
            return 0.0f;
        }
        return state.getHeightOffset();
    }

    private static final long SingleRowTopAppBar$lambda$2(State<Color> state) {
        return state.getValue().m5403unboximpl();
    }
}
