package com.yanzhenjie.recyclerview;

import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yanzhenjie.recyclerview.ExpandableAdapter.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class ExpandableAdapter<VH extends ViewHolder> extends RecyclerView.Adapter<VH> {
    private static final int TYPE_CHILD = 2;
    private static final int TYPE_PARENT = 1;
    private final SparseBooleanArray mExpandItemArray = new SparseBooleanArray();
    private final List<Integer> mParentViewType = new ArrayList();

    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        private ExpandableAdapter mAdapter;

        public ViewHolder(@NonNull View view, ExpandableAdapter expandableAdapter) {
            super(view);
            this.mAdapter = expandableAdapter;
        }

        public final int childItemPosition() {
            if (isParentItem()) {
                throw new IllegalStateException("This item is not a child item.");
            }
            return this.mAdapter.childItemPosition(getAdapterPosition());
        }

        public final boolean isParentExpanded() {
            return this.mAdapter.isExpanded(parentItemPosition());
        }

        public final boolean isParentItem() {
            return this.mAdapter.isParentItem(getAdapterPosition());
        }

        public final int parentItemPosition() {
            return this.mAdapter.parentItemPosition(getAdapterPosition());
        }
    }

    class a extends GridLayoutManager.SpanSizeLookup {
        final /* synthetic */ GridLayoutManager val$glm;
        final /* synthetic */ GridLayoutManager.SpanSizeLookup val$originLookup;

        a(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.val$glm = gridLayoutManager;
            this.val$originLookup = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i8) {
            if (ExpandableAdapter.this.isParentItem(i8)) {
                return this.val$glm.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.val$originLookup;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i8);
            }
            return 1;
        }
    }

    private void checkViewType(int i8) {
        if (i8 == 1 || i8 == 2) {
            throw new IllegalArgumentException(String.format(Locale.US, "The value [%d] is reserved, please replace it with other values.", Integer.valueOf(i8)));
        }
    }

    private int positionFromChildPosition(int i8, int i9) {
        int parentItemCount = parentItemCount();
        int i10 = 0;
        for (int i11 = 0; i11 < parentItemCount; i11++) {
            i10++;
            if (i8 == i11) {
                if (i9 < childItemCount(i8)) {
                    return (i10 + (i9 + 1)) - 1;
                }
                throw new IllegalStateException("The child position is invalid: " + i9);
            }
            if (isExpanded(i11)) {
                i10 += childItemCount(i11);
            }
        }
        throw new IllegalStateException("The parent position is invalid: " + i8);
    }

    private int positionFromParentPosition(int i8) {
        int parentItemCount = parentItemCount();
        int i9 = 0;
        for (int i10 = 0; i10 < parentItemCount; i10++) {
            int i11 = i9 + 1;
            if (i8 == i10) {
                return i9;
            }
            if (isExpanded(i10)) {
                i11 += childItemCount(i10);
            }
            i9 = i11;
        }
        throw new IllegalStateException("The parent position is invalid: " + i8);
    }

    public abstract void bindChildHolder(@NonNull VH vh, int i8, int i9);

    public void bindChildHolder(@NonNull VH vh, int i8, int i9, @NonNull List<Object> list) {
        bindChildHolder(vh, i8, i9);
    }

    public abstract void bindParentHolder(@NonNull VH vh, int i8);

    public void bindParentHolder(@NonNull VH vh, int i8, @NonNull List<Object> list) {
        bindParentHolder(vh, i8);
    }

    public abstract int childItemCount(int i8);

    public final int childItemPosition(int i8) {
        int childItemCount;
        int parentItemCount = parentItemCount();
        int i9 = 0;
        for (int i10 = 0; i10 < parentItemCount; i10++) {
            i9++;
            if (isExpanded(i10) && i8 < (i9 = i9 + (childItemCount = childItemCount(i10)))) {
                return childItemCount - (i9 - i8);
            }
        }
        throw new IllegalStateException("The adapter position is invalid: " + i8);
    }

    public int childItemViewType(int i8, int i9) {
        return 2;
    }

    public final void collapseParent(int i8) {
        if (isExpanded(i8)) {
            this.mExpandItemArray.append(i8, false);
            notifyItemRangeRemoved(positionFromParentPosition(i8) + 1, childItemCount(i8));
        }
    }

    public abstract VH createChildHolder(@NonNull ViewGroup viewGroup, int i8);

    public abstract VH createParentHolder(@NonNull ViewGroup viewGroup, int i8);

    public final void expandParent(int i8) {
        if (isExpanded(i8)) {
            return;
        }
        this.mExpandItemArray.append(i8, true);
        notifyItemRangeInserted(positionFromParentPosition(i8) + 1, childItemCount(i8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int parentItemCount = parentItemCount();
        for (int i8 = 0; i8 < parentItemCount; i8++) {
            if (isExpanded(i8)) {
                parentItemCount += childItemCount(i8);
            }
        }
        return parentItemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i8) {
        int parentItemPosition = parentItemPosition(i8);
        if (!isParentItem(i8)) {
            int childItemViewType = childItemViewType(parentItemPosition, childItemPosition(i8));
            checkViewType(childItemViewType);
            return childItemViewType;
        }
        int parentItemViewType = parentItemViewType(parentItemPosition);
        checkViewType(parentItemViewType);
        if (!this.mParentViewType.contains(Integer.valueOf(parentItemViewType))) {
            this.mParentViewType.add(Integer.valueOf(parentItemViewType));
        }
        return parentItemViewType;
    }

    public final boolean isExpanded(int i8) {
        return this.mExpandItemArray.get(i8, false);
    }

    public final boolean isParentItem(int i8) {
        int parentItemCount = parentItemCount();
        int i9 = 0;
        for (int i10 = 0; i10 < parentItemCount; i10++) {
            if (i9 == i8) {
                return true;
            }
            i9++;
            if (isExpanded(i10)) {
                i9 += childItemCount(i10);
            }
        }
        return false;
    }

    public final void notifyChildChanged(int i8, int i9) {
        notifyItemChanged(positionFromChildPosition(i8, i9));
    }

    public final void notifyChildInserted(int i8, int i9) {
        notifyItemInserted(positionFromChildPosition(i8, i9));
    }

    public final void notifyChildRemoved(int i8, int i9) {
        notifyItemRemoved(positionFromChildPosition(i8, i9));
    }

    public final void notifyParentChanged(int i8) {
        notifyItemChanged(positionFromParentPosition(i8));
    }

    public final void notifyParentInserted(int i8) {
        notifyItemInserted(positionFromParentPosition(i8));
    }

    public final void notifyParentRemoved(int i8) {
        notifyItemRemoved(positionFromParentPosition(i8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @Deprecated
    public final void onBindViewHolder(@NonNull VH vh, int i8) {
    }

    public abstract int parentItemCount();

    public final int parentItemPosition(int i8) {
        int i9 = 0;
        for (int i10 = 0; i10 < parentItemCount(); i10++) {
            i9++;
            if (isExpanded(i10)) {
                i9 += childItemCount(i10);
            }
            if (i8 < i9) {
                return i10;
            }
        }
        throw new IllegalStateException("The adapter position is not a parent type: " + i8);
    }

    public int parentItemViewType(int i8) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i8) {
        return this.mParentViewType.contains(Integer.valueOf(i8)) ? createParentHolder(viewGroup, i8) : createChildHolder(viewGroup, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull VH vh) {
        if (isParentItem(vh.getAdapterPosition())) {
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i8, @NonNull List list) {
        onBindViewHolder((ExpandableAdapter<VH>) viewHolder, i8, (List<Object>) list);
    }

    public final void onBindViewHolder(@NonNull VH vh, int i8, @NonNull List<Object> list) {
        int parentItemPosition = parentItemPosition(i8);
        if (isParentItem(i8)) {
            bindParentHolder(vh, parentItemPosition, list);
        } else {
            bindChildHolder(vh, parentItemPosition, childItemPosition(i8), list);
        }
    }
}
