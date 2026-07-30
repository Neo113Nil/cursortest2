package com.chad.library.adapter.base.module;

import com.chad.library.adapter.base.loadmore.BaseLoadMoreView;
import com.chad.library.adapter.base.loadmore.SimpleLoadMoreView;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LoadMoreModuleConfig {
    public static final LoadMoreModuleConfig INSTANCE = new LoadMoreModuleConfig();
    private static BaseLoadMoreView defLoadMoreView = new SimpleLoadMoreView();

    private LoadMoreModuleConfig() {
    }

    public static final BaseLoadMoreView getDefLoadMoreView() {
        return defLoadMoreView;
    }

    public static /* synthetic */ void getDefLoadMoreView$annotations() {
    }

    public static final void setDefLoadMoreView(BaseLoadMoreView baseLoadMoreView) {
        s.checkNotNullParameter(baseLoadMoreView, "<set-?>");
        defLoadMoreView = baseLoadMoreView;
    }
}
