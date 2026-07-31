package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class yy2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14857a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f14858b;

    /* renamed from: c, reason: collision with root package name */
    private final wy2 f14859c;

    /* renamed from: d, reason: collision with root package name */
    private float f14860d;

    /* renamed from: e, reason: collision with root package name */
    private final hz2 f14861e;

    public yy2(Handler handler, Context context, wy2 wy2Var, hz2 hz2Var, byte[] bArr) {
        super(handler);
        this.f14857a = context;
        this.f14858b = (AudioManager) context.getSystemService("audio");
        this.f14859c = wy2Var;
        this.f14861e = hz2Var;
    }

    private final float c() {
        int streamVolume = this.f14858b.getStreamVolume(3);
        int streamMaxVolume = this.f14858b.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f7 = streamVolume / streamMaxVolume;
        if (f7 > 1.0f) {
            return 1.0f;
        }
        return f7;
    }

    private final void d() {
        this.f14861e.d(this.f14860d);
    }

    public final void a() {
        this.f14860d = c();
        d();
        this.f14857a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f14857a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        super.onChange(z6);
        float c7 = c();
        if (c7 != this.f14860d) {
            this.f14860d = c7;
            d();
        }
    }
}
