package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p00 implements Runnable {
    public qj f;
    public rj g;
    public Handler h;

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            obj = this.f.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.h.post(new h1(this.g, obj, 7, false));
    }
}
