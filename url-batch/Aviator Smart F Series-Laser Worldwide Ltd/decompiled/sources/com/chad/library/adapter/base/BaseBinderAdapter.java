package com.chad.library.adapter.base;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.DiffUtil;
import com.chad.library.adapter.base.binder.BaseItemBinder;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public class BaseBinderAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {
    private final HashMap<Class<?>, DiffUtil.ItemCallback<Object>> classDiffMap;
    private final SparseArray<BaseItemBinder<Object, ?>> mBinderArray;
    private final HashMap<Class<?>, Integer> mTypeMap;

    private final class ItemCallback extends DiffUtil.ItemCallback<Object> {
        public ItemCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            s.checkNotNullParameter(oldItem, "oldItem");
            s.checkNotNullParameter(newItem, "newItem");
            if (!s.areEqual(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return true;
            }
            return itemCallback.areContentsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            s.checkNotNullParameter(oldItem, "oldItem");
            s.checkNotNullParameter(newItem, "newItem");
            return (!s.areEqual(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) ? s.areEqual(oldItem, newItem) : itemCallback.areItemsTheSame(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public Object getChangePayload(Object oldItem, Object newItem) {
            DiffUtil.ItemCallback itemCallback;
            s.checkNotNullParameter(oldItem, "oldItem");
            s.checkNotNullParameter(newItem, "newItem");
            if (!s.areEqual(oldItem.getClass(), newItem.getClass()) || (itemCallback = (DiffUtil.ItemCallback) BaseBinderAdapter.this.classDiffMap.get(oldItem.getClass())) == null) {
                return null;
            }
            return itemCallback.getChangePayload(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBinderAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, Class cls, BaseItemBinder baseItemBinder, DiffUtil.ItemCallback itemCallback, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
        }
        if ((i8 & 4) != 0) {
            itemCallback = null;
        }
        return baseBinderAdapter.addItemBinder(cls, baseItemBinder, itemCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindChildClick$lambda-11$lambda-10$lambda-9, reason: not valid java name */
    public static final boolean m125bindChildClick$lambda11$lambda10$lambda9(BaseViewHolder viewHolder, BaseBinderAdapter this$0, BaseItemBinder provider, View v7) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        s.checkNotNullParameter(provider, "$provider");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(this$0.getData(), headerLayoutCount);
        if (orNull == null) {
            return false;
        }
        s.checkNotNullExpressionValue(v7, "v");
        return provider.onChildLongClick(viewHolder, v7, orNull, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindChildClick$lambda-8$lambda-7$lambda-6, reason: not valid java name */
    public static final void m126bindChildClick$lambda8$lambda7$lambda6(BaseViewHolder viewHolder, BaseBinderAdapter this$0, BaseItemBinder provider, View v7) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        s.checkNotNullParameter(provider, "$provider");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(this$0.getData(), headerLayoutCount);
        if (orNull == null) {
            return;
        }
        s.checkNotNullExpressionValue(v7, "v");
        provider.onChildClick(viewHolder, v7, orNull, headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindClick$lambda-4, reason: not valid java name */
    public static final void m127bindClick$lambda4(BaseViewHolder viewHolder, BaseBinderAdapter this$0, View it) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        BaseItemBinder<Object, BaseViewHolder> itemBinder = this$0.getItemBinder(viewHolder.getItemViewType());
        if (CollectionsKt___CollectionsKt.getOrNull(this$0.getData(), headerLayoutCount) == null) {
            return;
        }
        s.checkNotNullExpressionValue(it, "it");
        itemBinder.onClick(viewHolder, it, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindClick$lambda-5, reason: not valid java name */
    public static final boolean m128bindClick$lambda5(BaseViewHolder viewHolder, BaseBinderAdapter this$0, View it) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        BaseItemBinder<Object, BaseViewHolder> itemBinder = this$0.getItemBinder(viewHolder.getItemViewType());
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(this$0.getData(), headerLayoutCount);
        if (orNull == null) {
            return false;
        }
        s.checkNotNullExpressionValue(it, "it");
        return itemBinder.onLongClick(viewHolder, it, orNull, headerLayoutCount);
    }

    public final <T> BaseBinderAdapter addItemBinder(Class<? extends T> clazz, BaseItemBinder<T, ?> baseItemBinder) {
        s.checkNotNullParameter(clazz, "clazz");
        s.checkNotNullParameter(baseItemBinder, "baseItemBinder");
        return addItemBinder$default(this, clazz, baseItemBinder, null, 4, null);
    }

    protected void bindChildClick(final BaseViewHolder viewHolder, int i8) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        if (getOnItemChildClickListener() == null) {
            final BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(i8);
            Iterator<T> it = itemBinder.getChildClickViewIds().iterator();
            while (it.hasNext()) {
                View findViewById = viewHolder.itemView.findViewById(((Number) it.next()).intValue());
                if (findViewById != null) {
                    s.checkNotNullExpressionValue(findViewById, "findViewById<View>(id)");
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BaseBinderAdapter.m126bindChildClick$lambda8$lambda7$lambda6(BaseViewHolder.this, this, itemBinder, view);
                        }
                    });
                }
            }
        }
        if (getOnItemChildLongClickListener() == null) {
            final BaseItemBinder<Object, BaseViewHolder> itemBinder2 = getItemBinder(i8);
            Iterator<T> it2 = itemBinder2.getChildLongClickViewIds().iterator();
            while (it2.hasNext()) {
                View findViewById2 = viewHolder.itemView.findViewById(((Number) it2.next()).intValue());
                if (findViewById2 != null) {
                    s.checkNotNullExpressionValue(findViewById2, "findViewById<View>(id)");
                    if (!findViewById2.isLongClickable()) {
                        findViewById2.setLongClickable(true);
                    }
                    findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.d
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            boolean m125bindChildClick$lambda11$lambda10$lambda9;
                            m125bindChildClick$lambda11$lambda10$lambda9 = BaseBinderAdapter.m125bindChildClick$lambda11$lambda10$lambda9(BaseViewHolder.this, this, itemBinder2, view);
                            return m125bindChildClick$lambda11$lambda10$lambda9;
                        }
                    });
                }
            }
        }
    }

    protected void bindClick(final BaseViewHolder viewHolder) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        if (getOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseBinderAdapter.m127bindClick$lambda4(BaseViewHolder.this, this, view);
                }
            });
        }
        if (getOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.b
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m128bindClick$lambda5;
                    m128bindClick$lambda5 = BaseBinderAdapter.m128bindClick$lambda5(BaseViewHolder.this, this, view);
                    return m128bindClick$lambda5;
                }
            });
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void bindViewClickListener(BaseViewHolder viewHolder, int i8) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        super.bindViewClickListener(viewHolder, i8);
        bindClick(viewHolder);
        bindChildClick(viewHolder, i8);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(BaseViewHolder holder, Object item) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(item, "item");
        getItemBinder(holder.getItemViewType()).convert(holder, item);
    }

    protected final int findViewType(Class<?> clazz) {
        s.checkNotNullParameter(clazz, "clazz");
        Integer num = this.mTypeMap.get(clazz);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("findViewType: ViewType: " + clazz + " Not Find!").toString());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int i8) {
        return findViewType(getData().get(i8).getClass());
    }

    public BaseItemBinder<Object, BaseViewHolder> getItemBinder(int i8) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = (BaseItemBinder) this.mBinderArray.get(i8);
        if (baseItemBinder != null) {
            return baseItemBinder;
        }
        throw new IllegalStateException(("getItemBinder: viewType '" + i8 + "' no such Binder found，please use addItemBinder() first!").toString());
    }

    public BaseItemBinder<Object, BaseViewHolder> getItemBinderOrNull(int i8) {
        BaseItemBinder<Object, BaseViewHolder> baseItemBinder = (BaseItemBinder) this.mBinderArray.get(i8);
        if (baseItemBinder == null) {
            return null;
        }
        return baseItemBinder;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        BaseItemBinder<Object, BaseViewHolder> itemBinder = getItemBinder(i8);
        itemBinder.set_context$com_github_CymChad_brvah(getContext());
        return itemBinder.onCreateViewHolder(parent, i8);
    }

    public BaseBinderAdapter(List<Object> list) {
        super(0, list);
        this.classDiffMap = new HashMap<>();
        this.mTypeMap = new HashMap<>();
        this.mBinderArray = new SparseArray<>();
        setDiffCallback(new ItemCallback());
    }

    public static /* synthetic */ BaseBinderAdapter addItemBinder$default(BaseBinderAdapter baseBinderAdapter, BaseItemBinder baseItemBinder, DiffUtil.ItemCallback itemCallback, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addItemBinder");
        }
        if ((i8 & 2) != 0) {
            itemCallback = null;
        }
        s.checkNotNullParameter(baseItemBinder, "baseItemBinder");
        s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        baseBinderAdapter.addItemBinder(Object.class, baseItemBinder, itemCallback);
        return baseBinderAdapter;
    }

    public final <T> BaseBinderAdapter addItemBinder(Class<? extends T> clazz, BaseItemBinder<T, ?> baseItemBinder, DiffUtil.ItemCallback<T> itemCallback) {
        s.checkNotNullParameter(clazz, "clazz");
        s.checkNotNullParameter(baseItemBinder, "baseItemBinder");
        int size = this.mTypeMap.size() + 1;
        this.mTypeMap.put(clazz, Integer.valueOf(size));
        this.mBinderArray.append(size, baseItemBinder);
        baseItemBinder.set_adapter$com_github_CymChad_brvah(this);
        if (itemCallback != null) {
            this.classDiffMap.put(clazz, itemCallback);
        }
        return this;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(BaseViewHolder holder, Object item, List<? extends Object> payloads) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(item, "item");
        s.checkNotNullParameter(payloads, "payloads");
        getItemBinder(holder.getItemViewType()).convert(holder, item, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            return itemBinderOrNull.onFailedToRecycleView(holder);
        }
        return false;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((BaseBinderAdapter) holder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewAttachedToWindow(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((BaseBinderAdapter) holder);
        BaseItemBinder<Object, BaseViewHolder> itemBinderOrNull = getItemBinderOrNull(holder.getItemViewType());
        if (itemBinderOrNull != null) {
            itemBinderOrNull.onViewDetachedFromWindow(holder);
        }
    }

    public /* synthetic */ BaseBinderAdapter(List list, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : list);
    }

    public final /* synthetic */ <T> BaseBinderAdapter addItemBinder(BaseItemBinder<T, ?> baseItemBinder, DiffUtil.ItemCallback<T> itemCallback) {
        s.checkNotNullParameter(baseItemBinder, "baseItemBinder");
        s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        addItemBinder(Object.class, baseItemBinder, itemCallback);
        return this;
    }
}
