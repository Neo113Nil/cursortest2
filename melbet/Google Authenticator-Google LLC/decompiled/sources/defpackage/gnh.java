package defpackage;

import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnh {
    public volatile bah a;
    private final koe c;
    private final gni d;
    private final Object f = new Object();
    public final ComponentCallbacks2 b = new gnd(this);
    private final boolean e = true;

    public gnh(koe koeVar, gni gniVar) {
        this.c = koeVar;
        this.d = gniVar;
    }

    public final baf a(bbh bbhVar) {
        if (this.e) {
            fao.c();
        }
        if (this.a == null) {
            synchronized (this.f) {
                if (this.a == null) {
                    this.a = (bah) this.c.b();
                    this.d.a(this);
                }
            }
        }
        return this.a.d(bbhVar);
    }
}
