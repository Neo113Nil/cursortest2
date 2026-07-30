package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m11 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] m;
    public final Object[] n;

    public m11(n11 n11Var) {
        int i = ((n82) n11Var).r;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        g23 it = n11Var.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.m = objArr;
        this.n = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.m;
        boolean z = objArr instanceof p11;
        Object[] objArr2 = this.n;
        if (!z) {
            yf yfVar = new yf(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                yfVar.j(objArr[i], objArr2[i]);
            }
            return yfVar.d();
        }
        p11 p11Var = (p11) objArr;
        yf yfVar2 = new yf(p11Var.size());
        g23 it = p11Var.iterator();
        g23 it2 = ((e11) objArr2).iterator();
        while (it.hasNext()) {
            yfVar2.j(it.next(), it2.next());
        }
        return yfVar2.d();
    }
}
