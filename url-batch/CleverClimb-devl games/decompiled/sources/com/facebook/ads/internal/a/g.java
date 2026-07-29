package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.j.a;
import java.util.Map;

/* loaded from: classes.dex */
class g extends a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4889d = "g";
    private final Uri e;
    private final Map<String, String> f;

    g(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str);
        this.e = uri;
        this.f = map;
    }

    @Override // com.facebook.ads.internal.a.a
    public a.EnumC0346a a() {
        return a.EnumC0346a.OPEN_LINK;
    }

    @Override // com.facebook.ads.internal.a.a
    public void b() {
        a(this.f);
        try {
            com.facebook.ads.internal.q.c.g.a(new com.facebook.ads.internal.q.c.g(), this.f4876a, Uri.parse(this.e.getQueryParameter("link")), this.f4878c);
        } catch (Exception e) {
            Log.d(f4889d, "Failed to open link url: " + this.e.toString(), e);
        }
    }
}
