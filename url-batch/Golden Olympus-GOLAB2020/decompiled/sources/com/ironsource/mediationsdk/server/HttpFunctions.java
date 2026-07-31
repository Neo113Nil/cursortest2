package com.ironsource.mediationsdk.server;

import android.text.TextUtils;
import com.ironsource.cc;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.ironsource.o9;
import com.ironsource.ye;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public class HttpFunctions {
    public static final String ERROR_PREFIX = "ERROR:";

    /* renamed from: a, reason: collision with root package name */
    private static final int f17920a = 15000;

    /* renamed from: b, reason: collision with root package name */
    private static final String f17921b = "GET";

    /* renamed from: c, reason: collision with root package name */
    private static final String f17922c = "POST";

    /* renamed from: d, reason: collision with root package name */
    private static final String f17923d = "UTF-8";

    /* renamed from: e, reason: collision with root package name */
    private static final String f17924e = "Bad Request - 400";

    /* renamed from: f, reason: collision with root package name */
    private static final ExecutorService f17925f = Executors.newSingleThreadExecutor();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f17926a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17927b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ye f17928c;

        a(String str, String str2, ye yeVar) {
            this.f17926a = str;
            this.f17927b = str2;
            this.f17928c = yeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpURLConnection httpURLConnection;
            OutputStream outputStream;
            try {
                httpURLConnection = HttpFunctions.b(this.f17926a);
            } catch (Exception e4) {
                e = e4;
                httpURLConnection = null;
                outputStream = null;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = null;
                outputStream = null;
            }
            try {
                outputStream = httpURLConnection.getOutputStream();
                try {
                    try {
                        HttpFunctions.b(this.f17927b, outputStream);
                        int responseCode = httpURLConnection.getResponseCode();
                        boolean z4 = responseCode == 200;
                        if (!z4) {
                            IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                        }
                        this.f17928c.a(z4);
                    } catch (Exception e5) {
                        e = e5;
                        o9.d().a(e);
                        IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                        this.f17928c.a(false);
                        HttpFunctions.b(outputStream, httpURLConnection, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    HttpFunctions.b(outputStream, httpURLConnection, null);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                outputStream = null;
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                HttpFunctions.b(outputStream, httpURLConnection, null);
                throw th;
            }
            HttpFunctions.b(outputStream, httpURLConnection, null);
        }
    }

    @Nullable
    private static String a(BufferedReader bufferedReader) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HttpURLConnection b(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(f17920a);
        httpURLConnection.setConnectTimeout(f17920a);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    public static String getStringFromURL(String str) {
        return getStringFromURL(str, null);
    }

    @Nullable
    public static String sendPostRequest(String str, String str2, p.c cVar) {
        Throwable th;
        BufferedReader bufferedReader;
        OutputStream outputStream;
        Exception e4;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = b(str);
            try {
                httpURLConnection.setRequestProperty(cc.f15718K, "application/json; charset=utf-8");
                outputStream = httpURLConnection.getOutputStream();
                try {
                    b(str2, outputStream);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        if (responseCode == 400 && cVar != null) {
                            cVar.a(f17924e);
                        }
                        b(outputStream, httpURLConnection, null);
                        return null;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    try {
                        String a4 = a(bufferedReader);
                        b(outputStream, httpURLConnection, bufferedReader);
                        return a4;
                    } catch (Exception e5) {
                        e4 = e5;
                        try {
                            o9.d().a(e4);
                            IronLog.INTERNAL.error("exception while sending request " + e4.getMessage());
                            b(outputStream, httpURLConnection, bufferedReader);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            httpURLConnection2 = httpURLConnection;
                            httpURLConnection = httpURLConnection2;
                            b(outputStream, httpURLConnection, bufferedReader);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        b(outputStream, httpURLConnection, bufferedReader);
                        throw th;
                    }
                } catch (Exception e6) {
                    e4 = e6;
                    bufferedReader = null;
                    o9.d().a(e4);
                    IronLog.INTERNAL.error("exception while sending request " + e4.getMessage());
                    b(outputStream, httpURLConnection, bufferedReader);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                    httpURLConnection2 = httpURLConnection;
                    httpURLConnection = httpURLConnection2;
                    b(outputStream, httpURLConnection, bufferedReader);
                    throw th;
                }
            } catch (Exception e7) {
                e4 = e7;
                outputStream = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedReader = null;
                outputStream = null;
            }
        } catch (Exception e8) {
            e4 = e8;
            httpURLConnection = null;
            outputStream = null;
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
            outputStream = null;
            httpURLConnection = httpURLConnection2;
            b(outputStream, httpURLConnection, bufferedReader);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error("exception while closing output stream " + e4.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e5) {
                o9.d().a(e5);
                IronLog.INTERNAL.error("exception while closing reader " + e5.getMessage());
            }
        }
    }

    public static String getStringFromURL(String str, p.c cVar) {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e4;
        BufferedReader bufferedReader2;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(f17920a);
                httpURLConnection.setConnectTimeout(f17920a);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (cVar != null) {
                        cVar.a(f17924e);
                    }
                    b(null, httpURLConnection, null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String a4 = a(bufferedReader2);
                    b(null, httpURLConnection, bufferedReader2);
                    return a4;
                } catch (Exception e5) {
                    e4 = e5;
                    try {
                        o9.d().a(e4);
                        b(null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        b(null, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    b(null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                e4 = e;
                bufferedReader2 = null;
                o9.d().a(e4);
                b(null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                BufferedReader bufferedReader32 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader32;
                b(null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            httpURLConnection = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    public static void sendPostRequest(String str, String str2, ye yeVar) {
        f17925f.submit(new a(str, str2, yeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, OutputStream outputStream) {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, f17923d));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
