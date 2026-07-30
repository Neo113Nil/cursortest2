package com.yanzhenjie.recyclerview.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import cn.hutool.core.convert.impl.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class StickyNestedScrollView extends NestedScrollView {
    private static final int DEFAULT_SHADOW_HEIGHT = 10;
    public static final String FLAG_HASTRANSPARENCY = "-hastransparency";
    public static final String FLAG_NONCONSTANT = "-nonconstant";
    public static final String STICKY_TAG = "sticky";
    private boolean clipToPaddingHasBeenSet;
    private boolean clippingToPadding;
    private View currentlyStickingView;
    private boolean hasNotDoneActionDown;
    private final Runnable invalidateRunnable;
    private List<b> mOnViewStickyListeners;
    private Drawable mShadowDrawable;
    private int mShadowHeight;
    private boolean redirectTouchesToStickyView;
    private int stickyViewLeftOffset;
    private float stickyViewTopOffset;
    private ArrayList<View> stickyViews;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (StickyNestedScrollView.this.currentlyStickingView != null) {
                StickyNestedScrollView stickyNestedScrollView = StickyNestedScrollView.this;
                int leftForViewRelativeOnlyChild = stickyNestedScrollView.getLeftForViewRelativeOnlyChild(stickyNestedScrollView.currentlyStickingView);
                StickyNestedScrollView stickyNestedScrollView2 = StickyNestedScrollView.this;
                int bottomForViewRelativeOnlyChild = stickyNestedScrollView2.getBottomForViewRelativeOnlyChild(stickyNestedScrollView2.currentlyStickingView);
                StickyNestedScrollView stickyNestedScrollView3 = StickyNestedScrollView.this;
                StickyNestedScrollView.this.invalidate(leftForViewRelativeOnlyChild, bottomForViewRelativeOnlyChild, stickyNestedScrollView3.getRightForViewRelativeOnlyChild(stickyNestedScrollView3.currentlyStickingView), (int) (StickyNestedScrollView.this.getScrollY() + StickyNestedScrollView.this.currentlyStickingView.getHeight() + StickyNestedScrollView.this.stickyViewTopOffset));
            }
            StickyNestedScrollView.this.postDelayed(this, 16L);
        }
    }

    public interface b {
    }

    public StickyNestedScrollView(Context context) {
        this(context, null);
    }

    private boolean detainStickyView(View view) {
        if (!getStringTagForView(view).contains(STICKY_TAG)) {
            return false;
        }
        this.stickyViews.add(view);
        return true;
    }

    private void doTheStickyThing() {
        float min;
        Iterator<View> it = this.stickyViews.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            int topForViewRelativeOnlyChild = (getTopForViewRelativeOnlyChild(next) - getScrollY()) + (this.clippingToPadding ? 0 : getPaddingTop());
            if (topForViewRelativeOnlyChild <= 0) {
                if (view != null) {
                    if (topForViewRelativeOnlyChild > (getTopForViewRelativeOnlyChild(view) - getScrollY()) + (this.clippingToPadding ? 0 : getPaddingTop())) {
                    }
                }
                view = next;
            } else {
                if (view2 != null) {
                    if (topForViewRelativeOnlyChild < (getTopForViewRelativeOnlyChild(view2) - getScrollY()) + (this.clippingToPadding ? 0 : getPaddingTop())) {
                    }
                }
                view2 = next;
            }
        }
        if (view == null) {
            if (this.currentlyStickingView != null) {
                List<b> list = this.mOnViewStickyListeners;
                if (list != null) {
                    Iterator<b> it2 = list.iterator();
                    if (it2.hasNext()) {
                        s.a(it2.next());
                        throw null;
                    }
                }
                stopStickingCurrentlyStickingView();
                return;
            }
            return;
        }
        if (view2 == null) {
            min = 0.0f;
        } else {
            min = Math.min(0, ((getTopForViewRelativeOnlyChild(view2) - getScrollY()) + (this.clippingToPadding ? 0 : getPaddingTop())) - view.getHeight());
        }
        this.stickyViewTopOffset = min;
        View view3 = this.currentlyStickingView;
        if (view != view3) {
            if (view3 != null) {
                List<b> list2 = this.mOnViewStickyListeners;
                if (list2 != null) {
                    Iterator<b> it3 = list2.iterator();
                    if (it3.hasNext()) {
                        s.a(it3.next());
                        throw null;
                    }
                }
                stopStickingCurrentlyStickingView();
            }
            this.stickyViewLeftOffset = getLeftForViewRelativeOnlyChild(view);
            startStickingView(view);
            List<b> list3 = this.mOnViewStickyListeners;
            if (list3 != null) {
                Iterator<b> it4 = list3.iterator();
                if (it4.hasNext()) {
                    s.a(it4.next());
                    throw null;
                }
            }
        }
    }

    private void findStickyViews(View view) {
        if (detainStickyView(view) || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
            findStickyViews(viewGroup.getChildAt(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomForViewRelativeOnlyChild(View view) {
        int bottom = view.getBottom();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            bottom += view.getBottom();
        }
        return bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftForViewRelativeOnlyChild(View view) {
        int left = view.getLeft();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightForViewRelativeOnlyChild(View view) {
        int right = view.getRight();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    private String getStringTagForView(View view) {
        return String.valueOf(view.getTag());
    }

    private int getTopForViewRelativeOnlyChild(View view) {
        int top = view.getTop();
        while (view.getParent() != null && view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    private void hideView(View view) {
        view.setAlpha(0.0f);
    }

    private void notifyHierarchyChanged() {
        if (this.currentlyStickingView != null) {
            stopStickingCurrentlyStickingView();
        }
        this.stickyViews.clear();
        findStickyViews(getChildAt(0));
        doTheStickyThing();
        invalidate();
    }

    private void showView(View view) {
        view.setAlpha(1.0f);
    }

    private void startStickingView(View view) {
        this.currentlyStickingView = view;
        if (view != null) {
            if (getStringTagForView(view).contains(FLAG_HASTRANSPARENCY)) {
                hideView(this.currentlyStickingView);
            }
            if (getStringTagForView(this.currentlyStickingView).contains(FLAG_NONCONSTANT)) {
                post(this.invalidateRunnable);
            }
        }
    }

    private void stopStickingCurrentlyStickingView() {
        if (getStringTagForView(this.currentlyStickingView).contains(FLAG_HASTRANSPARENCY)) {
            showView(this.currentlyStickingView);
        }
        this.currentlyStickingView = null;
        removeCallbacks(this.invalidateRunnable);
    }

    public void addOnViewStickyListener(b bVar) {
        if (this.mOnViewStickyListeners == null) {
            this.mOnViewStickyListeners = new ArrayList();
        }
        this.mOnViewStickyListeners.add(bVar);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        findStickyViews(view);
    }

    public void clearOnViewStickyListener() {
        List<b> list = this.mOnViewStickyListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.currentlyStickingView != null) {
            canvas.save();
            canvas.translate(getPaddingLeft() + this.stickyViewLeftOffset, getScrollY() + this.stickyViewTopOffset + (this.clippingToPadding ? getPaddingTop() : 0));
            canvas.clipRect(0.0f, this.clippingToPadding ? -this.stickyViewTopOffset : 0.0f, getWidth() - this.stickyViewLeftOffset, this.currentlyStickingView.getHeight() + this.mShadowHeight + 1);
            if (this.mShadowDrawable != null) {
                this.mShadowDrawable.setBounds(0, this.currentlyStickingView.getHeight(), this.currentlyStickingView.getWidth(), this.currentlyStickingView.getHeight() + this.mShadowHeight);
                this.mShadowDrawable.draw(canvas);
            }
            canvas.clipRect(0.0f, this.clippingToPadding ? -this.stickyViewTopOffset : 0.0f, getWidth(), this.currentlyStickingView.getHeight());
            if (getStringTagForView(this.currentlyStickingView).contains(FLAG_HASTRANSPARENCY)) {
                showView(this.currentlyStickingView);
                this.currentlyStickingView.draw(canvas);
                hideView(this.currentlyStickingView);
            } else {
                this.currentlyStickingView.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.redirectTouchesToStickyView = true;
        }
        if (this.redirectTouchesToStickyView) {
            boolean z7 = this.currentlyStickingView != null;
            this.redirectTouchesToStickyView = z7;
            if (z7) {
                this.redirectTouchesToStickyView = motionEvent.getY() <= ((float) this.currentlyStickingView.getHeight()) + this.stickyViewTopOffset && motionEvent.getX() >= ((float) getLeftForViewRelativeOnlyChild(this.currentlyStickingView)) && motionEvent.getX() <= ((float) getRightForViewRelativeOnlyChild(this.currentlyStickingView));
            }
        } else if (this.currentlyStickingView == null) {
            this.redirectTouchesToStickyView = false;
        }
        if (this.redirectTouchesToStickyView) {
            motionEvent.offsetLocation(0.0f, ((getScrollY() + this.stickyViewTopOffset) - getTopForViewRelativeOnlyChild(this.currentlyStickingView)) * (-1.0f));
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void notifyStickyAttributeChanged() {
        notifyHierarchyChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.invalidateRunnable);
        super.onDetachedFromWindow();
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (!this.clipToPaddingHasBeenSet) {
            this.clippingToPadding = true;
        }
        notifyHierarchyChanged();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected void onScrollChanged(int i8, int i9, int i10, int i11) {
        super.onScrollChanged(i8, i9, i10, i11);
        doTheStickyThing();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.redirectTouchesToStickyView) {
            motionEvent.offsetLocation(0.0f, (getScrollY() + this.stickyViewTopOffset) - getTopForViewRelativeOnlyChild(this.currentlyStickingView));
        }
        if (motionEvent.getAction() == 0) {
            this.hasNotDoneActionDown = false;
        }
        if (this.hasNotDoneActionDown) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(0);
            super.onTouchEvent(obtain);
            this.hasNotDoneActionDown = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.hasNotDoneActionDown = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnViewStickyListener(b bVar) {
        List<b> list = this.mOnViewStickyListeners;
        if (list != null) {
            list.remove(bVar);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z7) {
        super.setClipToPadding(z7);
        this.clippingToPadding = z7;
        this.clipToPaddingHasBeenSet = true;
    }

    public void setShadowDrawable(Drawable drawable) {
        this.mShadowDrawable = drawable;
    }

    public void setShadowHeight(int i8) {
        this.mShadowHeight = i8;
    }

    public void setup() {
        this.stickyViews = new ArrayList<>();
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.scrollViewStyle);
    }

    public StickyNestedScrollView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.invalidateRunnable = new a();
        this.mShadowHeight = 10;
        this.hasNotDoneActionDown = true;
        setup();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i8) {
        super.addView(view, i8);
        findStickyViews(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        findStickyViews(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, int i9) {
        super.addView(view, i8, i9);
        findStickyViews(view);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        findStickyViews(view);
    }
}
