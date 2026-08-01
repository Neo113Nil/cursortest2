package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final z6.d f2349a;

    /* renamed from: b, reason: collision with root package name */
    public static final z6.d f2350b;

    /* renamed from: c, reason: collision with root package name */
    public static final z6.d f2351c;

    /* renamed from: d, reason: collision with root package name */
    public static final z6.d[] f2352d;

    static {
        z6.d dVar = new z6.d("commit_to_configuration_v2_api", -1, 1L, true);
        f2349a = dVar;
        z6.d dVar2 = new z6.d("get_serving_version_api", -1, 1L, true);
        z6.d dVar3 = new z6.d("get_experiment_tokens_api", -1, 1L, true);
        z6.d dVar4 = new z6.d("register_flag_update_listener_api", -1, 2L, true);
        f2350b = dVar4;
        z6.d dVar5 = new z6.d("sync_after_api", -1, 1L, true);
        z6.d dVar6 = new z6.d("sync_after_for_application_api", -1, 1L, true);
        z6.d dVar7 = new z6.d("set_app_wide_properties_api", -1, 1L, true);
        z6.d dVar8 = new z6.d("set_runtime_properties_api", -1, 1L, true);
        z6.d dVar9 = new z6.d("get_storage_info_api", -1, 1L, true);
        f2351c = dVar9;
        f2352d = new z6.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9};
    }

    public static IOException a(zd zdVar, Uri uri, IOException iOException, String str) {
        try {
            me meVar = new me();
            meVar.f2541d = true;
            File file = (File) zdVar.a(uri, meVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canRead() ? file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : file.canWrite() ? e(file, iOException, str) : e(file, iOException, str) : e(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static String b(String str) {
        if (str.length() > 23) {
            int i3 = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i3 = length;
                    break;
                }
            }
            str = str.substring(i3 + 1);
        }
        String concat = "".concat(str);
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static int c(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static f5 d(n1 n1Var, e7 e7Var, ArrayList arrayList, boolean z10) {
        f5 f5Var;
        ia.f("reduce", arrayList, 1);
        ia.h("reduce", 2, arrayList);
        f5 e2 = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(0));
        if (!(e2 instanceof e4)) {
            te.a1.e("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            f5Var = ((l5) e7Var.f2260i).e(e7Var, (f5) arrayList.get(1));
            if (f5Var instanceof t2) {
                te.a1.e("Failed to parse initial value");
                return null;
            }
        } else {
            if (n1Var.q() == 0) {
                kotlin.collections.i0.l("Empty array with no initial value error");
                return null;
            }
            f5Var = null;
        }
        e4 e4Var = (e4) e2;
        int q3 = n1Var.q();
        int i3 = z10 ? 0 : q3 - 1;
        int i10 = z10 ? q3 - 1 : 0;
        int i11 = true == z10 ? 1 : -1;
        if (f5Var == null) {
            f5Var = n1Var.r(i3);
            i3 += i11;
        }
        while ((i10 - i3) * i11 >= 0) {
            if (n1Var.t(i3)) {
                f5Var = e4Var.a(e7Var, Arrays.asList(f5Var, n1Var.r(i3), new l3(Double.valueOf(i3)), n1Var));
                if (f5Var instanceof t2) {
                    kotlin.collections.i0.l("Reduce operation failed");
                    return null;
                }
                i3 += i11;
            } else {
                i3 += i11;
            }
        }
        return f5Var;
    }

    public static IOException e(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? g(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : parentFile.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : g(file, iOException, str);
    }

    public static n1 f(n1 n1Var, e7 e7Var, e5 e5Var, Boolean bool, Boolean bool2) {
        n1 n1Var2 = new n1();
        Iterator p4 = n1Var.p();
        while (p4.hasNext()) {
            int intValue = ((Integer) p4.next()).intValue();
            if (n1Var.t(intValue)) {
                f5 a9 = e5Var.a(e7Var, Arrays.asList(n1Var.r(intValue), new l3(Double.valueOf(intValue)), n1Var));
                if (a9.b().equals(bool)) {
                    break;
                }
                if (bool2 == null || a9.b().equals(bool2)) {
                    n1Var2.s(intValue, a9);
                }
            }
        }
        return n1Var2;
    }

    public static IOException g(File file, IOException iOException, String str) {
        String concat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb2 = new StringBuilder(str2.length() + 16);
            sb2.append("Inoperable file:");
            sb2.append(str2);
            concat = sb2.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb3 = new StringBuilder(concat.length() + str3.length());
                sb3.append(concat);
                sb3.append(str3);
                concat = sb3.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    public static final void h(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        ha haVar = new ha(1, exc, level, str, objArr);
        int i3 = cg.f2205a;
        executor.execute(new cf(new wd.b0(), mf.a(), haVar, 1));
    }
}
