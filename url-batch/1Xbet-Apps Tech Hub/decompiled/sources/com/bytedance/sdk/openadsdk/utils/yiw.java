package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: CpuUtils.java */
/* loaded from: classes2.dex */
public class yiw {
    public static int pvs() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    /* compiled from: CpuUtils.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.yiw$1, reason: invalid class name */
    static class AnonymousClass1 implements FilenameFilter {
        private final Pattern pvs = Pattern.compile("^cpu[0-9]+$");

        AnonymousClass1() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.pvs.matcher(str).matches();
        }
    }

    public static int pvs(Context context) {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("cpu_count", 0);
    }

    public static int icD(Context context) {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("cpu_max_frequency", 0);
    }

    public static int vG(Context context) {
        return com.bytedance.sdk.openadsdk.core.vG.pvs(context).icD("cpu_min_frequency", 0);
    }

    public static int pvs(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int parseInt;
        int i2 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String readLine = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(readLine) && (parseInt = Integer.parseInt(readLine)) > i2) {
                            i2 = parseInt;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.Ju.pvs("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            }
                            bufferedReader2 = bufferedReader;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th3;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader2;
                th = th4;
            }
        }
    }

    public static int icD(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        int parseInt;
        int i2 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String readLine = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(readLine) && ((parseInt = Integer.parseInt(readLine)) < i2 || i2 == 0)) {
                            i2 = parseInt;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.Ju.pvs("CpuUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            }
                            bufferedReader2 = bufferedReader;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th = th3;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader2;
                th = th4;
            }
        }
    }
}
