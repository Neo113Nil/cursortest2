package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14524a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f14525b;

    /* renamed from: c, reason: collision with root package name */
    private final a f14526c;

    /* renamed from: d, reason: collision with root package name */
    private final c f14527d;

    /* renamed from: e, reason: collision with root package name */
    private float f14528e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f14524a = context;
        this.f14525b = (AudioManager) context.getSystemService("audio");
        this.f14526c = aVar;
        this.f14527d = cVar;
    }

    private float a() {
        return this.f14526c.a(this.f14525b.getStreamVolume(3), this.f14525b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f14527d.a(this.f14528e);
    }

    public void c() {
        this.f14528e = a();
        b();
        this.f14524a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f14524a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4) {
        super.onChange(z4);
        float a4 = a();
        if (a(a4)) {
            this.f14528e = a4;
            b();
        }
    }

    private boolean a(float f4) {
        return f4 != this.f14528e;
    }
}
