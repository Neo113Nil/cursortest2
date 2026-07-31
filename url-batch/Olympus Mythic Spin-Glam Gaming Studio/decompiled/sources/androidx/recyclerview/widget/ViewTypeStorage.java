package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
interface ViewTypeStorage {

    public interface ViewTypeLookup {
        int globalToLocal(int i);

        int localToGlobal(int i);
    }

    NestedAdapterWrapper getWrapperForGlobalType(int i);

    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        SparseArray mGlobalTypeToWrapper;

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public NestedAdapterWrapper getWrapperForGlobalType(int i) {
            List list = (List) this.mGlobalTypeToWrapper.get(i);
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
            }
            return (NestedAdapterWrapper) list.get(0);
        }

        class WrapperViewTypeLookup implements ViewTypeLookup {
            final NestedAdapterWrapper mWrapper;
            final /* synthetic */ SharedIdRangeViewTypeStorage this$0;

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                return i;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                List list = (List) this.this$0.mGlobalTypeToWrapper.get(i);
                if (list == null) {
                    list = new ArrayList();
                    this.this$0.mGlobalTypeToWrapper.put(i, list);
                }
                if (!list.contains(this.mWrapper)) {
                    list.add(this.mWrapper);
                }
                return i;
            }
        }
    }

    public static class IsolatedViewTypeStorage implements ViewTypeStorage {
        SparseArray mGlobalTypeToWrapper;
        int mNextViewType;

        int obtainViewType(NestedAdapterWrapper nestedAdapterWrapper) {
            int i = this.mNextViewType;
            this.mNextViewType = i + 1;
            this.mGlobalTypeToWrapper.put(i, nestedAdapterWrapper);
            return i;
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public NestedAdapterWrapper getWrapperForGlobalType(int i) {
            NestedAdapterWrapper nestedAdapterWrapper = (NestedAdapterWrapper) this.mGlobalTypeToWrapper.get(i);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        class WrapperViewTypeLookup implements ViewTypeLookup {
            private SparseIntArray mGlobalToLocalMapping;
            private SparseIntArray mLocalToGlobalMapping;
            final NestedAdapterWrapper mWrapper;
            final /* synthetic */ IsolatedViewTypeStorage this$0;

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                int indexOfKey = this.mLocalToGlobalMapping.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.mLocalToGlobalMapping.valueAt(indexOfKey);
                }
                int obtainViewType = this.this$0.obtainViewType(this.mWrapper);
                this.mLocalToGlobalMapping.put(i, obtainViewType);
                this.mGlobalToLocalMapping.put(obtainViewType, i);
                return obtainViewType;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                int indexOfKey = this.mGlobalToLocalMapping.indexOfKey(i);
                if (indexOfKey < 0) {
                    throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.mWrapper.adapter);
                }
                return this.mGlobalToLocalMapping.valueAt(indexOfKey);
            }
        }
    }
}
