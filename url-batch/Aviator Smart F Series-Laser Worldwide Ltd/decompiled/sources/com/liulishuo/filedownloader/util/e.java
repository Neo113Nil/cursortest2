package com.liulishuo.filedownloader.util;

import com.google.android.exoplayer2.ExoPlayer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes4.dex */
public class e {
    private static final String FALSE_STRING = "false";
    private static final String KEY_BROADCAST_COMPLETED = "broadcast.completed";
    private static final String KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT = "download.max-network-thread-count";
    private static final String KEY_DOWNLOAD_MIN_PROGRESS_STEP = "download.min-progress-step";
    private static final String KEY_DOWNLOAD_MIN_PROGRESS_TIME = "download.min-progress-time";
    private static final String KEY_FILE_NON_PRE_ALLOCATION = "file.non-pre-allocation";
    private static final String KEY_HTTP_LENIENT = "http.lenient";
    private static final String KEY_PROCESS_NON_SEPARATE = "process.non-separate";
    private static final String KEY_TRIAL_CONNECTION_HEAD_METHOD = "download.trial-connection-head-method";
    private static final String TRUE_STRING = "true";
    public final boolean broadcastCompleted;
    public final int downloadMaxNetworkThreadCount;
    public final int downloadMinProgressStep;
    public final long downloadMinProgressTime;
    public final boolean fileNonPreAllocation;
    public final boolean httpLenient;
    public final boolean processNonSeparate;
    public final boolean trialConnectionHeadMethod;

    public static class b {
        private static final e INSTANCE = new e();
    }

    public static e getImpl() {
        return b.INSTANCE;
    }

