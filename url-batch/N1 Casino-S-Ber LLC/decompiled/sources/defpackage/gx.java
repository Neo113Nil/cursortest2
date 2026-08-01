package defpackage;

import android.os.Handler;
import androidx.lifecycle.a;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class gx implements aq {
    public static final gx n = new gx();
    public int f;
    public int g;
    public Handler j;
    public boolean h = true;
    public boolean i = true;
    public final a k = new a(this);
    public final m1 l = new m1(10, this);
    public final mr m = new mr(this);

    public final void b() {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.h) {
                this.k.d(up.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.j;
                handler.getClass();
                handler.removeCallbacks(this.l);
            }
        }
    }

    @Override // defpackage.aq
    public final a e() {
        return this.k;
    }
}
