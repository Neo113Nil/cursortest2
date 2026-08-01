package r0;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f8104c = new g(0, 2, 1);

    @Override // r0.i0
    public final void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        int i3 = ((x0.e) jVar.c(0)).f10227a;
        List list = (List) jVar.c(1);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            int i11 = i3 + i10;
            aVar.b(i11, obj);
            aVar.e(i11, obj);
        }
    }
}
