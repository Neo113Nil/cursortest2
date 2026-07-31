package H0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.cc;
import com.ironsource.jn;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class f extends a implements Callable {

    /* renamed from: j, reason: collision with root package name */
    private static final String f750j = "f";

    public f(String str, int i4, c cVar, Context context, String str2, GrsBaseInfo grsBaseInfo, F0.c cVar2) {
        super(str, i4, cVar, context, str2, grsBaseInfo, cVar2);
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0042: MOVE (r6 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:67), block:B:69:0x0042 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d call() {
        HttpsURLConnection httpsURLConnection;
        long j4;
        HttpURLConnection httpURLConnection;
        long currentTimeMillis;
        long elapsedRealtime;
        String str = f750j;
        Logger.i(str, "Post call execute");
        long j5 = 0;
        HttpURLConnection httpURLConnection2 = null;
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            try {
                try {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        j5 = System.currentTimeMillis();
                        httpsURLConnection = L0.a.a(c(), a(), e());
                    } catch (IOException e4) {
                        e = e4;
                        httpsURLConnection = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (RuntimeException unused) {
                            Logger.w(f750j, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                        } catch (Throwable unused2) {
                            Logger.w(f750j, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection2 != null) {
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpsURLConnection = null;
            j4 = 0;
        }
        try {
        } catch (IOException e6) {
            e = e6;
            j4 = j5;
            j5 = elapsedRealtime;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            currentTimeMillis = System.currentTimeMillis();
            Logger.w(f750j, "RequestCallableV2 run task catch IOException", e);
            this.f709b = new d(e, elapsedRealtime2 - j5);
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.disconnect();
                } catch (RuntimeException unused3) {
                    j5 = j4;
                    Logger.w(f750j, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                    long j6 = currentTimeMillis;
                    this.f709b.i(c());
                    this.f709b.b(d());
                    this.f709b.h(j5);
                    this.f709b.c(j6);
                    if (b() != null) {
                    }
                    return this.f709b;
                } catch (Throwable unused4) {
                    j5 = j4;
                    Logger.w(f750j, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                    long j62 = currentTimeMillis;
                    this.f709b.i(c());
                    this.f709b.b(d());
                    this.f709b.h(j5);
                    this.f709b.c(j62);
                    if (b() != null) {
                    }
                    return this.f709b;
                }
            }
            j5 = j4;
            long j622 = currentTimeMillis;
            this.f709b.i(c());
            this.f709b.b(d());
            this.f709b.h(j5);
            this.f709b.c(j622);
            if (b() != null) {
            }
            return this.f709b;
        }
        if (httpsURLConnection == null) {
            Logger.w(str, "create HttpsURLConnection instance by url return null.");
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.disconnect();
                    return null;
                } catch (RuntimeException unused5) {
                    Logger.w(f750j, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
                } catch (Throwable unused6) {
                    Logger.w(f750j, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
                }
            }
            return null;
        }
        httpsURLConnection.setRequestProperty(cc.f15718K, "application/json; charset=UTF-8");
        httpsURLConnection.setRequestProperty("Connection", "close");
        httpsURLConnection.setRequestMethod(jn.f16865b);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setDoInput(true);
        String c4 = b() != null ? b().c() : "";
        if (TextUtils.isEmpty(c4)) {
            c4 = "&";
        }
        httpsURLConnection.setRequestProperty("If-None-Match", c4);
        httpsURLConnection.connect();
        L0.a.b(httpsURLConnection, f().a("services", ""));
        int responseCode = httpsURLConnection.getResponseCode();
        Logger.i(str, "httpsURLConnection result code:" + responseCode);
        if (responseCode == 200) {
            try {
                inputStream = httpsURLConnection.getInputStream();
                byte[] byteArray = IoUtils.toByteArray(inputStream);
                IoUtils.closeSecure(inputStream);
                bArr = byteArray;
            } catch (Throwable th3) {
                IoUtils.closeSecure(inputStream);
                throw th3;
            }
        }
        Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
        httpsURLConnection.disconnect();
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        currentTimeMillis = System.currentTimeMillis();
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.f709b = new d(responseCode, headerFields, bArr, elapsedRealtime3 - elapsedRealtime);
        try {
            httpsURLConnection.disconnect();
        } catch (RuntimeException unused7) {
            Logger.w(f750j, "RequestCallableV2 disconnect HttpsURLConnection catch RuntimeException");
            long j6222 = currentTimeMillis;
            this.f709b.i(c());
            this.f709b.b(d());
            this.f709b.h(j5);
            this.f709b.c(j6222);
            if (b() != null) {
            }
            return this.f709b;
        } catch (Throwable unused8) {
            Logger.w(f750j, "RequestCallableV2 disconnect HttpsURLConnection catch Throwable");
            long j62222 = currentTimeMillis;
            this.f709b.i(c());
            this.f709b.b(d());
            this.f709b.h(j5);
            this.f709b.c(j62222);
            if (b() != null) {
            }
            return this.f709b;
        }
        long j622222 = currentTimeMillis;
        this.f709b.i(c());
        this.f709b.b(d());
        this.f709b.h(j5);
        this.f709b.c(j622222);
        if (b() != null) {
            b().d(this.f709b);
        }
        return this.f709b;
    }
}
