package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f343a = new Object();
    public final af b;
    public volatile String c;
    public volatile String d;

    public n0(af afVar) {
        this.b = afVar;
    }

    public final boolean a(String str, String str2) {
        boolean z;
        if (str != null) {
            str = str.trim();
            if (str.isEmpty()) {
                str = null;
            }
        }
        if (str2 != null) {
            str2 = str2.trim();
            if (str2.isEmpty()) {
                str2 = null;
            }
        }
        synchronized (this.f343a) {
            if (zh.a((Object) this.c, (Object) str) && zh.a((Object) this.d, (Object) str2)) {
                z = false;
                this.c = str;
                this.d = str2;
                ze edit = this.b.edit();
                edit.a("c88d4eab540fab77", str);
                edit.f526a.putString("c88d4eab540fab77", str);
                edit.a("2696a7f502faed4b", str2);
                edit.f526a.putString("2696a7f502faed4b", str2);
                edit.f526a.commit();
            }
            z = true;
            this.c = str;
            this.d = str2;
            ze edit2 = this.b.edit();
            edit2.a("c88d4eab540fab77", str);
            edit2.f526a.putString("c88d4eab540fab77", str);
            edit2.a("2696a7f502faed4b", str2);
            edit2.f526a.putString("2696a7f502faed4b", str2);
            edit2.f526a.commit();
        }
        return z;
    }

    public final String a() {
        String str;
        String str2 = this.d;
        if (str2 != null) {
            return str2;
        }
        synchronized (this.f343a) {
            str = this.d;
            if (str == null && (str = this.b.getString("2696a7f502faed4b", null)) == null) {
                str = this.b.getString("31721150b470a3b9", null);
            }
        }
        return str;
    }
}
