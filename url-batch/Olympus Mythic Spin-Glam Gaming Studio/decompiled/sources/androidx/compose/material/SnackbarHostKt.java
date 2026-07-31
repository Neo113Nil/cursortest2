package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\fH\u0003¢\u0006\u0004\b \u0010!*D\b\u0002\u0010\"\"\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006#"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "SnackbarHost", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "toMillis", "(Landroidx/compose/material/SnackbarDuration;ZLandroidx/compose/ui/platform/AccessibilityManager;)J", "current", "content", "FadeInFadeOutWithScale", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation", VastAttributes.VISIBLE, "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/State;", "animatedOpacity", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animatedScale", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SnackbarHostKt {

    /* compiled from: SnackbarHost.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            iArr[SnackbarDuration.Long.ordinal()] = 2;
            iArr[SnackbarDuration.Short.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SnackbarHost(final SnackbarHostState hostState, Modifier modifier, Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3 function32;
        final Modifier modifier3;
        final Function3 function33;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(hostState, "hostState");
        Composer startRestartGroup = composer.startRestartGroup(431012348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(hostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function32 = function3;
                i3 |= startRestartGroup.changed(function3) ? 256 : 128;
                if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    Function3 m826getLambda1$material_release = i4 != 0 ? ComposableSingletons$SnackbarHostKt.INSTANCE.m826getLambda1$material_release() : function32;
                    SnackbarData currentSnackbarData = hostState.getCurrentSnackbarData();
                    EffectsKt.LaunchedEffect(currentSnackbarData, new SnackbarHostKt$SnackbarHost$1(currentSnackbarData, (AccessibilityManager) startRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), startRestartGroup, 0);
                    FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), modifier4, m826getLambda1$material_release, startRestartGroup, i3 & 1008, 0);
                    modifier3 = modifier4;
                    function33 = m826getLambda1$material_release;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function33 = function32;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i6) {
                        SnackbarHostKt.SnackbarHost(SnackbarHostState.this, modifier3, function33, composer2, i | 1, i2);
                    }
                });
                return;
            }
            function32 = function3;
            if ((i3 & 731) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            SnackbarData currentSnackbarData2 = hostState.getCurrentSnackbarData();
            EffectsKt.LaunchedEffect(currentSnackbarData2, new SnackbarHostKt$SnackbarHost$1(currentSnackbarData2, (AccessibilityManager) startRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), startRestartGroup, 0);
            FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), modifier4, m826getLambda1$material_release, startRestartGroup, i3 & 1008, 0);
            modifier3 = modifier4;
            function33 = m826getLambda1$material_release;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function32 = function3;
        if ((i3 & 731) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        SnackbarData currentSnackbarData22 = hostState.getCurrentSnackbarData();
        EffectsKt.LaunchedEffect(currentSnackbarData22, new SnackbarHostKt$SnackbarHost$1(currentSnackbarData22, (AccessibilityManager) startRestartGroup.consume(CompositionLocalsKt.getLocalAccessibilityManager()), null), startRestartGroup, 0);
        FadeInFadeOutWithScale(hostState.getCurrentSnackbarData(), modifier4, m826getLambda1$material_release, startRestartGroup, i3 & 1008, 0);
        modifier3 = modifier4;
        function33 = m826getLambda1$material_release;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final long toMillis(SnackbarDuration snackbarDuration, boolean z, AccessibilityManager accessibilityManager) {
        long j;
        Intrinsics.checkNotNullParameter(snackbarDuration, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = 4000;
        }
        long j2 = j;
        return accessibilityManager == null ? j2 : accessibilityManager.calculateRecommendedTimeoutMillis(j2, true, true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c6 A[LOOP:2: B:49:0x01c4->B:50:0x01c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FadeInFadeOutWithScale(final SnackbarData snackbarData, Modifier modifier, final Function3 function3, Composer composer, final int i, final int i2) {
        final int i3;
        Modifier modifier2;
        Object rememberedValue;
        final FadeInFadeOutState fadeInFadeOutState;
        int i4;
        int size;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2036134589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(function3) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new FadeInFadeOutState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                fadeInFadeOutState = (FadeInFadeOutState) rememberedValue;
                if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
                    fadeInFadeOutState.setCurrent(snackbarData);
                    List items = fadeInFadeOutState.getItems();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                    Iterator it = items.iterator();
                    while (it.hasNext()) {
                        arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) it.next()).getKey());
                    }
                    final List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(snackbarData)) {
                        mutableList.add(snackbarData);
                    }
                    fadeInFadeOutState.getItems().clear();
                    List<SnackbarData> filterNotNull = CollectionsKt.filterNotNull(mutableList);
                    List items2 = fadeInFadeOutState.getItems();
                    for (final SnackbarData snackbarData2 : filterNotNull) {
                        items2.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.composableLambda(startRestartGroup, -94104314, true, new Function3() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            @ComposableInferredTarget
                            public final void invoke(@NotNull Function2 children, @Nullable Composer composer2, int i6) {
                                int i7;
                                State animatedOpacity;
                                State animatedScale;
                                Intrinsics.checkNotNullParameter(children, "children");
                                if ((i6 & 14) == 0) {
                                    i7 = i6 | (composer2.changed(children) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 91) != 18 || !composer2.getSkipping()) {
                                    boolean areEqual = Intrinsics.areEqual(SnackbarData.this, snackbarData);
                                    int i8 = areEqual ? 150 : 75;
                                    int i9 = (!areEqual || CollectionsKt.filterNotNull(mutableList).size() == 1) ? 0 : 75;
                                    TweenSpec tween = AnimationSpecKt.tween(i8, i9, EasingKt.getLinearEasing());
                                    final SnackbarData snackbarData3 = SnackbarData.this;
                                    final FadeInFadeOutState<SnackbarData> fadeInFadeOutState2 = fadeInFadeOutState;
                                    animatedOpacity = SnackbarHostKt.animatedOpacity(tween, areEqual, new Function0() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* renamed from: invoke */
                                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                            m968invoke();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m968invoke() {
                                            if (Intrinsics.areEqual(SnackbarData.this, fadeInFadeOutState2.getCurrent())) {
                                                return;
                                            }
                                            List items3 = fadeInFadeOutState2.getItems();
                                            final SnackbarData snackbarData4 = SnackbarData.this;
                                            CollectionsKt.removeAll(items3, new Function1() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1.1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                @NotNull
                                                public final Boolean invoke(@NotNull FadeInFadeOutAnimationItem<SnackbarData> it2) {
                                                    Intrinsics.checkNotNullParameter(it2, "it");
                                                    return Boolean.valueOf(Intrinsics.areEqual(it2.getKey(), SnackbarData.this));
                                                }
                                            });
                                            RecomposeScope scope = fadeInFadeOutState2.getScope();
                                            if (scope != null) {
                                                scope.invalidate();
                                            }
                                        }
                                    }, composer2, 0, 0);
                                    animatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i8, i9, EasingKt.getFastOutSlowInEasing()), areEqual, composer2, 0);
                                    Modifier m1495graphicsLayerpANQ8Wg$default = GraphicsLayerModifierKt.m1495graphicsLayerpANQ8Wg$default(Modifier.INSTANCE, ((Number) animatedScale.getValue()).floatValue(), ((Number) animatedScale.getValue()).floatValue(), ((Number) animatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65528, null);
                                    final SnackbarData snackbarData4 = SnackbarData.this;
                                    Modifier semantics$default = SemanticsModifierKt.semantics$default(m1495graphicsLayerpANQ8Wg$default, false, new Function1() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((SemanticsPropertyReceiver) obj);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                            SemanticsPropertiesKt.m2175setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m2156getPolite0phEisY());
                                            final SnackbarData snackbarData5 = SnackbarData.this;
                                            SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.SnackbarHostKt.FadeInFadeOutWithScale.1.1.1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                @NotNull
                                                /* renamed from: invoke */
                                                public final Boolean mo4828invoke() {
                                                    SnackbarData.this.dismiss();
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }, 1, null);
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 constructor = companion.getConstructor();
                                    Function3 materializerOf = LayoutKt.materializerOf(semantics$default);
                                    if (composer2.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(-421978688);
                                    children.invoke(composer2, Integer.valueOf(i7 & 14));
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        })));
                    }
                }
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 constructor = companion.getConstructor();
                Function3 materializerOf = LayoutKt.materializerOf(modifier4);
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1788016521);
                fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0));
                List items3 = fadeInFadeOutState.getItems();
                size = items3.size();
                for (i4 = 0; i4 < size; i4++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) items3.get(i4);
                    final SnackbarData snackbarData3 = (SnackbarData) fadeInFadeOutAnimationItem.getKey();
                    Function3 transition = fadeInFadeOutAnimationItem.getTransition();
                    startRestartGroup.startMovableGroup(-208579897, snackbarData3);
                    transition.invoke(ComposableLambdaKt.composableLambda(startRestartGroup, 2041982076, true, new Function2() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget
                        @Composable
                        public final void invoke(@Nullable Composer composer2, int i6) {
                            if ((i6 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Function3 function32 = Function3.this;
                            SnackbarData snackbarData4 = snackbarData3;
                            Intrinsics.checkNotNull(snackbarData4);
                            function32.invoke(snackbarData4, composer2, Integer.valueOf((i3 >> 3) & 112));
                        }
                    }), startRestartGroup, 6);
                    startRestartGroup.endMovableGroup();
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    SnackbarHostKt.FadeInFadeOutWithScale(SnackbarData.this, modifier3, function3, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 731) == 146) {
        }
        if (i5 == 0) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        fadeInFadeOutState = (FadeInFadeOutState) rememberedValue;
        if (!Intrinsics.areEqual(snackbarData, fadeInFadeOutState.getCurrent())) {
        }
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0 constructor2 = companion2.getConstructor();
        Function3 materializerOf2 = LayoutKt.materializerOf(modifier4);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1788016521);
        fadeInFadeOutState.setScope(ComposablesKt.getCurrentRecomposeScope(startRestartGroup, 0));
        List items32 = fadeInFadeOutState.getItems();
        size = items32.size();
        while (i4 < size) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State animatedOpacity(AnimationSpec animationSpec, boolean z, Function0 function0, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1016418159);
        if ((i2 & 4) != 0) {
            function0 = new Function0() { // from class: androidx.compose.material.SnackbarHostKt$animatedOpacity$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m969invoke() {
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m969invoke();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function02 = function0;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SnackbarHostKt$animatedOpacity$2(animatable, z, animationSpec, function02, null), composer, (i >> 3) & 14);
        State asState = animatable.asState();
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State animatedScale(AnimationSpec animationSpec, boolean z, Composer composer, int i) {
        composer.startReplaceableGroup(2003504988);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = AnimatableKt.Animatable$default(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new SnackbarHostKt$animatedScale$1(animatable, z, animationSpec, null), composer, (i >> 3) & 14);
        State asState = animatable.asState();
        composer.endReplaceableGroup();
        return asState;
    }
}
