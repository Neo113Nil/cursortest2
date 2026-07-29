package com.chartboost.sdk.Libraries;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private a f3591a;

    /* renamed from: b, reason: collision with root package name */
    private final com.chartboost.sdk.e f3592b;

    /* renamed from: c, reason: collision with root package name */
    private String f3593c;

    /* renamed from: d, reason: collision with root package name */
    private float f3594d = 1.0f;

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        private final String f3596b;

        /* renamed from: c, reason: collision with root package name */
        private final File f3597c;
        private final f e;
        private int f = -1;
        private int g = -1;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap f3598d = null;

        /* renamed from: a, reason: collision with root package name */
        private int f3595a = 1;

        public a(String str, File file, f fVar) {
            this.f3597c = file;
            this.f3596b = str;
            this.e = fVar;
        }

        public Bitmap a() {
            if (this.f3598d == null) {
                b();
            }
            return this.f3598d;
        }

        public void b() {
            if (this.f3598d != null) {
                return;
            }
            CBLogging.a("MemoryBitmap", "Loading image '" + this.f3596b + "' from cache");
            byte[] a2 = this.e.a(this.f3597c);
            if (a2 == null) {
                CBLogging.b("MemoryBitmap", "decode() - bitmap not found");
                return;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(a2, 0, a2.length, options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inDither = false;
            options2.inPurgeable = true;
            options2.inInputShareable = true;
            options2.inTempStorage = new byte[32768];
            options2.inSampleSize = 1;
            while (options2.inSampleSize < 32) {
                try {
                    this.f3598d = BitmapFactory.decodeByteArray(a2, 0, a2.length, options2);
                } catch (Exception e) {
                    CBLogging.a("MemoryBitmap", "Exception raised decoding bitmap", e);
                    com.chartboost.sdk.Tracking.a.a(getClass(), "decodeByteArray", e);
                } catch (OutOfMemoryError e2) {
                    CBLogging.a("MemoryBitmap", "OutOfMemoryError suppressed - trying larger sample size", e2);
                    options2.inSampleSize *= 2;
                }
                if (this.f3598d == null) {
                    this.f3597c.delete();
                    throw new RuntimeException("Unable to decode " + this.f3596b);
                }
                this.f3595a = options2.inSampleSize;
            }
            this.f3595a = options2.inSampleSize;
        }

        public int c() {
            return this.f3595a;
        }

        public int d() {
            if (this.f3598d != null) {
                return this.f3598d.getWidth();
            }
            if (this.f >= 0) {
                return this.f;
            }
            f();
            return this.f;
        }

        public int e() {
            if (this.f3598d != null) {
                return this.f3598d.getHeight();
            }
            if (this.g >= 0) {
                return this.g;
            }
            f();
            return this.g;
        }

        private void f() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(this.f3597c.getAbsolutePath(), options);
                this.f = options.outWidth;
                this.g = options.outHeight;
            } catch (Exception e) {
                CBLogging.a("MemoryBitmap", "Error decoding file size", e);
                com.chartboost.sdk.Tracking.a.a(getClass(), "decodeSize", e);
            }
        }
    }

    public h(com.chartboost.sdk.e eVar) {
        this.f3592b = eVar;
    }

    public int a() {
        return this.f3591a.d() * this.f3591a.c();
    }

    public int b() {
        return this.f3591a.e() * this.f3591a.c();
    }

    public boolean a(String str) {
        return a(this.f3592b.g(), str);
    }

    public boolean a(JSONObject jSONObject, String str) {
        JSONObject a2 = e.a(jSONObject, str);
        this.f3593c = str;
        if (a2 == null) {
            return true;
        }
        String optString = a2.optString("url");
        this.f3594d = (float) a2.optDouble("scale", 1.0d);
        if (optString.isEmpty()) {
            return true;
        }
        String optString2 = a2.optString("checksum");
        if (optString2.isEmpty()) {
            return false;
        }
        this.f3591a = this.f3592b.e.j.a(optString2);
        return this.f3591a != null;
    }

    public boolean c() {
        return this.f3591a != null;
    }

    public Bitmap d() {
        if (this.f3591a != null) {
            return this.f3591a.a();
        }
        return null;
    }

    public float e() {
        return this.f3594d;
    }
}
