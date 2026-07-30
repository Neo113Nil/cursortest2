package e1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import b5.b;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.king.zxing.m;
import com.moyoung.dafit.module.common.utils.g;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes2.dex */
public final class a {
    public static final int DEFAULT_REQ_HEIGHT = 800;
    public static final int DEFAULT_REQ_WIDTH = 450;

    private a() {
        throw new AssertionError();
    }

    private static Bitmap addCode(Bitmap bitmap, String str, int i8, @ColorInt int i9, int i10) {
        if (bitmap == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height + i8 + (i10 * 2), Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(i8);
            textPaint.setColor(i9);
            textPaint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, width / 2, height + (i8 / 2) + i10, textPaint);
            canvas.save();
            canvas.restore();
            return createBitmap;
        } catch (Exception e8) {
            b.w(e8.getMessage());
            return null;
        }
    }

    private static Bitmap addLogo(Bitmap bitmap, Bitmap bitmap2, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap2 == null) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        if (width2 == 0 || height2 == 0) {
            return bitmap;
        }
        float f9 = (width * f8) / width2;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.scale(f9, f9, width / 2, height / 2);
            canvas.drawBitmap(bitmap2, (width - width2) / 2, (height - height2) / 2, (Paint) null);
            canvas.save();
            canvas.restore();
            return createBitmap;
        } catch (Exception e8) {
            b.w(e8.getMessage());
            return null;
        }
    }

    private static Bitmap compressBitmap(String str, int i8, int i9) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        float f8 = options.outWidth;
        float f9 = options.outHeight;
        float f10 = i8;
        float f11 = i9;
        int max = Math.max(f8 > f10 ? (int) (f8 / f10) : 1, f9 > f11 ? (int) (f9 / f11) : 1);
        options.inSampleSize = max > 0 ? max : 1;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap createBarCode(String str, int i8, int i9) {
        return createBarCode(str, BarcodeFormat.CODE_128, i8, i9, (Map<EncodeHintType, ?>) null);
    }

    public static Bitmap createQRCode(String str, int i8) {
        return createQRCode(str, i8, (Bitmap) null);
    }

    private static RGBLuminanceSource getRGBLuminanceSource(@NonNull Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return new RGBLuminanceSource(width, height, iArr);
    }

    public static String parseCode(String str) {
        HashMap hashMap = new HashMap();
        Vector vector = new Vector();
        vector.addAll(m.ONE_D_FORMATS);
        vector.addAll(m.QR_CODE_FORMATS);
        vector.addAll(m.DATA_MATRIX_FORMATS);
        vector.addAll(m.AZTEC_FORMATS);
        vector.addAll(m.PDF417_FORMATS);
        hashMap.put(DecodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        hashMap.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        return parseCode(str, hashMap);
    }

    public static Result parseCodeResult(String str, Map<DecodeHintType, Object> map) {
        return parseCodeResult(str, 450, 800, map);
    }

    public static String parseQRCode(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(DecodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        return parseQRCode(str, hashMap);
    }

    public static Result parseQRCodeResult(String str, Map<DecodeHintType, ?> map) {
        return parseQRCodeResult(str, 450, 800, map);
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i8, int i9) {
        return createBarCode(str, barcodeFormat, i8, i9, (Map<EncodeHintType, ?>) null);
    }

    public static Bitmap createQRCode(String str, int i8, int i9) {
        return createQRCode(str, i8, (Bitmap) null, i9);
    }

    public static Result parseCodeResult(String str, int i8, int i9, Map<DecodeHintType, Object> map) {
        boolean z7;
        Result result = null;
        try {
            MultiFormatReader multiFormatReader = new MultiFormatReader();
            multiFormatReader.setHints(map);
            RGBLuminanceSource rGBLuminanceSource = getRGBLuminanceSource(compressBitmap(str, i8, i9));
            if (rGBLuminanceSource != null) {
                boolean z8 = true;
                try {
                    result = multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource)));
                    z7 = false;
                } catch (Exception unused) {
                    z7 = true;
                }
                if (z7) {
                    try {
                        result = multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource.invert())));
                        z7 = false;
                    } catch (Exception unused2) {
                        z7 = true;
                    }
                }
                if (z7) {
                    try {
                        result = multiFormatReader.decodeWithState(new BinaryBitmap(new GlobalHistogramBinarizer(rGBLuminanceSource)));
                        z8 = false;
                    } catch (Exception unused3) {
                    }
                } else {
                    z8 = z7;
                }
                if (z8 && rGBLuminanceSource.isRotateSupported()) {
                    try {
                        result = multiFormatReader.decodeWithState(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource.rotateCounterClockwise())));
                    } catch (Exception unused4) {
                    }
                }
                multiFormatReader.reset();
            }
        } catch (Exception e8) {
            b.w(e8.getMessage());
        }
        return result;
    }

    public static Result parseQRCodeResult(Bitmap bitmap, int i8, int i9, Map<DecodeHintType, ?> map) {
        boolean z7;
        Result result = null;
        try {
            QRCodeReader qRCodeReader = new QRCodeReader();
            if (bitmap.getHeight() >= i9 && bitmap.getWidth() >= i8) {
                bitmap = g.changeBitmapSize(bitmap, i8, i9);
            }
            RGBLuminanceSource rGBLuminanceSource = getRGBLuminanceSource(bitmap);
            if (rGBLuminanceSource != null) {
                boolean z8 = true;
                try {
                    result = qRCodeReader.decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource)), map);
                    z7 = false;
                } catch (Exception unused) {
                    z7 = true;
                }
                if (z7) {
                    try {
                        result = qRCodeReader.decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource.invert())), map);
                        z7 = false;
                    } catch (Exception unused2) {
                        z7 = true;
                    }
                }
                if (z7) {
                    try {
                        result = qRCodeReader.decode(new BinaryBitmap(new GlobalHistogramBinarizer(rGBLuminanceSource)), map);
                        z8 = false;
                    } catch (Exception unused3) {
                    }
                } else {
                    z8 = z7;
                }
                if (z8 && rGBLuminanceSource.isRotateSupported()) {
                    try {
                        result = qRCodeReader.decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource.rotateCounterClockwise())), map);
                    } catch (Exception unused4) {
                    }
                }
                qRCodeReader.reset();
            }
        } catch (Exception e8) {
            b.w(e8.getMessage());
        }
        return result;
    }

    public static Bitmap createBarCode(String str, int i8, int i9, boolean z7) {
        return createBarCode(str, BarcodeFormat.CODE_128, i8, i9, null, z7, 40, -16777216);
    }

    public static Bitmap createQRCode(String str, int i8, Bitmap bitmap) {
        return createQRCode(str, i8, bitmap, -16777216);
    }

    public static Bitmap createBarCode(String str, int i8, int i9, boolean z7, @ColorInt int i10) {
        return createBarCode(str, BarcodeFormat.CODE_128, i8, i9, null, z7, 40, i10);
    }

    public static Bitmap createQRCode(String str, int i8, Bitmap bitmap, int i9) {
        return createQRCode(str, i8, bitmap, 0.2f, i9);
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map) {
        return createBarCode(str, barcodeFormat, i8, i9, map, false, 40, -16777216);
    }

    public static Bitmap createQRCode(String str, int i8, Bitmap bitmap, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        HashMap hashMap = new HashMap();
        hashMap.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hashMap.put(EncodeHintType.MARGIN, 1);
        return createQRCode(str, i8, bitmap, f8, hashMap);
    }

    public static String parseQRCode(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DecodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        Result parseQRCodeResult = parseQRCodeResult(bitmap, bitmap.getWidth(), bitmap.getHeight(), hashMap);
        if (parseQRCodeResult != null) {
            return parseQRCodeResult.getText();
        }
        return null;
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map, boolean z7) {
        return createBarCode(str, barcodeFormat, i8, i9, map, z7, 40, -16777216);
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i8, int i9, boolean z7, @ColorInt int i10) {
        return createBarCode(str, barcodeFormat, i8, i9, null, z7, 40, i10);
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map, boolean z7, @ColorInt int i10) {
        return createBarCode(str, barcodeFormat, i8, i9, map, z7, 40, i10);
    }

    public static Bitmap createBarCode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map, boolean z7, int i10, @ColorInt int i11) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            BitMatrix encode = new MultiFormatWriter().encode(str, barcodeFormat, i8, i9, map);
            int width = encode.getWidth();
            int height = encode.getHeight();
            int[] iArr = new int[width * height];
            for (int i12 = 0; i12 < height; i12++) {
                int i13 = i12 * width;
                for (int i14 = 0; i14 < width; i14++) {
                    iArr[i13 + i14] = encode.get(i14, i12) ? i11 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return z7 ? addCode(createBitmap, str, i10, i11, i10 / 2) : createBitmap;
        } catch (WriterException e8) {
            b.w(e8.getMessage());
            return null;
        }
    }

    public static Bitmap createQRCode(String str, int i8, Bitmap bitmap, @FloatRange(from = 0.0d, to = 1.0d) float f8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hashMap.put(EncodeHintType.MARGIN, 1);
        return createQRCode(str, i8, bitmap, f8, hashMap, i9);
    }

    public static String parseQRCode(String str, Map<DecodeHintType, ?> map) {
        Result parseQRCodeResult = parseQRCodeResult(str, map);
        if (parseQRCodeResult != null) {
            return parseQRCodeResult.getText();
        }
        return null;
    }

    public static String parseCode(String str, Map<DecodeHintType, Object> map) {
        Result parseCodeResult = parseCodeResult(str, map);
        if (parseCodeResult != null) {
            return parseCodeResult.getText();
        }
        return null;
    }

    public static Bitmap createQRCode(String str, int i8, Bitmap bitmap, @FloatRange(from = 0.0d, to = 1.0d) float f8, Map<EncodeHintType, ?> map) {
        return createQRCode(str, i8, bitmap, f8, map, -16777216);
    }

    public static Bitmap createQRCode(String str, int i8, Bitmap bitmap, @FloatRange(from = 0.0d, to = 1.0d) float f8, Map<EncodeHintType, ?> map, int i9) {
        try {
            BitMatrix encode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, i8, i8, map);
            int[] iArr = new int[i8 * i8];
            for (int i10 = 0; i10 < i8; i10++) {
                for (int i11 = 0; i11 < i8; i11++) {
                    if (encode.get(i11, i10)) {
                        iArr[(i10 * i8) + i11] = i9;
                    } else {
                        iArr[(i10 * i8) + i11] = -1;
                    }
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i8, 0, 0, i8, i8);
            return bitmap != null ? addLogo(createBitmap, bitmap, f8) : createBitmap;
        } catch (WriterException e8) {
            b.w(e8.getMessage());
            return null;
        }
    }

    public static Result parseQRCodeResult(String str, int i8, int i9, Map<DecodeHintType, ?> map) {
        boolean z7;
        Result result = null;
        try {
            QRCodeReader qRCodeReader = new QRCodeReader();
            RGBLuminanceSource rGBLuminanceSource = getRGBLuminanceSource(compressBitmap(str, i8, i9));
            if (rGBLuminanceSource != null) {
                boolean z8 = true;
                try {
                    result = qRCodeReader.decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource)), map);
                    z7 = false;
                } catch (Exception unused) {
                    z7 = true;
                }
                if (z7) {
                    try {
                        result = qRCodeReader.decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource.invert())), map);
                        z7 = false;
                    } catch (Exception unused2) {
                        z7 = true;
                    }
                }
                if (z7) {
                    try {
                        result = qRCodeReader.decode(new BinaryBitmap(new GlobalHistogramBinarizer(rGBLuminanceSource)), map);
                        z8 = false;
                    } catch (Exception unused3) {
                    }
                } else {
                    z8 = z7;
                }
                if (z8 && rGBLuminanceSource.isRotateSupported()) {
                    try {
                        result = qRCodeReader.decode(new BinaryBitmap(new HybridBinarizer(rGBLuminanceSource.rotateCounterClockwise())), map);
                    } catch (Exception unused4) {
                    }
                }
                qRCodeReader.reset();
            }
        } catch (Exception e8) {
            b.w(e8.getMessage());
        }
        return result;
    }
}
