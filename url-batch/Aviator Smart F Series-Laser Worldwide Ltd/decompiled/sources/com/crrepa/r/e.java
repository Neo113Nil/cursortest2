package com.crrepa.r;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.widget.TextView;
import androidx.core.view.InputDeviceCompat;
import cn.hutool.core.text.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<Integer, String> f13744a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13745b = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935, 4657, 528, 12915, 8786, 21173, 17044, 29431, 25302, 37689, 33560, 45947, 41818, 54205, 50076, 62463, 58334, 9314, 13379, 1056, 5121, 25830, 29895, 17572, 21637, 42346, 46411, 34088, 38153, 58862, 62927, 50604, 54669, 13907, 9842, 5649, 1584, 30423, 26358, 22165, 18100, 46939, 42874, 38681, 34616, 63455, 59390, 55197, 51132, 18628, 22757, 26758, 30887, 2112, 6241, 10242, 14371, 51660, 55789, 59790, 63919, 35144, 39273, 43274, 47403, 23285, 19156, 31415, 27286, 6769, 2640, 14899, 10770, 56317, 52188, 64447, 60318, 39801, 35672, 47931, 43802, 27814, 31879, 19684, 23749, 11298, 15363, 3168, 7233, 60846, 64911, 52716, 56781, 44330, 48395, 36200, 40265, 32407, 28342, 24277, 20212, 15891, 11826, 7761, 3696, 65439, 61374, 57309, 53244, 48923, 44858, 40793, 36728, 37256, 33193, 45514, 41451, 53516, 49453, 61774, 57711, 4224, 161, 12482, 8419, 20484, 16421, 28742, 24679, 33721, 37784, 41979, 46042, 49981, 54044, 58239, 62302, 689, 4752, 8947, 13010, 16949, 21012, 25207, 29270, 46570, 42443, 38312, 34185, 62830, 58703, 54572, 50445, 13538, 9411, 5280, 1153, 29798, 25671, 21540, 17413, 42971, 47098, 34713, 38840, 59231, 63358, 50973, 55100, 9939, 14066, 1681, 5808, 26199, 30326, 17941, 22068, 55628, 51565, 63758, 59695, 39368, 35305, 47498, 43435, 22596, 18533, 30726, 26663, 6336, 2273, 14466, 10403, 52093, 56156, 60223, 64286, 35833, 39896, 43963, 48026, 19061, 23124, 27191, 31254, 2801, 6864, 10931, 14994, 64814, 60687, 56684, 52557, 48554, 44427, 40424, 36297, 31782, 27655, 23652, 19525, 15522, 11395, 7392, 3265, 61215, 65342, 53085, 57212, 44955, 49082, 36825, 40952, 28183, 32310, 20053, 24180, 11923, 16050, 3793, 7920};

    class a extends HashMap<Integer, String> {
        a() {
            put(1, "yyyy/MM/dd HH:mm:ss");
            put(2, "yyyy_MM_dd_HH_mm_ss");
            put(3, "yyyy/MM/dd HH:mm:ss.SSS");
            put(4, cn.hutool.core.date.d.NORM_DATETIME_PATTERN);
            put(5, cn.hutool.core.date.d.NORM_DATE_PATTERN);
            put(6, "yyyy/MM/dd");
            put(7, "yyyy_MM_dd");
            put(8, "HH:mm:ss.SSS");
        }
    }

    public static byte a(String str) {
        if (str == null) {
            return (byte) 0;
        }
        int length = str.length();
        if (length == 4 || length == 8) {
            return (byte) ((length != 8 || str.charAt(0) == '0') ? Integer.parseInt(str, 2) : Integer.parseInt(str, 2) + InputDeviceCompat.SOURCE_ANY);
        }
        return (byte) 0;
    }

    public static long b(byte[] bArr) {
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24) | ((bArr[4] & 255) << 32) | ((bArr[5] & 255) << 40) | ((bArr[6] & 255) << 48) | ((255 & bArr[7]) << 56);
    }

    public static short c(byte[] bArr) {
        return (short) ((bArr[0] & 255) | (bArr[1] << 8));
    }

    public static byte[] d(byte[] bArr) {
        int i8 = 0;
        for (byte b8 : bArr) {
            i8 = f13745b[((i8 >> 8) ^ b8) & 255] ^ (i8 << 8);
        }
        return new byte[]{(byte) (i8 & 255), (byte) ((65280 & i8) >> 8)};
    }

    public static void e(byte[] bArr) {
        int length = bArr.length;
        if (length > 1) {
            int i8 = 0;
            for (int i9 = length - 1; i8 < i9; i9--) {
                byte b8 = bArr[i9];
                bArr[i9] = bArr[i8];
                bArr[i8] = b8;
                i8++;
            }
        }
    }

    public static int a(byte[] bArr) {
        int i8 = bArr[0] & 255;
        if (bArr.length == 1) {
            return i8;
        }
        int i9 = (bArr[1] & 255) << 8;
        if (bArr.length == 2) {
            return i8 | i9;
        }
        int i10 = (bArr[2] & 255) << 16;
        return bArr.length == 3 ? i8 | i9 | i10 : ((bArr[3] & 255) << 24) | i8 | i9 | i10;
    }

    public static String b(byte b8) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append((b8 >> 7) & 1);
        stringBuffer.append((b8 >> 6) & 1);
        stringBuffer.append((b8 >> 5) & 1);
        stringBuffer.append((b8 >> 4) & 1);
        stringBuffer.append((b8 >> 3) & 1);
        stringBuffer.append((b8 >> 2) & 1);
        stringBuffer.append((b8 >> 1) & 1);
        stringBuffer.append(b8 & 1);
        return stringBuffer.toString();
    }

    public static byte[] c(int i8) {
        return new byte[]{(byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) ((i8 >> 16) & 255), (byte) ((i8 >> 24) & 255)};
    }

    public static int a(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    public static String b(byte[] bArr, int i8) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < i8; i9++) {
            String hexString = Integer.toHexString(bArr[i9] & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString.toUpperCase(Locale.ROOT));
            sb.append(l.SPACE);
        }
        return sb.toString();
    }

    public static byte[] c(String str) {
        String replaceAll = str.replaceAll("\\s+", "");
        int length = replaceAll.length();
        byte[] bArr = new byte[length / 2];
        for (int i8 = 0; i8 < length; i8 += 2) {
            bArr[i8 / 2] = (byte) ((Character.digit(replaceAll.charAt(i8), 16) << 4) + Character.digit(replaceAll.charAt(i8 + 1), 16));
        }
        return bArr;
    }

    public static String a(byte b8) {
        String hexString = Integer.toHexString(b8 & 255);
        if (hexString.length() >= 2) {
            return hexString;
        }
        return "0" + hexString;
    }

    public static byte[] b(int i8) {
        return new byte[]{(byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) ((i8 >> 16) & 255), (byte) ((i8 >> 24) & 255)};
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String a(int i8) {
        return new SimpleDateFormat(f13744a.get(Integer.valueOf(i8))).format(new Date());
    }

    public static byte[] b(long j8) {
        return new byte[]{(byte) (j8 & 255), (byte) ((j8 >> 8) & 255), (byte) ((j8 >> 16) & 255), (byte) ((j8 >> 24) & 255), (byte) ((j8 >> 32) & 255), (byte) ((j8 >> 40) & 255), (byte) ((j8 >> 48) & 255), (byte) ((j8 >> 56) & 255)};
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String a(int i8, long j8) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f13744a.get(Integer.valueOf(i8)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j8);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static byte[] b(String str) {
        if (str.length() % 2 != 0) {
            str = "0" + str;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = Integer.valueOf(str.substring(i9, i9 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static List<byte[]> a(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (!(obj instanceof List)) {
            return arrayList;
        }
        for (Object obj2 : (List) obj) {
            if (obj2 instanceof byte[]) {
                arrayList.add((byte[]) obj2);
            }
        }
        return arrayList;
    }

    public static void a(int i8, Object obj, Handler handler) {
        handler.obtainMessage(i8, obj).sendToTarget();
    }

    public static void a(int i8, Object obj, Handler handler, int i9, int i10) {
        handler.obtainMessage(i8, i9, i10, obj).sendToTarget();
    }

    public static void a(TextView textView) {
        textView.scrollTo(0, Math.max(textView.getLayout().getLineTop(textView.getLineCount()) - textView.getHeight(), 0));
    }

    public static boolean a() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            Class cls = (Class) declaredMethod.invoke("null", "dalvik.system.VMRuntime");
            Object invoke = declaredMethod2.invoke(cls, "getRuntime", null);
            if (!(invoke instanceof Method)) {
                return false;
            }
            Method method = (Method) invoke;
            Object invoke2 = declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
            if (!(invoke2 instanceof Method)) {
                return false;
            }
            ((Method) invoke2).invoke(method.invoke(null, new Object[0]), new String[]{"L"});
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static byte[] a(long j8) {
        int i8 = 4;
        byte[] bArr = {(byte) (j8 & 255), r2, (byte) ((j8 >> 16) & 255), (byte) ((j8 >> 24) & 255)};
        byte b8 = (byte) ((j8 >> 8) & 255);
        int i9 = 1;
        while (true) {
            if (i8 <= 0) {
                break;
            }
            if (bArr[i8 - 1] != 0) {
                i9 = i8;
                break;
            }
            i8--;
        }
        return Arrays.copyOf(bArr, i9);
    }

    public static byte[] a(short s7) {
        return new byte[]{(byte) (s7 & 255), (byte) ((s7 >> 8) & 255)};
    }
}
