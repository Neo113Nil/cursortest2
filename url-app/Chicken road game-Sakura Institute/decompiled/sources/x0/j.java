package x0;

import M2.F;
import M2.G;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function1, M2.l, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final I.d f11438d;

    public j(I.d dVar) {
        this.f11438d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        jVar.getClass();
        return this.f11438d.equals(jVar.f11438d) && I.d.class.equals(I.d.class);
    }

    @Override // M2.l
    public final int getArity() {
        return 1;
    }

    public final int hashCode() {
        return ((((((((((I.d.class.hashCode() + (this.f11438d.hashCode() * 31)) * 31) + 96417) * 31) + 1636195860) * 31) + 1237) * 31) + 1) * 31) + 4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f11438d.b((l) obj);
        return Unit.f7487a;
    }

    public final String toString() {
        F.f3581a.getClass();
        return G.a(this);
    }
}
