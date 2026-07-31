package t;

import java.util.Comparator;
import s.C0944m;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f8494b;

    public /* synthetic */ o(t tVar, int i3) {
        this.f8493a = i3;
        this.f8494b = tVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8493a) {
            case 0:
                Object obj3 = ((C0944m) obj).f8292h;
                t tVar = this.f8494b;
                return O2.l.T(Integer.valueOf(tVar.b(obj3)), Integer.valueOf(tVar.b(((C0944m) obj2).f8292h)));
            default:
                Object obj4 = ((C0944m) obj2).f8292h;
                t tVar2 = this.f8494b;
                return O2.l.T(Integer.valueOf(tVar2.b(obj4)), Integer.valueOf(tVar2.b(((C0944m) obj).f8292h)));
        }
    }
}
