package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7466a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final sf f7467b;

    /* renamed from: c, reason: collision with root package name */
    public volatile String f7468c;

    /* renamed from: d, reason: collision with root package name */
    public volatile String f7469d;

    public q0(sf sfVar) {
        this.f7467b = sfVar;
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
        synchronized (this.f7466a) {
            try {
                if (si.a((Object) this.f7468c, (Object) str) && si.a((Object) this.f7469d, (Object) str2)) {
                    z = false;
                    this.f7468c = str;
                    this.f7469d = str2;
                    rf edit = this.f7467b.edit();
                    edit.a("c88d4eab540fab77", str);
                    edit.f7532a.putString("c88d4eab540fab77", str);
                    edit.a("2696a7f502faed4b", str2);
                    edit.f7532a.putString("2696a7f502faed4b", str2);
                    edit.f7532a.commit();
                }
                z = true;
                this.f7468c = str;
                this.f7469d = str2;
                rf edit2 = this.f7467b.edit();
                edit2.a("c88d4eab540fab77", str);
                edit2.f7532a.putString("c88d4eab540fab77", str);
                edit2.a("2696a7f502faed4b", str2);
                edit2.f7532a.putString("2696a7f502faed4b", str2);
                edit2.f7532a.commit();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final String a() {
        String str;
        String str2 = this.f7469d;
        if (str2 != null) {
            return str2;
        }
        synchronized (this.f7466a) {
            try {
                str = this.f7469d;
                if (str == null && (str = this.f7467b.getString("2696a7f502faed4b", null)) == null) {
                    str = this.f7467b.getString("31721150b470a3b9", null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
