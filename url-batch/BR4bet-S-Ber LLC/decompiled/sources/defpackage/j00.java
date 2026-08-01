package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class j00 implements ms {
    public static final j00 n = new j00();
    public int f;
    public int g;
    public Handler j;
    public boolean h = true;
    public boolean i = true;
    public final os k = new os(this);
    public final n1 l = new n1(10, this);
    public final pw m = new pw(this);

    public final void b() {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.h) {
                this.k.d(gs.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.j;
                handler.getClass();
                handler.removeCallbacks(this.l);
            }
        }
    }

    @Override // defpackage.ms
    public final os e() {
        return this.k;
    }
}
