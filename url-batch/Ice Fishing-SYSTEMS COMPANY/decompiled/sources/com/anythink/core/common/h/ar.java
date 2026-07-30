package com.anythink.core.common.h;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    public String f13702a;

    /* renamed from: c, reason: collision with root package name */
    public int f13704c;

    /* renamed from: d, reason: collision with root package name */
    public com.anythink.core.common.d.c f13705d;

    /* renamed from: e, reason: collision with root package name */
    public com.anythink.core.common.n f13706e;

    /* renamed from: f, reason: collision with root package name */
    public ATAdMultipleLoadedListener f13707f;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, Object> f13708g;

    /* renamed from: h, reason: collision with root package name */
    public int f13709h;
    public d i;

    /* renamed from: l, reason: collision with root package name */
    public ATAdxBidFloorInfo f13712l;

    /* renamed from: m, reason: collision with root package name */
    public final h f13713m;

    /* renamed from: p, reason: collision with root package name */
    private Context f13716p;

    /* renamed from: q, reason: collision with root package name */
    private WeakReference<Activity> f13717q;

    /* renamed from: r, reason: collision with root package name */
    private ATAdRequest f13718r;

    /* renamed from: b, reason: collision with root package name */
    public int f13703b = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f13714n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f13715o = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13710j = false;

    /* renamed from: k, reason: collision with root package name */
    public long f13711k = SystemClock.elapsedRealtime();

    public ar() {
        h hVar = new h();
        this.f13713m = hVar;
        hVar.a(System.currentTimeMillis());
    }

    private int f() {
        return this.f13704c;
    }

    private long g() {
        return this.f13714n;
    }

    private long h() {
        return this.f13715o;
    }

    public final void a(Context context) {
        this.f13716p = com.anythink.core.common.d.t.b().g();
        if (context == null || !(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        this.f13717q = new WeakReference<>(activity);
        com.anythink.core.common.d.t.b().a(activity);
    }

    public final ATAdRequest b() {
        return this.f13718r;
    }

    public final ar c() {
        ar arVar = new ar();
        arVar.f13716p = this.f13716p;
        arVar.f13717q = this.f13717q;
        arVar.f13704c = this.f13704c;
        arVar.f13705d = this.f13705d;
        arVar.f13706e = this.f13706e;
        arVar.f13708g = this.f13708g;
        arVar.f13709h = this.f13709h;
        arVar.f13718r = this.f13718r;
        return arVar;
    }

    public final boolean d() {
        int i = this.f13704c;
        return i == 13 || i == 14;
    }

    public final boolean e() {
        int i = this.f13704c;
        return (i == 9 || i == 13 || i == 14) ? false : true;
    }

    private void b(long j9) {
        this.f13715o = j9;
    }

    public final Context a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f13717q;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            return activity;
        }
        Activity N8 = com.anythink.core.common.d.t.b().N();
        return N8 != null ? N8 : this.f13716p;
    }

    public final void a(ATAdRequest aTAdRequest) {
        this.f13718r = aTAdRequest;
    }

    private void a(long j9) {
        this.f13714n = j9;
    }
}
