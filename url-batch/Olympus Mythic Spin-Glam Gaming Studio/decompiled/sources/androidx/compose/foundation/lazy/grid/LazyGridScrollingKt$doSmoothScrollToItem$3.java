package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridScrolling.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3", f = "LazyGridScrolling.kt", l = {128, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class LazyGridScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements Function2 {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ int $slotsPerLine;
    final /* synthetic */ LazyGridState $this_doSmoothScrollToItem;
    float F$0;
    float F$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridScrollingKt$doSmoothScrollToItem$3(LazyGridState lazyGridState, int i, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.$this_doSmoothScrollToItem = lazyGridState;
        this.$index = i;
        this.$slotsPerLine = i2;
        this.$scrollOffset = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        LazyGridScrollingKt$doSmoothScrollToItem$3 lazyGridScrollingKt$doSmoothScrollToItem$3 = new LazyGridScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$slotsPerLine, this.$scrollOffset, continuation);
        lazyGridScrollingKt$doSmoothScrollToItem$3.L$0 = obj;
        return lazyGridScrollingKt$doSmoothScrollToItem$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
        return ((LazyGridScrollingKt$doSmoothScrollToItem$3) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[Catch: ItemFoundInScroll -> 0x01b9, TryCatch #0 {ItemFoundInScroll -> 0x01b9, blocks: (B:20:0x00b3, B:22:0x00b7, B:24:0x00c3, B:27:0x00de, B:30:0x00f0, B:33:0x0115, B:36:0x0151, B:39:0x015a), top: B:19:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0227 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01a0 -> B:16:0x01a9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        final ScrollScope scrollScope;
        AnimationState copy$default;
        Float boxFloat;
        boolean z;
        Function1 function1;
        float f;
        float f2;
        LazyGridItemInfo doSmoothScrollToItem$getTargetItem;
        float f3;
        float f4;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        ScrollScope scrollScope2;
        Ref$IntRef ref$IntRef;
        ScrollScope scrollScope3;
        int calculateLineAverageMainAxisSize;
        final float f5;
        AnimationState animationState;
        Float boxFloat2;
        Function1 function12;
        boolean z2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        float f6 = 0.0f;
        try {
        } catch (ItemFoundInScroll e) {
            e = e;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope4 = (ScrollScope) this.L$0;
            Density density$foundation_release = this.$this_doSmoothScrollToItem.getDensity$foundation_release();
            f = LazyGridScrollingKt.TargetDistance;
            float mo271toPx0680j_4 = density$foundation_release.mo271toPx0680j_4(f);
            Density density$foundation_release2 = this.$this_doSmoothScrollToItem.getDensity$foundation_release();
            f2 = LazyGridScrollingKt.BoundDistance;
            float mo271toPx0680j_42 = density$foundation_release2.mo271toPx0680j_4(f2);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            ref$BooleanRef2.element = true;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            doSmoothScrollToItem$getTargetItem = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(this.$this_doSmoothScrollToItem, this.$index);
            if (doSmoothScrollToItem$getTargetItem != null) {
                throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem, (AnimationState) ref$ObjectRef2.element);
            }
            int i3 = this.$index > this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex() ? 1 : 0;
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = 1;
            f3 = mo271toPx0680j_4;
            f4 = mo271toPx0680j_42;
            i = i3;
            ref$BooleanRef = ref$BooleanRef2;
            ref$ObjectRef = ref$ObjectRef2;
            scrollScope2 = scrollScope4;
            ref$IntRef = ref$IntRef2;
            if (ref$BooleanRef.element) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.throwOnFailure(obj);
                this.$this_doSmoothScrollToItem.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$0;
        float f7 = this.F$1;
        float f8 = this.F$0;
        Ref$IntRef ref$IntRef3 = (Ref$IntRef) this.L$3;
        Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
        Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) this.L$1;
        ScrollScope scrollScope5 = (ScrollScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        f4 = f7;
        f3 = f8;
        ref$IntRef = ref$IntRef3;
        scrollScope2 = scrollScope5;
        ref$ObjectRef = ref$ObjectRef3;
        ref$BooleanRef = ref$BooleanRef3;
        try {
            try {
                ref$IntRef.element++;
                if (ref$BooleanRef.element && this.$this_doSmoothScrollToItem.getLayoutInfo().getTotalItemsCount() > 0) {
                    try {
                        calculateLineAverageMainAxisSize = LazyGridScrollingKt.calculateLineAverageMainAxisSize(this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo(), true);
                        boolean z3 = this.$index >= this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex();
                        int firstVisibleItemIndex = this.$index - this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex();
                        int i4 = this.$slotsPerLine;
                        float firstVisibleItemScrollOffset = ((calculateLineAverageMainAxisSize * ((firstVisibleItemIndex + ((i4 - 1) * (!z3 ? -1 : 1))) / i4)) + this.$scrollOffset) - this.$this_doSmoothScrollToItem.getFirstVisibleItemScrollOffset();
                        if (Math.abs(firstVisibleItemScrollOffset) >= f3) {
                            if (i != 0) {
                                f5 = f3;
                                ref$ObjectRef.element = AnimationStateKt.copy$default((AnimationState) ref$ObjectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                                animationState = (AnimationState) ref$ObjectRef.element;
                                boxFloat2 = Boxing.boxFloat(f5);
                                boolean z4 = ((Number) ((AnimationState) ref$ObjectRef.element).getVelocity()).floatValue() == f6;
                                final boolean z5 = i == 0;
                                final int i5 = this.$index;
                                final LazyGridState lazyGridState = this.$this_doSmoothScrollToItem;
                                final int i6 = this.$scrollOffset;
                                final ScrollScope scrollScope6 = scrollScope2;
                                final Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef;
                                final float f9 = f4;
                                final Ref$IntRef ref$IntRef4 = ref$IntRef;
                                final Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                                function12 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
                                        LazyGridItemInfo doSmoothScrollToItem$getTargetItem2;
                                        float coerceAtLeast;
                                        LazyGridItemInfo doSmoothScrollToItem$getTargetItem3;
                                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                        doSmoothScrollToItem$getTargetItem2 = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(lazyGridState, i5);
                                        if (doSmoothScrollToItem$getTargetItem2 == null) {
                                            if (f5 > 0.0f) {
                                                coerceAtLeast = RangesKt.coerceAtMost(((Number) animateTo.getValue()).floatValue(), f5);
                                            } else {
                                                coerceAtLeast = RangesKt.coerceAtLeast(((Number) animateTo.getValue()).floatValue(), f5);
                                            }
                                            float f10 = coerceAtLeast - ref$FloatRef.element;
                                            float scrollBy = scrollScope6.scrollBy(f10);
                                            doSmoothScrollToItem$getTargetItem3 = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(lazyGridState, i5);
                                            if (doSmoothScrollToItem$getTargetItem3 == null && !LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z5, lazyGridState, i5, i6)) {
                                                if (f10 != scrollBy) {
                                                    animateTo.cancelAnimation();
                                                    ref$BooleanRef4.element = false;
                                                    return;
                                                }
                                                ref$FloatRef.element += f10;
                                                if (z5) {
                                                    if (((Number) animateTo.getValue()).floatValue() > f9) {
                                                        animateTo.cancelAnimation();
                                                    }
                                                } else if (((Number) animateTo.getValue()).floatValue() < (-f9)) {
                                                    animateTo.cancelAnimation();
                                                }
                                                if (z5) {
                                                    if (ref$IntRef4.element >= 2 && i5 - ((LazyGridItemInfo) CollectionsKt.last(lazyGridState.getLayoutInfo().getVisibleItemsInfo())).getIndex() > 200) {
                                                        lazyGridState.snapToItemIndexInternal$foundation_release(i5 - 200, 0);
                                                    }
                                                } else if (ref$IntRef4.element >= 2) {
                                                    int index = ((LazyGridItemInfo) CollectionsKt.first(lazyGridState.getLayoutInfo().getVisibleItemsInfo())).getIndex();
                                                    int i7 = i5;
                                                    if (index - i7 > 100) {
                                                        lazyGridState.snapToItemIndexInternal$foundation_release(i7 + 200, 0);
                                                    }
                                                }
                                            }
                                            doSmoothScrollToItem$getTargetItem2 = doSmoothScrollToItem$getTargetItem3;
                                        }
                                        if (!LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z5, lazyGridState, i5, i6)) {
                                            if (doSmoothScrollToItem$getTargetItem2 != null) {
                                                throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem2, ref$ObjectRef4.element);
                                            }
                                        } else {
                                            lazyGridState.snapToItemIndexInternal$foundation_release(i5, i6);
                                            ref$BooleanRef4.element = false;
                                            animateTo.cancelAnimation();
                                        }
                                    }
                                };
                                this.L$0 = scrollScope2;
                                this.L$1 = ref$BooleanRef;
                                this.L$2 = ref$ObjectRef;
                                this.L$3 = ref$IntRef;
                                this.F$0 = f3;
                                this.F$1 = f4;
                                this.I$0 = i;
                                this.label = 1;
                                scrollScope3 = scrollScope2;
                                Ref$BooleanRef ref$BooleanRef5 = ref$BooleanRef;
                                z2 = z4;
                                Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef;
                                Ref$IntRef ref$IntRef5 = ref$IntRef;
                                float f10 = f3;
                                float f11 = f4;
                                if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function12, this, 2, null) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ref$BooleanRef = ref$BooleanRef5;
                                f4 = f11;
                                ref$ObjectRef = ref$ObjectRef5;
                                scrollScope2 = scrollScope3;
                                ref$IntRef = ref$IntRef5;
                                f3 = f10;
                                ref$IntRef.element++;
                                f6 = 0.0f;
                                if (ref$BooleanRef.element) {
                                    calculateLineAverageMainAxisSize = LazyGridScrollingKt.calculateLineAverageMainAxisSize(this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo(), true);
                                    if (this.$index >= this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex()) {
                                    }
                                    int firstVisibleItemIndex2 = this.$index - this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex();
                                    int i42 = this.$slotsPerLine;
                                    float firstVisibleItemScrollOffset2 = ((calculateLineAverageMainAxisSize * ((firstVisibleItemIndex2 + ((i42 - 1) * (!z3 ? -1 : 1))) / i42)) + this.$scrollOffset) - this.$this_doSmoothScrollToItem.getFirstVisibleItemScrollOffset();
                                    if (Math.abs(firstVisibleItemScrollOffset2) >= f3) {
                                    }
                                }
                            } else {
                                firstVisibleItemScrollOffset2 = -f3;
                            }
                        }
                        f5 = firstVisibleItemScrollOffset2;
                        ref$ObjectRef.element = AnimationStateKt.copy$default((AnimationState) ref$ObjectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                        final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        animationState = (AnimationState) ref$ObjectRef.element;
                        boxFloat2 = Boxing.boxFloat(f5);
                        if (((Number) ((AnimationState) ref$ObjectRef.element).getVelocity()).floatValue() == f6) {
                        }
                        if (i == 0) {
                        }
                        final int i52 = this.$index;
                        final LazyGridState lazyGridState2 = this.$this_doSmoothScrollToItem;
                        final int i62 = this.$scrollOffset;
                        final ScrollScope scrollScope62 = scrollScope2;
                        final Ref$BooleanRef ref$BooleanRef42 = ref$BooleanRef;
                        final float f92 = f4;
                        final Ref$IntRef ref$IntRef42 = ref$IntRef;
                        final Ref$ObjectRef<AnimationState<Float, AnimationVector1D>> ref$ObjectRef42 = ref$ObjectRef;
                        function12 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
                                LazyGridItemInfo doSmoothScrollToItem$getTargetItem2;
                                float coerceAtLeast;
                                LazyGridItemInfo doSmoothScrollToItem$getTargetItem3;
                                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                doSmoothScrollToItem$getTargetItem2 = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(lazyGridState2, i52);
                                if (doSmoothScrollToItem$getTargetItem2 == null) {
                                    if (f5 > 0.0f) {
                                        coerceAtLeast = RangesKt.coerceAtMost(((Number) animateTo.getValue()).floatValue(), f5);
                                    } else {
                                        coerceAtLeast = RangesKt.coerceAtLeast(((Number) animateTo.getValue()).floatValue(), f5);
                                    }
                                    float f102 = coerceAtLeast - ref$FloatRef2.element;
                                    float scrollBy = scrollScope62.scrollBy(f102);
                                    doSmoothScrollToItem$getTargetItem3 = LazyGridScrollingKt.doSmoothScrollToItem$getTargetItem(lazyGridState2, i52);
                                    if (doSmoothScrollToItem$getTargetItem3 == null && !LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z5, lazyGridState2, i52, i62)) {
                                        if (f102 != scrollBy) {
                                            animateTo.cancelAnimation();
                                            ref$BooleanRef42.element = false;
                                            return;
                                        }
                                        ref$FloatRef2.element += f102;
                                        if (z5) {
                                            if (((Number) animateTo.getValue()).floatValue() > f92) {
                                                animateTo.cancelAnimation();
                                            }
                                        } else if (((Number) animateTo.getValue()).floatValue() < (-f92)) {
                                            animateTo.cancelAnimation();
                                        }
                                        if (z5) {
                                            if (ref$IntRef42.element >= 2 && i52 - ((LazyGridItemInfo) CollectionsKt.last(lazyGridState2.getLayoutInfo().getVisibleItemsInfo())).getIndex() > 200) {
                                                lazyGridState2.snapToItemIndexInternal$foundation_release(i52 - 200, 0);
                                            }
                                        } else if (ref$IntRef42.element >= 2) {
                                            int index = ((LazyGridItemInfo) CollectionsKt.first(lazyGridState2.getLayoutInfo().getVisibleItemsInfo())).getIndex();
                                            int i7 = i52;
                                            if (index - i7 > 100) {
                                                lazyGridState2.snapToItemIndexInternal$foundation_release(i7 + 200, 0);
                                            }
                                        }
                                    }
                                    doSmoothScrollToItem$getTargetItem2 = doSmoothScrollToItem$getTargetItem3;
                                }
                                if (!LazyGridScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z5, lazyGridState2, i52, i62)) {
                                    if (doSmoothScrollToItem$getTargetItem2 != null) {
                                        throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem2, ref$ObjectRef42.element);
                                    }
                                } else {
                                    lazyGridState2.snapToItemIndexInternal$foundation_release(i52, i62);
                                    ref$BooleanRef42.element = false;
                                    animateTo.cancelAnimation();
                                }
                            }
                        };
                        this.L$0 = scrollScope2;
                        this.L$1 = ref$BooleanRef;
                        this.L$2 = ref$ObjectRef;
                        this.L$3 = ref$IntRef;
                        this.F$0 = f3;
                        this.F$1 = f4;
                        this.I$0 = i;
                        this.label = 1;
                        if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function12, this, 2, null) != coroutine_suspended) {
                        }
                    } catch (ItemFoundInScroll e2) {
                        e = e2;
                        scrollScope = scrollScope3;
                        copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                        final float m2554getYimpl = IntOffset.m2554getYimpl(e.getItem().getOffset()) + this.$scrollOffset;
                        final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                        boxFloat = Boxing.boxFloat(m2554getYimpl);
                        z = ((Number) copy$default.getVelocity()).floatValue() != 0.0f;
                        function1 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
                                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                float f12 = m2554getYimpl;
                                float f13 = 0.0f;
                                if (f12 > 0.0f) {
                                    f13 = RangesKt.coerceAtMost(((Number) animateTo.getValue()).floatValue(), m2554getYimpl);
                                } else if (f12 < 0.0f) {
                                    f13 = RangesKt.coerceAtLeast(((Number) animateTo.getValue()).floatValue(), m2554getYimpl);
                                }
                                float f14 = f13 - ref$FloatRef3.element;
                                if (f14 != scrollScope.scrollBy(f14) || f13 != ((Number) animateTo.getValue()).floatValue()) {
                                    animateTo.cancelAnimation();
                                }
                                ref$FloatRef3.element += f14;
                            }
                        };
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                        if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, function1, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.$this_doSmoothScrollToItem.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
                        return Unit.INSTANCE;
                    }
                    scrollScope3 = scrollScope2;
                    Ref$BooleanRef ref$BooleanRef52 = ref$BooleanRef;
                    z2 = z4;
                    Ref$ObjectRef ref$ObjectRef52 = ref$ObjectRef;
                    Ref$IntRef ref$IntRef52 = ref$IntRef;
                    float f102 = f3;
                    float f112 = f4;
                }
            } catch (ItemFoundInScroll e3) {
                e = e3;
                scrollScope3 = scrollScope2;
            }
            f6 = 0.0f;
        } catch (ItemFoundInScroll e4) {
            e = e4;
            scrollScope = scrollScope2;
            copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
            final float m2554getYimpl2 = IntOffset.m2554getYimpl(e.getItem().getOffset()) + this.$scrollOffset;
            final Ref$FloatRef ref$FloatRef32 = new Ref$FloatRef();
            boxFloat = Boxing.boxFloat(m2554getYimpl2);
            if (((Number) copy$default.getVelocity()).floatValue() != 0.0f) {
            }
            function1 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$doSmoothScrollToItem$3.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    float f12 = m2554getYimpl2;
                    float f13 = 0.0f;
                    if (f12 > 0.0f) {
                        f13 = RangesKt.coerceAtMost(((Number) animateTo.getValue()).floatValue(), m2554getYimpl2);
                    } else if (f12 < 0.0f) {
                        f13 = RangesKt.coerceAtLeast(((Number) animateTo.getValue()).floatValue(), m2554getYimpl2);
                    }
                    float f14 = f13 - ref$FloatRef32.element;
                    if (f14 != scrollScope.scrollBy(f14) || f13 != ((Number) animateTo.getValue()).floatValue()) {
                        animateTo.cancelAnimation();
                    }
                    ref$FloatRef32.element += f14;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, function1, this, 2, null) == coroutine_suspended) {
            }
            this.$this_doSmoothScrollToItem.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyGridState lazyGridState, int i, int i2) {
        if (z) {
            if (lazyGridState.getFirstVisibleItemIndex() <= i && (lazyGridState.getFirstVisibleItemIndex() != i || lazyGridState.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyGridState.getFirstVisibleItemIndex() >= i && (lazyGridState.getFirstVisibleItemIndex() != i || lazyGridState.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }
}
