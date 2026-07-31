package a1;

import androidx.datastore.preferences.protobuf.k0;
import b1.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: e, reason: collision with root package name */
    public final G0.i f1151e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1152f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1153g;

    public f(G0.i iVar, int i2, int i3) {
        this.f1151e = iVar;
        this.f1152f = i2;
        this.f1153g = i3;
    }

    public abstract Object a(Y0.p pVar, G0.d dVar);

    @Override // Z0.d
    public Object m(Z0.e eVar, G0.d dVar) {
        d dVar2 = new d(eVar, this, null);
        u uVar = new u(dVar, dVar.e());
        Object I2 = k0.I(uVar, uVar, dVar2);
        return I2 == H0.a.f511e ? I2 : D0.h.f206a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        G0.j jVar = G0.j.f500e;
        G0.i iVar = this.f1151e;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i2 = this.f1152f;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        int i3 = this.f1153g;
        if (i3 != 1) {
            arrayList.add("onBufferOverflow=".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + E0.f.Q(arrayList, ", ", null, null, null, 62) + ']';
    }
}
