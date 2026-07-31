package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StableIdStorage;
import androidx.recyclerview.widget.ViewTypeStorage;

/* loaded from: classes10.dex */
class NestedAdapterWrapper {
    public final RecyclerView.Adapter adapter;
    int mCachedItemCount;
    final Callback mCallback;
    private final StableIdStorage.StableIdLookup mStableIdLookup;
    private final ViewTypeStorage.ViewTypeLookup mViewTypeLookup;

    interface Callback {
        void onChanged(NestedAdapterWrapper nestedAdapterWrapper);

        void onItemRangeChanged(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2, Object obj);

        void onItemRangeInserted(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void onItemRangeMoved(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void onItemRangeRemoved(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2);

        void onStateRestorationPolicyChanged(NestedAdapterWrapper nestedAdapterWrapper);
    }

    /* renamed from: androidx.recyclerview.widget.NestedAdapterWrapper$1, reason: invalid class name */
    class AnonymousClass1 extends RecyclerView.AdapterDataObserver {
        final /* synthetic */ NestedAdapterWrapper this$0;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            NestedAdapterWrapper nestedAdapterWrapper = this.this$0;
            nestedAdapterWrapper.mCachedItemCount = nestedAdapterWrapper.adapter.getItemCount();
            NestedAdapterWrapper nestedAdapterWrapper2 = this.this$0;
            nestedAdapterWrapper2.mCallback.onChanged(nestedAdapterWrapper2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            NestedAdapterWrapper nestedAdapterWrapper = this.this$0;
            nestedAdapterWrapper.mCallback.onItemRangeChanged(nestedAdapterWrapper, i, i2, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            NestedAdapterWrapper nestedAdapterWrapper = this.this$0;
            nestedAdapterWrapper.mCallback.onItemRangeChanged(nestedAdapterWrapper, i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            NestedAdapterWrapper nestedAdapterWrapper = this.this$0;
            nestedAdapterWrapper.mCachedItemCount += i2;
            nestedAdapterWrapper.mCallback.onItemRangeInserted(nestedAdapterWrapper, i, i2);
            NestedAdapterWrapper nestedAdapterWrapper2 = this.this$0;
            if (nestedAdapterWrapper2.mCachedItemCount <= 0 || nestedAdapterWrapper2.adapter.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            NestedAdapterWrapper nestedAdapterWrapper3 = this.this$0;
            nestedAdapterWrapper3.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            NestedAdapterWrapper nestedAdapterWrapper = this.this$0;
            nestedAdapterWrapper.mCachedItemCount -= i2;
            nestedAdapterWrapper.mCallback.onItemRangeRemoved(nestedAdapterWrapper, i, i2);
            NestedAdapterWrapper nestedAdapterWrapper2 = this.this$0;
            if (nestedAdapterWrapper2.mCachedItemCount >= 1 || nestedAdapterWrapper2.adapter.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                return;
            }
            NestedAdapterWrapper nestedAdapterWrapper3 = this.this$0;
            nestedAdapterWrapper3.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            Preconditions.checkArgument(i3 == 1, "moving more than 1 item is not supported in RecyclerView");
            NestedAdapterWrapper nestedAdapterWrapper = this.this$0;
            nestedAdapterWrapper.mCallback.onItemRangeMoved(nestedAdapterWrapper, i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            NestedAdapterWrapper nestedAdapterWrapper = this.this$0;
            nestedAdapterWrapper.mCallback.onStateRestorationPolicyChanged(nestedAdapterWrapper);
        }
    }

    int getCachedItemCount() {
        return this.mCachedItemCount;
    }

    int getItemViewType(int i) {
        return this.mViewTypeLookup.localToGlobal(this.adapter.getItemViewType(i));
    }

    RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.adapter.onCreateViewHolder(viewGroup, this.mViewTypeLookup.globalToLocal(i));
    }

    void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.adapter.bindViewHolder(viewHolder, i);
    }

    public long getItemId(int i) {
        return this.mStableIdLookup.localToGlobal(this.adapter.getItemId(i));
    }
}
