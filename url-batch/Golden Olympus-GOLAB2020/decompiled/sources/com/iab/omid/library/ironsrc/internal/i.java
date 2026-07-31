package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.internal.d;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i implements d.a, com.iab.omid.library.ironsrc.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f14554f;

    /* renamed from: a, reason: collision with root package name */
    private float f14555a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.e f14556b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.b f14557c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.devicevolume.d f14558d;

    /* renamed from: e, reason: collision with root package name */
    private c f14559e;

    public i(com.iab.omid.library.ironsrc.devicevolume.e eVar, com.iab.omid.library.ironsrc.devicevolume.b bVar) {
        this.f14556b = eVar;
        this.f14557c = bVar;
    }

    private c a() {
        if (this.f14559e == null) {
            this.f14559e = c.c();
        }
        return this.f14559e;
    }

    public static i c() {
        if (f14554f == null) {
            f14554f = new i(new com.iab.omid.library.ironsrc.devicevolume.e(), new com.iab.omid.library.ironsrc.devicevolume.b());
        }
        return f14554f;
    }

    public float b() {
        return this.f14555a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f14558d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f14558d.d();
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.c
    public void a(float f4) {
        this.f14555a = f4;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f4);
        }
    }

    public void a(Context context) {
        this.f14558d = this.f14556b.a(new Handler(), context, this.f14557c.a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z4) {
        if (z4) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
