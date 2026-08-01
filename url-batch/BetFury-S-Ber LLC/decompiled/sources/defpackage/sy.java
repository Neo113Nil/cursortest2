package defpackage;

import com.trembin.nirefon.betfury.MainActivity2;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class sy {
    public final k40 f;
    public boolean g;
    public int h = -1;
    public final /* synthetic */ ty i;

    public sy(ty tyVar, k40 k40Var) {
        this.i = tyVar;
        this.f = k40Var;
    }

    public final void a(boolean z) {
        if (z == this.g) {
            return;
        }
        this.g = z;
        int i = z ? 1 : -1;
        ty tyVar = this.i;
        int i2 = tyVar.c;
        tyVar.c = i + i2;
        if (!tyVar.d) {
            tyVar.d = true;
            while (true) {
                try {
                    int i3 = tyVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        tyVar.e();
                    } else if (z3) {
                        tyVar.f();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    tyVar.d = false;
                    throw th;
                }
            }
            tyVar.d = false;
        }
        if (this.g) {
            tyVar.c(this);
        }
    }

    public boolean c(MainActivity2 mainActivity2) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
