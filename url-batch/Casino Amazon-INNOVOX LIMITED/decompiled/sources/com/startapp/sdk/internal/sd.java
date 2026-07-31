package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class sd implements CookieStore {

    /* renamed from: a, reason: collision with root package name */
    public final CookieStore f423a;
    public final af b;

    public sd(Context context) {
        HttpCookie httpCookie;
        af afVar = new af(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.b = afVar;
        this.f423a = new CookieManager().getCookieStore();
        String string = afVar.getString("names", null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                String string2 = this.b.getString("cookie_" + str, null);
                if (string2 != null && (httpCookie = (HttpCookie) JsonParser.fromJson(string2, HttpCookie.class)) != null) {
                    if (httpCookie.hasExpired()) {
                        ze edit = this.b.edit();
                        edit.remove("cookie_".concat(httpCookie.getDomain() + "_" + httpCookie.getName()));
                        edit.apply();
                        a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f423a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    public final void a() {
        ze edit = this.b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie httpCookie : this.f423a.getCookies()) {
            hashSet.add(httpCookie.getDomain() + "_" + httpCookie.getName());
        }
        String join = TextUtils.join(";", hashSet);
        edit.a("names", join);
        edit.f526a.putString("names", join);
        edit.apply();
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
        String str = httpCookie.getDomain() + "_" + httpCookie.getName();
        this.f423a.add(uri, httpCookie);
        ze edit = this.b.edit();
        String concat = "cookie_".concat(str);
        String json = JsonParser.toJson(httpCookie);
        edit.a(concat, json);
        edit.f526a.putString(concat, json);
        edit.apply();
        a();
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) {
        return this.f423a.get(uri);
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        return this.f423a.getCookies();
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        return this.f423a.getURIs();
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f423a.remove(uri, httpCookie)) {
            return false;
        }
        ze edit = this.b.edit();
        edit.remove("cookie_".concat(httpCookie.getDomain() + "_" + httpCookie.getName()));
        edit.apply();
        a();
        return true;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        if (!this.f423a.removeAll()) {
            return false;
        }
        ze edit = this.b.edit();
        edit.clear();
        edit.apply();
        a();
        return true;
    }
}
