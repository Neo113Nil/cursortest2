package te;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final pe.a f9456a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f9457b;

    public w0(pe.a aVar) {
        this.f9456a = aVar;
        this.f9457b = new k1(aVar.d());
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        if (obj != null) {
            oVar.l(this.f9456a, obj);
        } else {
            oVar.s(null);
        }
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        c6.l lVar2 = (c6.l) lVar.f10660e;
        String str = (String) lVar.f10661i;
        lVar2.getClass();
        str.getClass();
        n4.f0 f0Var = (n4.f0) ((LinkedHashMap) lVar2.f1830i).get(str);
        if ((f0Var != null ? f0Var.a(str, (Bundle) lVar2.f1829e) : null) != null) {
            return lVar.e();
        }
        return null;
    }

    @Override // pe.a
    public final re.e d() {
        return this.f9457b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && w0.class == obj.getClass() && this.f9456a.equals(((w0) obj).f9456a);
    }

    public final int hashCode() {
        return this.f9456a.hashCode();
    }
}
