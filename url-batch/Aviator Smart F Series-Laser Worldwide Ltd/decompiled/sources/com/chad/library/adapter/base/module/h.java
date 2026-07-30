package com.chad.library.adapter.base.module;

import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static BaseLoadMoreModule a(LoadMoreModule loadMoreModule, BaseQuickAdapter baseQuickAdapter) {
        s.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        return new BaseLoadMoreModule(baseQuickAdapter);
    }
}
