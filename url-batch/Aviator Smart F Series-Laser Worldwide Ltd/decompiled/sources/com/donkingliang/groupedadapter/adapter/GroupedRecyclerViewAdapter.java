package com.donkingliang.groupedadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.donkingliang.groupedadapter.R$integer;
import com.donkingliang.groupedadapter.R$layout;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class GroupedRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private boolean isDataChanged;
    protected Context mContext;
    private d mOnChildClickListener;
    private e mOnChildLongClickListener;
    private f mOnFooterClickListener;
    private g mOnFooterLongClickListener;
    private h mOnHeaderClickListener;
    private i mOnHeaderLongClickListener;
    protected ArrayList<o4.a> mStructures;
    private int mTempPosition;
    private boolean mUseBinding;
    private boolean showEmptyView;
    public static final int TYPE_HEADER = R$integer.type_header;
    public static final int TYPE_FOOTER = R$integer.type_footer;
    public static final int TYPE_CHILD = R$integer.type_child;
    public static final int TYPE_EMPTY = R$integer.type_empty;

    class a implements View.OnClickListener {
        final /* synthetic */ int val$groupPosition;
        final /* synthetic */ RecyclerView.ViewHolder val$holder;

        a(RecyclerView.ViewHolder viewHolder, int i8) {
            this.val$holder = viewHolder;
            this.val$groupPosition = i8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GroupedRecyclerViewAdapter.this.mOnHeaderClickListener != null) {
                int groupPositionForPosition = this.val$holder.itemView.getParent() instanceof FrameLayout ? this.val$groupPosition : GroupedRecyclerViewAdapter.this.getGroupPositionForPosition(this.val$holder.getLayoutPosition());
                if (groupPositionForPosition < 0 || groupPositionForPosition >= GroupedRecyclerViewAdapter.this.mStructures.size()) {
                    return;
                }
                GroupedRecyclerViewAdapter.this.mOnHeaderClickListener.onHeaderClick(GroupedRecyclerViewAdapter.this, (BaseViewHolder) this.val$holder, groupPositionForPosition);
            }
        }
    }

    class b implements View.OnClickListener {
        final /* synthetic */ RecyclerView.ViewHolder val$holder;

        b(RecyclerView.ViewHolder viewHolder) {
            this.val$holder = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GroupedRecyclerViewAdapter.this.mOnChildClickListener != null) {
                int groupPositionForPosition = GroupedRecyclerViewAdapter.this.getGroupPositionForPosition(this.val$holder.getLayoutPosition());
                int childPositionForPosition = GroupedRecyclerViewAdapter.this.getChildPositionForPosition(groupPositionForPosition, this.val$holder.getLayoutPosition());
                if (groupPositionForPosition < 0 || groupPositionForPosition >= GroupedRecyclerViewAdapter.this.mStructures.size() || childPositionForPosition < 0 || childPositionForPosition >= GroupedRecyclerViewAdapter.this.mStructures.get(groupPositionForPosition).getChildrenCount()) {
                    return;
                }
                GroupedRecyclerViewAdapter.this.mOnChildClickListener.onChildClick(GroupedRecyclerViewAdapter.this, (BaseViewHolder) this.val$holder, groupPositionForPosition, childPositionForPosition);
            }
        }
    }

    class c extends RecyclerView.AdapterDataObserver {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            GroupedRecyclerViewAdapter.this.isDataChanged = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9) {
            GroupedRecyclerViewAdapter.this.isDataChanged = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i8, int i9) {
            GroupedRecyclerViewAdapter.this.isDataChanged = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i8, int i9) {
            GroupedRecyclerViewAdapter.this.isDataChanged = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9, Object obj) {
            onItemRangeChanged(i8, i9);
        }
    }

    public interface d {
        void onChildClick(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i8, int i9);
    }

    public interface e {
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
        void onHeaderClick(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i8);
    }

    public interface i {
    }

    public GroupedRecyclerViewAdapter(Context context) {
        this(context, false);
    }

    static /* synthetic */ i access$100(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        groupedRecyclerViewAdapter.getClass();
        return null;
    }

    static /* synthetic */ f access$200(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        groupedRecyclerViewAdapter.getClass();
        return null;
    }

    static /* synthetic */ g access$300(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        groupedRecyclerViewAdapter.getClass();
        return null;
    }

    static /* synthetic */ e access$500(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        groupedRecyclerViewAdapter.getClass();
        return null;
    }

    private int count() {
        return countGroupRangeItem(0, this.mStructures.size());
    }

    private int getLayoutId(int i8, int i9) {
        int judgeType = judgeType(i8);
        if (judgeType == TYPE_HEADER) {
            return getHeaderLayout(i9);
        }
        if (judgeType == TYPE_FOOTER) {
            return getFooterLayout(i9);
        }
        if (judgeType == TYPE_CHILD) {
            return getChildLayout(i9);
        }
        return 0;
    }

    private void handleLayoutIfStaggeredGridLayout(RecyclerView.ViewHolder viewHolder, int i8) {
        if (isEmptyPosition(i8) || judgeType(i8) == TYPE_HEADER || judgeType(i8) == TYPE_FOOTER) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).setFullSpan(true);
        }
    }

    private boolean isStaggeredGridLayout(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams;
    }

    private void structureChanged() {
        this.mStructures.clear();
        int groupCount = getGroupCount();
        for (int i8 = 0; i8 < groupCount; i8++) {
            this.mStructures.add(new o4.a(hasHeader(i8), hasFooter(i8), getChildrenCount(i8)));
        }
        this.isDataChanged = false;
    }

    @Deprecated
    public void changeChild(int i8, int i9) {
        notifyChildChanged(i8, i9);
    }

    @Deprecated
    public void changeChildren(int i8) {
        notifyChildrenChanged(i8);
    }

    @Deprecated
    public void changeDataSet() {
        notifyDataChanged();
    }

    @Deprecated
    public void changeFooter(int i8) {
        notifyFooterChanged(i8);
    }

    @Deprecated
    public void changeGroup(int i8) {
        notifyGroupChanged(i8);
    }

    @Deprecated
    public void changeHeader(int i8) {
        notifyHeaderChanged(i8);
    }

    @Deprecated
    public void changeRangeChild(int i8, int i9, int i10) {
        notifyChildRangeChanged(i8, i9, i10);
    }

    @Deprecated
    public void changeRangeGroup(int i8, int i9) {
        notifyGroupRangeChanged(i8, i9);
    }

    public int countGroupItem(int i8) {
        if (i8 < 0 || i8 >= this.mStructures.size()) {
            return 0;
        }
        o4.a aVar = this.mStructures.get(i8);
        int childrenCount = (aVar.hasHeader() ? 1 : 0) + aVar.getChildrenCount();
        return aVar.hasFooter() ? childrenCount + 1 : childrenCount;
    }

    public int countGroupRangeItem(int i8, int i9) {
        int size = this.mStructures.size();
        int i10 = 0;
        for (int i11 = i8; i11 < size && i11 < i8 + i9; i11++) {
            i10 += countGroupItem(i11);
        }
        return i10;
    }

    public abstract int getChildLayout(int i8);

    public int getChildPositionForPosition(int i8, int i9) {
        if (i8 < 0 || i8 >= this.mStructures.size()) {
            return -1;
        }
        int countGroupRangeItem = countGroupRangeItem(0, i8 + 1);
        o4.a aVar = this.mStructures.get(i8);
        int childrenCount = (aVar.getChildrenCount() - (countGroupRangeItem - i9)) + (aVar.hasFooter() ? 1 : 0);
        if (childrenCount >= 0) {
            return childrenCount;
        }
        return -1;
    }

    public int getChildViewType(int i8, int i9) {
        return TYPE_CHILD;
    }

    public abstract int getChildrenCount(int i8);

    public View getEmptyView(ViewGroup viewGroup) {
        return LayoutInflater.from(this.mContext).inflate(R$layout.group_adapter_default_empty_view, viewGroup, false);
    }

    public abstract int getFooterLayout(int i8);

    public int getFooterViewType(int i8) {
        return TYPE_FOOTER;
    }

    public abstract int getGroupCount();

    public int getGroupPositionForPosition(int i8) {
        int size = this.mStructures.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += countGroupItem(i10);
            if (i8 < i9) {
                return i10;
            }
        }
        return -1;
    }

    public abstract int getHeaderLayout(int i8);

    public int getHeaderViewType(int i8) {
        return TYPE_HEADER;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.isDataChanged) {
            structureChanged();
        }
        int count = count();
        return count > 0 ? count : this.showEmptyView ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (isEmptyPosition(i8)) {
            return TYPE_EMPTY;
        }
        this.mTempPosition = i8;
        int groupPositionForPosition = getGroupPositionForPosition(i8);
        int judgeType = judgeType(i8);
        return judgeType == TYPE_HEADER ? getHeaderViewType(groupPositionForPosition) : judgeType == TYPE_FOOTER ? getFooterViewType(groupPositionForPosition) : judgeType == TYPE_CHILD ? getChildViewType(groupPositionForPosition, getChildPositionForPosition(groupPositionForPosition, i8)) : super.getItemViewType(i8);
    }

    public int getPositionForChild(int i8, int i9) {
        if (i8 < 0 || i8 >= this.mStructures.size()) {
            return -1;
        }
        o4.a aVar = this.mStructures.get(i8);
        if (aVar.getChildrenCount() > i9) {
            return countGroupRangeItem(0, i8) + i9 + (aVar.hasHeader() ? 1 : 0);
        }
        return -1;
    }

    public int getPositionForGroup(int i8) {
        if (i8 < 0 || i8 >= this.mStructures.size()) {
            return -1;
        }
        return countGroupRangeItem(0, i8);
    }

    public int getPositionForGroupFooter(int i8) {
        if (i8 < 0 || i8 >= this.mStructures.size() || !this.mStructures.get(i8).hasFooter()) {
            return -1;
        }
        return countGroupRangeItem(0, i8 + 1) - 1;
    }

    public int getPositionForGroupHeader(int i8) {
        if (i8 < 0 || i8 >= this.mStructures.size() || !this.mStructures.get(i8).hasHeader()) {
            return -1;
        }
        return countGroupRangeItem(0, i8);
    }

    public abstract boolean hasFooter(int i8);

    public abstract boolean hasHeader(int i8);

    @Deprecated
    public void insertChild(int i8, int i9) {
        notifyChildInserted(i8, i9);
    }

    @Deprecated
    public void insertChildren(int i8) {
        notifyChildrenInserted(i8);
    }

    @Deprecated
    public void insertFooter(int i8) {
        notifyFooterInserted(i8);
    }

    @Deprecated
    public void insertGroup(int i8) {
        notifyGroupInserted(i8);
    }

    @Deprecated
    public void insertHeader(int i8) {
        notifyHeaderInserted(i8);
    }

    @Deprecated
    public void insertRangeChild(int i8, int i9, int i10) {
        notifyChildRangeInserted(i8, i9, i10);
    }

    @Deprecated
    public void insertRangeGroup(int i8, int i9) {
        notifyGroupRangeInserted(i8, i9);
    }

    public boolean isEmptyPosition(int i8) {
        return i8 == 0 && this.showEmptyView && count() == 0;
    }

    public boolean isShowEmptyView() {
        return this.showEmptyView;
    }

    public int judgeType(int i8) {
        int size = this.mStructures.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            o4.a aVar = this.mStructures.get(i10);
            if (aVar.hasHeader() && i8 < (i9 = i9 + 1)) {
                return TYPE_HEADER;
            }
            i9 += aVar.getChildrenCount();
            if (i8 < i9) {
                return TYPE_CHILD;
            }
            if (aVar.hasFooter() && i8 < (i9 = i9 + 1)) {
                return TYPE_FOOTER;
            }
        }
        return TYPE_EMPTY;
    }

    public void notifyChildChanged(int i8, int i9) {
        structureChanged();
        int positionForChild = getPositionForChild(i8, i9);
        if (positionForChild >= 0) {
            notifyItemChanged(positionForChild);
        }
    }

    public void notifyChildInserted(int i8, int i9) {
        if (i8 < this.mStructures.size()) {
            o4.a aVar = this.mStructures.get(i8);
            int positionForChild = getPositionForChild(i8, i9);
            if (positionForChild < 0) {
                positionForChild = aVar.getChildrenCount() + countGroupRangeItem(0, i8) + (aVar.hasHeader() ? 1 : 0);
            }
            aVar.setChildrenCount(aVar.getChildrenCount() + 1);
            notifyItemInserted(positionForChild);
        }
    }

    public void notifyChildRangeChanged(int i8, int i9, int i10) {
        int positionForChild;
        structureChanged();
        if (i8 >= this.mStructures.size() || (positionForChild = getPositionForChild(i8, i9)) < 0) {
            return;
        }
        o4.a aVar = this.mStructures.get(i8);
        if (aVar.getChildrenCount() >= i9 + i10) {
            notifyItemRangeChanged(positionForChild, i10);
        } else {
            notifyItemRangeChanged(positionForChild, aVar.getChildrenCount() - i9);
        }
    }

    public void notifyChildRangeInserted(int i8, int i9, int i10) {
        if (i8 < this.mStructures.size()) {
            int countGroupRangeItem = countGroupRangeItem(0, i8);
            o4.a aVar = this.mStructures.get(i8);
            if (aVar.hasHeader()) {
                countGroupRangeItem++;
            }
            if (i9 >= aVar.getChildrenCount()) {
                i9 = aVar.getChildrenCount();
            }
            int i11 = countGroupRangeItem + i9;
            if (i10 > 0) {
                aVar.setChildrenCount(aVar.getChildrenCount() + i10);
                notifyItemRangeInserted(i11, i10);
            }
        }
    }

    public void notifyChildRangeRemoved(int i8, int i9, int i10) {
        int positionForChild;
        if (i8 >= this.mStructures.size() || (positionForChild = getPositionForChild(i8, i9)) < 0) {
            return;
        }
        o4.a aVar = this.mStructures.get(i8);
        int childrenCount = aVar.getChildrenCount();
        if (childrenCount < i9 + i10) {
            i10 = childrenCount - i9;
        }
        aVar.setChildrenCount(childrenCount - i10);
        notifyItemRangeRemoved(positionForChild, i10);
    }

    public void notifyChildRemoved(int i8, int i9) {
        int positionForChild = getPositionForChild(i8, i9);
        if (positionForChild >= 0) {
            this.mStructures.get(i8).setChildrenCount(r2.getChildrenCount() - 1);
            notifyItemRemoved(positionForChild);
        }
    }

    public void notifyChildrenChanged(int i8) {
        int positionForChild;
        structureChanged();
        if (i8 < 0 || i8 >= this.mStructures.size() || (positionForChild = getPositionForChild(i8, 0)) < 0) {
            return;
        }
        notifyItemRangeChanged(positionForChild, this.mStructures.get(i8).getChildrenCount());
    }

    public void notifyChildrenInserted(int i8) {
        if (i8 < this.mStructures.size()) {
            int countGroupRangeItem = countGroupRangeItem(0, i8);
            o4.a aVar = this.mStructures.get(i8);
            if (aVar.hasHeader()) {
                countGroupRangeItem++;
            }
            int childrenCount = getChildrenCount(i8);
            if (childrenCount > 0) {
                aVar.setChildrenCount(childrenCount);
                notifyItemRangeInserted(countGroupRangeItem, childrenCount);
            }
        }
    }

    public void notifyChildrenRemoved(int i8) {
        int positionForChild;
        if (i8 >= this.mStructures.size() || (positionForChild = getPositionForChild(i8, 0)) < 0) {
            return;
        }
        o4.a aVar = this.mStructures.get(i8);
        int childrenCount = aVar.getChildrenCount();
        aVar.setChildrenCount(0);
        notifyItemRangeRemoved(positionForChild, childrenCount);
    }

    public void notifyDataChanged() {
        this.isDataChanged = true;
        notifyDataSetChanged();
    }

    public void notifyDataRemoved() {
        int countGroupRangeItem = countGroupRangeItem(0, this.mStructures.size());
        this.mStructures.clear();
        notifyItemRangeRemoved(0, countGroupRangeItem);
    }

    public void notifyFooterChanged(int i8) {
        structureChanged();
        int positionForGroupFooter = getPositionForGroupFooter(i8);
        if (positionForGroupFooter >= 0) {
            notifyItemChanged(positionForGroupFooter);
        }
    }

    public void notifyFooterInserted(int i8) {
        if (i8 >= this.mStructures.size() || getPositionForGroupFooter(i8) >= 0) {
            return;
        }
        this.mStructures.get(i8).setHasFooter(true);
        notifyItemInserted(countGroupRangeItem(0, i8 + 1));
    }

    public void notifyFooterRemoved(int i8) {
        int positionForGroupFooter = getPositionForGroupFooter(i8);
        if (positionForGroupFooter >= 0) {
            this.mStructures.get(i8).setHasFooter(false);
            notifyItemRemoved(positionForGroupFooter);
        }
    }

    public void notifyGroupChanged(int i8) {
        structureChanged();
        int positionForGroup = getPositionForGroup(i8);
        int countGroupItem = countGroupItem(i8);
        if (positionForGroup < 0 || countGroupItem <= 0) {
            return;
        }
        notifyItemRangeChanged(positionForGroup, countGroupItem);
    }

    public void notifyGroupInserted(int i8) {
        o4.a aVar = new o4.a(hasHeader(i8), hasFooter(i8), getChildrenCount(i8));
        if (i8 < this.mStructures.size()) {
            this.mStructures.add(i8, aVar);
        } else {
            this.mStructures.add(aVar);
            i8 = this.mStructures.size() - 1;
        }
        int countGroupRangeItem = countGroupRangeItem(0, i8);
        int countGroupItem = countGroupItem(i8);
        if (countGroupItem > 0) {
            notifyItemRangeInserted(countGroupRangeItem, countGroupItem);
        }
    }

    public void notifyGroupRangeChanged(int i8, int i9) {
        structureChanged();
        int positionForGroup = getPositionForGroup(i8);
        int i10 = i9 + i8;
        int countGroupRangeItem = i10 <= this.mStructures.size() ? countGroupRangeItem(i8, i10) : countGroupRangeItem(i8, this.mStructures.size());
        if (positionForGroup < 0 || countGroupRangeItem <= 0) {
            return;
        }
        notifyItemRangeChanged(positionForGroup, countGroupRangeItem);
    }

    public void notifyGroupRangeInserted(int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = i8; i10 < i9; i10++) {
            arrayList.add(new o4.a(hasHeader(i10), hasFooter(i10), getChildrenCount(i10)));
        }
        if (i8 < this.mStructures.size()) {
            this.mStructures.addAll(i8, arrayList);
        } else {
            this.mStructures.addAll(arrayList);
            i8 = this.mStructures.size() - arrayList.size();
        }
        int countGroupRangeItem = countGroupRangeItem(0, i8);
        int countGroupRangeItem2 = countGroupRangeItem(i8, i9);
        if (countGroupRangeItem2 > 0) {
            notifyItemRangeInserted(countGroupRangeItem, countGroupRangeItem2);
        }
    }

    public void notifyGroupRangeRemoved(int i8, int i9) {
        int positionForGroup = getPositionForGroup(i8);
        int i10 = i9 + i8;
        int countGroupRangeItem = i10 <= this.mStructures.size() ? countGroupRangeItem(i8, i10) : countGroupRangeItem(i8, this.mStructures.size());
        if (positionForGroup < 0 || countGroupRangeItem <= 0) {
            return;
        }
        this.mStructures.remove(i8);
        notifyItemRangeRemoved(positionForGroup, countGroupRangeItem);
    }

    public void notifyGroupRemoved(int i8) {
        int positionForGroup = getPositionForGroup(i8);
        int countGroupItem = countGroupItem(i8);
        if (positionForGroup < 0 || countGroupItem <= 0) {
            return;
        }
        this.mStructures.remove(i8);
        notifyItemRangeRemoved(positionForGroup, countGroupItem);
    }

    public void notifyHeaderChanged(int i8) {
        structureChanged();
        int positionForGroupHeader = getPositionForGroupHeader(i8);
        if (positionForGroupHeader >= 0) {
            notifyItemChanged(positionForGroupHeader);
        }
    }

    public void notifyHeaderInserted(int i8) {
        if (i8 >= this.mStructures.size() || getPositionForGroupHeader(i8) >= 0) {
            return;
        }
        this.mStructures.get(i8).setHasHeader(true);
        notifyItemInserted(countGroupRangeItem(0, i8));
    }

    public void notifyHeaderRemoved(int i8) {
        int positionForGroupHeader = getPositionForGroupHeader(i8);
        if (positionForGroupHeader >= 0) {
            this.mStructures.get(i8).setHasHeader(false);
            notifyItemRemoved(positionForGroupHeader);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        structureChanged();
    }

    public abstract void onBindChildViewHolder(BaseViewHolder baseViewHolder, int i8, int i9);

    public abstract void onBindFooterViewHolder(BaseViewHolder baseViewHolder, int i8);

    public abstract void onBindHeaderViewHolder(BaseViewHolder baseViewHolder, int i8);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        int judgeType = judgeType(i8);
        int groupPositionForPosition = getGroupPositionForPosition(i8);
        if (judgeType == TYPE_HEADER) {
            if (this.mOnHeaderClickListener != null) {
                viewHolder.itemView.setOnClickListener(new a(viewHolder, groupPositionForPosition));
            }
            onBindHeaderViewHolder((BaseViewHolder) viewHolder, groupPositionForPosition);
        } else if (judgeType == TYPE_FOOTER) {
            onBindFooterViewHolder((BaseViewHolder) viewHolder, groupPositionForPosition);
        } else if (judgeType == TYPE_CHILD) {
            int childPositionForPosition = getChildPositionForPosition(groupPositionForPosition, i8);
            if (this.mOnChildClickListener != null) {
                viewHolder.itemView.setOnClickListener(new b(viewHolder));
            }
            onBindChildViewHolder((BaseViewHolder) viewHolder, groupPositionForPosition, childPositionForPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return i8 == TYPE_EMPTY ? new BaseViewHolder(getEmptyView(viewGroup)) : this.mUseBinding ? new BaseViewHolder(DataBindingUtil.inflate(LayoutInflater.from(this.mContext), getLayoutId(this.mTempPosition, i8), viewGroup, false).getRoot()) : new BaseViewHolder(LayoutInflater.from(this.mContext).inflate(getLayoutId(this.mTempPosition, i8), viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (isStaggeredGridLayout(viewHolder)) {
            handleLayoutIfStaggeredGridLayout(viewHolder, viewHolder.getLayoutPosition());
        }
    }

    @Deprecated
    public void removeAll() {
        notifyDataRemoved();
    }

    @Deprecated
    public void removeChild(int i8, int i9) {
        notifyChildRemoved(i8, i9);
    }

    @Deprecated
    public void removeChildren(int i8) {
        notifyChildrenRemoved(i8);
    }

    @Deprecated
    public void removeFooter(int i8) {
        notifyFooterRemoved(i8);
    }

    @Deprecated
    public void removeGroup(int i8) {
        notifyGroupRemoved(i8);
    }

    @Deprecated
    public void removeHeader(int i8) {
        notifyHeaderRemoved(i8);
    }

    @Deprecated
    public void removeRangeChild(int i8, int i9, int i10) {
        notifyChildRangeRemoved(i8, i9, i10);
    }

    @Deprecated
    public void removeRangeGroup(int i8, int i9) {
        notifyGroupRangeRemoved(i8, i9);
    }

    public void setOnChildClickListener(d dVar) {
        this.mOnChildClickListener = dVar;
    }

    public void setOnChildLongClickListener(e eVar) {
    }

    public void setOnFooterClickListener(f fVar) {
    }

    public void setOnFooterLongClickListener(g gVar) {
    }

    public void setOnHeaderClickListener(h hVar) {
        this.mOnHeaderClickListener = hVar;
    }

    public void setOnHeaderLongClickListener(i iVar) {
    }

    public void showEmptyView(boolean z7) {
        if (z7 != this.showEmptyView) {
            this.showEmptyView = z7;
            notifyDataChanged();
        }
    }

    public GroupedRecyclerViewAdapter(Context context, boolean z7) {
        this.mStructures = new ArrayList<>();
        this.showEmptyView = false;
        this.mContext = context;
        this.mUseBinding = z7;
        registerAdapterDataObserver(new c());
    }
}
