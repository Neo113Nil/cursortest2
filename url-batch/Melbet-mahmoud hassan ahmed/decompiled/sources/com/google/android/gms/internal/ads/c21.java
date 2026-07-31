package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c21 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    private final CookieManager f3702a;

    public c21(Context context) {
        this.f3702a = y2.t.r().l(context);
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final void a(Map<String, String> map) {
        if (this.f3702a == null) {
            return;
        }
        if (map.get("clear") == null) {
            String str = map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f3702a.setCookie((String) sw.c().b(m10.C0), str);
            return;
        }
        String str2 = (String) sw.c().b(m10.C0);
        String cookie = this.f3702a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List<String> f7 = z43.c(b43.b(';')).f(cookie);
        for (int i7 = 0; i7 < f7.size(); i7++) {
            CookieManager cookieManager = this.f3702a;
            Iterator<String> it = z43.c(b43.b('=')).d(f7.get(i7)).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(91);
                sb.append("position (0) must be less than the number of elements that remained (");
                sb.append(0);
                sb.append(")");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            String valueOf = String.valueOf(it.next());
            String valueOf2 = String.valueOf((String) sw.c().b(m10.f8289r0));
            cookieManager.setCookie(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }
}
