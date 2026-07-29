package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.e.m;
import java.util.Locale;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private Uri f2431a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f2432b;

    /* renamed from: c, reason: collision with root package name */
    private a f2433c;

    /* renamed from: d, reason: collision with root package name */
    private String f2434d;
    private int e;
    private int f;
    private int g;

    public enum a {
        Progressive,
        Streaming
    }

    private k() {
    }

    private static a a(String str) {
        if (com.applovin.impl.sdk.e.i.b(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public static k a(m mVar, com.applovin.impl.sdk.j jVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String c2 = mVar.c();
            if (!URLUtil.isValidUrl(c2)) {
                jVar.u().d("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri parse = Uri.parse(c2);
            k kVar = new k();
            kVar.f2431a = parse;
            kVar.f2432b = parse;
            kVar.g = com.applovin.impl.sdk.e.i.a(mVar.b().get("bitrate"));
            kVar.f2433c = a(mVar.b().get("delivery"));
            kVar.f = com.applovin.impl.sdk.e.i.a(mVar.b().get("height"));
            kVar.e = com.applovin.impl.sdk.e.i.a(mVar.b().get("width"));
            kVar.f2434d = mVar.b().get("type").toLowerCase(Locale.ENGLISH);
            return kVar;
        } catch (Throwable th) {
            jVar.u().b("VastVideoFile", "Error occurred while initializing", th);
            return null;
        }
    }

    public Uri a() {
        return this.f2431a;
    }

    public void a(Uri uri) {
        this.f2432b = uri;
    }

    public Uri b() {
        return this.f2432b;
    }

    public boolean c() {
        return this.f2433c == a.Streaming;
    }

    public String d() {
        return this.f2434d;
    }

    public int e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.e != kVar.e || this.f != kVar.f || this.g != kVar.g) {
            return false;
        }
        if (this.f2431a == null ? kVar.f2431a != null : !this.f2431a.equals(kVar.f2431a)) {
            return false;
        }
        if (this.f2432b == null ? kVar.f2432b != null : !this.f2432b.equals(kVar.f2432b)) {
            return false;
        }
        if (this.f2433c != kVar.f2433c) {
            return false;
        }
        return this.f2434d != null ? this.f2434d.equals(kVar.f2434d) : kVar.f2434d == null;
    }

    public int hashCode() {
        return ((((((((((((this.f2431a != null ? this.f2431a.hashCode() : 0) * 31) + (this.f2432b != null ? this.f2432b.hashCode() : 0)) * 31) + (this.f2433c != null ? this.f2433c.hashCode() : 0)) * 31) + (this.f2434d != null ? this.f2434d.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f2431a + ", videoUri=" + this.f2432b + ", deliveryType=" + this.f2433c + ", fileType='" + this.f2434d + "', width=" + this.e + ", height=" + this.f + ", bitrate=" + this.g + '}';
    }
}
