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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f584a;

    static {
        char[] cArr = new char[80];
        f584a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i3, StringBuilder sb2) {
        while (i3 > 0) {
            int i10 = 80;
            if (i3 <= 80) {
                i10 = i3;
            }
            sb2.append(f584a, 0, i10);
            i3 -= i10;
        }
    }

    public static void b(StringBuilder sb2, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i3, sb2);
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
        if (obj instanceof String) {
            sb2.append(": \"");
            f fVar = f.f533i;
            sb2.append(c6.f.B(new f(((String) obj).getBytes(x.f647a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof f) {
            sb2.append(": \"");
            sb2.append(c6.f.B((f) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof v) {
            sb2.append(" {");
            c((v) obj, sb2, i3 + 2);
            sb2.append("\n");
            a(i3, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i3 + 2;
        b(sb2, i11, "key", entry.getKey());
        b(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        a(i3, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0192, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a7, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bd, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(v vVar, StringBuilder sb2, int i3) {
        int i10;
        int i11;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = vVar.getClass().getDeclaredMethods();
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
                    b(sb2, i3, substring.substring(0, substring.length() - 4), v.e(method2, vVar, new Object[0]));
                    i10 = i11;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i3, substring.substring(0, substring.length() - 3), v.e(method, vVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e2 = v.e(method4, vVar, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (e2 instanceof Boolean) {
                            equals = !((Boolean) e2).booleanValue();
                        } else if (!(e2 instanceof Integer)) {
                            if (!(e2 instanceof Float)) {
                                if (!(e2 instanceof Double)) {
                                    equals = e2 instanceof String ? e2.equals("") : e2 instanceof f ? e2.equals(f.f533i) : !(e2 instanceof a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) v.e(method5, vVar, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb2, i3, substring, e2);
                    }
                }
            }
            i10 = i11;
        }
        d1 d1Var = vVar.unknownFields;
        if (d1Var != null) {
            for (int i13 = 0; i13 < d1Var.f525a; i13++) {
                b(sb2, i3, String.valueOf(d1Var.f526b[i13] >>> 3), d1Var.f527c[i13]);
            }
        }
    }
}
