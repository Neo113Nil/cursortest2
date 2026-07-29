package com.ironsource.sdk.f;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PointerIconCompat;
import android.text.TextUtils;
import com.ironsource.sdk.data.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.Callable;

/* compiled from: DownloadManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static a f7182b;

    /* renamed from: a, reason: collision with root package name */
    private HandlerC0377a f7183a = a();

    /* renamed from: c, reason: collision with root package name */
    private Thread f7184c;

    /* renamed from: d, reason: collision with root package name */
    private String f7185d;

    /* compiled from: DownloadManager.java */
    public interface c {
        void a(f fVar);

        void b(f fVar);
    }

    private a(String str) {
        this.f7185d = str;
        com.ironsource.sdk.g.d.c(this.f7185d, "temp");
        com.ironsource.sdk.g.d.a(this.f7185d, "temp");
    }

    public static synchronized a a(String str) {
        a aVar;
        synchronized (a.class) {
            if (f7182b == null) {
                f7182b = new a(str);
            }
            aVar = f7182b;
        }
        return aVar;
    }

    /* compiled from: DownloadManager.java */
    /* renamed from: com.ironsource.sdk.f.a$a, reason: collision with other inner class name */
    static class HandlerC0377a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        c f7186a;

        HandlerC0377a() {
        }

        void a(c cVar) {
            if (cVar == null) {
                throw new IllegalArgumentException();
            }
            this.f7186a = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW /* 1016 */:
                    this.f7186a.a((f) message.obj);
                    break;
                case PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW /* 1017 */:
                    this.f7186a.b((f) message.obj);
                    break;
            }
        }

        public void a() {
            this.f7186a = null;
        }
    }

    HandlerC0377a a() {
        return new HandlerC0377a();
    }

    public void a(c cVar) {
        this.f7183a.a(cVar);
    }

    public void b() {
        f7182b = null;
        this.f7183a.a();
        this.f7183a = null;
    }

    public void a(f fVar) {
        new Thread(new e(fVar, this.f7183a, this.f7185d, d())).start();
    }

    public void b(f fVar) {
        this.f7184c = new Thread(new e(fVar, this.f7183a, this.f7185d, d()));
        this.f7184c.start();
    }

    public boolean c() {
        return this.f7184c != null && this.f7184c.isAlive();
    }

    /* compiled from: DownloadManager.java */
    static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Handler f7194a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7195b;

        /* renamed from: c, reason: collision with root package name */
        private String f7196c;

        /* renamed from: d, reason: collision with root package name */
        private String f7197d;
        private String e;
        private long f = b();
        private String g;

        e(f fVar, Handler handler, String str, String str2) {
            this.f7196c = fVar.a();
            this.f7197d = fVar.b();
            this.e = a(this.f7196c);
            this.g = str;
            this.f7194a = handler;
            this.f7195b = str2;
        }

        String a(String str) {
            return com.ironsource.sdk.g.f.a(this.f7196c);
        }

        b a(String str, String str2, String str3, long j, String str4) {
            return new b(str, str2, str3, j, str4);
        }

        Message a() {
            return new Message();
        }

        String a(String str, String str2) {
            return com.ironsource.sdk.g.d.a(str, str2);
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = new f(this.e, this.f7197d);
            Message a2 = a();
            a2.obj = fVar;
            String a3 = a(this.g, this.f7197d);
            if (a3 == null) {
                a2.what = PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW;
                fVar.a("unable_to_create_folder");
                this.f7194a.sendMessage(a2);
                return;
            }
            int i = a(this.f7196c, a3, fVar.a(), this.f, this.f7195b).call().f7192b;
            if (i != 200) {
                if (i != 404) {
                    switch (i) {
                        case 1004:
                        case 1005:
                        case PointerIconCompat.TYPE_CELL /* 1006 */:
                            break;
                        default:
                            switch (i) {
                                case PointerIconCompat.TYPE_TEXT /* 1008 */:
                                case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                                case PointerIconCompat.TYPE_COPY /* 1011 */:
                                    break;
                                default:
                                    switch (i) {
                                    }
                            }
                    }
                }
                String a4 = a(i);
                a2.what = PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW;
                fVar.a(a4);
                this.f7194a.sendMessage(a2);
                return;
            }
            a2.what = PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW;
            this.f7194a.sendMessage(a2);
        }

        String a(int i) {
            String str = "not defined message for " + i;
            if (i != 404) {
                switch (i) {
                    case 1004:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case PointerIconCompat.TYPE_CELL /* 1006 */:
                        return "http empty response";
                    default:
                        switch (i) {
                            case PointerIconCompat.TYPE_TEXT /* 1008 */:
                                return "socket timeout exception";
                            case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                                return "io exception";
                            case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                                return "uri syntax exception";
                            case PointerIconCompat.TYPE_COPY /* 1011 */:
                                return "http error code";
                            default:
                                switch (i) {
                                    case PointerIconCompat.TYPE_ZOOM_IN /* 1018 */:
                                        return "file not found exception";
                                    case PointerIconCompat.TYPE_ZOOM_OUT /* 1019 */:
                                        return "out of memory exception";
                                    default:
                                        return str;
                                }
                        }
                }
            }
            return "http not found";
        }

        public long b() {
            return Long.parseLong(com.ironsource.sdk.g.c.a().b());
        }
    }

    /* compiled from: DownloadManager.java */
    static class b implements Callable<d> {

        /* renamed from: a, reason: collision with root package name */
        private String f7187a;

        /* renamed from: b, reason: collision with root package name */
        private String f7188b;

        /* renamed from: c, reason: collision with root package name */
        private String f7189c;

        /* renamed from: d, reason: collision with root package name */
        private long f7190d;
        private String e;

        public b(String str, String str2, String str3, long j, String str4) {
            this.f7187a = str;
            this.f7188b = str2;
            this.f7189c = str3;
            this.f7190d = j;
            this.e = str4;
        }

        int a(byte[] bArr, String str) throws Exception {
            return com.ironsource.sdk.g.d.a(bArr, str);
        }

        boolean a(String str, String str2) throws Exception {
            return com.ironsource.sdk.g.d.e(str, str2);
        }

        byte[] a(InputStream inputStream) throws IOException {
            return a.a(inputStream);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d call() {
            int i;
            if (this.f7190d == 0) {
                this.f7190d = 1L;
            }
            d dVar = null;
            for (int i2 = 0; i2 < this.f7190d && ((i = (dVar = a(this.f7187a, i2)).f7192b) == 1008 || i == 1009); i2++) {
            }
            if (dVar != null && dVar.f7193c != null) {
                String str = this.f7188b + File.separator + this.f7189c;
                String str2 = this.e + File.separator + "tmp_" + this.f7189c;
                try {
                    if (a(dVar.f7193c, str2) == 0) {
                        dVar.f7192b = PointerIconCompat.TYPE_CELL;
                    } else if (!a(str2, str)) {
                        dVar.f7192b = PointerIconCompat.TYPE_GRAB;
                    }
                } catch (FileNotFoundException unused) {
                    dVar.f7192b = PointerIconCompat.TYPE_ZOOM_IN;
                } catch (Error e) {
                    if (!TextUtils.isEmpty(e.getMessage())) {
                        com.ironsource.sdk.g.e.a("DownloadManager", e.getMessage());
                    }
                    dVar.f7192b = PointerIconCompat.TYPE_ZOOM_OUT;
                } catch (Exception e2) {
                    if (!TextUtils.isEmpty(e2.getMessage())) {
                        com.ironsource.sdk.g.e.a("DownloadManager", e2.getMessage());
                    }
                    dVar.f7192b = PointerIconCompat.TYPE_VERTICAL_TEXT;
                }
            }
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0125, code lost:
        
            if (r3 == null) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x015a, code lost:
        
            r0.f7191a = r8;
            r0.f7192b = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0157, code lost:
        
            r3.disconnect();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
        
            if (r3 == null) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0135, code lost:
        
            if (r3 == null) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0145, code lost:
        
            if (r3 == null) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0100, code lost:
        
            if (r3 == null) goto L121;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        d a(String str, int i) {
            HttpURLConnection httpURLConnection;
            int i2;
            InputStream inputStream;
            d dVar = new d();
            if (TextUtils.isEmpty(str)) {
                dVar.f7191a = str;
                dVar.f7192b = PointerIconCompat.TYPE_CROSSHAIR;
                return dVar;
            }
            InputStream inputStream2 = null;
            int i3 = 0;
            try {
                try {
                    URL url = new URL(str);
                    url.toURI();
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        try {
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setConnectTimeout(5000);
                            httpURLConnection.setReadTimeout(5000);
                            httpURLConnection.connect();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 400) {
                                responseCode = PointerIconCompat.TYPE_COPY;
                            } else {
                                try {
                                    inputStream = httpURLConnection.getInputStream();
                                } catch (Exception e) {
                                    e = e;
                                } catch (Throwable th) {
                                    th = th;
                                    i3 = responseCode;
                                }
                                try {
                                    dVar.f7193c = a(inputStream);
                                    inputStream2 = inputStream;
                                } catch (FileNotFoundException unused) {
                                    inputStream2 = inputStream;
                                    i2 = PointerIconCompat.TYPE_ZOOM_IN;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                } catch (Error e3) {
                                    e = e3;
                                    inputStream2 = inputStream;
                                    if (!TextUtils.isEmpty(e.getMessage())) {
                                        com.ironsource.sdk.g.e.a("DownloadManager", e.getMessage());
                                    }
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    dVar.f7191a = str;
                                    dVar.f7192b = PointerIconCompat.TYPE_ZOOM_OUT;
                                    return dVar;
                                } catch (MalformedURLException unused2) {
                                    inputStream2 = inputStream;
                                    i2 = 1004;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                } catch (SocketTimeoutException unused3) {
                                    inputStream2 = inputStream;
                                    i2 = PointerIconCompat.TYPE_TEXT;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e6) {
                                            e6.printStackTrace();
                                        }
                                    }
                                } catch (URISyntaxException unused4) {
                                    inputStream2 = inputStream;
                                    i2 = PointerIconCompat.TYPE_ALIAS;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e7) {
                                            e7.printStackTrace();
                                        }
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    inputStream2 = inputStream;
                                    if (!TextUtils.isEmpty(e.getMessage())) {
                                        com.ironsource.sdk.g.e.a("DownloadManager", e.getMessage());
                                    }
                                    i2 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e9) {
                                            e9.printStackTrace();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    i3 = responseCode;
                                    inputStream2 = inputStream;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    dVar.f7191a = str;
                                    dVar.f7192b = i3;
                                    throw th;
                                }
                            }
                            if (responseCode != 200) {
                                com.ironsource.sdk.g.e.a("DownloadManager", " RESPONSE CODE: " + responseCode + " URL: " + str + " ATTEMPT: " + i);
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            dVar.f7191a = str;
                            dVar.f7192b = responseCode;
                        } catch (Exception e12) {
                            e = e12;
                        }
                    } catch (FileNotFoundException unused5) {
                    } catch (Error e13) {
                        e = e13;
                    } catch (MalformedURLException unused6) {
                    } catch (SocketTimeoutException unused7) {
                    } catch (URISyntaxException unused8) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException unused9) {
                httpURLConnection = null;
            } catch (Error e14) {
                e = e14;
                httpURLConnection = null;
            } catch (MalformedURLException unused10) {
                httpURLConnection = null;
            } catch (SocketTimeoutException unused11) {
                httpURLConnection = null;
            } catch (URISyntaxException unused12) {
                httpURLConnection = null;
            } catch (Exception e15) {
                e = e15;
                httpURLConnection = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
            }
            return dVar;
        }
    }

    String d() {
        return this.f7185d + File.separator + "temp";
    }

    static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* compiled from: DownloadManager.java */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f7191a;

        /* renamed from: b, reason: collision with root package name */
        int f7192b;

        /* renamed from: c, reason: collision with root package name */
        byte[] f7193c;

        d() {
        }
    }
}
