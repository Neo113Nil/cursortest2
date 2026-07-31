package androidx.recyclerview.widget;

import B.x;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.C1280a;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class r extends C1280a {
    private final a mItemDelegate;
    final RecyclerView mRecyclerView;

    public static class a extends C1280a {
        private Map<View, C1280a> mOriginalItemDelegates = new WeakHashMap();
        final r mRecyclerViewDelegate;

        public a(r rVar) {
            this.mRecyclerViewDelegate = rVar;
        }

        @Override // androidx.core.view.C1280a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1280a c1280a = this.mOriginalItemDelegates.get(view);
            return c1280a != null ? c1280a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1280a
        public x getAccessibilityNodeProvider(View view) {
            C1280a c1280a = this.mOriginalItemDelegates.get(view);
            return c1280a != null ? c1280a.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        C1280a getAndRemoveOriginalDelegateForItem(View view) {
            return this.mOriginalItemDelegates.remove(view);
        }

        @Override // androidx.core.view.C1280a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1280a c1280a = this.mOriginalItemDelegates.get(view);
            if (c1280a != null) {
                c1280a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1280a
        public void onInitializeAccessibilityNodeInfo(View view, B.w wVar) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, wVar);
                return;
            }
            this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, wVar);
            C1280a c1280a = this.mOriginalItemDelegates.get(view);
            if (c1280a != null) {
                c1280a.onInitializeAccessibilityNodeInfo(view, wVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, wVar);
            }
        }

        @Override // androidx.core.view.C1280a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C1280a c1280a = this.mOriginalItemDelegates.get(view);
            if (c1280a != null) {
                c1280a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1280a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1280a c1280a = this.mOriginalItemDelegates.get(viewGroup);
            return c1280a != null ? c1280a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1280a
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i4, bundle);
            }
            C1280a c1280a = this.mOriginalItemDelegates.get(view);
            if (c1280a != null) {
                if (c1280a.performAccessibilityAction(view, i4, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i4, bundle)) {
                return true;
            }
            return this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i4, bundle);
        }

        void saveOriginalDelegate(View view) {
            C1280a n4 = AbstractC1281a0.n(view);
            if (n4 == null || n4 == this) {
                return;
            }
            this.mOriginalItemDelegates.put(view, n4);
        }

        @Override // androidx.core.view.C1280a
        public void sendAccessibilityEvent(View view, int i4) {
            C1280a c1280a = this.mOriginalItemDelegates.get(view);
            if (c1280a != null) {
                c1280a.sendAccessibilityEvent(view, i4);
            } else {
                super.sendAccessibilityEvent(view, i4);
            }
        }

        @Override // androidx.core.view.C1280a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C1280a c1280a = this.mOriginalItemDelegates.get(view);
            if (c1280a != null) {
                c1280a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public r(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        C1280a itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.mItemDelegate = new a(this);
        } else {
            this.mItemDelegate = (a) itemDelegate;
        }
    }

    public C1280a getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // androidx.core.view.C1280a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C1280a
    public void onInitializeAccessibilityNodeInfo(View view, B.w wVar) {
        super.onInitializeAccessibilityNodeInfo(view, wVar);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(wVar);
    }

    @Override // androidx.core.view.C1280a
    public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
        if (super.performAccessibilityAction(view, i4, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i4, bundle);
    }

    boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
