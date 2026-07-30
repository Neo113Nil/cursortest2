package com.baidu.ar;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import com.baidu.ar.arplay.core.engine.rotate.Orientation;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arplay.core.renderer.OutputFillMode;
import com.baidu.ar.bean.MirriorType;
import com.baidu.ar.bean.RotationType;
import com.baidu.ar.bean.ScaleType;
import com.baidu.ar.bean.Size;
import java.util.HashMap;

/* loaded from: classes.dex */
public class l {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2680a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f2681b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f2682c;

        static {
            int[] iArr = new int[ScaleType.values().length];
            f2682c = iArr;
            try {
                iArr[ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2682c[ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2682c[ScaleType.FIT_XY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Orientation.values().length];
            f2681b = iArr2;
            try {
                iArr2[Orientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2681b[Orientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2681b[Orientation.LANDSCAPE_REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[RotationType.values().length];
            f2680a = iArr3;
            try {
                iArr3[RotationType.ROTATE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2680a[RotationType.ROTATE_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2680a[RotationType.ROTATE_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2680a[RotationType.ROTATE_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static PixelRotation a(RotationType rotationType, MirriorType mirriorType) {
        PixelRotation pixelRotation = PixelRotation.NoRotation;
        int i8 = a.f2680a[rotationType.ordinal()];
        if (i8 == 1) {
            if (mirriorType == MirriorType.NO_MIRRIOR) {
                return pixelRotation;
            }
            if (mirriorType != MirriorType.VERTICAL_MIRRIOR) {
                if (mirriorType != MirriorType.HORIZONTAL_MIRRIOR) {
                    return pixelRotation;
                }
                return PixelRotation.FlipHorizontal;
            }
            return PixelRotation.FlipVertical;
        }
        if (i8 == 2) {
            if (mirriorType == MirriorType.NO_MIRRIOR) {
                return PixelRotation.RotateRight;
            }
            if (mirriorType != MirriorType.VERTICAL_MIRRIOR) {
                if (mirriorType != MirriorType.HORIZONTAL_MIRRIOR) {
                    return pixelRotation;
                }
                return PixelRotation.RotateRightFlipHorizontal;
            }
            return PixelRotation.RotateRightFlipVertical;
        }
        if (i8 == 3) {
            if (mirriorType == MirriorType.NO_MIRRIOR) {
                return PixelRotation.Rotate180;
            }
            if (mirriorType != MirriorType.VERTICAL_MIRRIOR) {
                if (mirriorType != MirriorType.HORIZONTAL_MIRRIOR) {
                    return pixelRotation;
                }
                return PixelRotation.FlipVertical;
            }
            return PixelRotation.FlipHorizontal;
        }
        if (i8 != 4) {
            return pixelRotation;
        }
        if (mirriorType == MirriorType.NO_MIRRIOR) {
            return PixelRotation.RotateLeft;
        }
        if (mirriorType != MirriorType.VERTICAL_MIRRIOR) {
            if (mirriorType != MirriorType.HORIZONTAL_MIRRIOR) {
                return pixelRotation;
            }
            return PixelRotation.RotateRightFlipVertical;
        }
        return PixelRotation.RotateRightFlipHorizontal;
    }

    public static Size b(int i8, int i9, int i10, int i11) {
        Size size = new Size(i8, i9);
        if (i8 > 0 && i9 > 0 && i10 > 0 && i11 > 0) {
            float f8 = i8;
            float f9 = i9;
            float f10 = f8 / f9;
            float f11 = i10 / i11;
            if (f10 > f11) {
                size.setWidth((int) (f9 * f11));
                size.setHeight(i9);
            } else if (f10 < f11) {
                size.setWidth(i8);
                size.setHeight((int) (f8 / f11));
            }
        }
        return size;
    }

    public static PixelRotation a(boolean z7, RotationType rotationType, MirriorType mirriorType) {
        return z7 ? PixelRotation.FlipVertical : a(rotationType, mirriorType);
    }

    public static OutputFillMode a(ScaleType scaleType) {
        int i8 = a.f2682c[scaleType.ordinal()];
        if (i8 == 1) {
            return OutputFillMode.KeepRatioCrop;
        }
        if (i8 == 2 || i8 == 3) {
            return OutputFillMode.KeepRatioFill;
        }
        return null;
    }

    public static Size a(int i8, int i9, int i10, int i11) {
        Size size = new Size(i8, i9);
        if (i8 > 0 && i9 > 0 && i10 > 0 && i11 > 0) {
            float f8 = i8;
            float f9 = i9;
            float f10 = f8 / f9;
            float f11 = i10 / i11;
            if (f10 < f11) {
                size.setWidth((int) (f9 * f11));
                size.setHeight(i9);
            } else if (f10 > f11) {
                size.setWidth(i8);
                size.setHeight((int) (f8 / f11));
            }
        }
        return size;
    }

    public static HashMap a(Orientation orientation) {
        String str;
        HashMap hashMap = new HashMap();
        int i8 = a.f2681b[orientation.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                str = "landscape_right";
            } else if (i8 == 3) {
                str = "landscape_left";
            }
            hashMap.put("orient", str);
            return hashMap;
        }
        str = "portrait";
        hashMap.put("orient", str);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r2 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.NoRotation;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.Rotate180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, boolean z7, PixelReadParams pixelReadParams) {
        PixelRotation pixelRotation;
        if (nc.k()) {
            if (pixelReadParams.getIsPortrait()) {
                if (!z7) {
                    pixelRotation = PixelRotation.RotateRight;
                }
                pixelRotation = PixelRotation.RotateRightFlipVertical;
            }
        } else if (!nc.j()) {
            if (!nc.d(context) || !pixelReadParams.getIsPortrait() || !z7) {
                return;
            }
            pixelRotation = PixelRotation.RotateRightFlipVertical;
        } else if (pixelReadParams.getIsPortrait()) {
            pixelRotation = z7 ? PixelRotation.RotateRightFlipHorizontal : PixelRotation.RotateLeft;
        }
        pixelReadParams.setPixelRotate(pixelRotation);
    }

    public static void a(Context context, float[] fArr, boolean z7) {
        Matrix.setIdentityM(fArr, 0);
        if (nc.k() || nc.d(context)) {
            Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, 0.0f, -1.0f, 0.0f);
            if (z7) {
                return;
            } else {
                Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
            }
        } else if (nc.j()) {
            Matrix.rotateM(fArr, 0, 270.0f, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
            if (z7) {
                return;
            } else {
                Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
            }
        } else if (z7) {
            Matrix.rotateM(fArr, 0, 270.0f, 0.0f, 0.0f, 1.0f);
        } else {
            Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, 0.0f, -1.0f, 0.0f);
            Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
        }
        Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
    }

    public static void a(PointF pointF, boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput, boolean z8) {
        float inputWidth;
        int inputHeight;
        float outputWidth;
        int outputHeight;
        if (pointF == null || duMixInput == null || duMixOutput == null || duMixOutput.getScaleType() == ScaleType.FIT_XY) {
            return;
        }
        if (z7) {
            inputWidth = duMixInput.getInputHeight();
            inputHeight = duMixInput.getInputWidth();
        } else {
            inputWidth = duMixInput.getInputWidth();
            inputHeight = duMixInput.getInputHeight();
        }
        float f8 = inputWidth / inputHeight;
        if (z8) {
            outputWidth = duMixOutput.getOutputHeight();
            outputHeight = duMixOutput.getOutputWidth();
        } else {
            outputWidth = duMixOutput.getOutputWidth();
            outputHeight = duMixOutput.getOutputHeight();
        }
        float f9 = outputWidth / outputHeight;
        if (f8 == f9) {
            return;
        }
        float f10 = pointF.x;
        float f11 = pointF.y;
        if (f8 < f9) {
            if (a.f2682c[duMixOutput.getScaleType().ordinal()] == 1) {
                float f12 = 1.0f / f9;
                f11 = ((((f11 * 2.0f) - 1.0f) * (1.0f / f8)) + f12) / (f12 * 2.0f);
            }
        } else if (a.f2682c[duMixOutput.getScaleType().ordinal()] == 1) {
            f10 = ((((f10 * 2.0f) - 1.0f) * f8) + f9) / (f9 * 2.0f);
        }
        pointF.set(f10, f11);
    }
}
