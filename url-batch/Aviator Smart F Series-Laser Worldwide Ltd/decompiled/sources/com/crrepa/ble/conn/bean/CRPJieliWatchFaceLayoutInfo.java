package com.crrepa.ble.conn.bean;

import androidx.annotation.ColorInt;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class CRPJieliWatchFaceLayoutInfo {
    private ElementBean[] elementArray;

    @ColorInt
    private int elementColor;
    private byte fixedPhotoIndex;
    private CRPPhotoWatchFaceDisplayMode photoDisplayMode;
    private boolean showPointer;
    private CRPVideoWatchFaceDisplayMode videoDisplayMode;
    private CRPWatchFaceType watchFaceType;

    public static class ElementBean {
        private byte type;

        /* renamed from: x, reason: collision with root package name */
        private int f12286x;

        /* renamed from: y, reason: collision with root package name */
        private int f12287y;

        public ElementBean(byte b8, int i8, int i9) {
            this.type = b8;
            this.f12286x = i8;
            this.f12287y = i9;
        }

        public byte getType() {
            return this.type;
        }

        public int getX() {
            return this.f12286x;
        }

        public int getY() {
            return this.f12287y;
        }

        public void setType(byte b8) {
            this.type = b8;
        }

        public void setX(int i8) {
            this.f12286x = i8;
        }

        public void setY(int i8) {
            this.f12287y = i8;
        }

        public String toString() {
            return "ElementBean{type=" + ((int) this.type) + ", x=" + this.f12286x + ", y=" + this.f12287y + '}';
        }
    }

    public CRPJieliWatchFaceLayoutInfo(CRPWatchFaceType cRPWatchFaceType, boolean z7) {
        this.elementArray = new ElementBean[4];
        this.watchFaceType = cRPWatchFaceType;
        this.showPointer = z7;
    }

    public ElementBean[] getElementArray() {
        return this.elementArray;
    }

    public int getElementColor() {
        return this.elementColor;
    }

    public byte getFixedPhotoIndex() {
        return this.fixedPhotoIndex;
    }

    public CRPPhotoWatchFaceDisplayMode getPhotoDisplayMode() {
        return this.photoDisplayMode;
    }

    public CRPVideoWatchFaceDisplayMode getVideoDisplayMode() {
        return this.videoDisplayMode;
    }

    public CRPWatchFaceType getWatchFaceType() {
        return this.watchFaceType;
    }

    public boolean isShowPointer() {
        return this.showPointer;
    }

    public void setElementArray(ElementBean[] elementBeanArr) {
        this.elementArray = elementBeanArr;
    }

    public void setElementColor(int i8) {
        this.elementColor = i8;
    }

    public void setFixedPhotoIndex(byte b8) {
        this.fixedPhotoIndex = b8;
    }

    public void setPhotoDisplayMode(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode) {
        this.photoDisplayMode = cRPPhotoWatchFaceDisplayMode;
    }

    public void setShowPointer(boolean z7) {
        this.showPointer = z7;
    }

    public void setVideoDisplayMode(CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode) {
        this.videoDisplayMode = cRPVideoWatchFaceDisplayMode;
    }

    public void setWatchFaceType(CRPWatchFaceType cRPWatchFaceType) {
        this.watchFaceType = cRPWatchFaceType;
    }

    public String toString() {
        return "CRPJieliWatchFaceLayoutInfo{watchFaceType=" + this.watchFaceType + ", showPointer=" + this.showPointer + ", photoDisplayMode=" + this.photoDisplayMode + ", videoDisplayMode=" + this.videoDisplayMode + ", fixedPhotoIndex=" + ((int) this.fixedPhotoIndex) + ", elementColor=" + this.elementColor + ", elementArray=" + Arrays.toString(this.elementArray) + '}';
    }

    public CRPJieliWatchFaceLayoutInfo(CRPWatchFaceType cRPWatchFaceType, boolean z7, CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode, byte b8, int i8, ElementBean[] elementBeanArr) {
        this.watchFaceType = cRPWatchFaceType;
        this.showPointer = z7;
        this.photoDisplayMode = cRPPhotoWatchFaceDisplayMode;
        this.fixedPhotoIndex = b8;
        this.elementColor = i8;
        this.elementArray = elementBeanArr;
    }

    public CRPJieliWatchFaceLayoutInfo(CRPWatchFaceType cRPWatchFaceType, boolean z7, CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode, byte b8, int i8, ElementBean[] elementBeanArr) {
        this.watchFaceType = cRPWatchFaceType;
        this.showPointer = z7;
        this.videoDisplayMode = cRPVideoWatchFaceDisplayMode;
        this.fixedPhotoIndex = b8;
        this.elementColor = i8;
        this.elementArray = elementBeanArr;
    }
}
