package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

/* compiled from: ContextAware.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "Landroid/content/Context;", "context", "", "onContextAvailable", "(Landroid/content/Context;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ CancellableContinuation $co;
    final /* synthetic */ Function1 $onContextAvailable;

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        CancellableContinuation cancellableContinuation = this.$co;
        Function1 function1 = this.$onContextAvailable;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(function1.invoke(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        cancellableContinuation.resumeWith(m8023constructorimpl);
    }
}
