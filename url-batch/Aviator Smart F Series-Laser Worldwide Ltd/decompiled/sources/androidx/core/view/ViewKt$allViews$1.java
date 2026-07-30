package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@kotlin.coroutines.jvm.internal.d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {409, 411}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* loaded from: classes.dex */
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements f6.p {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(View view, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, cVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        kotlin.sequences.o oVar;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            oVar = (kotlin.sequences.o) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = oVar;
            this.label = 1;
            if (oVar.yield(view, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
                return y5.w.INSTANCE;
            }
            oVar = (kotlin.sequences.o) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            kotlin.sequences.m descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (oVar.yieldAll(descendants, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return y5.w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(kotlin.sequences.o oVar, kotlin.coroutines.c cVar) {
        return ((ViewKt$allViews$1) create(oVar, cVar)).invokeSuspend(y5.w.INSTANCE);
    }
}
