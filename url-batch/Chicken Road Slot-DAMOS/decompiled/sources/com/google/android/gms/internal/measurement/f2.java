package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2275a;

    static {
        char[] cArr = new char[80];
        f2275a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i3, String str, Object obj) {
        String replace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i3, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof v0) {
                sb2.append(": \"");
                sb2.append(oa.d(((v0) obj).n()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof k1) {
                sb2.append(" {");
                b((k1) obj, sb2, i3 + 2);
                sb2.append("\n");
                c(i3, sb2);
                sb2.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
                return;
            }
            int i11 = i3 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb2, i11, "key", entry.getKey());
            a(sb2, i11, "value", entry.getValue());
            sb2.append("\n");
            c(i3, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String str2 = (String) obj;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < str2.length(); i12++) {
            char charAt2 = str2.charAt(i12);
            if (charAt2 < ' ' || charAt2 > '~') {
                replace = oa.d(str2.getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (charAt2 == '\"') {
                z12 = true;
            } else if (charAt2 == '\'') {
                z11 = true;
            } else if (charAt2 == '\\') {
                z10 = true;
            }
        }
        if (z10) {
            str2 = str2.replace("\\", "\\\\");
        }
        replace = z11 ? str2.replace("'", "\\'") : str2;
        if (z12) {
            replace = replace.replace("\"", "\\\"");
        }
        sb2.append(replace);
        sb2.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018e, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b6, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ce, code lost:
    
        if (r13 != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(k1 k1Var, StringBuilder sb2, int i3) {
        int i10;
        int i11;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = k1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
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
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i11 = i10;
            } else {
                i11 = i10;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i3, substring.substring(0, substring.length() - 4), k1.p(method2, k1Var, new Object[0]));
                    i10 = i11;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i3, substring.substring(0, substring.length() - 3), k1.p(method, k1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object p4 = k1.p(method4, k1Var, new Object[0]);
                    if (method5 != null) {
                        booleanValue = ((Boolean) k1.p(method5, k1Var, new Object[0])).booleanValue();
                    } else if (!(p4 instanceof Boolean)) {
                        if (!(p4 instanceof Integer)) {
                            if (!(p4 instanceof Float)) {
                                if (!(p4 instanceof Double)) {
                                    if (p4 instanceof String) {
                                        equals = p4.equals("");
                                    } else if (p4 instanceof v0) {
                                        equals = p4.equals(v0.f2860e);
                                    } else {
                                        booleanValue = !(p4 instanceof o0) ? true : true;
                                    }
                                }
                            }
                        }
                    }
                    if (booleanValue) {
                        a(sb2, i3, substring, p4);
                    }
                }
            }
            i10 = i11;
        }
        u2 u2Var = k1Var.zzc;
        if (u2Var != null) {
            for (int i13 = 0; i13 < u2Var.f2838a; i13++) {
                a(sb2, i3, String.valueOf(u2Var.f2839b[i13] >>> 3), u2Var.f2840c[i13]);
            }
        }
    }

    public static void c(int i3, StringBuilder sb2) {
        while (i3 > 0) {
            int i10 = 80;
            if (i3 <= 80) {
                i10 = i3;
            }
            sb2.append(f2275a, 0, i10);
            i3 -= i10;
        }
    }
}
