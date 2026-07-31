package com.iab.omid.library.startio.internal;

import android.content.Context;
import com.iab.omid.library.startio.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.startio.utils.f f31a = new com.iab.omid.library.startio.utils.f();
    private Date b;
    private boolean c;
    private d d;
    private boolean e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        Iterator it = c.c().a().iterator();
        while (it.hasNext()) {
            ((com.iab.omid.library.startio.adsession.a) it.next()).d().a(b());
        }
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.c = true;
    }

    @Override // com.iab.omid.library.startio.internal.d.a
    public void a(boolean z) {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }

    public Date b() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a2 = this.f31a.a();
        Date date = this.b;
        if (date == null || a2.after(date)) {
            this.b = a2;
            c();
        }
    }
}
