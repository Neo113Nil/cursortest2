package com.startapp.sdk.internal;

import E1.AbstractC0033i;
import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class ge implements CookieStore {

    /* renamed from: a, reason: collision with root package name */
    public final CookieStore f3866a;

    /* renamed from: b, reason: collision with root package name */
    public final sf f3867b;

    public ge(Context context) {
        HttpCookie httpCookie;
        sf sfVar = new sf(context.getSharedPreferences("com.startapp.android.publish.CookiePrefsFile", 0));
        this.f3867b = sfVar;
        this.f3866a = new CookieManager().getCookieStore();
        String string = sfVar.getString("names", null);
        if (string != null) {
            for (String str : TextUtils.split(string, ";")) {
                String string2 = this.f3867b.getString("cookie_" + str, null);
                if (string2 != null && (httpCookie = (HttpCookie) JsonParser.fromJson(string2, HttpCookie.class)) != null) {
                    if (httpCookie.hasExpired()) {
                        rf edit = this.f3867b.edit();
                        StringBuilder sb = new StringBuilder("cookie_");
                        sb.append(httpCookie.getDomain() + "_" + httpCookie.getName());
                        edit.remove(sb.toString());
                        edit.apply();
                        a();
                    } else if (httpCookie.getDomain() != null) {
                        this.f3866a.add(URI.create(httpCookie.getDomain()), httpCookie);
                    }
                }
            }
        }
    }

    public final void a() {
        rf edit = this.f3867b.edit();
        HashSet hashSet = new HashSet();
        for (HttpCookie httpCookie : this.f3866a.getCookies()) {
            hashSet.add(httpCookie.getDomain() + "_" + httpCookie.getName());
        }
        String join = TextUtils.join(";", hashSet);
        edit.a("names", join);
        edit.f4395a.putString("names", join);
        edit.apply();
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
        String str = httpCookie.getDomain() + "_" + httpCookie.getName();
        this.f3866a.add(uri, httpCookie);
        rf edit = this.f3867b.edit();
        String j3 = AbstractC0033i.j("cookie_", str);
        String json = JsonParser.toJson(httpCookie);
        edit.a(j3, json);
        edit.f4395a.putString(j3, json);
        edit.apply();
        a();
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) {
        return this.f3866a.get(uri);
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        return this.f3866a.getCookies();
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        return this.f3866a.getURIs();
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        if (!this.f3866a.remove(uri, httpCookie)) {
            return false;
        }
        rf edit = this.f3867b.edit();
        StringBuilder sb = new StringBuilder("cookie_");
        sb.append(httpCookie.getDomain() + "_" + httpCookie.getName());
        edit.remove(sb.toString());
        edit.apply();
        a();
        return true;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        if (!this.f3866a.removeAll()) {
            return false;
        }
        rf edit = this.f3867b.edit();
        edit.clear();
        edit.apply();
        a();
        return true;
    }
}
