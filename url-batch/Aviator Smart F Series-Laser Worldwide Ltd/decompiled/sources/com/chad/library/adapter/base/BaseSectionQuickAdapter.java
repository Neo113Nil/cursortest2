package com.chad.library.adapter.base;

import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class BaseSectionQuickAdapter<T extends SectionEntity, VH extends BaseViewHolder> extends BaseMultiItemQuickAdapter<T, VH> {
    private final int sectionHeadResId;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseSectionQuickAdapter(@LayoutRes int i8) {
        this(i8, null, 2, 0 == true ? 1 : 0);
    }

    protected abstract void convertHeader(VH vh, T t7);

    protected void convertHeader(VH helper, T item, List<Object> payloads) {
        s.checkNotNullParameter(helper, "helper");
        s.checkNotNullParameter(item, "item");
        s.checkNotNullParameter(payloads, "payloads");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    protected boolean isFixedViewType(int i8) {
        return super.isFixedViewType(i8) || i8 == -99;
    }

    protected final void setNormalLayout(@LayoutRes int i8) {
        addItemType(-100, i8);
    }

    public /* synthetic */ BaseSectionQuickAdapter(int i8, List list, int i9, o oVar) {
        this(i8, (i9 & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8, List list) {
        onBindViewHolder((BaseSectionQuickAdapter<T, VH>) viewHolder, i8, (List<Object>) list);
    }

    public BaseSectionQuickAdapter(@LayoutRes int i8, List<T> list) {
        super(list);
        this.sectionHeadResId = i8;
        addItemType(-99, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH holder, int i8) {
        s.checkNotNullParameter(holder, "holder");
        if (holder.getItemViewType() == -99) {
            convertHeader(holder, (SectionEntity) getItem(i8 - getHeaderLayoutCount()));
        } else {
            super.onBindViewHolder((BaseSectionQuickAdapter<T, VH>) holder, i8);
        }
    }

    public /* synthetic */ BaseSectionQuickAdapter(int i8, int i9, List list, int i10, o oVar) {
        this(i8, i9, (i10 & 4) != 0 ? null : list);
    }

    public BaseSectionQuickAdapter(@LayoutRes int i8, @LayoutRes int i9, List<T> list) {
        this(i8, list);
        setNormalLayout(i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void onBindViewHolder(VH holder, int i8, List<Object> payloads) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder((BaseSectionQuickAdapter<T, VH>) holder, i8);
        } else if (holder.getItemViewType() == -99) {
            convertHeader(holder, (SectionEntity) getItem(i8 - getHeaderLayoutCount()), payloads);
        } else {
            super.onBindViewHolder((BaseSectionQuickAdapter<T, VH>) holder, i8, payloads);
        }
    }
}
