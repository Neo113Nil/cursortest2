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

/* loaded from: classes.dex */
public abstract class L0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5872a;

    static {
        char[] cArr = new char[80];
        f5872a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i4, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
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
            C0336n0 c0336n0 = C0336n0.f5981c;
            sb.append(AbstractC0347t0.x(new C0336n0(((String) obj).getBytes(B0.f5803a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0336n0) {
            sb.append(": \"");
            sb.append(AbstractC0347t0.x((C0336n0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0353w0) {
            sb.append(" {");
            c((AbstractC0353w0) obj, sb, i4 + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            b(i4, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i6 = i4 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i6, "key", entry.getKey());
        a(sb, i6, "value", entry.getValue());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        b(i4, sb);
        sb.append("}");
    }

    public static void b(int i4, StringBuilder sb) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb.append(f5872a, 0, i5);
            i4 -= i5;
        }
    }

    public static void c(AbstractC0353w0 abstractC0353w0, StringBuilder sb, int i4) {
        int i5;
        int i6;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0353w0.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            i5 = 3;
            if (i7 >= length) {
                break;
            }
            Method method3 = declaredMethods[i7];
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
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i5);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i6 = i5;
            } else {
                i6 = i5;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i4, substring.substring(0, substring.length() - 4), AbstractC0353w0.i(method2, abstractC0353w0, new Object[0]));
                    i5 = i6;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i4, substring.substring(0, substring.length() - 3), AbstractC0353w0.i(method, abstractC0353w0, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i8 = AbstractC0353w0.i(method4, abstractC0353w0, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) AbstractC0353w0.i(method5, abstractC0353w0, new Object[0])).booleanValue()) {
                        }
                        a(sb, i4, substring, i8);
                    } else if (i8 instanceof Boolean) {
                        if (!((Boolean) i8).booleanValue()) {
                        }
                        a(sb, i4, substring, i8);
                    } else if (i8 instanceof Integer) {
                        if (((Integer) i8).intValue() == 0) {
                        }
                        a(sb, i4, substring, i8);
                    } else if (i8 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) i8).floatValue()) == 0) {
                        }
                        a(sb, i4, substring, i8);
                    } else if (i8 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) i8).doubleValue()) == 0) {
                        }
                        a(sb, i4, substring, i8);
                    } else {
                        if (i8 instanceof String) {
                            equals = i8.equals("");
                        } else if (i8 instanceof C0336n0) {
                            equals = i8.equals(C0336n0.f5981c);
                        } else if (i8 instanceof AbstractC0320h0) {
                            if (i8 == ((AbstractC0353w0) ((AbstractC0353w0) ((AbstractC0320h0) i8)).d(6))) {
                            }
                            a(sb, i4, substring, i8);
                        } else {
                            if ((i8 instanceof Enum) && ((Enum) i8).ordinal() == 0) {
                            }
                            a(sb, i4, substring, i8);
                        }
                        if (equals) {
                        }
                        a(sb, i4, substring, i8);
                    }
                }
            }
            i5 = i6;
        }
        W0 w02 = abstractC0353w0.zzc;
        if (w02 != null) {
            for (int i9 = 0; i9 < w02.f5923a; i9++) {
                a(sb, i4, String.valueOf(w02.f5924b[i9] >>> 3), w02.f5925c[i9]);
            }
        }
    }
}
