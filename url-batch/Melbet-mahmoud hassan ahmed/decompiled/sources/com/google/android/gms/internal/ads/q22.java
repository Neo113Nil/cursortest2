package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q22 implements pv2<o22, p22> {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f10558a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f10559b;

    /* renamed from: c, reason: collision with root package name */
    protected final ij0 f10560c;

    public q22(Context context, String str, ij0 ij0Var, int i7, byte[] bArr) {
        this.f10558a = context;
        this.f10559b = str;
        this.f10560c = ij0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f2, code lost:
    
        r0 = new java.lang.StringBuilder(46);
        r0.append("Received error HTTP response code: ");
        r0.append(r6);
        com.google.android.gms.internal.ads.io0.g(r0.toString());
        r4 = new java.lang.StringBuilder(46);
        r4.append("Received error HTTP response code: ");
        r4.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x021a, code lost:
    
        throw new com.google.android.gms.internal.ads.fz1(1, r4.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0241 A[Catch: all -> 0x0250, TryCatch #4 {all -> 0x0250, blocks: (B:22:0x00a5, B:29:0x022f, B:31:0x0241, B:34:0x024f, B:36:0x00ab, B:38:0x00b3, B:39:0x00b8, B:41:0x00bc, B:46:0x00ce, B:50:0x00d6, B:51:0x00d9, B:55:0x00da, B:56:0x00f2, B:58:0x00f8, B:65:0x0110, B:61:0x011a, B:68:0x0124, B:71:0x0129, B:84:0x0160, B:86:0x016e, B:89:0x0181, B:90:0x0187, B:91:0x0188, B:94:0x019c, B:95:0x019f, B:103:0x01a7, B:105:0x01b3, B:118:0x01d8, B:119:0x01e4, B:121:0x01e5, B:122:0x01f1, B:124:0x01f2, B:125:0x021a), top: B:21:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024f A[Catch: all -> 0x0250, TRY_LEAVE, TryCatch #4 {all -> 0x0250, blocks: (B:22:0x00a5, B:29:0x022f, B:31:0x0241, B:34:0x024f, B:36:0x00ab, B:38:0x00b3, B:39:0x00b8, B:41:0x00bc, B:46:0x00ce, B:50:0x00d6, B:51:0x00d9, B:55:0x00da, B:56:0x00f2, B:58:0x00f8, B:65:0x0110, B:61:0x011a, B:68:0x0124, B:71:0x0129, B:84:0x0160, B:86:0x016e, B:89:0x0181, B:90:0x0187, B:91:0x0188, B:94:0x019c, B:95:0x019f, B:103:0x01a7, B:105:0x01b3, B:118:0x01d8, B:119:0x01e4, B:121:0x01e5, B:122:0x01f1, B:124:0x01f2, B:125:0x021a), top: B:21:0x00a5 }] */
    @Override // com.google.android.gms.internal.ads.pv2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p22 c(o22 o22Var) {
        int i7;
        p22 p22Var;
        InputStreamReader inputStreamReader;
        q22 q22Var = this;
        String str = o22Var.f9452a;
        int i8 = o22Var.f9453b;
        Map<String, String> map = o22Var.f9454c;
        byte[] bArr = o22Var.f9455d;
        String str2 = o22Var.f9456e;
        long a7 = y2.t.a().a();
        try {
            p22 p22Var2 = new p22();
            String valueOf = String.valueOf(q22Var.f10559b);
            io0.f(valueOf.length() != 0 ? "SDK version: ".concat(valueOf) : new String("SDK version: "));
            String valueOf2 = String.valueOf(str);
            io0.b(valueOf2.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(valueOf2) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i9 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    a3.g2 q7 = y2.t.q();
                    Context context = q22Var.f10558a;
                    String str3 = q22Var.f10559b;
                    HttpURLConnection httpURLConnection2 = httpURLConnection;
                    p22 p22Var3 = p22Var2;
                    i7 = 1;
                    try {
                        q7.S(context, str3, false, httpURLConnection2, false, i8);
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            httpURLConnection = httpURLConnection2;
                            try {
                                try {
                                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                                    httpURLConnection2 = httpURLConnection;
                                } catch (Throwable th) {
                                    th = th;
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            } catch (fz1 e7) {
                                e = e7;
                                p22Var = p22Var3;
                                if (((Boolean) sw.c().b(m10.f8183d6)).booleanValue()) {
                                    throw e;
                                }
                                p22Var.f10033d = y2.t.a().a() - a7;
                                httpURLConnection.disconnect();
                                return p22Var;
                            }
                        }
                        httpURLConnection = httpURLConnection2;
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        int length = bArr.length;
                        BufferedOutputStream bufferedOutputStream = null;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    v3.j.a(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    v3.j.a(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        ho0 ho0Var = new ho0(null);
                        ho0Var.c(httpURLConnection, bArr);
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                            }
                        }
                        ho0Var.e(httpURLConnection, responseCode);
                        p22Var = p22Var3;
                        try {
                            p22Var.f10030a = responseCode;
                            p22Var.f10031b = hashMap;
                            p22Var.f10032c = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        y2.t.q();
                                        StringBuilder sb = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int read = inputStreamReader.read(cArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            sb.append(cArr, 0, read);
                                        }
                                        String sb2 = sb.toString();
                                        v3.j.a(inputStreamReader);
                                        ho0Var.g(sb2);
                                        p22Var.f10032c = sb2;
                                        if (TextUtils.isEmpty(sb2)) {
                                            if (!((Boolean) sw.c().b(m10.U3)).booleanValue()) {
                                                throw new fz1(3);
                                            }
                                        }
                                        p22Var.f10033d = y2.t.a().a() - a7;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        v3.j.a(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamReader = null;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    break;
                                }
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    io0.g("No location header to follow redirect.");
                                    throw new fz1(1, "No location header to follow redirect");
                                }
                                URL url2 = new URL(headerField);
                                int i10 = i9 + 1;
                                if (i10 > ((Integer) sw.c().b(m10.A3)).intValue()) {
                                    io0.g("Too many redirects.");
                                    throw new fz1(1, "Too many redirects");
                                }
                                try {
                                    httpURLConnection.disconnect();
                                    q22Var = this;
                                    i9 = i10;
                                    p22Var2 = p22Var;
                                    url = url2;
                                } catch (IOException e8) {
                                    e = e8;
                                    String valueOf3 = String.valueOf(e.getMessage());
                                    String concat = valueOf3.length() != 0 ? "Error while connecting to ad server: ".concat(valueOf3) : new String("Error while connecting to ad server: ");
                                    io0.g(concat);
                                    throw new fz1(i7, concat, e);
                                }
                            }
                        } catch (fz1 e9) {
                            e = e9;
                            if (((Boolean) sw.c().b(m10.f8183d6)).booleanValue()) {
                            }
                        }
                    } catch (fz1 e10) {
                        e = e10;
                        httpURLConnection = httpURLConnection2;
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (fz1 e11) {
                    e = e11;
                    p22Var = p22Var2;
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        } catch (IOException e12) {
            e = e12;
            i7 = 1;
        }
    }
}
