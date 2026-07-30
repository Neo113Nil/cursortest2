package com.chad.library.adapter.base.module;

import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static BaseUpFetchModule a(UpFetchModule upFetchModule, BaseQuickAdapter baseQuickAdapter) {
        s.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        return new BaseUpFetchModule(baseQuickAdapter);
    }
}
