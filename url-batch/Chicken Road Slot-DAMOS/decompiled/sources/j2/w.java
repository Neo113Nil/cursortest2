package j2;

import c2.g0;
import java.util.Comparator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5025d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Comparator f5026e;

    public w(w wVar) {
        this.f5026e = wVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5025d) {
            case 0:
                int compare = this.f5026e.compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return g0.f1544g0.compare(((m) obj).f4982c, ((m) obj2).f4982c);
            default:
                int compare2 = ((w) this.f5026e).compare(obj, obj2);
                return compare2 != 0 ? compare2 : Integer.valueOf(((m) obj).f4985f).compareTo(Integer.valueOf(((m) obj2).f4985f));
        }
    }

    public w(Comparator comparator) {
        this.f5026e = comparator;
    }
}
