package com.bytedance.sdk.component.adexpress.fb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.compose.ui.platform.RenderNodeApi29$$ExternalSyntheticApiModelOutline37;
import java.lang.reflect.Array;

/* loaded from: classes11.dex */
public class zmn {
    public static Bitmap zmn(Context context, Bitmap bitmap, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            if (com.bytedance.sdk.component.adexpress.fb.fb() == 0) {
                return fs(context, createScaledBitmap, i);
            }
            if (com.bytedance.sdk.component.adexpress.fb.fb() == 1) {
                return zmn(createScaledBitmap, i);
            }
            return fs(createScaledBitmap, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap fs(Context context, Bitmap bitmap, int i) {
        RenderScript renderScript;
        Allocation allocation;
        ?? r2;
        Allocation allocation2;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap);
            renderScript = RenderScript.create(context);
            if (renderScript == null) {
                try {
                    if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null && renderScript != null) {
                        RenderScript.releaseAllContexts();
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                return null;
            }
            try {
                r2 = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                try {
                    allocation = Allocation.createFromBitmap(renderScript, bitmap);
                    try {
                        allocation2 = Allocation.createFromBitmap(renderScript, createBitmap);
                    } catch (Throwable th2) {
                        th = th2;
                        allocation2 = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    allocation = null;
                    allocation2 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                allocation = null;
                r2 = allocation;
                allocation2 = r2;
                try {
                    th.getMessage();
                    try {
                        if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null) {
                            return null;
                        }
                        if (renderScript != null) {
                            RenderScript.releaseAllContexts();
                        }
                        if (allocation != null) {
                            allocation.destroy();
                        }
                        if (allocation2 != null) {
                            allocation2.destroy();
                        }
                        if (r2 == 0) {
                            return null;
                        }
                        r2.destroy();
                        return null;
                    } catch (Throwable th5) {
                        th5.getMessage();
                        return null;
                    }
                } catch (Throwable th6) {
                    try {
                        if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null) {
                            if (renderScript != null) {
                                RenderScript.releaseAllContexts();
                            }
                            if (allocation != null) {
                                allocation.destroy();
                            }
                            if (allocation2 != null) {
                                allocation2.destroy();
                            }
                            if (r2 != 0) {
                                r2.destroy();
                            }
                        }
                    } catch (Throwable th7) {
                        th7.getMessage();
                    }
                    throw th6;
                }
            }
            try {
                r2.setRadius(i);
                r2.setInput(allocation);
                r2.forEach(allocation2);
                allocation2.copyTo(createBitmap);
                try {
                    if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null) {
                        RenderScript.releaseAllContexts();
                        if (allocation != null) {
                            allocation.destroy();
                        }
                        allocation2.destroy();
                        r2.destroy();
                    }
                } catch (Throwable th8) {
                    th8.getMessage();
                }
                return createBitmap;
            } catch (Throwable th9) {
                th = th9;
                th.getMessage();
                if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null) {
                }
            }
        } catch (Throwable th10) {
            th = th10;
            renderScript = null;
            allocation = null;
        }
    }

    public static Bitmap zmn(Bitmap bitmap, int i) {
        int[] iArr;
        int i2 = i;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = width * height;
            int[] iArr2 = new int[i3];
            bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
            int i4 = width - 1;
            int i5 = height - 1;
            int i6 = i2 + i2;
            int i7 = i6 + 1;
            int i8 = (i6 + 2) >> 1;
            int i9 = i8 * i8;
            int[] iArr3 = new int[Math.max(width, height)];
            int i10 = i9 * 256;
            int[] iArr4 = new int[i10];
            int[] iArr5 = new int[i3];
            int[] iArr6 = new int[i3];
            int[] iArr7 = new int[i3];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr4[i11] = i11 / i9;
            }
            int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i7, 3);
            int i12 = i2 + 1;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < height) {
                int i16 = -i2;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i16 <= i2) {
                    int i26 = i5;
                    int i27 = height;
                    int i28 = iArr2[i14 + Math.min(i4, Math.max(i16, 0))];
                    int[] iArr9 = iArr8[i16 + i2];
                    iArr9[0] = (i28 & 16711680) >> 16;
                    iArr9[1] = (i28 & 65280) >> 8;
                    iArr9[2] = i28 & 255;
                    int abs = i12 - Math.abs(i16);
                    int i29 = iArr9[0];
                    i17 += i29 * abs;
                    int i30 = iArr9[1];
                    i18 += i30 * abs;
                    int i31 = iArr9[2];
                    i19 += abs * i31;
                    if (i16 <= 0) {
                        i21 += i29;
                        i23 += i30;
                        i25 += i31;
                    } else {
                        i20 += i29;
                        i22 += i30;
                        i24 += i31;
                    }
                    i16++;
                    height = i27;
                    i5 = i26;
                }
                int i32 = i5;
                int i33 = height;
                int i34 = i2;
                int i35 = 0;
                while (i35 < width) {
                    iArr5[i14] = iArr4[i17];
                    iArr6[i14] = iArr4[i18];
                    iArr7[i14] = iArr4[i19];
                    int[] iArr10 = iArr8[((i34 - i2) + i7) % i7];
                    int i36 = i17 - i21;
                    int i37 = i18 - i23;
                    int i38 = i19 - i25;
                    int i39 = i21 - iArr10[0];
                    int i40 = i23 - iArr10[1];
                    int i41 = i25 - iArr10[2];
                    if (i13 == 0) {
                        iArr = iArr4;
                        iArr3[i35] = Math.min(i35 + i2 + 1, i4);
                    } else {
                        iArr = iArr4;
                    }
                    int i42 = iArr2[i15 + iArr3[i35]];
                    int i43 = (i42 & 16711680) >> 16;
                    iArr10[0] = i43;
                    int i44 = (i42 & 65280) >> 8;
                    iArr10[1] = i44;
                    int i45 = i42 & 255;
                    iArr10[2] = i45;
                    int i46 = i20 + i43;
                    int i47 = i22 + i44;
                    int i48 = i24 + i45;
                    i34 = (i34 + 1) % i7;
                    int[] iArr11 = iArr8[i34 % i7];
                    i17 = i36 + i46;
                    i18 = i37 + i47;
                    i19 = i38 + i48;
                    int i49 = iArr11[0];
                    i20 = i46 - i49;
                    int i50 = iArr11[1];
                    i22 = i47 - i50;
                    int i51 = iArr11[2];
                    i24 = i48 - i51;
                    i21 = i39 + i49;
                    i23 = i40 + i50;
                    i25 = i41 + i51;
                    i14++;
                    i35++;
                    iArr4 = iArr;
                }
                i15 += width;
                i13++;
                height = i33;
                i5 = i32;
            }
            int i52 = i5;
            int i53 = height;
            int[] iArr12 = iArr4;
            int i54 = 0;
            while (i54 < width) {
                int i55 = -i2;
                int i56 = i55 * width;
                int i57 = 0;
                int i58 = 0;
                int i59 = 0;
                int i60 = 0;
                int i61 = 0;
                int i62 = 0;
                int i63 = 0;
                int i64 = 0;
                int i65 = 0;
                while (i55 <= i2) {
                    int[] iArr13 = iArr8[i55 + i2];
                    int[] iArr14 = iArr3;
                    int max = Math.max(0, i56) + i54;
                    int abs2 = i12 - Math.abs(i55);
                    int i66 = iArr5[max];
                    i57 += i66 * abs2;
                    i58 += iArr6[max] * abs2;
                    i59 += iArr7[max] * abs2;
                    iArr13[0] = i66;
                    int i67 = iArr6[max];
                    iArr13[1] = i67;
                    int i68 = iArr7[max];
                    iArr13[2] = i68;
                    if (i55 <= 0) {
                        i61 += i66;
                        i63 += i67;
                        i65 += i68;
                    } else {
                        i60 += i66;
                        i62 += i67;
                        i64 += i68;
                    }
                    int i69 = i52;
                    if (i55 < i69) {
                        i56 += width;
                    }
                    i55++;
                    i52 = i69;
                    iArr3 = iArr14;
                }
                int[] iArr15 = iArr3;
                int i70 = i52;
                int i71 = i2;
                int i72 = i54;
                int i73 = i53;
                int i74 = 0;
                while (i74 < i73) {
                    iArr2[i72] = (iArr2[i72] & (-16777216)) | (iArr12[i57] << 16) | (iArr12[i58] << 8) | iArr12[i59];
                    int[] iArr16 = iArr8[((i71 - i2) + i7) % i7];
                    int i75 = i57 - i61;
                    int i76 = i58 - i63;
                    int i77 = i59 - i65;
                    int i78 = i61 - iArr16[0];
                    int i79 = i63 - iArr16[1];
                    int i80 = i65 - iArr16[2];
                    if (i54 == 0) {
                        iArr15[i74] = Math.min(i74 + i12, i70) * width;
                    }
                    int i81 = iArr15[i74] + i54;
                    int i82 = iArr5[i81];
                    iArr16[0] = i82;
                    int i83 = iArr6[i81];
                    iArr16[1] = i83;
                    int i84 = iArr7[i81];
                    iArr16[2] = i84;
                    int i85 = i60 + i82;
                    int i86 = i62 + i83;
                    int i87 = i64 + i84;
                    i57 = i75 + i85;
                    i58 = i76 + i86;
                    i59 = i77 + i87;
                    i71 = (i71 + 1) % i7;
                    int[] iArr17 = iArr8[i71];
                    int i88 = iArr17[0];
                    i60 = i85 - i88;
                    int i89 = iArr17[1];
                    i62 = i86 - i89;
                    int i90 = iArr17[2];
                    i64 = i87 - i90;
                    i61 = i78 + i88;
                    i63 = i79 + i89;
                    i65 = i80 + i90;
                    i72 += width;
                    i74++;
                    i2 = i;
                }
                i54++;
                i2 = i;
                i53 = i73;
                i52 = i70;
                iArr3 = iArr15;
            }
            bitmap.setPixels(iArr2, 0, width, 0, 0, width, i53);
            return bitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static Bitmap fs(Bitmap bitmap, int i) {
        ImageReader newInstance;
        RenderEffect createBlurEffect;
        RecordingCanvas beginRecording;
        HardwareRenderer.FrameRenderRequest createRenderRequest;
        HardwareRenderer.FrameRenderRequest waitForPresent;
        HardwareBuffer hardwareBuffer;
        Bitmap wrapHardwareBuffer;
        try {
            if (Build.VERSION.SDK_INT < 31) {
                return zmn(bitmap, i);
            }
            newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
            zmn$$ExternalSyntheticApiModelOutline12.m();
            RenderNode m = RenderNodeApi29$$ExternalSyntheticApiModelOutline37.m("BlurEffect");
            zmn$$ExternalSyntheticApiModelOutline13.m();
            HardwareRenderer m2 = zmn$$ExternalSyntheticApiModelOutline11.m();
            m2.setSurface(newInstance.getSurface());
            m2.setContentRoot(m);
            m.setPosition(0, 0, newInstance.getWidth(), newInstance.getHeight());
            float f = i;
            createBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR);
            m.setRenderEffect(createBlurEffect);
            beginRecording = m.beginRecording();
            beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            m.endRecording();
            createRenderRequest = m2.createRenderRequest();
            waitForPresent = createRenderRequest.setWaitForPresent(true);
            waitForPresent.syncAndDraw();
            Image acquireNextImage = newInstance.acquireNextImage();
            hardwareBuffer = acquireNextImage.getHardwareBuffer();
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            hardwareBuffer.close();
            acquireNextImage.close();
            newInstance.close();
            m.discardDisplayList();
            m2.destroy();
            return wrapHardwareBuffer;
        } catch (Throwable th) {
            th.getMessage();
            return zmn(bitmap, i);
        }
    }
}
