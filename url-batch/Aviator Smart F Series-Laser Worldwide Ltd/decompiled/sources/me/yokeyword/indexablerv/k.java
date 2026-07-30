package me.yokeyword.indexablerv;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.yokeyword.indexablerv.d;

/* loaded from: classes5.dex */
class k extends RecyclerView.Adapter {
    private d mAdapter;
    private d.b mContentClickListener;
    private d.c mContentLongClickListener;
    private ArrayList<me.yokeyword.indexablerv.b> mDatas;
    private d.InterfaceC0377d mTitleClickListener;
    private d.e mTitleLongClickListener;
    private ArrayList<me.yokeyword.indexablerv.b> mDatasList = new ArrayList<>();
    private ArrayList<me.yokeyword.indexablerv.b> mHeaderDatasList = new ArrayList<>();
    private ArrayList<me.yokeyword.indexablerv.b> mFooterDatasList = new ArrayList<>();
    private SparseArray<g> mHeaderAdapterMap = new SparseArray<>();
    private SparseArray<f> mFooterAdapterMap = new SparseArray<>();

    class a implements View.OnClickListener {
        final /* synthetic */ RecyclerView.ViewHolder val$holder;
        final /* synthetic */ int val$viewType;

        a(RecyclerView.ViewHolder viewHolder, int i8) {
            this.val$holder = viewHolder;
            this.val$viewType = i8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int adapterPosition = this.val$holder.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            me.yokeyword.indexablerv.b bVar = (me.yokeyword.indexablerv.b) k.this.mDatasList.get(adapterPosition);
            int i8 = this.val$viewType;
            if (i8 == 2147483646) {
                k.access$100(k.this);
                return;
            }
            if (i8 == Integer.MAX_VALUE) {
                if (k.this.mContentClickListener != null) {
                    k.this.mContentClickListener.onItemClick(view, bVar.getOriginalPosition(), adapterPosition, bVar.getData());
                }
            } else {
                me.yokeyword.indexablerv.a aVar = k.this.mHeaderAdapterMap.indexOfKey(this.val$viewType) >= 0 ? (me.yokeyword.indexablerv.a) k.this.mHeaderAdapterMap.get(this.val$viewType) : (me.yokeyword.indexablerv.a) k.this.mFooterAdapterMap.get(this.val$viewType);
                if (aVar != null) {
                    aVar.getOnItemClickListener();
                }
            }
        }
    }

    class b implements View.OnLongClickListener {
        final /* synthetic */ RecyclerView.ViewHolder val$holder;
        final /* synthetic */ int val$viewType;

        b(RecyclerView.ViewHolder viewHolder, int i8) {
            this.val$holder = viewHolder;
            this.val$viewType = i8;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int i8 = this.val$viewType;
            if (i8 == 2147483646) {
                k.access$500(k.this);
                return true;
            }
            if (i8 == Integer.MAX_VALUE) {
                k.access$600(k.this);
                return true;
            }
            me.yokeyword.indexablerv.a aVar = k.this.mHeaderAdapterMap.indexOfKey(this.val$viewType) >= 0 ? (me.yokeyword.indexablerv.a) k.this.mHeaderAdapterMap.get(this.val$viewType) : (me.yokeyword.indexablerv.a) k.this.mFooterAdapterMap.get(this.val$viewType);
            if (aVar == null) {
                return false;
            }
            aVar.getOnItemLongClickListener();
            return false;
        }
    }

    k() {
    }

    static /* synthetic */ d.InterfaceC0377d access$100(k kVar) {
        kVar.getClass();
        return null;
    }

    static /* synthetic */ d.e access$500(k kVar) {
        kVar.getClass();
        return null;
    }

    static /* synthetic */ d.c access$600(k kVar) {
        kVar.getClass();
        return null;
    }

