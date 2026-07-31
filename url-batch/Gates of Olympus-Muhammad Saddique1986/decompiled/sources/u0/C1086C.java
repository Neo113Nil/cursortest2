package u0;

import java.util.Comparator;

/* renamed from: u0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086C implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9130a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f9131b;

    public C1086C(Comparator comparator) {
        this.f9131b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9130a) {
            case 0:
                int compare = this.f9131b.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return t0.E.f8532L.compare(((A0.p) obj).f141c, ((A0.p) obj2).f141c);
            default:
                int compare2 = ((C1086C) this.f9131b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : O2.l.T(Integer.valueOf(((A0.p) obj).f145g), Integer.valueOf(((A0.p) obj2).f145g));
        }
    }

    public C1086C(C1086C c1086c) {
        this.f9131b = c1086c;
    }
}
