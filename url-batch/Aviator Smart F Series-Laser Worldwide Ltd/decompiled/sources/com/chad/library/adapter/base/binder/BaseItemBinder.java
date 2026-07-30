package com.chad.library.adapter.base.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import com.chad.library.adapter.base.BaseBinderAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import f6.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.jvm.internal.s;
import y5.f;

/* loaded from: classes2.dex */
public abstract class BaseItemBinder<T, VH extends BaseViewHolder> {
    private BaseBinderAdapter _adapter;
    private Context _context;
    private final f clickViewIds$delegate;
    private final f longClickViewIds$delegate;

    public BaseItemBinder() {
        f lazy;
        f lazy2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = b.lazy(lazyThreadSafetyMode, (a) new a() { // from class: com.chad.library.adapter.base.binder.BaseItemBinder$clickViewIds$2
            @Override // f6.a
            public final ArrayList<Integer> invoke() {
                return new ArrayList<>();
            }
        });
        this.clickViewIds$delegate = lazy;
        lazy2 = b.lazy(lazyThreadSafetyMode, (a) new a() { // from class: com.chad.library.adapter.base.binder.BaseItemBinder$longClickViewIds$2
            @Override // f6.a
            public final ArrayList<Integer> invoke() {
                return new ArrayList<>();
            }
        });
        this.longClickViewIds$delegate = lazy2;
    }

    private final ArrayList<Integer> getClickViewIds() {
        return (ArrayList) this.clickViewIds$delegate.getValue();
    }

    private final ArrayList<Integer> getLongClickViewIds() {
        return (ArrayList) this.longClickViewIds$delegate.getValue();
    }

    public final void addChildClickViewIds(@IdRes int... ids) {
        s.checkNotNullParameter(ids, "ids");
        for (int i8 : ids) {
            getClickViewIds().add(Integer.valueOf(i8));
        }
    }

    public final void addChildLongClickViewIds(@IdRes int... ids) {
        s.checkNotNullParameter(ids, "ids");
        for (int i8 : ids) {
            getLongClickViewIds().add(Integer.valueOf(i8));
        }
    }

    public abstract void convert(VH vh, T t7);

    public void convert(VH holder, T t7, List<? extends Object> payloads) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(payloads, "payloads");
    }

    public final BaseBinderAdapter getAdapter() {
        BaseBinderAdapter baseBinderAdapter = this._adapter;
        if (baseBinderAdapter != null) {
            s.checkNotNull(baseBinderAdapter);
            return baseBinderAdapter;
        }
        throw new IllegalStateException(("This " + this + " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before addItemBinder().").toString());
    }

    public final ArrayList<Integer> getChildClickViewIds() {
        return getClickViewIds();
    }

    public final ArrayList<Integer> getChildLongClickViewIds() {
        return getLongClickViewIds();
    }

    public final Context getContext() {
        Context context = this._context;
        if (context != null) {
            s.checkNotNull(context);
            return context;
        }
        throw new IllegalStateException(("This " + this + " has not been attached to BaseBinderAdapter yet.\n                    You should not call the method before onCreateViewHolder().").toString());
    }

    public final List<Object> getData() {
        return getAdapter().getData();
    }

    public final BaseBinderAdapter get_adapter$com_github_CymChad_brvah() {
        return this._adapter;
    }

    public final Context get_context$com_github_CymChad_brvah() {
        return this._context;
    }

    public void onChildClick(VH holder, View view, T t7, int i8) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(view, "view");
    }

    public boolean onChildLongClick(VH holder, View view, T t7, int i8) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(view, "view");
        return false;
    }

    public void onClick(VH holder, View view, T t7, int i8) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(view, "view");
    }

    public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i8);

    public boolean onFailedToRecycleView(VH holder) {
        s.checkNotNullParameter(holder, "holder");
        return false;
    }

    public boolean onLongClick(VH holder, View view, T t7, int i8) {
        s.checkNotNullParameter(holder, "holder");
        s.checkNotNullParameter(view, "view");
        return false;
    }

    public void onViewAttachedToWindow(VH holder) {
        s.checkNotNullParameter(holder, "holder");
    }

    public void onViewDetachedFromWindow(VH holder) {
        s.checkNotNullParameter(holder, "holder");
    }

    public final void set_adapter$com_github_CymChad_brvah(BaseBinderAdapter baseBinderAdapter) {
        this._adapter = baseBinderAdapter;
    }

    public final void set_context$com_github_CymChad_brvah(Context context) {
        this._context = context;
    }
}
