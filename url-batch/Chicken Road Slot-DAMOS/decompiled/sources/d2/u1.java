package d2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u1 implements c2.p1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f3543d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3544e;

    public u1(int i3, ArrayList arrayList) {
        this.f3543d = i3;
        this.f3544e = arrayList;
    }

    @Override // c2.p1
    public final boolean o() {
        return this.f3544e.contains(this);
    }
}
