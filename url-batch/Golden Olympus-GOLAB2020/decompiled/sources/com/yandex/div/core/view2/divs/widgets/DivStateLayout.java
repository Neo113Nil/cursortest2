package com.yandex.div.core.view2.divs.widgets;

import O1.C0860i3;
import O1.Z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1315s;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y.AbstractC3521a;

@Metadata
/* loaded from: classes2.dex */
public final class DivStateLayout extends FrameContainerLayout implements DivHolderView<Z.o> {
    private final /* synthetic */ DivHolderViewMixin<Z.o> $$delegate_0;

    @Nullable
    private Z activeStateDiv;

    @NotNull
    private final C1315s gestureDetector;

    @Nullable
    private DivStatePath path;

    @NotNull
    private final SwipeListener swipeListener;

    @Nullable
    private Function0<Unit> swipeOutCallback;

    @Nullable
    private Function1<? super String, Unit> variableUpdater;

    @Metadata
    private final class SwipeListener extends GestureDetector.SimpleOnGestureListener {
        public SwipeListener() {
        }

        private final boolean canScroll(View view, float f4, float f5, int i4) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                    View child = viewGroup.getChildAt(childCount);
                    if (f4 >= child.getLeft() && f4 < child.getRight() && f5 >= child.getTop() && f5 < child.getBottom()) {
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        if (canScroll(child, f4 - child.getLeft(), f5 - child.getTop(), i4)) {
                            return true;
                        }
                    }
                }
            }
            return view.canScrollHorizontally(i4);
        }

        private final View getView() {
            if (DivStateLayout.this.getChildCount() > 0) {
                return DivStateLayout.this.getChildAt(0);
            }
            return null;
        }

        public final void finishSwipe() {
            float abs;
            AnimatorListenerAdapter animatorListenerAdapter;
            float f4;
            View view = getView();
            if (view == null) {
                return;
            }
            if (Math.abs(view.getTranslationX()) > view.getWidth() / 2) {
                abs = (Math.abs(view.getWidth() - view.getTranslationX()) * 300.0f) / view.getWidth();
                f4 = Math.signum(view.getTranslationX()) * view.getWidth();
                final DivStateLayout divStateLayout = DivStateLayout.this;
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener$finishSwipe$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Function0<Unit> swipeOutCallback = DivStateLayout.this.getSwipeOutCallback();
                        if (swipeOutCallback != null) {
                            swipeOutCallback.invoke();
                        }
                    }
                };
            } else {
                abs = (Math.abs(view.getTranslationX()) * 300.0f) / view.getWidth();
                animatorListenerAdapter = null;
                f4 = 0.0f;
            }
            view.animate().cancel();
            view.animate().setDuration((long) AbstractC3521a.a(abs, 0.0f, 300.0f)).translationX(f4).setListener(animatorListenerAdapter).start();
        }

        public final boolean getInScroll() {
            View view = getView();
            return !((view != null ? view.getTranslationX() : 0.0f) == 0.0f);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NotNull MotionEvent e4) {
            Intrinsics.checkNotNullParameter(e4, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e22, float f4, float f5) {
            Intrinsics.checkNotNullParameter(e22, "e2");
            View view = getView();
            if (view == null || motionEvent == null) {
                return false;
            }
            int signum = (int) Math.signum(f4);
            if (view.getTranslationX() == 0.0f && Math.abs(f4) > 2 * Math.abs(f5) && canScroll(view, motionEvent.getX(), motionEvent.getY(), signum)) {
                return false;
            }
            view.setTranslationX(AbstractC3521a.a(view.getTranslationX() - f4, -view.getWidth(), view.getWidth()));
            return !(view.getTranslationX() == 0.0f);
        }
    }

    public /* synthetic */ DivStateLayout(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i4) {
        if (super.canScrollHorizontally(i4)) {
            return true;
        }
        if (getChildCount() < 1 || this.swipeOutCallback == null) {
            return super.canScrollHorizontally(i4);
        }
        View childAt = getChildAt(0);
        return i4 < 0 ? childAt.getTranslationX() <= ((float) childAt.getWidth()) : (-childAt.getTranslationX()) <= ((float) childAt.getWidth());
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View view, long j4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    @Nullable
    public final Z getActiveStateDiv$div_release() {
        return this.activeStateDiv;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Z.o getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Nullable
    public final DivStatePath getPath() {
        return this.path;
    }

    @Nullable
    public final String getStateId() {
        DivStatePath divStatePath = this.path;
        if (divStatePath != null) {
            return divStatePath.getLastStateId();
        }
        return null;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Nullable
    public final Function0<Unit> getSwipeOutCallback() {
        return this.swipeOutCallback;
    }

    @Nullable
    public final Function1<String, Unit> getVariableUpdater() {
        return this.variableUpdater;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i4, int i5) {
        this.$$delegate_0.onBoundsChanged(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.gestureDetector.a(event);
        requestDisallowInterceptTouchEvent(this.swipeListener.getInScroll());
        if (this.swipeListener.getInScroll()) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        onBoundsChanged(i4, i5);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(event);
        }
        if (event.getAction() == 1 || event.getAction() == 3) {
            this.swipeListener.finishSwipe();
        }
        if (this.gestureDetector.a(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public final void setActiveStateDiv$div_release(@Nullable Z z4) {
        this.activeStateDiv = z4;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable C0860i3 c0860i3, @NotNull View view) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.setBorder(bindingContext, c0860i3, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Z.o oVar) {
        this.$$delegate_0.setDiv(oVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z4) {
        this.$$delegate_0.setNeedClipping(z4);
    }

    public final void setPath(@Nullable DivStatePath divStatePath) {
        this.path = divStatePath;
    }

    public final void setSwipeOutCallback(@Nullable Function0<Unit> function0) {
        this.swipeOutCallback = function0;
    }

    public final void setVariableUpdater(@Nullable Function1<? super String, Unit> function1) {
        this.variableUpdater = function1;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.transitionStarted(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivStateLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new DivHolderViewMixin<>();
        SwipeListener swipeListener = new SwipeListener();
        this.swipeListener = swipeListener;
        this.gestureDetector = new C1315s(context, swipeListener, new Handler(Looper.getMainLooper()));
    }
}
