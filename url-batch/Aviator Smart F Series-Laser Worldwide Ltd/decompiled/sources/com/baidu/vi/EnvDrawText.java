package com.baidu.vi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.nio.IntBuffer;

/* loaded from: classes2.dex */
public class EnvDrawText {
    private static final String DEVICE_VIVOX3L = "vivo X3L";
    private static final int FONT_STYLE_BOLD = 1;
    private static final int FONT_STYLE_ITALIC = 2;
    private static final int FONT_STYLE_NORMAL = 0;
    private static Bitmap defaultFontBmp;
    public static SparseArray<a> fontCache;
    private static Context mContext;
    private static String phonetype;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0277 A[EDGE_INSN: B:102:0x0277->B:103:0x0277 BREAK  A[LOOP:1: B:93:0x0227->B:99:0x025f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027f A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00db, B:26:0x00df, B:29:0x00e8, B:31:0x00f0, B:35:0x00f5, B:36:0x00fa, B:38:0x00fe, B:40:0x010a, B:41:0x0128, B:43:0x02c2, B:45:0x02c8, B:47:0x02d1, B:49:0x02d7, B:52:0x0105, B:53:0x013c, B:54:0x014c, B:56:0x0154, B:60:0x0163, B:63:0x0168, B:65:0x016e, B:68:0x0181, B:70:0x019c, B:75:0x01e0, B:77:0x01e4, B:80:0x01ed, B:82:0x01f5, B:85:0x01fa, B:86:0x01ff, B:88:0x0203, B:89:0x020d, B:93:0x0227, B:95:0x022f, B:97:0x023a, B:99:0x025f, B:103:0x0277, B:105:0x027f, B:107:0x028c, B:108:0x02ac, B:112:0x021d, B:113:0x0221, B:114:0x020a), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020a A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00db, B:26:0x00df, B:29:0x00e8, B:31:0x00f0, B:35:0x00f5, B:36:0x00fa, B:38:0x00fe, B:40:0x010a, B:41:0x0128, B:43:0x02c2, B:45:0x02c8, B:47:0x02d1, B:49:0x02d7, B:52:0x0105, B:53:0x013c, B:54:0x014c, B:56:0x0154, B:60:0x0163, B:63:0x0168, B:65:0x016e, B:68:0x0181, B:70:0x019c, B:75:0x01e0, B:77:0x01e4, B:80:0x01ed, B:82:0x01f5, B:85:0x01fa, B:86:0x01ff, B:88:0x0203, B:89:0x020d, B:93:0x0227, B:95:0x022f, B:97:0x023a, B:99:0x025f, B:103:0x0277, B:105:0x027f, B:107:0x028c, B:108:0x02ac, B:112:0x021d, B:113:0x0221, B:114:0x020a), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e4 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00db, B:26:0x00df, B:29:0x00e8, B:31:0x00f0, B:35:0x00f5, B:36:0x00fa, B:38:0x00fe, B:40:0x010a, B:41:0x0128, B:43:0x02c2, B:45:0x02c8, B:47:0x02d1, B:49:0x02d7, B:52:0x0105, B:53:0x013c, B:54:0x014c, B:56:0x0154, B:60:0x0163, B:63:0x0168, B:65:0x016e, B:68:0x0181, B:70:0x019c, B:75:0x01e0, B:77:0x01e4, B:80:0x01ed, B:82:0x01f5, B:85:0x01fa, B:86:0x01ff, B:88:0x0203, B:89:0x020d, B:93:0x0227, B:95:0x022f, B:97:0x023a, B:99:0x025f, B:103:0x0277, B:105:0x027f, B:107:0x028c, B:108:0x02ac, B:112:0x021d, B:113:0x0221, B:114:0x020a), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00db, B:26:0x00df, B:29:0x00e8, B:31:0x00f0, B:35:0x00f5, B:36:0x00fa, B:38:0x00fe, B:40:0x010a, B:41:0x0128, B:43:0x02c2, B:45:0x02c8, B:47:0x02d1, B:49:0x02d7, B:52:0x0105, B:53:0x013c, B:54:0x014c, B:56:0x0154, B:60:0x0163, B:63:0x0168, B:65:0x016e, B:68:0x0181, B:70:0x019c, B:75:0x01e0, B:77:0x01e4, B:80:0x01ed, B:82:0x01f5, B:85:0x01fa, B:86:0x01ff, B:88:0x0203, B:89:0x020d, B:93:0x0227, B:95:0x022f, B:97:0x023a, B:99:0x025f, B:103:0x0277, B:105:0x027f, B:107:0x028c, B:108:0x02ac, B:112:0x021d, B:113:0x0221, B:114:0x020a), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fa A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00db, B:26:0x00df, B:29:0x00e8, B:31:0x00f0, B:35:0x00f5, B:36:0x00fa, B:38:0x00fe, B:40:0x010a, B:41:0x0128, B:43:0x02c2, B:45:0x02c8, B:47:0x02d1, B:49:0x02d7, B:52:0x0105, B:53:0x013c, B:54:0x014c, B:56:0x0154, B:60:0x0163, B:63:0x0168, B:65:0x016e, B:68:0x0181, B:70:0x019c, B:75:0x01e0, B:77:0x01e4, B:80:0x01ed, B:82:0x01f5, B:85:0x01fa, B:86:0x01ff, B:88:0x0203, B:89:0x020d, B:93:0x0227, B:95:0x022f, B:97:0x023a, B:99:0x025f, B:103:0x0277, B:105:0x027f, B:107:0x028c, B:108:0x02ac, B:112:0x021d, B:113:0x0221, B:114:0x020a), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00db, B:26:0x00df, B:29:0x00e8, B:31:0x00f0, B:35:0x00f5, B:36:0x00fa, B:38:0x00fe, B:40:0x010a, B:41:0x0128, B:43:0x02c2, B:45:0x02c8, B:47:0x02d1, B:49:0x02d7, B:52:0x0105, B:53:0x013c, B:54:0x014c, B:56:0x0154, B:60:0x0163, B:63:0x0168, B:65:0x016e, B:68:0x0181, B:70:0x019c, B:75:0x01e0, B:77:0x01e4, B:80:0x01ed, B:82:0x01f5, B:85:0x01fa, B:86:0x01ff, B:88:0x0203, B:89:0x020d, B:93:0x0227, B:95:0x022f, B:97:0x023a, B:99:0x025f, B:103:0x0277, B:105:0x027f, B:107:0x028c, B:108:0x02ac, B:112:0x021d, B:113:0x0221, B:114:0x020a), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022f A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00db, B:26:0x00df, B:29:0x00e8, B:31:0x00f0, B:35:0x00f5, B:36:0x00fa, B:38:0x00fe, B:40:0x010a, B:41:0x0128, B:43:0x02c2, B:45:0x02c8, B:47:0x02d1, B:49:0x02d7, B:52:0x0105, B:53:0x013c, B:54:0x014c, B:56:0x0154, B:60:0x0163, B:63:0x0168, B:65:0x016e, B:68:0x0181, B:70:0x019c, B:75:0x01e0, B:77:0x01e4, B:80:0x01ed, B:82:0x01f5, B:85:0x01fa, B:86:0x01ff, B:88:0x0203, B:89:0x020d, B:93:0x0227, B:95:0x022f, B:97:0x023a, B:99:0x025f, B:103:0x0277, B:105:0x027f, B:107:0x028c, B:108:0x02ac, B:112:0x021d, B:113:0x0221, B:114:0x020a), top: B:3:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized int[] drawText(String str, int i8, int i9, int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        Paint.FontMetrics fontMetrics;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int indexOf;
        int i23;
        int i24;
        Bitmap createBitmap;
        int desiredWidth;
        synchronized (EnvDrawText.class) {
            try {
                Canvas canvas = new Canvas();
                TextPaint textPaint = new TextPaint();
                if (TextUtils.isEmpty(phonetype)) {
                    phonetype = Build.MODEL;
                }
                String str2 = phonetype;
                int i25 = (str2 == null || !str2.equals(DEVICE_VIVOX3L)) ? i9 : 0;
                textPaint.reset();
                textPaint.setSubpixelText(true);
                textPaint.setAntiAlias(true);
                textPaint.setTextSize(i8);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                textPaint.setTypeface(getTypeface(i25));
                if (i13 != 0) {
                    textPaint.setStrokeWidth(i13);
                    textPaint.setStrokeCap(Paint.Cap.ROUND);
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStyle(Paint.Style.STROKE);
                }
                int indexOf2 = str.indexOf(92, 0);
                Bitmap bitmap = null;
                if (indexOf2 == -1) {
                    Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
                    i19 = (int) (Layout.getDesiredWidth(str, 0, str.length(), textPaint) + 0.5d);
                    i23 = (int) Math.ceil(fontMetrics2.descent - fontMetrics2.ascent);
                    iArr[0] = i19;
                    iArr[1] = i23;
                    if (iArr.length == 4) {
                        int pow = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(i19) / Math.log(2.0d)));
                        i23 = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(i23) / Math.log(2.0d)));
                        i19 = pow;
                    }
                    if (i19 == 0 && i23 == 0) {
                        i23 = 0;
                        i19 = 0;
                    }
                    if (iArr.length == 4) {
                        iArr[2] = i19;
                        iArr[3] = i23;
                    }
                    if (i19 > 0 && i23 > 0) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(i19, i23, Bitmap.Config.ARGB_8888);
                        if (createBitmap2 == null) {
                            return new int[0];
                        }
                        canvas.setBitmap(createBitmap2);
                        bitmap = createBitmap2;
                    }
                    if ((i12 & (-16777216)) == 0) {
                        canvas.drawColor(ViewCompat.MEASURED_SIZE_MASK);
                    } else {
                        canvas.drawColor(i12);
                    }
                    if (i13 != 0) {
                        textPaint.setStrokeWidth(i13);
                        textPaint.setStrokeCap(Paint.Cap.ROUND);
                        textPaint.setStrokeJoin(Paint.Join.ROUND);
                        textPaint.setStyle(Paint.Style.STROKE);
                        textPaint.setColor(i11);
                        canvas.drawText(str, 0.0f, 0.0f - fontMetrics2.ascent, textPaint);
                    }
                    textPaint.setStyle(Paint.Style.FILL);
                    textPaint.setColor(i10);
                    canvas.drawText(str, 0.0f, 0.0f - fontMetrics2.ascent, textPaint);
                } else {
                    int i26 = indexOf2 + 1;
                    int desiredWidth2 = (int) (Layout.getDesiredWidth(str.substring(0, indexOf2), textPaint) + 0.5d);
                    int i27 = 2;
                    while (true) {
                        int indexOf3 = str.indexOf(92, i26);
                        if (indexOf3 <= 0) {
                            break;
                        }
                        int desiredWidth3 = (int) (Layout.getDesiredWidth(str.substring(i26, indexOf3), textPaint) + 0.5d);
                        if (desiredWidth3 > desiredWidth2) {
                            desiredWidth2 = desiredWidth3;
                        }
                        i26 = indexOf3 + 1;
                        i27++;
                    }
                    if (i26 != str.length() && (desiredWidth = (int) (Layout.getDesiredWidth(str.substring(i26, str.length()), textPaint) + 0.5d)) > desiredWidth2) {
                        desiredWidth2 = desiredWidth;
                    }
                    Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
                    int ceil = (int) Math.ceil(fontMetrics3.descent - fontMetrics3.ascent);
                    int i28 = i27 * ceil;
                    iArr[0] = desiredWidth2;
                    iArr[1] = i28;
                    if (iArr.length == 4) {
                        fontMetrics = fontMetrics3;
                        i15 = ceil;
                        int pow2 = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(desiredWidth2) / Math.log(2.0d)));
                        i17 = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(i28) / Math.log(2.0d)));
                        i16 = pow2;
                    } else {
                        fontMetrics = fontMetrics3;
                        i15 = ceil;
                        i16 = desiredWidth2;
                        i17 = i28;
                    }
                    if (i16 == 0 && i17 == 0) {
                        i18 = 0;
                        i19 = 0;
                        if (iArr.length == 4) {
                            iArr[2] = i19;
                            iArr[3] = i18;
                        }
                        if (i19 > 0 && i18 > 0) {
                            createBitmap = Bitmap.createBitmap(i19, i18, Bitmap.Config.ARGB_8888);
                            if (createBitmap != null) {
                                return new int[0];
                            }
                            canvas.setBitmap(createBitmap);
                            bitmap = createBitmap;
                        }
                        if ((i12 & (-16777216)) != 0) {
                            canvas.drawColor(ViewCompat.MEASURED_SIZE_MASK);
                        } else {
                            canvas.drawColor(i12);
                        }
                        textPaint.setTextAlign(getTextAlignedType(i14));
                        if (i14 != 1) {
                            i20 = 0;
                            i21 = 0;
                        } else if (i14 == 2) {
                            i20 = 0;
                            i21 = iArr[0];
                        } else {
                            i20 = 0;
                            i21 = iArr[0] / 2;
                        }
                        i22 = 0;
                        while (true) {
                            indexOf = str.indexOf(92, i20);
                            if (indexOf > 0) {
                                break;
                            }
                            String substring = str.substring(i20, indexOf);
                            Layout.getDesiredWidth(substring, textPaint);
                            int i29 = indexOf + 1;
                            if (i13 != 0) {
                                textPaint.setStrokeWidth(i13);
                                textPaint.setStrokeCap(Paint.Cap.ROUND);
                                textPaint.setStrokeJoin(Paint.Join.ROUND);
                                textPaint.setStyle(Paint.Style.STROKE);
                                textPaint.setColor(i11);
                                i24 = i18;
                                canvas.drawText(substring, i21, (i22 * i15) - fontMetrics.ascent, textPaint);
                            } else {
                                i24 = i18;
                            }
                            textPaint.setStyle(Paint.Style.FILL);
                            textPaint.setColor(i10);
                            canvas.drawText(substring, i21, (i22 * i15) - fontMetrics.ascent, textPaint);
                            i22++;
                            i18 = i24;
                            i20 = i29;
                        }
                        int i30 = i18;
                        if (i20 != str.length()) {
                            String substring2 = str.substring(i20, str.length());
                            Layout.getDesiredWidth(substring2, textPaint);
                            if (i13 != 0) {
                                textPaint.setStrokeWidth(i13);
                                textPaint.setStrokeCap(Paint.Cap.ROUND);
                                textPaint.setStrokeJoin(Paint.Join.ROUND);
                                textPaint.setStyle(Paint.Style.STROKE);
                                textPaint.setColor(i11);
                                canvas.drawText(substring2, i21, (i22 * i15) - fontMetrics.ascent, textPaint);
                            }
                            textPaint.setStyle(Paint.Style.FILL);
                            textPaint.setColor(i10);
                            canvas.drawText(substring2, i21, (i22 * i15) - fontMetrics.ascent, textPaint);
                        }
                        i23 = i30;
                    }
                    i18 = i17;
                    i19 = i16;
                    if (iArr.length == 4) {
                    }
                    if (i19 > 0) {
                        createBitmap = Bitmap.createBitmap(i19, i18, Bitmap.Config.ARGB_8888);
                        if (createBitmap != null) {
                        }
                    }
                    if ((i12 & (-16777216)) != 0) {
                    }
                    textPaint.setTextAlign(getTextAlignedType(i14));
                    if (i14 != 1) {
                    }
                    i22 = 0;
                    while (true) {
                        indexOf = str.indexOf(92, i20);
                        if (indexOf > 0) {
                        }
                        textPaint.setStyle(Paint.Style.FILL);
                        textPaint.setColor(i10);
                        canvas.drawText(substring, i21, (i22 * i15) - fontMetrics.ascent, textPaint);
                        i22++;
                        i18 = i24;
                        i20 = i29;
                    }
                    int i302 = i18;
                    if (i20 != str.length()) {
                    }
                    i23 = i302;
                }
                Bitmap bitmap2 = bitmap;
                int[] iArr2 = new int[i19 * i23];
                if (bitmap2 != null) {
                    bitmap2.copyPixelsToBuffer(IntBuffer.wrap(iArr2));
                }
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                return iArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Bitmap drawTextAlpha(String str, int i8, int i9, int i10) {
        int desiredWidth;
        Canvas canvas = new Canvas();
        TextPaint textPaint = new TextPaint();
        if (TextUtils.isEmpty(phonetype)) {
            phonetype = Build.MODEL;
        }
        String str2 = phonetype;
        int i11 = 0;
        int i12 = (str2 == null || !str2.equals(DEVICE_VIVOX3L)) ? i9 : 0;
        textPaint.reset();
        textPaint.setSubpixelText(false);
        textPaint.setAntiAlias(false);
        textPaint.setTextSize(i8);
        textPaint.setTypeface(getTypeface(i12));
        float f8 = (i10 * 1.3f) + 0.5f;
        int i13 = 92;
        int indexOf = str.indexOf(92, 0);
        Bitmap bitmap = null;
        if (indexOf == -1) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            int desiredWidth2 = (int) (Layout.getDesiredWidth(str, 0, str.length(), textPaint) + f8);
            int ceil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
            if (desiredWidth2 > 0 && ceil > 0) {
                bitmap = Bitmap.createBitmap(desiredWidth2, ceil, Bitmap.Config.ALPHA_8);
                if (bitmap == null) {
                    return bitmap;
                }
                bitmap.eraseColor(0);
                canvas.setBitmap(bitmap);
            }
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawText(str, f8 * 0.5f, 0.0f - fontMetrics.ascent, textPaint);
        } else {
            int i14 = indexOf + 1;
            int desiredWidth3 = (int) (Layout.getDesiredWidth(str.substring(0, indexOf), textPaint) + 0.5d);
            int i15 = 2;
            while (true) {
                int indexOf2 = str.indexOf(i13, i14);
                if (indexOf2 <= 0) {
                    break;
                }
                int desiredWidth4 = (int) (Layout.getDesiredWidth(str.substring(i14, indexOf2), textPaint) + 0.5d);
                if (desiredWidth4 > desiredWidth3) {
                    desiredWidth3 = desiredWidth4;
                }
                i14 = indexOf2 + 1;
                i15++;
                i13 = 92;
            }
            if (i14 != str.length() && (desiredWidth = (int) (Layout.getDesiredWidth(str.substring(i14, str.length()), textPaint) + 0.5d)) > desiredWidth3) {
                desiredWidth3 = desiredWidth;
            }
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            int i16 = desiredWidth3 + i10;
            int ceil2 = i15 * ((int) Math.ceil(fontMetrics2.descent - fontMetrics2.ascent));
            if (i16 > 0 && ceil2 > 0) {
                bitmap = Bitmap.createBitmap(i16, ceil2, Bitmap.Config.ALPHA_8);
                if (bitmap == null) {
                    return bitmap;
                }
                bitmap.eraseColor(0);
                canvas.setBitmap(bitmap);
            }
            textPaint.setTextAlign(getTextAlignedType(3));
            float f9 = i16 - (f8 * 0.5f);
            int i17 = 0;
            while (true) {
                int indexOf3 = str.indexOf(92, i11);
                if (indexOf3 <= 0) {
                    break;
                }
                String substring = str.substring(i11, indexOf3);
                Layout.getDesiredWidth(substring, textPaint);
                textPaint.setStyle(Paint.Style.FILL);
                canvas.drawText(substring, f9, (i17 * r7) - fontMetrics2.ascent, textPaint);
                i17++;
                i11 = indexOf3 + 1;
            }
            if (i11 != str.length()) {
                String substring2 = str.substring(i11, str.length());
                Layout.getDesiredWidth(substring2, textPaint);
                textPaint.setStyle(Paint.Style.FILL);
                canvas.drawText(substring2, f9, (i17 * r7) - fontMetrics2.ascent, textPaint);
            }
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00dd, B:26:0x00e1, B:29:0x00ea, B:34:0x00f4, B:35:0x00f9, B:37:0x00fd, B:39:0x0109, B:40:0x0127, B:43:0x0104, B:45:0x0139, B:46:0x0149, B:48:0x0151, B:52:0x0160, B:55:0x0165, B:57:0x016b, B:60:0x017e, B:62:0x0199, B:67:0x01da, B:69:0x01de, B:72:0x01e7, B:76:0x01f1, B:77:0x01f6, B:79:0x01fa, B:80:0x0204, B:84:0x021e, B:86:0x0226, B:88:0x0231, B:90:0x0256, B:94:0x026e, B:96:0x0276, B:98:0x0283, B:99:0x02a3, B:102:0x0214, B:103:0x0218, B:104:0x0201), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00dd, B:26:0x00e1, B:29:0x00ea, B:34:0x00f4, B:35:0x00f9, B:37:0x00fd, B:39:0x0109, B:40:0x0127, B:43:0x0104, B:45:0x0139, B:46:0x0149, B:48:0x0151, B:52:0x0160, B:55:0x0165, B:57:0x016b, B:60:0x017e, B:62:0x0199, B:67:0x01da, B:69:0x01de, B:72:0x01e7, B:76:0x01f1, B:77:0x01f6, B:79:0x01fa, B:80:0x0204, B:84:0x021e, B:86:0x0226, B:88:0x0231, B:90:0x0256, B:94:0x026e, B:96:0x0276, B:98:0x0283, B:99:0x02a3, B:102:0x0214, B:103:0x0218, B:104:0x0201), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00dd, B:26:0x00e1, B:29:0x00ea, B:34:0x00f4, B:35:0x00f9, B:37:0x00fd, B:39:0x0109, B:40:0x0127, B:43:0x0104, B:45:0x0139, B:46:0x0149, B:48:0x0151, B:52:0x0160, B:55:0x0165, B:57:0x016b, B:60:0x017e, B:62:0x0199, B:67:0x01da, B:69:0x01de, B:72:0x01e7, B:76:0x01f1, B:77:0x01f6, B:79:0x01fa, B:80:0x0204, B:84:0x021e, B:86:0x0226, B:88:0x0231, B:90:0x0256, B:94:0x026e, B:96:0x0276, B:98:0x0283, B:99:0x02a3, B:102:0x0214, B:103:0x0218, B:104:0x0201), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00dd, B:26:0x00e1, B:29:0x00ea, B:34:0x00f4, B:35:0x00f9, B:37:0x00fd, B:39:0x0109, B:40:0x0127, B:43:0x0104, B:45:0x0139, B:46:0x0149, B:48:0x0151, B:52:0x0160, B:55:0x0165, B:57:0x016b, B:60:0x017e, B:62:0x0199, B:67:0x01da, B:69:0x01de, B:72:0x01e7, B:76:0x01f1, B:77:0x01f6, B:79:0x01fa, B:80:0x0204, B:84:0x021e, B:86:0x0226, B:88:0x0231, B:90:0x0256, B:94:0x026e, B:96:0x0276, B:98:0x0283, B:99:0x02a3, B:102:0x0214, B:103:0x0218, B:104:0x0201), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x002b, B:9:0x0030, B:12:0x003d, B:14:0x005a, B:15:0x006d, B:17:0x007e, B:19:0x00a2, B:24:0x00dd, B:26:0x00e1, B:29:0x00ea, B:34:0x00f4, B:35:0x00f9, B:37:0x00fd, B:39:0x0109, B:40:0x0127, B:43:0x0104, B:45:0x0139, B:46:0x0149, B:48:0x0151, B:52:0x0160, B:55:0x0165, B:57:0x016b, B:60:0x017e, B:62:0x0199, B:67:0x01da, B:69:0x01de, B:72:0x01e7, B:76:0x01f1, B:77:0x01f6, B:79:0x01fa, B:80:0x0204, B:84:0x021e, B:86:0x0226, B:88:0x0231, B:90:0x0256, B:94:0x026e, B:96:0x0276, B:98:0x0283, B:99:0x02a3, B:102:0x0214, B:103:0x0218, B:104:0x0201), top: B:3:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized Bitmap drawTextExt(String str, int i8, int i9, int[] iArr, int i10, int i11, int i12, int i13, int i14) {
        Paint.FontMetrics fontMetrics;
        int i15;
        int i16;
        int i17;
        Paint.FontMetrics fontMetrics2;
        int desiredWidth;
        int i18;
        Bitmap createBitmap;
        synchronized (EnvDrawText.class) {
            try {
                Canvas canvas = new Canvas();
                TextPaint textPaint = new TextPaint();
                if (TextUtils.isEmpty(phonetype)) {
                    phonetype = Build.MODEL;
                }
                String str2 = phonetype;
                int i19 = (str2 == null || !str2.equals(DEVICE_VIVOX3L)) ? i9 : 0;
                textPaint.reset();
                textPaint.setSubpixelText(true);
                textPaint.setAntiAlias(true);
                textPaint.setTextSize(i8);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                textPaint.setTypeface(getTypeface(i19));
                if (i13 != 0) {
                    textPaint.setStrokeWidth(i13);
                    textPaint.setStrokeCap(Paint.Cap.ROUND);
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStyle(Paint.Style.STROKE);
                }
                int indexOf = str.indexOf(92, 0);
                Bitmap bitmap = null;
                if (indexOf == -1) {
                    Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
                    int desiredWidth2 = (int) (Layout.getDesiredWidth(str, 0, str.length(), textPaint) + 0.5d);
                    int ceil = (int) Math.ceil(fontMetrics3.descent - fontMetrics3.ascent);
                    iArr[0] = desiredWidth2;
                    iArr[1] = ceil;
                    if (iArr.length == 4) {
                        int pow = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(desiredWidth2) / Math.log(2.0d)));
                        ceil = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(ceil) / Math.log(2.0d)));
                        desiredWidth2 = pow;
                    }
                    if (desiredWidth2 == 0 && ceil == 0) {
                        ceil = 0;
                        i18 = 0;
                        if (iArr.length == 4) {
                            iArr[2] = i18;
                            iArr[3] = ceil;
                        }
                        if (i18 > 0 && ceil > 0) {
                            createBitmap = Bitmap.createBitmap(i18, ceil, Bitmap.Config.ARGB_8888);
                            if (createBitmap != null) {
                                return createBitmap;
                            }
                            canvas.setBitmap(createBitmap);
                            bitmap = createBitmap;
                        }
                        if ((i12 & (-16777216)) != 0) {
                            canvas.drawColor(ViewCompat.MEASURED_SIZE_MASK);
                        } else {
                            canvas.drawColor(i12);
                        }
                        if (i13 != 0) {
                            textPaint.setStrokeWidth(i13);
                            textPaint.setStrokeCap(Paint.Cap.ROUND);
                            textPaint.setStrokeJoin(Paint.Join.ROUND);
                            textPaint.setStyle(Paint.Style.STROKE);
                            textPaint.setColor(i11);
                            canvas.drawText(str, 0.0f, 0.0f - fontMetrics3.ascent, textPaint);
                        }
                        textPaint.setStyle(Paint.Style.FILL);
                        textPaint.setColor(i10);
                        canvas.drawText(str, 0.0f, 0.0f - fontMetrics3.ascent, textPaint);
                    }
                    i18 = desiredWidth2;
                    if (iArr.length == 4) {
                    }
                    if (i18 > 0) {
                        createBitmap = Bitmap.createBitmap(i18, ceil, Bitmap.Config.ARGB_8888);
                        if (createBitmap != null) {
                        }
                    }
                    if ((i12 & (-16777216)) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    textPaint.setStyle(Paint.Style.FILL);
                    textPaint.setColor(i10);
                    canvas.drawText(str, 0.0f, 0.0f - fontMetrics3.ascent, textPaint);
                } else {
                    int i20 = indexOf + 1;
                    int desiredWidth3 = (int) (Layout.getDesiredWidth(str.substring(0, indexOf), textPaint) + 0.5d);
                    int i21 = 2;
                    while (true) {
                        int indexOf2 = str.indexOf(92, i20);
                        if (indexOf2 <= 0) {
                            break;
                        }
                        int desiredWidth4 = (int) (Layout.getDesiredWidth(str.substring(i20, indexOf2), textPaint) + 0.5d);
                        if (desiredWidth4 > desiredWidth3) {
                            desiredWidth3 = desiredWidth4;
                        }
                        i20 = indexOf2 + 1;
                        i21++;
                    }
                    if (i20 != str.length() && (desiredWidth = (int) (Layout.getDesiredWidth(str.substring(i20, str.length()), textPaint) + 0.5d)) > desiredWidth3) {
                        desiredWidth3 = desiredWidth;
                    }
                    Paint.FontMetrics fontMetrics4 = textPaint.getFontMetrics();
                    int ceil2 = (int) Math.ceil(fontMetrics4.descent - fontMetrics4.ascent);
                    int i22 = i21 * ceil2;
                    iArr[0] = desiredWidth3;
                    iArr[1] = i22;
                    if (iArr.length == 4) {
                        fontMetrics = fontMetrics4;
                        i15 = ceil2;
                        int pow2 = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(desiredWidth3) / Math.log(2.0d)));
                        i22 = (int) Math.pow(2.0d, (int) Math.ceil(Math.log(i22) / Math.log(2.0d)));
                        desiredWidth3 = pow2;
                    } else {
                        fontMetrics = fontMetrics4;
                        i15 = ceil2;
                    }
                    if (desiredWidth3 == 0 && i22 == 0) {
                        desiredWidth3 = 0;
                        i22 = 0;
                    }
                    if (iArr.length == 4) {
                        iArr[2] = desiredWidth3;
                        iArr[3] = i22;
                    }
                    if (desiredWidth3 > 0 && i22 > 0) {
                        Bitmap createBitmap2 = Bitmap.createBitmap(desiredWidth3, i22, Bitmap.Config.ARGB_8888);
                        if (createBitmap2 == null) {
                            return createBitmap2;
                        }
                        canvas.setBitmap(createBitmap2);
                        bitmap = createBitmap2;
                    }
                    if ((i12 & (-16777216)) == 0) {
                        canvas.drawColor(ViewCompat.MEASURED_SIZE_MASK);
                    } else {
                        canvas.drawColor(i12);
                    }
                    textPaint.setTextAlign(getTextAlignedType(i14));
                    if (i14 == 1) {
                        i16 = 0;
                        i17 = 0;
                    } else if (i14 == 2) {
                        i16 = 0;
                        i17 = iArr[0];
                    } else {
                        i16 = 0;
                        i17 = iArr[0] / 2;
                    }
                    int i23 = 0;
                    while (true) {
                        int indexOf3 = str.indexOf(92, i16);
                        if (indexOf3 <= 0) {
                            break;
                        }
                        String substring = str.substring(i16, indexOf3);
                        Layout.getDesiredWidth(substring, textPaint);
                        int i24 = indexOf3 + 1;
                        if (i13 != 0) {
                            textPaint.setStrokeWidth(i13);
                            textPaint.setStrokeCap(Paint.Cap.ROUND);
                            textPaint.setStrokeJoin(Paint.Join.ROUND);
                            textPaint.setStyle(Paint.Style.STROKE);
                            textPaint.setColor(i11);
                            fontMetrics2 = fontMetrics;
                            canvas.drawText(substring, i17, (i23 * i15) - fontMetrics2.ascent, textPaint);
                        } else {
                            fontMetrics2 = fontMetrics;
                        }
                        textPaint.setStyle(Paint.Style.FILL);
                        textPaint.setColor(i10);
                        canvas.drawText(substring, i17, (i23 * i15) - fontMetrics2.ascent, textPaint);
                        i23++;
                        i16 = i24;
                        fontMetrics = fontMetrics2;
                    }
                    Paint.FontMetrics fontMetrics5 = fontMetrics;
                    if (i16 != str.length()) {
                        String substring2 = str.substring(i16, str.length());
                        Layout.getDesiredWidth(substring2, textPaint);
                        if (i13 != 0) {
                            textPaint.setStrokeWidth(i13);
                            textPaint.setStrokeCap(Paint.Cap.ROUND);
                            textPaint.setStrokeJoin(Paint.Join.ROUND);
                            textPaint.setStyle(Paint.Style.STROKE);
                            textPaint.setColor(i11);
                            canvas.drawText(substring2, i17, (i23 * i15) - fontMetrics5.ascent, textPaint);
                        }
                        textPaint.setStyle(Paint.Style.FILL);
                        textPaint.setColor(i10);
                        canvas.drawText(substring2, i17, (i23 * i15) - fontMetrics5.ascent, textPaint);
                    }
                }
                return bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Paint.Align getTextAlignedType(int i8) {
        return 1 == i8 ? Paint.Align.LEFT : 2 == i8 ? Paint.Align.RIGHT : Paint.Align.CENTER;
    }

    private static Bitmap getTextBitmap() {
        Paint paint = new Paint();
        paint.setSubpixelText(true);
        paint.setAntiAlias(false);
        paint.setTextSize(12.0f);
        paint.setTypeface(Typeface.DEFAULT);
        float measureText = paint.measureText("!");
        float descent = paint.descent() - paint.ascent();
        if (measureText <= 0.0f) {
            measureText = 3.0f;
        }
        if (descent <= 0.0f) {
            descent = 15.0f;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) Math.ceil(measureText), (int) Math.ceil(descent), Bitmap.Config.ALPHA_8);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        canvas.drawText("!", 0.0f, 0.0f - paint.ascent(), paint);
        return createBitmap;
    }

    private static short[] getTextSize(String str, int i8, int i9) {
        int length = str.length();
        if (length == 0) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(i8);
        textPaint.setTypeface(getTypeface(i9));
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = (short) (Layout.getDesiredWidth(str, 0, r3, textPaint) + 0.5d);
        }
        return sArr;
    }

    private static float[] getTextSizeExt(String str, int i8, int i9) {
        if (str.length() == 0) {
            return null;
        }
        Paint paint = new Paint();
        paint.setSubpixelText(true);
        paint.setAntiAlias(true);
        paint.setTextSize(i8);
        paint.setTypeface(getTypeface(i9));
        return new float[]{paint.measureText(str), paint.descent() - paint.ascent()};
    }

    private static short[] getTextSizeWithHalo(String str, int i8, int i9, int i10) {
        int length = str.length();
        if (length == 0) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(i8);
        textPaint.setTypeface(getTypeface(i9));
        if (i10 != 0) {
            textPaint.setStrokeWidth(i10);
            textPaint.setStrokeCap(Paint.Cap.ROUND);
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStyle(Paint.Style.STROKE);
        }
        short[] sArr = new short[length];
        for (int i11 = 0; i11 < length; i11++) {
            sArr[i11] = (short) (Layout.getDesiredWidth(str, 0, r2, textPaint) + 0.5d);
        }
        return sArr;
    }

    private static Typeface getTypeface(int i8) {
        Typeface typeface = Typeface.DEFAULT;
        return i8 != 1 ? i8 != 2 ? typeface : Typeface.create(typeface, 2) : Typeface.DEFAULT_BOLD;
    }

    private static synchronized boolean isSystemFontChanged() {
        synchronized (EnvDrawText.class) {
            if (defaultFontBmp == null) {
                defaultFontBmp = getTextBitmap();
                return false;
            }
            Bitmap textBitmap = getTextBitmap();
            if (!(!nativeIsBitmapSame(textBitmap, defaultFontBmp))) {
                textBitmap.recycle();
                return false;
            }
            defaultFontBmp.recycle();
            defaultFontBmp = Bitmap.createBitmap(textBitmap);
            textBitmap.recycle();
            return true;
        }
    }

    private static native boolean nativeIsBitmapSame(Bitmap bitmap, Bitmap bitmap2);

    public static synchronized void registFontCache(int i8, Typeface typeface) {
        synchronized (EnvDrawText.class) {
            if (i8 == 0 || typeface == null) {
                return;
            }
            try {
                if (fontCache == null) {
                    fontCache = new SparseArray<>();
                }
                a aVar = fontCache.get(i8);
                if (aVar == null) {
                    a aVar2 = new a();
                    aVar2.f10716a = typeface;
                    aVar2.f10717b++;
                    fontCache.put(i8, aVar2);
                } else {
                    aVar.f10717b++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void removeFontCache(int i8) {
        synchronized (EnvDrawText.class) {
            a aVar = fontCache.get(i8);
            if (aVar == null) {
                return;
            }
            int i9 = aVar.f10717b - 1;
            aVar.f10717b = i9;
            if (i9 == 0) {
                fontCache.remove(i8);
            }
        }
    }

    public static void setContext(Context context) {
        mContext = context;
    }
}
