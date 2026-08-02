package com.squareup.scannerview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public final /* synthetic */ class PreviewFrame$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PreviewFrame f$0;

    public /* synthetic */ PreviewFrame$$ExternalSyntheticLambda0(PreviewFrame previewFrame, int i) {
        this.$r8$classId = i;
        this.f$0 = previewFrame;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be A[ADDED_TO_REGION] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        PixelGrid pixelGrid;
        int ordinal;
        int i;
        int ordinal2;
        int i2;
        int i3;
        int i4;
        int width;
        int height;
        int i5 = this.$r8$classId;
        byte b = 255;
        PreviewFrame previewFrame = this.f$0;
        switch (i5) {
            case 0:
                PixelGrid pixelGrid2 = previewFrame.yData;
                Rect rect = previewFrame.targetBounds;
                Rotation rotation = previewFrame.rotation;
                int ordinal3 = rotation.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 != 2) {
                            if (ordinal3 != 3) {
                                Path$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                        }
                    }
                    pixelGrid = new PixelGrid(rect.height(), rect.width(), 0, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                    pixelGrid2.getClass();
                    rect.getClass();
                    int i6 = rect.left;
                    int i7 = rect.top;
                    int i8 = rect.right;
                    int i9 = rect.bottom;
                    int i10 = pixelGrid2.pixelStride;
                    int i11 = pixelGrid2.rowStride;
                    byte[] bArr = pixelGrid2.data;
                    int i12 = i8 - i6;
                    int i13 = i9 - i7;
                    ordinal = rotation.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    Path$$ExternalSyntheticBUOutline0.m$3();
                                    return null;
                                }
                            }
                        }
                        i = i13;
                        ordinal2 = rotation.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 3) {
                                        Path$$ExternalSyntheticBUOutline0.m$3();
                                        return null;
                                    }
                                }
                            }
                            i2 = pixelGrid.width;
                            i3 = pixelGrid.height;
                            if (i2 == i || i3 != i12) {
                                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(i, i12, "x", Recorder$$ExternalSyntheticOutline2.m107m(i2, i3, "result size was ", "x", ", expected ")));
                            } else {
                                int ordinal4 = rotation.ordinal();
                                int i14 = pixelGrid.pixelStride;
                                int i15 = pixelGrid.rowStride;
                                byte[] bArr2 = pixelGrid.data;
                                if (ordinal4 == 0) {
                                    int i16 = 0;
                                    while (i16 < i12) {
                                        int i17 = i7 + i16;
                                        int i18 = 0;
                                        while (i18 < i) {
                                            int i19 = i16;
                                            int i20 = bArr[((i6 + i18) * i10) + (i17 * i11)] & 255;
                                            if (i20 < 0 || i20 > 255) {
                                                a$$ExternalSyntheticBUOutline0.m$3("c must be in [0, 255]");
                                            } else {
                                                bArr2[(i18 * i14) + (i19 * i15)] = (byte) i20;
                                                i18++;
                                                i16 = i19;
                                            }
                                        }
                                        i16++;
                                    }
                                    return pixelGrid;
                                }
                                if (ordinal4 == 1) {
                                    for (int i21 = 0; i21 < i12; i21++) {
                                        for (int i22 = 0; i22 < i; i22++) {
                                            int i23 = bArr[((i6 + i21) * i10) + (((i9 - i22) - 1) * i11)] & 255;
                                            if (i23 < 0 || i23 > 255) {
                                                a$$ExternalSyntheticBUOutline0.m$3("c must be in [0, 255]");
                                            } else {
                                                bArr2[(i22 * i14) + (i21 * i15)] = (byte) i23;
                                            }
                                        }
                                    }
                                    return pixelGrid;
                                }
                                if (ordinal4 == 2) {
                                    int i24 = 0;
                                    while (i24 < i12) {
                                        int i25 = (i9 - i24) - 1;
                                        int i26 = 0;
                                        while (i26 < i) {
                                            int i27 = i24;
                                            int i28 = bArr[(((i8 - i26) - 1) * i10) + (i25 * i11)] & 255;
                                            if (i28 < 0 || i28 > 255) {
                                                a$$ExternalSyntheticBUOutline0.m$3("c must be in [0, 255]");
                                            } else {
                                                bArr2[(i26 * i14) + (i27 * i15)] = (byte) i28;
                                                i26++;
                                                i24 = i27;
                                            }
                                        }
                                        i24++;
                                    }
                                    return pixelGrid;
                                }
                                if (ordinal4 == 3) {
                                    for (int i29 = 0; i29 < i12; i29++) {
                                        for (int i30 = 0; i30 < i; i30++) {
                                            int i31 = bArr[(((i8 - i29) - 1) * i10) + ((i7 + i30) * i11)] & 255;
                                            if (i31 < 0 || i31 > 255) {
                                                a$$ExternalSyntheticBUOutline0.m$3("c must be in [0, 255]");
                                            } else {
                                                bArr2[(i30 * i14) + (i29 * i15)] = (byte) i31;
                                            }
                                        }
                                    }
                                    return pixelGrid;
                                }
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            return null;
                        }
                        i12 = i13;
                        i2 = pixelGrid.width;
                        i3 = pixelGrid.height;
                        if (i2 == i) {
                        }
                        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(i, i12, "x", Recorder$$ExternalSyntheticOutline2.m107m(i2, i3, "result size was ", "x", ", expected ")));
                        return null;
                    }
                    i = i12;
                    ordinal2 = rotation.ordinal();
                    if (ordinal2 != 0) {
                    }
                    i12 = i13;
                    i2 = pixelGrid.width;
                    i3 = pixelGrid.height;
                    if (i2 == i) {
                    }
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(i, i12, "x", Recorder$$ExternalSyntheticOutline2.m107m(i2, i3, "result size was ", "x", ", expected ")));
                    return null;
                }
                pixelGrid = new PixelGrid(rect.width(), rect.height(), 0, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                pixelGrid2.getClass();
                rect.getClass();
                int i62 = rect.left;
                int i72 = rect.top;
                int i82 = rect.right;
                int i92 = rect.bottom;
                int i102 = pixelGrid2.pixelStride;
                int i112 = pixelGrid2.rowStride;
                byte[] bArr3 = pixelGrid2.data;
                int i122 = i82 - i62;
                int i132 = i92 - i72;
                ordinal = rotation.ordinal();
                if (ordinal != 0) {
                }
                i = i122;
                ordinal2 = rotation.ordinal();
                if (ordinal2 != 0) {
                }
                i122 = i132;
                i2 = pixelGrid.width;
                i3 = pixelGrid.height;
                if (i2 == i) {
                }
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(i, i122, "x", Recorder$$ExternalSyntheticOutline2.m107m(i2, i3, "result size was ", "x", ", expected ")));
                return null;
            case 1:
                Rect rect2 = previewFrame.targetBounds;
                int width2 = rect2.width();
                int height2 = rect2.height();
                Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                int width3 = rect2.width();
                byte[] bArr4 = new byte[rect2.height() * width3 * 4];
                int i32 = rect2.top;
                int i33 = rect2.bottom;
                while (i32 < i33) {
                    int i34 = rect2.left;
                    int i35 = rect2.right;
                    while (i34 < i35) {
                        PixelGrid pixelGrid3 = previewFrame.yData;
                        int i36 = pixelGrid3.data[(pixelGrid3.pixelStride * i34) + (pixelGrid3.rowStride * i32)] & b;
                        PixelGrid pixelGrid4 = previewFrame.uData;
                        int i37 = i34 / 2;
                        int i38 = i32 / 2;
                        int i39 = pixelGrid4.data[(pixelGrid4.pixelStride * i37) + (pixelGrid4.rowStride * i38)] & 255;
                        PixelGrid pixelGrid5 = previewFrame.vData;
                        float f = i36;
                        float f2 = (pixelGrid5.data[(i37 * pixelGrid5.pixelStride) + (i38 * pixelGrid5.rowStride)] & 255) - 128;
                        int i40 = (int) ((1.370705f * f2) + f);
                        float f3 = i39 - 128;
                        int i41 = (int) ((f - (f2 * 0.698001f)) - (0.337633f * f3));
                        int i42 = (int) ((f3 * 1.732446f) + f);
                        int i43 = ((i34 - rect2.left) + ((i32 - rect2.top) * width3)) * 4;
                        if (i40 < 0) {
                            i40 = 0;
                            i4 = 255;
                        } else {
                            i4 = 255;
                            if (i40 > 255) {
                                i40 = 255;
                            }
                        }
                        bArr4[i43] = (byte) i40;
                        int i44 = i43 + 1;
                        if (i41 < 0) {
                            i41 = 0;
                        } else if (i41 > i4) {
                            i41 = i4;
                        }
                        bArr4[i44] = (byte) i41;
                        int i45 = i43 + 2;
                        if (i42 < 0) {
                            i42 = 0;
                        } else if (i42 > i4) {
                            i42 = 255;
                        }
                        bArr4[i45] = (byte) i42;
                        bArr4[i43 + 3] = -1;
                        i34++;
                        b = 255;
                    }
                    i32++;
                    b = 255;
                }
                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr4));
                Matrix matrix = new Matrix();
                matrix.setRotate(previewFrame.rotation.r);
                Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, width2, height2, matrix, false);
                createBitmap2.getClass();
                return createBitmap2;
            case 2:
                Rotation rotation2 = previewFrame.rotation;
                Rect rect3 = previewFrame.targetBounds;
                int ordinal5 = rotation2.ordinal();
                if (ordinal5 != 0) {
                    if (ordinal5 != 1) {
                        if (ordinal5 != 2) {
                            if (ordinal5 != 3) {
                                Path$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                        }
                    }
                    width = rect3.height();
                    return Integer.valueOf(width);
                }
                width = rect3.width();
                return Integer.valueOf(width);
            default:
                Rotation rotation3 = previewFrame.rotation;
                Rect rect4 = previewFrame.targetBounds;
                int ordinal6 = rotation3.ordinal();
                if (ordinal6 != 0) {
                    if (ordinal6 != 1) {
                        if (ordinal6 != 2) {
                            if (ordinal6 != 3) {
                                Path$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                        }
                    }
                    height = rect4.width();
                    return Integer.valueOf(height);
                }
                height = rect4.height();
                return Integer.valueOf(height);
        }
    }
}
