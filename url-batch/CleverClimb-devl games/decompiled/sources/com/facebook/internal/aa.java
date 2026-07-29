package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* compiled from: UrlRedirectCache.java */
/* loaded from: classes.dex */
class aa {

    /* renamed from: a, reason: collision with root package name */
    static final String f6050a = "aa";

    /* renamed from: b, reason: collision with root package name */
    private static final String f6051b = f6050a + "_Redirect";

    /* renamed from: c, reason: collision with root package name */
    private static volatile l f6052c;

    aa() {
    }

    static synchronized l a() throws IOException {
        l lVar;
        synchronized (aa.class) {
            if (f6052c == null) {
                f6052c = new l(f6050a, new l.d());
            }
            lVar = f6052c;
        }
        return lVar;
    }

    static Uri a(Uri uri) {
        Throwable th;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        boolean z;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        try {
            l a2 = a();
            inputStreamReader2 = null;
            z = false;
            while (true) {
                try {
                    InputStream a3 = a2.a(uri2, f6051b);
                    if (a3 == null) {
                        break;
                    }
                    z = true;
                    inputStreamReader = new InputStreamReader(a3);
                    try {
                        char[] cArr = new char[128];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int read = inputStreamReader.read(cArr, 0, cArr.length);
                            if (read <= 0) {
                                break;
                            }
                            sb.append(cArr, 0, read);
                        }
                        ab.a(inputStreamReader);
                        inputStreamReader2 = inputStreamReader;
                        uri2 = sb.toString();
                    } catch (IOException unused) {
                        ab.a(inputStreamReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        ab.a(inputStreamReader);
                        throw th;
                    }
                } catch (IOException unused2) {
                    inputStreamReader = inputStreamReader2;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = inputStreamReader2;
                }
            }
        } catch (IOException unused3) {
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
        }
        if (!z) {
            ab.a(inputStreamReader2);
            return null;
        }
        Uri parse = Uri.parse(uri2);
        ab.a(inputStreamReader2);
        return parse;
    }

    static void a(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            OutputStream b2 = a().b(uri.toString(), f6051b);
            try {
                b2.write(uri2.toString().getBytes());
                ab.a(b2);
            } catch (IOException unused) {
                outputStream = b2;
                ab.a(outputStream);
            } catch (Throwable th) {
                th = th;
                outputStream = b2;
                ab.a(outputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
