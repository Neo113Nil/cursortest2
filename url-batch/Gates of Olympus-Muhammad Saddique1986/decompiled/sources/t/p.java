package t;

import B.C0011l;
import java.util.Comparator;
import s.C0944m;

/* loaded from: classes.dex */
public final class p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0011l f8496b;

    public /* synthetic */ p(C0011l c0011l, int i3) {
        this.f8495a = i3;
        this.f8496b = c0011l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8495a) {
            case 0:
                Object obj3 = ((C0944m) obj).f8292h;
                C0011l c0011l = this.f8496b;
                return O2.l.T(Integer.valueOf(c0011l.b(obj3)), Integer.valueOf(c0011l.b(((C0944m) obj2).f8292h)));
            default:
                Object obj4 = ((C0944m) obj2).f8292h;
                C0011l c0011l2 = this.f8496b;
                return O2.l.T(Integer.valueOf(c0011l2.b(obj4)), Integer.valueOf(c0011l2.b(((C0944m) obj).f8292h)));
        }
    }
}
