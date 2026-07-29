package com.tapjoy.internal;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes2.dex */
final class ja {

    /* renamed from: a, reason: collision with root package name */
    static iz f8436a;

    /* renamed from: b, reason: collision with root package name */
    static long f8437b;

    private ja() {
    }

    static iz a() {
        synchronized (ja.class) {
            if (f8436a != null) {
                iz izVar = f8436a;
                f8436a = izVar.f;
                izVar.f = null;
                f8437b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return izVar;
            }
            return new iz();
        }
    }

    static void a(iz izVar) {
        if (izVar.f != null || izVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (izVar.f8435d) {
            return;
        }
        synchronized (ja.class) {
            if (f8437b + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                return;
            }
            f8437b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            izVar.f = f8436a;
            izVar.f8434c = 0;
            izVar.f8433b = 0;
            f8436a = izVar;
        }
    }
}
