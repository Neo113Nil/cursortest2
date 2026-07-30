package com.crrepa.band.my.training.goalsetting.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes3.dex */
public class PickerLayoutManager extends LinearLayoutManager implements View.OnTouchListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private View centerView;
    private boolean isAlpha;
    private final SnapHelper linearSnapHelper;
    private a onSelectedViewListener;
    private final int orientation;
    private RecyclerView recyclerView;
    private float scale;

    public interface a {
        void onScrollMidView(View view, boolean z7);

        void onSelectedView(View view, int i8, int i9);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PickerLayoutManager(RecyclerView recyclerView, int i8, boolean z7, float f8, boolean z8, int i9) {
        super(recyclerView.getContext(), i8, z7);
        this.scale = 0.5f;
        this.isAlpha = true;
        this.linearSnapHelper = new PickerSnapHelper();
        this.orientation = i8;
        this.recyclerView = recyclerView;
        recyclerView.setLayoutManager(this);
        this.recyclerView.setOnTouchListener(this);
        this.isAlpha = z8;
        this.scale = f8;
    }

    public static PickerLayoutManager create(RecyclerView recyclerView) {
        return new PickerLayoutManager(recyclerView, 1, false, 1.0f, false, 0);
    }

    private void scaleHorizontalChildView() {
        float width = getWidth() / 2.0f;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) getChildAt(i8);
            if (viewGroup != null) {
                float min = ((((1.0f - this.scale) * (-1.0f)) * Math.min(width, Math.abs(width - ((getDecoratedLeft(viewGroup) + getDecoratedRight(viewGroup)) / 2.0f)))) / width) + 1.0f;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (childAt.getTag() == null || !"noScale".equals(childAt.getTag())) {
                        childAt.setScaleX(min);
                        childAt.setScaleY(min);
                    }
                }
                if (this.isAlpha) {
                    viewGroup.setAlpha(min);
                }
            }
        }
    }

    private void scaleVerticalChildView() {
        this.centerView = this.linearSnapHelper.findSnapView(this);
        float height = getHeight() / 2.0f;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            ViewGroup viewGroup = (ViewGroup) getChildAt(i8);
            if (viewGroup != null) {
                float min = ((((1.0f - this.scale) * (-1.0f)) * Math.min(height, Math.abs(height - ((getDecoratedTop(viewGroup) + getDecoratedBottom(viewGroup)) / 2.0f)))) / height) + 1.0f;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (childAt.getTag() == null || !"noScale".equals(childAt.getTag())) {
                        childAt.setScaleX(min);
                        childAt.setScaleY(min);
                        if (viewGroup.equals(this.centerView)) {
                            float f8 = 1.3f * min;
                            childAt.setScaleX(f8);
                            childAt.setScaleY(f8);
                        }
                    }
                }
                if (viewGroup.equals(this.centerView)) {
                    if (this.isAlpha) {
                        viewGroup.setAlpha(1.0f);
                    }
                    this.onSelectedViewListener.onScrollMidView(viewGroup, true);
                } else {
                    if (this.isAlpha) {
                        viewGroup.setAlpha(min - 0.3f);
                    }
                    this.onSelectedViewListener.onScrollMidView(viewGroup, false);
                }
            }
        }
    }

    private void scrollTargetPos(View view) {
        RecyclerView.LayoutManager layoutManager;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = this.linearSnapHelper.calculateDistanceToFinalSnap(layoutManager, view);
        int i8 = calculateDistanceToFinalSnap[0];
        if (i8 == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.recyclerView.smoothScrollBy(i8, calculateDistanceToFinalSnap[1]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.linearSnapHelper.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        if (getItemCount() < 0 || state.isPreLayout()) {
            return;
        }
        int i8 = this.orientation;
        if (i8 == 0) {
            scaleHorizontalChildView();
        } else if (i8 == 1) {
            scaleVerticalChildView();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i8) {
        SnapHelper snapHelper;
        View findSnapView;
        super.onScrollStateChanged(i8);
        if (i8 != 0 || this.onSelectedViewListener == null || (snapHelper = this.linearSnapHelper) == null || (findSnapView = snapHelper.findSnapView(this)) == null) {
            return;
        }
        int position = getPosition(findSnapView);
        this.onSelectedViewListener.onSelectedView(findSnapView, position, position);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return false;
        }
        View findSnapView = this.linearSnapHelper.findSnapView(this);
        if (findSnapView.equals(this.centerView)) {
            return false;
        }
        scrollTargetPos(findSnapView);
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i8, RecyclerView.Recycler recycler, RecyclerView.State state) {
        scaleHorizontalChildView();
        return super.scrollHorizontallyBy(i8, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i8) {
        scrollToPositionWithOffset(i8, -o.dp2px(this.recyclerView.getContext(), 6.0f));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i8, RecyclerView.Recycler recycler, RecyclerView.State state) {
        scaleVerticalChildView();
        return super.scrollVerticallyBy(i8, recycler, state);
    }

    public void setOnSelectedViewListener(a aVar) {
        this.onSelectedViewListener = aVar;
    }
}
