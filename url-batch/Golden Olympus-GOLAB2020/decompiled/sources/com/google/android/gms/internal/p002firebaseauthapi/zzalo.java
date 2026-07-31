package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
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
final class zzalo {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzaln zzalnVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzalnVar, sb, 0);
        return sb.toString();
    }

    private static void zza(int i4, StringBuilder sb) {
        while (i4 > 0) {
            char[] cArr = zza;
            int length = i4 > cArr.length ? cArr.length : i4;
            sb.append(cArr, 0, length);
            i4 -= length;
        }
    }

    static void zza(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i4, sb);
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
            sb.append(zzamo.zza(zzaiw.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzaiw) {
            sb.append(": \"");
            sb.append(zzamo.zza((zzaiw) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzakg) {
            sb.append(" {");
            zza((zzakg) obj, sb, i4 + 2);
            sb.append("\n");
            zza(i4, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i6 = i4 + 2;
            zza(sb, i6, b9.h.f15463W, entry.getKey());
            zza(sb, i6, "value", entry.getValue());
            sb.append("\n");
            zza(i4, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0196, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a9, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bb, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d1, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzaln zzalnVar, StringBuilder sb, int i4) {
        int i5;
        int i6;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzalnVar.getClass().getDeclaredMethods();
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
                    zza(sb, i4, substring.substring(0, substring.length() - 4), zzakg.zza(method2, zzalnVar, new Object[0]));
                    i5 = i6;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zza(sb, i4, substring.substring(0, substring.length() - 3), zzakg.zza(method, zzalnVar, new Object[0]));
            } else {
                if (hashSet.contains("set" + substring)) {
                    if (substring.endsWith("Bytes")) {
                        if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object zza2 = zzakg.zza(method4, zzalnVar, new Object[0]);
                        if (method5 == null) {
                            booleanValue = true;
                            if (!(zza2 instanceof Boolean)) {
                                if (!(zza2 instanceof Integer)) {
                                    if (!(zza2 instanceof Float)) {
                                        if (!(zza2 instanceof Double)) {
                                            if (zza2 instanceof String) {
                                                equals = zza2.equals("");
                                            } else if (zza2 instanceof zzaiw) {
                                                equals = zza2.equals(zzaiw.zza);
                                            } else {
                                                equals = !(zza2 instanceof zzaln) ? false : false;
                                            }
                                        }
                                    }
                                }
                            }
                            if (equals) {
                                booleanValue = false;
                            }
                        } else {
                            booleanValue = ((Boolean) zzakg.zza(method5, zzalnVar, new Object[0])).booleanValue();
                        }
                        if (booleanValue) {
                            zza(sb, i4, substring, zza2);
                        }
                    }
                }
            }
            i5 = i6;
        }
        if (zzalnVar instanceof zzakg.zzd) {
            Iterator<Map.Entry<zzakg.zzc, Object>> zzd = ((zzakg.zzd) zzalnVar).zzc.zzd();
            if (zzd.hasNext()) {
                zzd.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        zzamy zzamyVar = ((zzakg) zzalnVar).zzb;
        if (zzamyVar != null) {
            zzamyVar.zza(sb, i4);
        }
    }
}
