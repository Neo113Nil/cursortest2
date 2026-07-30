package com.chad.library.adapter.base.module;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnUpFetchListener;
import com.chad.library.adapter.base.listener.UpFetchListenerImp;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public class BaseUpFetchModule implements UpFetchListenerImp {
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean isUpFetchEnable;
    private boolean isUpFetching;
    private OnUpFetchListener mUpFetchListener;
    private int startUpFetchPosition;

    public BaseUpFetchModule(BaseQuickAdapter<?, ?> baseQuickAdapter) {
        s.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        this.baseQuickAdapter = baseQuickAdapter;
        this.startUpFetchPosition = 1;
    }

    public final void autoUpFetch$com_github_CymChad_brvah(int i8) {
        OnUpFetchListener onUpFetchListener;
        if (!this.isUpFetchEnable || this.isUpFetching || i8 > this.startUpFetchPosition || (onUpFetchListener = this.mUpFetchListener) == null) {
            return;
        }
        onUpFetchListener.onUpFetch();
    }

    public final int getStartUpFetchPosition() {
        return this.startUpFetchPosition;
    }

    public final boolean isUpFetchEnable() {
        return this.isUpFetchEnable;
    }

    public final boolean isUpFetching() {
        return this.isUpFetching;
    }

    @Override // com.chad.library.adapter.base.listener.UpFetchListenerImp
    public void setOnUpFetchListener(OnUpFetchListener onUpFetchListener) {
        this.mUpFetchListener = onUpFetchListener;
    }

    public final void setStartUpFetchPosition(int i8) {
        this.startUpFetchPosition = i8;
    }

    public final void setUpFetchEnable(boolean z7) {
        this.isUpFetchEnable = z7;
    }

    public final void setUpFetching(boolean z7) {
        this.isUpFetching = z7;
    }
}
