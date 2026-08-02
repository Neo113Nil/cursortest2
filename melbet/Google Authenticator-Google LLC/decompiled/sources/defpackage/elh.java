package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.os.Trace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class elh {
    public static volatile ActivityManager a;
    static volatile boolean b;
    private static volatile String c;

    private elh() {
    }

    public static eli a(Context context, String str) {
        eli eliVar;
        try {
            Trace.beginSection(str);
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                int i = hel.d;
                eliVar = new eli(false, his.a);
            } else {
                eliVar = new eli(true, hel.o(runningAppProcesses));
            }
            return eliVar;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r2 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b() {
        BufferedReader bufferedReader;
        if (c == null) {
            int myPid = Process.myPid();
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (myPid > 0) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(a.ai(myPid, "/proc/", "/cmdline")));
                    try {
                        String readLine = bufferedReader.readLine();
                        readLine.getClass();
                        str = readLine.trim();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    bufferedReader.close();
                } catch (IOException unused4) {
                }
            }
            if (str != null) {
                c = str;
            }
        }
        return c;
    }

    public static String c(String str, String str2) {
        if (str2 == null || str == null || !str2.startsWith(str)) {
            return str2;
        }
        int length = str.length();
        if (str2.length() == length) {
            return null;
        }
        return str2.substring(length + 1);
    }

    public static boolean d(Context context, eli eliVar) {
        if (!eliVar.a) {
            return false;
        }
        hel<ActivityManager.RunningAppProcessInfo> a2 = eliVar.a();
        String packageName = context.getPackageName();
        String valueOf = String.valueOf(packageName);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a2) {
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(valueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
