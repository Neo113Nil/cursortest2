package com.startapp.sdk.internal;

import java.util.UUID;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final af f333a;
    public volatile String b;

    public m9(af afVar) {
        this.f333a = afVar;
    }

    public final String a() {
        String str;
        String str2 = this.b;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            str = this.b;
            if (str == null) {
                str = this.f333a.getString("e695c6d894060903", null);
                if (str == null) {
                    str = UUID.randomUUID().toString();
                    ze edit = this.f333a.edit();
                    edit.a("e695c6d894060903", str);
                    edit.f526a.putString("e695c6d894060903", str);
                    if (!edit.f526a.commit()) {
                        str = "00000000-0000-0000-0000-000000000000";
                    }
                }
                this.b = str;
            }
        }
        return str;
    }
}
