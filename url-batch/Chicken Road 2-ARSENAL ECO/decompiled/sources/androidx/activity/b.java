package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f3186a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3187b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3188c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3189d;

    public b(BackEvent backEvent) {
        a aVar = a.f3185a;
        float d7 = aVar.d(backEvent);
        float e4 = aVar.e(backEvent);
        float b7 = aVar.b(backEvent);
        int c7 = aVar.c(backEvent);
        this.f3186a = d7;
        this.f3187b = e4;
        this.f3188c = b7;
        this.f3189d = c7;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f3186a + ", touchY=" + this.f3187b + ", progress=" + this.f3188c + ", swipeEdge=" + this.f3189d + '}';
    }
}
