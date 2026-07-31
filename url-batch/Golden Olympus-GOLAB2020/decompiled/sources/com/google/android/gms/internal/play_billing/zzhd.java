package com.google.android.gms.internal.play_billing;

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
final class zzhd {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzhb zzhbVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzhbVar, sb, 0);
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
            String str2 = (String) obj;
            zzev zzevVar = zzev.zza;
            sb.append(zzhz.zza(str2.isEmpty() ? zzev.zza : new zzet(str2.getBytes(zzga.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzev) {
            sb.append(": \"");
            sb.append(zzhz.zza((zzev) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzfu) {
            sb.append(" {");
            zzd((zzfu) obj, sb, i4 + 2);
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

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018d, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cd, code lost:
    
        if (r13 != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzd(zzhb zzhbVar, StringBuilder sb, int i4) {
        int i5;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzhbVar.getClass().getDeclaredMethods();
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
                zzb(sb, i4, substring.substring(0, substring.length() - 4), zzfu.zzx(method2, zzhbVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i4, substring.substring(0, substring.length() - 3), zzfu.zzx(method, zzhbVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzx = zzfu.zzx(method4, zzhbVar, new Object[0]);
                    if (method5 != null) {
                        booleanValue = ((Boolean) zzfu.zzx(method5, zzhbVar, new Object[0])).booleanValue();
                    } else if (!(zzx instanceof Boolean)) {
                        if (!(zzx instanceof Integer)) {
                            if (!(zzx instanceof Float)) {
                                if (!(zzx instanceof Double)) {
                                    if (zzx instanceof String) {
                                        equals = zzx.equals("");
                                    } else if (zzx instanceof zzev) {
                                        equals = zzx.equals(zzev.zza);
                                    } else {
                                        booleanValue = !(zzx instanceof zzhb) ? true : true;
                                    }
                                }
                            }
                        }
                    }
                    if (booleanValue) {
                        zzb(sb, i4, substring, zzx);
                    }
                }
            }
            i5 = 3;
        }
        if (zzhbVar instanceof zzfr) {
            Iterator zzf = ((zzfr) zzhbVar).zzb.zzf();
            if (zzf.hasNext()) {
                throw null;
            }
        }
        zzic zzicVar = ((zzfu) zzhbVar).zzc;
        if (zzicVar != null) {
            zzicVar.zzi(sb, i4);
        }
    }
}
