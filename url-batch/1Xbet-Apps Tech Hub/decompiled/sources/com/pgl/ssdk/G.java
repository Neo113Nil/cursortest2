package com.pgl.ssdk;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* compiled from: MyBaseRequest.java */
/* loaded from: classes3.dex */
public abstract class G {
    private String a;
    private int c;
    private int d;
    private byte[] e;
    public String b = "";
    private int f = -1;
    private byte[] g = null;
    private int h = 10000;
    private int i = 2;
    private int j = 0;
    private boolean k = false;
    private HttpURLConnection l = null;
    private Runnable m = new a();

    /* compiled from: MyBaseRequest.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (G.this.a() || G.this.j >= G.this.i) {
                return;
            }
            G.c(G.this);
            Q b = M.a().b();
            if (b != null) {
                b.post(this);
            }
        }
    }

    public G(Context context, String str) {
        this.a = (str == null || str.length() <= 0) ? "" : str;
    }

    static /* synthetic */ int c(G g) {
        int i = g.j;
        g.j = i + 1;
        return i;
    }

    public abstract boolean a(int i, byte[] bArr);

    private void a(int i) {
        String str = i != 1 ? i != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (str.length() > 0) {
            this.l.addRequestProperty(HttpHeaders.CONTENT_TYPE, str);
        }
        this.l.addRequestProperty(HttpHeaders.COOKIE, "sessionid=" + this.a);
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.l.addRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString() + "," + language + ";q=0.9");
            } else {
                this.l.addRequestProperty(HttpHeaders.ACCEPT_LANGUAGE, Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        r1.disconnect();
        r8.l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (r2 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a() {
        boolean z;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        boolean z2 = false;
        try {
            URL url = new URL(this.b);
            if (this.k) {
                HttpsURLConnection.setDefaultSSLSocketFactory(SSLContext.getInstance("TLS").getSocketFactory());
                this.l = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            } else {
                this.l = (HttpURLConnection) url.openConnection();
            }
            this.l.setConnectTimeout(this.h);
            this.l.setReadTimeout(this.h);
            int i = this.c;
            z = true;
            this.l.setRequestMethod(i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? ShareTarget.METHOD_GET : "TRACE" : "HEAD" : "DELETE" : "PUT" : ShareTarget.METHOD_POST);
            a(this.d);
            byte[] bArr = this.e;
            if (bArr != null && bArr.length > 0) {
                this.l.setDoOutput(true);
                OutputStream outputStream = this.l.getOutputStream();
                outputStream.write(this.e);
                outputStream.flush();
                outputStream.close();
            }
            this.l.connect();
            try {
                this.f = this.l.getResponseCode();
                inputStream = this.l.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr2, 0, 1024);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    this.g = byteArrayOutputStream.toByteArray();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                inputStream = null;
            }
            inputStream.close();
            httpURLConnection = this.l;
        } catch (Throwable unused3) {
            HttpURLConnection httpURLConnection2 = this.l;
            if (httpURLConnection2 != null) {
                z = false;
                httpURLConnection = httpURLConnection2;
            }
            if (z2) {
                a(this.f, this.g);
            }
            return z2;
        }
    }

    public void a(int i, int i2, byte[] bArr) {
        Q b;
        this.c = i;
        this.d = i2;
        this.e = bArr;
        Runnable runnable = this.m;
        if (runnable == null || (b = M.a().b()) == null) {
            return;
        }
        b.post(runnable);
    }
}
