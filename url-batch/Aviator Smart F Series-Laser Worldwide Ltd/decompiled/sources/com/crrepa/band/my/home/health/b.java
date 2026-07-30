package com.crrepa.band.my.home.health;

import android.content.Context;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

/* loaded from: classes2.dex */
public abstract class b {
    protected Context context;
    protected BaseViewHolder holder;

    public b(Context context, BaseViewHolder baseViewHolder) {
        this.holder = baseViewHolder;
        this.context = context;
    }

    public abstract void bindViewHolder();

    public abstract void destory();
}
