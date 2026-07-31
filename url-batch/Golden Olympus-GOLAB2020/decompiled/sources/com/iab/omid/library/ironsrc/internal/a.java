package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f14529f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.ironsrc.utils.f f14530a = new com.iab.omid.library.ironsrc.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f14531b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14532c;

    /* renamed from: d, reason: collision with root package name */
    private d f14533d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14534e;

    private a(d dVar) {
        this.f14533d = dVar;
    }

    public static a a() {
        return f14529f;
    }

    private void c() {
        if (!this.f14532c || this.f14531b == null) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f14531b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a4 = this.f14530a.a();
        Date date = this.f14531b;
        if (date == null || a4.after(date)) {
            this.f14531b = a4;
            c();
        }
    }

    public void a(Context context) {
        if (this.f14532c) {
            return;
        }
        this.f14533d.a(context);
        this.f14533d.a(this);
        this.f14533d.e();
        this.f14534e = this.f14533d.c();
        this.f14532c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z4) {
        if (!this.f14534e && z4) {
            d();
        }
        this.f14534e = z4;
    }
}
