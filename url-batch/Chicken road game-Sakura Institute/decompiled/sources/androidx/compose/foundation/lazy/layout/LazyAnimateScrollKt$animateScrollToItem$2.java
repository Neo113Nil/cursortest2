package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: LazyAnimateScroll.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {174, 272}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
/* loaded from: classes.dex */
final class LazyAnimateScrollKt$animateScrollToItem$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ int $index;
    final /* synthetic */ int $numOfItemsForTeleport;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyAnimateScrollKt$animateScrollToItem$2(int i, Density density, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3, Continuation<? super LazyAnimateScrollKt$animateScrollToItem$2> continuation) {
        super(2, continuation);
        this.$index = i;
        this.$density = density;
        this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
        this.$scrollOffset = i2;
        this.$numOfItemsForTeleport = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, continuation);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca A[Catch: ItemFoundInScroll -> 0x01c6, TryCatch #0 {ItemFoundInScroll -> 0x01c6, blocks: (B:20:0x00c6, B:22:0x00ca, B:24:0x00d2, B:31:0x00fb, B:34:0x013b, B:37:0x0148), top: B:19:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[Catch: ItemFoundInScroll -> 0x01bc, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ItemFoundInScroll -> 0x01bc, blocks: (B:17:0x01b3, B:27:0x00e6), top: B:16:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Type inference failed for: r12v1, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r8v19, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01ae -> B:16:0x01b3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ItemFoundInScroll itemFoundInScroll;
        final ScrollScope scrollScope;
        float f;
        float mo373toPx0680j_4;
        float f2;
        float mo373toPx0680j_42;
        float f3;
        float mo373toPx0680j_43;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.IntRef intRef;
        float f4;
        float f5;
        int i;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef2;
        ScrollScope scrollScope2;
        float f6;
        AnimationState copy$default;
        final float itemOffset;
        final Ref.FloatRef floatRef;
        Float boxFloat;
        boolean z;
        ScrollScope scrollScope3;
        float f7;
        float f8;
        AnimationState animationState;
        Float boxFloat2;
        boolean z2;
        final ScrollScope scrollScope4;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1;
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        float f9 = 0.0f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope5 = (ScrollScope) this.L$0;
            int i3 = this.$index;
            if (!(((float) i3) >= 0.0f)) {
                throw new IllegalArgumentException(("Index should be non-negative (" + i3 + ')').toString());
            }
            try {
                Density density = this.$density;
                f = LazyAnimateScrollKt.TargetDistance;
                mo373toPx0680j_4 = density.mo373toPx0680j_4(f);
                Density density2 = this.$density;
                f2 = LazyAnimateScrollKt.BoundDistance;
                mo373toPx0680j_42 = density2.mo373toPx0680j_4(f2);
                Density density3 = this.$density;
                f3 = LazyAnimateScrollKt.MinimumDistance;
                mo373toPx0680j_43 = density3.mo373toPx0680j_4(f3);
                booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                objectRef = new Ref.ObjectRef();
                objectRef.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            } catch (ItemFoundInScroll e) {
                itemFoundInScroll = e;
                scrollScope = scrollScope5;
            }
            if (LazyAnimateScrollKt.isItemVisible(this.$this_animateScrollToItem, this.$index)) {
                throw new ItemFoundInScroll(MathKt.roundToInt(this.$this_animateScrollToItem.calculateDistanceTo(this.$index)), (AnimationState) objectRef.element);
            }
            int i4 = this.$index > this.$this_animateScrollToItem.getFirstVisibleItemIndex() ? 1 : 0;
            intRef = new Ref.IntRef();
            intRef.element = 1;
            f4 = mo373toPx0680j_4;
            f5 = mo373toPx0680j_42;
            i = i4;
            objectRef2 = objectRef;
            booleanRef2 = booleanRef;
            scrollScope2 = scrollScope5;
            f6 = mo373toPx0680j_43;
            if (booleanRef2.element) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollScope = (ScrollScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.$this_animateScrollToItem.snapToItem(scrollScope, this.$index, this.$scrollOffset);
            return Unit.INSTANCE;
        }
        i = this.I$0;
        f6 = this.F$2;
        float f10 = this.F$1;
        float f11 = this.F$0;
        Ref.IntRef intRef2 = (Ref.IntRef) this.L$3;
        Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.L$2;
        Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) this.L$1;
        ScrollScope scrollScope6 = (ScrollScope) this.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            f5 = f10;
            f4 = f11;
            intRef = intRef2;
            scrollScope2 = scrollScope6;
            objectRef2 = objectRef3;
            booleanRef2 = booleanRef3;
            try {
                try {
                    intRef.element++;
                    if (booleanRef2.element && this.$this_animateScrollToItem.getItemCount() > 0) {
                        try {
                            try {
                                float calculateDistanceTo = this.$this_animateScrollToItem.calculateDistanceTo(this.$index) + this.$scrollOffset;
                                if (Math.abs(calculateDistanceTo) < f4) {
                                    if (i != 0) {
                                        f8 = f4;
                                        objectRef2.element = AnimationStateKt.copy$default((AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                        animationState = (AnimationState) objectRef2.element;
                                        boxFloat2 = Boxing.boxFloat(f8);
                                        z2 = ((Number) ((AnimationState) objectRef2.element).getVelocity()).floatValue() == f9;
                                        final LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope = this.$this_animateScrollToItem;
                                        final int i5 = this.$index;
                                        boolean z3 = i == 0;
                                        final int i6 = this.$numOfItemsForTeleport;
                                        final int i7 = this.$scrollOffset;
                                        scrollScope4 = scrollScope2;
                                        final Ref.BooleanRef booleanRef4 = booleanRef2;
                                        final float f12 = f8;
                                        final Ref.ObjectRef objectRef4 = objectRef2;
                                        final Ref.IntRef intRef3 = intRef;
                                        float f13 = f4;
                                        final float f14 = f5;
                                        final boolean z4 = z3;
                                        function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                                invoke2(animationScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                                                float coerceAtLeast;
                                                if (!LazyAnimateScrollKt.isItemVisible(LazyLayoutAnimateScrollScope.this, i5)) {
                                                    if (f12 > 0.0f) {
                                                        coerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f12);
                                                    } else {
                                                        coerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f12);
                                                    }
                                                    float f15 = coerceAtLeast - floatRef2.element;
                                                    float scrollBy = scrollScope4.scrollBy(f15);
                                                    if (!LazyAnimateScrollKt.isItemVisible(LazyLayoutAnimateScrollScope.this, i5) && !LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(z4, LazyLayoutAnimateScrollScope.this, i5, i7)) {
                                                        if (f15 != scrollBy) {
                                                            animationScope.cancelAnimation();
                                                            booleanRef4.element = false;
                                                            return;
                                                        }
                                                        floatRef2.element += f15;
                                                        if (z4) {
                                                            if (animationScope.getValue().floatValue() > f14) {
                                                                animationScope.cancelAnimation();
                                                            }
                                                        } else if (animationScope.getValue().floatValue() < (-f14)) {
                                                            animationScope.cancelAnimation();
                                                        }
                                                        if (z4) {
                                                            if (intRef3.element >= 2) {
                                                                int lastVisibleItemIndex = i5 - LazyLayoutAnimateScrollScope.this.getLastVisibleItemIndex();
                                                                int i8 = i6;
                                                                if (lastVisibleItemIndex > i8) {
                                                                    LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i5 - i8, 0);
                                                                }
                                                            }
                                                        } else if (intRef3.element >= 2) {
                                                            int firstVisibleItemIndex = LazyLayoutAnimateScrollScope.this.getFirstVisibleItemIndex();
                                                            int i9 = i5;
                                                            int i10 = firstVisibleItemIndex - i9;
                                                            int i11 = i6;
                                                            if (i10 > i11) {
                                                                LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i9 + i11, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(z4, LazyLayoutAnimateScrollScope.this, i5, i7)) {
                                                    LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i5, i7);
                                                    booleanRef4.element = false;
                                                    animationScope.cancelAnimation();
                                                    return;
                                                }
                                                if (LazyAnimateScrollKt.isItemVisible(LazyLayoutAnimateScrollScope.this, i5)) {
                                                    throw new ItemFoundInScroll(MathKt.roundToInt(LazyLayoutAnimateScrollScope.this.calculateDistanceTo(i5)), objectRef4.element);
                                                }
                                            }
                                        };
                                        lazyAnimateScrollKt$animateScrollToItem$2 = this;
                                        scrollScope3 = scrollScope4;
                                        this.L$0 = scrollScope3;
                                        this.L$1 = booleanRef4;
                                        this.L$2 = objectRef4;
                                        intRef = intRef3;
                                        this.L$3 = intRef;
                                        this.F$0 = f13;
                                        this.F$1 = f14;
                                        this.F$2 = f6;
                                        this.I$0 = i;
                                        this.label = 1;
                                        if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function1, lazyAnimateScrollKt$animateScrollToItem$2, 2, null) != coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        f4 = f13;
                                        f5 = f14;
                                        objectRef2 = objectRef4;
                                        booleanRef2 = booleanRef4;
                                        scrollScope2 = scrollScope3;
                                        intRef.element++;
                                        f9 = 0.0f;
                                        if (booleanRef2.element) {
                                            float calculateDistanceTo2 = this.$this_animateScrollToItem.calculateDistanceTo(this.$index) + this.$scrollOffset;
                                            if (Math.abs(calculateDistanceTo2) < f4) {
                                                f7 = Math.max(Math.abs(calculateDistanceTo2), f6);
                                                if (i == 0) {
                                                    f7 = -f7;
                                                }
                                            }
                                        }
                                    } else {
                                        f7 = -f4;
                                    }
                                }
                                f8 = f7;
                                objectRef2.element = AnimationStateKt.copy$default((AnimationState) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                final Ref.FloatRef floatRef22 = new Ref.FloatRef();
                                animationState = (AnimationState) objectRef2.element;
                                boxFloat2 = Boxing.boxFloat(f8);
                                if (((Number) ((AnimationState) objectRef2.element).getVelocity()).floatValue() == f9) {
                                }
                                final LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope2 = this.$this_animateScrollToItem;
                                final int i52 = this.$index;
                                if (i == 0) {
                                }
                                final int i62 = this.$numOfItemsForTeleport;
                                final int i72 = this.$scrollOffset;
                                function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                        invoke2(animationScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                                        float coerceAtLeast;
                                        if (!LazyAnimateScrollKt.isItemVisible(LazyLayoutAnimateScrollScope.this, i52)) {
                                            if (f12 > 0.0f) {
                                                coerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f12);
                                            } else {
                                                coerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f12);
                                            }
                                            float f15 = coerceAtLeast - floatRef22.element;
                                            float scrollBy = scrollScope4.scrollBy(f15);
                                            if (!LazyAnimateScrollKt.isItemVisible(LazyLayoutAnimateScrollScope.this, i52) && !LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(z4, LazyLayoutAnimateScrollScope.this, i52, i72)) {
                                                if (f15 != scrollBy) {
                                                    animationScope.cancelAnimation();
                                                    booleanRef4.element = false;
                                                    return;
                                                }
                                                floatRef22.element += f15;
                                                if (z4) {
                                                    if (animationScope.getValue().floatValue() > f14) {
                                                        animationScope.cancelAnimation();
                                                    }
                                                } else if (animationScope.getValue().floatValue() < (-f14)) {
                                                    animationScope.cancelAnimation();
                                                }
                                                if (z4) {
                                                    if (intRef3.element >= 2) {
                                                        int lastVisibleItemIndex = i52 - LazyLayoutAnimateScrollScope.this.getLastVisibleItemIndex();
                                                        int i8 = i62;
                                                        if (lastVisibleItemIndex > i8) {
                                                            LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i52 - i8, 0);
                                                        }
                                                    }
                                                } else if (intRef3.element >= 2) {
                                                    int firstVisibleItemIndex = LazyLayoutAnimateScrollScope.this.getFirstVisibleItemIndex();
                                                    int i9 = i52;
                                                    int i10 = firstVisibleItemIndex - i9;
                                                    int i11 = i62;
                                                    if (i10 > i11) {
                                                        LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i9 + i11, 0);
                                                    }
                                                }
                                            }
                                        }
                                        if (LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(z4, LazyLayoutAnimateScrollScope.this, i52, i72)) {
                                            LazyLayoutAnimateScrollScope.this.snapToItem(scrollScope4, i52, i72);
                                            booleanRef4.element = false;
                                            animationScope.cancelAnimation();
                                            return;
                                        }
                                        if (LazyAnimateScrollKt.isItemVisible(LazyLayoutAnimateScrollScope.this, i52)) {
                                            throw new ItemFoundInScroll(MathKt.roundToInt(LazyLayoutAnimateScrollScope.this.calculateDistanceTo(i52)), objectRef4.element);
                                        }
                                    }
                                };
                                lazyAnimateScrollKt$animateScrollToItem$2 = this;
                                this.L$0 = scrollScope3;
                                this.L$1 = booleanRef4;
                                this.L$2 = objectRef4;
                                intRef = intRef3;
                                this.L$3 = intRef;
                                this.F$0 = f13;
                                this.F$1 = f14;
                                this.F$2 = f6;
                                this.I$0 = i;
                                this.label = 1;
                                if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function1, lazyAnimateScrollKt$animateScrollToItem$2, 2, null) != coroutine_suspended) {
                                }
                            } catch (ItemFoundInScroll e2) {
                                e = e2;
                                scrollScope3 = scrollScope4;
                            }
                            scrollScope4 = scrollScope2;
                            final Ref.BooleanRef booleanRef42 = booleanRef2;
                            final float f122 = f8;
                            final Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef42 = objectRef2;
                            final Ref.IntRef intRef32 = intRef;
                            float f132 = f4;
                            final float f142 = f5;
                            final boolean z42 = z3;
                        } catch (ItemFoundInScroll e3) {
                            e = e3;
                            itemFoundInScroll = e;
                            scrollScope = scrollScope3;
                            copy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            itemOffset = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
                            floatRef = new Ref.FloatRef();
                            boxFloat = Boxing.boxFloat(itemOffset);
                            if (((Number) copy$default.getVelocity()).floatValue() != 0.0f) {
                            }
                            this.L$0 = scrollScope;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 2;
                            if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                    invoke2(animationScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                                    float f15 = itemOffset;
                                    float f16 = 0.0f;
                                    if (f15 > 0.0f) {
                                        f16 = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), itemOffset);
                                    } else if (f15 < 0.0f) {
                                        f16 = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), itemOffset);
                                    }
                                    float f17 = f16 - floatRef.element;
                                    if (f17 != scrollScope.scrollBy(f17) || f16 != animationScope.getValue().floatValue()) {
                                        animationScope.cancelAnimation();
                                    }
                                    floatRef.element += f17;
                                }
                            }, this, 2, null) == coroutine_suspended) {
                            }
                            this.$this_animateScrollToItem.snapToItem(scrollScope, this.$index, this.$scrollOffset);
                            return Unit.INSTANCE;
                        }
                        scrollScope3 = scrollScope4;
                    }
                } catch (ItemFoundInScroll e4) {
                    e = e4;
                    scrollScope3 = scrollScope2;
                }
                f9 = 0.0f;
            } catch (ItemFoundInScroll e5) {
                itemFoundInScroll = e5;
                scrollScope = scrollScope2;
            }
        } catch (ItemFoundInScroll e6) {
            itemFoundInScroll = e6;
            scrollScope = scrollScope6;
        }
        return Unit.INSTANCE;
        copy$default = AnimationStateKt.copy$default((AnimationState) itemFoundInScroll.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        itemOffset = itemFoundInScroll.getItemOffset() + this.$scrollOffset;
        floatRef = new Ref.FloatRef();
        boxFloat = Boxing.boxFloat(itemOffset);
        z = ((Number) copy$default.getVelocity()).floatValue() != 0.0f;
        this.L$0 = scrollScope;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        if (SuspendAnimationKt.animateTo$default(copy$default, boxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                float f15 = itemOffset;
                float f16 = 0.0f;
                if (f15 > 0.0f) {
                    f16 = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), itemOffset);
                } else if (f15 < 0.0f) {
                    f16 = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), itemOffset);
                }
                float f17 = f16 - floatRef.element;
                if (f17 != scrollScope.scrollBy(f17) || f16 != animationScope.getValue().floatValue()) {
                    animationScope.cancelAnimation();
                }
                floatRef.element += f17;
            }
        }, this, 2, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.$this_animateScrollToItem.snapToItem(scrollScope, this.$index, this.$scrollOffset);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i, int i2) {
        if (z) {
            if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() >= i && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }
}
