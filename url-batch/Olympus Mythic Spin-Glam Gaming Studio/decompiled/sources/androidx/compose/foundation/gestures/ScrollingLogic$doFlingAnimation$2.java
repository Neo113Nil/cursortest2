package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {412}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref$LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
        this.$result = ref$LongRef;
        this.$available = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, continuation);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ScrollingLogic scrollingLogic;
        Ref$LongRef ref$LongRef;
        ScrollingLogic scrollingLogic2;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            final Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return Offset.m1288boximpl(m287invokeMKHz9U(((Offset) obj2).getPackedValue()));
                }

                /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
                public final long m287invokeMKHz9U(long j2) {
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return Offset.m1301minusMKHz9U(j2, ScrollingLogic.this.m281reverseIfNeededMKHz9U(scrollingLogic4.m278dispatchScrollf0eR0lY(scrollScope, scrollingLogic4.m281reverseIfNeededMKHz9U(j2), null, NestedScrollSource.INSTANCE.m1832getFlingWNlRxjI())));
                }
            };
            final ScrollingLogic scrollingLogic4 = this.this$0;
            ScrollScope scrollScope2 = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float pixels) {
                    ScrollingLogic scrollingLogic5 = ScrollingLogic.this;
                    return scrollingLogic5.m283toFloatk4lQ0M(((Offset) function1.invoke(Offset.m1288boximpl(scrollingLogic5.m284toOffsettuRUvjQ(pixels)))).getPackedValue());
                }
            };
            scrollingLogic = this.this$0;
            Ref$LongRef ref$LongRef2 = this.$result;
            long j2 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.getFlingBehavior();
            long j3 = ref$LongRef2.element;
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m282toFloatTH1AsA0(j2));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = ref$LongRef2;
            this.J$0 = j3;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope2, reverseIfNeeded, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ref$LongRef = ref$LongRef2;
            scrollingLogic2 = scrollingLogic;
            j = j3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            ref$LongRef = (Ref$LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ref$LongRef.element = scrollingLogic.m286updateQWom1Mo(j, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return Unit.INSTANCE;
    }
}
