package com.google.android.gms.internal.play_billing;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.play_billing.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0269v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2943a;

    static {
        char[] cArr = new char[80];
        f2943a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i3, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC0216d1.e(new Y0(((String) obj).getBytes(AbstractC0240l1.f2880a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof Y0) {
            sb.append(": \"");
            sb.append(AbstractC0216d1.e((Y0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0225g1) {
            sb.append(" {");
            c((AbstractC0225g1) obj, sb, i3 + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            b(i3, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i5 = i3 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i5, "key", entry.getKey());
        a(sb, i5, "value", entry.getValue());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        b(i3, sb);
        sb.append("}");
    }

    public static void b(int i3, StringBuilder sb) {
        while (i3 > 0) {
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(f2943a, 0, i4);
            i3 -= i4;
        }
    }

    public static void c(AbstractC0225g1 abstractC0225g1, StringBuilder sb, int i3) {
        int i4;
        int i5;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0225g1.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i6 = 0;
        while (true) {
            i4 = 3;
            if (i6 >= length) {
                break;
            }
            Method method3 = declaredMethods[i6];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i6++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i4);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i5 = i4;
            } else {
                i5 = i4;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i3, substring.substring(0, substring.length() - 4), AbstractC0225g1.i(method2, abstractC0225g1, new Object[0]));
                    i4 = i5;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i3, substring.substring(0, substring.length() - 3), AbstractC0225g1.i(method, abstractC0225g1, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i7 = AbstractC0225g1.i(method4, abstractC0225g1, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) AbstractC0225g1.i(method5, abstractC0225g1, new Object[0])).booleanValue()) {
                        }
                        a(sb, i3, substring, i7);
                    } else if (i7 instanceof Boolean) {
                        if (!((Boolean) i7).booleanValue()) {
                        }
                        a(sb, i3, substring, i7);
                    } else if (i7 instanceof Integer) {
                        if (((Integer) i7).intValue() == 0) {
                        }
                        a(sb, i3, substring, i7);
                    } else if (i7 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) i7).floatValue()) == 0) {
                        }
                        a(sb, i3, substring, i7);
                    } else if (i7 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) i7).doubleValue()) == 0) {
                        }
                        a(sb, i3, substring, i7);
                    } else {
                        if (i7 instanceof String) {
                            equals = i7.equals("");
                        } else if (i7 instanceof Y0) {
                            equals = i7.equals(Y0.f2822c);
                        } else if (i7 instanceof S0) {
                            if (i7 == ((AbstractC0225g1) ((AbstractC0225g1) ((S0) i7)).d(6))) {
                            }
                            a(sb, i3, substring, i7);
                        } else {
                            if ((i7 instanceof Enum) && ((Enum) i7).ordinal() == 0) {
                            }
                            a(sb, i3, substring, i7);
                        }
                        if (equals) {
                        }
                        a(sb, i3, substring, i7);
                    }
                }
            }
            i4 = i5;
        }
        H1 h12 = abstractC0225g1.zzc;
        if (h12 != null) {
            for (int i8 = 0; i8 < h12.f2739a; i8++) {
                a(sb, i3, String.valueOf(h12.f2740b[i8] >>> 3), h12.f2741c[i8]);
            }
        }
    }
}
