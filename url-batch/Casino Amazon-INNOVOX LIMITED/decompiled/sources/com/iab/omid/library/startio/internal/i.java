package com.iab.omid.library.startio.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.startio.internal.d;
import com.iab.omid.library.startio.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class i implements com.iab.omid.library.startio.devicevolume.c, d.a {
    private static i f;

    /* renamed from: a, reason: collision with root package name */
    private float f39a = 0.0f;
    private final com.iab.omid.library.startio.devicevolume.e b;
    private final com.iab.omid.library.startio.devicevolume.b c;
    private com.iab.omid.library.startio.devicevolume.d d;
    private c e;

    public i(com.iab.omid.library.startio.devicevolume.e eVar, com.iab.omid.library.startio.devicevolume.b bVar) {
        this.b = eVar;
        this.c = bVar;
    }

    private c a() {
        if (this.e == null) {
            this.e = c.c();
        }
        return this.e;
    }

    public static i c() {
        if (f == null) {
            f = new i(new com.iab.omid.library.startio.devicevolume.e(), new com.iab.omid.library.startio.devicevolume.b());
        }
        return f;
    }

    @Override // com.iab.omid.library.startio.devicevolume.c
    public void a(float f2) {
        this.f39a = f2;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((com.iab.omid.library.startio.adsession.a) it.next()).d().a(f2);
        }
    }

    public void a(Context context) {
        this.d = this.b.a(new Handler(), context, this.c.a(), this);
    }

    @Override // com.iab.omid.library.startio.internal.d.a
    public void a(boolean z) {
        if (z) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }

    public float b() {
        return this.f39a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.d.c();
    }
}
