package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.internal.j.a;
import java.util.Map;

/* loaded from: classes.dex */
class h extends a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f4890d = "h";
    private final Uri e;
    private final Map<String, String> f;

    h(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str);
        this.e = uri;
        this.f = map;
    }

    @Override // com.facebook.ads.internal.a.a
    public a.EnumC0346a a() {
        return null;
    }

    @Override // com.facebook.ads.internal.a.a
    public void b() {
        com.facebook.ads.internal.m.e eVar = com.facebook.ads.internal.m.e.IMMEDIATE;
        String queryParameter = this.e.getQueryParameter("priority");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                eVar = com.facebook.ads.internal.m.e.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.f4877b.a(this.f4878c, this.f, this.e.getQueryParameter("type"), eVar);
    }
}
