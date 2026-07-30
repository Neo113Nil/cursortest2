package z1;

import android.util.Log;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceElementInfo;
import com.crrepa.ble.conn.type.CRPWatchFaceType;

/* loaded from: classes2.dex */
public class k {
    private int labelContainerHeight;
    public final CRPHisiliconWatchFaceLayoutInfo layoutInfo;
    private final a view;
    private int layoutInfoPositionType = 0;
    private final CRPWatchFaceElementInfo elementInfo = j.getCRPWatchFaceElementInfo();
    private final int watchFaceWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
    private final int watchFaceHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();

    public k(a aVar, CRPWatchFaceType cRPWatchFaceType) {
        this.view = aVar;
        this.layoutInfo = j.getNewWatchFaceLayoutInfo(cRPWatchFaceType);
    }

    private int getCenterBottomLayoutInfoY() {
        int timeLayoutH = getTimeLayoutH();
        int watchFaceContentResources = w1.j.getWatchFaceContentResources(this.layoutInfo.getTimeBottomContent());
        int timeLayoutMargin = getTimeLayoutMargin();
        if (watchFaceContentResources <= 0) {
            return this.watchFaceHeight - timeLayoutH;
        }
        return ((this.watchFaceHeight - getDateLayoutH()) - timeLayoutMargin) - timeLayoutH;
    }

    private int getCenterLayoutInfoX() {
        return (this.watchFaceWidth / 2) - (this.elementInfo.getTimeWidth() / 2);
    }

    private int getCenterTopLayoutInfoY() {
        int defaultLayoutMargin = getDefaultLayoutMargin();
        if (w1.j.getWatchFaceContentResources(this.layoutInfo.getTimeTopContent()) <= 0) {
            return defaultLayoutMargin;
        }
        return defaultLayoutMargin + getDateLayoutH() + getTimeLayoutMargin();
    }

    private int getDateLayoutH() {
        return this.elementInfo.getDateHeight();
    }

    private int getDefaultLayoutMargin() {
        return 28;
    }

    private float getLabelAndLayoutInfoRatio() {
        int i8 = this.labelContainerHeight;
        if (i8 == 0) {
            return 1.0f;
        }
        return i8 / this.watchFaceHeight;
    }

    private int getTimeLayoutH() {
        return this.elementInfo.getTimeHeight();
    }

    private int getTimeLayoutMargin() {
        return 2;
    }

    private int initLayoutInfoPositionType() {
        CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo = this.layoutInfo;
        if (cRPHisiliconWatchFaceLayoutInfo == null) {
            return 0;
        }
        if (cRPHisiliconWatchFaceLayoutInfo.getX() == -1 && this.layoutInfo.getY() == -1) {
            return 0;
        }
        int x7 = this.layoutInfo.getX();
        int y7 = this.layoutInfo.getY();
        if (x7 == getCenterLayoutInfoX()) {
            if (y7 <= getCenterTopLayoutInfoY()) {
                return 0;
            }
            if (y7 >= getCenterBottomLayoutInfoY()) {
                return 1;
            }
        }
        return 2;
    }

    public int getBottomLabelContent() {
        return this.layoutInfo.getTimeBottomContent();
    }

    public int getLabelTextColor() {
        return this.layoutInfo.getTextColor();
    }

    public int getLayoutInfoPositionType() {
        return this.layoutInfoPositionType;
    }

    public int getTopLabelContent() {
        return this.layoutInfo.getTimeTopContent();
    }

    public CRPHisiliconWatchFaceLayoutInfo getWatchFaceLayout() {
        return this.layoutInfo;
    }

    public void setLayoutInfoPositionType(int i8) {
        this.layoutInfoPositionType = i8;
    }

    public void setLayoutInfoPositionXY(boolean z7, int i8, int i9) {
        int labelAndLayoutInfoRatio = (int) (i8 / getLabelAndLayoutInfoRatio());
        int labelAndLayoutInfoRatio2 = (int) (i9 / getLabelAndLayoutInfoRatio());
        if (z7) {
            labelAndLayoutInfoRatio2 = labelAndLayoutInfoRatio2 + getDateLayoutH() + getTimeLayoutMargin();
        }
        int defaultLayoutMargin = getDefaultLayoutMargin();
        if (labelAndLayoutInfoRatio < defaultLayoutMargin) {
            labelAndLayoutInfoRatio = defaultLayoutMargin;
        }
        if (labelAndLayoutInfoRatio2 < defaultLayoutMargin) {
            labelAndLayoutInfoRatio2 = defaultLayoutMargin;
        }
        int min = Math.min(labelAndLayoutInfoRatio, (this.watchFaceWidth - this.elementInfo.getTimeWidth()) - getDefaultLayoutMargin());
        this.layoutInfo.setX(min);
        this.layoutInfo.setY(labelAndLayoutInfoRatio2);
        Log.d("WatchFaceCustomLocation", "layoutInfoX = " + min + " layoutInfoY = " + labelAndLayoutInfoRatio2);
    }

    public void showWatchFaceLayout(int i8) {
        this.labelContainerHeight = i8;
        this.view.renderTopLabelContent(this.layoutInfo.getTimeTopContent());
        this.view.renderBottomLabelContent(this.layoutInfo.getTimeBottomContent());
        this.view.renderLabelTextColor(this.layoutInfo.getTextColor());
        this.view.renderColorRadioBtn(this.layoutInfo.getTextColor());
        int initLayoutInfoPositionType = initLayoutInfoPositionType();
        this.layoutInfoPositionType = initLayoutInfoPositionType;
        if (initLayoutInfoPositionType != 2) {
            this.view.renderDragViewPosition(getLayoutInfoPositionType());
            return;
        }
        int y7 = this.layoutInfo.getY();
        if (this.layoutInfo.getTimeTopContent() > 0) {
            y7 = (y7 - getDateLayoutH()) - getTimeLayoutMargin();
        }
        this.view.renderDragViewPositionXY((int) (this.layoutInfo.getX() * getLabelAndLayoutInfoRatio()), (int) (y7 * getLabelAndLayoutInfoRatio()));
    }

    public void updateBottomLabelContent(int i8) {
        this.layoutInfo.setTimeBottomContent((byte) i8);
        this.view.renderBottomLabelContent(i8);
    }

    public void updateLabelTextColor(int i8) {
        this.layoutInfo.setTextColor(i8);
        this.view.renderLabelTextColor(i8);
    }

    public void updateTimeLabelPosition() {
        setLayoutInfoPositionXY(this.layoutInfoPositionType);
        this.view.renderDragViewPosition(this.layoutInfoPositionType);
    }

    public void updateTopLabelContent(int i8) {
        this.layoutInfo.setTimeTopContent((byte) i8);
        this.view.renderTopLabelContent(i8);
    }

    public void setLayoutInfoPositionXY(int i8) {
        int centerBottomLayoutInfoY;
        if (i8 == 2) {
            return;
        }
        if (i8 == 0) {
            centerBottomLayoutInfoY = getCenterTopLayoutInfoY();
        } else {
            centerBottomLayoutInfoY = getCenterBottomLayoutInfoY();
        }
        int centerLayoutInfoX = getCenterLayoutInfoX();
        this.layoutInfo.setX(centerLayoutInfoX);
        this.layoutInfo.setY(centerBottomLayoutInfoY);
        Log.d("WatchFaceCustomLocation", "layoutInfoX = " + centerLayoutInfoX + " layoutInfoY = " + centerBottomLayoutInfoY);
    }
}
