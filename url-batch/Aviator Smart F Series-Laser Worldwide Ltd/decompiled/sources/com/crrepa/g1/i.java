package com.crrepa.g1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12921a = "-";

    /* renamed from: b, reason: collision with root package name */
    private static final int f12922b = 3;

    /* renamed from: c, reason: collision with root package name */
    private static final int f12923c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f12924d = 2;

    private i() {
    }

    public static String a(String str) {
        String[] a8 = a(str, "-");
        if (a8 == null || a8.length < 3) {
            return null;
        }
        return a8[1];
    }

    public static int b(String str) {
        String[] a8 = a(str, "-");
        int i8 = 0;
        if (a8 != null && a8.length >= 3) {
            Matcher matcher = Pattern.compile("\\d+").matcher(a8[2]);
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                arrayList.add(Integer.valueOf(matcher.group(0)));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i8 = (i8 * 10) + ((Integer) it.next()).intValue();
            }
        }
        return i8;
    }

    private static String[] a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(str2);
    }
}
