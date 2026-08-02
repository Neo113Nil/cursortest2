package com.squareup.cash.ui.widget.recycler;

import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import net.oneformapp.PopEncryptorV2_;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class CashRecyclerView$observer$1 extends RecyclerView.AdapterDataObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ CashRecyclerView$observer$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                CashRecyclerView cashRecyclerView = (CashRecyclerView) obj;
                int i2 = CashRecyclerView.$r8$clinit;
                cashRecyclerView.checkEmpty();
                if (cashRecyclerView.state != null) {
                    RecyclerView.Adapter adapter = cashRecyclerView.mAdapter;
                    adapter.getClass();
                    if (adapter.getItemCount() > 0) {
                        Parcelable parcelable = cashRecyclerView.state;
                        parcelable.getClass();
                        super/*androidx.recyclerview.widget.RecyclerView*/.onRestoreInstanceState(parcelable);
                        cashRecyclerView.state = null;
                        Function0 function0 = cashRecyclerView.onStateRestore;
                        if (function0 != null) {
                            function0.invoke();
                            break;
                        }
                    }
                }
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.assertNotInLayoutOrScroll(null);
                recyclerView.mState.mStructureChanged = true;
                recyclerView.processDataSetCompletelyChanged(true);
                if (!recyclerView.mAdapterHelper.hasPendingUpdates()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
            case 2:
                ((FragmentStateAdapter.FragmentMaxLifecycleEnforcer) obj).updateFragmentMaxLifecycle(true);
                break;
            case 3:
                ((PopEncryptorV2_) obj).populateTabsFromPagerAdapter();
                break;
            default:
                ((Choreographers$$ExternalSyntheticLambda1) obj).invoke();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        int i3 = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i3) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj2;
                recyclerView.assertNotInLayoutOrScroll(null);
                AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
                ArrayList arrayList = (ArrayList) adapterHelper.mPendingUpdates;
                if (i2 >= 1) {
                    arrayList.add(adapterHelper.obtainUpdateOp(4, i, obj, i2));
                    adapterHelper.mExistingUpdateTypes |= 4;
                    if (arrayList.size() == 1) {
                        triggerUpdateProcessor();
                        break;
                    }
                }
                break;
            case 2:
                onChanged();
                break;
            case 3:
                ((PopEncryptorV2_) obj2).populateTabsFromPagerAdapter();
                break;
            case 4:
                onItemRangeChanged(i, i2);
                ((Choreographers$$ExternalSyntheticLambda1) obj2).invoke();
                break;
            default:
                super.onItemRangeChanged(i, i2, obj);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i3) {
            case 0:
                int i4 = CashRecyclerView.$r8$clinit;
                ((CashRecyclerView) obj).checkEmpty();
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.assertNotInLayoutOrScroll(null);
                AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
                ArrayList arrayList = (ArrayList) adapterHelper.mPendingUpdates;
                if (i2 >= 1) {
                    arrayList.add(adapterHelper.obtainUpdateOp(1, i, null, i2));
                    adapterHelper.mExistingUpdateTypes |= 1;
                    if (arrayList.size() == 1) {
                        triggerUpdateProcessor();
                        break;
                    }
                }
                break;
            case 2:
                onChanged();
                break;
            case 3:
                ((PopEncryptorV2_) obj).populateTabsFromPagerAdapter();
                break;
            default:
                ((Choreographers$$ExternalSyntheticLambda1) obj).invoke();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i3) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.assertNotInLayoutOrScroll(null);
                AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
                ArrayList arrayList = (ArrayList) adapterHelper.mPendingUpdates;
                if (i != i2) {
                    arrayList.add(adapterHelper.obtainUpdateOp(8, i, null, i2));
                    adapterHelper.mExistingUpdateTypes |= 8;
                    if (arrayList.size() == 1) {
                        triggerUpdateProcessor();
                        break;
                    }
                }
                break;
            case 2:
                onChanged();
                break;
            case 3:
                ((PopEncryptorV2_) obj).populateTabsFromPagerAdapter();
                break;
            case 4:
                ((Choreographers$$ExternalSyntheticLambda1) obj).invoke();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i3) {
            case 0:
                int i4 = CashRecyclerView.$r8$clinit;
                ((CashRecyclerView) obj).checkEmpty();
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.assertNotInLayoutOrScroll(null);
                AdapterHelper adapterHelper = recyclerView.mAdapterHelper;
                ArrayList arrayList = (ArrayList) adapterHelper.mPendingUpdates;
                if (i2 >= 1) {
                    arrayList.add(adapterHelper.obtainUpdateOp(2, i, null, i2));
                    adapterHelper.mExistingUpdateTypes |= 2;
                    if (arrayList.size() == 1) {
                        triggerUpdateProcessor();
                        break;
                    }
                }
                break;
            case 2:
                onChanged();
                break;
            case 3:
                ((PopEncryptorV2_) obj).populateTabsFromPagerAdapter();
                break;
            default:
                ((Choreographers$$ExternalSyntheticLambda1) obj).invoke();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onStateRestorationPolicyChanged() {
        RecyclerView.Adapter adapter;
        switch (this.$r8$classId) {
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.this$0;
                if (recyclerView.mPendingSavedState != null && (adapter = recyclerView.mAdapter) != null && adapter.canRestoreState()) {
                    recyclerView.requestLayout();
                    break;
                }
                break;
        }
    }

    public void triggerUpdateProcessor() {
        RecyclerView recyclerView = (RecyclerView) this.this$0;
        if (!recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            RecyclerView.AnonymousClass1 anonymousClass1 = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            recyclerView.postOnAnimation(anonymousClass1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i3) {
            case 2:
                onChanged();
                break;
            case 3:
                ((PopEncryptorV2_) obj).populateTabsFromPagerAdapter();
                break;
            case 4:
                ((Choreographers$$ExternalSyntheticLambda1) obj).invoke();
                break;
        }
    }
}
