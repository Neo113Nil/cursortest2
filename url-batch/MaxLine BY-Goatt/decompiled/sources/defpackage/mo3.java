package defpackage;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class mo3 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
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
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
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
            im3 im3Var = im3.o;
            sb.append(yh2.s(new im3(((String) obj).getBytes(sn3.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof im3) {
            sb.append(": \"");
            sb.append(yh2.s((im3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof in3) {
            sb.append(" {");
            b((in3) obj, sb, i + 2);
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
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i3, SDKConstants.PARAM_KEY, entry.getKey());
        a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    public static void b(in3 in3Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = in3Var.getClass().getDeclaredMethods();
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
                    a(sb, i, substring.substring(0, substring.length() - 4), in3.n(method2, in3Var, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), in3.n(method, in3Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object n = in3.n(method4, in3Var, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) in3.n(method5, in3Var, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, n);
                    } else if (n instanceof Boolean) {
                        if (!((Boolean) n).booleanValue()) {
                        }
                        a(sb, i, substring, n);
                    } else if (n instanceof Integer) {
                        if (((Integer) n).intValue() == 0) {
                        }
                        a(sb, i, substring, n);
                    } else if (n instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) n).floatValue()) == 0) {
                        }
                        a(sb, i, substring, n);
                    } else if (n instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) n).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, n);
                    } else {
                        if (n instanceof String) {
                            equals = n.equals(BuildConfig.FLAVOR);
                        } else if (n instanceof im3) {
                            equals = n.equals(im3.o);
                        } else if (n instanceof zl3) {
                            if (n == ((in3) ((in3) ((zl3) n)).o(6))) {
                            }
                            a(sb, i, substring, n);
                        } else {
                            if ((n instanceof Enum) && ((Enum) n).ordinal() == 0) {
                            }
                            a(sb, i, substring, n);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, n);
                    }
                }
            }
            i2 = i3;
        }
        jp3 jp3Var = in3Var.zzc;
        if (jp3Var != null) {
            for (int i5 = 0; i5 < jp3Var.a; i5++) {
                a(sb, i, String.valueOf(jp3Var.b[i5] >>> 3), jp3Var.c[i5]);
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }
}
