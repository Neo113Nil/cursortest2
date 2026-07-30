package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {
    private static final int BUFFER_SIZE = 8192;
    private static final char[] HEX_DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] HEX_DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private g() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        return c1.bitmap2Bytes(bitmap);
    }

    public static Drawable bitmap2Drawable(Bitmap bitmap) {
        return c1.bitmap2Drawable(bitmap);
    }

    public static byte[] bits2Bytes(String str) {
        int length = str.length() % 8;
        int length2 = str.length() / 8;
        if (length != 0) {
            while (length < 8) {
                str = "0" + str;
                length++;
            }
            length2++;
        }
        byte[] bArr = new byte[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            for (int i9 = 0; i9 < 8; i9++) {
                byte b8 = (byte) (bArr[i8] << 1);
                bArr[i8] = b8;
                bArr[i8] = (byte) (b8 | (str.charAt((i8 * 8) + i9) - '0'));
            }
        }
        return bArr;
    }

    @SuppressLint({"DefaultLocale"})
    public static String byte2FitMemorySize(long j8) {
        return byte2FitMemorySize(j8, 3);
    }

    public static double byte2MemorySize(long j8, int i8) {
        if (j8 < 0) {
            return -1.0d;
        }
        return j8 / i8;
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        return c1.bytes2Bitmap(bArr);
    }

    public static String bytes2Bits(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            for (int i8 = 7; i8 >= 0; i8--) {
                sb.append(((b8 >> i8) & 1) == 0 ? '0' : '1');
            }
        }
        return sb.toString();
    }

    public static char[] bytes2Chars(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = (char) (bArr[i8] & 255);
        }
        return cArr;
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return c1.bytes2Drawable(bArr);
    }

    public static String bytes2HexString(byte[] bArr) {
        return bytes2HexString(bArr, true);
    }

    public static InputStream bytes2InputStream(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    public static JSONArray bytes2JSONArray(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONArray(new String(bArr));
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static JSONObject bytes2JSONObject(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONObject(new String(bArr));
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object bytes2Object(byte[] bArr) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            try {
                try {
                    Object readObject = objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return readObject;
                } catch (Exception e9) {
                    e = e9;
                    e.printStackTrace();
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            objectInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (objectInputStream2 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    public static OutputStream bytes2OutputStream(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                if (length > 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byteArrayOutputStream.write(bArr);
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                            return byteArrayOutputStream;
                        } catch (IOException e9) {
                            e = e9;
                            e.printStackTrace();
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                            return null;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        byteArrayOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = length;
            }
        }
        return null;
    }

    public static <T> T bytes2Parcelable(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public static String bytes2String(byte[] bArr) {
        return bytes2String(bArr, "");
    }

    public static byte[] chars2Bytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return null;
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr[i8] = (byte) cArr[i8];
        }
        return bArr;
    }

    public static int dp2px(float f8) {
        return c1.dp2px(f8);
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        return c1.drawable2Bitmap(drawable);
    }

    public static byte[] drawable2Bytes(Drawable drawable) {
        return c1.drawable2Bytes(drawable);
    }

    private static String getSafeCharset(String str) {
        return (c1.isSpace(str) || !Charset.isSupported(str)) ? cn.hutool.core.util.l.UTF_8 : str;
    }

    private static int hex2Dec(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - '0';
        }
        if (c8 < 'A' || c8 > 'F') {
            throw new IllegalArgumentException();
        }
        return c8 - '7';
    }

    public static byte[] hexString2Bytes(String str) {
        if (c1.isSpace(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 != 0) {
            str = "0" + str;
            length++;
        }
        char[] charArray = str.toUpperCase().toCharArray();
        byte[] bArr = new byte[length >> 1];
        for (int i8 = 0; i8 < length; i8 += 2) {
            bArr[i8 >> 1] = (byte) ((hex2Dec(charArray[i8]) << 4) | hex2Dec(charArray[i8 + 1]));
        }
        return bArr;
    }

    public static int hexString2Int(String str) {
        return Integer.parseInt(str, 16);
    }

    public static ByteArrayOutputStream input2OutputStream(InputStream inputStream) {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e8) {
                        }
                    }
                }
                return byteArrayOutputStream;
            } catch (IOException e9) {
                e9.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e82) {
                e82.printStackTrace();
            }
        }
    }

    public static byte[] inputStream2Bytes(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return input2OutputStream(inputStream).toByteArray();
    }

    public static List<String> inputStream2Lines(InputStream inputStream) {
        return inputStream2Lines(inputStream, "");
    }

    public static String inputStream2String(InputStream inputStream, String str) {
        if (inputStream == null) {
            return "";
        }
        try {
            ByteArrayOutputStream input2OutputStream = input2OutputStream(inputStream);
            return input2OutputStream == null ? "" : input2OutputStream.toString(getSafeCharset(str));
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String int2HexString(int i8) {
        return Integer.toHexString(i8);
    }

    public static byte[] jsonArray2Bytes(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toString().getBytes();
    }

    public static byte[] jsonObject2Bytes(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString().getBytes();
    }

    public static long memorySize2Byte(long j8, int i8) {
        if (j8 < 0) {
            return -1L;
        }
        return j8 * i8;
    }

    public static String millis2FitTimeSpan(long j8, int i8) {
        return c1.millis2FitTimeSpan(j8, i8);
    }

    public static long millis2TimeSpan(long j8, int i8) {
        return j8 / i8;
    }

    public static ByteArrayInputStream output2InputStream(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return new ByteArrayInputStream(((ByteArrayOutputStream) outputStream).toByteArray());
    }

    public static byte[] outputStream2Bytes(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return ((ByteArrayOutputStream) outputStream).toByteArray();
    }

    public static String outputStream2String(OutputStream outputStream, String str) {
        if (outputStream == null) {
            return "";
        }
        try {
            return new String(outputStream2Bytes(outputStream), getSafeCharset(str));
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static byte[] parcelable2Bytes(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static int px2dp(float f8) {
        return c1.px2dp(f8);
    }

    public static int px2sp(float f8) {
        return c1.px2sp(f8);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001f: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:32), block:B:38:0x001f */
    public static byte[] serializable2Bytes(Serializable serializable) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ObjectOutputStream objectOutputStream3 = null;
        try {
            if (serializable == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(serializable);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return byteArray;
                } catch (Exception e9) {
                    e = e9;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Exception e11) {
                e = e11;
                objectOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (objectOutputStream3 != null) {
                    try {
                        objectOutputStream3.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream3 = objectOutputStream;
        }
    }

    public static int sp2px(float f8) {
        return c1.sp2px(f8);
    }

    public static byte[] string2Bytes(String str) {
        return string2Bytes(str, "");
    }

    public static InputStream string2InputStream(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return new ByteArrayInputStream(str.getBytes(getSafeCharset(str2)));
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static OutputStream string2OutputStream(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return bytes2OutputStream(str.getBytes(getSafeCharset(str2)));
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static long timeSpan2Millis(long j8, int i8) {
        return j8 * i8;
    }

    public static Bitmap view2Bitmap(View view) {
        return c1.view2Bitmap(view);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i8) {
        return c1.bitmap2Bytes(bitmap, compressFormat, i8);
    }

    @SuppressLint({"DefaultLocale"})
    public static String byte2FitMemorySize(long j8, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("precision shouldn't be less than zero!");
        }
        if (j8 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j8 < 1024) {
            return String.format("%." + i8 + "fB", Double.valueOf(j8));
        }
        if (j8 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return String.format("%." + i8 + "fKB", Double.valueOf(j8 / 1024.0d));
        }
        if (j8 < 1073741824) {
            return String.format("%." + i8 + "fMB", Double.valueOf(j8 / 1048576.0d));
        }
        return String.format("%." + i8 + "fGB", Double.valueOf(j8 / 1.073741824E9d));
    }

    public static String bytes2HexString(byte[] bArr, boolean z7) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z7 ? HEX_DIGITS_UPPER : HEX_DIGITS_LOWER;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i8 = 0;
        for (byte b8 : bArr) {
            int i9 = i8 + 1;
            cArr2[i8] = cArr[(b8 >> 4) & 15];
            i8 += 2;
            cArr2[i9] = cArr[b8 & 15];
        }
        return new String(cArr2);
    }

    public static String bytes2String(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, getSafeCharset(str));
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return new String(bArr);
        }
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i8) {
        return c1.drawable2Bytes(drawable, compressFormat, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<String> inputStream2Lines(InputStream inputStream, String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            ArrayList arrayList = new ArrayList();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, getSafeCharset(str)));
            while (true) {
                try {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            arrayList.add(readLine);
                        } else {
                            try {
                                break;
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                    } catch (IOException e9) {
                        e = e9;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            bufferedReader.close();
            return arrayList;
        } catch (IOException e12) {
            e = e12;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
    }

    public static byte[] string2Bytes(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(getSafeCharset(str2));
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return str.getBytes();
        }
    }
}
