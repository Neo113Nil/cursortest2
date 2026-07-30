package g0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z1 implements Iterable, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final y1 f3986f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3987g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3988h;

    public z1(y1 y1Var, int i7, int i8) {
        this.f3986f = y1Var;
        this.f3987g = i7;
        this.f3988h = i8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i7;
        ArrayList arrayList;
        int P;
        y1 y1Var = this.f3986f;
        if (y1Var.f3980l != this.f3988h) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = y1Var.f3982n;
        c cVar = null;
        int i8 = this.f3987g;
        if (hashMap != null) {
            if (y1Var.f3979k) {
                d.w("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i8 >= 0 && i8 < (i7 = y1Var.f3975g) && (P = d.P((arrayList = y1Var.f3981m), i8, i7)) >= 0) {
                cVar = (c) arrayList.get(P);
            }
            if (cVar != null) {
            }
        }
        return new k0(y1Var, i8 + 1, y1Var.f3974f[(i8 * 5) + 3] + i8);
    }
}
