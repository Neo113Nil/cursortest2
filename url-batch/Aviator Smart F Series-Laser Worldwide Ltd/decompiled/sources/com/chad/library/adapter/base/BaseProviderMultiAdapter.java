package com.chad.library.adapter.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class BaseProviderMultiAdapter<T> extends BaseQuickAdapter<T, BaseViewHolder> {
    private final y5.f mItemProviders$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseProviderMultiAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindChildClick$lambda-6$lambda-5$lambda-4, reason: not valid java name */
    public static final void m129bindChildClick$lambda6$lambda5$lambda4(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, BaseItemProvider provider, View v7) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        s.checkNotNullParameter(provider, "$provider");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        s.checkNotNullExpressionValue(v7, "v");
        provider.onChildClick(viewHolder, v7, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindChildClick$lambda-9$lambda-8$lambda-7, reason: not valid java name */
    public static final boolean m130bindChildClick$lambda9$lambda8$lambda7(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, BaseItemProvider provider, View v7) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        s.checkNotNullParameter(provider, "$provider");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        s.checkNotNullExpressionValue(v7, "v");
        return provider.onChildLongClick(viewHolder, v7, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindClick$lambda-2, reason: not valid java name */
    public static final void m131bindClick$lambda2(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, View it) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        BaseItemProvider<T> baseItemProvider = this$0.getMItemProviders().get(viewHolder.getItemViewType());
        s.checkNotNullExpressionValue(it, "it");
        baseItemProvider.onClick(viewHolder, it, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindClick$lambda-3, reason: not valid java name */
    public static final boolean m132bindClick$lambda3(BaseViewHolder viewHolder, BaseProviderMultiAdapter this$0, View it) {
        s.checkNotNullParameter(viewHolder, "$viewHolder");
        s.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
        BaseItemProvider<T> baseItemProvider = this$0.getMItemProviders().get(viewHolder.getItemViewType());
        s.checkNotNullExpressionValue(it, "it");
        return baseItemProvider.onLongClick(viewHolder, it, this$0.getData().get(headerLayoutCount), headerLayoutCount);
    }

    private final SparseArray<BaseItemProvider<T>> getMItemProviders() {
        return (SparseArray) this.mItemProviders$delegate.getValue();
    }

    public void addItemProvider(BaseItemProvider<T> provider) {
        s.checkNotNullParameter(provider, "provider");
        provider.setAdapter$com_github_CymChad_brvah(this);
        getMItemProviders().put(provider.getItemViewType(), provider);
    }

    protected void bindChildClick(final BaseViewHolder viewHolder, int i8) {
        final BaseItemProvider<T> itemProvider;
        s.checkNotNullParameter(viewHolder, "viewHolder");
        if (getOnItemChildClickListener() == null) {
            final BaseItemProvider<T> itemProvider2 = getItemProvider(i8);
            if (itemProvider2 == null) {
                return;
            }
            Iterator<T> it = itemProvider2.getChildClickViewIds().iterator();
            while (it.hasNext()) {
                View findViewById = viewHolder.itemView.findViewById(((Number) it.next()).intValue());
                if (findViewById != null) {
                    s.checkNotNullExpressionValue(findViewById, "findViewById<View>(id)");
                    if (!findViewById.isClickable()) {
                        findViewById.setClickable(true);
                    }
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BaseProviderMultiAdapter.m129bindChildClick$lambda6$lambda5$lambda4(BaseViewHolder.this, this, itemProvider2, view);
                        }
                    });
                }
            }
        }
        if (getOnItemChildLongClickListener() != null || (itemProvider = getItemProvider(i8)) == null) {
            return;
        }
        Iterator<T> it2 = itemProvider.getChildLongClickViewIds().iterator();
        while (it2.hasNext()) {
            View findViewById2 = viewHolder.itemView.findViewById(((Number) it2.next()).intValue());
            if (findViewById2 != null) {
                s.checkNotNullExpressionValue(findViewById2, "findViewById<View>(id)");
                if (!findViewById2.isLongClickable()) {
                    findViewById2.setLongClickable(true);
                }
                findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.f
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m130bindChildClick$lambda9$lambda8$lambda7;
                        m130bindChildClick$lambda9$lambda8$lambda7 = BaseProviderMultiAdapter.m130bindChildClick$lambda9$lambda8$lambda7(BaseViewHolder.this, this, itemProvider, view);
                        return m130bindChildClick$lambda9$lambda8$lambda7;
                    }
                });
            }
        }
    }

    protected void bindClick(final BaseViewHolder viewHolder) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        if (getOnItemClickListener() == null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseProviderMultiAdapter.m131bindClick$lambda2(BaseViewHolder.this, this, view);
                }
            });
        }
        if (getOnItemLongClickListener() == null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.h
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m132bindClick$lambda3;
                    m132bindClick$lambda3 = BaseProviderMultiAdapter.m132bindClick$lambda3(BaseViewHolder.this, this, view);
                    return m132bindClick$lambda3;
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
    protected void convert(BaseViewHolder holder, T t7) {
        s.checkNotNullParameter(holder, "holder");
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        s.checkNotNull(itemProvider);
        itemProvider.convert(holder, t7);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected int getDefItemViewType(int i8) {
        return getItemType(getData(), i8);
    }

    protected BaseItemProvider<T> getItemProvider(int i8) {
        return getMItemProviders().get(i8);
    }

    protected abstract int getItemType(List<? extends T> list, int i8);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        BaseItemProvider<T> itemProvider = getItemProvider(i8);
        if (itemProvider == null) {
            throw new IllegalStateException(("ViewType: " + i8 + " no such provider found，please use addItemProvider() first!").toString());
        }
        Context context = parent.getContext();
        s.checkNotNullExpressionValue(context, "parent.context");
        itemProvider.setContext(context);
        BaseViewHolder onCreateViewHolder = itemProvider.onCreateViewHolder(parent, i8);
        itemProvider.onViewHolderCreated(onCreateViewHolder, i8);
        return onCreateViewHolder;
    }

    public /* synthetic */ BaseProviderMultiAdapter(List list, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected void convert(BaseViewHolder holder, T t7, List<? extends Object> payloads) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(payloads, "payloads");
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        s.checkNotNull(itemProvider);
        itemProvider.convert(holder, t7, payloads);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((BaseProviderMultiAdapter<T>) holder);
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewAttachedToWindow(holder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(BaseViewHolder holder) {
        s.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((BaseProviderMultiAdapter<T>) holder);
        BaseItemProvider<T> itemProvider = getItemProvider(holder.getItemViewType());
        if (itemProvider != null) {
            itemProvider.onViewDetachedFromWindow(holder);
        }
    }

    public BaseProviderMultiAdapter(List<T> list) {
        super(0, list);
        y5.f lazy;
        lazy = kotlin.b.lazy(LazyThreadSafetyMode.NONE, (f6.a) new f6.a() { // from class: com.chad.library.adapter.base.BaseProviderMultiAdapter$mItemProviders$2
            @Override // f6.a
            public final SparseArray<BaseItemProvider<T>> invoke() {
                return new SparseArray<>();
            }
        });
        this.mItemProviders$delegate = lazy;
    }
}
