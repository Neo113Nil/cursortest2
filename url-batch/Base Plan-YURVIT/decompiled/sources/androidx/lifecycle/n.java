package androidx.lifecycle;

import B0.E;
import android.os.Handler;

/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: m, reason: collision with root package name */
    public static final n f1620m = new n();

    /* renamed from: e, reason: collision with root package name */
    public int f1621e;

    /* renamed from: f, reason: collision with root package name */
    public int f1622f;

    /* renamed from: i, reason: collision with root package name */
    public Handler f1625i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1623g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1624h = true;

    /* renamed from: j, reason: collision with root package name */
    public final j f1626j = new j(this);

    /* renamed from: k, reason: collision with root package name */
    public final k f1627k = new k(0, this);

    /* renamed from: l, reason: collision with root package name */
    public final E f1628l = new E(13, this);

    @Override // androidx.lifecycle.i
    public final j a() {
        return this.f1626j;
    }

    public final void b() {
        int i2 = this.f1622f + 1;
        this.f1622f = i2;
        if (i2 == 1) {
            if (this.f1623g) {
                this.f1626j.a(d.ON_RESUME);
                this.f1623g = false;
            } else {
                Handler handler = this.f1625i;
                P0.h.b(handler);
                handler.removeCallbacks(this.f1627k);
            }
        }
    }
}
