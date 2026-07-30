package t5;

import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: j, reason: collision with root package name */
    public static final k f8908j = new k();

    @Override // t5.f, java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        return sVar.isEmpty() ? 0 : -1;
    }

    @Override // t5.f
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.isEmpty() && equals(sVar.c());
    }

    @Override // t5.f, t5.s
    public final String f(int i7) {
        return "";
    }

    @Override // t5.f, t5.s
    public final Object getValue() {
        return null;
    }

    @Override // t5.f
    public final int hashCode() {
        return 0;
    }

    @Override // t5.f, t5.s
    public final boolean isEmpty() {
        return true;
    }

    @Override // t5.f, java.lang.Iterable
    public final Iterator iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // t5.f, t5.s
    public final int j() {
        return 0;
    }

    @Override // t5.f, t5.s
    public final c k(c cVar) {
        return null;
    }

    @Override // t5.f, t5.s
    public final s o(c cVar, s sVar) {
        if (!sVar.isEmpty()) {
            c cVar2 = c.f8888i;
            if (!cVar.equals(cVar2)) {
                i5.c bVar = new i5.b(f.f8893i);
                boolean equals = cVar.equals(cVar2);
                k kVar = f8908j;
                if (!equals) {
                    if (bVar.a(cVar)) {
                        bVar = bVar.B(cVar);
                    }
                    if (!sVar.isEmpty()) {
                        bVar = bVar.A(sVar, cVar);
                    }
                    if (!bVar.isEmpty()) {
                        return new f(bVar, kVar);
                    }
                } else if (!bVar.isEmpty()) {
                    return new f(bVar, sVar);
                }
                return kVar;
            }
        }
        return this;
    }

    @Override // t5.f, t5.s
    public final Object r(boolean z8) {
        return null;
    }

    @Override // t5.f, t5.s
    public final boolean s(c cVar) {
        return false;
    }

    @Override // t5.f, t5.s
    public final Iterator t() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // t5.f
    public final String toString() {
        return "<Empty Node>";
    }

    @Override // t5.f, t5.s
    public final s u(l5.f fVar, s sVar) {
        return fVar.isEmpty() ? sVar : o(fVar.z(), u(fVar.C(), sVar));
    }

    @Override // t5.f, t5.s
    public final String v() {
        return "";
    }

    @Override // t5.f, t5.s
    public final s c() {
        return this;
    }

    @Override // t5.f, t5.s
    public final s b(l5.f fVar) {
        return this;
    }

    @Override // t5.f, t5.s
    public final s d(c cVar) {
        return this;
    }

    @Override // t5.f, t5.s
    public final s n(s sVar) {
        return this;
    }
}
