package com.chad.library.adapter.base.binder;

import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract class QuickItemBinder<T> extends BaseItemBinder<T, BaseViewHolder> {
    @LayoutRes
    public abstract int getLayoutId();

    @Override // com.chad.library.adapter.base.binder.BaseItemBinder
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        s.checkNotNullParameter(parent, "parent");
        return new BaseViewHolder(AdapterUtilsKt.getItemView(parent, getLayoutId()));
    }
}
