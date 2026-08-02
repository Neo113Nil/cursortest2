package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Trace;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lht {
    private static String a;
    private static final Object b = new Object();
    private static bst c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0123 A[Catch: all -> 0x02fe, TRY_ENTER, TryCatch #14 {all -> 0x02fe, blocks: (B:19:0x0029, B:21:0x0038, B:176:0x0043, B:180:0x005d, B:184:0x006d, B:190:0x00c3, B:193:0x00f2, B:195:0x00fa, B:24:0x0123, B:25:0x012f, B:155:0x02c3, B:160:0x02df, B:162:0x02ec, B:174:0x02fd, B:173:0x02fa, B:214:0x0114, B:213:0x0111, B:216:0x00eb, B:221:0x0066, B:231:0x011f, B:230:0x011c, B:27:0x013c, B:28:0x0153, B:30:0x0159, B:32:0x015f, B:33:0x016b, B:35:0x0171, B:37:0x0179, B:40:0x017d, B:42:0x0182, B:44:0x018a, B:47:0x0192, B:50:0x0198, B:52:0x019d, B:53:0x01a4, B:56:0x01b2, B:58:0x01b9, B:61:0x01c8, B:68:0x01d3, B:77:0x01f5, B:91:0x0203, B:98:0x0220, B:99:0x0229, B:86:0x028a, B:105:0x022a, B:107:0x022e, B:108:0x0235, B:109:0x0233, B:110:0x0239, B:112:0x0240, B:113:0x0245, B:114:0x0249, B:116:0x024d, B:117:0x0257, B:119:0x025b, B:121:0x025f, B:122:0x026a, B:124:0x026e, B:126:0x0272, B:127:0x027d, B:130:0x0281, B:151:0x029a, B:152:0x02bb, B:154:0x02bc, B:169:0x02f5), top: B:18:0x0029, outer: #4, inners: #8, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159 A[Catch: all -> 0x02f3, TRY_LEAVE, TryCatch #8 {all -> 0x02f3, blocks: (B:27:0x013c, B:28:0x0153, B:30:0x0159, B:32:0x015f, B:33:0x016b, B:35:0x0171, B:37:0x0179, B:40:0x017d, B:42:0x0182, B:44:0x018a, B:47:0x0192, B:50:0x0198, B:52:0x019d, B:53:0x01a4, B:56:0x01b2, B:58:0x01b9, B:61:0x01c8, B:68:0x01d3, B:77:0x01f5, B:91:0x0203, B:98:0x0220, B:99:0x0229, B:86:0x028a, B:105:0x022a, B:107:0x022e, B:108:0x0235, B:109:0x0233, B:110:0x0239, B:112:0x0240, B:113:0x0245, B:114:0x0249, B:116:0x024d, B:117:0x0257, B:119:0x025b, B:121:0x025f, B:122:0x026a, B:124:0x026e, B:126:0x0272, B:127:0x027d, B:130:0x0281, B:151:0x029a, B:152:0x02bb, B:154:0x02bc), top: B:26:0x013c, outer: #14, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a A[Catch: RuntimeException -> 0x0299, all -> 0x02f3, TRY_LEAVE, TryCatch #13 {RuntimeException -> 0x0299, blocks: (B:32:0x015f, B:33:0x016b, B:35:0x0171, B:37:0x0179, B:40:0x017d, B:42:0x0182, B:44:0x018a, B:47:0x0192, B:50:0x0198, B:52:0x019d, B:53:0x01a4, B:56:0x01b2, B:58:0x01b9, B:61:0x01c8, B:68:0x01d3, B:77:0x01f5, B:91:0x0203, B:98:0x0220, B:99:0x0229, B:86:0x028a, B:105:0x022a, B:107:0x022e, B:108:0x0235, B:109:0x0233, B:110:0x0239, B:112:0x0240, B:113:0x0245, B:114:0x0249, B:116:0x024d, B:117:0x0257, B:119:0x025b, B:121:0x025f, B:122:0x026a, B:124:0x026e, B:126:0x0272, B:127:0x027d, B:130:0x0281), top: B:31:0x015f, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0293 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bst a(Context context, boolean z, boolean z2) {
        ApplicationInfo applicationInfo;
        String str;
        lhs lhsVar;
        lhu lhuVar;
        Throwable th;
        int i;
        Object obj;
        synchronized (b) {
            String str2 = a;
            if (str2 != null && !"151.0.7922.29".equals(str2)) {
                throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
            }
            bst bstVar = c;
            if (bstVar != null) {
                return bstVar;
            }
            a = "151.0.7922.29";
            Throwable th2 = null;
            new cyi("HttpFlagsLoader#getHttpFlags loading flags", 2, null);
            try {
                int i2 = 0;
                try {
                    if (ljb.a(context).getBoolean("android.net.http.ReadHttpFlags", true)) {
                        try {
                            new cyi("HttpFlagsLoader#getProviderApplicationInfo", 2, null);
                            try {
                                ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
                                if (resolveService == null) {
                                    Trace.endSection();
                                    applicationInfo = null;
                                } else {
                                    applicationInfo = resolveService.serviceInfo.applicationInfo;
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (RuntimeException unused) {
                        }
                        if (applicationInfo != null) {
                            jav.b("HttpFlagsLoader", String.format("Found application exporting HTTP flags: %s", applicationInfo.packageName), new Object[0]);
                            str = applicationInfo.deviceProtectedDataDir;
                            File file = new File(new File(new File(str), "app_httpflags"), "flags.binarypb");
                            jav.b("HttpFlagsLoader", String.format("HTTP flags file path: %s", file.getAbsolutePath()), new Object[0]);
                            new cyi("HttpFlagsLoader#loadFlagsFile", 2, null);
                            try {
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(file);
                                    try {
                                        lhsVar = (lhs) lhs.q(lhs.a, fileInputStream);
                                        fileInputStream.close();
                                        Trace.endSection();
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (FileNotFoundException unused2) {
                                String.format("HTTP flags file `%s` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.", file.getPath());
                                Trace.endSection();
                                lhsVar = null;
                            } catch (IOException e) {
                                throw new RuntimeException("Unable to read HTTP flags file", e);
                            }
                            if (lhsVar != null) {
                                if (jav.f("HttpFlagsLoader", 3)) {
                                    jav.b("HttpFlagsLoader", String.format("Successfully loaded HTTP flags: %s", lhsVar), new Object[0]);
                                }
                                if (lhsVar == null) {
                                    lhsVar = (lhs) lhs.a.k().q();
                                }
                                String packageName = context.getPackageName();
                                new cyi("Cronet ResolvedFlags#resolve", 2, null);
                                int[] v = bst.v("151.0.7922.29");
                                HashMap hashMap = new HashMap();
                                for (Map.Entry entry : DesugarCollections.unmodifiableMap(lhsVar.b).entrySet()) {
                                    try {
                                        for (lhp lhpVar : ((lhq) entry.getValue()).b) {
                                            if (z2 || lhpVar.g) {
                                                if ((lhpVar.b & 1) != 0) {
                                                    String str3 = lhpVar.e;
                                                    if (!str3.equals(packageName)) {
                                                        if (str3.endsWith(".") && packageName.startsWith(str3)) {
                                                        }
                                                    }
                                                }
                                                if ((lhpVar.b & 2) != 0) {
                                                    int[] v2 = bst.v(lhpVar.f);
                                                    int i3 = i2;
                                                    while (true) {
                                                        int length = v.length;
                                                        th = th2;
                                                        int length2 = v2.length;
                                                        i = i2;
                                                        if (i3 >= Math.max(length, length2)) {
                                                            break;
                                                        }
                                                        int i4 = i3 < length ? v[i3] : i;
                                                        int i5 = i3 < length2 ? v2[i3] : i;
                                                        if (i4 > i5) {
                                                            break;
                                                        }
                                                        if (i4 < i5) {
                                                            th2 = th;
                                                            i2 = i;
                                                            break;
                                                        }
                                                        i3++;
                                                        th2 = th;
                                                        i2 = i;
                                                    }
                                                } else {
                                                    th = th2;
                                                    i = i2;
                                                }
                                                int i6 = lhpVar.c;
                                                int i7 = i6 != 0 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? i6 != 6 ? i6 != 7 ? i : 5 : 4 : 3 : 2 : 1 : 6;
                                                if (i7 == 0) {
                                                    throw th;
                                                }
                                                int i8 = i7 - 1;
                                                if (i8 == 0) {
                                                    obj = new lhu(i6 == 3 ? ((Boolean) lhpVar.d).booleanValue() : i);
                                                } else if (i8 == 1) {
                                                    obj = new lhu(i6 == 4 ? ((Long) lhpVar.d).longValue() : 0L);
                                                } else if (i8 == 2) {
                                                    obj = new lhu(i6 == 5 ? ((Float) lhpVar.d).floatValue() : 0.0f);
                                                } else if (i8 == 3) {
                                                    obj = new lhu(i6 == 6 ? (String) lhpVar.d : "");
                                                } else if (i8 != 4) {
                                                    if (i8 != 5) {
                                                        throw new IllegalArgumentException("Flag value uses unknown value type ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "VALUE_NOT_SET" : "BYTES_VALUE" : "STRING_VALUE" : "FLOAT_VALUE" : "INT_VALUE" : "BOOL_VALUE"));
                                                    }
                                                    obj = th;
                                                } else {
                                                    obj = new lhu(i6 == 7 ? (jjq) lhpVar.d : jjq.d);
                                                }
                                                if (obj == null) {
                                                    hashMap.put((String) entry.getKey(), obj);
                                                }
                                                th2 = th;
                                                i2 = i;
                                            }
                                        }
                                        th = th2;
                                        i = i2;
                                        obj = th;
                                        if (obj == null) {
                                        }
                                        th2 = th;
                                        i2 = i;
                                    } catch (RuntimeException e2) {
                                        throw new IllegalArgumentException("Unable to resolve HTTP flag `" + ((String) entry.getKey()) + "`", e2);
                                    }
                                }
                                int i9 = i2;
                                bst bstVar2 = new bst(hashMap);
                                Trace.endSection();
                                c = bstVar2;
                                lhuVar = (lhu) bstVar2.u().get("Cronet_log_me");
                                if (lhuVar != null) {
                                    String str4 = z ? "API" : "Impl";
                                    String a2 = lhuVar.a();
                                    Object[] objArr = new Object[2];
                                    objArr[i9] = str4;
                                    objArr[1] = a2;
                                    String.format("HTTP flags log line (%s): %s", objArr);
                                }
                                bst bstVar3 = c;
                                Trace.endSection();
                                return bstVar3;
                            }
                        }
                    } else {
                        jav.b("HttpFlagsLoader", "Not loading HTTP flags because they are disabled in the manifest", new Object[0]);
                    }
                    int[] v3 = bst.v("151.0.7922.29");
                    HashMap hashMap2 = new HashMap();
                    while (r0.hasNext()) {
                    }
                    int i92 = i2;
                    bst bstVar22 = new bst(hashMap2);
                    Trace.endSection();
                    c = bstVar22;
                    lhuVar = (lhu) bstVar22.u().get("Cronet_log_me");
                    if (lhuVar != null) {
                    }
                    bst bstVar32 = c;
                    Trace.endSection();
                    return bstVar32;
                } finally {
                }
                lhsVar = null;
                if (lhsVar == null) {
                }
                String packageName2 = context.getPackageName();
                new cyi("Cronet ResolvedFlags#resolve", 2, null);
            } finally {
            }
        }
    }
}
