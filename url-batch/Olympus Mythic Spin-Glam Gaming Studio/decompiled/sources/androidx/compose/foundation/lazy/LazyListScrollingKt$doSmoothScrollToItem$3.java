package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import java.util.List;
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

/* compiled from: LazyListScrolling.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", l = {114, 205}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class LazyListScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements Function2 {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyListState $this_doSmoothScrollToItem;
    float F$0;
    float F$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListScrollingKt$doSmoothScrollToItem$3(LazyListState lazyListState, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$this_doSmoothScrollToItem = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        LazyListScrollingKt$doSmoothScrollToItem$3 lazyListScrollingKt$doSmoothScrollToItem$3 = new LazyListScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset, continuation);
        lazyListScrollingKt$doSmoothScrollToItem$3.L$0 = obj;
        return lazyListScrollingKt$doSmoothScrollToItem$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
        return ((LazyListScrollingKt$doSmoothScrollToItem$3) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[Catch: ItemFoundInScroll -> 0x01be, TryCatch #0 {ItemFoundInScroll -> 0x01be, blocks: (B:20:0x00b3, B:22:0x00b7, B:24:0x00c3, B:30:0x00e9, B:33:0x0119, B:36:0x0157, B:39:0x0160), top: B:19:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6 A[Catch: ItemFoundInScroll -> 0x00e5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {ItemFoundInScroll -> 0x00e5, blocks: (B:17:0x01b2, B:27:0x00d6), top: B:16:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0227 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Type inference failed for: r1v24, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01a8 -> B:16:0x01b2). Please report as a decompilation issue!!! */
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
        LazyListItemInfo doSmoothScrollToItem$getTargetItem;
        float f3;
        float f4;
        int i;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        ScrollScope scrollScope2;
        Ref$IntRef ref$IntRef;
        ScrollScope scrollScope3;
        final float f5;
        AnimationState animationState;
        Float boxFloat2;
        boolean z2;
        Function1 function12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (ItemFoundInScroll e) {
            e = e;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope4 = (ScrollScope) this.L$0;
            Density density$foundation_release = this.$this_doSmoothScrollToItem.getDensity$foundation_release();
            f = LazyListScrollingKt.TargetDistance;
            float mo271toPx0680j_4 = density$foundation_release.mo271toPx0680j_4(f);
            Density density$foundation_release2 = this.$this_doSmoothScrollToItem.getDensity$foundation_release();
            f2 = LazyListScrollingKt.BoundDistance;
            float mo271toPx0680j_42 = density$foundation_release2.mo271toPx0680j_4(f2);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            ref$BooleanRef2.element = true;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
            doSmoothScrollToItem$getTargetItem = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(this.$this_doSmoothScrollToItem, this.$index);
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
        float f6 = this.F$1;
        float f7 = this.F$0;
        Ref$IntRef ref$IntRef3 = (Ref$IntRef) this.L$3;
        Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
        Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) this.L$1;
        ScrollScope scrollScope5 = (ScrollScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        f4 = f6;
        f3 = f7;
        ref$IntRef = ref$IntRef3;
        scrollScope2 = scrollScope5;
        ref$ObjectRef = ref$ObjectRef3;
        ref$BooleanRef = ref$BooleanRef3;
        try {
            try {
                ref$IntRef.element++;
                if (ref$BooleanRef.element && this.$this_doSmoothScrollToItem.getLayoutInfo().getTotalItemsCount() > 0) {
                    try {
                        List visibleItemsInfo = this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo();
                        int size = visibleItemsInfo.size();
                        int i4 = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            i4 += ((LazyListItemInfo) visibleItemsInfo.get(i5)).getSize();
                        }
                        float firstVisibleItemIndex = (((this.$index - this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex()) * (i4 / visibleItemsInfo.size())) + this.$scrollOffset) - this.$this_doSmoothScrollToItem.getFirstVisibleItemScrollOffset();
                        if (Math.abs(firstVisibleItemIndex) >= f3) {
                            if (i != 0) {
                                f5 = f3;
                                ref$ObjectRef.element = AnimationStateKt.copy$default((AnimationState) ref$ObjectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                                animationState = (AnimationState) ref$ObjectRef.element;
                                boxFloat2 = Boxing.boxFloat(f5);
                                z2 = ((Number) ((AnimationState) ref$ObjectRef.element).getVelocity()).floatValue() == 0.0f;
                                final boolean z3 = i == 0;
                                final int i6 = this.$index;
                                final LazyListState lazyListState = this.$this_doSmoothScrollToItem;
                                final int i7 = this.$scrollOffset;
                                final ScrollScope scrollScope6 = scrollScope2;
                                final Ref$BooleanRef ref$BooleanRef4 = ref$BooleanRef;
                                final float f8 = f4;
                                final Ref$IntRef ref$IntRef4 = ref$IntRef;
                                final Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                                function12 = new Function1() { // from class: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.2
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
                                        LazyListItemInfo doSmoothScrollToItem$getTargetItem2;
                                        float coerceAtLeast;
                                        LazyListItemInfo doSmoothScrollToItem$getTargetItem3;
                                        Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                        doSmoothScrollToItem$getTargetItem2 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(lazyListState, i6);
                                        if (doSmoothScrollToItem$getTargetItem2 == null) {
                                            if (f5 > 0.0f) {
                                                coerceAtLeast = RangesKt.coerceAtMost(((Number) animateTo.getValue()).floatValue(), f5);
                                            } else {
                                                coerceAtLeast = RangesKt.coerceAtLeast(((Number) animateTo.getValue()).floatValue(), f5);
                                            }
                                            float f9 = coerceAtLeast - ref$FloatRef.element;
                                            float scrollBy = scrollScope6.scrollBy(f9);
                                            doSmoothScrollToItem$getTargetItem3 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(lazyListState, i6);
                                            if (doSmoothScrollToItem$getTargetItem3 == null && !LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z3, lazyListState, i6, i7)) {
                                                if (f9 != scrollBy) {
                                                    animateTo.cancelAnimation();
                                                    ref$BooleanRef4.element = false;
                                                    return;
                                                }
                                                ref$FloatRef.element += f9;
                                                if (z3) {
                                                    if (((Number) animateTo.getValue()).floatValue() > f8) {
                                                        animateTo.cancelAnimation();
                                                    }
                                                } else if (((Number) animateTo.getValue()).floatValue() < (-f8)) {
                                                    animateTo.cancelAnimation();
                                                }
                                                if (z3) {
                                                    if (ref$IntRef4.element >= 2 && i6 - ((LazyListItemInfo) CollectionsKt.last(lazyListState.getLayoutInfo().getVisibleItemsInfo())).getIndex() > 100) {
                                                        lazyListState.snapToItemIndexInternal$foundation_release(i6 - 100, 0);
                                                    }
                                                } else if (ref$IntRef4.element >= 2) {
                                                    int index = ((LazyListItemInfo) CollectionsKt.first(lazyListState.getLayoutInfo().getVisibleItemsInfo())).getIndex();
                                                    int i8 = i6;
                                                    if (index - i8 > 100) {
                                                        lazyListState.snapToItemIndexInternal$foundation_release(i8 + 100, 0);
                                                    }
                                                }
                                            }
                                            doSmoothScrollToItem$getTargetItem2 = doSmoothScrollToItem$getTargetItem3;
                                        }
                                        if (!LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z3, lazyListState, i6, i7)) {
                                            if (doSmoothScrollToItem$getTargetItem2 != null) {
                                                throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem2, ref$ObjectRef4.element);
                                            }
                                        } else {
                                            lazyListState.snapToItemIndexInternal$foundation_release(i6, i7);
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
                                Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef;
                                Ref$IntRef ref$IntRef5 = ref$IntRef;
                                float f9 = f3;
                                float f10 = f4;
                                if (SuspendAnimationKt.animateTo$default(animationState, boxFloat2, null, z2, function12, this, 2, null) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ref$BooleanRef = ref$BooleanRef5;
                                f4 = f10;
                                scrollScope2 = scrollScope3;
                                ref$ObjectRef = ref$ObjectRef5;
                                ref$IntRef = ref$IntRef5;
                                f3 = f9;
                                ref$IntRef.element++;
                                if (ref$BooleanRef.element) {
                                    List visibleItemsInfo2 = this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo();
                                    int size2 = visibleItemsInfo2.size();
                                    int i42 = 0;
                                    while (i5 < size2) {
                                    }
                                    float firstVisibleItemIndex2 = (((this.$index - this.$this_doSmoothScrollToItem.getFirstVisibleItemIndex()) * (i42 / visibleItemsInfo2.size())) + this.$scrollOffset) - this.$this_doSmoothScrollToItem.getFirstVisibleItemScrollOffset();
                                    if (Math.abs(firstVisibleItemIndex2) >= f3) {
                                    }
                                }
                            } else {
                                firstVisibleItemIndex2 = -f3;
                            }
                        }
                        f5 = firstVisibleItemIndex2;
                        ref$ObjectRef.element = AnimationStateKt.copy$default((AnimationState) ref$ObjectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                        final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        animationState = (AnimationState) ref$ObjectRef.element;
                        boxFloat2 = Boxing.boxFloat(f5);
                        if (((Number) ((AnimationState) ref$ObjectRef.element).getVelocity()).floatValue() == 0.0f) {
                        }
                        if (i == 0) {
                        }
                        final int i62 = this.$index;
                        final LazyListState lazyListState2 = this.$this_doSmoothScrollToItem;
                        final int i72 = this.$scrollOffset;
                        final ScrollScope scrollScope62 = scrollScope2;
                        final Ref$BooleanRef ref$BooleanRef42 = ref$BooleanRef;
                        final float f82 = f4;
                        final Ref$IntRef ref$IntRef42 = ref$IntRef;
                        final Ref$ObjectRef<AnimationState<Float, AnimationVector1D>> ref$ObjectRef42 = ref$ObjectRef;
                        function12 = new Function1() { // from class: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.2
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
                                LazyListItemInfo doSmoothScrollToItem$getTargetItem2;
                                float coerceAtLeast;
                                LazyListItemInfo doSmoothScrollToItem$getTargetItem3;
                                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                                doSmoothScrollToItem$getTargetItem2 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(lazyListState2, i62);
                                if (doSmoothScrollToItem$getTargetItem2 == null) {
                                    if (f5 > 0.0f) {
                                        coerceAtLeast = RangesKt.coerceAtMost(((Number) animateTo.getValue()).floatValue(), f5);
                                    } else {
                                        coerceAtLeast = RangesKt.coerceAtLeast(((Number) animateTo.getValue()).floatValue(), f5);
                                    }
                                    float f92 = coerceAtLeast - ref$FloatRef2.element;
                                    float scrollBy = scrollScope62.scrollBy(f92);
                                    doSmoothScrollToItem$getTargetItem3 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(lazyListState2, i62);
                                    if (doSmoothScrollToItem$getTargetItem3 == null && !LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z3, lazyListState2, i62, i72)) {
                                        if (f92 != scrollBy) {
                                            animateTo.cancelAnimation();
                                            ref$BooleanRef42.element = false;
                                            return;
                                        }
                                        ref$FloatRef2.element += f92;
                                        if (z3) {
                                            if (((Number) animateTo.getValue()).floatValue() > f82) {
                                                animateTo.cancelAnimation();
                                            }
                                        } else if (((Number) animateTo.getValue()).floatValue() < (-f82)) {
                                            animateTo.cancelAnimation();
                                        }
                                        if (z3) {
                                            if (ref$IntRef42.element >= 2 && i62 - ((LazyListItemInfo) CollectionsKt.last(lazyListState2.getLayoutInfo().getVisibleItemsInfo())).getIndex() > 100) {
                                                lazyListState2.snapToItemIndexInternal$foundation_release(i62 - 100, 0);
                                            }
                                        } else if (ref$IntRef42.element >= 2) {
                                            int index = ((LazyListItemInfo) CollectionsKt.first(lazyListState2.getLayoutInfo().getVisibleItemsInfo())).getIndex();
                                            int i8 = i62;
                                            if (index - i8 > 100) {
                                                lazyListState2.snapToItemIndexInternal$foundation_release(i8 + 100, 0);
                                            }
                                        }
                                    }
                                    doSmoothScrollToItem$getTargetItem2 = doSmoothScrollToItem$getTargetItem3;
                                }
                                if (!LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(z3, lazyListState2, i62, i72)) {
                                    if (doSmoothScrollToItem$getTargetItem2 != null) {
                                        throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem2, ref$ObjectRef42.element);
                                    }
                                } else {
                                    lazyListState2.snapToItemIndexInternal$foundation_release(i62, i72);
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
                        final float offset = e.getItem().getOffset() + this.$scrollOffset;
                        final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                        boxFloat = Boxing.boxFloat(offset);
                        z = ((Number) copy$default.getVelocity()).floatValue() != 0.0f;
                        function1 = new Function1() { // from class: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.4
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
                                float f11 = offset;
                                float f12 = 0.0f;
                                if (f11 > 0.0f) {
                                    f12 = RangesKt.coerceAtMost(((Number) animateTo.getValue()).floatValue(), offset);
                                } else if (f11 < 0.0f) {
                                    f12 = RangesKt.coerceAtLeast(((Number) animateTo.getValue()).floatValue(), offset);
                                }
                                float f13 = f12 - ref$FloatRef3.element;
                                if (f13 != scrollScope.scrollBy(f13) || f12 != ((Number) animateTo.getValue()).floatValue()) {
                                    animateTo.cancelAnimation();
                                }
                                ref$FloatRef3.element += f13;
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
                    Ref$ObjectRef ref$ObjectRef52 = ref$ObjectRef;
                    Ref$IntRef ref$IntRef52 = ref$IntRef;
                    float f92 = f3;
                    float f102 = f4;
                }
            } catch (ItemFoundInScroll e3) {
                e = e3;
                scrollScope3 = scrollScope2;
            }
        } catch (ItemFoundInScroll e4) {
            e = e4;
            scrollScope = scrollScope2;
            copy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
            final float offset2 = e.getItem().getOffset() + this.$scrollOffset;
            final Ref$FloatRef ref$FloatRef32 = new Ref$FloatRef();
            boxFloat = Boxing.boxFloat(offset2);
            if (((Number) copy$default.getVelocity()).floatValue() != 0.0f) {
            }
            function1 = new Function1() { // from class: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3.4
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
                    float f11 = offset2;
                    float f12 = 0.0f;
                    if (f11 > 0.0f) {
                        f12 = RangesKt.coerceAtMost(((Number) animateTo.getValue()).floatValue(), offset2);
                    } else if (f11 < 0.0f) {
                        f12 = RangesKt.coerceAtLeast(((Number) animateTo.getValue()).floatValue(), offset2);
                    }
                    float f13 = f12 - ref$FloatRef32.element;
                    if (f13 != scrollScope.scrollBy(f13) || f12 != ((Number) animateTo.getValue()).floatValue()) {
                        animateTo.cancelAnimation();
                    }
                    ref$FloatRef32.element += f13;
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
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyListState lazyListState, int i, int i2) {
        if (z) {
            if (lazyListState.getFirstVisibleItemIndex() <= i && (lazyListState.getFirstVisibleItemIndex() != i || lazyListState.getFirstVisibleItemScrollOffset() <= i2)) {
                return false;
            }
        } else if (lazyListState.getFirstVisibleItemIndex() >= i && (lazyListState.getFirstVisibleItemIndex() != i || lazyListState.getFirstVisibleItemScrollOffset() >= i2)) {
            return false;
        }
        return true;
    }
}
