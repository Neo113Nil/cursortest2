package c;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: SegmentPool.java */
/* loaded from: classes.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    static n f2220a;

    /* renamed from: b, reason: collision with root package name */
    static long f2221b;

    private o() {
    }

    static n a() {
        synchronized (o.class) {
            if (f2220a != null) {
                n nVar = f2220a;
                f2220a = nVar.f;
                nVar.f = null;
                f2221b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return nVar;
            }
            return new n();
        }
    }

    static void a(n nVar) {
        if (nVar.f != null || nVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (nVar.f2219d) {
            return;
        }
        synchronized (o.class) {
            if (f2221b + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                return;
            }
            f2221b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            nVar.f = f2220a;
            nVar.f2218c = 0;
            nVar.f2217b = 0;
            f2220a = nVar;
        }
    }
}
