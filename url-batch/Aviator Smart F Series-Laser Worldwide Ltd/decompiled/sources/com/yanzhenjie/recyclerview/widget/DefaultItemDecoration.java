package com.yanzhenjie.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes4.dex */
public class DefaultItemDecoration extends RecyclerView.ItemDecoration {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final b mDrawer;
    private final int mHeight;
    private final int mWidth;

    public DefaultItemDecoration(@ColorInt int i8) {
        this(i8, 4, 4);
    }

    private void drawHorizontal(Canvas canvas, View view, int i8, int i9, int i10) {
        boolean isFirstRaw = isFirstRaw(0, i8, i9, i10);
        boolean isLastRaw = isLastRaw(0, i8, i9, i10);
        boolean isFirstColumn = isFirstColumn(0, i8, i9, i10);
        boolean isLastColumn = isLastColumn(0, i8, i9, i10);
        if (i9 == 1) {
            if (isFirstRaw && isLastColumn) {
                return;
            }
            if (isFirstColumn) {
                this.mDrawer.drawRight(view, canvas);
                return;
            } else if (isLastColumn) {
                this.mDrawer.drawLeft(view, canvas);
                return;
            } else {
                this.mDrawer.drawLeft(view, canvas);
                this.mDrawer.drawRight(view, canvas);
                return;
            }
        }
        if (isFirstColumn && isFirstRaw) {
            this.mDrawer.drawRight(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
            return;
        }
        if (isFirstColumn && isLastRaw) {
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawRight(view, canvas);
            return;
        }
        if (isLastColumn && isFirstRaw) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
            return;
        }
        if (isLastColumn && isLastRaw) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawTop(view, canvas);
            return;
        }
        if (isFirstColumn) {
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawRight(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
            return;
        }
        if (isLastColumn) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
        } else if (isFirstRaw) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawRight(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
        } else if (isLastRaw) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawRight(view, canvas);
        } else {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawRight(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
        }
    }

    private void drawVertical(Canvas canvas, View view, int i8, int i9, int i10) {
        boolean isFirstRaw = isFirstRaw(1, i8, i9, i10);
        boolean isLastRaw = isLastRaw(1, i8, i9, i10);
        boolean isFirstColumn = isFirstColumn(1, i8, i9, i10);
        boolean isLastColumn = isLastColumn(1, i8, i9, i10);
        if (i9 == 1) {
            if (isFirstRaw && isLastRaw) {
                return;
            }
            if (isFirstRaw) {
                this.mDrawer.drawBottom(view, canvas);
                return;
            } else if (isLastRaw) {
                this.mDrawer.drawTop(view, canvas);
                return;
            } else {
                this.mDrawer.drawTop(view, canvas);
                this.mDrawer.drawBottom(view, canvas);
                return;
            }
        }
        if (isFirstRaw && isFirstColumn) {
            this.mDrawer.drawRight(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
            return;
        }
        if (isFirstRaw && isLastColumn) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
            return;
        }
        if (isLastRaw && isFirstColumn) {
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawRight(view, canvas);
            return;
        }
        if (isLastRaw && isLastColumn) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawTop(view, canvas);
            return;
        }
        if (isFirstRaw) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawRight(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
            return;
        }
        if (isLastRaw) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawRight(view, canvas);
        } else if (isFirstColumn) {
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawRight(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
        } else if (isLastColumn) {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
        } else {
            this.mDrawer.drawLeft(view, canvas);
            this.mDrawer.drawTop(view, canvas);
            this.mDrawer.drawRight(view, canvas);
            this.mDrawer.drawBottom(view, canvas);
        }
    }

    private int getOrientation(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        }
        return 1;
    }

    private int getSpanCount(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return 1;
    }

    private boolean isFirstColumn(int i8, int i9, int i10, int i11) {
        return i8 == 1 ? i10 == 1 || i9 % i10 == 0 : i9 < i10;
    }

    private boolean isFirstRaw(int i8, int i9, int i10, int i11) {
        return i8 == 1 ? i9 < i10 : i10 == 1 || i9 % i10 == 0;
    }

    private boolean isLastColumn(int i8, int i9, int i10, int i11) {
        if (i8 == 1) {
            return i10 == 1 || (i9 + 1) % i10 == 0;
        }
        if (i10 == 1) {
            return i9 + 1 == i11;
        }
        int i12 = i11 % i10;
        int i13 = ((i11 - i12) / i10) + (i12 > 0 ? 1 : 0);
        int i14 = i9 + 1;
        int i15 = i14 % i10;
        return i15 == 0 ? i13 == i14 / i10 : i13 == ((i14 - i15) / i10) + 1;
    }

    private boolean isLastRaw(int i8, int i9, int i10, int i11) {
        if (i8 != 1) {
            return i10 == 1 || (i9 + 1) % i10 == 0;
        }
        if (i10 == 1) {
            return i9 + 1 == i11;
        }
        int i12 = i11 % i10;
        int i13 = ((i11 - i12) / i10) + (i12 > 0 ? 1 : 0);
        int i14 = i9 + 1;
        int i15 = i14 % i10;
        return i15 == 0 ? i13 == i14 / i10 : i13 == ((i14 - i15) / i10) + 1;
    }

    private void offsetHorizontal(Rect rect, int i8, int i9, int i10) {
        boolean isFirstRaw = isFirstRaw(0, i8, i9, i10);
        boolean isLastRaw = isLastRaw(0, i8, i9, i10);
        boolean isFirstColumn = isFirstColumn(0, i8, i9, i10);
        boolean isLastColumn = isLastColumn(0, i8, i9, i10);
        if (i9 == 1) {
            if (isFirstColumn && isLastColumn) {
                rect.set(0, 0, 0, 0);
                return;
            }
            if (isFirstColumn) {
                rect.set(0, 0, this.mWidth, 0);
                return;
            } else if (isLastColumn) {
                rect.set(this.mWidth, 0, 0, 0);
                return;
            } else {
                int i11 = this.mWidth;
                rect.set(i11, 0, i11, 0);
                return;
            }
        }
        if (isFirstColumn && isFirstRaw) {
            rect.set(0, 0, this.mWidth, this.mHeight);
            return;
        }
        if (isFirstColumn && isLastRaw) {
            rect.set(0, this.mHeight, this.mWidth, 0);
            return;
        }
        if (isLastColumn && isFirstRaw) {
            rect.set(this.mWidth, 0, 0, this.mHeight);
            return;
        }
        if (isLastColumn && isLastRaw) {
            rect.set(this.mWidth, this.mHeight, 0, 0);
            return;
        }
        if (isFirstColumn) {
            int i12 = this.mHeight;
            rect.set(0, i12, this.mWidth, i12);
            return;
        }
        if (isLastColumn) {
            int i13 = this.mWidth;
            int i14 = this.mHeight;
            rect.set(i13, i14, 0, i14);
        } else if (isFirstRaw) {
            int i15 = this.mWidth;
            rect.set(i15, 0, i15, this.mHeight);
        } else if (isLastRaw) {
            int i16 = this.mWidth;
            rect.set(i16, this.mHeight, i16, 0);
        } else {
            int i17 = this.mWidth;
            int i18 = this.mHeight;
            rect.set(i17, i18, i17, i18);
        }
    }

    private void offsetVertical(Rect rect, int i8, int i9, int i10) {
        boolean isFirstRaw = isFirstRaw(1, i8, i9, i10);
        boolean isLastRaw = isLastRaw(1, i8, i9, i10);
        boolean isFirstColumn = isFirstColumn(1, i8, i9, i10);
        boolean isLastColumn = isLastColumn(1, i8, i9, i10);
        if (i9 == 1) {
            if (isFirstRaw && isLastRaw) {
                rect.set(0, 0, 0, 0);
                return;
            }
            if (isFirstRaw) {
                rect.set(0, 0, 0, this.mHeight);
                return;
            } else if (isLastRaw) {
                rect.set(0, this.mHeight, 0, 0);
                return;
            } else {
                int i11 = this.mHeight;
                rect.set(0, i11, 0, i11);
                return;
            }
        }
        if (isFirstRaw && isFirstColumn) {
            rect.set(0, 0, this.mWidth, this.mHeight);
            return;
        }
        if (isFirstRaw && isLastColumn) {
            rect.set(this.mWidth, 0, 0, this.mHeight);
            return;
        }
        if (isLastRaw && isFirstColumn) {
            rect.set(0, this.mHeight, this.mWidth, 0);
            return;
        }
        if (isLastRaw && isLastColumn) {
            rect.set(this.mWidth, this.mHeight, 0, 0);
            return;
        }
        if (isFirstRaw) {
            int i12 = this.mWidth;
            rect.set(i12, 0, i12, this.mHeight);
            return;
        }
        if (isLastRaw) {
            int i13 = this.mWidth;
            rect.set(i13, this.mHeight, i13, 0);
            return;
        }
        if (isFirstColumn) {
            int i14 = this.mHeight;
            rect.set(0, i14, this.mWidth, i14);
        } else if (isLastColumn) {
            int i15 = this.mWidth;
            int i16 = this.mHeight;
            rect.set(i15, i16, 0, i16);
        } else {
            int i17 = this.mWidth;
            int i18 = this.mHeight;
            rect.set(i17, i18, i17, i18);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int i8 = this.mWidth;
                int i9 = this.mHeight;
                rect.set(i8, i9, i8, i9);
                return;
            }
            return;
        }
        int orientation = getOrientation(layoutManager);
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int spanCount = getSpanCount(layoutManager);
        int itemCount = layoutManager.getItemCount();
        if (orientation == 1) {
            offsetVertical(rect, childLayoutPosition, spanCount, itemCount);
        } else {
            offsetHorizontal(rect, childLayoutPosition, spanCount, itemCount);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int orientation = getOrientation(layoutManager);
        int spanCount = getSpanCount(layoutManager);
        int childCount = layoutManager.getChildCount();
        if (layoutManager instanceof LinearLayoutManager) {
            canvas.save();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = layoutManager.getChildAt(i8);
                int childLayoutPosition = recyclerView.getChildLayoutPosition(childAt);
                if (orientation == 1) {
                    drawVertical(canvas, childAt, childLayoutPosition, spanCount, childCount);
                } else {
                    drawHorizontal(canvas, childAt, childLayoutPosition, spanCount, childCount);
                }
            }
            canvas.restore();
            return;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            canvas.save();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt2 = layoutManager.getChildAt(i9);
                this.mDrawer.drawLeft(childAt2, canvas);
                this.mDrawer.drawTop(childAt2, canvas);
                this.mDrawer.drawRight(childAt2, canvas);
                this.mDrawer.drawBottom(childAt2, canvas);
            }
            canvas.restore();
        }
    }

    public DefaultItemDecoration(@ColorInt int i8, int i9, int i10) {
        int round = Math.round(i9 / 2.0f);
        this.mWidth = round;
        int round2 = Math.round(i10 / 2.0f);
        this.mHeight = round2;
        this.mDrawer = new a(i8, round, round2);
    }
}
