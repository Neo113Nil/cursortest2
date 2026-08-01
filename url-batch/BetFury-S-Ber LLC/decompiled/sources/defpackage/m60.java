package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class m60 implements lx {
    public static final m60 n = new m60();
    public int f;
    public int g;
    public Handler j;
    public boolean h = true;
    public boolean i = true;
    public final nx k = new nx(this);
    public final r1 l = new r1(10, this);
    public final kz m = new kz(this);

    public final void b() {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.h) {
                this.k.d(fx.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.j;
                handler.getClass();
                handler.removeCallbacks(this.l);
            }
        }
    }

    @Override // defpackage.lx
    public final nx e() {
        return this.k;
    }
}