    public static int getValidNetworkThreadCount(int i8) {
        if (i8 > 12) {
            d.w(e.class, "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto", Integer.valueOf(i8), 12, 12);
            return 12;
        }
        if (i8 >= 1) {
            return i8;
        }
        d.w(e.class, "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto", Integer.valueOf(i8), 1, 1);
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b2 A[Catch: all -> 0x005e, TryCatch #12 {all -> 0x005e, blocks: (B:79:0x0036, B:81:0x003d, B:84:0x0041, B:87:0x0045, B:90:0x0049, B:93:0x004d, B:96:0x0051, B:99:0x0055, B:103:0x00ae, B:105:0x00b2, B:107:0x00b6, B:116:0x00c4), top: B:78:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c4 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #12 {all -> 0x005e, blocks: (B:79:0x0036, B:81:0x003d, B:84:0x0041, B:87:0x0045, B:90:0x0049, B:93:0x004d, B:96:0x0051, B:99:0x0055, B:103:0x00ae, B:105:0x00b2, B:107:0x00b6, B:116:0x00c4), top: B:78:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private e() {
        Throwable th;
        InputStream inputStream;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Object obj;
        String str9;
        String str10;
        String str11;
        String str12;
        Object obj2;
        Object obj3;
        ?? r10;
        Object obj4;
        long j8;
        int i8;
        ?? r9;
        String str13;
        String property;
        if (c.getAppContext() == null) {
            throw new IllegalStateException("Please invoke the 'FileDownloader#setup' before using FileDownloader. If you want to register some components on FileDownloader please invoke the 'FileDownloader#setupOnApplicationOnCreate' on the 'Application#onCreate' first.");
        }
        long currentTimeMillis = System.currentTimeMillis();
        Properties properties = new Properties();
        try {
            inputStream = c.getAppContext().getAssets().open("filedownloader.properties");
            if (inputStream != null) {
                try {
                    try {
                        properties.load(inputStream);
                        str = properties.getProperty(KEY_HTTP_LENIENT);
                        try {
                            str2 = properties.getProperty(KEY_PROCESS_NON_SEPARATE);
                        } catch (IOException e8) {
                            e = e8;
                            str2 = null;
                            str3 = null;
                            str4 = null;
                            str5 = null;
                            str6 = null;
                            str7 = null;
                            if (e instanceof FileNotFoundException) {
                                str8 = str;
                                e.printStackTrace();
                            } else if (d.NEED_LOG) {
                                str8 = str;
                                d.d(e.class, "not found filedownloader.properties", new Object[0]);
                            } else {
                                str8 = str;
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                }
                            }
                            obj = e.class;
                            str9 = str2;
                            str10 = str6;
                            str11 = str7;
                            str = str8;
                            str12 = null;
                            obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
                            if (str == null) {
                            }
                            if (str9 == null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str5 != null) {
                            }
                            if (str10 == null) {
                            }
                            if (str11 == null) {
                            }
                            if (str12 == null) {
                            }
                            if (d.NEED_LOG) {
                            }
                        }
                        try {
                            str3 = properties.getProperty(KEY_DOWNLOAD_MIN_PROGRESS_STEP);
                        } catch (IOException e10) {
                            e = e10;
                            str3 = null;
                            str4 = null;
                            str5 = null;
                            str6 = null;
                            str7 = null;
                            if (e instanceof FileNotFoundException) {
                            }
                            if (inputStream != null) {
                            }
                            obj = e.class;
                            str9 = str2;
                            str10 = str6;
                            str11 = str7;
                            str = str8;
                            str12 = null;
                            obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
                            if (str == null) {
                            }
                            if (str9 == null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str5 != null) {
                            }
                            if (str10 == null) {
                            }
                            if (str11 == null) {
                            }
                            if (str12 == null) {
                            }
                            if (d.NEED_LOG) {
                            }
                        }
                        try {
                            str4 = properties.getProperty(KEY_DOWNLOAD_MIN_PROGRESS_TIME);
                        } catch (IOException e11) {
                            e = e11;
                            str4 = null;
                            str5 = null;
                            str6 = null;
                            str7 = null;
                            if (e instanceof FileNotFoundException) {
                            }
                            if (inputStream != null) {
                            }
                            obj = e.class;
                            str9 = str2;
                            str10 = str6;
                            str11 = str7;
                            str = str8;
                            str12 = null;
                            obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
                            if (str == null) {
                            }
                            if (str9 == null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str5 != null) {
                            }
                            if (str10 == null) {
                            }
                            if (str11 == null) {
                            }
                            if (str12 == null) {
                            }
                            if (d.NEED_LOG) {
                            }
                        }
                        try {
                            str5 = properties.getProperty(KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT);
                        } catch (IOException e12) {
                            e = e12;
                            str5 = null;
                            str6 = null;
                            str7 = null;
                            if (e instanceof FileNotFoundException) {
                            }
                            if (inputStream != null) {
                            }
                            obj = e.class;
                            str9 = str2;
                            str10 = str6;
                            str11 = str7;
                            str = str8;
                            str12 = null;
                            obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
                            if (str == null) {
                            }
                            if (str9 == null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str5 != null) {
                            }
                            if (str10 == null) {
                            }
                            if (str11 == null) {
                            }
                            if (str12 == null) {
                            }
                            if (d.NEED_LOG) {
                            }
                        }
                        try {
                            str6 = properties.getProperty(KEY_FILE_NON_PRE_ALLOCATION);
                        } catch (IOException e13) {
                            e = e13;
                            str6 = null;
                            str7 = null;
                            if (e instanceof FileNotFoundException) {
                            }
                            if (inputStream != null) {
                            }
                            obj = e.class;
                            str9 = str2;
                            str10 = str6;
                            str11 = str7;
                            str = str8;
                            str12 = null;
                            obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
                            if (str == null) {
                            }
                            if (str9 == null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str5 != null) {
                            }
                            if (str10 == null) {
                            }
                            if (str11 == null) {
                            }
                            if (str12 == null) {
                            }
                            if (d.NEED_LOG) {
                            }
                        }
                        try {
                            str7 = properties.getProperty(KEY_BROADCAST_COMPLETED);
                        } catch (IOException e14) {
                            e = e14;
                            str7 = null;
                            if (e instanceof FileNotFoundException) {
                            }
                            if (inputStream != null) {
                            }
                            obj = e.class;
                            str9 = str2;
                            str10 = str6;
                            str11 = str7;
                            str = str8;
                            str12 = null;
                            obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
                            if (str == null) {
                            }
                            if (str9 == null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str5 != null) {
                            }
                            if (str10 == null) {
                            }
                            if (str11 == null) {
                            }
                            if (str12 == null) {
                            }
                            if (d.NEED_LOG) {
                            }
                        }
                        try {
                            str13 = str2;
                            property = properties.getProperty(KEY_TRIAL_CONNECTION_HEAD_METHOD);
                        } catch (IOException e15) {
                            e = e15;
                            if (e instanceof FileNotFoundException) {
                            }
                            if (inputStream != null) {
                            }
                            obj = e.class;
                            str9 = str2;
                            str10 = str6;
                            str11 = str7;
                            str = str8;
                            str12 = null;
                            obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
                            if (str == null) {
                            }
                            if (str9 == null) {
                            }
                            if (str3 != null) {
                            }
                            if (str4 != null) {
                            }
                            if (str5 != null) {
                            }
                            if (str10 == null) {
                            }
                            if (str11 == null) {
                            }
                            if (str12 == null) {
                            }
                            if (d.NEED_LOG) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream == null) {
                            throw th;
                        }
                        try {
                            inputStream.close();
                            throw th;
                        } catch (IOException e16) {
                            e16.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e17) {
                    e = e17;
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    if (e instanceof FileNotFoundException) {
                    }
                    if (inputStream != null) {
                    }
                    obj = e.class;
                    str9 = str2;
                    str10 = str6;
                    str11 = str7;
                    str = str8;
                    str12 = null;
                    obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
                    if (str == null) {
                    }
                    if (str9 == null) {
                    }
                    if (str3 != null) {
                    }
                    if (str4 != null) {
                    }
                    if (str5 != null) {
                    }
                    if (str10 == null) {
                    }
                    if (str11 == null) {
                    }
                    if (str12 == null) {
                    }
                    if (d.NEED_LOG) {
                    }
                }
            } else {
                str = null;
                str13 = null;
                property = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e18) {
                    e18.printStackTrace();
                }
            }
            str9 = str13;
            str12 = property;
            str10 = str6;
            obj2 = KEY_DOWNLOAD_MAX_NETWORK_THREAD_COUNT;
            obj = e.class;
            str11 = str7;
        } catch (IOException e19) {
            e = e19;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
        if (str == null) {
            obj3 = KEY_HTTP_LENIENT;
            r10 = 0;
            this.httpLenient = false;
        } else {
            if (!str.equals(TRUE_STRING) && !str.equals(FALSE_STRING)) {
                throw new IllegalStateException(f.formatString("the value of '%s' must be '%s' or '%s'", KEY_HTTP_LENIENT, TRUE_STRING, FALSE_STRING));
            }
            obj3 = KEY_HTTP_LENIENT;
            r10 = 0;
            this.httpLenient = str.equals(TRUE_STRING);
        }
        if (str9 == null) {
            this.processNonSeparate = r10;
        } else {
            if (!str9.equals(TRUE_STRING) && !str9.equals(FALSE_STRING)) {
                Object[] objArr = new Object[3];
                objArr[r10] = KEY_PROCESS_NON_SEPARATE;
                objArr[1] = TRUE_STRING;
                objArr[2] = FALSE_STRING;
                throw new IllegalStateException(f.formatString("the value of '%s' must be '%s' or '%s'", objArr));
            }
            this.processNonSeparate = str9.equals(TRUE_STRING);
        }
        if (str3 != null) {
            this.downloadMinProgressStep = Math.max((int) r10, Integer.valueOf(str3).intValue());
        } else {
            this.downloadMinProgressStep = 65536;
        }
        if (str4 != null) {
            Long valueOf = Long.valueOf(str4);
            obj4 = KEY_PROCESS_NON_SEPARATE;
            j8 = currentTimeMillis;
            this.downloadMinProgressTime = Math.max(0L, valueOf.longValue());
        } else {
            obj4 = KEY_PROCESS_NON_SEPARATE;
            j8 = currentTimeMillis;
            this.downloadMinProgressTime = ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
        }
        if (str5 != null) {
            this.downloadMaxNetworkThreadCount = getValidNetworkThreadCount(Integer.valueOf(str5).intValue());
            i8 = 3;
        } else {
            i8 = 3;
            this.downloadMaxNetworkThreadCount = 3;
        }
        if (str10 == null) {
            r9 = 0;
            this.fileNonPreAllocation = false;
        } else {
            if (!str10.equals(TRUE_STRING) && !str10.equals(FALSE_STRING)) {
                Object[] objArr2 = new Object[i8];
                objArr2[0] = KEY_FILE_NON_PRE_ALLOCATION;
                objArr2[1] = TRUE_STRING;
                objArr2[2] = FALSE_STRING;
                throw new IllegalStateException(f.formatString("the value of '%s' must be '%s' or '%s'", objArr2));
            }
            r9 = 0;
            this.fileNonPreAllocation = str10.equals(TRUE_STRING);
        }
        if (str11 == null) {
            this.broadcastCompleted = r9;
        } else {
            if (!str11.equals(TRUE_STRING) && !str11.equals(FALSE_STRING)) {
                Object[] objArr3 = new Object[3];
                objArr3[r9] = KEY_BROADCAST_COMPLETED;
                objArr3[1] = TRUE_STRING;
                objArr3[2] = FALSE_STRING;
                throw new IllegalStateException(f.formatString("the value of '%s' must be '%s' or '%s'", objArr3));
            }
            this.broadcastCompleted = str11.equals(TRUE_STRING);
        }
        if (str12 == null) {
            this.trialConnectionHeadMethod = r9;
        } else {
            if (!str12.equals(TRUE_STRING) && !str12.equals(FALSE_STRING)) {
                Object[] objArr4 = new Object[3];
                objArr4[r9] = KEY_TRIAL_CONNECTION_HEAD_METHOD;
                objArr4[1] = TRUE_STRING;
                objArr4[2] = FALSE_STRING;
                throw new IllegalStateException(f.formatString("the value of '%s' must be '%s' or '%s'", objArr4));
            }
            this.trialConnectionHeadMethod = str12.equals(TRUE_STRING);
        }
        if (d.NEED_LOG) {
            Object[] objArr5 = new Object[17];
            objArr5[r9] = Long.valueOf(System.currentTimeMillis() - j8);
            objArr5[1] = obj3;
            objArr5[2] = Boolean.valueOf(this.httpLenient);
            objArr5[3] = obj4;
            objArr5[4] = Boolean.valueOf(this.processNonSeparate);
            objArr5[5] = KEY_DOWNLOAD_MIN_PROGRESS_STEP;
            objArr5[6] = Integer.valueOf(this.downloadMinProgressStep);
            objArr5[7] = KEY_DOWNLOAD_MIN_PROGRESS_TIME;
            objArr5[8] = Long.valueOf(this.downloadMinProgressTime);
            objArr5[9] = obj2;
            objArr5[10] = Integer.valueOf(this.downloadMaxNetworkThreadCount);
            objArr5[11] = KEY_FILE_NON_PRE_ALLOCATION;
            objArr5[12] = Boolean.valueOf(this.fileNonPreAllocation);
            objArr5[13] = KEY_BROADCAST_COMPLETED;
            objArr5[14] = Boolean.valueOf(this.broadcastCompleted);
            objArr5[15] = KEY_TRIAL_CONNECTION_HEAD_METHOD;
            objArr5[16] = Boolean.valueOf(this.trialConnectionHeadMethod);
            d.i(obj, "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d; %s=%B; %s=%B; %s=%B", objArr5);
        }
    }
}
