package androidx.datastore.preferences.protobuf;

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
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5281a;

    static {
        char[] cArr = new char[80];
        f5281a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i4 = 80;
            if (i2 <= 80) {
                i4 = i2;
            }
            sb.append(f5281a, 0, i4);
            i2 -= i4;
        }
    }

    public static void b(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i2, sb);
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
            C0442g c0442g = C0442g.f5338i;
            sb.append(e0.c(new C0442g(((String) obj).getBytes(AbstractC0458x.f5409a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0442g) {
            sb.append(": \"");
            sb.append(e0.c((C0442g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0456v) {
            sb.append(" {");
            c((AbstractC0456v) obj, sb, i2 + 2);
            sb.append("\n");
            a(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        b(sb, i5, "key", entry.getKey());
        b(sb, i5, "value", entry.getValue());
        sb.append("\n");
        a(i2, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a8, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01be, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(AbstractC0456v abstractC0456v, StringBuilder sb, int i2) {
        int i4;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0456v.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i4 = 3;
            if (i5 >= length) {
                break;
            }
            Method method3 = declaredMethods[i5];
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
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i4);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i2, substring.substring(0, substring.length() - 4), AbstractC0456v.g(method2, abstractC0456v, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i2, substring.substring(0, substring.length() - 3), AbstractC0456v.g(method, abstractC0456v, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object g4 = AbstractC0456v.g(method4, abstractC0456v, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (g4 instanceof Boolean) {
                            equals = !((Boolean) g4).booleanValue();
                        } else if (!(g4 instanceof Integer)) {
                            if (!(g4 instanceof Float)) {
                                if (!(g4 instanceof Double)) {
                                    equals = g4 instanceof String ? g4.equals("") : g4 instanceof C0442g ? g4.equals(C0442g.f5338i) : !(g4 instanceof AbstractC0434a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC0456v.g(method5, abstractC0456v, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i2, substring, g4);
                    }
                }
            }
            i4 = 3;
        }
        j0 j0Var = abstractC0456v.unknownFields;
        if (j0Var != null) {
            for (int i6 = 0; i6 < j0Var.f5366a; i6++) {
                b(sb, i2, String.valueOf(j0Var.f5367b[i6] >>> 3), j0Var.f5368c[i6]);
            }
        }
    }
}
