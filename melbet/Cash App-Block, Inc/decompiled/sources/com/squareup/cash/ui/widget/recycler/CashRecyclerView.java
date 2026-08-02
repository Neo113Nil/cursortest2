package com.squareup.cash.ui.widget.recycler;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.composable.adapter.AdapterSavedState;
import com.squareup.cash.composable.adapter.ComposableAdapter;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public class CashRecyclerView extends RecyclerView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public View emptyView;
    public final CashRecyclerView$observer$1 observer;
    public Function0 onStateRestore;
    public Parcelable state;
    public Function0 touchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.observer = new CashRecyclerView$observer$1(this, 0);
    }

    public final void checkEmpty() {
        RecyclerView.Adapter adapter = this.mAdapter;
        View view = this.emptyView;
        if (view == null || adapter == null) {
            return;
        }
        view.setVisibility(adapter.getItemCount() == 0 ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.touchListener != null && motionEvent.getActionMasked() == 0) {
            Function0 function0 = this.touchListener;
            function0.getClass();
            function0.invoke();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof RecyclerViewSavedState)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        RecyclerViewSavedState recyclerViewSavedState = (RecyclerViewSavedState) parcelable;
        Parcelable parcelable2 = recyclerViewSavedState.superState;
        super.onRestoreInstanceState(parcelable2);
        RecyclerView.Adapter adapter = this.mAdapter;
        ComposableAdapter composableAdapter = adapter instanceof ComposableAdapter ? (ComposableAdapter) adapter : null;
        if (composableAdapter != null) {
            Parcelable parcelable3 = recyclerViewSavedState.adapterState;
            parcelable3.getClass();
            if (!(parcelable3 instanceof AdapterSavedState)) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return;
            }
            composableAdapter.states.putAll(((AdapterSavedState) parcelable3).viewStates);
        }
        Function0 function0 = this.onStateRestore;
        if (function0 != null) {
            function0.invoke();
        }
        this.state = parcelable2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        RecyclerView.Adapter adapter = this.mAdapter;
        AdapterSavedState adapterSavedState = null;
        ComposableAdapter composableAdapter = adapter instanceof ComposableAdapter ? (ComposableAdapter) adapter : null;
        if (composableAdapter != null) {
            if (composableAdapter.hasStableIds()) {
                Iterator it = new ViewGroupKt$children$1(this).iterator();
                while (true) {
                    ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
                    if (!viewGroupKt$iterator$1.hasNext()) {
                        break;
                    }
                    RecyclerView.ViewHolder childViewHolder = getChildViewHolder((View) viewGroupKt$iterator$1.next());
                    childViewHolder.getClass();
                    composableAdapter.saveState(childViewHolder);
                }
            }
            adapterSavedState = new AdapterSavedState(composableAdapter.states);
        }
        return new RecyclerViewSavedState(onSaveInstanceState, adapterSavedState);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mAdapter;
        CashRecyclerView$observer$1 cashRecyclerView$observer$1 = this.observer;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(cashRecyclerView$observer$1);
        }
        super.setAdapter(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(cashRecyclerView$observer$1);
            checkEmpty();
        }
    }

    public final void setEmptyView(View view) {
        View view2 = this.emptyView;
        if (view2 != null) {
            view2.getClass();
            view2.setVisibility(8);
        }
        this.emptyView = view;
        checkEmpty();
    }

    public final void setOnStateRestore(Function0<Unit> function0) {
        this.onStateRestore = function0;
    }

    public final void setTouchListener(Function0<Unit> function0) {
        this.touchListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashRecyclerView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ CashRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
