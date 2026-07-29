package com.chartboost.sdk.impl;

import android.os.Handler;
import com.aiming.mdt.utils.Constants;
import com.chartboost.sdk.Model.CBError;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class an<T> implements Comparable<an>, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ad<T> f3731a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3732b;

    /* renamed from: c, reason: collision with root package name */
    private final ao f3733c;

    /* renamed from: d, reason: collision with root package name */
    private final ai f3734d;
    private final com.chartboost.sdk.Libraries.i e;
    private final Handler f;
    private af<T> g;
    private ag h;

    private static boolean a(int i) {
        return ((100 <= i && i < 200) || i == 204 || i == 304) ? false : true;
    }

    an(Executor executor, ao aoVar, ai aiVar, com.chartboost.sdk.Libraries.i iVar, Handler handler, ad<T> adVar) {
        this.f3732b = executor;
        this.f3733c = aoVar;
        this.f3734d = aiVar;
        this.e = iVar;
        this.f = handler;
        this.f3731a = adVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
    
        throw r2;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        if (this.g != null) {
            try {
                if (this.g.f3706b == null) {
                    this.f3731a.a((ad<T>) this.g.f3705a, this.h);
                } else {
                    this.f3731a.a(this.g.f3706b, this.h);
                }
                return;
            } catch (Exception e) {
                com.chartboost.sdk.Tracking.a.a(getClass(), "deliver result", e);
                return;
            }
        }
        if (this.f3731a.e.compareAndSet(0, 1)) {
            long b2 = this.e.b();
            try {
                try {
                    if (this.f3734d.b()) {
                        this.h = a(this.f3731a);
                        int i = this.h.f3707a;
                        if (i >= 200 && i < 300) {
                            this.g = this.f3731a.a(this.h);
                        } else {
                            this.g = af.a(new CBError(CBError.a.NETWORK_FAILURE, "Failure due to HTTP status code " + i));
                        }
                    } else {
                        this.g = af.a(new CBError(CBError.a.INTERNET_UNAVAILABLE, "Internet Unavailable"));
                    }
                    this.f3731a.g = this.e.b() - b2;
                } catch (Throwable th) {
                    this.g = af.a(new CBError(CBError.a.NETWORK_FAILURE, th.toString()));
                    this.f3731a.g = this.e.b() - b2;
                    switch (this.f3731a.j) {
                        case 0:
                            break;
                        case 1:
                            break;
                        default:
                            return;
                    }
                }
                switch (this.f3731a.j) {
                    case 0:
                        this.f.post(this);
                        return;
                    case 1:
                        this.f3732b.execute(this);
                        return;
                    default:
                        return;
                }
            } catch (Throwable th2) {
                this.f3731a.g = this.e.b() - b2;
                switch (this.f3731a.j) {
                    case 0:
                        this.f.post(this);
                        break;
                    case 1:
                        this.f3732b.execute(this);
                        break;
                }
            }
        }
    }

    private ag a(ad<T> adVar) throws IOException {
        int i = 10000;
        int i2 = 0;
        while (true) {
            try {
                return a(adVar, i);
            } catch (SocketTimeoutException e) {
                if (i2 >= 1) {
                    throw e;
                }
                i *= 2;
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    private ag a(ad<T> adVar, int i) throws IOException {
        long b2;
        byte[] bArr;
        InputStream errorStream;
        InputStream inputStream;
        ae a2 = adVar.a();
        Map<String, String> map = a2.f3702a;
        HttpURLConnection a3 = this.f3733c.a(adVar);
        a3.setConnectTimeout(i);
        a3.setReadTimeout(i);
        a3.setUseCaches(false);
        a3.setDoInput(true);
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    a3.addRequestProperty(str, map.get(str));
                }
            } catch (Throwable th) {
                a3.disconnect();
                throw th;
            }
        }
        a3.setRequestMethod(adVar.f3699b);
        ?? r4 = 0;
        DataOutputStream dataOutputStream = null;
        r4 = 0;
        if (adVar.f3699b.equals("POST") && a2.f3703b != null) {
            a3.setDoOutput(true);
            a3.setFixedLengthStreamingMode(a2.f3703b.length);
            if (a2.f3704c != null) {
                a3.addRequestProperty(Constants.KEY_CONTENT_TYPE, a2.f3704c);
            }
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(a3.getOutputStream());
                try {
                    dataOutputStream2.write(a2.f3703b);
                    try {
                        dataOutputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        long b3 = this.e.b();
        try {
            int responseCode = a3.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            try {
                if (a(responseCode)) {
                    if (adVar.f != null) {
                        File file = new File(adVar.f.getParentFile(), adVar.f.getName() + ".tmp");
                        bArr = new byte[0];
                        try {
                            inputStream = a3.getInputStream();
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    bi.a(inputStream, fileOutputStream);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused4) {
                                    }
                                    if (!file.renameTo(adVar.f)) {
                                        if (!file.delete()) {
                                            throw new IOException("Unable to delete " + file.getAbsolutePath() + " after failing to rename to " + adVar.f.getAbsolutePath());
                                        }
                                        throw new IOException("Unable to move " + file.getAbsolutePath() + " to " + adVar.f.getAbsolutePath());
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r4 = fileOutputStream;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    if (r4 != 0) {
                                        try {
                                            r4.close();
                                            throw th;
                                        } catch (IOException unused6) {
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            inputStream = null;
                        }
                    } else {
                        try {
                            try {
                                errorStream = a3.getInputStream();
                            } catch (IOException unused7) {
                                errorStream = a3.getErrorStream();
                            }
                            InputStream inputStream2 = errorStream;
                            if (inputStream2 != null) {
                                bArr = bi.b(new BufferedInputStream(inputStream2));
                            } else {
                                bArr = new byte[0];
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException unused8) {
                                }
                            }
                        } catch (Throwable th7) {
                            if (0 != 0) {
                                try {
                                    r4.close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th7;
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                adVar.i = this.e.b() - b2;
                ag agVar = new ag(responseCode, bArr);
                a3.disconnect();
                return agVar;
            } catch (Throwable th8) {
                adVar.i = this.e.b() - b2;
                throw th8;
            }
        } finally {
            adVar.h = this.e.b() - b3;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(an anVar) {
        return this.f3731a.f3701d - anVar.f3731a.f3701d;
    }
}
