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
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3434a;

    static {
        char[] cArr = new char[80];
        f3434a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i5 = 80;
            if (i2 <= 80) {
                i5 = i2;
            }
            sb.append(f3434a, 0, i5);
            i2 -= i5;
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
            C0191g c0191g = C0191g.f3498i;
            sb.append(O6.g.E(new C0191g(((String) obj).getBytes(AbstractC0207x.f3571a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0191g) {
            sb.append(": \"");
            sb.append(O6.g.E((C0191g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0205v) {
            sb.append(" {");
            c((AbstractC0205v) obj, sb, i2 + 2);
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
        int i7 = i2 + 2;
        b(sb, i7, "key", entry.getKey());
        b(sb, i7, "value", entry.getValue());
        sb.append("\n");
        a(i2, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(AbstractC0205v abstractC0205v, StringBuilder sb, int i2) {
        int i5;
        int i7;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0205v.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i8 = 0;
        while (true) {
            i5 = 3;
            if (i8 >= length) {
                break;
            }
            Method method3 = declaredMethods[i8];
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
            i8++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i5);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i7 = i5;
            } else {
                i7 = i5;
                if (method2.getReturnType().equals(List.class)) {
                    b(sb, i2, substring.substring(0, substring.length() - 4), AbstractC0205v.e(method2, abstractC0205v, new Object[0]));
                    i5 = i7;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i2, substring.substring(0, substring.length() - 3), AbstractC0205v.e(method, abstractC0205v, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e7 = AbstractC0205v.e(method4, abstractC0205v, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (e7 instanceof Boolean) {
                            equals = !((Boolean) e7).booleanValue();
                        } else if (!(e7 instanceof Integer)) {
                            if (!(e7 instanceof Float)) {
                                if (!(e7 instanceof Double)) {
                                    equals = e7 instanceof String ? e7.equals("") : e7 instanceof C0191g ? e7.equals(C0191g.f3498i) : !(e7 instanceof AbstractC0185a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC0205v.e(method5, abstractC0205v, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i2, substring, e7);
                    }
                }
            }
            i5 = i7;
        }
        c0 c0Var = abstractC0205v.unknownFields;
        if (c0Var != null) {
            for (int i9 = 0; i9 < c0Var.f3486a; i9++) {
                b(sb, i2, String.valueOf(c0Var.f3487b[i9] >>> 3), c0Var.f3488c[i9]);
            }
        }
    }
}
