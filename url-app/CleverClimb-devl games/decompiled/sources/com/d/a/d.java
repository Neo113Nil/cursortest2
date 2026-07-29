package com.d.a;

import android.os.Handler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: FetchCallRunnable.java */
/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.d.a.d.b f4442a;

    /* renamed from: b, reason: collision with root package name */
    private final com.d.a.a.a<String> f4443b;

    /* renamed from: c, reason: collision with root package name */
    private final a f4444c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f4445d;
    private volatile boolean e;
    private HttpURLConnection f;
    private InputStream g;
    private BufferedReader h;
    private String i;

    /* compiled from: FetchCallRunnable.java */
    interface a {
        void a(com.d.a.d.b bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        int responseCode;
        try {
            try {
                a();
                this.f.connect();
                responseCode = this.f.getResponseCode();
            } catch (Exception e) {
                e.printStackTrace();
                final int a2 = b.a(e.getMessage());
                if (!d()) {
                    this.f4445d.post(new Runnable() { // from class: com.d.a.d.2
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.f4443b.a(a2, d.this.f4442a);
                        }
                    });
                }
            }
            if (responseCode == 200) {
                if (d()) {
                    throw new com.d.a.b.a("DIE", -118);
                }
                this.g = this.f.getInputStream();
                this.i = b();
                if (!d()) {
                    this.f4445d.post(new Runnable() { // from class: com.d.a.d.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.this.f4443b.a((com.d.a.a.a) d.this.i, d.this.f4442a);
                        }
                    });
                }
                return;
            }
            throw new IllegalStateException("SSRV:" + responseCode);
        } finally {
            c();
            this.f4444c.a(this.f4442a);
        }
    }

    private void a() throws IOException {
        this.f = (HttpURLConnection) new URL(this.f4442a.a()).openConnection();
        this.f.setRequestMethod("GET");
        this.f.setReadTimeout(15000);
        this.f.setConnectTimeout(10000);
        this.f.setUseCaches(true);
        this.f.setDefaultUseCaches(true);
        this.f.setInstanceFollowRedirects(true);
        this.f.setDoInput(true);
        for (com.d.a.d.a aVar : this.f4442a.c()) {
            this.f.addRequestProperty(aVar.a(), aVar.b());
        }
    }

    private String b() throws IOException {
        StringBuilder sb = new StringBuilder();
        this.h = new BufferedReader(new InputStreamReader(this.g));
        while (true) {
            String readLine = this.h.readLine();
            if (readLine == null || d()) {
                break;
            }
            sb.append(readLine);
        }
        if (d()) {
            return null;
        }
        return sb.toString();
    }

    private void c() {
        try {
            if (this.g != null) {
                this.g.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (this.h != null) {
                this.h.close();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (this.f != null) {
            this.f.disconnect();
        }
    }

    private boolean d() {
        return this.e;
    }
}
