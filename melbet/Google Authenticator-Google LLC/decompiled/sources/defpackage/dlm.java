package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dlm {
    public final List c;
    public final SparseIntArray d;
    public final boolean g;
    private final int h;
    public final hrf a = dkd.a();
    public final List b = new ArrayList();
    public final List e = new ArrayList();
    public final SparseIntArray f = new SparseIntArray();

    public dlm(int i, int i2, boolean z) {
        this.h = i;
        this.c = new ArrayList(i2);
        this.d = new SparseIntArray(i2);
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Set] */
    final dkx a(dks dksVar, int i) {
        dksVar.a = this.h;
        if (i == -1) {
            i = -1;
        }
        List list = this.c;
        jkl jklVar = dksVar.c;
        int size = list.size();
        int f = dksVar.f();
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        dkx dkxVar = (dkx) jklVar.b;
        dkx dkxVar2 = dkx.a;
        dkxVar.e = f - 1;
        dkxVar.b |= 2;
        hrf hrfVar = this.a;
        hre hreVar = ((dkx) jklVar.b).d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        jkj C = hreVar.C();
        if (!C.b.M()) {
            C.t();
        }
        jkp jkpVar = C.b;
        hre hreVar2 = (hre) jkpVar;
        hrfVar.getClass();
        hreVar2.e = hrfVar;
        hreVar2.b |= 2048;
        if (!jkpVar.M()) {
            C.t();
        }
        hre hreVar3 = (hre) C.b;
        hreVar3.b |= 1;
        hreVar3.c = size;
        hre hreVar4 = (hre) C.q();
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        dkx dkxVar3 = (dkx) jklVar.b;
        hreVar4.getClass();
        dkxVar3.d = hreVar4;
        dkxVar3.b |= 1;
        ?? r0 = dksVar.d.a;
        if (!r0.isEmpty()) {
            for (kee keeVar : r0) {
            }
        }
        dkx a = dksVar.a();
        list.add(a);
        this.d.append(size, i);
        return a;
    }

    final void b(dlw dlwVar) {
        if (dlwVar.b == 1) {
            hoq.x(this.d.valueAt(dlwVar.a) == -1);
        }
        this.b.add(dlwVar);
    }
}
