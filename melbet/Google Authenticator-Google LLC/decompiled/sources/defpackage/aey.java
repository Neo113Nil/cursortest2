package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class aey {
    final afd c;
    boolean d;
    int e = -1;
    final /* synthetic */ aez f;

    public aey(aez aezVar, afd afdVar) {
        this.f = aezVar;
        this.c = afdVar;
    }

    public abstract boolean bj();

    public boolean c(aer aerVar) {
        return false;
    }

    final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        aez aezVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = aezVar.c;
        aezVar.c = i + i2;
        if (!aezVar.d) {
            aezVar.d = true;
            while (true) {
                try {
                    int i3 = aezVar.c;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        aezVar.f();
                    } else if (z3) {
                        aezVar.g();
                    }
                    i2 = i3;
                } finally {
                    aezVar.d = false;
                }
            }
        }
        if (this.d) {
            this.f.c(this);
        }
    }

    public void b() {
    }
}
