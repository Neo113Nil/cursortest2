package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u009b\u0001\u0010 \u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#2\u0006\u0010!\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\"H\u0002¢\u0006\u0004\b$\u0010%\u001aW\u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\"2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010)\u001a/\u0010*\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010+\"*\u00101\u001a\u00020,\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"", "T", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Landroidx/compose/material/SwipeableState;", "rememberSwipeableStateFor", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "Landroidx/compose/ui/Modifier;", "state", "", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", X3.i.n, "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function2;", "Landroidx/compose/material/ThresholdConfig;", "thresholds", "Landroidx/compose/material/ResistanceConfig;", "resistance", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "swipeable", "offset", "", "", "findBounds", "(FLjava/util/Set;)Ljava/util/List;", "lastValue", "velocity", "computeTarget", "(FFLjava/util/Set;Lkotlin/jvm/functions/Function2;FF)F", "getOffset", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "PreUpPostDownNestedScrollConnection", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SwipeableKt {
    /* renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final Modifier m998swipeablepPrIpRY(Modifier swipeable, final SwipeableState state, final Map anchors, final Orientation orientation, final boolean z, final boolean z2, final MutableInteractionSource mutableInteractionSource, final Function2 thresholds, final ResistanceConfig resistanceConfig, final float f) {
        Intrinsics.checkNotNullParameter(swipeable, "$this$swipeable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        return ComposedModifierKt.composed(swipeable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("swipeable");
                inspectorInfo.getProperties().set("state", SwipeableState.this);
                inspectorInfo.getProperties().set("anchors", anchors);
                inspectorInfo.getProperties().set(X3.i.n, orientation);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("thresholds", thresholds);
                inspectorInfo.getProperties().set("resistance", resistanceConfig);
                inspectorInfo.getProperties().set("velocityThreshold", Dp.m2505boximpl(f));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.material.SwipeableKt$swipeable$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Modifier draggable;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(43594985);
                if (anchors.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (CollectionsKt.distinct(anchors.values()).size() != anchors.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                state.ensureInit$material_release(anchors);
                Map<Float, Object> map = anchors;
                SwipeableState<Object> swipeableState = state;
                EffectsKt.LaunchedEffect(map, swipeableState, new AnonymousClass3(swipeableState, map, resistanceConfig, density, thresholds, f, null), composer, 8);
                draggable = DraggableKt.draggable(Modifier.INSTANCE, state.getDraggableState(), orientation, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : state.isAnimationRunning(), (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : new AnonymousClass4(state, null), (r20 & 128) != 0 ? false : z2);
                composer.endReplaceableGroup();
                return draggable;
            }

            /* compiled from: Swipeable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4, reason: invalid class name */
            static final class AnonymousClass4 extends SuspendLambda implements Function3 {
                final /* synthetic */ SwipeableState<Object> $state;
                /* synthetic */ float F$0;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(SwipeableState<Object> swipeableState, Continuation continuation) {
                    super(3, continuation);
                    this.$state = swipeableState;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((CoroutineScope) obj, ((Number) obj2).floatValue(), (Continuation) obj3);
                }

                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, float f, @Nullable Continuation continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$state, continuation);
                    anonymousClass4.L$0 = coroutineScope;
                    anonymousClass4.F$0 = f;
                    return anonymousClass4.invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Swipeable.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {616}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                    final /* synthetic */ SwipeableState<Object> $state;
                    final /* synthetic */ float $velocity;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SwipeableState<Object> swipeableState, float f, Continuation continuation) {
                        super(2, continuation);
                        this.$state = swipeableState;
                        this.$velocity = f;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass1(this.$state, this.$velocity, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            SwipeableState<Object> swipeableState = this.$state;
                            float f = this.$velocity;
                            this.label = 1;
                            if (swipeableState.performFling(f, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: Swipeable.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {607}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2 {
                final /* synthetic */ Map<Float, Object> $anchors;
                final /* synthetic */ Density $density;
                final /* synthetic */ ResistanceConfig $resistance;
                final /* synthetic */ SwipeableState<Object> $state;
                final /* synthetic */ Function2 $thresholds;
                final /* synthetic */ float $velocityThreshold;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(SwipeableState<Object> swipeableState, Map<Float, Object> map, ResistanceConfig resistanceConfig, Density density, Function2 function2, float f, Continuation continuation) {
                    super(2, continuation);
                    this.$state = swipeableState;
                    this.$anchors = map;
                    this.$resistance = resistanceConfig;
                    this.$density = density;
                    this.$thresholds = function2;
                    this.$velocityThreshold = f;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Map anchors$material_release = this.$state.getAnchors$material_release();
                        this.$state.setAnchors$material_release(this.$anchors);
                        this.$state.setResistance$material_release(this.$resistance);
                        SwipeableState<Object> swipeableState = this.$state;
                        final Map<Float, Object> map = this.$anchors;
                        final Function2 function2 = this.$thresholds;
                        final Density density = this.$density;
                        swipeableState.setThresholds$material_release(new Function2() { // from class: androidx.compose.material.SwipeableKt.swipeable.3.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                return invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                            }

                            @NotNull
                            public final Float invoke(float f, float f2) {
                                return Float.valueOf(((ThresholdConfig) function2.invoke(MapsKt.getValue(map, Float.valueOf(f)), MapsKt.getValue(map, Float.valueOf(f2)))).computeThreshold(density, f, f2));
                            }
                        });
                        this.$state.setVelocityThreshold$material_release(this.$density.mo271toPx0680j_4(this.$velocityThreshold));
                        SwipeableState<Object> swipeableState2 = this.$state;
                        Map<Float, Object> map2 = this.$anchors;
                        this.label = 1;
                        if (swipeableState2.processNewAnchors$material_release(anchors$material_release, map2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    public static final SwipeableState rememberSwipeableStateFor(final Object value, final Function1 onValueChange, AnimationSpec animationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        composer.startReplaceableGroup(1156387078);
        if ((i2 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new SwipeableState(value, animationSpec, new Function1() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.TRUE;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final SwipeableState swipeableState = (SwipeableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue2;
        EffectsKt.LaunchedEffect(value, mutableState.getValue(), new SwipeableKt$rememberSwipeableStateFor$1(value, swipeableState, null), composer, i & 14);
        EffectsKt.DisposableEffect(swipeableState.getCurrentValue(), new Function1() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                if (!Intrinsics.areEqual(value, swipeableState.getCurrentValue())) {
                    onValueChange.invoke(swipeableState.getCurrentValue());
                    mutableState.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                }
                return new DisposableEffectResult() { // from class: androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                    }
                };
            }
        }, composer, i & 8);
        composer.endReplaceableGroup();
        return swipeableState;
    }

    private static final List findBounds(float f, Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Number) obj).floatValue() <= f + 0.001d) {
                arrayList.add(obj);
            }
        }
        Float maxOrNull = CollectionsKt.maxOrNull((Iterable) arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() >= f - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        Float minOrNull = CollectionsKt.minOrNull((Iterable) arrayList2);
        if (maxOrNull == null) {
            return CollectionsKt.listOfNotNull(minOrNull);
        }
        if (minOrNull == null) {
            return CollectionsKt.listOf(maxOrNull);
        }
        if (Intrinsics.areEqual(maxOrNull, minOrNull)) {
            return CollectionsKt.listOf(maxOrNull);
        }
        return CollectionsKt.listOf((Object[]) new Float[]{maxOrNull, minOrNull});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r3 < ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5))).floatValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r3 > ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0))).floatValue()) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float computeTarget(float f, float f2, Set set, Function2 function2, float f3, float f4) {
        List findBounds = findBounds(f, set);
        int size = findBounds.size();
        if (size == 0) {
            return f2;
        }
        if (size == 1) {
            return ((Number) findBounds.get(0)).floatValue();
        }
        float floatValue = ((Number) findBounds.get(0)).floatValue();
        float floatValue2 = ((Number) findBounds.get(1)).floatValue();
        if (f2 <= f) {
            if (f3 >= f4) {
                return floatValue2;
            }
        } else if (f3 <= (-f4)) {
            return floatValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float getOffset(Map map, Object obj) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final NestedScrollConnection getPreUpPostDownNestedScrollConnection(SwipeableState swipeableState) {
        Intrinsics.checkNotNullParameter(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }
}
