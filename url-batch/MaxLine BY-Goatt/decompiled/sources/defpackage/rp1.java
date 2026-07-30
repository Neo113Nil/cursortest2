package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class rp1 extends op1 implements Iterable, k71 {
    public static final /* synthetic */ int z = 0;
    public final yn2 v;
    public int w;
    public String x;
    public String y;

    public rp1(tp1 tp1Var) {
        super(tp1Var);
        this.v = new yn2(0);
    }

    @Override // defpackage.op1
    public final mp1 b(mh mhVar) {
        return f(mhVar, false, this);
    }

    public final op1 d(String str, boolean z2) {
        Object obj;
        rp1 rp1Var;
        str.getClass();
        yn2 yn2Var = this.v;
        yn2Var.getClass();
        Iterator it = aj2.b(new i0(3, yn2Var)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            op1 op1Var = (op1) obj;
            if (tp2.i(op1Var.s, str, false) || op1Var.c(str) != null) {
                break;
            }
        }
        op1 op1Var2 = (op1) obj;
        if (op1Var2 != null) {
            return op1Var2;
        }
        if (!z2 || (rp1Var = this.n) == null || up2.y(str)) {
            return null;
        }
        return rp1Var.d(str, true);
    }

    public final op1 e(int i, rp1 rp1Var, boolean z2) {
        yn2 yn2Var = this.v;
        op1 op1Var = (op1) yn2Var.c(i);
        if (op1Var != null) {
            return op1Var;
        }
        if (z2) {
            Iterator it = aj2.b(new i0(3, yn2Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    op1Var = null;
                    break;
                }
                op1 op1Var2 = (op1) it.next();
                op1Var = (!(op1Var2 instanceof rp1) || op1Var2.equals(rp1Var)) ? null : ((rp1) op1Var2).e(i, this, true);
                if (op1Var != null) {
                    break;
                }
            }
        }
        if (op1Var != null) {
            return op1Var;
        }
        rp1 rp1Var2 = this.n;
        if (rp1Var2 == null || rp1Var2.equals(rp1Var)) {
            return null;
        }
        rp1 rp1Var3 = this.n;
        rp1Var3.getClass();
        return rp1Var3.e(i, this, z2);
    }

    @Override // defpackage.op1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rp1) || !super.equals(obj)) {
            return false;
        }
        yn2 yn2Var = this.v;
        int f = yn2Var.f();
        rp1 rp1Var = (rp1) obj;
        yn2 yn2Var2 = rp1Var.v;
        if (f != yn2Var2.f() || this.w != rp1Var.w) {
            return false;
        }
        Iterator it = aj2.b(new i0(3, yn2Var)).iterator();
        while (it.hasNext()) {
            op1 op1Var = (op1) it.next();
            if (!op1Var.equals(yn2Var2.c(op1Var.r))) {
                return false;
            }
        }
        return true;
    }

    public final mp1 f(mh mhVar, boolean z2, rp1 rp1Var) {
        mp1 mp1Var;
        mp1 b = super.b(mhVar);
        ArrayList arrayList = new ArrayList();
        qp1 qp1Var = new qp1(this);
        while (true) {
            if (!qp1Var.hasNext()) {
                break;
            }
            op1 op1Var = (op1) qp1Var.next();
            mp1Var = Intrinsics.b(op1Var, rp1Var) ? null : op1Var.b(mhVar);
            if (mp1Var != null) {
                arrayList.add(mp1Var);
            }
        }
        mp1 mp1Var2 = (mp1) zv.D(arrayList);
        rp1 rp1Var2 = this.n;
        if (rp1Var2 != null && z2 && !rp1Var2.equals(rp1Var)) {
            mp1Var = rp1Var2.f(mhVar, true, this);
        }
        return (mp1) zv.D(oi.p(new mp1[]{b, mp1Var2, mp1Var}));
    }

    public final mp1 g(String str, boolean z2, rp1 rp1Var) {
        mp1 mp1Var;
        mp1 c = c(str);
        ArrayList arrayList = new ArrayList();
        qp1 qp1Var = new qp1(this);
        while (true) {
            if (!qp1Var.hasNext()) {
                break;
            }
            op1 op1Var = (op1) qp1Var.next();
            mp1Var = Intrinsics.b(op1Var, rp1Var) ? null : op1Var instanceof rp1 ? ((rp1) op1Var).g(str, false, this) : op1Var.c(str);
            if (mp1Var != null) {
                arrayList.add(mp1Var);
            }
        }
        mp1 mp1Var2 = (mp1) zv.D(arrayList);
        rp1 rp1Var2 = this.n;
        if (rp1Var2 != null && z2 && !rp1Var2.equals(rp1Var)) {
            mp1Var = rp1Var2.g(str, true, this);
        }
        return (mp1) zv.D(oi.p(new mp1[]{c, mp1Var2, mp1Var}));
    }

    @Override // defpackage.op1
    public final int hashCode() {
        int i = this.w;
        yn2 yn2Var = this.v;
        int f = yn2Var.f();
        for (int i2 = 0; i2 < f; i2++) {
            i = (((i * 31) + yn2Var.d(i2)) * 31) + ((op1) yn2Var.g(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qp1(this);
    }

    @Override // defpackage.op1
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.y;
        op1 d = (str == null || up2.y(str)) ? null : d(str, true);
        if (d == null) {
            d = e(this.w, this, false);
        }
        sb.append(" startDestination=");
        if (d == null) {
            String str2 = this.y;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.x;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.w));
                }
            }
        } else {
            sb.append("{");
            sb.append(d.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
