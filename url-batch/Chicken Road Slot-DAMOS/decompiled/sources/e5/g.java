package e5;

import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g f3903e = new g(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3904d;

    public /* synthetic */ g(int i3) {
        this.f3904d = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3904d) {
            case 0:
                return jd.a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 1:
                return jd.a.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 2:
                return jd.a.a(((h) obj).f3905a, ((h) obj2).f3905a);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return jd.a.a(((j) obj).f3916a, ((j) obj2).f3916a);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
