package me.yokeyword.indexablerv;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
abstract class a {
    private String mIndex;
    private String mIndexTitle;
    protected InterfaceC0376a mListener;
    protected b mLongListener;
    private final n6.c mDataSetObservable = new n6.c();
    private final n6.e mIndexBarDataSetObservable = new n6.e();
    ArrayList<me.yokeyword.indexablerv.b> mEntityWrapperList = new ArrayList<>();

    /* renamed from: me.yokeyword.indexablerv.a$a, reason: collision with other inner class name */
    interface InterfaceC0376a {
    }

    interface b {
    }

    public a(String str, String str2, List<Object> list) {
        this.mIndex = str;
        this.mIndexTitle = str2;
        if (str2 != null) {
            wrapEntity().setItemType(2147483646);
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            wrapEntity().setData(list.get(i8));
        }
    }

    private me.yokeyword.indexablerv.b wrapEntity() {
        me.yokeyword.indexablerv.b bVar = new me.yokeyword.indexablerv.b();
        bVar.setIndex(this.mIndex);
        bVar.setIndexTitle(this.mIndexTitle);
        bVar.setHeaderFooterType(getHeaderFooterType());
        this.mEntityWrapperList.add(bVar);
        return bVar;
    }

    public void addData(Object obj) {
        int size = this.mEntityWrapperList.size();
        me.yokeyword.indexablerv.b wrapEntity = wrapEntity();
        wrapEntity.setItemType(getItemViewType());
        wrapEntity.setData(obj);
        if (size > 0) {
            this.mDataSetObservable.notifyAdd(getHeaderFooterType() == 1, this.mEntityWrapperList.get(size - 1), wrapEntity);
            this.mIndexBarDataSetObservable.notifyChanged();
        }
    }

    public void addDatas(List<Object> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            addData(list.get(i8));
        }
    }

    ArrayList<me.yokeyword.indexablerv.b> getDatas() {
        Iterator<me.yokeyword.indexablerv.b> it = this.mEntityWrapperList.iterator();
        while (it.hasNext()) {
            me.yokeyword.indexablerv.b next = it.next();
            if (next.getItemType() == Integer.MAX_VALUE) {
                next.setItemType(getItemViewType());
            }
        }
        return this.mEntityWrapperList;
    }

    int getHeaderFooterType() {
        return 1;
    }

    public abstract int getItemViewType();

    InterfaceC0376a getOnItemClickListener() {
        return null;
    }

    b getOnItemLongClickListener() {
        return null;
    }

    public void notifyDataSetChanged() {
        this.mDataSetObservable.notifyChanged();
    }

    public abstract void onBindContentViewHolder(RecyclerView.ViewHolder viewHolder, Object obj);

    public abstract RecyclerView.ViewHolder onCreateContentViewHolder(ViewGroup viewGroup);

    void registerDataSetObserver(n6.d dVar) {
        this.mDataSetObservable.registerObserver(dVar);
    }

    void registerIndexBarDataSetObserver(n6.f fVar) {
        this.mIndexBarDataSetObservable.registerObserver(fVar);
    }

    public void removeData(Object obj) {
        Iterator<me.yokeyword.indexablerv.b> it = this.mEntityWrapperList.iterator();
        while (it.hasNext()) {
            me.yokeyword.indexablerv.b next = it.next();
            if (next.getData() == obj) {
                this.mEntityWrapperList.remove(next);
                this.mDataSetObservable.notifyRemove(getHeaderFooterType() == 1, next);
                this.mIndexBarDataSetObservable.notifyChanged();
                return;
            }
        }
    }

    void unregisterDataSetObserver(n6.d dVar) {
        this.mDataSetObservable.unregisterObserver(dVar);
    }

    void unregisterIndexBarDataSetObserver(n6.f fVar) {
        this.mIndexBarDataSetObservable.unregisterObserver(fVar);
    }

    public void addDatas(int i8, List<Object> list) {
        if (i8 >= this.mEntityWrapperList.size()) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            addData(i8, list.get(size));
        }
    }

    private me.yokeyword.indexablerv.b wrapEntity(int i8) {
        me.yokeyword.indexablerv.b bVar = new me.yokeyword.indexablerv.b();
        bVar.setIndex(this.mIndex);
        bVar.setIndexTitle(this.mIndexTitle);
        bVar.setHeaderFooterType(getHeaderFooterType());
        this.mEntityWrapperList.add(i8, bVar);
        return bVar;
    }

    public void addData(int i8, Object obj) {
        int size = this.mEntityWrapperList.size();
        if (i8 >= size) {
            return;
        }
        me.yokeyword.indexablerv.b wrapEntity = wrapEntity(i8 + 1);
        wrapEntity.setItemType(getItemViewType());
        wrapEntity.setData(obj);
        if (size > 0) {
            this.mDataSetObservable.notifyAdd(getHeaderFooterType() == 1, this.mEntityWrapperList.get(i8), wrapEntity);
            this.mIndexBarDataSetObservable.notifyChanged();
        }
    }
}
