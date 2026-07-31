package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazySemantics.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aA\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"lazyListSemantics", "Landroidx/compose/ui/Modifier;", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "reverseScrolling", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/CoroutineScope;ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LazySemanticsKt {
    public static final Modifier lazyListSemantics(Modifier modifier, final LazyListItemProvider itemProvider, final LazyListState state, final CoroutineScope coroutineScope, final boolean z, boolean z2, boolean z3, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        composer.startReplaceableGroup(-1728067365);
        Object[] objArr = {itemProvider, state, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (int i2 = 0; i2 < 5; i2++) {
            z4 |= composer.changed(objArr[i2]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Integer invoke(@NotNull Object needle) {
                    Intrinsics.checkNotNullParameter(needle, "needle");
                    LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 = new LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1(LazyListItemProvider.this);
                    int itemCount = LazyListItemProvider.this.getItemCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= itemCount) {
                            i3 = -1;
                            break;
                        }
                        if (Intrinsics.areEqual(lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1.invoke(Integer.valueOf(i3)), needle)) {
                            break;
                        }
                        i3++;
                    }
                    return Integer.valueOf(i3);
                }
            };
            final ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new Function0() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Float mo4828invoke() {
                    return Float.valueOf(LazyListState.this.getFirstVisibleItemIndex() + (LazyListState.this.getFirstVisibleItemScrollOffset() / 100000.0f));
                }
            }, new Function0() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Float mo4828invoke() {
                    float firstVisibleItemIndex;
                    float firstVisibleItemScrollOffset;
                    if (LazyListState.this.getCanScrollForward()) {
                        firstVisibleItemIndex = itemProvider.getItemCount();
                        firstVisibleItemScrollOffset = 1.0f;
                    } else {
                        firstVisibleItemIndex = LazyListState.this.getFirstVisibleItemIndex();
                        firstVisibleItemScrollOffset = LazyListState.this.getFirstVisibleItemScrollOffset() / 100000.0f;
                    }
                    return Float.valueOf(firstVisibleItemIndex + firstVisibleItemScrollOffset);
                }
            }, z2);
            Function2 function2 = z3 ? new Function2() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }

                @NotNull
                public final Boolean invoke(float f, float f2) {
                    if (z) {
                        f = f2;
                    }
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(state, f, null), 3, null);
                    return Boolean.TRUE;
                }

                /* compiled from: LazySemantics.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1", f = "LazySemantics.kt", l = {95}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollByAction$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                    final /* synthetic */ float $delta;
                    final /* synthetic */ LazyListState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(LazyListState lazyListState, float f, Continuation continuation) {
                        super(2, continuation);
                        this.$state = lazyListState;
                        this.$delta = f;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass1(this.$state, this.$delta, continuation);
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
                            LazyListState lazyListState = this.$state;
                            float f = this.$delta;
                            this.label = 1;
                            if (ScrollExtensionsKt.animateScrollBy$default(lazyListState, f, null, this, 2, null) == coroutine_suspended) {
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
            } : null;
            Function1 function12 = z3 ? new Function1() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                @NotNull
                public final Boolean invoke(int i3) {
                    boolean z5 = i3 >= 0 && i3 < LazyListState.this.getLayoutInfo().getTotalItemsCount();
                    LazyListState lazyListState = LazyListState.this;
                    if (z5) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(lazyListState, i3, null), 3, null);
                        return Boolean.TRUE;
                    }
                    throw new IllegalArgumentException(("Can't scroll to index " + i3 + ", it is out of bounds [0, " + lazyListState.getLayoutInfo().getTotalItemsCount() + ')').toString());
                }

                /* compiled from: LazySemantics.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1$2", f = "LazySemantics.kt", l = {111}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$scrollToIndexAction$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2 {
                    final /* synthetic */ int $index;
                    final /* synthetic */ LazyListState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(LazyListState lazyListState, int i, Continuation continuation) {
                        super(2, continuation);
                        this.$state = lazyListState;
                        this.$index = i;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                        return new AnonymousClass2(this.$state, this.$index, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            LazyListState lazyListState = this.$state;
                            int i2 = this.$index;
                            this.label = 1;
                            if (LazyListState.scrollToItem$default(lazyListState, i2, 0, this, 2, null) == coroutine_suspended) {
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
            } : null;
            final CollectionInfo collectionInfo = new CollectionInfo(z ? -1 : 1, z ? 1 : -1);
            final Function2 function22 = function2;
            final Function1 function13 = function12;
            rememberedValue = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$lazyListSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    SemanticsPropertiesKt.indexForKey(semantics, Function1.this);
                    if (z) {
                        SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
                    } else {
                        SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
                    }
                    Function2 function23 = function22;
                    if (function23 != null) {
                        SemanticsPropertiesKt.scrollBy$default(semantics, null, function23, 1, null);
                    }
                    Function1 function14 = function13;
                    if (function14 != null) {
                        SemanticsPropertiesKt.scrollToIndex$default(semantics, null, function14, 1, null);
                    }
                    SemanticsPropertiesKt.setCollectionInfo(semantics, collectionInfo);
                }
            }, 1, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then((Modifier) rememberedValue);
        composer.endReplaceableGroup();
        return then;
    }
}
