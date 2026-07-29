package com.google.android.gms.common.util;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class ProcessUtils {
    private static String zzaai;
    private static int zzaaj;

    public static class SystemGroupsNotAvailableException extends Exception {
        SystemGroupsNotAvailableException(String str) {
            super(str);
        }

        SystemGroupsNotAvailableException(String str, Throwable th) {
            super(str, th);
        }
    }

    private ProcessUtils() {
    }

    @Nullable
    public static String getCallingProcessName() {
        int callingPid = Binder.getCallingPid();
        return callingPid == zzde() ? getMyProcessName() : zzl(callingPid);
    }

    @Nullable
    public static String getMyProcessName() {
        if (zzaai == null) {
            zzaai = zzl(zzde());
        }
        return zzaai;
    }

    public static boolean hasSystemGroups() throws SystemGroupsNotAvailableException {
        BufferedReader zzm;
        BufferedReader bufferedReader = null;
        try {
            try {
                int zzde = zzde();
                StringBuilder sb = new StringBuilder(24);
                sb.append("/proc/");
                sb.append(zzde);
                sb.append("/status");
                zzm = zzm(sb.toString());
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            boolean zzk = zzk(zzm);
            IOUtils.closeQuietly(zzm);
            return zzk;
        } catch (IOException e2) {
            e = e2;
            throw new SystemGroupsNotAvailableException("Unable to access /proc/pid/status.", e);
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = zzm;
            IOUtils.closeQuietly(bufferedReader);
            throw th;
        }
    }

    private static int zzde() {
        if (zzaaj == 0) {
            zzaaj = Process.myPid();
        }
        return zzaaj;
    }

    private static boolean zzk(BufferedReader bufferedReader) throws IOException, SystemGroupsNotAvailableException {
        String trim;
        do {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new SystemGroupsNotAvailableException("Missing Groups entry from proc/pid/status.");
            }
            trim = readLine.trim();
        } while (!trim.startsWith("Groups:"));
        for (String str : trim.substring(7).trim().split("\\s", -1)) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong >= 1000 && parseLong < 2000) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    @Nullable
    private static String zzl(int i) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReader = zzm(sb.toString());
        } catch (IOException unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String trim = bufferedReader.readLine().trim();
            IOUtils.closeQuietly(bufferedReader);
            return trim;
        } catch (IOException unused2) {
            IOUtils.closeQuietly(bufferedReader);
            return null;
        } catch (Throwable th2) {
            bufferedReader2 = bufferedReader;
            th = th2;
            IOUtils.closeQuietly(bufferedReader2);
            throw th;
        }
    }

    private static BufferedReader zzm(String str) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
