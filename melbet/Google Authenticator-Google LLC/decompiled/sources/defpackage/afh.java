package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afh implements aer {
    public static final afh a = new afh();
    public Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final ael g = new ael(this);
    public final Runnable f = new nc(this, 14, null);
    final kee h = new kee(this);

    private afh() {
    }

    @Override // defpackage.aer
    public final ael L() {
        return this.g;
    }

    final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.e.removeCallbacks(this.f);
            } else {
                this.g.b(aej.ON_RESUME);
                this.d = false;
            }
        }
    }

    final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.i) {
            this.g.b(aej.ON_START);
            this.i = false;
        }
    }

    public final void c() {
        if (this.b == 0 && this.d) {
            this.g.b(aej.ON_STOP);
            this.i = true;
        }
    }
}
