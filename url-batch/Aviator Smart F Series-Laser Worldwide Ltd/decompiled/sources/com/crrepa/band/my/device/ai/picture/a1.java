package com.crrepa.band.my.device.ai.picture;

import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;

/* loaded from: classes2.dex */
public class a1 implements com.moyoung.dafit.module.common.baseui.f {
    private float ratio;
    private b1 view;
    private CRPWatchFaceLayoutInfo watchFaceLayoutInfo;
    private final boolean circleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen();
    private final boolean roundedRectangleScreen = com.crrepa.band.my.ble.band.utils.a.getInstance().isRoundedRectangleScreen();

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public CRPWatchFaceLayoutInfo getWatchFaceLayoutInfo() {
        return this.watchFaceLayoutInfo;
    }

    public int getWatchFaceTextColorIndex() {
        return w1.j.getWatchFaceTextColorIndex(this.watchFaceLayoutInfo.getTextColor());
    }

    public int getWatchFaceTimeBottomContent() {
        return this.watchFaceLayoutInfo.getTimeBottomContent();
    }

    public int getWatchFaceTimePosition() {
        return this.watchFaceLayoutInfo.getTimePosition();
    }

    public int getWatchFaceTimeTopContent() {
        return this.watchFaceLayoutInfo.getTimeTopContent();
    }

    public void initWatchFaceLayout() {
        this.watchFaceLayoutInfo = AIProvider.getAIWatchFaceLayoutInfo();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveWatchFaceTextColor(int i8) {
        this.watchFaceLayoutInfo.setTextColor(w1.j.getWatchFaceTextColorInt(i8));
        showWatchFaceTextColorIndex(i8);
    }

    public void saveWatchFaceTimeBottomContent(int i8) {
        this.watchFaceLayoutInfo.setTimeBottomContent(i8);
        showWatchFaceTimeBottomContent(i8);
    }

    public void saveWatchFaceTimePosition(int i8) {
        this.watchFaceLayoutInfo.setTimePosition(i8);
        showWatchFaceTimePosition(i8);
    }

    public void saveWatchFaceTimeTopContent(int i8) {
        this.watchFaceLayoutInfo.setTimeTopContent(i8);
        showWatchFaceTimeTopContent(i8);
    }

    public void setView(b1 b1Var) {
        this.view = b1Var;
    }

    public void showWatchFaceLayout() {
        if (this.circleScreen) {
            this.view.renderCircleScreen();
        } else if (this.roundedRectangleScreen) {
            this.view.renderRoundedRectangleScreen();
        }
        float width = this.watchFaceLayoutInfo.getWidth() / this.watchFaceLayoutInfo.getHeight();
        this.ratio = width;
        if (width > 1.0f) {
            this.ratio = 1.0f;
        }
        com.orhanobut.logger.f.d("renderWatchFaceRatio: " + this.ratio);
        this.view.renderWatchFaceRatio(this.ratio);
        showWatchFaceTimePosition(this.watchFaceLayoutInfo.getTimePosition());
        showWatchFaceTimeTopContent(this.watchFaceLayoutInfo.getTimeTopContent());
        showWatchFaceTimeBottomContent(this.watchFaceLayoutInfo.getTimeBottomContent());
        showWatchFaceTextColorIndex(getWatchFaceTextColorIndex());
    }

    public void showWatchFaceTextColorIndex(int i8) {
        this.view.renderWatchFaceTextColor(i8);
    }

    public void showWatchFaceTimeBottomContent(int i8) {
        this.view.renderWatchFaceTimeBottomContent(i8, this.ratio);
    }

    public void showWatchFaceTimePosition(int i8) {
        this.view.renderWatchFaceTimePosition(i8, this.circleScreen, this.roundedRectangleScreen, this.ratio);
    }

    public void showWatchFaceTimeTopContent(int i8) {
        this.view.renderWatchFaceTimeTopContent(i8, this.ratio);
    }
}
