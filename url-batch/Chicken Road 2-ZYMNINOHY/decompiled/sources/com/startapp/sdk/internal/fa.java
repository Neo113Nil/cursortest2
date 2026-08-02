package com.startapp.sdk.internal;

import java.util.UUID;

/* loaded from: classes.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public final sf f6909a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f6910b;

    public fa(sf sfVar) {
        this.f6909a = sfVar;
    }

    public final String a() {
        String str;
        String str2 = this.f6910b;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            try {
                str = this.f6910b;
                if (str == null) {
                    str = this.f6909a.getString("e695c6d894060903", null);
                    if (str == null) {
                        str = UUID.randomUUID().toString();
                        rf edit = this.f6909a.edit();
                        edit.a("e695c6d894060903", str);
                        edit.f7532a.putString("e695c6d894060903", str);
                        if (!edit.f7532a.commit()) {
                            str = "00000000-0000-0000-0000-000000000000";
                        }
                    }
                    this.f6910b = str;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
