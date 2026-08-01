package d2;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final j2.j f3586a;

    /* renamed from: b, reason: collision with root package name */
    public final s.x f3587b;

    public v1(j2.m mVar, s.k kVar) {
        this.f3586a = mVar.f4983d;
        List j = j2.m.j(4, mVar);
        this.f3587b = new s.x(j.size());
        int size = j.size();
        for (int i3 = 0; i3 < size; i3++) {
            j2.m mVar2 = (j2.m) j.get(i3);
            if (kVar.a(mVar2.f4985f)) {
                this.f3587b.a(mVar2.f4985f);
            }
        }
    }
}
