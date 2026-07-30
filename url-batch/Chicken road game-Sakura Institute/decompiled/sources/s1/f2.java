package s1;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final y1.i f8232a;

    /* renamed from: b, reason: collision with root package name */
    public final i.q f8233b;

    public f2(y1.m mVar, i.p pVar) {
        this.f8232a = mVar.f9840d;
        int[] iArr = i.j.f4753a;
        this.f8233b = new i.q();
        List h3 = y1.m.h(mVar, 4);
        int size = h3.size();
        for (int i7 = 0; i7 < size; i7++) {
            y1.m mVar2 = (y1.m) h3.get(i7);
            if (pVar.b(mVar2.f9843g)) {
                this.f8233b.a(mVar2.f9843g);
            }
        }
    }
}
