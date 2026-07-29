package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.c;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class a implements NativeExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8688a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.crash.b f8689b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.info.a f8690c;

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.strategy.a f8691d;

    public a(Context context, com.tencent.bugly.crashreport.common.info.a aVar, com.tencent.bugly.crashreport.crash.b bVar, com.tencent.bugly.crashreport.common.strategy.a aVar2) {
        this.f8688a = context;
        this.f8689b = bVar;
        this.f8690c = aVar;
        this.f8691d = aVar2;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, byte[] bArr, Map<String, String> map, boolean z) {
        int length;
        String str11;
        int indexOf;
        boolean l = c.a().l();
        if (l) {
            x.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f8620b = 1;
        crashDetailBean.e = this.f8690c.h();
        crashDetailBean.f = this.f8690c.j;
        crashDetailBean.g = this.f8690c.w();
        crashDetailBean.m = this.f8690c.g();
        crashDetailBean.n = str3;
        crashDetailBean.o = l ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.p = str4;
        crashDetailBean.q = str5 == null ? "" : str5;
        crashDetailBean.r = j;
        crashDetailBean.u = z.b(crashDetailBean.q.getBytes());
        crashDetailBean.z = str;
        crashDetailBean.A = str2;
        crashDetailBean.H = this.f8690c.y();
        crashDetailBean.h = this.f8690c.v();
        crashDetailBean.i = this.f8690c.I();
        crashDetailBean.v = str8;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        String dumpFilePath = nativeCrashHandler != null ? nativeCrashHandler.getDumpFilePath() : null;
        String a2 = b.a(dumpFilePath, str8);
        if (!z.a(a2)) {
            crashDetailBean.T = a2;
        }
        crashDetailBean.U = b.b(dumpFilePath);
        crashDetailBean.w = b.a(str9, c.e, (String) null);
        crashDetailBean.I = str7;
        crashDetailBean.J = str6;
        crashDetailBean.K = str10;
        crashDetailBean.E = this.f8690c.p();
        crashDetailBean.F = this.f8690c.o();
        crashDetailBean.G = this.f8690c.q();
        if (z) {
            crashDetailBean.B = com.tencent.bugly.crashreport.common.info.b.g();
            crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.e();
            crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.i();
            if (crashDetailBean.w == null) {
                crashDetailBean.w = z.a(this.f8688a, c.e, (String) null);
            }
            crashDetailBean.x = y.a();
            crashDetailBean.L = this.f8690c.f8598a;
            crashDetailBean.M = this.f8690c.a();
            crashDetailBean.O = this.f8690c.F();
            crashDetailBean.P = this.f8690c.G();
            crashDetailBean.Q = this.f8690c.z();
            crashDetailBean.R = this.f8690c.E();
            crashDetailBean.y = z.a(c.f, false);
            int indexOf2 = crashDetailBean.q.indexOf("java:\n");
            if (indexOf2 > 0 && (length = indexOf2 + "java:\n".length()) < crashDetailBean.q.length()) {
                String substring = crashDetailBean.q.substring(length, crashDetailBean.q.length() - 1);
                if (substring.length() > 0 && crashDetailBean.y.containsKey(crashDetailBean.A) && (indexOf = (str11 = crashDetailBean.y.get(crashDetailBean.A)).indexOf(substring)) > 0) {
                    String substring2 = str11.substring(indexOf);
                    crashDetailBean.y.put(crashDetailBean.A, substring2);
                    crashDetailBean.q = crashDetailBean.q.substring(0, length);
                    crashDetailBean.q += substring2;
                }
            }
            if (str == null) {
                crashDetailBean.z = this.f8690c.f8601d;
            }
            this.f8689b.c(crashDetailBean);
        } else {
            crashDetailBean.B = -1L;
            crashDetailBean.C = -1L;
            crashDetailBean.D = -1L;
            if (crashDetailBean.w == null) {
                crashDetailBean.w = "this crash is occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.L = -1L;
            crashDetailBean.O = -1;
            crashDetailBean.P = -1;
            crashDetailBean.Q = map;
            crashDetailBean.R = this.f8690c.E();
            crashDetailBean.y = null;
            if (str == null) {
                crashDetailBean.z = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.x = bArr;
            }
        }
        return crashDetailBean;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, int i3, String str5, int i4, int i5, int i6, String str6, String str7) {
        x.a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i, i2, j, j2, str, str2, str3, str4, i3, str5, i4, i5, i6, str6, str7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017b A[Catch: Throwable -> 0x027a, TryCatch #0 {Throwable -> 0x027a, blocks: (B:3:0x0012, B:5:0x001a, B:6:0x0022, B:8:0x002a, B:13:0x0035, B:15:0x003d, B:16:0x0094, B:18:0x009c, B:19:0x00a3, B:21:0x00ad, B:23:0x00b5, B:26:0x00fa, B:28:0x0101, B:30:0x0105, B:32:0x0111, B:34:0x0124, B:35:0x011a, B:38:0x012e, B:40:0x0138, B:43:0x013f, B:44:0x014e, B:46:0x0158, B:49:0x015f, B:50:0x0175, B:52:0x017b, B:55:0x018b, B:56:0x01cf, B:86:0x01a9, B:87:0x014a, B:88:0x0127, B:91:0x0066, B:92:0x006c, B:94:0x0076), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204 A[Catch: Throwable -> 0x0276, TryCatch #2 {Throwable -> 0x0276, blocks: (B:59:0x01fe, B:61:0x0204, B:63:0x020d), top: B:58:0x01fe }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020d A[Catch: Throwable -> 0x0276, TRY_LEAVE, TryCatch #2 {Throwable -> 0x0276, blocks: (B:59:0x01fe, B:61:0x0204, B:63:0x020d), top: B:58:0x01fe }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf A[EDGE_INSN: B:85:0x01cf->B:56:0x01cf BREAK  A[LOOP:2: B:50:0x0175->B:84:?], SYNTHETIC] */
    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleNativeException2(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, int i3, String str5, int i4, int i5, int i6, String str6, String str7, String[] strArr) {
        String str8;
        String str9;
        String str10;
        String str11;
        CrashDetailBean packageCrashDatas;
        boolean z;
        Iterator<Thread> it;
        x.a("Native Crash Happen v2", new Object[0]);
        try {
            if (!this.f8691d.b()) {
                x.e("waiting for remote sync", new Object[0]);
                int i7 = 0;
                while (!this.f8691d.b()) {
                    z.b(500L);
                    i7 += TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
                    if (i7 >= 3000) {
                        break;
                    }
                }
            }
            String a2 = b.a(str3);
            String str12 = "UNKNOWN";
            if (i3 > 0) {
                str9 = str + "(" + str5 + ")";
                str8 = "UNKNOWN";
                str10 = "KERNEL";
            } else {
                if (i4 > 0) {
                    Context context = this.f8688a;
                    str12 = AppInfo.a(i4);
                }
                str8 = str12.equals(String.valueOf(i4)) ? str12 : str12 + "(" + i4 + ")";
                str9 = str;
                str10 = str5;
            }
            if (!this.f8691d.b()) {
                x.d("no remote but still store!", new Object[0]);
            }
            if (!this.f8691d.c().g && this.f8691d.b()) {
                x.e("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                com.tencent.bugly.crashreport.crash.b.a("NATIVE_CRASH", z.a(), this.f8690c.f8601d, Thread.currentThread(), str9 + "\n" + str2 + "\n" + a2, null);
                z.b(str4);
                return;
            }
            HashMap hashMap = new HashMap();
            if (strArr != null) {
                for (String str13 : strArr) {
                    String[] split = str13.split("=");
                    if (split.length == 2) {
                        hashMap.put(split[0], split[1]);
                    } else {
                        x.d("bad extraMsg %s", str13);
                    }
                }
            } else {
                x.c("not found extraMsg", new Object[0]);
            }
            String str14 = (String) hashMap.get("ExceptionProcessName");
            try {
                if (str14 != null && str14.length() != 0) {
                    x.c("crash process name change to %s", str14);
                    str11 = (String) hashMap.get("ExceptionThreadName");
                    if (str11 != null && str11.length() != 0) {
                        x.c("crash thread name change to %s", str11);
                        it = Thread.getAllStackTraces().keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                break;
                            }
                            Thread next = it.next();
                            if (next.getName().equals(str11)) {
                                str11 = str11 + "(" + next.getId() + ")";
                                break;
                            }
                        }
                        String str15 = str9;
                        packageCrashDatas = packageCrashDatas(str14, str11, (j2 / 1000) + (j * 1000), str9, str2, a2, str10, str8, str4, (String) hashMap.get("SysLogPath"), str7, null, null, true);
                        if (packageCrashDatas != null) {
                            x.e("pkg crash datas fail!", new Object[0]);
                            return;
                        }
                        try {
                            com.tencent.bugly.crashreport.crash.b.a("NATIVE_CRASH", z.a(), this.f8690c.f8601d, Thread.currentThread(), str15 + "\n" + str2 + "\n" + a2, packageCrashDatas);
                            if (this.f8689b.a(packageCrashDatas, i3)) {
                                z = true;
                            } else {
                                z = true;
                                this.f8689b.a(packageCrashDatas, 3000L, true);
                            }
                            this.f8689b.b(packageCrashDatas);
                            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
                            b.a(z, nativeCrashHandler != null ? nativeCrashHandler.getDumpFilePath() : null);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (x.a(th)) {
                                return;
                            }
                            th.printStackTrace();
                            return;
                        }
                    }
                    Thread currentThread = Thread.currentThread();
                    str11 = currentThread.getName() + "(" + currentThread.getId() + ")";
                    String str152 = str9;
                    packageCrashDatas = packageCrashDatas(str14, str11, (j2 / 1000) + (j * 1000), str9, str2, a2, str10, str8, str4, (String) hashMap.get("SysLogPath"), str7, null, null, true);
                    if (packageCrashDatas != null) {
                    }
                }
                if (str11 != null) {
                    x.c("crash thread name change to %s", str11);
                    it = Thread.getAllStackTraces().keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    String str1522 = str9;
                    packageCrashDatas = packageCrashDatas(str14, str11, (j2 / 1000) + (j * 1000), str9, str2, a2, str10, str8, str4, (String) hashMap.get("SysLogPath"), str7, null, null, true);
                    if (packageCrashDatas != null) {
                    }
                }
                packageCrashDatas = packageCrashDatas(str14, str11, (j2 / 1000) + (j * 1000), str9, str2, a2, str10, str8, str4, (String) hashMap.get("SysLogPath"), str7, null, null, true);
                if (packageCrashDatas != null) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
            str14 = this.f8690c.f8601d;
            str11 = (String) hashMap.get("ExceptionThreadName");
            Thread currentThread2 = Thread.currentThread();
            str11 = currentThread2.getName() + "(" + currentThread2.getId() + ")";
            String str15222 = str9;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
