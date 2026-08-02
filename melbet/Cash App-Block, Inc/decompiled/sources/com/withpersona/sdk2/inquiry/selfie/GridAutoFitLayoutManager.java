package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "selfie_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GridAutoFitLayoutManager extends GridLayoutManager {
    public final int columnWidth;
    public boolean columnWidthChanged;
    public int lastTotalSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridAutoFitLayoutManager(Context context, int i) {
        super(context, 1);
        context.getClass();
        this.columnWidthChanged = true;
        i = i <= 0 ? (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics()) : i;
        if (i <= 0 || i == this.columnWidth) {
            return;
        }
        this.columnWidth = i;
        this.columnWidthChanged = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int paddingTop;
        int paddingBottom;
        state.getClass();
        if (this.mOrientation == 1) {
            paddingTop = this.mWidth - getPaddingRight();
            paddingBottom = getPaddingLeft();
        } else {
            paddingTop = this.mHeight - getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingTop - paddingBottom;
        boolean z = this.columnWidthChanged;
        int i2 = this.columnWidth;
        if ((z && i2 > 0) || i != this.lastTotalSpace) {
            int i3 = i / i2;
            setSpanCount(1 < i3 ? i3 : 1);
            this.columnWidthChanged = false;
            this.lastTotalSpace = i;
        }
        super.onLayoutChildren(recycler, state);
    }
}
