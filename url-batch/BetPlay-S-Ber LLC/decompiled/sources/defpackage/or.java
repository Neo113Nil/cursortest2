package defpackage;

import androidx.lifecycle.b;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class or {
    public final yv a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ b d;

    public or(b bVar, yv yvVar) {
        this.d = bVar;
        this.a = yvVar;
    }

    public final void c(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        b bVar = this.d;
        int i2 = bVar.c;
        bVar.c = i + i2;
        if (!bVar.d) {
            bVar.d = true;
            while (true) {
                try {
                    int i3 = bVar.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    bVar.d = false;
                }
            }
        }
        if (this.b) {
            bVar.c(this);
        }
    }

    public abstract boolean e();

    public void d() {
    }
}
