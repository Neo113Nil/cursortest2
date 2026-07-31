package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class mr3 {
    static String a(kr3 kr3Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(kr3Var, sb, 0);
        return sb.toString();
    }

    static final void b(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(us3.a(uo3.L((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof uo3) {
            sb.append(": \"");
            sb.append(us3.a((uo3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof aq3) {
            sb.append(" {");
            d((aq3) obj, sb, i7 + 2);
            sb.append("\n");
            while (i8 < i7) {
                sb.append(' ');
                i8++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i10 = i7 + 2;
        b(sb, i10, "key", entry.getKey());
        b(sb, i10, "value", entry.getValue());
        sb.append("\n");
        while (i8 < i7) {
            sb.append(' ');
            i8++;
        }
        sb.append("}");
    }

    private static final String c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void d(kr3 kr3Var, StringBuilder sb, int i7) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : kr3Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i7, c(concat), aq3.t(method2, kr3Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i7, c(concat2), aq3.t(method3, kr3Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object t6 = aq3.t(method4, kr3Var, new Object[0]);
                    if (method5 == null) {
                        if (t6 instanceof Boolean) {
                            if (((Boolean) t6).booleanValue()) {
                                b(sb, i7, c(concat3), t6);
                            }
                        } else if (t6 instanceof Integer) {
                            if (((Integer) t6).intValue() != 0) {
                                b(sb, i7, c(concat3), t6);
                            }
                        } else if (t6 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) t6).floatValue()) != 0) {
                                b(sb, i7, c(concat3), t6);
                            }
                        } else if (!(t6 instanceof Double)) {
                            if (t6 instanceof String) {
                                obj = "";
                            } else if (t6 instanceof uo3) {
                                obj = uo3.f12885g;
                            } else if (!(t6 instanceof kr3)) {
                                if ((t6 instanceof Enum) && ((Enum) t6).ordinal() == 0) {
                                }
                                b(sb, i7, c(concat3), t6);
                            } else if (t6 != ((kr3) t6).a()) {
                                b(sb, i7, c(concat3), t6);
                            }
                            if (!t6.equals(obj)) {
                                b(sb, i7, c(concat3), t6);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) t6).doubleValue()) != 0) {
                            b(sb, i7, c(concat3), t6);
                        }
                    } else if (((Boolean) aq3.t(method5, kr3Var, new Object[0])).booleanValue()) {
                        b(sb, i7, c(concat3), t6);
                    }
                }
            }
        }
        if (kr3Var instanceof yp3) {
            throw null;
        }
        xs3 xs3Var = ((aq3) kr3Var).zzc;
        if (xs3Var != null) {
            xs3Var.g(sb, i7);
        }
    }
}
