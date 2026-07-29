package com.tapjoy.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class cp extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7890a;

    /* renamed from: b, reason: collision with root package name */
    public float f7891b;

    /* renamed from: c, reason: collision with root package name */
    private final AudioManager f7892c;

    /* renamed from: d, reason: collision with root package name */
    private final cm f7893d;
    private final co e;

    public cp(Handler handler, Context context, cm cmVar, co coVar) {
        super(handler);
        this.f7890a = context;
        this.f7892c = (AudioManager) context.getSystemService("audio");
        this.f7893d = cmVar;
        this.e = coVar;
    }

    public final float a() {
        int streamVolume = this.f7892c.getStreamVolume(3);
        int streamMaxVolume = this.f7892c.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public final void b() {
        this.e.a(this.f7891b);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float a2 = a();
        if (a2 != this.f7891b) {
            this.f7891b = a2;
            b();
        }
    }
}
