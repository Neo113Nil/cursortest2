package defpackage;

import com.moontiko.really.admiralcasino.MainActivity2;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class ut {
    public final uy f;
    public boolean g;
    public int h = -1;
    public final /* synthetic */ rx i;

    public ut(rx rxVar, uy uyVar) {
        this.i = rxVar;
        this.f = uyVar;
    }

    public final void a(boolean z) {
        if (z == this.g) {
            return;
        }
        this.g = z;
        int i = z ? 1 : -1;
        rx rxVar = this.i;
        int i2 = rxVar.c;
        rxVar.c = i + i2;
        if (!rxVar.d) {
            rxVar.d = true;
            while (true) {
                try {
                    int i3 = rxVar.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    rxVar.d = false;
                }
            }
        }
        if (this.g) {
            rxVar.c(this);
        }
    }

    public boolean c(MainActivity2 mainActivity2) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
