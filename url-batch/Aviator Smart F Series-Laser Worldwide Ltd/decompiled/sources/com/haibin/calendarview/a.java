package com.haibin.calendarview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
abstract class a extends RecyclerView.Adapter {
    Context mContext;
    LayoutInflater mInflater;
    private List<Object> mItems = new ArrayList();
    private b onClickListener = new C0286a();
    private c onItemClickListener;

    /* renamed from: com.haibin.calendarview.a$a, reason: collision with other inner class name */
    class C0286a extends b {
        C0286a() {
        }

        @Override // com.haibin.calendarview.a.b
        public void onClick(int i8, long j8) {
            if (a.this.onItemClickListener != null) {
                a.this.onItemClickListener.onItemClick(i8, j8);
            }
        }
    }

    static abstract class b implements View.OnClickListener {
        b() {
        }

        public abstract void onClick(int i8, long j8);

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            onClick(viewHolder.getAdapterPosition(), viewHolder.getItemId());
        }
    }

    interface c {
        void onItemClick(int i8, long j8);
    }

    a(Context context) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
    }

    void addAll(List<Object> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mItems.addAll(list);
        notifyItemRangeInserted(this.mItems.size(), list.size());
    }

    final void addItem(Object obj) {
        if (obj != null) {
            this.mItems.add(obj);
            notifyItemChanged(this.mItems.size());
        }
    }

    final Object getItem(int i8) {
        if (i8 < 0 || i8 >= this.mItems.size()) {
            return null;
        }
        return this.mItems.get(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mItems.size();
    }

    final List<Object> getItems() {
        return this.mItems;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i8) {
        onBindViewHolder(viewHolder, this.mItems.get(i8), i8);
    }

    abstract void onBindViewHolder(RecyclerView.ViewHolder viewHolder, Object obj, int i8);

    abstract RecyclerView.ViewHolder onCreateDefaultViewHolder(ViewGroup viewGroup, int i8);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i8) {
        RecyclerView.ViewHolder onCreateDefaultViewHolder = onCreateDefaultViewHolder(viewGroup, i8);
        if (onCreateDefaultViewHolder != null) {
            onCreateDefaultViewHolder.itemView.setTag(onCreateDefaultViewHolder);
            onCreateDefaultViewHolder.itemView.setOnClickListener(this.onClickListener);
        }
        return onCreateDefaultViewHolder;
    }

    void setOnItemClickListener(c cVar) {
        this.onItemClickListener = cVar;
    }
}