    private void processAddHeaderFooterData(ArrayList<me.yokeyword.indexablerv.b> arrayList, me.yokeyword.indexablerv.b bVar, me.yokeyword.indexablerv.b bVar2) {
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (arrayList.get(i8) == bVar) {
                int i9 = i8 + 1;
                arrayList.add(i9, bVar2);
                this.mDatasList.add(arrayList == this.mFooterDatasList ? (this.mDatasList.size() - this.mFooterDatasList.size()) + 1 + i9 : i9, bVar2);
                notifyItemInserted(i9);
                return;
            }
        }
    }

    private void processremoveHeaderFooterData(ArrayList<me.yokeyword.indexablerv.b> arrayList, me.yokeyword.indexablerv.b bVar) {
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (arrayList.get(i8) == bVar) {
                arrayList.remove(bVar);
                this.mDatasList.remove(bVar);
                notifyItemRemoved(i8);
                return;
            }
        }
    }

    void addHeaderFooterData(boolean z7, me.yokeyword.indexablerv.b bVar, me.yokeyword.indexablerv.b bVar2) {
        processAddHeaderFooterData(z7 ? this.mHeaderDatasList : this.mFooterDatasList, bVar, bVar2);
    }

    void addIndexableFooterAdapter(f fVar) {
        this.mFooterDatasList.addAll(fVar.getDatas());
        this.mDatasList.addAll(fVar.getDatas());
        this.mFooterAdapterMap.put(fVar.getItemViewType(), fVar);
        notifyDataSetChanged();
    }

    void addIndexableHeaderAdapter(g gVar) {
        this.mHeaderDatasList.addAll(0, gVar.getDatas());
        this.mDatasList.addAll(0, gVar.getDatas());
        this.mHeaderAdapterMap.put(gVar.getItemViewType(), gVar);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDatasList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return this.mDatasList.get(i8).getItemType();
    }

    ArrayList<me.yokeyword.indexablerv.b> getItems() {
        return this.mDatasList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        me.yokeyword.indexablerv.b bVar = this.mDatasList.get(i8);
        int itemViewType = getItemViewType(i8);
        if (itemViewType == 2147483646) {
            if (4 == viewHolder.itemView.getVisibility()) {
                viewHolder.itemView.setVisibility(0);
            }
            this.mAdapter.onBindTitleViewHolder(viewHolder, bVar.getIndexTitle());
        } else if (itemViewType == Integer.MAX_VALUE) {
            this.mAdapter.onBindContentViewHolder(viewHolder, (e) bVar.getData());
        } else {
            (this.mHeaderAdapterMap.indexOfKey(itemViewType) >= 0 ? this.mHeaderAdapterMap.get(itemViewType) : this.mFooterAdapterMap.get(itemViewType)).onBindContentViewHolder(viewHolder, bVar.getData());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        RecyclerView.ViewHolder onCreateContentViewHolder;
        if (i8 == 2147483646) {
            onCreateContentViewHolder = this.mAdapter.onCreateTitleViewHolder(viewGroup);
        } else if (i8 == Integer.MAX_VALUE) {
            onCreateContentViewHolder = this.mAdapter.onCreateContentViewHolder(viewGroup);
        } else {
            onCreateContentViewHolder = (this.mHeaderAdapterMap.indexOfKey(i8) >= 0 ? this.mHeaderAdapterMap.get(i8) : this.mFooterAdapterMap.get(i8)).onCreateContentViewHolder(viewGroup);
        }
        onCreateContentViewHolder.itemView.setOnClickListener(new a(onCreateContentViewHolder, i8));
        onCreateContentViewHolder.itemView.setOnLongClickListener(new b(onCreateContentViewHolder, i8));
        return onCreateContentViewHolder;
    }

    void removeHeaderFooterData(boolean z7, me.yokeyword.indexablerv.b bVar) {
        processremoveHeaderFooterData(z7 ? this.mHeaderDatasList : this.mFooterDatasList, bVar);
    }

    void removeIndexableFooterAdapter(f fVar) {
        this.mFooterDatasList.removeAll(fVar.getDatas());
        if (this.mDatasList.size() > 0) {
            this.mDatasList.removeAll(fVar.getDatas());
        }
        this.mFooterAdapterMap.remove(fVar.getItemViewType());
        notifyDataSetChanged();
    }

    void removeIndexableHeaderAdapter(g gVar) {
        this.mHeaderDatasList.removeAll(gVar.getDatas());
        if (this.mDatasList.size() > 0) {
            this.mDatasList.removeAll(gVar.getDatas());
        }
        this.mHeaderAdapterMap.remove(gVar.getItemViewType());
        notifyDataSetChanged();
    }

    void setDatas(ArrayList<me.yokeyword.indexablerv.b> arrayList) {
        if (this.mDatas != null && this.mDatasList.size() > this.mHeaderDatasList.size() + this.mFooterDatasList.size()) {
            this.mDatasList.removeAll(this.mDatas);
        }
        this.mDatas = arrayList;
        this.mDatasList.addAll(this.mHeaderDatasList.size(), arrayList);
        notifyDataSetChanged();
    }

    void setIndexableAdapter(d dVar) {
        this.mAdapter = dVar;
    }

    void setOnItemContentClickListener(d.b bVar) {
        this.mContentClickListener = bVar;
    }

    void setOnItemContentLongClickListener(d.c cVar) {
    }

    void setOnItemTitleClickListener(d.InterfaceC0377d interfaceC0377d) {
    }

    void setOnItemTitleLongClickListener(d.e eVar) {
    }
}
