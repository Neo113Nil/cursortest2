package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: PipHintTracker.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ViewHierarchyConstants.HINT_KEY, "Landroid/graphics/Rect;", "emit", "(Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PipHintTrackerKt$trackPipAnimationHintView$2<T> implements FlowCollector {
    final /* synthetic */ Activity $this_trackPipAnimationHintView;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Rect rect, Continuation continuation) {
        Api26Impl.INSTANCE.setPipParamsSourceRectHint(this.$this_trackPipAnimationHintView, rect);
        return Unit.INSTANCE;
    }
}
