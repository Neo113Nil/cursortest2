package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.NestedAdapterWrapper;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class ConcatAdapterController implements NestedAdapterWrapper.Callback {
    private List mAttachedRecyclerViews;
    private final IdentityHashMap mBinderLookup;
    private final ConcatAdapter mConcatAdapter;
    private WrapperAndLocalPosition mReusableHolder;
    private final ViewTypeStorage mViewTypeStorage;
    private List mWrappers;

    private int countItemsBefore(NestedAdapterWrapper nestedAdapterWrapper) {
        NestedAdapterWrapper nestedAdapterWrapper2;
        Iterator it = this.mWrappers.iterator();
        int i = 0;
        while (it.hasNext() && (nestedAdapterWrapper2 = (NestedAdapterWrapper) it.next()) != nestedAdapterWrapper) {
            i += nestedAdapterWrapper2.getCachedItemCount();
        }
        return i;
    }

    public long getItemId(int i) {
        WrapperAndLocalPosition findWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        long itemId = findWrapperAndLocalPosition.mWrapper.getItemId(findWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(findWrapperAndLocalPosition);
        return itemId;
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onChanged(NestedAdapterWrapper nestedAdapterWrapper) {
        this.mConcatAdapter.notifyDataSetChanged();
        calculateAndUpdateStateRestorationPolicy();
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2, Object obj) {
        this.mConcatAdapter.notifyItemRangeChanged(i + countItemsBefore(nestedAdapterWrapper), i2, obj);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeInserted(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        this.mConcatAdapter.notifyItemRangeInserted(i + countItemsBefore(nestedAdapterWrapper), i2);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeRemoved(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        this.mConcatAdapter.notifyItemRangeRemoved(i + countItemsBefore(nestedAdapterWrapper), i2);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeMoved(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        int countItemsBefore = countItemsBefore(nestedAdapterWrapper);
        this.mConcatAdapter.notifyItemMoved(i + countItemsBefore, i2 + countItemsBefore);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onStateRestorationPolicyChanged(NestedAdapterWrapper nestedAdapterWrapper) {
        calculateAndUpdateStateRestorationPolicy();
    }

    private void calculateAndUpdateStateRestorationPolicy() {
        RecyclerView.Adapter.StateRestorationPolicy computeStateRestorationPolicy = computeStateRestorationPolicy();
        if (computeStateRestorationPolicy != this.mConcatAdapter.getStateRestorationPolicy()) {
            this.mConcatAdapter.internalSetStateRestorationPolicy(computeStateRestorationPolicy);
        }
    }

    private RecyclerView.Adapter.StateRestorationPolicy computeStateRestorationPolicy() {
        for (NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = nestedAdapterWrapper.adapter.getStateRestorationPolicy();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy == stateRestorationPolicy2) {
                return stateRestorationPolicy2;
            }
            if (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && nestedAdapterWrapper.getCachedItemCount() == 0) {
                return stateRestorationPolicy2;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    public int getTotalCount() {
        Iterator it = this.mWrappers.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((NestedAdapterWrapper) it.next()).getCachedItemCount();
        }
        return i;
    }

    public int getItemViewType(int i) {
        WrapperAndLocalPosition findWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        int itemViewType = findWrapperAndLocalPosition.mWrapper.getItemViewType(findWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(findWrapperAndLocalPosition);
        return itemViewType;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.mViewTypeStorage.getWrapperForGlobalType(i).onCreateViewHolder(viewGroup, i);
    }

    private WrapperAndLocalPosition findWrapperAndLocalPosition(int i) {
        WrapperAndLocalPosition wrapperAndLocalPosition = this.mReusableHolder;
        if (wrapperAndLocalPosition.mInUse) {
            wrapperAndLocalPosition = new WrapperAndLocalPosition();
        } else {
            wrapperAndLocalPosition.mInUse = true;
        }
        Iterator it = this.mWrappers.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) it.next();
            if (nestedAdapterWrapper.getCachedItemCount() > i2) {
                wrapperAndLocalPosition.mWrapper = nestedAdapterWrapper;
                wrapperAndLocalPosition.mLocalPosition = i2;
                break;
            }
            i2 -= nestedAdapterWrapper.getCachedItemCount();
        }
        if (wrapperAndLocalPosition.mWrapper != null) {
            return wrapperAndLocalPosition;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    private void releaseWrapperAndLocalPosition(WrapperAndLocalPosition wrapperAndLocalPosition) {
        wrapperAndLocalPosition.mInUse = false;
        wrapperAndLocalPosition.mWrapper = null;
        wrapperAndLocalPosition.mLocalPosition = -1;
        this.mReusableHolder = wrapperAndLocalPosition;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        WrapperAndLocalPosition findWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        this.mBinderLookup.put(viewHolder, findWrapperAndLocalPosition.mWrapper);
        findWrapperAndLocalPosition.mWrapper.onBindViewHolder(viewHolder, findWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(findWrapperAndLocalPosition);
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        getWrapper(viewHolder).adapter.onViewAttachedToWindow(viewHolder);
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        getWrapper(viewHolder).adapter.onViewDetachedFromWindow(viewHolder);
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
        }
        nestedAdapterWrapper.adapter.onViewRecycled(viewHolder);
        this.mBinderLookup.remove(viewHolder);
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
        }
        boolean onFailedToRecycleView = nestedAdapterWrapper.adapter.onFailedToRecycleView(viewHolder);
        this.mBinderLookup.remove(viewHolder);
        return onFailedToRecycleView;
    }

    private NestedAdapterWrapper getWrapper(RecyclerView.ViewHolder viewHolder) {
        NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            return nestedAdapterWrapper;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    private boolean isAttachedTo(RecyclerView recyclerView) {
        Iterator it = this.mAttachedRecyclerViews.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (isAttachedTo(recyclerView)) {
            return;
        }
        this.mAttachedRecyclerViews.add(new WeakReference(recyclerView));
        Iterator it = this.mWrappers.iterator();
        while (it.hasNext()) {
            ((NestedAdapterWrapper) it.next()).adapter.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        int size = this.mAttachedRecyclerViews.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) this.mAttachedRecyclerViews.get(size);
            if (weakReference.get() == null) {
                this.mAttachedRecyclerViews.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.mAttachedRecyclerViews.remove(size);
                break;
            }
            size--;
        }
        Iterator it = this.mWrappers.iterator();
        while (it.hasNext()) {
            ((NestedAdapterWrapper) it.next()).adapter.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public int getLocalAdapterPosition(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            return -1;
        }
        int countItemsBefore = i - countItemsBefore(nestedAdapterWrapper);
        int itemCount = nestedAdapterWrapper.adapter.getItemCount();
        if (countItemsBefore < 0 || countItemsBefore >= itemCount) {
            throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + countItemsBefore + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + viewHolder + "adapter:" + adapter);
        }
        return nestedAdapterWrapper.adapter.findRelativeAdapterPositionIn(adapter, viewHolder, countItemsBefore);
    }

    static class WrapperAndLocalPosition {
        boolean mInUse;
        int mLocalPosition;
        NestedAdapterWrapper mWrapper;

        WrapperAndLocalPosition() {
        }
    }
}
