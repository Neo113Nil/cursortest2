package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.e.m;
import com.mopub.mobileads.VastResourceXmlManager;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private a f2406a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f2407b;

    /* renamed from: c, reason: collision with root package name */
    private String f2408c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private e() {
    }

    static e a(m mVar, e eVar, com.applovin.impl.sdk.j jVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (eVar == null) {
            try {
                eVar = new e();
            } catch (Throwable th) {
                jVar.u().b("VastNonVideoResource", "Error occurred while initializing", th);
                return null;
            }
        }
        if (eVar.f2407b == null && !com.applovin.impl.sdk.e.i.b(eVar.f2408c)) {
            String a2 = a(mVar, VastResourceXmlManager.STATIC_RESOURCE);
            if (URLUtil.isValidUrl(a2)) {
                eVar.f2407b = Uri.parse(a2);
                eVar.f2406a = a.STATIC;
                return eVar;
            }
            String a3 = a(mVar, VastResourceXmlManager.IFRAME_RESOURCE);
            if (com.applovin.impl.sdk.e.i.b(a3)) {
                eVar.f2406a = a.IFRAME;
                if (URLUtil.isValidUrl(a3)) {
                    eVar.f2407b = Uri.parse(a3);
                } else {
                    eVar.f2408c = a3;
                }
                return eVar;
            }
            String a4 = a(mVar, VastResourceXmlManager.HTML_RESOURCE);
            if (com.applovin.impl.sdk.e.i.b(a4)) {
                eVar.f2406a = a.HTML;
                if (URLUtil.isValidUrl(a4)) {
                    eVar.f2407b = Uri.parse(a4);
                } else {
                    eVar.f2408c = a4;
                }
            }
        }
        return eVar;
    }

    private static String a(m mVar, String str) {
        m b2 = mVar.b(str);
        if (b2 != null) {
            return b2.c();
        }
        return null;
    }

    public a a() {
        return this.f2406a;
    }

    public void a(Uri uri) {
        this.f2407b = uri;
    }

    public void a(String str) {
        this.f2408c = str;
    }

    public Uri b() {
        return this.f2407b;
    }

    public String c() {
        return this.f2408c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f2406a != eVar.f2406a) {
            return false;
        }
        if (this.f2407b == null ? eVar.f2407b == null : this.f2407b.equals(eVar.f2407b)) {
            return this.f2408c != null ? this.f2408c.equals(eVar.f2408c) : eVar.f2408c == null;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f2406a != null ? this.f2406a.hashCode() : 0) * 31) + (this.f2407b != null ? this.f2407b.hashCode() : 0)) * 31) + (this.f2408c != null ? this.f2408c.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f2406a + ", resourceUri=" + this.f2407b + ", resourceContents='" + this.f2408c + "'}";
    }
}
