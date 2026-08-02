package papa.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.Recomposer;

/* loaded from: classes3.dex */
public final class ViewTreeObserversKt$onViewTreeObserverReady$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object $block;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ View $this_onViewTreeObserverReady;

    public ViewTreeObserversKt$onViewTreeObserverReady$1(ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3, View view) {
        this.$block = viewTreeObservers$$ExternalSyntheticLambda3;
        this.$this_onViewTreeObserverReady = view;
    }

    private final void onViewAttachedToWindow$androidx$compose$ui$platform$WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$r8$classId) {
            case 0:
                view.getClass();
                ViewTreeObservers$$ExternalSyntheticLambda3 viewTreeObservers$$ExternalSyntheticLambda3 = (ViewTreeObservers$$ExternalSyntheticLambda3) this.$block;
                View view2 = this.$this_onViewTreeObserverReady;
                ViewTreeObserver viewTreeObserver = view2.getRootView().getViewTreeObserver();
                viewTreeObserver.getClass();
                viewTreeObservers$$ExternalSyntheticLambda3.invoke(viewTreeObserver);
                view2.getRootView().removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$r8$classId) {
            case 0:
                view.getClass();
                break;
            default:
                this.$this_onViewTreeObserverReady.removeOnAttachStateChangeListener(this);
                ((Recomposer) this.$block).cancel();
                break;
        }
    }

    public ViewTreeObserversKt$onViewTreeObserverReady$1(View view, Recomposer recomposer) {
        this.$this_onViewTreeObserverReady = view;
        this.$block = recomposer;
    }
}
