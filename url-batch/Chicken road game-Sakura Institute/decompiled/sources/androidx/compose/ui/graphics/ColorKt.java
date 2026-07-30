package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Color.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a5\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00192\b\b\u0001\u0010\u0012\u001a\u00020\u00192\b\b\u0001\u0010\u0013\u001a\u00020\u00192\b\b\u0003\u0010\u0014\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a1\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0082\b\u001a,\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001e\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0016\u0010/\u001a\u000200*\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0016\u00103\u001a\u00020\u0011*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a%\u00106\u001a\u00020\u0007*\u00020\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0016\u0010;\u001a\u00020\u0019*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u0018\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\n\n\u0002\u0010\u0004\u0012\u0004\b\u0002\u0010\u0003\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"UnspecifiedColor", "Lkotlin/ULong;", "getUnspecifiedColor$annotations", "()V", "J", "isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "UncheckedColor", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return ((f * f3) + ((f2 * f4) * (1.0f - f3))) / f5;
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m3887isSpecified8_81llA(long j) {
        return j != 16;
    }

    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m3888isSpecified8_81llA$annotations(long j) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m3889isUnspecified8_81llA(long j) {
        return j == 16;
    }

    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m3890isUnspecified8_81llA$annotations(long j) {
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long Color(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        float minValue;
        float maxValue;
        int i4;
        int i5;
        int i6;
        int i7;
        float minValue2;
        float maxValue2;
        int i8;
        int i9;
        int i10;
        if (colorSpace.getIsSrgb()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            return Color.m3836constructorimpl(ULong.m6993constructorimpl(ULong.m6993constructorimpl(i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r5 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        if (!(colorSpace.getComponentCount() == 3)) {
            InlineClassHelperKt.throwIllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int id = colorSpace.getId();
        if (!(id != -1)) {
            InlineClassHelperKt.throwIllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float minValue3 = colorSpace.getMinValue(0);
        float maxValue3 = colorSpace.getMaxValue(0);
        if (f >= minValue3) {
            minValue3 = f;
        }
        if (minValue3 <= maxValue3) {
            maxValue3 = minValue3;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(maxValue3);
        int i14 = floatToRawIntBits >>> 31;
        int i15 = (floatToRawIntBits >>> 23) & 255;
        int i16 = floatToRawIntBits & 8388607;
        int i17 = 31;
        if (i15 == 255) {
            i2 = i16 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i15 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i <= 0) {
                if (i >= -10) {
                    int i18 = (i16 | 8388608) >> (1 - i);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i2 = i18 >> 13;
                } else {
                    i2 = 0;
                }
                i = 0;
            } else {
                int i19 = i16 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i14 << 15);
                    short s = (short) i3;
                    minValue = colorSpace.getMinValue(1);
                    maxValue = colorSpace.getMaxValue(1);
                    if (f2 >= minValue) {
                        minValue = f2;
                    }
                    if (minValue <= maxValue) {
                        maxValue = minValue;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(maxValue);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 <= 0) {
                            if (i5 >= -10) {
                                int i22 = (i21 | 8388608) >> (1 - i5);
                                if ((i22 & 4096) != 0) {
                                    i22 += 8192;
                                }
                                i6 = i22 >> 13;
                            } else {
                                i6 = 0;
                            }
                            i5 = 0;
                        } else {
                            int i23 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i23) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                minValue2 = colorSpace.getMinValue(2);
                                maxValue2 = colorSpace.getMaxValue(2);
                                if (f3 >= minValue2) {
                                    minValue2 = f3;
                                }
                                if (minValue2 <= maxValue2) {
                                    maxValue2 = minValue2;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(maxValue2);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i25 == 0 ? 0 : 512;
                                } else {
                                    int i26 = i8 - 112;
                                    if (i26 >= 31) {
                                        i17 = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            short s3 = (short) i10;
                                            return Color.m3836constructorimpl(ULong.m6993constructorimpl((id & 63) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s3) << 16)));
                                        }
                                        i9 = i27;
                                        i17 = i26;
                                    } else if (i26 >= -10) {
                                        int i28 = (i25 | 8388608) >> (1 - i26);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                        i17 = 0;
                                    } else {
                                        i17 = 0;
                                    }
                                    i9 = 0;
                                }
                                i10 = (i24 << 15) | (i17 << 10) | i9;
                                short s32 = (short) i10;
                                if (f4 >= 0.0f) {
                                }
                                return Color.m3836constructorimpl(ULong.m6993constructorimpl((id & 63) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s32) << 16)));
                            }
                            i6 = i23;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    minValue2 = colorSpace.getMinValue(2);
                    maxValue2 = colorSpace.getMaxValue(2);
                    if (f3 >= minValue2) {
                    }
                    if (minValue2 <= maxValue2) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(maxValue2);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = (i242 << 15) | (i17 << 10) | i9;
                    short s322 = (short) i10;
                    if (f4 >= 0.0f) {
                    }
                    return Color.m3836constructorimpl(ULong.m6993constructorimpl((id & 63) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s22 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s322) << 16)));
                }
                i2 = i19;
            }
        }
        i3 = i2 | (i14 << 15) | (i << 10);
        short s4 = (short) i3;
        minValue = colorSpace.getMinValue(1);
        maxValue = colorSpace.getMaxValue(1);
        if (f2 >= minValue) {
        }
        if (minValue <= maxValue) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(maxValue);
        int i202 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        minValue2 = colorSpace.getMinValue(2);
        maxValue2 = colorSpace.getMaxValue(2);
        if (f3 >= minValue2) {
        }
        if (minValue2 <= maxValue2) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(maxValue2);
        int i2422 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = (i2422 << 15) | (i17 << 10) | i9;
        short s3222 = (short) i10;
        if (f4 >= 0.0f) {
        }
        return Color.m3836constructorimpl(ULong.m6993constructorimpl((id & 63) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r5 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s4 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((s222 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & s3222) << 16)));
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f, f2, f3, f4, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long UncheckedColor(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (colorSpace.getIsSrgb()) {
            return Color.m3836constructorimpl(ULong.m6993constructorimpl(ULong.m6993constructorimpl((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32));
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i10 = floatToRawIntBits >>> 31;
        int i11 = (floatToRawIntBits >>> 23) & 255;
        int i12 = floatToRawIntBits & 8388607;
        int i13 = 49;
        int i14 = 0;
        if (i11 == 255) {
            i2 = i12 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i11 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i15 = i12 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i15) + 1) | (i10 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i16 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i17 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i17 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i18 = i17 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i18) + 1) | (i16 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i19 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i20 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i14 = i20 != 0 ? 512 : 0;
                                    i13 = 31;
                                } else {
                                    int i21 = i8 - 112;
                                    if (i21 < 31) {
                                        if (i21 > 0) {
                                            i14 = i20 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i21 << 10) | i14) + 1) | (i19 << 15);
                                                return Color.m3836constructorimpl(ULong.m6993constructorimpl(((s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((short) i9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.getId() & 63)));
                                            }
                                            i13 = i21;
                                        } else if (i21 >= -10) {
                                            int i22 = (i20 | 8388608) >> (1 - i21);
                                            if ((i22 & 4096) != 0) {
                                                i22 += 8192;
                                            }
                                            i13 = 0;
                                            i14 = i22 >> 13;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                }
                                i9 = (i19 << 15) | (i13 << 10) | i14;
                                return Color.m3836constructorimpl(ULong.m6993constructorimpl(((s2 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((short) i9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.getId() & 63)));
                            }
                            i6 = i18;
                        } else if (i5 >= -10) {
                            int i23 = (i17 | 8388608) >> (1 - i5);
                            if ((i23 & 4096) != 0) {
                                i23 += 8192;
                            }
                            i6 = i23 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i16 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i192 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i202 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i192 << 15) | (i13 << 10) | i14;
                    return Color.m3836constructorimpl(ULong.m6993constructorimpl(((s22 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((s & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((short) i9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.getId() & 63)));
                }
                i2 = i15;
            } else if (i >= -10) {
                int i24 = (i12 | 8388608) >> (1 - i);
                if ((i24 & 4096) != 0) {
                    i24 += 8192;
                }
                i2 = i24 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i10 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i162 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i172 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i162 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i1922 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2022 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i1922 << 15) | (i13 << 10) | i14;
        return Color.m3836constructorimpl(ULong.m6993constructorimpl(((s222 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((s3 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((short) i9) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (colorSpace.getId() & 63)));
    }

    public static final long Color(int i) {
        return Color.m3836constructorimpl(ULong.m6993constructorimpl(ULong.m6993constructorimpl(i) << 32));
    }

    public static final long Color(long j) {
        return Color.m3836constructorimpl(ULong.m6993constructorimpl(j << 32));
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m3891lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m3837convertvNxB06k = Color.m3837convertvNxB06k(j, oklab);
        long m3837convertvNxB06k2 = Color.m3837convertvNxB06k(j2, oklab);
        float m3842getAlphaimpl = Color.m3842getAlphaimpl(m3837convertvNxB06k);
        float m3846getRedimpl = Color.m3846getRedimpl(m3837convertvNxB06k);
        float m3845getGreenimpl = Color.m3845getGreenimpl(m3837convertvNxB06k);
        float m3843getBlueimpl = Color.m3843getBlueimpl(m3837convertvNxB06k);
        float m3842getAlphaimpl2 = Color.m3842getAlphaimpl(m3837convertvNxB06k2);
        float m3846getRedimpl2 = Color.m3846getRedimpl(m3837convertvNxB06k2);
        float m3845getGreenimpl2 = Color.m3845getGreenimpl(m3837convertvNxB06k2);
        float m3843getBlueimpl2 = Color.m3843getBlueimpl(m3837convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m3837convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(m3846getRedimpl, m3846getRedimpl2, f), MathHelpersKt.lerp(m3845getGreenimpl, m3845getGreenimpl2, f), MathHelpersKt.lerp(m3843getBlueimpl, m3843getBlueimpl2, f), MathHelpersKt.lerp(m3842getAlphaimpl, m3842getAlphaimpl2, f), oklab), Color.m3844getColorSpaceimpl(j2));
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m3885compositeOverOWjLjI(long j, long j2) {
        long m3837convertvNxB06k = Color.m3837convertvNxB06k(j, Color.m3844getColorSpaceimpl(j2));
        float m3842getAlphaimpl = Color.m3842getAlphaimpl(j2);
        float m3842getAlphaimpl2 = Color.m3842getAlphaimpl(m3837convertvNxB06k);
        float f = 1.0f - m3842getAlphaimpl2;
        float f2 = (m3842getAlphaimpl * f) + m3842getAlphaimpl2;
        return UncheckedColor(f2 == 0.0f ? 0.0f : ((Color.m3846getRedimpl(m3837convertvNxB06k) * m3842getAlphaimpl2) + ((Color.m3846getRedimpl(j2) * m3842getAlphaimpl) * f)) / f2, f2 == 0.0f ? 0.0f : ((Color.m3845getGreenimpl(m3837convertvNxB06k) * m3842getAlphaimpl2) + ((Color.m3845getGreenimpl(j2) * m3842getAlphaimpl) * f)) / f2, f2 != 0.0f ? ((Color.m3843getBlueimpl(m3837convertvNxB06k) * m3842getAlphaimpl2) + ((Color.m3843getBlueimpl(j2) * m3842getAlphaimpl) * f)) / f2 : 0.0f, f2, Color.m3844getColorSpaceimpl(j2));
    }

    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m3886getComponents8_81llA(long j) {
        return new float[]{Color.m3846getRedimpl(j), Color.m3845getGreenimpl(j), Color.m3843getBlueimpl(j), Color.m3842getAlphaimpl(j)};
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m3892luminance8_81llA(long j) {
        ColorSpace m3844getColorSpaceimpl = Color.m3844getColorSpaceimpl(j);
        if (!ColorModel.m4247equalsimpl0(m3844getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m4254getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m4250toStringimpl(m3844getColorSpaceimpl.getModel())));
        }
        Intrinsics.checkNotNull(m3844getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc = ((Rgb) m3844getColorSpaceimpl).getEotfFunc();
        float invoke = (float) ((eotfFunc.invoke(Color.m3846getRedimpl(j)) * 0.2126d) + (eotfFunc.invoke(Color.m3845getGreenimpl(j)) * 0.7152d) + (eotfFunc.invoke(Color.m3843getBlueimpl(j)) * 0.0722d));
        if (invoke < 0.0f) {
            invoke = 0.0f;
        }
        if (invoke > 1.0f) {
            return 1.0f;
        }
        return invoke;
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m3894toArgb8_81llA(long j) {
        return (int) ULong.m6993constructorimpl(Color.m3837convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m3893takeOrElseDxMtmZc(long j, Function0<Color> function0) {
        return j != 16 ? j : function0.invoke().m3850unboximpl();
    }
}
