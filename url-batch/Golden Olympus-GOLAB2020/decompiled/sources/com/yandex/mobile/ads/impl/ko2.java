package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class ko2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28290a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f28291b;

    /* renamed from: c, reason: collision with root package name */
    private final tn2 f28292c;

    /* renamed from: d, reason: collision with root package name */
    private final go2 f28293d;

    /* renamed from: e, reason: collision with root package name */
    private float f28294e;

    public ko2(Handler handler, Context context, tn2 tn2Var, go2 go2Var) {
        super(handler);
        this.f28290a = context;
        this.f28291b = (AudioManager) context.getSystemService("audio");
        this.f28292c = tn2Var;
        this.f28293d = go2Var;
    }

    private float c() {
        int streamVolume = this.f28291b.getStreamVolume(3);
        int streamMaxVolume = this.f28291b.getStreamMaxVolume(3);
        this.f28292c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f4 = streamVolume / streamMaxVolume;
        if (f4 > 1.0f) {
            return 1.0f;
        }
        return f4;
    }

    public final void a() {
        float c4 = c();
        this.f28294e = c4;
        ((so2) this.f28293d).a(c4);
        this.f28290a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f28290a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        super.onChange(z4);
        float c4 = c();
        if (c4 != this.f28294e) {
            this.f28294e = c4;
            ((so2) this.f28293d).a(c4);
        }
    }
}
