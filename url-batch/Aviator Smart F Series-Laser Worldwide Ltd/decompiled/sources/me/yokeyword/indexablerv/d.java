package me.yokeyword.indexablerv;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class d {
    static final int TYPE_ALL = 0;
    static final int TYPE_CLICK_CONTENT = 2;
    static final int TYPE_CLICK_TITLE = 1;
    static final int TYPE_LONG_CLICK_CONTENT = 4;
    static final int TYPE_LONG_CLICK_TITLE = 3;
    private a mCallback;
    private b mContentClickListener;
    private c mContentLongClickListener;
    private final n6.a mDataSetObservable = new n6.a();
    private List<me.yokeyword.indexablerv.e> mDatas;
    private InterfaceC0377d mTitleClickListener;
    private e mTitleLongClickListener;

    public interface a {
    }

    public interface b {
        void onItemClick(View view, int i8, int i9, Object obj);
    }

    public interface c {
    }

    /* renamed from: me.yokeyword.indexablerv.d$d, reason: collision with other inner class name */
    public interface InterfaceC0377d {
    }

    public interface e {
    }

    private void notifyInited() {
        this.mDataSetObservable.notifyInited();
    }

    private void notifySetListener(int i8) {
        this.mDataSetObservable.notifySetListener(i8);
    }

    a getIndexCallback() {
        return null;
    }

    public List<me.yokeyword.indexablerv.e> getItems() {
        return this.mDatas;
    }

    b getOnItemContentClickListener() {
        return this.mContentClickListener;
    }

    c getOnItemContentLongClickListener() {
        return null;
    }

    InterfaceC0377d getOnItemTitleClickListener() {
        return null;
    }

    e getOnItemTitleLongClickListener() {
        return null;
    }

    public void notifyDataSetChanged() {
        this.mDataSetObservable.notifyInited();
    }

    public abstract void onBindContentViewHolder(RecyclerView.ViewHolder viewHolder, me.yokeyword.indexablerv.e eVar);

    public abstract void onBindTitleViewHolder(RecyclerView.ViewHolder viewHolder, String str);

    public abstract RecyclerView.ViewHolder onCreateContentViewHolder(ViewGroup viewGroup);

    public abstract RecyclerView.ViewHolder onCreateTitleViewHolder(ViewGroup viewGroup);

    void registerDataSetObserver(n6.b bVar) {
        this.mDataSetObservable.registerObserver(bVar);
    }

    public void setDatas(List<me.yokeyword.indexablerv.e> list) {
        setDatas(list, null);
    }

    public void setOnItemContentClickListener(b bVar) {
        this.mContentClickListener = bVar;
        notifySetListener(2);
    }

    public void setOnItemContentLongClickListener(c cVar) {
        notifySetListener(4);
    }

    public void setOnItemTitleClickListener(InterfaceC0377d interfaceC0377d) {
        notifySetListener(1);
    }

    public void setOnItemTitleLongClickListener(e eVar) {
        notifySetListener(3);
    }

    void unregisterDataSetObserver(n6.b bVar) {
        this.mDataSetObservable.unregisterObserver(bVar);
    }

    public void setDatas(List<me.yokeyword.indexablerv.e> list, a aVar) {
        this.mDatas = list;
        notifyInited();
    }
}
