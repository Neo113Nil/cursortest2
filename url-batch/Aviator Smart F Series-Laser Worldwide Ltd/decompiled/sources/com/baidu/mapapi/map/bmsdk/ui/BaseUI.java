package com.baidu.mapapi.map.bmsdk.ui;

import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;

/* loaded from: classes2.dex */
public abstract class BaseUI {

    /* renamed from: a, reason: collision with root package name */
    private BmBaseUI f6479a;

    /* renamed from: b, reason: collision with root package name */
    private String f6480b;
    protected onBaseUIListener listener;

    public interface onBaseUIListener {
        void onBaseUIRemove(BaseUI baseUI);

        void onBaseUIUpdate(BaseUI baseUI);
    }

    public BmBaseUI getBmBaseUI() {
        return this.f6479a;
    }

    public String getClickAction() {
        return this.f6480b;
    }

    public void remove() {
        onBaseUIListener onbaseuilistener = this.listener;
        if (onbaseuilistener != null) {
            onbaseuilistener.onBaseUIRemove(this);
        }
    }

    public void setClickAction(String str) {
        this.f6480b = str;
    }

    public void setListener(onBaseUIListener onbaseuilistener) {
        this.listener = onbaseuilistener;
    }
}
