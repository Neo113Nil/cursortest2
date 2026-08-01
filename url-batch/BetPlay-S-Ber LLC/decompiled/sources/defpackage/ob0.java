package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class ob0 {
    public final ac0 a;
    public ip[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public ob0(ac0 ac0Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = ac0Var;
        c(ac0Var);
    }

    public final void a() {
        ip[] ipVarArr = this.b;
        if (ipVarArr != null) {
            ip ipVar = ipVarArr[0];
            ip ipVar2 = ipVarArr[1];
            ac0 ac0Var = this.a;
            if (ipVar2 == null) {
                ipVar2 = ac0Var.a.h(2);
            }
            if (ipVar == null) {
                ipVar = ac0Var.a.h(1);
            }
            h(ip.a(ipVar, ipVar2));
            ip ipVar3 = this.b[vw.M(16)];
            if (ipVar3 != null) {
                g(ipVar3);
            }
            ip ipVar4 = this.b[vw.M(32)];
            if (ipVar4 != null) {
                e(ipVar4);
            }
            ip ipVar5 = this.b[vw.M(64)];
            if (ipVar5 != null) {
                i(ipVar5);
            }
        }
    }

    public abstract ac0 b();

    public void c(ac0 ac0Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = ac0Var.a.e(i);
            int M = vw.M(i);
            this.c[M] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = ac0Var.a.f(i);
                this.d[M] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, ip ipVar) {
        if (this.b == null) {
            this.b = new ip[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[vw.M(i2)] = ipVar;
            }
        }
    }

    public abstract void f(ip ipVar);

    public abstract void h(ip ipVar);

    public ob0() {
        this(new ac0());
    }

    public void e(ip ipVar) {
    }

    public void g(ip ipVar) {
    }

    public void i(ip ipVar) {
    }
}
