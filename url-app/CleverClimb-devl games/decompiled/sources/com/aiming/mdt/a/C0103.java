package com.aiming.mdt.a;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.aiming.mdt.a.ʻˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0103 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f301 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f302;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int[] f303 = {-1429788386, -399182229, -45095343, -405631707, 455675348, -1156421459, 985788327, -1415501670, -512218666, -212648160, -835814842, 1478341996, -1132649938, 1866119131, 1662375091, 1463491532, 934014856, 663420092};

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static Object m376(Object obj, String str) {
        Object obj2 = null;
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if ((i < length ? 'A' : '4') == '4') {
                break;
            }
            int i2 = f301 + 37;
            f302 = i2 % 128;
            int i3 = i2 % 2;
            Field field = declaredFields[i];
            field.setAccessible(true);
            if ((field.getType().toString().contains(str) ? ':' : 'E') != 'E') {
                int i4 = f301 + 35;
                f302 = i4 % 128;
                int i5 = i4 % 2;
                obj2 = field.get(obj);
                int i6 = f302 + 117;
                f301 = i6 % 128;
                int i7 = i6 % 2;
                break;
            }
            i++;
        }
        int i8 = f301 + 109;
        f302 = i8 % 128;
        if (i8 % 2 != 0) {
        }
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if ((r7 != null ? 16 : '\b') != '\b') goto L20;
     */
    /* renamed from: ʻʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m377(Object obj) {
        Object m376;
        Object m3762;
        String str;
        int i = f302 + 37;
        f301 = i % 128;
        int i2 = i % 2;
        String str2 = "";
        try {
            m376 = m376(obj, m378(new int[]{-1458386441, -854660230, 705995724, 263758499, 408940153, 1225608028, -106394081, 1018997071, 1399947183, 248006891, 754649356, -1167685890, -1144262589, -144894472}, 26).intern());
        } catch (Throwable unused) {
            m378(new int[]{-252249434, 513293793, 1630782575, -501091107, 643009977, -576042457, 1009414076, -768050961, -946304665, 666767151, -1576804190, -163683020, -351346384, -857784959, 1846805023, 1471095897, 1957352938, -1624436370, 859292987, -1955833129}, 37).intern();
            C0044.m109();
        }
        if (m376 != null && (m3762 = m376(m376, m378(new int[]{-1458386441, -854660230, 705995724, 263758499, 408940153, 1225608028, 1073361927, -1828027310, 754649356, -1167685890, -1319684906, 1868860645, -1174184381, -501314290}, 26).intern())) != null) {
            int i3 = f301 + 81;
            f302 = i3 % 128;
            if (i3 % 2 != 0) {
                Field declaredField = m3762.getClass().getDeclaredField(m378(new int[]{1508123065, -27352090}, 1).intern());
                declaredField.setAccessible(true);
                str = (String) declaredField.get(m3762);
                if (str != null) {
                    Matcher matcher = Pattern.compile(m378(new int[]{1101579508, -831521728, 1919770731, -393362901, 1438361141, -1477266193, 1214967536, 1086962358, 1314187118, -1497516377, 178302282, -1235274771, 2131535659, -140388268}, 28).intern()).matcher(str);
                    if (matcher.find()) {
                        int i4 = f301 + 119;
                        f302 = i4 % 128;
                        int i5 = i4 % 2;
                        str2 = matcher.group(1);
                    }
                }
            } else {
                Field declaredField2 = m3762.getClass().getDeclaredField(m378(new int[]{1508123065, -27352090}, 1).intern());
                declaredField2.setAccessible(true);
                str = (String) declaredField2.get(m3762);
            }
            m378(new int[]{-252249434, 513293793, 1630782575, -501091107, 643009977, -576042457, 1009414076, -768050961, -946304665, 666767151, -1576804190, -163683020, -351346384, -857784959, 1846805023, 1471095897, 1957352938, -1624436370, 859292987, -1955833129}, 37).intern();
            C0044.m109();
            return str2;
        }
        int i6 = f301 + 55;
        f302 = i6 % 128;
        int i7 = i6 % 2;
        return str2;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static String m378(int[] iArr, int i) {
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = (int[]) f303.clone();
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                String str = new String(cArr2, 0, i);
                int i3 = f302 + 45;
                f301 = i3 % 128;
                if (i3 % 2 == 0) {
                }
                return str;
            }
            int i4 = f302 + 113;
            f301 = i4 % 128;
            int i5 = i4 % 2;
            cArr[0] = (char) (iArr[i2] >> 16);
            cArr[1] = (char) iArr[i2];
            int i6 = i2 + 1;
            cArr[2] = (char) (iArr[i6] >> 16);
            cArr[3] = (char) iArr[i6];
            C0192.m723(cArr, iArr2, false);
            int i7 = i2 << 1;
            cArr2[i7] = cArr[0];
            cArr2[i7 + 1] = cArr[1];
            cArr2[i7 + 2] = cArr[2];
            cArr2[i7 + 3] = cArr[3];
            i2 += 2;
        }
    }
}
