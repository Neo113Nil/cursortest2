package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b12 extends j1 {
    public final /* synthetic */ int n;
    public final m0 o;

    public /* synthetic */ b12(m0 m0Var, int i) {
        this.n = i;
        this.o = m0Var;
    }

    @Override // defpackage.b0
    public final int a() {
        int i = this.n;
        m0 m0Var = this.o;
        switch (i) {
            case 0:
                return ((w02) m0Var).q;
            case 1:
                return ((w02) m0Var).q;
            default:
                return m0Var.c();
        }
    }

    @Override // defpackage.b0, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.n;
        m0 m0Var = this.o;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    w02 w02Var = (w02) m0Var;
                    Object obj2 = w02Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && w02Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((w02) m0Var).containsKey(obj);
            default:
                return m0Var.containsKey(obj);
        }
    }

    @Override // defpackage.j1, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.n;
        m0 m0Var = this.o;
        switch (i) {
            case 0:
                uz2 uz2Var = ((w02) m0Var).p;
                vz2[] vz2VarArr = new vz2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    vz2VarArr[i2] = new wz2(0);
                }
                return new c12(uz2Var, vz2VarArr);
            case 1:
                uz2 uz2Var2 = ((w02) m0Var).p;
                vz2[] vz2VarArr2 = new vz2[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    vz2VarArr2[i3] = new wz2(1);
                }
                return new c12(uz2Var2, vz2VarArr2);
            default:
                return new n0(((b12) m0Var.a()).iterator(), 0);
        }
    }
}
