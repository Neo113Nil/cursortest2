package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class u extends RecyclerView.s {
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.u mScrollListener = new a();

    class a extends RecyclerView.u {

        /* renamed from: a, reason: collision with root package name */
        boolean f13176a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0 && this.f13176a) {
                this.f13176a = false;
                u.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
            if (i4 == 0 && i5 == 0) {
                return;
            }
            this.f13176a = true;
        }
    }

    private void a() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void b() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean c(RecyclerView.p pVar, int i4, int i5) {
        RecyclerView.z createScroller;
        int findTargetSnapPosition;
        if (!(pVar instanceof RecyclerView.z.b) || (createScroller = createScroller(pVar)) == null || (findTargetSnapPosition = findTargetSnapPosition(pVar, i4, i5)) == -1) {
            return false;
        }
        createScroller.setTargetPosition(findTargetSnapPosition);
        pVar.startSmoothScroll(createScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            a();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            b();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.z createScroller(RecyclerView.p pVar);

    public abstract View findSnapView(RecyclerView.p pVar);

    public abstract int findTargetSnapPosition(RecyclerView.p pVar, int i4, int i5);

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean onFling(int i4, int i5) {
        RecyclerView.p layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i5) > minFlingVelocity || Math.abs(i4) > minFlingVelocity) && c(layoutManager, i4, i5);
    }

    void snapToTargetExistingView() {
        RecyclerView.p layoutManager;
        View findSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (findSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
        int i4 = calculateDistanceToFinalSnap[0];
        if (i4 == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i4, calculateDistanceToFinalSnap[1]);
    }
}
