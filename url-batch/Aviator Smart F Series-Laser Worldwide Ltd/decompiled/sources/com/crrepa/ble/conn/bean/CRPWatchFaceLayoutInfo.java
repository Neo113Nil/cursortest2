package com.crrepa.ble.conn.bean;

import com.realsil.sdk.core.bluetooth.connection.le.GattError;

/* loaded from: classes3.dex */
public class CRPWatchFaceLayoutInfo {
    public static final int PICTURE_MD5_LENGTH = 32;
    private String backgroundPictureMd5;
    private CompressionType compressionType;
    private int height;
    private int textColor;
    private int thumHeight;
    private int thumWidth;
    private int timeBottomContent;
    private int timePosition;
    private int timeTopContent;
    private int width;

    public enum CompressionType {
        LZO(0),
        RGB_DEDUPLICATION(1),
        RGB_LINE(2),
        BLUETRUM(3),
        RTK_8773(4),
        JIELI(5),
        JIELI_707(21),
        SIFLI(GattError.GATT_PRC_IN_PROGRESS),
        ORIGINAL(255);

        private int value;

        CompressionType(int i8) {
            this.value = i8;
        }

        public static CompressionType valueOf(int i8) {
            if (i8 == 254) {
                return SIFLI;
            }
            if (i8 == 255) {
                return ORIGINAL;
            }
            if (i8 == 0) {
                return LZO;
            }
            if (i8 == 1) {
                return RGB_DEDUPLICATION;
            }
            if (i8 == 2) {
                return RGB_LINE;
            }
            if (i8 == 3) {
                return BLUETRUM;
            }
            if (i8 == 4) {
                return RTK_8773;
            }
            if (i8 != 5) {
                return null;
            }
            return JIELI;
        }

        public int value() {
            return this.value;
        }
    }

    public String getBackgroundPictureMd5() {
        return this.backgroundPictureMd5;
    }

    public CompressionType getCompressionType() {
        return this.compressionType;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getThumHeight() {
        return this.thumHeight;
    }

    public int getThumWidth() {
        return this.thumWidth;
    }

    public int getTimeBottomContent() {
        return this.timeBottomContent;
    }

    public int getTimePosition() {
        return this.timePosition;
    }

    public int getTimeTopContent() {
        return this.timeTopContent;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBackgroundPictureMd5(String str) {
        this.backgroundPictureMd5 = str;
    }

    public void setCompressionType(CompressionType compressionType) {
        this.compressionType = compressionType;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setTextColor(int i8) {
        this.textColor = i8;
    }

    public void setThumHeight(int i8) {
        this.thumHeight = i8;
    }

    public void setThumWidth(int i8) {
        this.thumWidth = i8;
    }

    public void setTimeBottomContent(int i8) {
        this.timeBottomContent = i8;
    }

    public void setTimePosition(int i8) {
        this.timePosition = i8;
    }

    public void setTimeTopContent(int i8) {
        this.timeTopContent = i8;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }

    public String toString() {
        return "CRPWatchFaceLayoutInfo{timePosition=" + this.timePosition + ", timeTopContent=" + this.timeTopContent + ", timeBottomContent=" + this.timeBottomContent + ", textColor=" + this.textColor + ", backgroundPictureMd5='" + this.backgroundPictureMd5 + "', height=" + this.height + ", width=" + this.width + ", thumHeight=" + this.thumHeight + ", thumWidth=" + this.thumWidth + ", compressionType=" + this.compressionType + '}';
    }
}
