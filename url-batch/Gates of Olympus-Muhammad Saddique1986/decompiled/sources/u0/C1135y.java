package u0;

import a0.C0239d;
import java.util.Comparator;

/* renamed from: u0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135y implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C1135y f9551b = new C1135y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1135y f9552c = new C1135y(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1135y f9553d = new C1135y(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9554a;

    public /* synthetic */ C1135y(int i3) {
        this.f9554a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f9554a) {
            case 0:
                C0239d f3 = ((A0.p) obj).f();
                C0239d f4 = ((A0.p) obj2).f();
                int compare = Float.compare(f3.f4724a, f4.f4724a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f3.f4725b, f4.f4725b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f3.f4727d, f4.f4727d);
                return compare3 != 0 ? compare3 : Float.compare(f3.f4726c, f4.f4726c);
            case 1:
                C0239d f5 = ((A0.p) obj).f();
                C0239d f6 = ((A0.p) obj2).f();
                int compare4 = Float.compare(f6.f4726c, f5.f4726c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f5.f4725b, f6.f4725b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f5.f4727d, f6.f4727d);
                return compare6 != 0 ? compare6 : Float.compare(f6.f4724a, f5.f4724a);
            default:
                R1.i iVar = (R1.i) obj;
                R1.i iVar2 = (R1.i) obj2;
                int compare7 = Float.compare(((C0239d) iVar.f4150d).f4725b, ((C0239d) iVar2.f4150d).f4725b);
                return compare7 != 0 ? compare7 : Float.compare(((C0239d) iVar.f4150d).f4727d, ((C0239d) iVar2.f4150d).f4727d);
        }
    }
}
