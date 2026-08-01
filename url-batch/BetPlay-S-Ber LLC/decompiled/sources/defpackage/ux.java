package defpackage;

import android.os.Handler;
import androidx.lifecycle.a;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ux implements nq {
    public static final ux n = new ux();
    public int f;
    public int g;
    public Handler j;
    public boolean h = true;
    public boolean i = true;
    public final a k = new a(this);
    public final q1 l = new q1(10, this);
    public final tx m = new tx(this);

    public final void a() {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.h) {
                this.k.e(gq.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.j;
                handler.getClass();
                handler.removeCallbacks(this.l);
            }
        }
    }

    @Override // defpackage.nq
    public final iq getLifecycle() {
        return this.k;
    }
}
