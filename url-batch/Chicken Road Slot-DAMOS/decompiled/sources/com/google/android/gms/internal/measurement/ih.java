package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class ih {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale f2412a = Locale.ROOT;

    public static String a(Object obj) {
        String simpleName;
        if (obj == null) {
            return "null";
        }
        try {
            if (obj.getClass().isArray()) {
                return obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
            }
            String obj2 = obj.toString();
            return obj2 != null ? obj2 : c(obj, "toString() returned null");
        } catch (RuntimeException e2) {
            try {
                simpleName = e2.toString();
            } catch (RuntimeException e9) {
                simpleName = e9.getClass().getSimpleName();
            }
            return c(obj, simpleName);
        }
    }

    public static void b(StringBuilder sb2, long j, boolean z10) {
        if (j == 0) {
            sb2.append("0");
            return;
        }
        String str = true != z10 ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb2.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    public static String c(Object obj, String str) {
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(identityHashCode).length() + 2 + String.valueOf(str).length() + 1);
        sb2.append("{");
        sb2.append(name);
        sb2.append("@");
        sb2.append(identityHashCode);
        return v4.a.p(sb2, ": ", str, "}");
    }
}
