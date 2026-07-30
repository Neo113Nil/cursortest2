package com.crrepa.band.my.health.base;

/* loaded from: classes2.dex */
public abstract class h implements com.moyoung.dafit.module.common.baseui.f {
    protected i view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public abstract void getHistoryData();

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(i iVar) {
        this.view = iVar;
    }
}
