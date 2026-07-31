package com.iab.omid.library.startio.attestation;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c {
    private static final Map d = new HashMap();
    private static volatile c e;

    /* renamed from: a, reason: collision with root package name */
    private final d f19a = new d();
    private final Context b;
    private volatile List c;

    private c(Context context) {
        this.b = context != null ? context.getApplicationContext() : null;
        c();
    }

    public static c a(Context context) {
        if (e == null) {
            synchronized (c.class) {
                if (e == null) {
                    e = new c(context);
                }
            }
        }
        return e;
    }

    private void c() {
        d.put("FireTVFOSDAT", j.a(this.b));
    }

    public final List a() {
        b a2;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : d.entrySet()) {
                    if (((k) entry.getValue()).a() && (a2 = this.f19a.a((String) entry.getKey(), this.b)) != null) {
                        arrayList.add(a2);
                    }
                }
                this.c = arrayList;
                return this.c;
            } catch (Exception e2) {
                com.iab.omid.library.startio.utils.d.a("Error getting supported attestation mechanisms", e2);
                this.c = new ArrayList();
                return this.c;
            }
        }
    }

    public final boolean a(String str) {
        k kVar = (k) d.get(str);
        if (kVar != null) {
            return kVar.a();
        }
        return false;
    }

    public final boolean b() {
        return a().size() > 0;
    }
}
