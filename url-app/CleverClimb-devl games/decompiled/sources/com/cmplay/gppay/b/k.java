package com.cmplay.gppay.b;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class k implements h {

    /* renamed from: a, reason: collision with root package name */
    private long f4145a;

    /* renamed from: b, reason: collision with root package name */
    private long f4146b;

    /* renamed from: c, reason: collision with root package name */
    private long f4147c;

    /* renamed from: d, reason: collision with root package name */
    private long f4148d;
    private long e = 0;
    private int f;
    private i g;

    public k(Context context, g gVar) {
        this.g = new i(context.getSharedPreferences("com.google.android.vending.licensing.ServerManagedPolicy", 0), gVar);
        this.f = Integer.parseInt(this.g.b("lastResponse", Integer.toString(291)));
        this.f4145a = Long.parseLong(this.g.b("validityTimestamp", "0"));
        this.f4146b = Long.parseLong(this.g.b("retryUntil", "0"));
        this.f4147c = Long.parseLong(this.g.b("maxRetries", "0"));
        this.f4148d = Long.parseLong(this.g.b("retryCount", "0"));
    }

    private void a(int i) {
        this.e = System.currentTimeMillis();
        this.f = i;
        this.g.a("lastResponse", Integer.toString(i));
    }

    private void a(long j) {
        this.f4148d = j;
        this.g.a("retryCount", Long.toString(j));
    }

    private void a(String str) {
        Long valueOf;
        try {
            valueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
            valueOf = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(valueOf.longValue());
        }
        this.f4145a = valueOf.longValue();
        this.g.a("validityTimestamp", str);
    }

    private void b(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
            str = "0";
            l = 0L;
        }
        this.f4146b = l.longValue();
        this.g.a("retryUntil", str);
    }

    private void c(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
            str = "0";
            l = 0L;
        }
        this.f4147c = l.longValue();
        this.g.a("maxRetries", str);
    }

    private Map<String, String> d(String str) {
        HashMap hashMap = new HashMap();
        try {
            com.cmplay.gppay.b.a.c.a(new URI("?" + str), hashMap);
        } catch (URISyntaxException unused) {
            Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return hashMap;
    }

    @Override // com.cmplay.gppay.b.h
    public void a(int i, j jVar) {
        String str;
        a(i != 291 ? 0L : this.f4148d + 1);
        if (i != 256) {
            if (i == 561) {
                a("0");
                b("0");
                str = "0";
            }
            a(i);
            this.g.a();
        }
        Map<String, String> d2 = d(jVar.g);
        this.f = i;
        a(d2.get("VT"));
        b(d2.get("GT"));
        str = d2.get("GR");
        c(str);
        a(i);
        this.g.a();
    }

    @Override // com.cmplay.gppay.b.h
    public boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f == 256) {
            return currentTimeMillis <= this.f4145a;
        }
        if (this.f != 291 || currentTimeMillis >= this.e + 60000) {
            return false;
        }
        return currentTimeMillis <= this.f4146b || this.f4148d <= this.f4147c;
    }
}
