package com.baidu.platform.comapi.walknavi.g.i.k;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import com.baidu.ar.util.SystemInfoUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class h {

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static long a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r1 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long b(Context context) {
        FileReader fileReader;
        long j8;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                try {
                    String readLine = bufferedReader2.readLine();
                    String[] split = readLine.split("\\s+");
                    for (String str : split) {
                        com.baidu.platform.comapi.walknavi.g.i.k.a.a(readLine + ", " + str + "\t");
                    }
                    j8 = Integer.parseInt(split[1]);
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                } catch (Exception unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    j8 = 0;
                } catch (Throwable th) {
                    bufferedReader = bufferedReader2;
                    th = th;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (fileReader == null) {
                        throw th;
                    }
                    try {
                        fileReader.close();
                        throw th;
                    } catch (IOException unused5) {
                        throw th;
                    }
                }
            } catch (Exception unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused7) {
            fileReader = null;
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (IOException unused8) {
        }
        return j8 / 1024;
    }

    public static String c() {
        String str;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            String str2 = "";
            while (inputStream.read(bArr) != -1) {
                str2 = str2 + new String(bArr);
            }
            inputStream.close();
            str = String.valueOf(Integer.parseInt(str2.trim()) / 1000);
        } catch (Exception unused) {
            str = SystemInfoUtil.NA;
        }
        return String.valueOf(str);
    }

    public static String d() {
        String str;
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            String str2 = "";
            while (inputStream.read(bArr) != -1) {
                str2 = str2 + new String(bArr);
            }
            inputStream.close();
            str = String.valueOf(Integer.parseInt(str2.trim()) / 1000);
        } catch (Exception unused) {
            str = SystemInfoUtil.NA;
        }
        return str.trim();
    }

    public static int e() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception unused) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("CPU Count: Failed.");
            return 1;
        }
    }

    public static long[] f() {
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        return new long[]{(r2.getBlockCount() * blockSize) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, (blockSize * r2.getAvailableBlocks()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED};
    }

    public static long[] g() {
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long blockCount = statFs.getBlockCount();
            long availableBlocks = statFs.getAvailableBlocks();
            jArr[0] = (blockCount * blockSize) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            jArr[1] = (blockSize * availableBlocks) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        return jArr;
    }

    public static String a() {
        Throwable th;
        FileReader fileReader;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Exception unused) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                String[] split = bufferedReader.readLine().split(":\\s+", 2);
                for (int i8 = 0; i8 < split.length; i8++) {
                }
                String str = split[1];
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                try {
                    fileReader.close();
                } catch (IOException unused3) {
                }
                return str;
            } catch (Exception unused4) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused5) {
                    }
                }
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused6) {
                    }
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused7) {
                    }
                }
                if (fileReader != null) {
                    try {
                        fileReader.close();
                        throw th;
                    } catch (IOException unused8) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception unused9) {
            fileReader = null;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r2 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String str = SystemInfoUtil.NA;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq");
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                str = String.valueOf(Integer.parseInt(bufferedReader.readLine().trim().trim()) / 1000);
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
            } catch (Exception unused3) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused5) {
                    }
                }
                if (fileReader != null) {
                    try {
                        fileReader.close();
                        throw th;
                    } catch (IOException unused6) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception unused7) {
            fileReader = null;
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (IOException unused8) {
        }
        return str;
    }
}
