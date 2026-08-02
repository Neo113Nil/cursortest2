package defpackage;

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

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jln {
    public static final /* synthetic */ int a = 0;
    private static final char[] b;

    static {
        char[] cArr = new char[80];
        b = cArr;
        Arrays.fill(cArr, ' ');
    }

    static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        int i2 = 0;
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof jjq) {
                sb.append(": \"");
                sb.append(jmg.a((jjq) obj));
                sb.append('\"');
                return;
            }
            if (obj instanceof jkp) {
                sb.append(" {");
                b((jkp) obj, sb, i + 2);
                sb.append("\n");
                c(i, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i4 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i4, "key", entry.getKey());
            a(sb, i4, "value", entry.getValue());
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String str2 = (String) obj;
        String[] strArr = jmg.a;
        int length = str2.length();
        StringBuilder sb3 = null;
        int i5 = 0;
        while (true) {
            if (i2 < length) {
                char charAt2 = str2.charAt(i2);
                if (charAt2 > 127) {
                    str2 = jmg.b(str2.getBytes(StandardCharsets.UTF_8));
                    break;
                }
                int i6 = i2 + 1;
                String str3 = jmg.a[charAt2];
                if (str3 != null) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(length + 16);
                    }
                    if (i5 < i2) {
                        sb3.append((CharSequence) str2, i5, i2);
                    }
                    sb3.append(str3);
                    i5 = i6;
                }
                i2 = i6;
            } else if (sb3 != null) {
                if (i5 < length) {
                    sb3.append((CharSequence) str2, i5, length);
                }
                str2 = sb3.toString();
            }
        }
        sb.append(str2);
        sb.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x018a, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018c, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019a, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ac, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c2, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01da, code lost:
    
        if (r13 != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(jll jllVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = jllVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
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
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), jkp.F(method2, jllVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), jkp.F(method, jllVar, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object F = jkp.F(method4, jllVar, new Object[0]);
                    if (method5 != null) {
                        booleanValue = ((Boolean) jkp.F(method5, jllVar, new Object[0])).booleanValue();
                    } else if (!(F instanceof Boolean)) {
                        if (!(F instanceof Integer)) {
                            if (!(F instanceof Float)) {
                                if (!(F instanceof Double)) {
                                    if (F instanceof String) {
                                        equals = F.equals("");
                                    } else if (F instanceof jjq) {
                                        equals = F.equals(jjq.d);
                                    } else {
                                        booleanValue = !(F instanceof jll) ? true : true;
                                    }
                                }
                            }
                        }
                    }
                    if (booleanValue) {
                        a(sb, i, substring, F);
                    }
                }
            }
            i2 = i3;
        }
        if (jllVar instanceof jkm) {
            Iterator d = ((jkm) jllVar).l.d();
            while (d.hasNext()) {
                Map.Entry entry2 = (Map.Entry) d.next();
                a(sb, i, "[" + ((jko) entry2.getKey()).a + "]", entry2.getValue());
            }
        }
        jmk jmkVar = ((jkp) jllVar).s;
        if (jmkVar != null) {
            for (int i5 = 0; i5 < jmkVar.b; i5++) {
                a(sb, i, String.valueOf(jmkVar.c[i5] >>> 3), jmkVar.d[i5]);
            }
        }
    }

    private static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(b, 0, i2);
            i -= i2;
        }
    }
}
