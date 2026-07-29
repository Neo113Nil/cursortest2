package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.R;
import com.facebook.internal.ae;
import com.facebook.internal.o;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageDownloader.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f6149a;

    /* renamed from: b, reason: collision with root package name */
    private static ae f6150b = new ae(8);

    /* renamed from: c, reason: collision with root package name */
    private static ae f6151c = new ae(2);

    /* renamed from: d, reason: collision with root package name */
    private static final Map<d, c> f6152d = new HashMap();

    public static void a(o oVar) {
        if (oVar == null) {
            return;
        }
        d dVar = new d(oVar.b(), oVar.e());
        synchronized (f6152d) {
            c cVar = f6152d.get(dVar);
            if (cVar != null) {
                cVar.f6163b = oVar;
                cVar.f6164c = false;
                cVar.f6162a.b();
            } else {
                a(oVar, dVar, oVar.d());
            }
        }
    }

    public static boolean b(o oVar) {
        boolean z;
        d dVar = new d(oVar.b(), oVar.e());
        synchronized (f6152d) {
            c cVar = f6152d.get(dVar);
            z = true;
            if (cVar == null) {
                z = false;
            } else if (cVar.f6162a.a()) {
                f6152d.remove(dVar);
            } else {
                cVar.f6164c = true;
            }
        }
        return z;
    }

    private static void a(o oVar, d dVar, boolean z) {
        a(oVar, dVar, f6151c, new a(oVar.a(), dVar, z));
    }

    private static void a(o oVar, d dVar) {
        a(oVar, dVar, f6150b, new b(oVar.a(), dVar));
    }

    private static void a(o oVar, d dVar, ae aeVar, Runnable runnable) {
        synchronized (f6152d) {
            c cVar = new c();
            cVar.f6163b = oVar;
            f6152d.put(dVar, cVar);
            cVar.f6162a = aeVar.a(runnable);
        }
    }

    private static void a(d dVar, final Exception exc, final Bitmap bitmap, final boolean z) {
        final o oVar;
        final o.b c2;
        c a2 = a(dVar);
        if (a2 == null || a2.f6164c || (c2 = (oVar = a2.f6163b).c()) == null) {
            return;
        }
        a().post(new Runnable() { // from class: com.facebook.internal.n.1
            @Override // java.lang.Runnable
            public void run() {
                c2.a(new p(o.this, exc, z, bitmap));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(d dVar, Context context, boolean z) {
        InputStream inputStream;
        Uri a2;
        boolean z2 = false;
        if (!z || (a2 = aa.a(dVar.f6165a)) == null) {
            inputStream = null;
        } else {
            inputStream = q.a(a2, context);
            if (inputStream != null) {
                z2 = true;
            }
        }
        if (!z2) {
            inputStream = q.a(dVar.f6165a, context);
        }
        if (inputStream != null) {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            ab.a((Closeable) inputStream);
            a(dVar, (Exception) null, decodeStream, z2);
        } else {
            c a3 = a(dVar);
            if (a3 == null || a3.f6164c) {
                return;
            }
            a(a3.f6163b, dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.facebook.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(d dVar, Context context) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream a2;
        Bitmap decodeStream;
        InputStream inputStream2 = null;
        r0 = null;
        IOException iOException = null;
        inputStream2 = null;
        Bitmap bitmap = null;
        boolean z = true;
        try {
            httpURLConnection = (HttpURLConnection) new URL(dVar.f6165a.toString()).openConnection();
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        switch (responseCode) {
                            case 301:
                            case 302:
                                try {
                                    String headerField = httpURLConnection.getHeaderField(GooglePlayServicesInterstitial.LOCATION_KEY);
                                    if (!ab.a(headerField)) {
                                        Uri parse = Uri.parse(headerField);
                                        aa.a(dVar.f6165a, parse);
                                        c a3 = a(dVar);
                                        if (a3 != null && !a3.f6164c) {
                                            a(a3.f6163b, new d(parse, dVar.f6166b), false);
                                        }
                                    }
                                    a2 = null;
                                    decodeStream = null;
                                    z = false;
                                    break;
                                } catch (IOException e) {
                                    e = e;
                                    inputStream = null;
                                    z = false;
                                    ab.a((Closeable) inputStream);
                                    ab.a(httpURLConnection);
                                    if (z) {
                                    }
                                }
                                break;
                            default:
                                inputStream = httpURLConnection.getErrorStream();
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    if (inputStream != null) {
                                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                                        char[] cArr = new char[128];
                                        while (true) {
                                            int read = inputStreamReader.read(cArr, 0, cArr.length);
                                            if (read > 0) {
                                                sb.append(cArr, 0, read);
                                            } else {
                                                ab.a(inputStreamReader);
                                            }
                                        }
                                    } else {
                                        sb.append(context.getString(R.string.com_facebook_image_download_unknown_error));
                                    }
                                    iOException = new com.facebook.j(sb.toString());
                                    a2 = inputStream;
                                    decodeStream = null;
                                    break;
                                } catch (IOException e2) {
                                    e = e2;
                                    ab.a((Closeable) inputStream);
                                    ab.a(httpURLConnection);
                                    if (z) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream2 = inputStream;
                                    ab.a((Closeable) inputStream2);
                                    ab.a(httpURLConnection);
                                    throw th;
                                }
                                break;
                        }
                    } else {
                        a2 = q.a(context, httpURLConnection);
                        try {
                            decodeStream = BitmapFactory.decodeStream(a2);
                        } catch (IOException e3) {
                            inputStream = a2;
                            e = e3;
                            ab.a((Closeable) inputStream);
                            ab.a(httpURLConnection);
                            if (z) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream2 = a2;
                            ab.a((Closeable) inputStream2);
                            ab.a(httpURLConnection);
                            throw th;
                        }
                    }
                    ab.a((Closeable) a2);
                    ab.a(httpURLConnection);
                    e = iOException;
                    bitmap = decodeStream;
                } catch (IOException e4) {
                    e = e4;
                    inputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
        if (z) {
            return;
        }
        a(dVar, (Exception) e, bitmap, false);
    }

    private static synchronized Handler a() {
        Handler handler;
        synchronized (n.class) {
            if (f6149a == null) {
                f6149a = new Handler(Looper.getMainLooper());
            }
            handler = f6149a;
        }
        return handler;
    }

    private static c a(d dVar) {
        c remove;
        synchronized (f6152d) {
            remove = f6152d.remove(dVar);
        }
        return remove;
    }

    /* compiled from: ImageDownloader.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        Uri f6165a;

        /* renamed from: b, reason: collision with root package name */
        Object f6166b;

        d(Uri uri, Object obj) {
            this.f6165a = uri;
            this.f6166b = obj;
        }

        public int hashCode() {
            return ((1073 + this.f6165a.hashCode()) * 37) + this.f6166b.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f6165a == this.f6165a && dVar.f6166b == this.f6166b;
        }
    }

    /* compiled from: ImageDownloader.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        ae.a f6162a;

        /* renamed from: b, reason: collision with root package name */
        o f6163b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6164c;

        private c() {
        }
    }

    /* compiled from: ImageDownloader.java */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Context f6157a;

        /* renamed from: b, reason: collision with root package name */
        private d f6158b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6159c;

        a(Context context, d dVar, boolean z) {
            this.f6157a = context;
            this.f6158b = dVar;
            this.f6159c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.b(this.f6158b, this.f6157a, this.f6159c);
        }
    }

    /* compiled from: ImageDownloader.java */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Context f6160a;

        /* renamed from: b, reason: collision with root package name */
        private d f6161b;

        b(Context context, d dVar) {
            this.f6160a = context;
            this.f6161b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.b(this.f6161b, this.f6160a);
        }
    }
}
