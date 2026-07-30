package com.chad.library.adapter.base.module;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.R$id;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import com.chad.library.adapter.base.listener.DraggableListenerImp;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Collections;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public class BaseDraggableModule implements DraggableListenerImp {
    public static final Companion Companion = new Companion(null);
    private static final int NO_TOGGLE_VIEW = 0;
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean isDragEnabled;
    private boolean isDragOnLongPressEnabled;
    private boolean isSwipeEnabled;
    public ItemTouchHelper itemTouchHelper;
    public DragAndSwipeCallback itemTouchHelperCallback;
    private OnItemDragListener mOnItemDragListener;
    private OnItemSwipeListener mOnItemSwipeListener;
    private View.OnLongClickListener mOnToggleViewLongClickListener;
    private View.OnTouchListener mOnToggleViewTouchListener;
    private int toggleViewId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public BaseDraggableModule(BaseQuickAdapter<?, ?> baseQuickAdapter) {
        s.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        this.baseQuickAdapter = baseQuickAdapter;
        initItemTouch();
        this.isDragOnLongPressEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_isDragOnLongPressEnabled_$lambda-0, reason: not valid java name */
    public static final boolean m139_set_isDragOnLongPressEnabled_$lambda0(BaseDraggableModule this$0, View view) {
        s.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isDragEnabled) {
            return true;
        }
        ItemTouchHelper itemTouchHelper = this$0.getItemTouchHelper();
        Object tag = view.getTag(R$id.BaseQuickAdapter_viewholder_support);
        if (tag == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
        }
        itemTouchHelper.startDrag((RecyclerView.ViewHolder) tag);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_isDragOnLongPressEnabled_$lambda-1, reason: not valid java name */
    public static final boolean m140_set_isDragOnLongPressEnabled_$lambda1(BaseDraggableModule this$0, View view, MotionEvent motionEvent) {
        s.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() != 0 || this$0.isDragOnLongPressEnabled()) {
            return false;
        }
        if (this$0.isDragEnabled) {
            ItemTouchHelper itemTouchHelper = this$0.getItemTouchHelper();
            Object tag = view.getTag(R$id.BaseQuickAdapter_viewholder_support);
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.ViewHolder");
            }
            itemTouchHelper.startDrag((RecyclerView.ViewHolder) tag);
        }
        return true;
    }

    private final boolean inRange(int i8) {
        return i8 >= 0 && i8 < this.baseQuickAdapter.getData().size();
    }

    private final void initItemTouch() {
        setItemTouchHelperCallback(new DragAndSwipeCallback(this));
        setItemTouchHelper(new ItemTouchHelper(getItemTouchHelperCallback()));
    }

    public final void attachToRecyclerView(RecyclerView recyclerView) {
        s.checkNotNullParameter(recyclerView, "recyclerView");
        getItemTouchHelper().attachToRecyclerView(recyclerView);
    }

    public final ItemTouchHelper getItemTouchHelper() {
        ItemTouchHelper itemTouchHelper = this.itemTouchHelper;
        if (itemTouchHelper != null) {
            return itemTouchHelper;
        }
        s.throwUninitializedPropertyAccessException("itemTouchHelper");
        return null;
    }

    public final DragAndSwipeCallback getItemTouchHelperCallback() {
        DragAndSwipeCallback dragAndSwipeCallback = this.itemTouchHelperCallback;
        if (dragAndSwipeCallback != null) {
            return dragAndSwipeCallback;
        }
        s.throwUninitializedPropertyAccessException("itemTouchHelperCallback");
        return null;
    }

    protected final OnItemDragListener getMOnItemDragListener() {
        return this.mOnItemDragListener;
    }

    protected final OnItemSwipeListener getMOnItemSwipeListener() {
        return this.mOnItemSwipeListener;
    }

    protected final View.OnLongClickListener getMOnToggleViewLongClickListener() {
        return this.mOnToggleViewLongClickListener;
    }

    protected final View.OnTouchListener getMOnToggleViewTouchListener() {
        return this.mOnToggleViewTouchListener;
    }

    public final int getToggleViewId() {
        return this.toggleViewId;
    }

    protected final int getViewHolderPosition(RecyclerView.ViewHolder viewHolder) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        return viewHolder.getAdapterPosition() - this.baseQuickAdapter.getHeaderLayoutCount();
    }

    public boolean hasToggleView() {
        return this.toggleViewId != 0;
    }

    public final void initView$com_github_CymChad_brvah(BaseViewHolder holder) {
        View findViewById;
        s.checkNotNullParameter(holder, "holder");
        if (this.isDragEnabled && hasToggleView() && (findViewById = holder.itemView.findViewById(this.toggleViewId)) != null) {
            findViewById.setTag(R$id.BaseQuickAdapter_viewholder_support, holder);
            if (isDragOnLongPressEnabled()) {
                findViewById.setOnLongClickListener(this.mOnToggleViewLongClickListener);
            } else {
                findViewById.setOnTouchListener(this.mOnToggleViewTouchListener);
            }
        }
    }

    public final boolean isDragEnabled() {
        return this.isDragEnabled;
    }

    public boolean isDragOnLongPressEnabled() {
        return this.isDragOnLongPressEnabled;
    }

    public final boolean isSwipeEnabled() {
        return this.isSwipeEnabled;
    }

    public void onItemDragEnd(RecyclerView.ViewHolder viewHolder) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragEnd(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemDragMoving(RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
        s.checkNotNullParameter(source, "source");
        s.checkNotNullParameter(target, "target");
        int viewHolderPosition = getViewHolderPosition(source);
        int viewHolderPosition2 = getViewHolderPosition(target);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition < viewHolderPosition2) {
                int i8 = viewHolderPosition;
                while (i8 < viewHolderPosition2) {
                    int i9 = i8 + 1;
                    Collections.swap(this.baseQuickAdapter.getData(), i8, i9);
                    i8 = i9;
                }
            } else {
                int i10 = viewHolderPosition2 + 1;
                if (i10 <= viewHolderPosition) {
                    int i11 = viewHolderPosition;
                    while (true) {
                        Collections.swap(this.baseQuickAdapter.getData(), i11, i11 - 1);
                        if (i11 == i10) {
                            break;
                        } else {
                            i11--;
                        }
                    }
                }
            }
            this.baseQuickAdapter.notifyItemMoved(source.getAdapterPosition(), target.getAdapterPosition());
        }
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragMoving(source, viewHolderPosition, target, viewHolderPosition2);
        }
    }

    public void onItemDragStart(RecyclerView.ViewHolder viewHolder) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener != null) {
            onItemDragListener.onItemDragStart(viewHolder, getViewHolderPosition(viewHolder));
        }
    }

    public void onItemSwipeClear(RecyclerView.ViewHolder viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        s.checkNotNullParameter(viewHolder, "viewHolder");
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.clearView(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwipeStart(RecyclerView.ViewHolder viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        s.checkNotNullParameter(viewHolder, "viewHolder");
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.onItemSwipeStart(viewHolder, getViewHolderPosition(viewHolder));
    }

    public void onItemSwiped(RecyclerView.ViewHolder viewHolder) {
        OnItemSwipeListener onItemSwipeListener;
        s.checkNotNullParameter(viewHolder, "viewHolder");
        int viewHolderPosition = getViewHolderPosition(viewHolder);
        if (inRange(viewHolderPosition)) {
            this.baseQuickAdapter.getData().remove(viewHolderPosition);
            this.baseQuickAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
                return;
            }
            onItemSwipeListener.onItemSwiped(viewHolder, viewHolderPosition);
        }
    }

    public void onItemSwiping(Canvas canvas, RecyclerView.ViewHolder viewHolder, float f8, float f9, boolean z7) {
        OnItemSwipeListener onItemSwipeListener;
        if (!this.isSwipeEnabled || (onItemSwipeListener = this.mOnItemSwipeListener) == null) {
            return;
        }
        onItemSwipeListener.onItemSwipeMoving(canvas, viewHolder, f8, f9, z7);
    }

    public final void setDragEnabled(boolean z7) {
        this.isDragEnabled = z7;
    }

    public void setDragOnLongPressEnabled(boolean z7) {
        this.isDragOnLongPressEnabled = z7;
        if (z7) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.module.a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m139_set_isDragOnLongPressEnabled_$lambda0;
                    m139_set_isDragOnLongPressEnabled_$lambda0 = BaseDraggableModule.m139_set_isDragOnLongPressEnabled_$lambda0(BaseDraggableModule.this, view);
                    return m139_set_isDragOnLongPressEnabled_$lambda0;
                }
            };
        } else {
            this.mOnToggleViewTouchListener = new View.OnTouchListener() { // from class: com.chad.library.adapter.base.module.b
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m140_set_isDragOnLongPressEnabled_$lambda1;
                    m140_set_isDragOnLongPressEnabled_$lambda1 = BaseDraggableModule.m140_set_isDragOnLongPressEnabled_$lambda1(BaseDraggableModule.this, view, motionEvent);
                    return m140_set_isDragOnLongPressEnabled_$lambda1;
                }
            };
            this.mOnToggleViewLongClickListener = null;
        }
    }

    public final void setItemTouchHelper(ItemTouchHelper itemTouchHelper) {
        s.checkNotNullParameter(itemTouchHelper, "<set-?>");
        this.itemTouchHelper = itemTouchHelper;
    }

    public final void setItemTouchHelperCallback(DragAndSwipeCallback dragAndSwipeCallback) {
        s.checkNotNullParameter(dragAndSwipeCallback, "<set-?>");
        this.itemTouchHelperCallback = dragAndSwipeCallback;
    }

    protected final void setMOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    protected final void setMOnItemSwipeListener(OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    protected final void setMOnToggleViewLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mOnToggleViewLongClickListener = onLongClickListener;
    }

    protected final void setMOnToggleViewTouchListener(View.OnTouchListener onTouchListener) {
        this.mOnToggleViewTouchListener = onTouchListener;
    }

    @Override // com.chad.library.adapter.base.listener.DraggableListenerImp
    public void setOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    @Override // com.chad.library.adapter.base.listener.DraggableListenerImp
    public void setOnItemSwipeListener(OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    public final void setSwipeEnabled(boolean z7) {
        this.isSwipeEnabled = z7;
    }

    public final void setToggleViewId(int i8) {
        this.toggleViewId = i8;
    }
}
