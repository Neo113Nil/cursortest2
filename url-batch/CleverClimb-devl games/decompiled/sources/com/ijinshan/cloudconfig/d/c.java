package com.ijinshan.cloudconfig.d;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: NetUtil.java */
/* loaded from: classes2.dex */
public class c {
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[Catch: all -> 0x00f9, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #12 {, blocks: (B:9:0x000d, B:13:0x0015, B:59:0x00d9, B:55:0x00de, B:50:0x00e5, B:76:0x00f0, B:69:0x00f5, B:70:0x00f8, B:87:0x00bc, B:83:0x00c1), top: B:8:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized String a(String str, int i, int i2, int i3) {
        HttpURLConnection httpURLConnection;
        String str2;
        BufferedReader bufferedReader;
        String str3;
        synchronized (c.class) {
            BufferedReader bufferedReader2 = null;
            String str4 = null;
            BufferedReader bufferedReader3 = null;
            bufferedReader2 = null;
            HttpURLConnection httpURLConnection2 = null;
            if (str == null || i <= 0 || i2 <= 0) {
                return null;
            }
            com.ijinshan.cloudconfig.deepcloudconfig.c.f6698a = false;
            if (i3 == 1 && i2 == 3) {
                a.a("zzb_cloud", "请求版本魔方号");
                com.ijinshan.cloudconfig.a.b.a(com.ijinshan.cloudconfig.deepcloudconfig.c.a().b(), 5, "1", "");
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (Exception e) {
                e = e;
                str2 = null;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
            }
            try {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("Charset", "utf8");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode <= 207) {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[1024];
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while (true) {
                        try {
                            try {
                                int read = bufferedReader.read(cArr);
                                if (read < 0) {
                                    break;
                                }
                                if (read > 0) {
                                    sb.append(cArr, 0, read);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str2 = null;
                                httpURLConnection2 = httpURLConnection;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            if (httpURLConnection != null) {
                            }
                            if (bufferedReader2 != null) {
                            }
                        }
                    }
                    if (sb.length() > 0) {
                        String sb2 = sb.toString();
                        try {
                            a.a("zzb_cloud", "jsondata=" + sb.toString());
                            str4 = sb2;
                        } catch (Exception e3) {
                            e = e3;
                            httpURLConnection2 = httpURLConnection;
                            str2 = sb2;
                            try {
                                e.printStackTrace();
                                com.ijinshan.cloudconfig.deepcloudconfig.c.f6698a = true;
                                if (httpURLConnection2 != null) {
                                    try {
                                        httpURLConnection2.disconnect();
                                    } catch (Exception unused) {
                                    }
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                                str3 = str2;
                                if (str3 == null) {
                                }
                                return str3;
                            } catch (Throwable th3) {
                                th = th3;
                                httpURLConnection = httpURLConnection2;
                                bufferedReader2 = bufferedReader;
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception unused3) {
                                    }
                                }
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    str3 = str4;
                    bufferedReader3 = bufferedReader;
                } else {
                    com.ijinshan.cloudconfig.deepcloudconfig.c.f6698a = true;
                    str3 = null;
                }
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused5) {
                    }
                }
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                    } catch (Exception unused6) {
                    }
                }
            } catch (Exception e4) {
                e = e4;
                bufferedReader = null;
                httpURLConnection2 = httpURLConnection;
                str2 = null;
            } catch (Throwable th4) {
                th = th4;
                if (httpURLConnection != null) {
                }
                if (bufferedReader2 != null) {
                }
            }
            if (str3 == null) {
                str3 = a(str, i, i2 - 1, i3);
            }
            return str3;
        }
    }
}
