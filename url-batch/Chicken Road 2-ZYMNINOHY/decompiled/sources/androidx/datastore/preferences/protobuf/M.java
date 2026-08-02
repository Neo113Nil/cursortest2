package androidx.datastore.preferences.protobuf;

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
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4572a;

    static {
        char[] cArr = new char[80];
        f4572a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i4, StringBuilder sb) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb.append(f4572a, 0, i5);
            i4 -= i5;
        }
    }

    public static void b(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i4, sb);
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
            C0174g c0174g = C0174g.f4635c;
            sb.append(O3.l.o(new C0174g(((String) obj).getBytes(AbstractC0191y.f4712a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0174g) {
            sb.append(": \"");
            sb.append(O3.l.o((C0174g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0189w) {
            sb.append(" {");
            c((AbstractC0189w) obj, sb, i4 + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            a(i4, sb);
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
        int i6 = i4 + 2;
        b(sb, i6, "key", entry.getKey());
        b(sb, i6, "value", entry.getValue());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        a(i4, sb);
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
    public static void c(AbstractC0189w abstractC0189w, StringBuilder sb, int i4) {
        int i5;
        int i6;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0189w.getClass().getDeclaredMethods();
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
                    b(sb, i4, substring.substring(0, substring.length() - 4), AbstractC0189w.e(method2, abstractC0189w, new Object[0]));
                    i5 = i6;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i4, substring.substring(0, substring.length() - 3), AbstractC0189w.e(method, abstractC0189w, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e4 = AbstractC0189w.e(method4, abstractC0189w, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (e4 instanceof Boolean) {
                            equals = !((Boolean) e4).booleanValue();
                        } else if (!(e4 instanceof Integer)) {
                            if (!(e4 instanceof Float)) {
                                if (!(e4 instanceof Double)) {
                                    equals = e4 instanceof String ? e4.equals("") : e4 instanceof C0174g ? e4.equals(C0174g.f4635c) : !(e4 instanceof AbstractC0168a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC0189w.e(method5, abstractC0189w, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i4, substring, e4);
                    }
                }
            }
            i5 = i6;
        }
        d0 d0Var = abstractC0189w.unknownFields;
        if (d0Var != null) {
            for (int i8 = 0; i8 < d0Var.f4627a; i8++) {
                b(sb, i4, String.valueOf(d0Var.f4628b[i8] >>> 3), d0Var.f4629c[i8]);
            }
        }
    }
}
