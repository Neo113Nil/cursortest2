package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gb {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f5526d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    private final String f5527a = "ad.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    private final String[] f5528b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c, reason: collision with root package name */
    private final cb f5529c;

    @Deprecated
    public gb(cb cbVar) {
        this.f5529c = cbVar;
    }

    private final Uri g(Uri uri, String str) {
        String str2;
        Objects.requireNonNull(uri);
        try {
            try {
                if (uri.getHost().equals(this.f5527a)) {
                    if (uri.toString().contains("dc_ms=")) {
                        throw new hb("Parameter already exists: dc_ms");
                    }
                    String uri2 = uri.toString();
                    int indexOf = uri2.indexOf(";adurl");
                    if (indexOf != -1) {
                        int i7 = indexOf + 1;
                        str2 = uri2.substring(0, i7) + "dc_ms=" + str + ";" + uri2.substring(i7);
                    } else {
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        str2 = uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length());
                    }
                    return Uri.parse(str2);
                }
            } catch (UnsupportedOperationException unused) {
                throw new hb("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new hb("Query parameter already exists: ms");
        }
        String uri3 = uri.toString();
        int indexOf3 = uri3.indexOf("&adurl");
        if (indexOf3 == -1) {
            indexOf3 = uri3.indexOf("?adurl");
        }
        if (indexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i8 = indexOf3 + 1;
        return Uri.parse(uri3.substring(0, i8) + "ms=" + str + "&" + uri3.substring(i8));
    }

    @Deprecated
    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return g(uri, this.f5529c.g(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new hb("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    public final Uri b(Uri uri, Context context) {
        return g(uri, this.f5529c.d(context));
    }

    @Deprecated
    public final cb c() {
        return this.f5529c;
    }

    @Deprecated
    public final void d(MotionEvent motionEvent) {
        this.f5529c.a(motionEvent);
    }

    public final boolean e(Uri uri) {
        if (f(uri)) {
            String[] strArr = f5526d;
            for (int i7 = 0; i7 < 3; i7++) {
                if (uri.getPath().endsWith(strArr[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f5528b;
            for (int i7 = 0; i7 < 3; i7++) {
                if (host.endsWith(strArr[i7])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
