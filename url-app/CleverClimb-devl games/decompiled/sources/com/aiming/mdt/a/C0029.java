package com.aiming.mdt.a;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.aiming.mdt.a.ʻʼʽʾˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0029 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f20 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static long f21 = 1534470062940377342L;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static char[] f22 = {46685, 59055, 6063, 17642, 62885, 8864, 21419, 32958, 12730, 28338, 40893, 52411, 32165, 43692, 56308, 2223, 47546, 54923, 1996, 46220, 'a', 1405, 9431, 'j', 14157, 26532, 38565, 50592, 29877, 41915, 53934, 447, 46100, 55936, 35370, 31551, 10298, 39227, 20002, 16160, 60465, 23844, 25183, 12938, 50049, 37012, 8592, 63112, 34695, 21633, 58783, 47750, 19365, 6274, 43421, 32406, 4056, 56473, 28057, 694, 54160, 24743, 12711, 50849, 38825, 9385, 62889, 35484, 23473, 59579, 47537, 20218, 8125, 44204, 32174, 4813, 41938, 9040, 29602, 33442, 53735, 24744, 47021, 50854, 5555, 42167, 64447, 2736, 22966, 59560, 16289, 20217, 40354, 11447, 17286, 37569, 8576, 28806, 34709, 54923, 26063, 46214};

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f23;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String m30(char c2, int i, int i2) {
        char[] cArr;
        int i3;
        int i4 = f23 + 45;
        f20 = i4 % 128;
        if (!(i4 % 2 != 0)) {
            cArr = new char[i2];
            i3 = 1;
        } else {
            cArr = new char[i2];
            i3 = 0;
        }
        while (true) {
            if ((i3 < i2 ? '#' : (char) 27) != '#') {
                return new String(cArr);
            }
            int i5 = f23 + 75;
            f20 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr[i3] = (char) ((f22[i >> i3] ^ (i3 - f21)) / c2);
                i3 += 29;
            } else {
                cArr[i3] = (char) ((f22[i + i3] ^ (i3 * f21)) ^ c2);
                i3++;
            }
            int i6 = f20 + 91;
            f23 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m31(String str) {
        String str2;
        String str3;
        int indexOf;
        int indexOf2;
        Object obj = null;
        try {
            Class<?> cls = Class.forName(m30((char) 46654, 0, 20).intern());
            Object invoke = cls.getMethod(m30((char) 0, 20, 1).intern(), new Class[0]).invoke(cls, new Object[0]);
            ArrayList arrayList = new ArrayList();
            Field[] declaredFields = invoke.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if ((i < length ? 'N' : (char) 2) != 'N') {
                    break;
                }
                Field field = declaredFields[i];
                field.setAccessible(true);
                if (!(!field.getType().toString().contains(m30((char) 9011, 77, 25).intern()))) {
                    int i2 = f23 + 67;
                    f20 = i2 % 128;
                    int i3 = i2 % 2;
                    arrayList.add(field.get(invoke));
                }
                i++;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!(it.hasNext())) {
                    break;
                }
                int i4 = f23 + 67;
                f20 = i4 % 128;
                int i5 = i4 % 2;
                Object next = it.next();
                Field declaredField = next.getClass().getDeclaredField(m30((char) 1301, 21, 1).intern());
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(next);
                if (obj2 != null) {
                    HashMap hashMap = (HashMap) obj2;
                    if (hashMap.containsKey(str)) {
                        Object obj3 = hashMap.get(str);
                        if (!(obj3 == null)) {
                            Field declaredField2 = obj3.getClass().getDeclaredField(m30((char) 9395, 22, 1).intern());
                            declaredField2.setAccessible(true);
                            Object obj4 = declaredField2.get(obj3);
                            if (!(obj4 == null)) {
                                Field declaredField3 = obj4.getClass().getDeclaredField(m30((char) 0, 23, 1).intern());
                                declaredField3.setAccessible(true);
                                Object obj5 = declaredField3.get(obj4);
                                if (obj5 != null) {
                                    int i6 = f23 + 67;
                                    f20 = i6 % 128;
                                    int i7 = i6 % 2;
                                    str3 = (String) obj5;
                                    if (str3.contains(m30((char) 14143, 24, 8).intern())) {
                                        int i8 = f23 + 1;
                                        f20 = i8 % 128;
                                        int i9 = i8 % 2;
                                        indexOf = str3.indexOf(m30((char) 46121, 32, 1).intern()) + 1;
                                        indexOf2 = str3.indexOf(m30((char) 55974, 33, 9).intern());
                                        break;
                                    }
                                    if (str3.contains(m30((char) 46121, 32, 1).intern())) {
                                        indexOf = str3.lastIndexOf(m30((char) 46121, 32, 1).intern()) + 1;
                                        indexOf2 = str3.length();
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            str2 = str3.substring(indexOf, indexOf2);
        } catch (Throwable unused) {
            m30((char) 25116, 42, 35).intern();
            C0044.m109();
        }
        int i10 = f23 + 61;
        f20 = i10 % 128;
        if (i10 % 2 == 0) {
            return str2;
        }
        super.hashCode();
        return str2;
        str2 = null;
        int i102 = f23 + 61;
        f20 = i102 % 128;
        if (i102 % 2 == 0) {
        }
    }
}
