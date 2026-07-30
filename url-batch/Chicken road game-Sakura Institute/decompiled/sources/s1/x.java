package s1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final x f8458b = new x(0);

    /* renamed from: c, reason: collision with root package name */
    public static final x f8459c = new x(1);

    /* renamed from: d, reason: collision with root package name */
    public static final x f8460d = new x(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8461a;

    public /* synthetic */ x(int i7) {
        this.f8461a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8461a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y0.d f9 = ((y1.m) obj).f();
                y0.d f10 = ((y1.m) obj2).f();
                int compare = Float.compare(f9.f9780a, f10.f9780a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f9.f9781b, f10.f9781b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f9.f9783d, f10.f9783d);
                return compare3 != 0 ? compare3 : Float.compare(f9.f9782c, f10.f9782c);
            case 1:
                y0.d f11 = ((y1.m) obj).f();
                y0.d f12 = ((y1.m) obj2).f();
                int compare4 = Float.compare(f12.f9782c, f11.f9782c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f11.f9781b, f12.f9781b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f11.f9783d, f12.f9783d);
                return compare6 != 0 ? compare6 : Float.compare(f12.f9780a, f11.f9780a);
            default:
                d6.j jVar = (d6.j) obj;
                d6.j jVar2 = (d6.j) obj2;
                int compare7 = Float.compare(((y0.d) jVar.f2618f).f9781b, ((y0.d) jVar2.f2618f).f9781b);
                return compare7 != 0 ? compare7 : Float.compare(((y0.d) jVar.f2618f).f9783d, ((y0.d) jVar2.f2618f).f9783d);
        }
    }
}
