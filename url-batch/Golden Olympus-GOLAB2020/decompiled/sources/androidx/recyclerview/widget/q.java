package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class q extends u {
    private p mHorizontalHelper;
    private p mVerticalHelper;

    class a extends l {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.l
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.l
        protected int calculateTimeForScrolling(int i4) {
            return Math.min(100, super.calculateTimeForScrolling(i4));
        }

        @Override // androidx.recyclerview.widget.l, androidx.recyclerview.widget.RecyclerView.z
        protected void onTargetFound(View view, RecyclerView.A a4, RecyclerView.z.a aVar) {
            q qVar = q.this;
            int[] calculateDistanceToFinalSnap = qVar.calculateDistanceToFinalSnap(qVar.mRecyclerView.getLayoutManager(), view);
            int i4 = calculateDistanceToFinalSnap[0];
            int i5 = calculateDistanceToFinalSnap[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i4), Math.abs(i5)));
            if (calculateTimeForDeceleration > 0) {
                aVar.d(i4, i5, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private int d(View view, p pVar) {
        return (pVar.g(view) + (pVar.e(view) / 2)) - (pVar.n() + (pVar.o() / 2));
    }

    private View e(RecyclerView.p pVar, p pVar2) {
        int childCount = pVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int n4 = pVar2.n() + (pVar2.o() / 2);
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = pVar.getChildAt(i5);
            int abs = Math.abs((pVar2.g(childAt) + (pVar2.e(childAt) / 2)) - n4);
            if (abs < i4) {
                view = childAt;
                i4 = abs;
            }
        }
        return view;
    }

    private p f(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return getVerticalHelper(pVar);
        }
        if (pVar.canScrollHorizontally()) {
            return getHorizontalHelper(pVar);
        }
        return null;
    }

    private boolean g(RecyclerView.p pVar, int i4, int i5) {
        return pVar.canScrollHorizontally() ? i4 > 0 : i5 > 0;
    }

    private p getHorizontalHelper(RecyclerView.p pVar) {
        p pVar2 = this.mHorizontalHelper;
        if (pVar2 == null || pVar2.f13171a != pVar) {
            this.mHorizontalHelper = p.a(pVar);
        }
        return this.mHorizontalHelper;
    }

    private p getVerticalHelper(RecyclerView.p pVar) {
        p pVar2 = this.mVerticalHelper;
        if (pVar2 == null || pVar2.f13171a != pVar) {
            this.mVerticalHelper = p.c(pVar);
        }
        return this.mVerticalHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean h(RecyclerView.p pVar) {
        PointF computeScrollVectorForPosition;
        int itemCount = pVar.getItemCount();
        if (!(pVar instanceof RecyclerView.z.b) || (computeScrollVectorForPosition = ((RecyclerView.z.b) pVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.u
    public int[] calculateDistanceToFinalSnap(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.canScrollHorizontally()) {
            iArr[0] = d(view, getHorizontalHelper(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.canScrollVertically()) {
            iArr[1] = d(view, getVerticalHelper(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.u
    protected RecyclerView.z createScroller(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.z.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.u
    public View findSnapView(RecyclerView.p pVar) {
        if (pVar.canScrollVertically()) {
            return e(pVar, getVerticalHelper(pVar));
        }
        if (pVar.canScrollHorizontally()) {
            return e(pVar, getHorizontalHelper(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.u
    public int findTargetSnapPosition(RecyclerView.p pVar, int i4, int i5) {
        p f4;
        int itemCount = pVar.getItemCount();
        if (itemCount == 0 || (f4 = f(pVar)) == null) {
            return -1;
        }
        int childCount = pVar.getChildCount();
        View view = null;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = pVar.getChildAt(i8);
            if (childAt != null) {
                int d4 = d(childAt, f4);
                if (d4 <= 0 && d4 > i7) {
                    view2 = childAt;
                    i7 = d4;
                }
                if (d4 >= 0 && d4 < i6) {
                    view = childAt;
                    i6 = d4;
                }
            }
        }
        boolean g4 = g(pVar, i4, i5);
        if (g4 && view != null) {
            return pVar.getPosition(view);
        }
        if (!g4 && view2 != null) {
            return pVar.getPosition(view2);
        }
        if (g4) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = pVar.getPosition(view) + (h(pVar) == g4 ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
