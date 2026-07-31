package androidx.datastore.preferences.protobuf;

import a.AbstractC0086a;
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
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f1462a;

    static {
        char[] cArr = new char[80];
        f1462a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f1462a, 0, i3);
            i2 -= i3;
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
        if (obj instanceof String) {
            sb.append(": \"");
            C0095g c0095g = C0095g.f1525g;
            sb.append(AbstractC0086a.o(new C0095g(((String) obj).getBytes(AbstractC0112y.f1602a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0095g) {
            sb.append(": \"");
            sb.append(AbstractC0086a.o((C0095g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0110w) {
            sb.append(" {");
            c((AbstractC0110w) obj, sb, i2 + 2);
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
        int i4 = i2 + 2;
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, "value", entry.getValue());
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
    public static void c(AbstractC0110w abstractC0110w, StringBuilder sb, int i2) {
        int i3;
        int i4;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0110w.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i3 = 3;
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
            String substring = ((String) entry.getKey()).substring(i3);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i4 = i3;
            } else {
                i4 = i3;
                if (method2.getReturnType().equals(List.class)) {
                    b(sb, i2, substring.substring(0, substring.length() - 4), AbstractC0110w.e(method2, abstractC0110w, new Object[0]));
                    i3 = i4;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i2, substring.substring(0, substring.length() - 3), AbstractC0110w.e(method, abstractC0110w, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e2 = AbstractC0110w.e(method4, abstractC0110w, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (e2 instanceof Boolean) {
                            equals = !((Boolean) e2).booleanValue();
                        } else if (!(e2 instanceof Integer)) {
                            if (!(e2 instanceof Float)) {
                                if (!(e2 instanceof Double)) {
                                    equals = e2 instanceof String ? e2.equals("") : e2 instanceof C0095g ? e2.equals(C0095g.f1525g) : !(e2 instanceof AbstractC0089a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC0110w.e(method5, abstractC0110w, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i2, substring, e2);
                    }
                }
            }
            i3 = i4;
        }
        d0 d0Var = abstractC0110w.unknownFields;
        if (d0Var != null) {
            for (int i6 = 0; i6 < d0Var.f1517a; i6++) {
                b(sb, i2, String.valueOf(d0Var.f1518b[i6] >>> 3), d0Var.f1519c[i6]);
            }
        }
    }
}
