package com.baidu.ar.arplay.core.pixel;

/* loaded from: classes.dex */
public enum PixelType {
    RGBA(0),
    BGRA(1),
    BGR(2),
    NV12(3),
    NV21(4),
    I420(5),
    YV12(6),
    GRAY(7),
    RGB(8),
    RED(9),
    GREEN(10),
    BLUE(11),
    ALPHA(12);

    private final int value;

    PixelType(int i8) {
        this.value = i8;
    }

    public static PixelType valueOf(int i8) {
        PixelType pixelType = RGBA;
        if (i8 == pixelType.getValue()) {
            return pixelType;
        }
        PixelType pixelType2 = BGRA;
        if (i8 == pixelType2.getValue()) {
            return pixelType2;
        }
        PixelType pixelType3 = BGR;
        if (i8 == pixelType3.getValue()) {
            return pixelType3;
        }
        PixelType pixelType4 = NV12;
        if (i8 == pixelType4.getValue()) {
            return pixelType4;
        }
        PixelType pixelType5 = NV21;
        if (i8 == pixelType5.getValue()) {
            return pixelType5;
        }
        PixelType pixelType6 = I420;
        if (i8 == pixelType6.getValue()) {
            return pixelType6;
        }
        PixelType pixelType7 = YV12;
        if (i8 == pixelType7.getValue()) {
            return pixelType7;
        }
        PixelType pixelType8 = GRAY;
        if (i8 == pixelType8.getValue()) {
            return pixelType8;
        }
        PixelType pixelType9 = RGB;
        if (i8 == pixelType9.getValue()) {
            return pixelType9;
        }
        PixelType pixelType10 = RED;
        if (i8 == pixelType10.getValue()) {
            return pixelType10;
        }
        PixelType pixelType11 = GREEN;
        if (i8 == pixelType11.getValue()) {
            return pixelType11;
        }
        PixelType pixelType12 = BLUE;
        if (i8 == pixelType12.getValue()) {
            return pixelType12;
        }
        PixelType pixelType13 = ALPHA;
        return i8 == pixelType13.getValue() ? pixelType13 : pixelType;
    }

    public int getValue() {
        return this.value;
    }
}
