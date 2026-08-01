package defpackage;

import androidx.lifecycle.b;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class cr {
    public final k0 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ b d;

    public cr(b bVar, k0 k0Var) {
        this.d = bVar;
        this.a = k0Var;
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
