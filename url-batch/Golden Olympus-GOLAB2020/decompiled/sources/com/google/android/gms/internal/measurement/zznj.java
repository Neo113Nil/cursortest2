package com.google.android.gms.internal.measurement;

import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.b9;
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
final class zznj {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zznh zznhVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zznhVar, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i4, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (Character.isUpperCase(charAt)) {
                    sb2.append(BundleUtil.UNDERLINE_TAG);
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            zzld zzldVar = zzld.zzb;
            sb.append(zzoc.zza(new zzlb(((String) obj).getBytes(zzmk.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzld) {
            sb.append(": \"");
            sb.append(zzoc.zza((zzld) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzmd) {
            sb.append(" {");
            zzd((zzmd) obj, sb, i4 + 2);
            sb.append("\n");
            zzc(i4, sb);
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
        zzb(sb, i6, b9.h.f15463W, entry.getKey());
        zzb(sb, i6, "value", entry.getValue());
        sb.append("\n");
        zzc(i4, sb);
        sb.append("}");
    }

    private static void zzc(int i4, StringBuilder sb) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb.append(zza, 0, i5);
            i4 -= i5;
        }
    }

    private static void zzd(zznh zznhVar, StringBuilder sb, int i4) {
        int i5;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zznhVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i6 = 0;
        while (true) {
            i5 = 3;
            if (i6 >= length) {
                break;
            }
            Method method3 = declaredMethods[i6];
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
            i6++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i5);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i4, substring.substring(0, substring.length() - 4), zzmd.zzcp(method2, zznhVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i4, substring.substring(0, substring.length() - 3), zzmd.zzcp(method, zznhVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzcp = zzmd.zzcp(method4, zznhVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzmd.zzcp(method5, zznhVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i4, substring, zzcp);
                    } else if (zzcp instanceof Boolean) {
                        if (!((Boolean) zzcp).booleanValue()) {
                        }
                        zzb(sb, i4, substring, zzcp);
                    } else if (zzcp instanceof Integer) {
                        if (((Integer) zzcp).intValue() == 0) {
                        }
                        zzb(sb, i4, substring, zzcp);
                    } else if (zzcp instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzcp).floatValue()) == 0) {
                        }
                        zzb(sb, i4, substring, zzcp);
                    } else if (zzcp instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzcp).doubleValue()) == 0) {
                        }
                        zzb(sb, i4, substring, zzcp);
                    } else {
                        if (zzcp instanceof String) {
                            equals = zzcp.equals("");
                        } else if (zzcp instanceof zzld) {
                            equals = zzcp.equals(zzld.zzb);
                        } else if (zzcp instanceof zznh) {
                            if (zzcp == ((zznh) zzcp).zzcC()) {
                            }
                            zzb(sb, i4, substring, zzcp);
                        } else {
                            if ((zzcp instanceof Enum) && ((Enum) zzcp).ordinal() == 0) {
                            }
                            zzb(sb, i4, substring, zzcp);
                        }
                        if (equals) {
                        }
                        zzb(sb, i4, substring, zzcp);
                    }
                }
            }
            i5 = 3;
        }
        if (zznhVar instanceof zzma) {
            Iterator zze = ((zzma) zznhVar).zzb.zze();
            if (zze.hasNext()) {
                throw null;
            }
        }
        zzof zzofVar = ((zzmd) zznhVar).zzc;
        if (zzofVar != null) {
            zzofVar.zzi(sb, i4);
        }
    }
}
